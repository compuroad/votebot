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



import javax.persistence.*;
import javax.persistence.Embeddable;
import java.math.BigDecimal;

/*import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;*/

/**
 * Created by frank on 12/12/16.
 */
@Embeddable
//@Document
public class Proposal {

   // @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
   // private Integer id;
    private String name;
    private String description;
    private String linebusiness;

    public Proposal(){}

    public Proposal(String name, String description, String linebusiness) {

        this.name = name;
        this.description = description;
        this.linebusiness = linebusiness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLinebusiness() {
        return linebusiness;
    }

    public void setLinebusiness(String linebusiness) {
        this.linebusiness = linebusiness;
    }
}
