package lr7.example3;

class sub2lab3 extends sublab3 {
    public  int integer;

    public sub2lab3( char chr, String str, int integer){
        super(chr,str);
        this.integer = integer;
    }

    public sub2lab3(sub2lab3 c){
        super(c.chr,c.str);
        this.integer = c.integer;
    }

    public String toString(){
        return "sub2lab3{" + "chr=" + chr + ", " + "str=" + str + ", " + "integer=" + integer + "}";
    }
}
