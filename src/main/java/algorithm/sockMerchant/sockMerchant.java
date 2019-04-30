package algorithm.sockMerchant;

import java.util.HashMap;

public class sockMerchant {

    public static void main(String[] args) {

        int leng = 100;
        String arString = "44 55 11 15 4 72 26 91 80 14 43 78 70 75 36 83 78 91 17 17 54 65 60 21 58 98 87 45 75 97 81 18 51 43 84 54 66 10 44 45 23 38 22 44 65 9 78 42 100 94 58 5 11 69 26 20 19 64 64 93 60 96 10 10 39 94 15 4 3 10 1 77 48 74 20 12 83 97 5 82 43 15 86 5 35 63 24 53 27 87 45 38 34 7 48 24 100 14 80 54";
        String[] arStr = arString.split(" ");
        int[] ar = new int[leng];

        for(int i = 0; i < leng ; i++){
            ar[i] = Integer.parseInt(arStr[i]);
        }

        System.out.println(sockMerchant(leng, ar));

    }

    public static int sockMerchant(int length, int[] ar){

        HashMap<Integer, Integer> hashMapInteger = new HashMap<>();
        int result = 0;

        for(int i=0 ;  i < length ; i++){
            if(hashMapInteger.get(ar[i]) == null){
                hashMapInteger.put(ar[i],1);
            }else{
                hashMapInteger.put(ar[i],hashMapInteger.get(ar[i])+1);
            }

            if(hashMapInteger.get(ar[i]) == 2){
                result += 1;
                hashMapInteger.put(ar[i],0);
            }
        }

        return result;
    }
}
