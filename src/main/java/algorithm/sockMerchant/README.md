# 문제
![problem](https://user-images.githubusercontent.com/24884819/56934817-ab668f80-6b28-11e9-9b9d-ae9bb1c0a878.png)

* 어.. 쉽게 말하자면 length와 array를 줄테니 중복문자 갯수를 출력하라

# 풀이
~~~
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
~~~
* HashMap은 Key의 중복이 허용되지 않는다.(gist에 java 자료구조 정리해서 올려야것네..)이를 이용하여 키값이 들어왔을때 count를 올리고 2개 가 쌓였을때는 
출력 count를 +1한뒤에 해당 key에 0을 넣고 진행한다 이렇게 하면 복잡도 O(N)을 달성 하면서 문제 해결이 가능하다.