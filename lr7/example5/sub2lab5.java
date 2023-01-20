package lr7.example5;

class sub2lab5 extends lab5 {
    protected char chr;

    public sub2lab5(String str, char chr){
        super(str);
        this.chr = chr;
    }

    public void print(){
        System.out.println("Sub2lab5{str=" + str +", chr=" + chr + '}');
    }
}
