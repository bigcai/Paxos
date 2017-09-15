package com.interview.paxos;

import com.interview.paxos.message.AcceptRequest;
import com.interview.paxos.message.PrepareRequest;
import com.interview.paxos.message.PrepareResponse;

/**
 *  提议接受者接口
 */
public interface Acceptor extends Component{

    /**
     * 指示Acceptor响应prepare请求:
     *      request中包含提议的数值（该数值随机产生，数值越大，越可能最终被接受。），以及请求来源。（此时还不需要提高要提议的内容）
     *      prepare时会设置lastPrepareProposalNumber（最后一次Prepare的ProposalNumber），只会设置为比最后一次大的ProposalNumber
     * @param m
     * @return  返回的PrepareResponse包括了，当前Accept接受的ProposalNumber以及内容（可能都为空），以及你提议的ProposalNumber和Acceptor的ID
     *              具体每个字段的意义请看 << PrepareResponse.class >>
     *
     */
    public PrepareResponse prepare(PrepareRequest m);

    /**
     * 指示Acceptor响应accept请求
     *        accept请求中包含了提议数值proposalNumber，以及被接受的内容
     *        只要proposalNumber大于等于最后一次lastPrepareProposalNumber
     *        accept只接受一次（只设置一次内容），之后无论proposalNumber多大都会被忽略
     *
     * @param m
     * @return
     */
    public void accept(AcceptRequest m);

    /**
     * 发送消息给Learner 去学习所有Acceptor接受的内容，某一个内容被大多数Acceptor接受的为Learner最终值。也是这次paxos算法得出的具有一致性的值。
     */
    public void sentLearntValue();

}
