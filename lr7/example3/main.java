package lr7.example3;

public class main {
    static public void main(String[] arg){
        var lab3 = new lab3('a');
        var sublab3 = new sublab3('a',"str");
        var sub2lab3 = new sub2lab3('a',"str",228);
        var copy = new sub2lab3(sub2lab3);
        System.out.println(lab3);
        System.out.println(sublab3);
        System.out.println(sub2lab3);
        System.out.println(copy);
    }
}
