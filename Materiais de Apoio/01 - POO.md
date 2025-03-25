### O que é POO?  
POO (Programação Orientada a Objetos) é um paradigma de programação baseado na modelagem do mundo real através de **objetos**. Esses objetos possuem **atributos** (dados) e **métodos** (comportamentos), sendo organizados em **classes**, que servem como modelos para criar instâncias (objetos concretos).

Os quatro pilares da POO são:  
1. **Abstração** – Foca nos aspectos essenciais do objeto, ignorando detalhes desnecessários.  
2. **Encapsulamento** – Restringe o acesso direto aos dados, permitindo manipulação apenas por métodos apropriados.  
3. **Herança** – Permite que uma classe herde características de outra, promovendo reuso de código.  
4. **Polimorfismo** – Permite que objetos de diferentes classes sejam tratados de forma uniforme, adaptando comportamentos.

---

### Origem da POO  
A POO surgiu na década de 1960, inspirada pelo conceito de "objetos" na simulação computacional. Algumas datas importantes:  

- **1967** – Linguagem Simula 67, a primeira a introduzir o conceito de classes e objetos.  
- **1970s e 1980s** – Smalltalk popularizou a POO, influenciando outras linguagens.  
- **1990s** – Linguagens como C++, Java e Python consolidaram a POO como padrão na indústria.

---

### Como a POO se encaixa com Java?  
Java é uma das linguagens que adotam a POO de forma rigorosa. Tudo em Java gira em torno de **classes e objetos**, e a própria estrutura do código reflete os princípios desse paradigma.

#### Exemplo prático:
**Criação de classe e objeto**  
   ```java
   class Carro {
       String modelo;
       int ano;

       void exibirDetalhes() {
           System.out.println("Modelo: " + modelo + ", Ano: " + ano);
       }
   }

   public class Main {
       public static void main(String[] args) {
           Carro meuCarro = new Carro();
           meuCarro.modelo = "Fusca";
           meuCarro.ano = 1975;
           meuCarro.exibirDetalhes();
       }
   }
   ```
   
