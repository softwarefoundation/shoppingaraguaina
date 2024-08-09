package br.com.shoppingaraguaina.controller;

import br.com.shoppingaraguaina.entity.dto.ProdutoDTO;
import br.com.shoppingaraguaina.http.Response;
import br.com.shoppingaraguaina.services.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/produtos")
public class ProdutoController extends AbstractController {


    private ProdutoService produtoService;


    @PostMapping
    public ResponseEntity<Response<ProdutoDTO>> cadastrar(@Valid @RequestBody ProdutoDTO dto, BindingResult result) {
        Response<ProdutoDTO> response = new Response<>();

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


}
