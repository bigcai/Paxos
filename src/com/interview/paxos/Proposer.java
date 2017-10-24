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
     *  3.解析PrepareResponse，并向未Accept的Acceptor
     *
     *
     *
     * @param proposedValue
     */
    public void propose(String proposedValue);

    /**
     * 解析PrepareResponse，并将符合条件的Acceptor加入“待发送Accept命令的缓存队列中”
     *
     *  解释prepareRequest时，被广播Accept的Acceptor需要满足：
     *  1.ProposalNumber 需要是当前缓存的提议（如果是旧或者和缓存的不一致就丢弃他）
     *  2.返回prepareRequest的Acceptor已经在Acceptor广播队列中了。
     *  3.Acceptor广播队列的数量已经超过了总Acceptor数目的一半了（满足大多数）
     *
     *
     * @param r
     */
    public void receivePrepare(PrepareResponse r);
}
