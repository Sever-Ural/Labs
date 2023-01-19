package lr7.example2;

public class main {
    static public void main(String[] arg){
        var sublab2 = new sublab2("test",42);
        System.out.println("lenght:" + sublab2.getLength());
        System.out.println("set str ='str'");
        sublab2.setFields("str");
        System.out.println("lenght: "+sublab2.getLength());
        sublab2.setFields("integer: "+sublab2.integer);
        System.out.println("set integer=-321");
        sublab2.setFields(-321);
        System.out.println("integer: "+sublab2.integer);
        System.out.println("set integer=322");
        System.out.println("set str='ffs'");
        sublab2.setFields("ffs", 322);
        System.out.println("lenght: "+sublab2.getLength());
        sublab2.setFields("integer: "+sublab2.integer);


    }
}
