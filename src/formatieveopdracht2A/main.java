package formatieveopdracht2A;

import java.util.List;

public class main {
    private List locaties;

    public static void main(String[] args) {
        String S = new String("ABAABBA");
        int state = 0;
        for(int i = 0; i < S.length(); i++){
            System.out.println(S.charAt(i));
            if(state == 0){
                if(S[i]== "A"){
                    state = 2;
                    System.out.println("we gaan naar state 2");
                }
                else if(S.charAt(i) == "B"){
                    state = 1;
                    System.out.println("we gaan naar state 1");
                }
            }
            else if(state == 1){}
            else if(state == 2){}
            else if(state == 3){}


        }


    }














//    public void s0(){
//        System.out.println("State 0");
//
//    }
//    public void s1(){
//        System.out.println("State 1");
//
//    }
//    public void s2(){
//        System.out.println("State 2");
//
//    }
//    public void s3(){
//        System.out.println("State 3");
//
//    }






//    public class s0(){
//
//    }
//
//    public class S1(){
//
//    }
//
//    public class s2(){
//
//    }
//
//    public class s3(){
//
//    }
}
