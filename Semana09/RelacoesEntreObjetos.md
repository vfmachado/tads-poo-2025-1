# RELACOES ENTRE OBJETOS

## ASSOCIAÇÃO

- Relação entre dois objetos onde um objeto contém uma referência a outro objeto (professor).
- Falta a ideia de propriedade

CURSO POO / TADS EXISTE
VINICIUS PROFESSOR EXISTE



## AGREGAÇÃO
- TEM-UM FRACO - As partes podem existir fora do todo

Livro
Biblioteca

Jogador
Time

Aluno
Escola/Turma/Disciplina

Funcionario
Departamento


## COMPOSIÇÃO

- TEM-UM FORTE. Uma classe tem outra (parte) e esta parte não existe sem o todo.


## DELEGAÇÃO
- Atribui a responsabilidade / designa a outra classe para fazer determinada coisa.


## DEPENDENCIA
- Quando uma classe DEPENDE de outra para funcionar. a forma prática como vemos isso, normalmente é passando o objeto do tipo classe como parâmetro para o método da outra classe.

Um sistema que gera um relatorio de uma venda
Relatorio tem um método chamado gerar que recebe como parametro uma Venda

Uma classe que abstrai o envio de emails depende de uma mensagem (destinario + texto) para enviar o email.

Uma classe impressora que imprime uma venda (cupom fiscal)


## INVERSAO DE DEPENDENCIAS

"um módulo de alto nível não deve depender um módulos de baixo nível"
    eles conversam através de abstrações (INTERFACES)


