package unoesc.desafio._42.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/list")
    public String listProducts(Model model) {
        // Lógica para listar produtos
        return "product/list";
    }

    @GetMapping("/create")
    public String createProductForm(Model model) {
        // Lógica para carregar o formulário de criação
        return "product/create";
    }
}
