package Practice.P1;

import com.sun.jmx.snmp.SnmpString;

public class _邮箱验证 {

    /**
     * 校验邮箱是否合法：
     * 1、必须包含@
     * 2、必须包含.
     * 3、@必须出现在.之前
     * 4、@只能出现一次
     */
    public static void main(String[] args) {
        String s = "jinyou123@qq.com";
        int atIndex = s.indexOf('@');
        int dotIndex = s.lastIndexOf('.');
        int atLastIndex = s.lastIndexOf('@');
        if (atIndex != -1 && dotIndex != -1 && atIndex < dotIndex && atIndex == atLastIndex) {
            System.out.println("邮箱合法");
        } else
            System.out.println("邮箱不合法");


        System.out.println("============================");
        /**
         * 正则表达式
         *     （1）、^表示字符串的开头
         *
         *     （2）、$表示字符串的结尾
         *     mathes（）判断一个字符串是否匹配正则表达式规则
         * */
        //邮政编码：[0-9]{6}  \d{6}
        String code ="234197";
        String codeRegex = "^[0-9]{6}$";
        if(code.matches(codeRegex)){
            System.out.println("邮箱编码合法");
        }else
            System.out.println("邮箱编码不合法");


        //[_a-z0-9]+@([_a-z0-9]+\.)+[a-z0-9]{2,3}
        String email = "jinyou123@qq.com";
        String emailRegex = "^[_a-z0-9]+@([_a-z0-9]+\\.)+[a-z0-9]{2,3}$";
        if(email.matches(emailRegex)){
            System.out.println("邮箱合法");
        }else
            System.out.println("邮箱不合法");
    }



}
