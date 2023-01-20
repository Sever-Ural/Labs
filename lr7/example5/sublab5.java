package lr7.example5;

class sublab5 extends lab5 {
    protected int integer;

    public sublab5(String str, int integer){
        super(str);
        this.integer = integer;
    }

    public void print(){
        System.out.println("sublab5{str="+ str + ", integer=" + integer + '}');
    }
}
