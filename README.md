## Desafio Java Básico - Iphone

## Autores
- [Flávia Soares](https://github.com/Flaviasp1603)

Repositório criado para resolução de um Desafio DIO- Bootcamp Santander 2024 - Backend com Java, onde contempla a Modelagem e Diagramação em representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

## Ferramentas e tecnologias

![GitHub](https://img.shields.io/badge/GitHub-000?style=for-the-badge&logo=github&logoColor=30A3DC)
![Git](https://img.shields.io/badge/Git-000?style=for-the-badge&logo=git&logoColor=E94D5F)
![Java](https://img.shields.io/badge/Java-000?style=for-the-badge&logo=openjdk&logoColor=ED8B00) 

## Diagrama UML

O diagrama UML foi criado utilizando a sintaxe [Mermaid](https://mermaid.js.org/), uma alternativa de código aberto e compatível com arquivos Markdown.

```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()          
        +pausar()         
        +selecionarMusica(musica: String)
    }

    class AparelhoTelefonico {
        +ligar(numero: String)
        +atender()              
        +iniciarCorreioVoz() 
    }

    class NavegadorInternet {
        +exibirPagina(url: String)      
        +adicionarNovaAba()             
        +atualizarPagina()
    }

    class Iphone {
    }

    Iphone --> ReprodutorMusical
    Iphone --> AparelhoTelefonico
    Iphone --> NavegadorInternet

    class SistemaOperacional {
    }

    SistemaOperacional --> Iphone
```
