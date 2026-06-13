# Sistema de Folha de Pagamento em Java

Projeto desenvolvido inicialmente como atividade acadêmica e evoluído como projeto pessoal de portfólio.

A proposta do sistema é ajudar uma empresa a organizar melhor as informações dos seus colaboradores, padronizando o cadastro e facilitando o cálculo dos salários de acordo com o tipo de funcionário.

## Objetivo do Projeto

O objetivo é praticar Java, Programação Orientada a Objetos, ArrayList, validações de entrada, cálculo de folha de pagamento e organização de código em um sistema executado pelo terminal.


## Funcionalidades

O sistema permite:

* Cadastrar informações básicas dos funcionários;
* Calcular salário de funcionário padrão;
* Calcular pagamento de funcionário comissionado;
* Calcular pagamento de funcionário de produção;
* Exibir as informações da folha de pagamento no terminal;
* Aplicar validações simples para evitar dados inválidos como números negativos, nome vazio ou nome com número.

  
## Tipos de Funcionários

O projeto possui diferentes classes para representar os tipos de funcionários.

### Funcionário Padrão

Funcionário que recebe um salário fixo.

### Funcionário Comissionado

Funcionário que recebe salário e comissão de acordo com suas vendas.

### Funcionário de Produção

Funcionário que recebe de acordo com a quantidade produzida e o valor pago por unidade.

## Tecnologias Utilizadas

* Java
* Git
* GitHub

## Conceitos Praticados

Durante o desenvolvimento do projeto, foram praticados os seguintes conceitos:

* Classes e objetos;
* Atributos;
* Métodos;
* Encapsulamento básico;
* Entrada de dados com Scanner;
* Estruturas condicionais;
* Estruturas de repetição;
* Validação de dados;
* Herança;
* ArrayList;
* Organização do código em arquivos separados.

## Estrutura do Projeto

A estrutura básica do projeto é composta pelos seguintes arquivos:

```text
SistemaFolhaPagamento/
│
├── src/
│   ├── Main.java
│   ├── FuncionarioPadrao.java
│   ├── FuncionarioComissionado.java
│   └── FuncionarioProducao.java
│
└── README.md
```

## Como Executar o Projeto

Para executar este projeto, é necessário ter o **Java JDK 21 ou superior** instalado no computador.

### Passo 1: Clonar o repositório

```bash
git clone https://github.com/Geicielly/SistemaFolhaPagamento.git
```

### Passo 2: Acessar a pasta do projeto

```bash
cd SistemaFolhaPagamento
```

### Passo 3: Acessar a pasta `src`

```bash
cd src
```

### Passo 4: Compilar os arquivos Java

```bash
javac *.java
```

### Passo 5: Executar o programa

```bash
java Main
```

Após executar o comando, o programa será iniciado no terminal e solicitará as informações necessárias para realizar o cadastro e o cálculo da folha de pagamento.

## Exemplo de Uso

Ao executar o programa, o sistema solicita os dados do funcionário, como nome, matrícula e informações necessárias para o cálculo do pagamento.

Depois do preenchimento, o sistema exibe a folha de pagamento com os dados organizados e o valor calculado.

Exemplo de saída no terminal:

```text

==== FOLHA DE PAGAMENTO ====

------------------------------------------
Nome: Maria      Matrícula: 1001     Salário Fixo: R$ 2000.00     Extras: R$ 0.0     Salário final: R$ 2000.00
------------------------------------------

```
## Status do Projeto

Projeto em evolução para portfólio.

A versão atual executa no terminal, permite cadastrar funcionários, aplicar validações simples e gerar a folha de pagamento. Novas melhorias serão adicionadas aos poucos, com commits organizados.

## Importância do Sistema para uma Empresa

Este sistema pode ajudar uma empresa a organizar melhor o cadastro dos funcionários e reduzir erros no cálculo da folha de pagamento.

Com o uso do sistema, as informações dos colaboradores ficam mais padronizadas, e os cálculos podem ser realizados de forma mais clara e organizada, de acordo com o tipo de funcionário cadastrado.

Mesmo sendo uma versão inicial, o projeto apresenta uma base funcional que pode ser expandida futuramente com recursos como busca por matrícula, remoção de funcionários, edição de dados, armazenamento em arquivos, relatórios mais completos e interface gráfica.


## Autora

Desenvolvido por [Geicielly](https://github.com/Geicielly).
