# language: pt

  @cadastro
  Funcionalidade: Cadastro de usuário

    Sou um novo usuário e quero me cadastrar para utilizar o site

    @cadastro-sucesso
    Esquema do Cenario:Cadastro de um novo usuário

      Dado que eu estou na tela de cadastro
      Quando eu preencho os campos "<nome>" e "<senha>" com um novo email
      E clico em cadastrar
      Entao o usuario e cadastrado "<nome>"
      Exemplos:
      | nome |   senha  |
      |Felipe|   123456 |



    @cadastro-negativo
    Esquema do Cenario: Cadastro com os campos vazios <nomeCenario>

      Dado que eu estou na tela de cadastro
      E preencho os campos de cadastro "<nomeCad>" "<email>" "<senha>"
      Quando clico em cadastrar
      Entao e exibido mensagem de critica "<mensagem>"

      Exemplos:
      |nomeCad|email                  |senha |                   mensagem                   | nomeCenario|
      |       |                       |      |O campo nome deve ser prenchido               | Campos vazios|
      |Felipe |                       |123456|O campo e-mail deve ser prenchido corretamente| Email vazio  |
      |Felipe |felipematos@yopmail.com|      |O campo senha deve ter pelo menos 6 dígitos   | Senha Vazia  |
      |Felipe |felipematos@yopmail.com|123   |O campo senha deve ter pelo menos 6 dígitos   | Senha Invalida  |
      |Felipe |felipematos            |123456|O campo e-mail deve ser prenchido corretamente| Email Invalido  |


