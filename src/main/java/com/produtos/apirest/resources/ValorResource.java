package com.produtos.apirest.resources;

import com.produtos.apirest.models.ValorProd;
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
@Api(value="API REST Valores")
public class ValorResource {

    @Autowired
    ValorProdRepository valorRep;

    @ApiOperation(value="Retorna uma lista de Valores")
    @GetMapping("/valor")
    public List<ValorProd> listaValors() {
        return valorRep.findAll();
    }


    @ApiOperation(value="Retorna um Valor unico")
    @GetMapping("/valor/{id}")
    public ValorProd listaValorsUnico(@PathVariable(value="id") long id) {

        return valorRep.findById(id);
    }

    @ApiOperation(value="Salva um Valor")
    @PostMapping("/valor")
    public ValorProd salvaValor(@RequestBody @Valid ValorProd Valor) {
        return valorRep.save(Valor);
    }

    @ApiOperation(value="Deleta um Valor")
    @DeleteMapping("/valor")
    public void deletaValor(@RequestBody @Valid ValorProd Valor) {
        valorRep.delete(Valor);
    }

    @ApiOperation(value="Atualiza um Valor")
    @PutMapping("/valor")
    public ValorProd atualizaValor(@RequestBody @Valid ValorProd Valor) {
        return valorRep.save(Valor);
    }
}
