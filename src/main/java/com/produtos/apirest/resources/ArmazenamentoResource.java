package com.produtos.apirest.resources;

import com.produtos.apirest.models.Armazenamento;
import com.produtos.apirest.models.ValorProd;
import com.produtos.apirest.repository.ArmazenamentoRepository;
import com.produtos.apirest.repository.ValorProdRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Armazenamento")
public class ArmazenamentoResource {

    @Autowired
    ArmazenamentoRepository armazenamentoRep;

    @ApiOperation(value="Retorna uma lista de Valores")
    @GetMapping("/armazem")
    public List<Armazenamento> listaValors() {
        return armazenamentoRep.findAll();
    }


    @ApiOperation(value="Retorna um Valor unico")
    @GetMapping("/armazem/{id}")
    public Armazenamento listaValorsUnico(@PathVariable(value="id") long id) {

        return armazenamentoRep.findById(id);
    }

    @ApiOperation(value="Salva um Valor")
    @PostMapping("/armazem")
    public Armazenamento salvaValor(@RequestBody @Valid Armazenamento armazem) {
        return armazenamentoRep.save(armazem);
    }

    @ApiOperation(value="Deleta um Valor")
    @DeleteMapping("/armazem")
    public void deletaValor(@RequestBody @Valid Armazenamento armazem) {
        armazenamentoRep.delete(armazem);
    }

    @ApiOperation(value="Atualiza um Valor")
    @PutMapping("/armazem")
    public Armazenamento atualizaValor(@RequestBody @Valid Armazenamento armazem) {
        return armazenamentoRep.save(armazem);
    }
}
