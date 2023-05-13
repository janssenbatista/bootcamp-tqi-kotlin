## Desafio: Idade Planetária

Astrônomos e astrofísicos utilizam diferentes unidades de tempo para medir o tempo em outros planetas. Neste desafio de código, você deverá criar um programa que solicite a idade de uma pessoa em anos terrestres e calcule a idade equivalente em outros planetas. Para isso, considere as seguintes informações:

- **Marte:** 1 ano marciano dura aproximadamente **1,88 anos terrestres;**
- **Venus:** 1 ano venusiano dura aproximadamente **0,62 anos terrestres;**
- **Jupiter:** 1 ano jupiteriano dura aproximadamente **11,86 anos terrestres**.

## Entrada

1. Solicitação da idade em anos terrestres através da entrada de dados do usuário;
2. Solicitação do planeta desejado (Marte, Venus ou Jupiter) através da entrada de dados do usuário.

O usuário deve fornecer sua idade em anos terrestres e o planeta para o qual deseja converter a idade.

## Saída

1. Exibição da idade equivalente em anos planetários de acordo com o planeta escolhido pelo usuário.

A saída deve ser apresentada em uma mensagem na tela, informando a idade equivalente em anos planetários para o planeta escolhido, com duas casas decimais após a vírgula. Se o planeta informado pelo usuário não for um dos três planetas mencionados acima, a mensagem "Planeta invalido." deve ser exibida.

## Exemplos

Para ajudar a testar seu programa, a tabela abaixo apresenta alguns exemplos de dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| **Entrada** | **Saída**                               |
| ----------- | --------------------------------------- |
| 30 Jupiter  | Idade equivalente em Jupiter: 2,53 anos |
| 27 Venus    | Idade equivalente em Venus: 43,55 anos  |
| 50 Marte    | Idade equivalente em Marte: 26,60 anos  |
| 80 Urano    | Planeta invalido.                       |