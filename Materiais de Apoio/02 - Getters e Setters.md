
# **02 - Getters e Setters**  

## **1. Introdução**  
### O que são Getters e Setters?  
Getters e Setters são **métodos de acesso** utilizados para obter e modificar valores de atributos privados em uma classe. Eles ajudam a **controlar o acesso aos dados** e **encapsular a lógica de manipulação dos atributos**.

### Por que usamos Getters e Setters?  
- **Encapsulamento** – Protege os dados internos da classe.  
- **Validação de dados** – Podemos validar valores antes de alterá-los.  
- **Facilidade de manutenção** – Se a estrutura do atributo mudar, apenas o getter e setter precisam ser atualizados.  

---

## **2. Exemplo Básico de Getters e Setters**  
Vamos criar uma classe `Pessoa` com um atributo `nome` e controlar seu acesso com métodos `get` e `set`.  

```java
class Pessoa {
    private String nome; // Atributo privado

    // Getter (Método para obter o valor do nome)
    public String getNome() {
        return nome;
    }

    // Setter (Método para definir um novo valor ao nome)
    public void setNome(String nome) {
        this.nome = nome;
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Carlos"); // Definindo o nome
        System.out.println("Nome: " + pessoa.getNome()); // Obtendo o nome
    }
}
```

### Explicação:  
- O atributo `nome` é **privado**, impedindo acesso direto de fora da classe.  
- O método `getNome()` retorna o valor do atributo.  
- O método `setNome()` define um novo valor.  

---

## **3. Aplicando Validação nos Setters**  
Podemos validar dados dentro do setter para garantir valores corretos.  

```java
class ContaBancaria {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("O saldo não pode ser negativo!");
        } else {
            this.saldo = saldo;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setSaldo(500); // OK
        System.out.println("Saldo: " + conta.getSaldo());

        conta.setSaldo(-100); // Mensagem de erro
    }
}
```
Agora, se tentarmos definir um saldo negativo, ele não será aceito.  

---

## **4. Getters e Setters com Construtores**  
Em muitos casos, usamos um **construtor** para definir valores iniciais e os getters/setters para modificá-los depois.  

```java
class Produto {
    private String nome;
    private double preco;

    // Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("O preço deve ser maior que zero!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Celular", 1500.00);
        System.out.println("Produto: " + produto.getNome() + ", Preço: " + produto.getPreco());

        produto.setPreco(-50); // Erro
        produto.setPreco(1800); // OK
        System.out.println("Novo Preço: " + produto.getPreco());
    }
}
```

---

## **5. Boas Práticas com Getters e Setters**  
✔ **Use getters e setters apenas quando necessário** – Se não houver necessidade de modificar um atributo, não crie um setter.  
✔ **Valide dados nos setters** – Evita valores inválidos na classe.  
✔ **Mantenha a coesão da classe** – Getters e setters devem refletir a responsabilidade da classe.  
✔ **Considere classes imutáveis** – Em algumas situações, evite setters para manter a classe imutável (exemplo: `String` em Java).  
