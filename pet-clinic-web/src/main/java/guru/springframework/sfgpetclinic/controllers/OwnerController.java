package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    // == fields ==
    private final OwnerService ownerService;

    // == constructors ==
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    // == request methods ==
    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(Model model) {

        model.addAttribute("owners", ownerService.findAll());

        return "/owners/index";
    }

    @RequestMapping("/find")
    public String findOwner() {
        return "/notimplemented";
    }

}
