package cash.xcl.server;

import cash.xcl.api.ServerComponent;
import cash.xcl.api.dto.TransactionBlockVoteEvent;

public interface VoteTaker extends ServerComponent {
    void transactionBlockVoteEvent(TransactionBlockVoteEvent transactionBlockVoteEvent);

    void sendTreeNode(long blockNumber);
}
