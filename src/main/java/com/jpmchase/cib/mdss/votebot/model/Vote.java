/*
 *  Copyright 2017 The Symphony Software Foundation
 *
 *  Licensed to The Symphony Software Foundation (SSF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */

package com.jpmchase.cib.mdss.votebot.model;

import org.symphonyoss.symphony.clients.model.SymUser;

/**
 * Created by frank on 12/12/16.
 */
public class Vote {

    private SymUser symUser;
    private VoteType vote;
    private String comments;
    private long   voteTime;

    public Vote(){}

    public SymUser getSymUser() {
        return symUser;
    }

    public VoteType getVote() {
        return vote;
    }

    public void setVote(VoteType vote) {
        this.vote = vote;
    }

    public void setSymUser(SymUser symUser) {
        this.symUser = symUser;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public long getVoteTime() {
        return voteTime;
    }

    public void setVoteTime(long voteTime) {
        this.voteTime = voteTime;
    }


}
