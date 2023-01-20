package lr7.example4;

class sublab4 extends lab4 {
    public String str;

    public sublab4(char chr, String str){
        super(chr);
        this.str=str;
    }

    public sublab4(sublab4 b){
        super(b.chr);
        this.str=b.str;
    }

    public String toString(){
        return "sublab4{"+ "chr="+ chr + ", " + "str=" + str +"}";
    }
}
