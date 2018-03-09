package com.jpmchase.cib.mdss.votebot.services;


import com.jpmchase.cib.mdss.votebot.entities.Vote;

import com.jpmchase.cib.mdss.votebot.repositories.VoteRepository;
//import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Vote service implement.
 */
@Service
public class VoteServiceImpl implements VoteService {

    private VoteRepository voteRepository;

    @Autowired
    public void setVoteRepository(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    @Override
    public Iterable<Vote> listAllVotes() {
        return voteRepository.findAll();
    }


    @Override
    public Vote getVoteById(Integer id) {
        return voteRepository.findOne(id);
    }


    /*@Override
    public Vote getVoteById(String id) {
        return voteRepository.findOne(id);
    }
    */
    @Override
    public Vote saveVote(Vote vote) {
        return voteRepository.save(vote);
    }

    @Override
    public void deleteVote(Integer id) {
        voteRepository.delete(id);
    }

}
