public class amazon2023_09_29 {
    public static void main(String args[]){
        String search="abcz";
        String result="azdb";

        int arr[]=new int[26];

        int ans=0;
        int j=0;

        for(int i=0;i<search.length();i++){
            arr[search.charAt(i)-'a']++;

            if(arr[result.charAt(j)-'a']!=0){
                j++;
            }
        }
        ans=result.length()-j;
        System.out.println(ans);
    }
}
