# language: pt

@Login
Funcionalidade: Efetuar Login

  Sou um usuario e quero efetuar login

  @Login-sucesso
  Esquema do Cenario:Login com usuario valido

    Dado que eu estou na tela de login
    Quando eu preencho os campos de "<email>" e "<senha>"
    E clico em login
    Entao o login e efetuado "<email>"

    Exemplos:
    |         email           |   senha    |
    | felipematos@yopmail.com |  123456    |

  @Login-negativo
  Esquema do Cenario: Login: <nome>

    Dado que eu estou na tela de login
    Quando eu preencho os campos de "<email>" e "<senha>"
    E clico em login
    Entao e exibido critica "<mensagem>"

    Exemplos:
    |email                       |senha      |    mensagem     |nome          |
    |                            |  123456   |E-mail inválido. |  Sem email   |
    |  felipematos@yopmail.com   |           |Senha inválida.  |  Sem senha   |
    |    emailInvalido           |  123456   |E-mail inválido. |Email invalido|
    |  felipematos@yopmail.com   |  123      |Senha inválida.  |Senha invalida|


  @Ignore
  Cenario: Logout com sucesso

    Dado que eu estou logado
    Quando eu preencho os campos de email e senha
    E clico em login
    Entao o login e efetuado
