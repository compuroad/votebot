package com.jpmchase.cib.mdss.votebot.controllers;


import com.jpmchase.cib.mdss.votebot.model.VoteProposal;
import com.jpmchase.cib.mdss.votebot.services.VoteProposalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * VoteProposal controller.
 */
@Controller
public class VoteProposalController {

    private VoteProposalService voteProposalService;

    @Autowired
    public void setVoteProposalService(VoteProposalService voteProposalService) {
        this.voteProposalService = voteProposalService;
    }

    /**
     * List all voteproposals.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/voteproposals", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("voteproposals", voteProposalService.listAllVoteProposals());
        System.out.println("Returning voteproposals:");
        return "voteproposals";
    }

    /**
     * View a specific voteproposal by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("voteproposal/{id}")
    public String showVoteProposal(@PathVariable Integer id, Model model) {
        model.addAttribute("voteproposal", voteProposalService.getVoteProposalById(id));
        return "voteproposalshow";
    }

    // Afficher le formulaire de modification du VoteProposal
    @RequestMapping("voteproposal/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("voteproposal", voteProposalService.getVoteProposalById(id));
        return "voteproposalform";
    }

    /**
     * New voteproposal.
     *
     * @param model
     * @return
     */
    @RequestMapping("voteproposal/new")
    public String newVoteProposal(Model model) {
        model.addAttribute("voteproposal", new VoteProposal());
        return "voteproposalform";

        //voteproposalform.html
    }

    /**
     * Save vote to database.
     *
     * @param voteProposal
     * @return
     */
    @RequestMapping(value = "voteproposal", method = RequestMethod.POST)
    public String saveVoteProposal(VoteProposal voteProposal) {
        voteProposalService.saveVoteProposal(voteProposal);
        return "redirect:/voteproposal/" + voteProposal.getId();
    }

    /**
     * Delete vote by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("voteproposal/delete/{id}")
    public String delete(@PathVariable Integer id) {
        voteProposalService.deleteVoteProposal(id);
        return "redirect:/voteproposals";
    }

}
