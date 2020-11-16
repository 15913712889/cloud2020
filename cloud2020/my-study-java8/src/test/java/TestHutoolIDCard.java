import cn.hutool.core.util.IdcardUtil;

/**
 * @Author: caixiaobai
 * @Date: 2020/11/04 11:15
 * @Version 1.0
 */
public class TestHutoolIDCard {
    public static void main(String[] args) {
        String id = "370724199710105512";
//        String province = IdcardUtil.getProvinceByIdCard(id);
//        System.out.println(province);
        int nativePlaceCode=Integer.parseInt(id.substring(0, 6));
        String nativePlace=IDCardGetPlaceUtil.getIDCardGetPlace(nativePlaceCode);
        System.out.println("您所在的地区为：\n" + nativePlace);
    }
}
