# Aplicação de Player de Música

---

## Descrição

Este projeto consiste em uma aplicação de player de música, onde a superclasse principal é denominada `Audio`, e possui duas subclasses: `Podcast` e `Musica`. Além disso, foi implementada uma classe chamada `MinhasPreferidas` para gerenciar a questão do polimorfismo.

A classe `Audio` é a classe base para todos os tipos de áudio na aplicação. A partir dela, são derivadas as classes `Podcast` e `Musica`, que representam respectivamente podcasts e músicas. A classe `MinhasPreferidas` permite ao usuário gerenciar e organizar suas músicas e podcasts favoritos de forma eficiente, aproveitando o conceito de polimorfismo para tratar diferentes tipos de áudios de forma uniforme.

## Funcionalidades

- **Reprodução de Áudio:** A aplicação permite reproduzir tanto músicas quanto podcasts.
- **Adicionar aos Favoritos:** Os usuários podem adicionar músicas e podcasts à lista de favoritos utilizando a classe `MinhasPreferidas`.
- **Organização Personalizada:** A classe `MinhasPreferidas` oferece funcionalidades para organizar e gerenciar a lista de favoritos de acordo com as preferências do usuário.
- **Polimorfismo:** O polimorfismo é utilizado para tratar objetos `Podcast` e `Musica` de forma uniforme na classe `MinhasPreferidas`, simplificando o código e tornando-o mais flexível.

## Estrutura do Projeto

- **Audio.java:** Contém a definição da classe `Audio`, que é a superclasse para `Podcast` e `Musica`.
- **Podcast.java:** Define a classe `Podcast`, que herda de `Audio` e representa um podcast.
- **Musica.java:** Define a classe `Musica`, que herda de `Audio` e representa uma música.
- **MinhasPreferidas.java:** Implementa a classe `MinhasPreferidas`, responsável por gerenciar a lista de favoritos e aplicar o polimorfismo.

## Como Usar

1. Clone o repositório do projeto.
2. Certifique-se de ter o JDK (Java Development Kit) instalado em sua máquina.
3. Compile o código Java utilizando o seguinte comando no terminal:
```bash
javac Main.java
````

## Contribuindo
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues para reportar bugs, sugerir melhorias ou enviar pull requests com novos recursos.

## Licença
Este projeto é distribuído sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.



