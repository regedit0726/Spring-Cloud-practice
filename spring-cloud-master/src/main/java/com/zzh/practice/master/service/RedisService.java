package com.zzh.practice.master.service;

/**
 * description： <br>
 * createTime: 2018/1/59:54 <br>
 *
 * @author zzh
 */
public interface RedisService {

    /**
     * Method Name：
     * Method Description: 保存字符串值到redis缓存<br>
     *
     * @param key   键
     * @param value 值
     *              <p>creator：zzh
     *              <p>createTime：2018/1/5 16:05
     */
    void setString(String key, String value);

    /**
     * Method Name：
     * Method Description: 保存字符串值到redis缓存<br>
     *
     * @param key     键
     * @param value   值
     * @param seconds 超时秒数
     *                <p>creator：zzh
     *                <p>createTime：2018/1/5 16:06
     */
    void setString(String key, String value, long seconds);

    /**
     * Method Name：
     * Method Description: 取字符串值<br>
     *
     * @param key 键
     * @return 保存的字符串值
     * <p>creator：zzh
     * <p>createTime：2018/1/5 16:07
     */
    String getString(String key);

    /**
     * Method Name：
     * Method Description: 保存对象到redis缓存<br>
     *
     * @param key   键
     * @param value 值
     *              <p>creator：zzh
     *              <p>createTime：2018/1/5 16:08
     */
    void setObject(String key, Object value);

    /**
     * Method Name：
     * Method Description: 保存对象到redis缓存<br>
     *
     * @param key     键
     * @param value   值
     * @param seconds 超时秒数
     *                <p>creator：zzh
     *                <p>createTime：2018/1/5 16:08
     */
    void setObject(String key, Object value, long seconds);

    /**
     * Method Name：
     * Method Description: 获取缓存对象<br>
     *
     * @param key       键
     * @return 缓存的对象
     * <p>creator：zzh
     * <p>createTime：2018/1/5 16:09
     */
    <T> T getObject(String key);

    /**
     *
     * Method Name：
     * Method Description: 从redis删除缓存对象<br>
     *
     * @param   key 键
     * <p>creator：zzh
     * <p>createTime：2018/1/5 16:32
     */
    void deleteObject(Object key);

    /**
     * Method Name：
     * Method Description: 保存对象到redis<br>
     *
     * @param key       键
     * @param hashKey   hash键
     * @param hashValue hash值
     *                  <p>creator：zzh
     *                  <p>createTime：2018/1/5 16:09
     */
    void setHash(String key, Object hashKey, Object hashValue);

    /**
     *
     * Method Name：
     * Method Description: 从缓存中删除hash对象<br>
     *
     * @param key       键
     * @param hashKey   hash键
     * @return 操作结果
     * <p>creator：zzh
     * <p>createTime：2018/1/5 16:21
     */
    long deleteHash(String key, Object... hashKey);

    /**
     * Method Name：
     * Method Description: 获取缓存对象<br>
     *
     * @param key
     * @param hashKey hash键
     * @return 缓存的对象
     * <p>creator：zzh
     * <p>createTime：2018/1/5 16:10
     */
    <K, V> V getHashValue(String key, K hashKey);

    /**
     *
     * Method Name：increment
     * Method Description: redis缓存值原子增加指定值<br>
     *
     * @param   key         key
     * @param   incValue    增量
     * @return  操作结果
     * @throw
     * <p>creator：zhihui.zhou
     * <p>createTime：2018/4/17 10:39
     */
    long increment(String key, long incValue);

    /**
     *
     * Method Name：increment
     * Method Description: redis缓存值原子增加1<br>
     *
     * @param   key         key
     * @return  操作结果
     * @throw
     * <p>creator：zhihui.zhou
     * <p>createTime：2018/4/17 10:39
     */
    long increment(String key);
}
