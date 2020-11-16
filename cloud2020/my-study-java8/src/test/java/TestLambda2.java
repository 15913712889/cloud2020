import org.junit.jupiter.api.Test;

/**
 * @Author: caixiaobai
 * @Date: 2020/09/23 上午 11:23
 * @Version 1.0
 */
public class TestLambda2 {
    public String strHandler(String str,myFunction mf){
        return mf.getValue(str);
    }

    @Test
    public void test01(){
        String s = strHandler("   caixiaobai  come on!   ", (str) -> str.trim());
        System.out.println(s);

        String abcdef = strHandler("abcdef", (str -> str.toUpperCase()));

        System.out.println(abcdef);

        String s1 = strHandler("江西省赣州市上犹县安和乡车田村村里组", (str) -> str.substring(3, str.length() - 3));

        System.out.println(s1);
    }
}
