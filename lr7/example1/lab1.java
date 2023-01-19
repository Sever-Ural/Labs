package lr7.example1;

class lab1 {
    private String str;

    public lab1(String str){
        this.str = str;
    }

    public String toString(){
        return  "StringHolder{" + "str='" +str + '\''+ '}';
    }
    public String getStr(){
        return str;
    }
}
