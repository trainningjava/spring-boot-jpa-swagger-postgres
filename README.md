## :information_source: Informações do desafio

Construa o código que contemple as seguintes operações expostas como endpoints REST para:

* Cadastrar Produto
* Cadastrar Lotes do Armazem
* Cadastrar Valor
* Consultar Produto
* Consultar Armazem
* Remover Produto
* Remover Lotes do Armazem
* Remover Valor

Considere o cadastro com dados básicos:

* Produto: nome, ...
* Lotes do Armazem: nome, ...
* Valor: valor, ...


## :seedling: Uso 

Antes de executar o projeto, realize o seguinte comando

- `docker run --name postgres-0 -e POSTGRES_PASSWORD=password -d -p 5432:5432 postgres:alpine`

- `docker exec postgres-0 psql -U postgres -c"CREATE DATABASE produtosapirest" postgres`

## :rocket: Tecnologias Utilizadas 

```
- Docker
- java 1.8
- Maven
- hibernate
- JPA
- POSTGRES
```

Pode usar [Editor Swagger Online][swagger] para abrir o arquivo [swagger.yaml](https://github.com/trainningjava/spring-boot-jpa-swagger-postgres/blob/master/public/swagger/swagger.yaml)

## :iphone: Telas

<img src="public/assets/images/docker.JPG?raw=true" width="300"/>
<img src="public/assets/images/Swagger1.JPG?raw=true" width="300"/><img src="public/assets/images/Swagger2.JPG?raw=true" width="300"/><img src="public/assets/images/Swagger3.JPG?raw=true" width="300"/><img src="public/assets/images/Swagger4.JPG?raw=true" width="300"/><img src="public/assets/images/Swagger5.JPG?raw=true" width="300"/><img src="public/assets/images/Swagger6.JPG?raw=true" width="300"/>

[swagger]:https://editor.swagger.io/
