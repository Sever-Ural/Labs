package lr7.example3;

class sublab3 extends lab3 {
    public String str;

    public sublab3(char chr, String str){
        super(chr);
        this.str=str;
    }

    public sublab3(sublab3 b){
        super(b.chr);
        this.str=b.str;
    }

    public String toString(){
        return "sublab3{"+ "chr="+ chr + ", " + "str=" + str +"}";
    }
}
