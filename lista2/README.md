## Lista II

### Exercício 0 - Cálculo Conta Telefônica
>Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de telefone. Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.
>
>Exemplos:
>| **Entrada** | **Saída**               |
>|-------------|-------------------------|
>| 22          | Valor a pagar: R$ 50.00 |
>
>| **Entrada** | **Saída**               |
>|-------------|-------------------------|
>| 103         | Valor a pagar: R$ 56.00 |

### Exercício 0.1 - Dia Da Semana
>Fazer um programa para ler um valor inteiro de 1 a 7 representado um dia da semana (sendo 1= domingo, 2=segunda, e assim por diante). Escrever na tela o dia da semana correspondente, conforme exemplos. 
>
>Exemplos:
>| **Entrada** | **Saída**              |
>|-------------|------------------------|
>| 1           | Dia da semana: Domingo |
>
>| **Entrada** | **Saída**                   |
>|-------------|-----------------------------|
>| 4           | Dia da semana: Quarta-feira |
>
>| **Entrada** | **Saída**                     |
>|-------------|-------------------------------|
>| 9           | Dia da semana: Valor inválido |

### Exercício 0.2 - Desconto
>Crie um programa em Java que calcule o desconto aplicado a um produto com base em seu preço.
>
>O programa deve:
> ```
>a) Solicitar ao usuário que digite o preço do produto.
>b) Aplicar um desconto de acordo com as seguintes regras:
>c) Se o preço for menor que R$ 20,00, o desconto será de 10% do preço.
>d) Se o preço for igual ou maior que R$ 20,00, o desconto será de 5% do preço.
>e) Calcular o preço final do produto subtraindo o desconto do preço original.
>f) Exibir o valor do desconto e o preço final com duas casas decimais.
> ```
> 
>Exemplos:
>| **Entrada** | **Saída**             |
>|-------------|-----------------------|
>| 15.0        |   Desconto: R$ 1.50   |
>|             | Preço final: R$ 13.50 |
>
>| **Entrada** | **Saída**             |
>|-------------|-----------------------|
>| 30.0        |   Desconto: R$ 1.50   |
>|             | Preço final: R$ 28.50 |

### Exercício 1 - Positivo Ou Negativo
>Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
>
>Exemplos:
>| **Entrada** | **Saída** |
>|-------------|-----------|
>| -10         |  Negativo |
>
>| **Entrada** | **Saída** |
>|-------------|-----------|
>| 8           |  Positivo |
>
>| **Entrada** | **Saída** |
>|-------------|-----------|
>| 0           |   Neutro  |

### Exercício 2 - Impar Ou Par
>Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
>
>Exemplos: 
>| **Entrada** | **Saída** |
>|-------------|-----------|
>| 12          |    Par    |
>
>| **Entrada** | **Saída** |
>|-------------|-----------|
>| -27         |   Impar   |
>
>| **Entrada** | **Saída** |
>|-------------|-----------|
>| 0           |    Par    |

### Exercício 3 - Múltiplos
>Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
>
>Exemplos:
>| **Entrada** | **Saída**     |
>|-------------|---------------|
>| 6  24       | São múltiplos |
>
>| **Entrada** | **Saída**         |
>|-------------|-------------------|
>| 6  25       | Não são múltiplos |
>
>| **Entrada** | **Saída**     |
>|-------------|---------------|
>| 24  6       | São múltiplos |

### Exercício 4 - Duração Jogo
>Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
>
>Exemplos: 
>| **Entrada** | **Saída**               |
>|-------------|-------------------------|
>| 16   2      | O jogo durou 10 hora(s) |
>
>| **Entrada** | **Saída**               |
>|-------------|-------------------------|
>| 0   0       | O jogo durou 24 hora(s) |
>
>| **Entrada** | **Saída**               |
>|-------------|-------------------------|
>| 2   16      | O jogo durou 14 hora(s) |

### Exercício 5 - Cardápio
>Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
>| **Código** | **Especificação** | **Preço** |
>|------------|-------------------|-----------|
>| 1          | Cachorro Quente   | R$ 4.00   |
>| 2          | X-Salada          | R$ 4.50   |
>| 3          | X-Bacon           | R$ 5.00   |
>| 4          | Torrada Simples   | R$ 2.00   |
>| 5          | Refrigerante      | R$ 1.50   |
>
>Exemplos:
>| **Entrada** | **Saída**       |
>|-------------|-----------------|
>| 3   2       | Total: R$ 10.00 |
>
>| **Entrada** | **Saída**       |
>|-------------|-----------------|
>| 2   3       | Total: R$ 13.50 |

### Exercício 6 – Intervalo Valor
>Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
>
>Exemplos:
>| **Entrada** | **Saída**           |
>|-------------|---------------------|
>| 25.01       | Intervalo [25 a 50] |
>
>| **Entrada** | **Saída**          |
>|-------------|--------------------|
>| 25.00       | Intervalo [0 a 25] |
>
>| **Entrada** | **Saída**            |
>|-------------|----------------------|
>| 100.00      | Intervalo [75 a 100] |
>
>| **Entrada** | **Saída**         |
>|-------------|-------------------|
>| -25.02      | Fora do intervalo |

### Exercício 7 - Plano Cartesiano
>Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
><br>Se o ponto estiver na origem, escreva a mensagem “Origem”.
><br>Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.
>
>Exemplos:
>| **Entrada** | **Saída** |
>|-------------|-----------|
>| 4.5   -2.2  | Q4        |
>
>| **Entrada** | **Saída** |
>|-------------|-----------|
>| 0.1   0.1   | Q1        |
>
>| **Entrada** | **Saída** |
>|-------------|-----------|
>| 0.0   0.0   | Origem    |

### Exercício 8 - Cálculo Imposto
>Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
><br>Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
>
>| **Renda**                    | **Imposto de Renda** |
>|------------------------------|----------------------|
>| de 0.00 a R$ 2000.00         | Isento               |
>| de R$ 2000.01 até R$ 3000.00 | 8%                   |
>| de R$ 3000.01 até R$ 4500.00       | 18%                  |
>| acima de R$ 4500.00          | 28%                  |
>
>Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
duas casas decimais.
>
>Exemplos:
>| **Entrada** | **Saída** |
>|-------------|-----------|
>| 3002.00     | R$ 80.36  |
>
>| **Entrada** | **Saída** |
>|-------------|-----------|
>| 1701.12     | Isento    |
>
>| **Entrada** | **Saída** |
>|-------------|-----------|
>| 4520.00     | R$ 355.60 |


