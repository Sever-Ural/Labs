package lr7.example2;

class sublab2 extends lab2 {
    public int integer;

    public sublab2(String str,int integer){
        super(str);
        this.integer = integer;
    }
    public void setFields() {
        super.setFields();
        this.integer=0;
    }
    public void setFields(String newStr) {
        super.setFields(newStr);
        this.integer=0;
    }
    public void setFields(int newInteger) {
        this.integer=newInteger;
        super.setFields();
    }
    public void setFields(String newStr, int newInteger) {
        super.setFields(newStr);
        this.integer=newInteger;
    }

}
