package Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //泛型语法，集合中保存的是String类型的若干个对象
        //本身是ArrayList<String>类型.
        List<String> schools = new ArrayList<>();

        //使用add 将原属放入集合中(相当于是尾插)
        schools.add("西工院");
        schools.add("陕科大");
        schools.add("西医院");
        System.out.println(schools.size());
        System.out.println(schools.isEmpty());

        //使用toArray 返回一个装有所有集合中元素的数组
        Object[] array = schools.toArray();
        System.out.println(Arrays.toString(array));

        //for each遍历循环集合类
        //for each语法能和很多类搭配 只要这个类实现了iterable接口
        for(String s : schools){
            System.out.println(s);
        }

        //使用contains 判断是在原集合中是否存在
        boolean school = schools.contains("陕科大");
        System.out.println(school);

        //使用set 将下标 index 位置元素设置为 element
        schools.set(0, "西交大");
        schools.set(1, "西工大");
        schools.set(2, "西军电");
        System.out.println(schools);

        //使用remove 删除
        schools.remove("西工大");
        //schools.remove(1)
        System.out.println(schools);

        //使用get 获取下标位置元素
        System.out.println(schools.get(1));

        System.out.println(schools);

        //  截取部分 sublist
        //浅拷贝
        List<String> schools2 = schools.subList(0, 1);
        System.out.println(schools2);
        schools2.add("长安大");
        System.out.println(schools);
        System.out.println(schools2);


        //重新构造
        //深拷贝
        List<String> schools3 = new ArrayList<>(schools);
        schools3.set(2, "西北大");
        System.out.println(schools);
        System.out.println(schools3);


        //引用的转换
        ArrayList<String> schools4 = (ArrayList<String>) schools2;
        System.out.println(schools4);
        LinkedList<String> schools5 = (LinkedList<String>)schools3;
        System.out.println(schools5);
    }
}
