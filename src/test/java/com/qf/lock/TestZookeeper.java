package com.qf.lock;

import org.I0Itec.zkclient.ZkClient;
import org.apache.zookeeper.CreateMode;
import org.junit.Test;

public class TestZookeeper {


    @Test
    public void create() {
//        创建客户端对象
        ZkClient zkClient = new ZkClient("192.168.164.88:2181");
//        操作
        zkClient.create("/java1903","永久节点",CreateMode.PERSISTENT_SEQUENTIAL);
    }


    @Test
    public  void  test(){
        //1,创建客户端对象
        ZkClient zkClient = new ZkClient("192.168.164.88:2181");
        //2,操作
        zkClient.writeData("/java1903","很棒！");

        zkClient.close();
    }

    @Test
    public void delete(){

        //1,创建客户端对象
        ZkClient zkClient = new ZkClient("192.168.164.88:2181");
        //删除节点
        boolean f = zkClient.delete("/java19030000000009");
        System.out.println(f);
        zkClient.close();

    }
}
