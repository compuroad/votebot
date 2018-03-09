package com.jpmchase.cib.mdss.votebot.repositories;

import com.jpmchase.cib.mdss.votebot.entities.Vote;
//import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

public interface VoteRepository extends CrudRepository<Vote, Integer> {

}
