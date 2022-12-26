package lr5.example3;

class lab3 {
    private int num1;
    private int num2;
    lab3(){
        System.out.println("Без передачи аргумента");
    }
    lab3(int num1){
        this.num1 = num1;
        System.out.println("Передача одного аргумента: " + num1);
    }
    lab3(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("Передача двух аргументов: " + num1 +" и " + num2);
    }
}
