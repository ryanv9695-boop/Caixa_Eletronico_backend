# 🏧 Simulador de Caixa Eletrônico (Backend)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)

## 💻 Sobre o Projeto

O projeto do simulador de caixa eletrônico foi estruturado com a intenção de aprendizado sobre o desenvolvimento backend utilizando a linguagem Java. 

A função do sistema é simular as funcionalidades de um caixa eletrônico real, com as principais ações financeiras que ele pode ter. É dentro de uma estrutura de repetição que o núcleo do sistema acontece: a captura de dados inseridos pelo usuário, as operações matemáticas validadas por estruturas condicionais e o retorno visual dos resultados.

Projeto desenvolvido para aplicação prática de lógica de programação e algoritmos no **Instituto Federal Goiano (IF Goiano) - Campus Urutaí**.

## ⚙️ Funcionalidades Implementadas

- [x] **Consulta de Saldo:** Visualização em tempo real do saldo em conta.
- [x] **Depósito:** Adição de valores ao saldo atual de forma dinâmica.
- [x] **Saque Seguro:** Retirada de valores com validação de regra de negócio (impede que o usuário saque um valor maior do que o saldo disponível).
- [x] **Menu Interativo:** Navegação contínua em terminal até que o usuário escolha explicitamente a opção de saída.

## 📊 Arquitetura e Fluxo

Abaixo está o diagrama lógico (fluxograma) que mapeia todas as decisões e laços do sistema:

![Fluxograma do Sistema](fluxograma.png)

## 🛠️ Tecnologias e Estruturas Utilizadas

- **Linguagem:** Java
- **Captura de Dados:** `Scanner` (utilizando tipos `int` e `double`)
- **Controle de Fluxo:** `switch/case` para o menu, e `if/else` para validação de saldo.
- **Laços de Repetição:** `do-while` para manter o sistema ativo, e `for` para a rotina de encerramento.

## 🚀 Como Executar o Projeto

1. Clone este repositório na sua máquina local:
   ```bash
   git clone [https://github.com/ryanv9695-boop/caixa_elentronico_Backend.git](https://github.com/ryanv9695-boop/caixa_elentronico_Backend.git)
