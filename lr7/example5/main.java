package lr7.example5;

public class main {
    static public void main(String[] arg){
        var lab5 = new lab5("str");
        lab5.print();
        var sublab5 = new sublab5("str",14);
        sublab5.print();
        var sub2lab5 = new sub2lab5("str",'w');
        sub2lab5.print();

        lab5 anylab5 = new sublab5("ggwp",'2');
        anylab5.print();
    }
}
