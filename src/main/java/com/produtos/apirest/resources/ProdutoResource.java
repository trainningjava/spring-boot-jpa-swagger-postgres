package com.produtos.apirest.resources;

import com.produtos.apirest.dto.ProdutoResposta;
import com.produtos.apirest.models.Produto;
import com.produtos.apirest.repository.ProdutoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Produtos")
public class ProdutoResource {

    @Autowired
    ProdutoRepository produtoRepository;


    @ApiOperation(value="Retorna uma lista de Produtos")
    @GetMapping("/produtos")
    public List<Produto> listaProdutos() {
        return produtoRepository.findAll();
    }


    @ApiOperation(value="Retorna um produto unico")
    @GetMapping("/produtos/{id}")
    public Produto listaProdutosUnico(@PathVariable(value="id") long id) {

        return produtoRepository.findById(id);
    }

    @ApiOperation(value="Salva um produto")
    @PostMapping("/produtos")
    public Produto salvaProduto(@RequestBody @Valid Produto produto) {
        return produtoRepository.save(produto);
    }

    @ApiOperation(value="Deleta um produto")
    @DeleteMapping("/produtos")
    public void deletaProduto(@RequestBody @Valid Produto produto) {
        produtoRepository.delete(produto);
    }

    @ApiOperation(value="Atualiza um produto")
    @PutMapping("/produtos")
    public Produto atualizaProduto(@RequestBody @Valid Produto produto) {
        return produtoRepository.save(produto);
    }

    @GetMapping("/getInfo")
    public List<ProdutoResposta> getJoinInformation(){
        return produtoRepository.getJoinInformation();
    }
}
