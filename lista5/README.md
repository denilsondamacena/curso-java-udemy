## Lista V

### Exercício 1 - Maior Área Triângulo
>Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui a maior área.
>
>A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a seguinte (fórmula de Heron):
>
>área = √p(p-a)(p-b)(p-c) onde p = (a+b+c)/2
>
>Exemplos:
>| Entre com as medidas do triângulo X: |  3.00  |
>|--------------------------------------|:------:|
>|                                      |  4.00  |
>|                                      |  5.00  |
>| Entre com as medidas do triângulo Y: |  7.50  |
>|                                      |  4.50  |
>|                                      |  4.02  |
>| Triângulo X área:                    | 6.0000 |
>| Triângulo Y área:                    | 7.5638 |
>| Maior área:                          |    Y   |


### Exercício 2 - Estoque
>Fazer um programa para ler os dados de um produto em estoque (nome, preço e quantidade no estoque). Em seguida:
> ```
>a) Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque).
>b) Realizar uma entrada no estoque e mostrar novamente os dados do produto.
>c) Realizar uma saída no estoque e mostrar novamente os dados do produto.
> ```
>
>Para resolver este problema, você deve criar uma CLASSE conforme projeto abaixo:
>| Produto                              |  3.00  |
>|--------------------------------------|:------:|
>| - Nome:                              | string |
>| - Preço:                             | double |
>| - Quantidade                         |   int  |
>|                                      |        |
>| + ValorTotalEstoque():               | double |
>| + AdicionarProduto(quantidade: int): |  void  |
>| + RemoverProduto(quantidade: int):   |  void  |
>
>Exemplo
>| Entre com os dados do produto:                                        |        |
>|-----------------------------------------------------------------------|:------:|
>| Nome:                                                                 |   TV   |
>| Preço:                                                                | 900.00 |
>| Quantidade no estoque:                                                |   10   |
>|                                                                       |        |
>| Dados do produto: TV, R$ 900.00, 10 unidades, Total: R$ 9000.00       |        |
>| Entre com a quantidade de produtos para adicionar no estoque:         |    5   |
>| Atualização dos dados: TV, R$ 900.00, 15 unidades, Total: R$ 13500.00 |        |
>| Entre com a quantidade de produtos para remover do estoque:           |    3   |
>| Atualização do dados: TV, R$ 900.00, 12 unidades, Total: R$ 10800.00  |        |

### Exercício 3 - Medidas Retângulo
>Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal. Usar uma classe como mostrado no projeto abaixo:
>| Rectangle      |        |
>|----------------|:------:|
>| - Width:       | double |
>| - Height:      | double |
>|                |        |
>| + Area():      | double |
>| + Perimeter(): | double |
>| + Diagonal():  | double |
>
>Exemplo:
>| Digite a largura do retângulo: |  3.00 |
>|--------------------------------|:-----:|
>| Digite a altura do retângulo:  |  4.00 |
>|                                |       |
>| Área:                          | 12.00 |
>| Perímetro:                     | 14.00 |
>| Diagonal:                      |  5.00 |

### Exercício 4 - Salário Líquido 
>Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe projetada abaixo:
>
>|Employees                             |        |
>|---------------------------------------|:------:|
>| - Name:                               | string |
>| - GrossSalary:                        | double |
>| - Tax:                                | double |
>|                                       |        |
>| + NetSalary():                        | double |
>| + IncreaseSalary(percentage: double): | void   |
>
>Exemplo:
>|Nome:                                     |       João Silva       |
>|-------------------------------------------|:----------------------:|
>| Salário Bruto:                            |         6000.00        |
>| Imposto:                                  |         1000.00        |
>|                                           |                        |
>| Funcionário:                              | João Silva, R$ 5000.00 |
>| Qual a porcentagem de aumento no salário? |          10.0          |
>| Dados atualizados:                        | João Silva, R$ 5600.00 |

### Exercício 5 - Cálculo Média
>Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para resolver este problema.
>
>Exemplos:
>| Entrada                          |                   |
>|----------------------------------|:-----------------:|
>| Nome do aluno:                   |     Alex Green    |
>| Digite a primeira nota do aluno: |       27.00       |
>| Digite a segunda nota do aluno:  |       31.00       |
>| Digite a terceira nota do aluno: |       32.00       |
>|                                  |                   |
>| Saída                            | Nota final= 90.00 |
>|                                  | PASS              |
>
>| Entrada                          |                        |
>|----------------------------------|:----------------------:|
>| Nome do aluno:                   |       Alex Green       |
>| Digite a primeira nota do aluno: |          17.00         |
>| Digite a segunda nota do aluno:  |          20.00         |
>| Digite a terceira nota do aluno: |          15.00         |
>|                                  |                        |
>| Saída                            | Nota final= 52.00      |
>|                                  | FAILED                 |
>|                                  | Necessário 8.00 pontos |


### Exercício 6 - Raio Circunferência
>Fazer um programa para ler um valor numérico qualquer, e daí mostrar quanto seria o valor de uma circunferência e do volume de uma esfera para um raio daquele valor. Informar também o valor de PI com duas casas decimais.
>
>Exemplo:
>| Digite o raio:  |  3.00  |
>|-----------------|:------:|
>| Circunferência: |  18.84 |
>| Volume:         | 113.04 |
>| Valor de PI:    |  3.14  |


### Exercício 7 - Conversor Dólar
>Fazer um programa para ler a cotação de dólar, e depois um valor em dólares a ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a pessoa terá que pagar %6 de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter para ser responsável pelos cálculos.
>
>Exemplo:
>| Qual o valor do dólar?             |  3.10  |
>|------------------------------------|:------:|
>| Quantos dólares você quer comprar? | 200.00 |
>| Valor a ser pago em reais=         | 657.20 |

