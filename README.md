# Exercício 5 — Máximo Divisor Comum (MDC) Recursivo

O máximo divisor comum (MDC ou M.D.C) corresponde ao produto dos divisores comuns entre dois ou mais números inteiros.

Para calcular o máximo divisor comum (MDC) entre números, devemos realizar a fatoração por meio da decomposição em fatores primos dos números indicados.

O máximo divisor comum (MDC) de dois números inteiros x e y pode ser calculado usando-se uma definição recursiva:

- MDC(x, y) = MDC(x − y, y), se x > y  
- MDC(x, y) = MDC(y, x)  
- MDC(x, x) = x  

Fazer uma função recursiva que receba dois números inteiros positivos e apresente o MDC desses números.
