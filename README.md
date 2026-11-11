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

GUIA DE ESTUDOS — MÉTODOS (FUNÇÕES) EM JAVA Baseado nos slides: “Métodos
(funções) - Programação de Soluções Computacionais”
============================================================ 1.
MODULARIZAÇÃO
============================================================
Modularização é a técnica de dividir um problema ou programa em partes
menores, chamadas módulos. Cada módulo resolve uma tarefa específica.
Em Java, esses módulos são chamados de MÉTODOS.
O gerenciamento do programa acontece a partir do método principal
(main), que chama os outros métodos quando necessário.
Vantagens: - Evita repetição de código. - Facilita a manutenção. -
Organiza o programa em tarefas menores. - Permite chamar/reutilizar um
método várias vezes. - Facilita localizar e corrigir erros.
Boa prática dos slides: cada método deve realizar uma única tarefa.
Exemplos de métodos que já aparecem no Java: - System.out.println(…):
imprime o conteúdo recebido. - Math.sqrt(…): calcula a raiz quadrada. -
Math.pow(…): eleva um número a uma potência. - main(…): método
principal, onde começa a execução do programa.
============================================================ 2.
ESTRUTURA DE UM MÉTODO
============================================================
Estrutura geral de um método sem retorno:
public static void nomeMetodo(parametros) { // instruções }
Significado: - public: modificador de acesso. - static: permite chamar o
método pela classe, sem criar um objeto. - void: indica que o método não
retorna um valor. - nomeMetodo: nome escolhido para identificar o
método. - (parametros): informações que o método pode receber. São
opcionais em métodos void. - { }: delimitam o corpo do método.
Boas práticas: - Use nomes que indiquem a ação, preferencialmente
verbos: imprimirMensagem, calcularMedia, encontrarMax. - Use nomes
válidos para identificadores Java. - Separe parâmetros por vírgula. Declare o tipo de cada parâmetro.
IMPORTANTE: Os métodos devem ficar dentro da classe, mas fora do corpo
de outros métodos. Por exemplo, declare-os no mesmo nível do main, não
dentro dele.
Exemplo completo:
public class Exemplo { public static void main(String[] args) {
imprimirMensagem(); }
public static void imprimirMensagem() {
System.out.println("Olá!");
}
}
============================================================ 3. CHAMADA,
PARÂMETRO E ARGUMENTO
============================================================
DECLARAÇÃO: public static void apresentarNome(String nome) {
System.out.println(“Olá,” + nome); }
CHAMADA: apresentarNome(“Arthur”);
- Parâmetro: variável declarada na assinatura do método. No exemplo,
String nome.
- Argumento: valor enviado na chamada. No exemplo, “Arthur”.
- Chamada: instrução que executa o método. No exemplo,
apresentarNome(“Arthur”).
O método pode ser chamado várias vezes, com argumentos diferentes:
apresentarNome(“Arthur”); apresentarNome(“Maria”);
apresentarNome(“João”);
============================================================ 4. OS
QUATRO TIPOS DE MÉTODOS
============================================================
Os slides dividem os métodos em quatro combinações: A) Sem parâmetros e sem retorno: public static void mensagem() {
System.out.println(“Olá!”); }
Chamada: mensagem();
B) Com parâmetros e sem retorno: public static void imprimirNome(String
nome) { System.out.println(nome); }
Chamada: imprimirNome(“Arthur”);
C) Sem parâmetros e com retorno: public static int obterNumero() {
return 10; }
Chamada: int numero = obterNumero();
D) Com parâmetros e com retorno: public static int somar(int n1, int
n2) { return n1 + n2; }
Chamada: int resultado = somar(10, 20);
Resumo: - Parâmetros são as informações que entram no método. - Retorno
é o valor que sai do método. - Um método pode ter parâmetros ou não. -
Um método pode retornar um valor ou não.
============================================================ 5. MÉTODOS
SEM RETORNO: void
============================================================
Um método void executa um conjunto de instruções, mas não devolve um
valor ao ponto onde foi chamado.
Exemplo sem parâmetros:
public static void imprimirInformacoes() {
System.out.println(“==============================”);
System.out.println(“Logica de Programacao”);
System.out.println(“Aprendendo a programar”);
System.out.println(“==============================”); }
Uso no main:
public static void main(String[] args) { System.out.println(“Antes de
chamar o metodo”); imprimirInformacoes(); System.out.println(“Depois de chamar o metodo”); }
Fluxo: 1. O main imprime a primeira mensagem. 2. Chama
imprimirInformacoes(). 3. O programa executa as instruções do método. 4.
Ao terminar, volta para o ponto depois da chamada. 5. O main imprime a
última mensagem.
Exemplo com parâmetro:
public static void imprimirInformacoes(String mensagem) {
System.out.println(“Logica de Programacao”);
System.out.println(“Aprendendo a programar”);
System.out.println(mensagem); }
Chamada: imprimirInformacoes(“Like a hacker”);
O texto enviado na chamada é recebido pelo parâmetro String mensagem.
============================================================ 6. MÉTODOS
COM RETORNO: return
============================================================
Um método com retorno executa instruções e devolve um valor para quem o
chamou.
Estrutura:
public static tipoRetorno nomeMetodo(parametros) { // instruções return
valor; }
O tipo de retorno aparece antes do nome do método.
Exemplos de tipos: - int: número inteiro. - double: número decimal. -
float: número decimal (normalmente escrito com sufixo f em literais,
como 2.5f). - boolean: true ou false. - String: texto.
O valor retornado deve ser compatível com o tipo declarado.
Exemplo:
public static int somar(int n1, int n2) { return n1 + n2; }
Uso: public static void main(String[] args) { int valorRetornado;
valorRetornado = somar(10, 50); System.out.println(“Soma:” +
valorRetornado); }
Passos: 1. O main chama somar(10, 50). 2. n1 recebe 10 e n2 recebe 50.
3. O método calcula n1 + n2. 4. return devolve 60. 5. O valor é guardado
em valorRetornado. 6. O main pode imprimir ou usar esse valor.
Diferença essencial: - void: não devolve um valor. - return: devolve um
valor compatível com o tipo declarado. - Um método com retorno pode ter
parâmetros ou não. - Um método void também pode ter parâmetros.
ATENÇÃO: Um método declarado como int, double, boolean ou String precisa
retornar um valor em todos os caminhos possíveis de execução. Não basta
imprimir o resultado: é necessário usar return.
============================================================ 7. EXEMPLOS
ÚTEIS PARA A PROVA
============================================================
A) Verificar se um número é par:
public static boolean isPar(int numero) { if (numero % 2 == 0) { return
true; } else { return false; } }
O operador % calcula o resto da divisão. Se numero % 2 for 0, o número é
par.
B) Encontrar o maior de dois números:
public static int encontrarMax(int n1, int n2) { if (n1 > n2) { return
n1; } else { return n2; } }
C) Retornar o dia da semana com switch:
public static String exibirDiaSemana(int dia) { switch (dia) { case 1:
return “Domingo”; case 2: return “Segunda-feira”; case 3: return
“Terca-feira”; case 4: return “Quarta-feira”; case 5: return
“Quinta-feira”; case 6: return “Sexta-feira”; case 7: return “Sabado”;
default: return “Dia da semana invalido”; } }
D) Calcular fatorial com for: public static int calcularFatorial(int numero) { int resultado = 1;
for (int i = 1; i <= numero; i++) {
resultado = resultado * i;
}
return resultado;
}
Exemplo: 5! = 5 * 4 * 3 * 2 * 1 = 120. Por definição, 0! = 1. O método
acima também retorna 1 para numero igual a 0. O fatorial não é definido
para números negativos; valide a entrada antes de chamar o método.
============================================================ 8.
EXERCÍCIOS DOS SLIDES — RESOLVIDOS
============================================================
EXERCÍCIO 1 — Método mensagem()
Enunciado: Faça uma função sem retorno chamada mensagem(). Ela deve
imprimir: “Meu primeiro programa com funcoes”. Chame a função três vezes
dentro do main.
Resolução:
public class Exercicio1 { public static void main(String[] args) {
mensagem(); mensagem(); mensagem(); }
public static void mensagem() {
System.out.println("Meu primeiro programa com funcoes");
}
}
Explicação: - void: não existe valor de retorno. - Não há parâmetros nos
parênteses. - A chamada aparece três vezes no main.
------------------------------------------------------------------------
EXERCÍCIO 2 — Método imprimeNovaMensagem() Enunciado: Crie uma função chamada imprimeNovaMensagem que receba uma
String e imprima: “Meu primeiro programa com funcoes e parametro: ”.
Chame três vezes com valores diferentes.
Resolução:
public class Exercicio2 { public static void main(String[] args) {
imprimeNovaMensagem(“Java”); imprimeNovaMensagem(“Programacao”);
imprimeNovaMensagem(“Metodos”); }
public static void imprimeNovaMensagem(String parametro) {
System.out.println(
"Meu primeiro programa com funcoes e parametro: " + parametro
);
}
}
Explicação: - String parametro é o parâmetro. - “Java”, “Programacao” e
“Metodos” são argumentos. - O método é void porque apenas imprime.
------------------------------------------------------------------------
EXEMPLO DOS SLIDES — Método calcular() sem retorno e com parâmetros
Os slides mostram uma função que recebe dois números e calcula:
((n1 * n2) - (n1 + n2)) / (n1 - n2)
Resolução:
public class ExemploCalculo { public static void main(String[] args) {
System.out.println(“Realizando o calculo com dois numeros”);
calcular(50, 10); System.out.println(“Fim do calculo”); }
public static void calcular(int n1, int n2) {
if (n1 == n2) {
System.out.println("Nao e possivel dividir por zero.");
return;
}
int resultado = ((n1 * n2) - (n1 + n2)) / (n1 - n2);
System.out.println("Resultado da equacao: " + resultado); }
}
Observação: - O método é void e recebe dois parâmetros int. - Foi
incluída uma validação para impedir divisão por zero. - Como os valores
são int, a divisão também é inteira.
------------------------------------------------------------------------
EXERCÍCIO 3 — Método encontrarMax()
Enunciado: Receba dois números inteiros e retorne o maior. No main, leia
os números, chame o método e imprima o valor retornado.
Resolução:
import java.util.Scanner;
public class Exercicio3 { public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
System.out.print("Digite o primeiro numero: ");
int n1 = entrada.nextInt();
System.out.print("Digite o segundo numero: ");
int n2 = entrada.nextInt();
int maior = encontrarMax(n1, n2);
System.out.println("Maior valor: " + maior);
entrada.close();
}
public static int encontrarMax(int n1, int n2) {
if (n1 > n2) {
return n1;
} else {
return n2;
}
} }
Explicação: - int antes do nome indica que o método retorna inteiro. -
Recebe dois parâmetros int. - O resultado é guardado na variável maior.
------------------------------------------------------------------------
EXERCÍCIO 4 — Método isPar()
Enunciado: Receba um inteiro e retorne true se for par ou false se for
ímpar. O programa deve continuar pedindo números e imprimir o resultado
de cada um.
Resolução:
import java.util.Scanner;
public class Exercicio4 { public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
int numero;
do {
System.out.print("Digite um numero (0 para sair): ");
numero = entrada.nextInt();
if (numero != 0) {
if (isPar(numero)) {
System.out.println("Numero par");
} else {
System.out.println("Numero impar");
}
}
} while (numero != 0);
entrada.close();
}
public static boolean isPar(int numero) {
if (numero % 2 == 0) {
return true;
} else { return false;
}
}
}
Explicação: - boolean é o tipo de retorno porque o método devolve true
ou false. - % verifica o resto da divisão. - O do-while repete a leitura
até o usuário digitar 0. - O zero foi usado como opção para encerrar o
programa.
------------------------------------------------------------------------
EXERCÍCIO 5 — Método exibirDiaSemana()
Enunciado: Receba um número de 1 a 7 e retorne uma String com o dia
correspondente. Se estiver fora do intervalo, retorne “Dia da semana
invalido”. Utilize switch.
Resolução:
import java.util.Scanner;
public class Exercicio5 { public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
System.out.print("Digite um numero de 1 a 7: ");
int numero = entrada.nextInt();
String dia = exibirDiaSemana(numero);
System.out.println(dia);
entrada.close();
}
public static String exibirDiaSemana(int numero) {
switch (numero) {
case 1:
return "Domingo";
case 2:
return "Segunda-feira";
case 3: return "Terca-feira";
case 4:
return "Quarta-feira";
case 5:
return "Quinta-feira";
case 6:
return "Sexta-feira";
case 7:
return "Sabado";
default:
return "Dia da semana invalido";
}
}
}
Explicação: - String é o tipo de retorno. - switch compara o valor
recebido. - Cada case retorna o dia correspondente. - default trata os
valores que não correspondem aos cases.
------------------------------------------------------------------------
EXERCÍCIO 6 — Maior, menor e média dos extremos de um vetor
Enunciado: Crie três funções: (a) recebe um vetor de inteiros e retorna
o maior valor; (b) recebe um vetor de inteiros e retorna o menor valor;
(c) recebe um vetor e retorna (max + min) / 2. Use as duas primeiras
funções para fazer a terceira.
Resolução:
public class Exercicio6 { public static void main(String[] args) { int[]
numeros = {8, 3, 15, 2, 10};
int maior = encontrarMaior(numeros);
int menor = encontrarMenor(numeros);
double mediaExtremos = calcularMediaExtremos(numeros);
System.out.println("Maior valor: " + maior);
System.out.println("Menor valor: " + menor);
System.out.println("Media entre maior e menor: " + mediaExtremos);
} public static int encontrarMaior(int[] vetor) {
int maior = vetor[0];
for (int i = 1; i < vetor.length; i++) {
if (vetor[i] > maior) {
maior = vetor[i];
}
}
return maior;
}
public static int encontrarMenor(int[] vetor) {
int menor = vetor[0];
for (int i = 1; i < vetor.length; i++) {
if (vetor[i] < menor) {
menor = vetor[i];
}
}
return menor;
}
public static double calcularMediaExtremos(int[] vetor) {
int max = encontrarMaior(vetor);
int min = encontrarMenor(vetor);
return (max + min) / 2.0;
}
}
Explicação: - int[] representa um vetor de inteiros. - vetor[0] é o
primeiro elemento. - vetor.length informa a quantidade de elementos. - O
for percorre o vetor. - A primeira função procura o maior. - A segunda
procura o menor. - A terceira chama as duas primeiras e calcula a média
entre os extremos. - Foi usado 2.0 para permitir resultado decimal.
Atenção: O enunciado pressupõe que o vetor tenha pelo menos um elemento.
Se o vetor estiver vazio, vetor[0] causará erro. Em uma versão mais
completa, seria necessário validar isso. EXERCÍCIO 7 — Método calcularFatorial()
Enunciado: Receba um inteiro, calcule o fatorial e retorne o resultado.
Teste lendo um número do usuário.
Resolução:
import java.util.Scanner;
public class Exercicio7 { public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
System.out.print("Digite um numero inteiro nao negativo: ");
int numero = entrada.nextInt();
if (numero < 0) {
System.out.println("Nao existe fatorial de numero negativo.");
} else {
int resultado = calcularFatorial(numero);
System.out.println("Fatorial de " + numero + " = " + resultado);
}
entrada.close();
}
public static int calcularFatorial(int numero) {
int resultado = 1;
for (int i = 1; i <= numero; i++) {
resultado = resultado * i;
}
return resultado;
}
}
Explicação: - resultado começa em 1 porque o fatorial é uma
multiplicação. - O for percorre de 1 até o número recebido. - A cada
repetição, multiplica resultado por i. - return devolve o fatorial. -
Para 0, o for não executa e o método retorna 1, pois 0! = 1. - O main impede a entrada de números negativos.
============================================================ 9. ERROS
COMUNS E COMO EVITAR
============================================================
1. Declarar int e não usar return: ERRADO: public static int somar(int
a, int b) { System.out.println(a + b); }
CORRETO: public static int somar(int a, int b) { return a + b; }
2. Tentar guardar o resultado de um método void: Se o método é void,
ele não fornece um valor para atribuir a uma variável.
3. Retornar tipo incompatível: Um método int deve retornar inteiro; um
método String deve retornar texto etc.
4. Confundir declaração e chamada: Declaração: public static void
mensagem() { System.out.println(“Oi”); }
Chamada: mensagem();
5. Declarar um método dentro do main: Em Java, métodos não podem ser
declarados dentro de outros métodos. Declare-os dentro da classe,
mas fora do main.
6. Esquecer que parâmetros têm tipos: Correto: public static int
somar(int a, int b)
Incorreto: public static int somar(a, b)
============================================================ 10. RESUMO
RÁPIDO PARA CONSULTAR NA PROVA
============================================================
MODULARIZAÇÃO: Dividir o programa em partes menores, cada uma com uma
tarefa.
MÉTODO: Bloco de código que executa uma tarefa e pode ser chamado pelo
programa.
VOID: Método sem retorno de valor. RETURN: Devolve um valor para quem chamou o método.
PARÂMETRO: Variável que aparece na declaração do método e recebe
informação.
ARGUMENTO: Valor passado na chamada do método.
TIPOS DE RETORNO: int = inteiro double = decimal float = decimal boolean
= true ou false String = texto void = nenhum valor de retorno
QUATRO COMBINAÇÕES: 1. Sem parâmetros e sem retorno. 2. Com parâmetros e
sem retorno. 3. Sem parâmetros e com retorno. 4. Com parâmetros e com
retorno.
PERGUNTAS PARA IDENTIFICAR UM MÉTODO: 1. Ele recebe alguma informação?
Se sim, quais parâmetros? 2. Ele devolve algum resultado? Se sim, qual
tipo? 3. O que ele faz dentro das chaves? 4. Como deve ser chamado? 5.
Onde o resultado será utilizado?
============================================================ 11. MODELO
PARA TREINAR
============================================================
Complete mentalmente:
public static ______ somar(____ a, ____ b) { return a + b; }
Perguntas: - Qual tipo deve aparecer no lugar do primeiro espaço se a
soma retorna inteiro? - Quais tipos devem aparecer antes de a e b? -
Como chamar esse método passando 5 e 8? - Como guardar o resultado em
uma variável?
Respostas: - Primeiro espaço: int. - Tipos dos parâmetros: int e int. -
Chamada: somar(5, 8). - Armazenamento: int resultado = somar(5, 8);
FIM DO GUIA