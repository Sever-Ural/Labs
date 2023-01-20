package lr7.example4;

public class main {
    static public void main(String[] arg){
        var lab3 = new lab4('a');
        var sublab3 = new sublab4('a',"str");
        var sub2lab3 = new sub2Lab4('a',"str",228);
        var copy = new sub2Lab4(sub2lab3);
        System.out.println(lab3);
        System.out.println(sublab3);
        System.out.println(sub2lab3);
        System.out.println(copy);
    }
}
