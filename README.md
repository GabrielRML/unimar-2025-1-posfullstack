# Clean Code, Design Patterns e Qualidade de Software

## Sobre o Professor

> [!NOTE]
> Doutor em Engenharia de Software pelo ICMC-USP, Venilton atua há mais de 15 anos na arquitetura e desenvolvimento de sistemas. Hoje lidera o time de Educação da DIO, conduzindo iniciativas que integram prática de mercado, pesquisa acadêmica e Inteligência Artificial para elevar de forma contínua o padrão de qualidade e confiabilidade das soluções da EdTech.

## Sobre a Disciplina

Esta disciplina aborda **Clean Code**, **Design Patterns** e **Qualidade de Software**, com foco nas melhores práticas utilizadas no mercado. O conteúdo é aplicado na linguagem **Java** e no framework **Spring Boot**, aproximando a teoria da prática real de desenvolvimento.

> [!IMPORTANT]
> **Prática Supervisionada e Colaborativa:** Cada conceito será apresentado de forma concisa seguido de implementação prática imediata. Adotaremos programação colaborativa no segundo dia, onde construiremos juntos uma aplicação completa.

> [!TIP]
> **IA Generativa como Ferramenta de Aprendizado:** Utilizaremos ferramentas de IA de forma consciente durante todo o curso para amplificar o aprendizado, sem substituir o pensamento crítico e compreensão fundamental dos conceitos.

---

## Cronograma

### Dia 1 - 10/05/2025 · Fundamentos e Prática (projeto `day1-design-patterns`)

**Abertura e Nivelamento**
- Apresentação e quebra-gelo
- Alinhamento de objetivos e conhecimento prévio
- Introdução à dinâmica do curso

**Conhecendo a Ideia de Clean Code**

> _"Clean code always looks like it was written by someone who cares."_  
> — Michael Feathers (Autor de "Working Effectively with Legacy Code")

- Princípios fundamentais de código limpo
- Demonstração prática: refatoração de código legado

**Design Patterns Essenciais**

> _"First make it work, then make it right, then make it fast."_  
> — Kent Beck (Criador do TDD e Extreme Programming)

- **Criacionais** (Singleton, Factory Method etc)
  - Demonstração: Implementação de Singleton

- **Estruturais** (Adapter, Decorator etc)
  - Demonstração: Implementação de Adapter

- **Comportamentais** (Strategy, Observer etc)
  - Demonstração: Implementação de Strategy

**TDD e Testes Unitários**

> _"Programs must be written for people to read, and only incidentally for machines to execute."_  
> — Harold Abelson (Co-autor de "Structure and Interpretation of Computer Programs")

- Fundamentos do TDD
- Demonstração: Ciclo Red-Green-Refactor com JUnit

**Discussão Arquitetural**

> _"Premature optimization is the root of all evil."_  
> — Donald E. Knuth (Autor de "The Art of Computer Programming")

- Análise de casos reais
- Trade-offs e decisões arquiteturais
- Como Clean Code e padrões resolvem problemas do dia a dia

> [!IMPORTANT]
> **Trabalho Dia 1:** Explore os conceitos estudados no Dia 1 e implemente um ou padrões de projeto na linguagem e IDE que preferir. Além disso, crie ao menos um teste que garanta a fucnionalidade de sua implementação. 
> **ENTREGA ATÉ 24/05 VIA FORM: https://forms.gle/jwCC5WB4WXVZWrwv9**

---

### Dia 2 - 24/05/2025 · Implementação Colaborativa (projeto `day2-clean-architecture`)

**Recapitulação e Setup**
- Revisão dos conceitos do Dia 1
- Esclarecimento de dúvidas
- Preparação do ambiente para programação colaborativa

**Desenvolvimento de API RESTful em Spring Boot**

> _"Any fool can write code that a computer can understand. Good programmers write code that humans can understand."_  
> — Martin Fowler (Autor de "Refactoring" e líder em práticas ágeis)

**Sessão de Programação Colaborativa:**

> [!WARNING]
> **Modo Colaborativo:** Trabalharemos em pares alternados, onde cada participante terá momentos como "driver" (codifica) e "navigator" (orienta). Utilizaremos ferramentas de compartilhamento de tela e desenvolvimento remoto.

1. **Arquitetura da Aplicação**
   - Aplicação dos princípios SOLID
   - Estruturação de camadas (Controller, Service, Repository)
   - Injeção de dependência

2. **Implementação de Funcionalidades**
   - Endpoints RESTful
   - Tratamento de exceções
   - Validações automáticas

3. **Aplicação de Design Patterns**
   - Repository Pattern para persistência
   - Builder Pattern para DTOs
   - Strategy Pattern para regras de negócio

4. **Testes Automatizados**
   - Testes unitários com JUnit
   - Testes de integração
   - Cobertura de código

**Boas Práticas e Armadilhas Comuns**

> _"Every time you write a comment, you have failed to express yourself in code."_  
> — Robert C. Martin (Autor de "Clean Code" e "Clean Architecture")

- Facilidades do Spring Boot vs. Clean Code
- Identificação de bad practices
- Uso consciente de frameworks

**Encerramento e Próximos Passos**
- Reflexão sobre o aprendizado
- Feedback da disciplina
- Compartilhamento de recursos para aprendizado contínuo

---

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
