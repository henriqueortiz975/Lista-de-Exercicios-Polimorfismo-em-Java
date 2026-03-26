# Lista de Exercícios – Polimorfismo em Java

---

## Regras obrigatórias para TODOS os exercícios

Todos os exercícios devem seguir as seguintes regras:

1. Todas as classes devem possuir **no mínimo 3 atributos**.
2. Os atributos devem possuir o modificador de visibilidade:

```java
( - )
```

1. Para cada atributo devem ser criados:
- **Métodos getters**
- **Métodos setters**
1. As classes filhas devem utilizar **herança**.
2. Os métodos das classes filhas devem utilizar **sobrescrita de método** com:

```java
@Override
```

1. Os testes devem ser realizados na classe:

```java
Main
```

1. Sempre que possível utilize **polimorfismo**, por exemplo:

```java
ClassePai objeto = new ClasseFilha();
```

---

# Exercício 1 – Sons de Animais

### Objetivo

Praticar **herança, encapsulamento e polimorfismo**.

### Enunciado

1. Crie a classe:

```
Animal
```

1. A classe deve possuir **no mínimo 3 atributos privados**, por exemplo:
- nome
- idade
- peso
1. Crie getters e setters para todos os atributos.
2. Crie o método:

```
emitirSom()
```

Mensagem padrão:

```
O animal faz um som
```

1. Crie cinco subclasses:
- Cachorro
- Gato
- Vaca
- Cavalo
- Leao
1. Cada classe deve sobrescrever o método:

```
emitirSom()
```

1. Na classe `Main`, crie objetos utilizando **referência da classe Animal** e teste os sons.

---

# Exercício 2 – Veículos

### Objetivo

Aplicar polimorfismo com diferentes tipos de veículos.

### Enunciado

1. Crie a classe:

```
Veiculo
```

1. Crie **no mínimo 3 atributos privados**, por exemplo:
- marca
- modelo
- ano
1. Crie getters e setters.
2. Crie o método:

```
mover()
```

Mensagem padrão:

```
O veículo está se movendo
```

1. Crie cinco subclasses:
- Carro
- Moto
- Bicicleta
- Aviao
- Barco
1. Cada classe deve sobrescrever o método:

```
mover()
```

1. Na classe `Main`, utilize polimorfismo para testar os veículos.

---

# Exercício 3 – Instrumentos Musicais

### Objetivo

Trabalhar com polimorfismo usando instrumentos.

### Enunciado

1. Crie a classe:

```
Instrumento
```

1. Crie **3 atributos privados**, por exemplo:
- nome
- tipo
- fabricante
1. Crie getters e setters.
2. Crie o método:

```
tocar()
```

1. Crie cinco subclasses:
- Violao
- Piano
- Bateria
- Flauta
- Guitarra
1. Cada instrumento deve sobrescrever o método:

```
tocar()
```

---

# Exercício 4 – Funcionários

### Objetivo

Simular tipos de funcionários em uma empresa.

### Enunciado

1. Crie a classe:

```
Funcionario
```

1. Crie **3 atributos privados**, por exemplo:
- nome
- salario
- setor
1. Crie getters e setters.
2. Crie o método:

```
trabalhar()
```

1. Crie subclasses:
- Gerente
- Vendedor
- Programador
- Designer
- SuporteTecnico
1. Cada classe deve sobrescrever o método `trabalhar()`.

---

# Exercício 5 – Pagamentos

### Objetivo

Simular um sistema de pagamento.

### Enunciado

1. Crie a classe:

```
Pagamento
```

1. Crie **3 atributos privados**, por exemplo:
- valor
- data
- descricao
1. Crie getters e setters.
2. Crie o método:

```
processarPagamento()
```

1. Crie subclasses:
- CartaoCredito
- Pix
- Dinheiro
- Boleto
- TransferenciaBancaria

---

# Exercício 6 – Formas Geométricas

### Objetivo

Aplicar polimorfismo em cálculos de área.

### Enunciado

1. Crie a classe:

```
Forma
```

1. Crie **3 atributos privados**, por exemplo:
- cor
- nome
- dimensaoPrincipal
1. Crie getters e setters.
2. Crie o método:

```
calcularArea()
```

1. Crie subclasses:
- Quadrado
- Retangulo
- Circulo
- Triangulo
- Trapezio

---

# Exercício 7 – Dispositivos Eletrônicos

### Objetivo

Simular funcionamento de dispositivos.

### Enunciado

1. Crie a classe:

```
Dispositivo
```

1. Crie **3 atributos privados**, por exemplo:
- marca
- modelo
- consumoEnergia
1. Crie getters e setters.
2. Crie o método:

```
ligar()
```

1. Crie subclasses:
- Televisao
- Computador
- Smartphone
- Tablet
- Smartwatch

---

# Exercício 8 – Transporte

### Objetivo

Criar sistema de cálculo de tarifa.

### Enunciado

1. Crie a classe:

```
Transporte
```

1. Crie **3 atributos privados**, por exemplo:
- nome
- capacidade
- empresa
1. Crie getters e setters.
2. Crie o método:

```
calcularTarifa()
```

1. Crie subclasses:
- Onibus
- Metro
- Trem
- Uber
- Taxi

---

# Exercício 9 – Personagens de Jogo

### Objetivo

Aplicar polimorfismo em personagens.

### Enunciado

1. Crie a classe:

```
Personagem
```

1. Crie **3 atributos privados**, por exemplo:
- nome
- nivel
- vida
1. Crie getters e setters.
2. Crie o método:

```
atacar()
```

1. Crie subclasses:
- Guerreiro
- Mago
- Arqueiro
- Ladino
- Paladino

---

# Exercício 10 – Sistema de Produtos

### Objetivo

Simular cálculo de preço final.

### Enunciado

1. Crie a classe:

```
Produto
```

1. Crie **3 atributos privados**, por exemplo:
- nome
- preco
- categoria
1. Crie getters e setters.
2. Crie o método:

```
calcularPrecoFinal()
```

1. Crie subclasses:
- Livro
- Eletronico
- Roupa
- Alimento
- Movel

---

# Exercício 11 – Profissões

### Objetivo

Simular atividades profissionais.

### Enunciado

1. Crie a classe:

```
Profissao
```

1. Crie **3 atributos privados**, por exemplo:
- nome
- salarioMedio
- area
1. Crie getters e setters.
2. Crie o método:

```
executarTrabalho()
```

1. Crie subclasses:
- Medico
- Professor
- Engenheiro
- Advogado
- Arquiteto

---

# Exercício 12 – Sistema de Notificações

### Objetivo

Simular envio de notificações.

### Enunciado

1. Crie a classe:

```
Notificacao
```

1. Crie **3 atributos privados**, por exemplo:
- destinatario
- mensagem
- dataEnvio
1. Crie getters e setters.
2. Crie o método:

```
enviar()
```

1. Crie subclasses:
- Email
- SMS
- Push
- WhatsApp
- Telegram
