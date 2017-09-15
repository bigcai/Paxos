package com.interview.paxos;

import com.interview.paxos.message.PrepareResponse;

/**
 * 提议者接口：
 *
 *      Proposer接口定义
 */
public interface Proposer extends Component{

    /**
     *  proposer向Acceptor产生提议的过程
     *  1.生成一个需要提议的随机数 proposalNumber
     *  2.随机向大多数（过半数）的Acceptor发送prepareRequest
     *  3.解析prepareRequest，并向未Accept的Acceptor
     *
     * @param proposedValue
     */
    public void propose(String proposedValue);
    public void receivePrepare(PrepareResponse r);
}
