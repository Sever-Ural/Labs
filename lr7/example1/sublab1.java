package lr7.example1;

class sublab1 extends lab1  {
    private String str2;
    public sublab1(String str){
        super(str);
    }

    public sublab1(String str, String str2){
        super(str);
        this.str2 = str2;
    }


    public String toString(){
            return  "SubStringHolder{" + "str='" + getStr() +"'," + "str2='"+ str2 + "'" + '}';
    }
    public String getStr2(String str2){
        return str2;
    }

