package lr7.example3;

class sublab3 extends lab3 {
    public char chr;

    public void setFields(int integer, char chr){
        super.setFielfs(integer);
        this.chr= chr;
    }

    public sublab3(int integer,char chr){
        super(integer);
        this.chr = chr;
    }

    public String toString(){
        return "sublab3{" + "integer=" + integer + ", " + "chr=" + chr + '}';
    }
}
