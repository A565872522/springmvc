package controller;

import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;

public class MyRedis {
    public static void main(String[] args){
        Jedis jedis = new Jedis();//创建redis对象
        jedis.set("hero","lisi");
        String s = jedis.get("name");
//        System.out.println(s);

//        Map map = jedis.hgetAll("mymap");
//        System.out.println(map);

//        Map map2 = new HashMap();
//        map2.put("game","lol");
//        map2.put("school","清华");
//        map2.put("mobilephone","iphone");
//
//        jedis.hmset("my",map2);

        Map<String,Map> map = new HashMap<String, Map>();

        Map<String,String> map2 = new HashMap<String,String>();
        map2.put("zhangsan","nan");
        map2.put("lisi","nv");
        map2.put("wangwu","weizhi");

        Map<Integer,String> map3 = new HashMap<Integer, String>();
        map3.put(1,"dog");
        map3.put(2,"cat");
        map3.put(3,"fish");

        map.put("qq",map2);
        map.put("wx",map3);

//        for(Map.Entry<String,Map> entry:map.entrySet()){
//            System.out.println(entry.getKey()+"***"+entry.getValue());
//        }

        for(Map.Entry<String,String> entry:map2.entrySet()){
            System.out.println(entry.getKey()+"***"+entry.getValue());
        }
    }
}
