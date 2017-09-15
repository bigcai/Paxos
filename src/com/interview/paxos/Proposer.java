package com.interview.paxos;

import com.interview.paxos.message.PrepareResponse;

/**
 * 提议者接口：
 *
 *      Proposer接口定义
 */
public interface Proposer extends Component{

    public void propose(String proposedValue);
    public void receivePrepare(PrepareResponse r);
}
