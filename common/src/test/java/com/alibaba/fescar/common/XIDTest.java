package com.alibaba.fescar.common;

/**
 * @author: liuyiyou.cn
 * @date: 2019/1/21
 * @version: V1.0
 */
public class XIDTest {

    @org.junit.Test
    public void setPort() {
    }

    @org.junit.Test
    public void setIpAddress() {
    }

    @org.junit.Test
    public void generateXID() {
        XID.setPort(8091);
        XID.setIpAddress("127.0.0.1");
        String xid = XID.generateXID(1L);
        System.out.println(xid);
    }

    @org.junit.Test
    public void getTransactionId() {
    }

    @org.junit.Test
    public void getServerAddress() {
    }
}
