package lr5.example5;

public class main {
    public static void main(String[] arg){
        lab5 lab5 = new lab5(322);
        lab5.SetNum();
        System.out.println(lab5.viewNum());
        lab5.SetNum(15);
        System.out.println(lab5.viewNum());
        lab5.SetNum(1000);
        System.out.println(lab5.viewNum());
    }
}
