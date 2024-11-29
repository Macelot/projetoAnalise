# Projeto Swing com JInternalFrame, Desenhos e Gráficos

## Índice
1. [Descrição](#descrição)
2. [Funcionalidades](#funcionalidades)
3. [Tecnologias Utilizadas](#tecnologias-utilizadas)
4. [Instalação](#instalação)
5. [Exemplo de Uso](#exemplo-de-uso)
6. [Dependências](#dependências)
7. [Como Contribuir](#como-contribuir)
8. [Licença](#licença)
9. [Contato](#contato)

Este projeto utiliza a biblioteca Swing para criar interfaces gráficas com menus e exemplos de `JInternalFrame`. Além disso, ele oferece funcionalidades de criptografia e desenhos, utilizando a biblioteca `stddraw`. Também são incluídos gráficos gerados com `JFreeChart`.

## Funcionalidades

- **Menu Swing**: Interface gráfica com menus interativos.
- **JInternalFrame**: Uso de `JInternalFrame` para gerenciar janelas internas.
- **Desenhos**: Funcionalidades para desenhar formas e gráficos na tela usando a biblioteca `stddraw`.
- **Gráficos**: Geração de gráficos utilizando o `JFreeChart`.
- **Criptografia**: Implementação de algoritmos de criptografia.
[Voltar ao Índice](#índice)

## Tecnologias Utilizadas

- **Java**: Linguagem principal do projeto, JDK 21.
- **Swing**: Biblioteca para construção de interfaces gráficas.
- **stddraw**: Biblioteca para criação de desenhos gráficos.
- **JFreeChart**: Biblioteca para gerar gráficos.
- **Apache POI**: Biblioteca para trabalhar com arquivos do Microsoft Office.
- **Log4j**: Framework para registro de logs.
- **Maven**: Gerenciador de dependências.
[Voltar ao Índice](#índice)

## Instalação

1. **Clone o repositório**:
    ```bash
    git clone https://github.com/seu-usuario/seu-repositorio.git
    ```
2. **Instale as dependências**:
   Se estiver utilizando Maven, as dependências serão gerenciadas automaticamente. Para instalar o projeto, execute:
    ```bash
    mvn clean install
    ```

3. **Configuração no IDE**:
    - Importe o projeto em sua IDE preferida (como IntelliJ IDEA, Eclipse).
    - Certifique-se de que todas as dependências estão resolvidas.

4. **Executar a aplicação**:
    Execute o seguinte comando para rodar a aplicação:
    ```bash
    mvn exec:java
    ```
[Voltar ao Índice](#índice)

## Dependências

Este projeto utiliza várias bibliotecas externas que são necessárias para o correto funcionamento da aplicação. Abaixo estão as dependências Maven para o seu `pom.xml`:

```xml
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi</artifactId>
    <version>5.2.3</version> <!-- Verifique se há uma versão mais recente -->
</dependency>

<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi-ooxml</artifactId>
    <version>5.2.3</version>
</dependency>

<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-collections4</artifactId>
    <version>4.4</version>
</dependency>

<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-core</artifactId>
    <version>2.20.0</version> <!-- Verifique se há uma versão mais recente -->
</dependency>

<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-api</artifactId>
    <version>2.20.0</version>
</dependency>

<!-- https://mvnrepository.com/artifact/jfree/jfreechart -->
<dependency>
    <groupId>jfree</groupId>
    <artifactId>jfreechart</artifactId>
    <version>1.0.13</version>
</dependency>
```
[Voltar ao Índice](#índice)

## Como Contribuir

Se você deseja contribuir para este projeto, siga as etapas abaixo:

1. Faça um fork deste repositório.
2. Crie uma branch para sua funcionalidade ou correção de bug.
3. Realize as mudanças e commit.
4. Abra um Pull Request com a descrição clara das alterações.
5. Teste as alterações para garantir que o projeto funcione como esperado.
[Voltar ao Índice](#índice)

## Licença

Este projeto está licenciado sob a [Licença MIT](Licenca.md)
[Voltar ao Índice](#índice)

## Contato

Se você tiver alguma dúvida ou sugestão, fique à vontade para me contactar:
[Voltar ao Índice](#índice)