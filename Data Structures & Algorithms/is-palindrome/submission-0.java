class Solution {
     public boolean isPalindrome1(String s) {
        String arr [] = s.split(" ");
        int n = arr.length;
        
        for(int i=0,j=n-1; i<n;i++,j--){
            arr[i] = arr[i].replaceAll("[^a-zA-z0-9]", "");
            arr[j] = arr[j].replaceAll("[^a-zA-z0-9]", "");
            if(arr[i].length() != arr[j].length()){
                return false;
            }
            int l=0, r=s.length()-1;
            while(l<=r){
                if(arr[i].charAt(l) != arr[j].charAt(l)){
                    return false;
                }
                l++;

                if(arr[i].charAt(r) != arr[j].charAt(r)){
                    return false;
                }
                r--;
            }
        }
        return true;
        
    }
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-z0-9]", "").toLowerCase();
        System.out.println(s);

        int l=0, r=s.length()-1;
        while(l<=r){
            System.out.println(s.charAt(l) +"=="+ s.charAt(r));
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
        
    }
}
