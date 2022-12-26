package lr5.example4;

class lab4 {
    lab4(int a,char b){
        int num1 = a;
        int ch = b;
        double result = (double) ch + (double) num1 / 100;
        System.out.println(result);
    }
    lab4(double c){
        double d = c;
        char ch = (char) d;
        int e = (int)((d-(int)d)*100);
        System.out.println("Символ: "+ ch + "\nЧисло: " +e);
    }
}
