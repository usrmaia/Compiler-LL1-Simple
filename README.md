# Compiler-LL1-Simple

## Executando:
Para executar o programa:

1. python3 main.py program.mjava

Para compilar o programa:

2. python3 -m PyInstaller --name="MJava" --icon="./MJava.ico" --onefile main.py

Desse modo o programa pode ser executado assim:

3. ./MJava program.mjava
## Sobre o MJava
A Mjava é um subconjunto da linguagem Java. Como é um subconjunto, todo programa MJava é um programa Java válido que pode ser executado pela JVM.

Além disso, Mjava restringe a linguagem Java para ter apenas inteiros, booleanos,
vetores de inteiros e classes, removendo interfaces, números de ponto flutuante, classes abstratas, strings, vetores de outros tipos, etc. Também não há sobrecarga de métodos, ou métodos estáticos, exceto pelo método main da classe principal do programa. O comando System.out.println de MJava só pode imprimir números.

Um programa MJava está restrito a um único arquivo-fonte, não existe o conceito de pacote.