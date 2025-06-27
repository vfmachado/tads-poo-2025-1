
SRC
    MODEL
        BOARD - FILA DE TODO
        TAREFA (ref USER)
        USER        (UMA TAREFA EM DOING E MULTIPLAS EM BLOCKED)
            - activeTask   (doing)
            - list<Task> blockedTasks
    DAO / PERSISTENCIA
        TAREFADAO
        USEDAO
    VIEW
        sera responsavel por interagir com o usuario atraves do Scanner / print
    CONTROLLER
        a partir da interacao do usuario, jogaria para o controller a responsabilidade de ação  BoardController.movimentar(tarefa, user, status),
    

DTO - DATA TRANSFER OBJECT (LOMBOK JAVA)
DAO - DATA ACCESS OBJECT
MODEL
SERVICE
CONTROLLER
VIEW
ORM - OBJECT RELATIONAL MAPPING


USER
    CONTROLLER
    DTOS
    ENTITY
    ...