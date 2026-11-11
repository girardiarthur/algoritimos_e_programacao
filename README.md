# algoritimos_e_programacao
aulas e projetos de algoritimos e programação 1 da materia de ads

LISTA DE EXERCÍCIOS — JAVA
================================

PARTE 1 — VETORES, MÉTODOS E RANDOM

EXERCÍCIO 1 — SOMA DOS ELEMENTOS DE UM VETOR

Observe o código:

int[] valores = {2, 4, 6};
int soma = 0;

for (int i = 0; i < valores.length; i++) {
    soma += valores[i];
}

System.out.println(soma);

Pergunta: Qual será o resultado impresso?


EXERCÍCIO 2 — ALTERAÇÃO DE UMA POSIÇÃO DO VETOR

Analise o código:

int[] numeros = {5, 8, 3};
numeros[2] = numeros[0] + numeros[1];
System.out.println(numeros[2]);

Pergunta: Qual número será impresso?


EXERCÍCIO 3 — PERCORRER UM VETOR A PARTIR DO ÍNDICE 1

Considere o código:

int[] valores = {6, 12, 18, 24};

for (int i = 1; i < valores.length; i++) {
    System.out.println(valores[i]);
}

Pergunta: Qual sequência será impressa?


EXERCÍCIO 4 — SUBTRAÇÃO ENTRE VETORES

Dois vetores são declarados e um terceiro recebe a subtração de seus elementos correspondentes:

int[] A = {14, 9, 6};
int[] B = {5, 12, 2};
int[] C = new int[3];

for (int i = 0; i < A.length; i++) {
    C[i] = A[i] - B[i];
}

Pergunta: Qual será o conteúdo final de C?


EXERCÍCIO 5 — MÉTODO VOID COM PARÂMETRO

Observe o método e sua chamada:

public static void apresentar(String nome) {
    System.out.println("Olá, " + nome);
}

// Dentro do main:
apresentar("Lia");

Pergunta: O que será exibido na tela?


EXERCÍCIO 6 — MÉTODO COM RETORNO

Analise o método:

public static double calcularAreaTriangulo(double base, double altura) {
    return (base * altura) / 2;
}

// Chamada:
System.out.println(calcularAreaTriangulo(5.0, 3.0));

Pergunta: Qual será o resultado?


EXERCÍCIO 7 — ORDEM DE EXECUÇÃO DOS MÉTODOS

Observe o código:

public static void main(String[] args) {
    System.out.println("Início");
    mostrar();
    System.out.println("Fim");
}

public static void mostrar() {
    System.out.println("Executando método");
}

Pergunta: Qual será a ordem das mensagens impressas?


EXERCÍCIO 8 — RANDOM E NEXTDOUBLE

Considere a expressão:

double valor = 4 + random.nextDouble() * 6;

Sabendo que nextDouble() gera um decimal de 0 (incluído) até 1 (não incluído), qual intervalo essa expressão produz?


EXERCÍCIO 9 — MAIOR, MENOR E MÉDIA

Uma função deve receber um vetor de inteiros, encontrar seu maior e menor elemento e retornar a média entre esses dois extremos:

int[] numeros = {4, 12, 8, 20};

Pergunta: Qual resultado a função deve retornar?


EXERCÍCIO 10 — CORREÇÃO DE FATORIAL

Um programa deveria calcular o fatorial de 5, mas apresenta o seguinte código:

int numero = 5;
long fatorial = 1;

for (int i = 1; i < numero; i++) {
    fatorial *= i;
}

Pergunta: Qual alteração no laço permite calcular corretamente 5!?


PARTE 2 — EXERCÍCIOS PRÁTICOS

EXERCÍCIO 11 — LER E EXIBIR UM VETOR

Faça um programa que:
1. Crie um vetor de inteiros com 5 posições.
2. Leia 5 números digitados pelo usuário.
3. Percorra o vetor com um for.
4. Exiba todos os números armazenados.


EXERCÍCIO 12 — EXIBIR UM VETOR AO CONTRÁRIO

Faça um programa que leia 5 números em um vetor e depois exiba os valores na ordem inversa, começando pela última posição.


EXERCÍCIO 13 — CONTAR NÚMEROS PARES

Faça um programa que leia 10 números em um vetor e conte quantos deles são pares. Ao final, mostre a quantidade encontrada.


EXERCÍCIO 14 — MÉTODO DE SOMA

Crie um método chamado somar que receba dois números inteiros como parâmetros e retorne a soma deles. No main, chame o método e mostre o resultado.


EXERCÍCIO 15 — MÉTODO VOID DE SAUDAÇÃO

Crie um método chamado apresentar que receba um nome como parâmetro e exiba a mensagem:

Olá, [nome]!

O método não deve retornar nenhum valor.


EXERCÍCIO 16 — ENCONTRAR O MAIOR VALOR

Faça um programa que leia 5 números em um vetor e encontre o maior valor armazenado. Exiba o resultado ao final.


EXERCÍCIO 17 — CALCULAR A MÉDIA

Faça um programa que leia 10 valores informados pelo usuário, armazene-os em um vetor, calcule e exiba os números informados e, por fim, mostre a média aritmética desses valores.


EXERCÍCIO 18 — FATORIAL

Faça um programa que leia um número inteiro e calcule seu fatorial usando um laço for. Considere que o fatorial de 0 é 1.

Exemplo:
5! = 5 × 4 × 3 × 2 × 1 = 120


EXERCÍCIO 19 — SOMA DOS ELEMENTOS DE UM VETOR

Crie um vetor com 5 números inteiros. Percorra o vetor usando for e calcule a soma de todos os elementos. Exiba a soma.


EXERCÍCIO 20 — MAIOR E MENOR ELEMENTO

Faça um programa que leia 5 números inteiros em um vetor e encontre o maior e o menor valor. Depois, calcule e exiba a média entre o maior e o menor.


FIM DA LISTA