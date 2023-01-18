package lr6.example1;

 class lab1 {
     public char c;
     public String str;

     public void set(char c) {
         this.c = c;
     }
     public void set(String str) {
         this.str = str;
     }
     public void set(char[] chars){
         if(chars.length == 1)c= chars  [0];
         else str = new String(chars);
     }
 }
