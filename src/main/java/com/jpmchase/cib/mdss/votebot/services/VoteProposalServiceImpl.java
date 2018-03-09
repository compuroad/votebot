package com.jpmchase.cib.mdss.votebot.services;


import com.jpmchase.cib.mdss.votebot.model.VoteProposal;
import com.jpmchase.cib.mdss.votebot.repositories.VoteProposalRepository;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Vote service implement.
 */
@Service
public class VoteProposalServiceImpl implements VoteProposalService {

    private VoteProposalRepository voteProposalRepository;

    @Autowired
    public void setVoteProposalRepository(VoteProposalRepository voteProposalRepository) {
        this.voteProposalRepository = voteProposalRepository;
    }

    @Override
    public Iterable<VoteProposal> listAllVoteProposals() {
        return voteProposalRepository.findAll();
    }

    @Override
    public VoteProposal getVoteProposalById(Integer id) {
        return voteProposalRepository.findOne(id);
    }

    @Override
    public VoteProposal saveVoteProposal(VoteProposal voteProposal) {
        return voteProposalRepository.save(voteProposal);
    }

    @Override
    public void deleteVoteProposal(Integer id) {
        voteProposalRepository.delete(id);
    }



}
