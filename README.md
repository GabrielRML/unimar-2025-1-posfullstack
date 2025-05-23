# Clean Code, Design Patterns e Qualidade de Software

Este repositório documenta uma jornada prática por **Clean Code**, **Design Patterns** e **Qualidade de Software**, com implementações reais em Java e Spring Boot. O conteúdo foi desenvolvido para aproximar a teoria da prática real de desenvolvimento. Adicionalmente, utilizamos ferramentas de IA de forma consciente durante todo o curso para amplificar o aprendizado, sem substituir o pensamento crítico e a compreensão fundamental dos conceitos.

## Sobre o Professor

Doutor em Engenharia de Software pelo ICMC-USP, Venilton atua há mais de 15 anos na arquitetura e desenvolvimento de sistemas. Hoje lidera o time de Educação da DIO, conduzindo iniciativas que integram prática de mercado, pesquisa acadêmica e Inteligência Artificial para elevar de forma contínua o padrão de qualidade e confiabilidade das soluções da EdTech.

## Estrutura da Disciplina

### [📅 Dia 1 - Clean Code, Design Patterns e TDD](wiki/dia-1.md)
- **Clean Code**: Princípios fundamentais com exemplos práticos.
- **Design Patterns**: Classificados em Criacionais, Estruturais e Comportamentais, vimos Singleton, Adapter e Strategy em ação.
- **TDD**: Ciclo _Red-Green-Refactor_ com JUnit.
- **Projeto Prático (pasta `day1-design-patterns`)**: Exercitamos a ideia de _Red-Green-Refactor_ com TDD para implementar nossa `Calculator`, além de implemetar casos reais para Singleton, Adapter e Strategy.

> [!IMPORTANT]
> **Trabalho Dia 1:** Com base nos conceitos estudados sobre Clean Code, Design Patterns e Qualidade de Software, implemente um ou mais padrões de projeto na linguagem e IDE de sua preferência.
> Sua entrega deve incluir pelo menos um teste unitário, validando o comportamento da solução implementada.
> 
> **Formulário de Submissão (até 25/05):** [https://forms.gle/jwCC5WB4WXVZWrwv9](https://forms.gle/jwCC5WB4WXVZWrwv9)

### [📅 Dia 2 - Clean Architecture, APIs e LLMs](wiki/dia-2.md)
- **Clean Architecture**: Aplicada com simplicidade e produtividade
- **API RESTful**: Tutor IA com Spring Boot
- **Integração**: OpenAI e Anthropic com troca dinâmica
- **Projeto Prático (pasta `day2-clean-architecture`)**: API REST para criação de um Tutor IA com foco nos conceitos aprendidos nesta disciplina.

> [!IMPORTANT]
> **Trabalho Final:**
> Com base na API que desenvolvemos, implemente um projeto completo na linguagem e IDE de sua preferência. Sua entrega deve incluir a implementação de uma solução a sua escolha seguindo os principais conceitos apresentados nesta disciplina: Clean Code, Design Patterns, Qualidade de Software, Clean Architecture, APIs e LLMs. O domínio e escopo do projeto fica a sua escolha, seja criativo(a)!
>
> **Formulário de Submissão (até 07/06):** TOFO

## Como Usar Este Repositório

```bash
# Clone o repositório
git clone https://github.com/falvojr-classes/unimar-2025-1-posfullstack

# Navegue pelos projetos
cd day1-design-patterns     # Projeto do Dia 1 - Clean Code, Design Patterns e TDD
cd day2-clean-architecture  # Projeto do Dia 2 - Clean Architecture, APIs e LLMs
```

## Aprendizados Principais

1. **Simplicidade é Sofisticação** - Clean code não é sobre complexidade, é sobre clareza e simplicidade!
2. **Padrões com Propósito** - Use design patterns para resolver problemas reais!
3. **Teste Primeiro, Código Depois** - TDD melhora o design naturalmente!
4. **Arquitetura Evolutiva** - Clean Architecture sem _overengineering_!

### Citações Para Refletir

> _"Clean code always looks like it was written by someone who cares."_  
> — Michael Feathers (Autor de "Working Effectively with Legacy Code")

> _"First make it work, then make it right, then make it fast."_  
> — Kent Beck (Criador do TDD e Extreme Programming)

> _"Programs must be written for people to read, and only incidentally for machines to execute."_  
> — Harold Abelson (Co-autor de "Structure and Interpretation of Computer Programs")

> _"Premature optimization is the root of all evil."_  
> — Donald E. Knuth (Autor de "The Art of Computer Programming")

> _"Every time you write a comment, you have failed to express yourself in code."_  
> — Robert C. Martin (Autor de "Clean Code" e "Clean Architecture")

## Referências

### Documentação Oficial
- [Spring Boot Reference Documentation](https://docs.spring.io/spring-boot/)
- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)

### Literatura Essencial
- **"Código Limpo" (Clean Code)**, Robert C. Martin - [Alta Books](https://altabooks.com.br/produto/codigo-limpo/)
- **"Arquitetura Limpa" (Clean Architecture)**, Robert C. Martin - [Alta Books](https://altabooks.com.br/produto/arquitetura-limpa/)
- **"Refatoração" (Refactoring)**, Martin Fowler - [Novatec](https://novatec.com.br/livros/refatoracao/)
- **"Test-Driven Development: By Example"**, Kent Beck - O'Reilly Media

### Recursos Online
- [Catálogo de Design Patterns](https://refactoring.guru/pt-br/design-patterns/catalog) - Refactoring.Guru
- [Clean Code JavaScript](https://github.com/ryanmcdermott/clean-code-javascript) - Exemplos práticos
