package timus_lab.task_2100;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        String Name = "timus_lab/task_2100/input.txt";
        boolean a = System.getProperty("ONLINE_JUDGE") != null;
        int b = 2;

        try{
             BufferedReader buffer =
                     a ? new BufferedReader(new InputStreamReader(System.in)):
                             new BufferedReader(new FileReader(Name));
             String readLin = "";

             int numFriends = 0;
             int numPairs = 0;

             while ((readLin = buffer.readLine()) != null ){
                    if(numFriends == 0){
                        numFriends = Integer.parseInt(readLin);
                        continue;
                    }
                    if(readLin.contains("+")){
                        numPairs ++;
                    }

             }
             int result;

             int guests = ( b + numFriends + numPairs);

             if(guests == 13){
                 result = (guests * 100) + 100;
             }else {
                 result = guests * 100;
             }

             System.out.println(result);

        }catch (IOException exception){
            exception.printStackTrace();

        }

    }

}
