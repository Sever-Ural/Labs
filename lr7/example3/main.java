package lr7.example3;

public class main {
    static public void main(String[] arg){
        var lab3 = new lab3(1);
        System.out.println(lab3);
        var sublab3 = new sublab3(1, 'a');
        System.out.println(sublab3);
        var sub2lab3 = new sub2lab3(1, 'a',"str");
        sub2lab3.setFields(123,'w',"anything");
        System.out.println(sub2lab3);
    }
}
