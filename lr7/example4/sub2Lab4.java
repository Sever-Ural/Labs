package lr7.example4;

class sub2Lab4 extends sublab4 {
    public  int integer;

    public sub2Lab4(char chr, String str, int integer){
        super(chr,str);
        this.integer = integer;
    }

    public sub2Lab4(sub2Lab4 c){
        super(c.chr,c.str);
        this.integer = c.integer;
    }

    public String toString(){
        return "sub2Lab4{" + "chr=" + chr + ", " + "str=" + str + ", " + "integer=" + integer + "}";
    }
}
