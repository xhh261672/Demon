神法--isPalindrome2:

    public  boolean isPalindrome2(int x){
        if (x<0 || (x !=0 && x % 10 == 0)) return false;
        //x若是10的倍数 导致最后一句话成立 实际上10的倍数都不是palindrome
        int ret = 0;
        while (x > ret){
            ret = ret*10 + x%10;
            x /= 10;
        }
        //ret起到了保存x后半段的reverse的作用
        return (x == ret) || (x == ret/10);
    }