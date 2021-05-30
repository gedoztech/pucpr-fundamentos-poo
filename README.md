# Exercícios JAVA básico
- Universidade: PUC-PR
- Curso: Gestão de Tecnologia da Informação
- Disciplina: Fundamentos da Programação Orientada a Objetos
- Arquivos com código-fonte: pasta [src](https://github.com/johnny0408/pucpr-fundamentos-poo/tree/main/src).

### HelloWorld.java
Primeiros passos em Java.    
Mostrando uma mensagem simples no console.

### Calculadora.java
Noções de tipos de dados e de variáveis.  
Executando uma multiplicação simples e mostrando o resultado no console.

### ExemploEntrada.java
Entrada de dados digitados pelo usuário no console.
Executando uma soma simples e mostrando o resultado no console.
Utilização da biblioteca Scanner.

### Retangulo.java
Noções de classes e objetos.  
Criando uma classe para a entidade retângulo, instanciando objetos e calculando perímetro para retângulos.

### Cambio.java
Noções de classes e objetos.
Utilização da palavra-chave ***static***.

### CalculadoraScanner.java
Noções de classes e objetos.  
Entrada de dados digitados pelo usuário no console.  
Executando uma soma e uma multiplicação simples, e mostrando o resultado no console.  
Utilização da biblioteca Scanner.  
Utilização da palavra-chave ***static***.

### Circulo.java
Noções de classes e objetos.  
Entrada de dados digitados pelo usuário no console.  
Executando uma soma e uma multiplicação simples, e mostrando o resultado no console.  
Utilização da biblioteca Scanner.  
Utilização das palavras-chave ***final static*** (definição de constantes).

### Geometria
Pacote Geometria.  
Noções de classes e objetos.  
Exercício proposto: criar classes e métodos para cálculo de figuras geométricas.

### P1
Pacote 1. Noções de encapsulamento.  
Criando um pacote com 2 classes e referências de métodos e atributos entre si.  
Perguntas:

- É possível usar o modificador private antes da palavra-chave class, tanto na classe A quanto na classe B? O que acontece?  
  Não é possível, ocorre um erro, pois o modificador ***private*** não é permitido na declaração de classes.


- É possível usar o modificador private nos métodos A.g() e B.f()? Justifique.  
  É possível em B.f(), porém não em A.g(), pois neste último caso ocorrerá um erro. 
  O erro está no fato de que o método B.f() faz referência ao método A.g(), utilizando-o, e, 
  caso o método A.g() fosse declarado como ***private***, este último método ficaria acessível apenas pela classe A 
  e não seria permitido o acesso pela classe B. Já no caso de B.f() ser declarado como ***private***, 
  não incorreria em problema, já que este método é utilizado apenas dentro do escopo da classe B.
  
- É possível usar o modificador protected nos métodos A.g() e B.f()? Justifique.  
  Sim. Neste caso, os métodos de uma classe poderiam continuar a ser utilizados pela outra, 
  como no caso de B.f() utilizar A.g(), pois o modificador ***protected*** não impediria isso. 
  A restrição se aplicaria a referências aos métodos das classes do pacote P1 
  feitas por classes fora do pacote P1 que não fossem subclasses de alguma classe de P1 
  (classes herdadas de alguma classe de P1).

### Carro.java
Noções de encapsulamento.  
Método construtor.  
Métodos getter e setter.

### Banco
Pacote Banco.  
Noções de encapsulamento.  
Métodos getter e setter.

### Arquitetura
Pacote Arquitetura.  
Noções de encapsulamento.  
Métodos getter e setter.
Diferentes utilizações dos modificadores ***public*** e ***private***.  
Diferentes formas de instanciar classes.

### StringDemo.java e StringExamples.java
Noções de encapsulamento.
Diferentes formas de criar uma string.

