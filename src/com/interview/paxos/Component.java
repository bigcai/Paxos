package com.interview.paxos;

import com.interview.paxos.message.SourceDestination;

/**
 * 基本组件接口：
 *  接收消息的接口
 */
public interface Component {


    void receiveMessage(SourceDestination sd, Message m);

    String getId();
}
