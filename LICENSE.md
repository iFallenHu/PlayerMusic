# Projeto Player de Música

## Descrição
Este é um projeto de um player de música desenvolvido no IntelliJ. O projeto consiste em uma superclasse `Audio` que representa arquivos de áudio genéricos, com classes `Podcast` e `Musica` que herdam dela. Além disso, há uma classe `MinhasPreferidas` para exemplificar o uso de polimorfismo.

## Estrutura do Projeto
O projeto está organizado da seguinte forma:
- **src**: Contém o código-fonte do projeto.
  - `Audio.java`: A superclasse que representa arquivos de áudio.
  - `Podcast.java`: Classe que representa arquivos de podcast, herda de `Audio`.
  - `Musica.java`: Classe que representa arquivos de música, herda de `Audio`.
  - `MinhasPreferidas.java`: Classe que demonstra o uso de polimorfismo com objetos do tipo `Audio`.
- **out**: Contém os arquivos compilados.
- **.idea**: Configurações do projeto para o IntelliJ.

## Instruções de Uso
Para utilizar o projeto, siga estas etapas:
1. Clone este repositório em sua máquina local.
2. Abra o IntelliJ IDEA.
3. Importe o projeto para o IntelliJ.
4. Explore as classes `Podcast`, `Musica`, `Audio` e `MinhasPreferidas` para entender a estrutura do código.
5. Execute o código para ver o funcionamento do player de música e como o polimorfismo é aplicado na classe `MinhasPreferidas`.

## Contribuindo
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues para reportar bugs, sugerir melhorias ou enviar pull requests com novos recursos.

## Licença
Este projeto é distribuído sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
