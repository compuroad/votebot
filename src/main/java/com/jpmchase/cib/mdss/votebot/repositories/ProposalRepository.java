package com.jpmchase.cib.mdss.votebot.repositories;

import com.jpmchase.cib.mdss.votebot.entities.Vote;
import org.springframework.data.repository.CrudRepository;

public interface ProposalRepository extends CrudRepository<Vote, Integer> {

}
