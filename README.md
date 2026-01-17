# Exercícios de Lógica de Programação - ADS IFPR 2023

Este repositório contém uma série de exercícios acadêmicos desenvolvidos para a disciplina de **Lógica de Programação** do curso de ADS no IFPR

> **Observação:** Conforme exigência do professor, todos os exercícios foram implementados em um **único arquivo Java**, utilizando métodos e funções para organizar o arquivo.

---

## 🧠 Problemas Implementados

O sistema apresenta um menu intuitivo que permite ao usuário escolher entre as seguintes lógicas:

### 1. Primos no Intervalo
Calcula a densidade de números primos em um determinado intervalo.
* **Entrada:** Recebe dois números inteiros positivos
* **Saída:** Retorna a quantidade total de números primos encontrados entre os dois numeros
* **Exemplo:** Intervalo `[10, 30]` → Retorno: `6`.

### 2. Verificador de Ordenação
Analisa o comportamento de uma sequência numérica informada pelo usuário.
* **Entrada:** Solicita uma quantidade mínima de 3 números e lê os valores individualmente.
* **Saídas possíveis:**
    * `Todos os números são iguais`
    * `Ordem Crescente`
    * `Ordem Decrescente`
    * `Sem Ordem`
* **Exemplo:** `1, 2, 3, 4` → Crescente | `5, 4, 3, 2` → Decrescente.

### 3. Números Perfeitos
Identifica números cuja soma de seus divisores próprios é igual ao próprio número.
* **Entrada:** Analisa um intervalo definido pelo usuário.
* **Saída:** Exibe a quantidade de números perfeitos e a lista de quais são esses números.
* **Conceito:** $6$ é perfeito pois $1 + 2 + 3 = 6$.

### 4. Pirâmide Visual
Gera uma estrutura geométrica numérica no console.
* **Entrada:** Solicita um número inteiro positivo para definir a altura.
* **Saída:** Utiliza underlines (`_`) para preenchimento e centralização, criando um efeito de espelhamento.
* **Exemplo de saída:**
    ```text
    +___________________+
    +________ 1 ________+
    +_______ 1 2 _______+
    +______ 1 2 3 ______+
    +_____ 1 2 3 4 _____+
    +____ 1 2 3 4 5 ____+
    +___ 1 2 3 4 5 6 ___+
    +__ 1 2 3 4 5 6 7 __+
    +_ 1 2 3 4 5 6 7 8 _+
    ```

### 5. Primos Perfeitos (Soma de Primos)
Uma variação lógica que verifica a propriedade de soma de um número primo.
* **Entrada:** O usuário insere um número primo (diferente de 1).
* **Regra:** O programa verifica se o número é igual à soma de todos os números primos menores que ele.
* **Saída:** Se confirmado, o sistema lista todos os primos utilizados na soma.

