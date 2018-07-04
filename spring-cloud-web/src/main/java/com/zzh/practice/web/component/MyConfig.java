package com.zzh.practice.web.component;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * description： <br>
 * createTime: 2018/7/50:18 <br>
 *
 * demo url: https://gitee.com/jason-fu/testSpringBoot
 * url:http://baijiahao.baidu.com/s?id=1600764554823825050&wfr=spider&for=pc
 * @author zzh
 */
@Component
// 不加这个注解的话, 使用@Autowired 就不能注入进去了
@ConfigurationProperties(prefix = "myProps")
// 配置文件中的前缀
public class MyConfig {
    private String simpleProp;
    private String[] arrayProps;
    private List<Map<String, String>> listProp1 = new ArrayList<Map<String, String>>(); //接收prop1里面的属性值,List中的元素是Map
    private List<String> listProp2 = new ArrayList<String>(); //接收prop2里面的属性值
    private Map<String, String> mapProps = new HashMap<String,String>(); //接收prop1里面的属性值

    public String getSimpleProp() {
        return simpleProp;
    }

    public void setSimpleProp(String simpleProp) {
        this.simpleProp = simpleProp;
    }

    public String[] getArrayProps() {
        return arrayProps;
    }

    public void setArrayProps(String[] arrayProps) {
        this.arrayProps = arrayProps;
    }

    public List<Map<String, String>> getListProp1() {
        return listProp1;
    }

    public void setListProp1(List<Map<String, String>> listProp1) {
        this.listProp1 = listProp1;
    }

    public Map<String, String> getMapProps() {
        return mapProps;
    }

    public void setMapProps(Map<String, String> mapProps) {
        this.mapProps = mapProps;
    }

    public List<String> getListProp2() {
        return listProp2;
    }

    public void setListProp2(List<String> listProp2) {
        this.listProp2 = listProp2;
    }


}
