package Praktkum11;


public class CreateCode {
    
    String tahun_ajaran = "2017-2018";
    String semester = "Gasal";
    String kd_prodi = "153";
    String kode = "";
    public static void main(String[] args){
        CreateCode eka = new CreateCode();
        for(int i=1;i<=30;i++){
            eka.set_kode(i);
        }
    }
    public void set_kode(int no_urut){
        String tmp="",ta;
        if(semester.equals("Gasal")){
            tmp = "1";
        }else if(semester.equals("Genap")){
            tmp = "2";
        }
        ta = tahun_ajaran.substring(2,4)+tahun_ajaran.substring(7,9);
        if(no_urut<10){
            kode = ta+tmp+kd_prodi+"00"+no_urut;
        }else{
           kode = ta+tmp+kd_prodi+0+no_urut;
        }
        
        System.out.println("Kode = "+kode);
    }
}