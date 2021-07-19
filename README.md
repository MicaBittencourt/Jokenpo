# Jokenpo

<img src= "https://user-images.githubusercontent.com/63079757/125787087-78b4b813-50d9-4680-bba0-b757e3f0418c.jpg" width="250">

### Desafio

Jokenpo é uma brincadeira japonesa, onde dois jogadores escolhem um dentre três possíveis itens: Pedra, Papel ou Tesoura.

O objetivo é fazer um juiz de Jokenpo que dada a jogada dos dois jogadores informa o resultado da partida.

As regras são as seguintes:

- Pedra empata com Pedra e ganha de Tesoura;
- Tesoura empata com Tesoura e ganha de Papel;
- Papel empata com Papel e ganha de Pedra.

### Resolução

- Como o jogo é para apenas 2 jogadores, criei um código java para resolver o desafio, onde o usuário desafia o computador.
- A princípio defini as variáveis a serem utilizadas no desafio.
- Depois fiz uma estrutura condicional switch/case para definir as opções a serem escolhidas pelo usuário e pelo computador.
- Em cada jogada era necessário verificar 3 situações, então utilizei um if encadeado para analisá-las e, assim, resolver o desafio.
- Ao final, o usuário escolhe primeiro a jogada, em seguida o computador joga e é mostrado quem venceu a partida.
