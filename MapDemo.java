package Demo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

       //使用put 插入键值对
        map.put("学校", "西工院");
        map.put("地理位置", "西安");
        map.put("建校时间", "1988");

        //使用get 根据key查找value   若不存在返回null
        System.out.println(map.get("学校"));

        // 根据指定的 k 查找对应的 v，没有找到用默认值代替
        System.out.println(map.getOrDefault("学校简介", "西北地区唯一一所兵工学校"));

        //put方法如果key已经存在，新的value就会覆盖原有的value
        map.put("学校", "陕科大");
        map.put("在校人数", "20000");

        //使用Entry进行遍历 每个Entry就是一个条目即键值对
        for(Map.Entry<String, String> entry  :  map.entrySet()){
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }

        System.out.println(map.size());
        System.out.println(map.isEmpty());
        //containsKey比较高效的
        System.out.println(map.containsKey("学校"));
        //containsValue比较低效的(遍历）
        System.out.println(map.containsValue("西交大"));
    }
}
