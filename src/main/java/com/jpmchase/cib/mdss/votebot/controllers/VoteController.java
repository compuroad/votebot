package com.jpmchase.cib.mdss.votebot.controllers;


import com.jpmchase.cib.mdss.votebot.entities.Vote;
import com.jpmchase.cib.mdss.votebot.services.VoteService;
//import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Vote controller.
 */
@Controller
public class VoteController {

    private VoteService voteService;

    @Autowired
    public void setVoteService(VoteService voteService) {
        this.voteService = voteService;
    }

    /**
     * List all votes.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/votes", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("votes", voteService.listAllVotes());
        System.out.println("Returning votes:");
        return "votes";
    }

    /**
     * View a specific vote by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("vote/{id}")
    public String showVote(@PathVariable Integer id, Model model) {
        model.addAttribute("vote", voteService.getVoteById(id));
        return "voteshow";
    }

    // Afficher le formulaire de modification du Vote
    @RequestMapping("vote/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("vote", voteService.getVoteById(id));
        return "voteform";
    }

    /**
     * New vote.
     *
     * @param model
     * @return
     */
    @RequestMapping("vote/new")
    public String newVote(Model model) {
        model.addAttribute("vote", new Vote());
        return "voteform";
    }

    /**
     * Save vote to database.
     *
     * @param vote
     * @return
     */
    @RequestMapping(value = "vote", method = RequestMethod.POST)
    public String saveVote(Vote vote) {
        voteService.saveVote(vote);
        return "redirect:/vote/" + vote.getId();
    }

    /**
     * Delete vote by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("vote/delete/{id}")
    public String delete(@PathVariable Integer id) {
        voteService.deleteVote(id);
        return "redirect:/votes";
    }

}
