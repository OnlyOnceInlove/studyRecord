package com.circulation;

public class BreakAndContinue {
    //break结束当前循环,配合标签使用可退出任意循环
    //continue跳出本次循环,配合标签使用可跳出任意次循环
    public static void main(String[] args) {
        sign:
        for(int i = 0;i<3;i++){
            System.out.println(i);
            for(int k = 0;k<4;k++){
                if(k == 2){
                    //continue sign;
                    break sign;
                }
                System.out.println(k);
            }
        }
    }

}
