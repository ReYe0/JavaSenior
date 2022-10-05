package com.study.day04.exer;

/**
 * @Description: JavaSenior
 * @Author: 二爷
 * @E-mail: 1299461580@qq.com
 * @Date: 2021/10/28 21:15
 */
public class test {
    public static void main(String[] args) {
        String str = "12hello34world5java7891mysql456";
        //把字符串中的数字替换成,，如果结果中开头和结尾有，的话去掉
        String string = str.replaceAll("\\d+", ",").replaceAll("^,|,$", "");
        System.out.println(string);
    }
}
class put {

}