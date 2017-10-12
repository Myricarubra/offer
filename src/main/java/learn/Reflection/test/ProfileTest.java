package learn.Reflection.test;

import learn.Reflection.domain.Profile;
import learn.Reflection.util.ProfileUtil;

import java.util.List;

/**
 * Created by zhangdong on 2017/10/12.
 */
public class ProfileTest {
    public static void main(String[] args) {
        Profile profile = new Profile();
        List list = ProfileUtil.getField(profile);
        ProfileUtil.printBean(list);

        String[] name = ProfileUtil.getFiledName(profile);
        ProfileUtil.printBean(name);

        String[] type = ProfileUtil.getTypeName(profile);
        ProfileUtil.printBean(type);

        profile.setAge("22");
        profile.setBirthday("1993-10-10");
        profile.setBirthplace("beijing");
        String rs = (String) ProfileUtil.getFieldValueByName("age",profile);
        System.out.println(rs);
    }
}
