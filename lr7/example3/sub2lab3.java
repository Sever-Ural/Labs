package lr7.example3;

class sub2lab3 extends sublab3 {
    public String str;

    public sub2lab3(int integer, char chr, String str){
        super(integer,chr);
        this.str = str;
    }

    public void setFields(int integer,char chr, String str){
        super.setFields(integer,chr);
        this.str = str;
    }

    public String toString(){
        return "sub2lab3{" + "integer=" + integer + ", " + "chr=" + chr + ", " + "str=" + str + '}';
    }
}
