package learn.Reflection.util;

import org.apache.commons.lang.builder.ToStringBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangdong on 2017/10/12.
 */
public class ProfileUtil {
    /**
     * 使用反射获取类的属性
     * 去除serialVersionUID
     *
     * @param obj
     * @return List
     */
    public static List getField(Object obj) {
        try {
            Class cls = obj.getClass();
            Field[] fields = cls.getDeclaredFields();
            List list = new ArrayList();
            for (Field field : fields) {
                String[] array = field.toString().split("\\.");
                String elem = array[array.length - 1];
                if (!"serialVersionUID".equals(elem)) {
                    list.add(array[array.length - 1]);
                }
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取属性名数组
     */
    public static String[] getFiledName(Object obj) {
        Field[] fields = obj.getClass().getDeclaredFields();
        String[] fieldNames = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            fieldNames[i] = fields[i].getName();
        }
        return fieldNames;
    }

    /**
     * 获取属性类型
     */
    public static String[] getTypeName(Object obj) {
        Field[] fields = obj.getClass().getDeclaredFields();
        String[] typeNames = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            typeNames[i] = String.valueOf(fields[i].getType());
        }
        return typeNames;
    }

    /**
     * 根据属性名获取属性值
     */
    public static Object getFieldValueByName(String fieldName, Object o) {
        try {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String getter = "get" + firstLetter + fieldName.substring(1);
            Method method = o.getClass().getMethod(getter, new Class[] {});
            Object value = method.invoke(o, new Object[] {});
            return value;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * printBean
     */
    public static void printBean(Object obj) {
        System.out.println(ToStringBuilder.reflectionToString(obj));
    }
}
