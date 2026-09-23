# Implementação do Padrão Decorator - Bakery

## Objetivo do Projeto

O projeto consiste em uma implementação de uma padaria utilizando o padrão de projeto **Decorator**.

O objetivo foi permitir a criação de bolos personalizados, adicionando características como:
- várias camadas;
- granulado;
- mensagens personalizadas;

sem alterar as classes existentes dos bolos.

A implementação também adicionou um novo tipo de bolo: **Strawberry Cake**.

---

# Adicionar arquivos iniciais do projeto

Nesta primeira etapa foi criado o projeto base da padaria.

Foram adicionadas as classes iniciais:

- `Cake.java`
- `VanillaCake.java`
- `ChocolateCake.java`
- `Order.java`
- `Main.java`

A classe abstrata `Cake` funciona como base para todos os tipos de bolos, definindo:

- custo padrão do bolo;
- descrição do produto.

Os bolos iniciais implementados foram:

- Bolo de baunilha (`VanillaCake`);
- Bolo de chocolate (`ChocolateCake`).

Também foi criada a classe `Order`, responsável por armazenar os bolos adicionados ao pedido e realizar sua impressão.

---

# Adicionar arquivo gitignore

Nesta etapa foi criado o arquivo `.gitignore` para evitar o envio de arquivos desnecessários ao repositório.

Foram adicionadas regras para ignorar:

- arquivos compilados Java (`.class`);
- arquivos temporários;
- configurações de IDE;
- pastas de compilação.

Essa configuração mantém o repositório organizado contendo apenas os arquivos necessários do projeto.

---

# Criar decorators para personalizar bolos

Nesta etapa foi implementado o padrão de projeto **Decorator**.

Foi criada a classe abstrata:

- `CakeDecorator`

Ela permite que novos comportamentos sejam adicionados aos bolos sem modificar as classes existentes.

Foram criados os decorators:

## MultiLayeredDecorator

Responsável por adicionar várias camadas ao bolo.

Alterações:

- adiciona R$5 ao custo;
- adiciona `"Multi-layered"` antes da descrição.

Exemplo:

```
Multi-layered Vanilla cake
```

---

## SprinklesDecorator

Responsável por adicionar granulado ao bolo.

Alterações:

- adiciona R$2 ao custo;
- adiciona `"with sprinkles"` ao final da descrição.

Exemplo:

```
Vanilla cake with sprinkles
```

---

## SayingDecorator

Responsável por adicionar uma mensagem ao bolo.

Alterações:

- não altera o custo;
- adiciona `"with saying X"` ao final da descrição.

Exemplo:

```
Vanilla cake with saying "PLAIN!"
```

---

A utilização do Decorator permite combinar diferentes características dinamicamente.

Exemplo:

```
VanillaCake
      |
      ↓
SprinklesDecorator
      |
      ↓
SayingDecorator
```

Resultado:

```
Vanilla cake with sprinkles with saying "FANCY"
```

---

# Adicionar bolo de morango

Nesta etapa foi criado um novo tipo de bolo:

- `StrawberryCake.java`

O bolo de morango herda da classe `Cake`.

Características:

- descrição:
```
Strawberry cake
```

- custo:
```
20
```

O valor foi definido como o dobro do bolo padrão:

```
Bolo padrão = 10
Bolo de morango = 20
```

Essa implementação foi feita sem alterar as classes existentes, seguindo o princípio de extensão do padrão Decorator.

---

# Atualizar Main para utilizar decorators nos pedidos

Nesta etapa o arquivo `Main.java` foi atualizado para criar uma `Order` contendo diferentes combinações de bolos.

Foram adicionados os seguintes pedidos:

## Bolo de chocolate

```
10 Chocolate cake
```

---

## Bolo de baunilha com mensagem

Utilizando:

```
VanillaCake
+
SayingDecorator
```

Resultado:

```
10 Vanilla cake with saying "PLAIN!"
```

---

## Bolo de baunilha com granulado e mensagem

Utilizando:

```
VanillaCake
+
SprinklesDecorator
+
SayingDecorator
```

Resultado:

```
12 Vanilla cake with sprinkles with saying "FANCY"
```

---

## Bolo de morango personalizado

Foi criada uma combinação utilizando vários decorators:

```
StrawberryCake
+
MultiLayeredDecorator
+
SprinklesDecorator
+
SprinklesDecorator
+
SayingDecorator
+
SayingDecorator
```

Resultado final:

```
29 Multi-layered Strawberry cake with sprinkles with sprinkles with saying "One of" with saying "EVERYTHING"
```

---

# Resultado Final

Após todas as etapas, o projeto passou a permitir a criação de bolos personalizados utilizando o padrão Decorator.

A implementação permite:

- criar novos tipos de bolos sem alterar código existente;
- adicionar novas características sem modificar os bolos;
- combinar diferentes decorações de forma flexível.

A saída final do programa é:

```
10 Chocolate cake
10 Vanilla cake with saying "PLAIN!"
12 Vanilla cake with sprinkles with saying "FANCY"
29 Multi-layered Strawberry cake with sprinkles with sprinkles with saying "One of" with saying "EVERYTHING"
```