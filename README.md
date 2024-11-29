# Projeto Swing com JInternalFrame, Desenhos e Gráficos

Este projeto utiliza a biblioteca Swing para criar interfaces gráficas com menus e exemplos de `JInternalFrame`. Além disso, ele oferece funcionalidades de criptografia e desenhos, utilizando a biblioteca `stddraw`. Também são incluídos gráficos gerados com `JFreeChart`.

## Funcionalidades

- **Menu Swing**: Interface gráfica com menus interativos.
- **JInternalFrame**: Uso de `JInternalFrame` para gerenciar janelas internas.
- **Desenhos**: Funcionalidades para desenhar formas e gráficos na tela usando a biblioteca `stddraw`.
- **Gráficos**: Geração de gráficos utilizando o `JFreeChart`.
- **Criptografia**: Implementação de algoritmos de criptografia.

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
