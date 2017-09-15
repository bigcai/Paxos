package com.interview.paxos;

import com.interview.paxos.message.LearnerMessage;

/**
 * Learner 负责从Acceptor中读取所有的内容，统计出acceptor最多次的值为 此次paxos算法得出结果
 */
public interface Learner extends Component{

    public void learnProposedValue(LearnerMessage m);
}
