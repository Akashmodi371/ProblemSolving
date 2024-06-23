import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class jpmorganOA {
    public static void main(String args[]){
        String arr[]={"code","doce","ecod","framer","frame"};
        Stack<String>st=new Stack<>();

        st.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(!isEqual(st.peek().toCharArray(),arr[i].toCharArray())){
                st.push(arr[i]);
            }
        }
        while(!st.isEmpty()) {
            System.out.println(st.pop());
        }

    }

    public static boolean isEqual(char[] arr1, char[] arr2) {
        int ch[]=new int[26];
        int ch2[]=new int[26];
        for(int i=0;i<arr1.length;i++){
            int c=arr1[i]-'a';
            ch[c]++;
        }
        for(int i=0;i<arr2.length;i++){
            int c=arr2[i]-'a';
            ch2[c]++;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (ch[arr1[i]-'a'] != ch2[arr2[i]-'a']) {
                return false;
            }
        }
        return true;
    }
}
