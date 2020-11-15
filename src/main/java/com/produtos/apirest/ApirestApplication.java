package com.produtos.apirest;

import com.produtos.apirest.models.Armazenamento;
import com.produtos.apirest.models.Produto;
import com.produtos.apirest.models.ValorProd;
import com.produtos.apirest.repository.ArmazenamentoRepository;
import com.produtos.apirest.repository.ProdutoRepository;
import com.produtos.apirest.repository.ValorProdRepository;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.Random;

@SpringBootApplication
public class ApirestApplication implements ApplicationRunner {

	@Autowired
	ProdutoRepository produtoRep;

	@Autowired
	ValorProdRepository valorProdRep;

	@Autowired
	ArmazenamentoRepository armazenamentoRep;


	public static void main(String[] args) {
		SpringApplication.run(ApirestApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Produto produto = new Produto();
		ValorProd valor = new ValorProd();
		Armazenamento armazen = new Armazenamento();

		String[] arr={"Celular", "Notebook", "TV", "VideoGames"};
		int maximo=15;
		long indice=1;

		// Gerando lista de Produtos
		for(int i= 0; i < maximo ; i++) {
			int randomNumber = (int)(Math.random() * arr.length);
			int randomNumber1 = (int)((Math.random() * maximo) + 1);
			String description = arr[randomNumber] + randomNumber1;
			produtoRep.save(new Produto(indice++,description, true));
		}

		// Gerando lista de Armazem
		indice=1;
		for(int i=0 ; i < maximo ; i++) {
			int randomNumber1 = (int)((Math.random() * maximo) + 1);
			produto.setId(randomNumber1);

			armazen.setId(indice++);
			Random r = new Random();
			StringBuilder sb = new StringBuilder(5);
			for(int j = 0; j < 5; j++) {
				char tmp = (char) ('a' + r.nextInt('z' - 'a'));
				sb.append(tmp); // Add it to the String
			}
			armazen.setLote(sb.toString().toUpperCase());
			armazen.setQuantidade(new BigDecimal((int)(Math.random() * 50) + 1));
			armazen.setBloqueado(false);
			armazen.setProduto(produto);
			armazenamentoRep.save(armazen);
		}

		// Gerando lista de valores
		indice=1;
		for(int i=0 ; i < (maximo * 2); i++) {
			int randomNumber1 = (int)((Math.random() * maximo) + 1);
			ValorProd valorProd1 = valorProdRep.findbyArmazemId(randomNumber1);
			if ( valorProd1 == null) {
				armazen.setId(randomNumber1);
				valor.setId(indice++);
				valor.setValor(new BigDecimal((int)(Math.random() * 1500) + 1));
				valor.setArmazenamento(armazen);
				valorProdRep.save(valor);
			}
		}

	}
}
