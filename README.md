
## :seedling: Uso 

Antes de executar o projeto, realize o seguinte comando

- `docker run --name postgres-0 -e POSTGRES_PASSWORD=password -d -p 5432:5432 postgres:alpine`

- `docker exec postgres-0 psql -U postgres -c"CREATE DATABASE produtosapirest" postgres`

## :rocket: Tecnologias Utilizadas 

```
- docker
- java 1.8
- hibernate
- JPA
- POSTGRES
```

Editor Swagger Online:
- [arquivo yaml][swagger]

## :iphone: Telas

<img src="public/assets/images/docker.JPG?raw=true" width="300"/>
<img src="public/assets/images/Swagger1.JPG?raw=true" width="300"/><img src="public/assets/images/Swagger2.JPG?raw=true" width="300"/><img src="public/assets/images/Swagger3.JPG?raw=true" width="300"/><img src="public/assets/images/Swagger4.JPG?raw=true" width="300"/><img src="public/assets/images/Swagger5.JPG?raw=true" width="300"/><img src="public/assets/images/Swagger6.JPG?raw=true" width="300"/>

[swagger]:https://editor.swagger.io/
