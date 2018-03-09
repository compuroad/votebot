package com.jpmchase.cib.mdss.votebot.services;



import com.jpmchase.cib.mdss.votebot.model.VoteProposal;

public interface VoteProposalService {

    Iterable<VoteProposal> listAllVoteProposals();

    VoteProposal getVoteProposalById(Integer id);

    VoteProposal saveVoteProposal(VoteProposal voteProposal);

    void deleteVoteProposal(Integer id);

}
