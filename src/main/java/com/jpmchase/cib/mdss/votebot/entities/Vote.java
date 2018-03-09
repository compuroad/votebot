package com.jpmchase.cib.mdss.votebot.entities;




import javax.persistence.*;

//import org.bson.types.ObjectId;
//import org.springframework.data.mongodb.core.mapping.Document;


/**
 * Vote entity.
 */


@Entity
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    private String name;
    private String detail;
    private String linebusiness;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }




    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getLinebusiness() {
        return linebusiness;
    }

    public void setLinebusiness(String linebusiness) {
        this.linebusiness = linebusiness;
    }
}
