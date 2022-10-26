package kailamoraes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kailamoraes.repositories.GeneroRepository;

@Controller
@RequestMapping("/alunos")
public class GenerosController {
    @Autowired
    private generoRepository generosRepo;

    @RequestMapping("list")
    public String list(Model model) {
        model.addAttribute("generos", generosRepo.findAll());
        return "/generos/list";
    }

    @RequestMapping("insert")
    public String() {
        return "/generos/insert";
    }

    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public String insert(@RequestParam("nome") String nome) {
        Genero genero = new Genero();
        genero.setNome(nome);
        generosRepo.save(genero);
        return "redirect:/generos/list";
    }

    @RequestMapping("update/{id}")
    public String update(Model model, @PathVariable int id) {
        Optional<Genero>genero = generosRepo.findById(id);
        model.addAttribute("genero", genero.get());
        return "/generos/update";
    }
}