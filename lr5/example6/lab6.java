package lr5.example6;

class lab6{
    private int min = 0;
    private int max = 0;
    public void Num(int a, int b){
        System.out.println("Метод с 2 аргументами");
        min = Math.min(a,b);
        max = Math.max(a,b);
    }

    public void Num(int a){
        System.out.println("Метод с 1 аргументом");
        min = Math.min(a,min);
        max = Math.max(a,max);
    }
    void view(){
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }

    lab6(int a,int b){
        System.out.println("Конструктор с 2 аргументами");
        min = Math.min(a,b);
        max = Math.max(a,b);
    }

    lab6(int a){
        System.out.println("Конструктор с 1 аргументом");
        min = Math.min(min,a);
        max = Math.max(max,a);
    }
}
