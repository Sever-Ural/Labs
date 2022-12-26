package lr5.example5;

class lab5 {
    private int num1;

    public void SetNum(){
        System.out.println("Метод без аргумента");
        num1 = 0;
    }
    public void SetNum(int a){
        System.out.println("Метод с аргументом");
        num1 = a;
        if(num1>=100)
            num1=100;
    }
    public int viewNum(){
        return num1;
    }
    lab5(int a){
        System.out.println("констурктор");
        this.SetNum(a);
    }
}
