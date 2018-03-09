package com.jpmchase.cib.mdss.votebot.services;


import com.jpmchase.cib.mdss.votebot.entities.Vote;
//import org.bson.types.ObjectId;

public interface VoteService {

    Iterable<Vote> listAllVotes();

    Vote getVoteById(Integer id);

    Vote saveVote(Vote vote);

    void deleteVote(Integer id);

}
