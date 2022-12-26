package lr5.example2;

class lab2 {
    private char ch1;
    private char ch2;

    public void setCh(char ch1,char ch2){
        this.ch1=ch1;
        this.ch2=ch2;
    }
    public void viweArray(){
        int a = ch1;
        int b = ch2;
        if(a > b){
            a = ch2;
            b = ch1;
        }
        int c=1;
        for(int i=a;i<=b;i++){
            System.out.println(c + " символ:" + (char)i);
            c++;
        }
    }
}
