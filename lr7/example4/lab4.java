package lr7.example4;

class lab4 {

    public char chr;

    public lab4(char chr){
        this.chr = chr;
    }

    public lab4(lab4 a){
        this.chr = a.chr;
    }

    public String toString(){
        return "lab4{" + "chr="+ chr + '}';
    }
}
