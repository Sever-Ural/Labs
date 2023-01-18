package lr6.example1;

public class main {
    public static void main(String[]arg){
        lab1 lab1 = new lab1();
        lab1.set('t');
        System.out.println(lab1.c);

        lab1.set("est");
        System.out.println(lab1.str);

        lab1.set(new char[] {'t'});
        System.out.println(lab1.c);

        lab1.set(new char[]{'t','e','s','t'});
        System.out.println(lab1.str);
    }
}
