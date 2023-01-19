package lr7.example2;

class lab2 {
    private String str;
    public void setFields(){
        this.str = "Nothing";
    }
    public int getLength(){
        return str.length();
    }
    public void setFields(String str) {
        this.str = str;
    }

    public lab2(String str) {
        this.str = str;
    }

}
