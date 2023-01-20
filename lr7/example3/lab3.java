package lr7.example3;

class lab3 {

    public char chr;

    public lab3(char chr){
        this.chr = chr;
    }

    public lab3(lab3 a){
        this.chr = a.chr;
    }

    public String toString(){
        return "lab3{" + "chr="+ chr + '}';
    }
}
