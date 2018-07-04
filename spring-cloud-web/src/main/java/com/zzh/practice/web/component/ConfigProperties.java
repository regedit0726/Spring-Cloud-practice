package com.zzh.practice.web.component;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * description： <br>
 * createTime: 2018/7/50:09 <br>
 *
 * @author zzh
 */
@Component
@ConfigurationProperties(prefix = "xx.test")
public class ConfigProperties {

    private String hehe;

    private String[] txtarray;

    private List<Map<String, String>> listmap;

    private List<String> liststr;

    private Map<String, String> map;


    /**
     * @param 设置 hehe
     */
    public void setHehe(String hehe) {
        this.hehe = hehe;
    }


    /**
     * @param 设置 txtarray
     */
    public void setTxtarray(String[] txtarray) {
        this.txtarray = txtarray;
    }


    /**
     * @param 设置 listmap
     */
    public void setListmap(List<Map<String, String>> listmap) {
        this.listmap = listmap;
    }


    /**
     * @param 设置 liststr
     */
    public void setListstr(List<String> liststr) {
        this.liststr = liststr;
    }


    /**
     * @return 获取 hehe
     */
    public String getHehe() {
        return hehe;
    }


    /**
     * @return 获取 txtarray
     */
    public String[] getTxtarray() {
        return txtarray;
    }


    /**
     * @return 获取 listmap
     */
    public List<Map<String, String>> getListmap() {
        return listmap;
    }


    /**
     * @return 获取 liststr
     */
    public List<String> getListstr() {
        return liststr;
    }


    /**
     * @return 获取 map
     */
    public Map<String, String> getMap() {
        return map;
    }


    /**
     * @param 设置 map
     */
    public void setMap(Map<String, String> map) {
        this.map = map;
    }


    /**
     * @return
     * @see [说明这个方法]
     * @since 2016年11月14日 上午10:38:49
     */
    @Override
    public String toString() {
        return "ConfigProperties [hehe=" + hehe + ", txtarray=" + Arrays.toString(txtarray) + ", listmap=" + listmap
                + ", liststr=" + liststr + ", map=" + map + "]";
    }

}