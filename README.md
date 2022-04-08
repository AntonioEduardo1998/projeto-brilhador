# Projeto brilhador - Gestão de cadeia de suprimentos


**serviço industria**

```
GET http://localhost:8080/industrias
POST http://localhost:8080/industria

Payload:

{
  "nome": "..."
  "tipo": "..."
  "cidade": "..."
}


```

**serviço forncedor**

```
GET Fornecedores http://localhost:3535/fornecedores
POST Fornecedor http://localhost:3535/fornecedor

{
	"nome": "Fornecedor",
	"cidade": "Curitiba"
}

GET Estoque Fornecedor http://localhost:3535/fornecedor/estoque
GET Pedidos Estoque http://localhost:3535/fornecedores/pedidos
POST Pedido para Fornecedor http://localhost:3535/pedido

{
	"autor": "Geucimar",
	"descricao": "materia prima",
	"id_produto": 2
}

```
