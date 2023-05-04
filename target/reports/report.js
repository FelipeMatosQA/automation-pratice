$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 4,
  "name": "Efetuar Login",
  "description": "\r\nSou um usuario e quero efetuar login",
  "id": "efetuar-login",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "line": 9,
  "name": "Login com usuario valido",
  "description": "",
  "id": "efetuar-login;login-com-usuario-valido",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 8,
      "name": "@Login-sucesso"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "que eu estou na tela de login",
  "keyword": "Dado "
});
formatter.step({
  "line": 12,
  "name": "eu preencho os campos de \"\u003cemail\u003e\" e \"\u003csenha\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "clico em login",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "o login e efetuado \"\u003cemail\u003e\"",
  "keyword": "Entao "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "efetuar-login;login-com-usuario-valido;",
  "rows": [
    {
      "cells": [
        "email",
        "senha"
      ],
      "line": 17,
      "id": "efetuar-login;login-com-usuario-valido;;1"
    },
    {
      "cells": [
        "felipematos@yopmail.com",
        "123456"
      ],
      "line": 18,
      "id": "efetuar-login;login-com-usuario-valido;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.scenario({
  "line": 18,
  "name": "Login com usuario valido",
  "description": "",
  "id": "efetuar-login;login-com-usuario-valido;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    },
    {
      "line": 8,
      "name": "@Login-sucesso"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "que eu estou na tela de login",
  "keyword": "Dado "
});
formatter.step({
  "line": 12,
  "name": "eu preencho os campos de \"felipematos@yopmail.com\" e \"123456\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "clico em login",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "o login e efetuado \"felipematos@yopmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.que_eu_estou_na_tela_de_login()"
});
formatter.result({
  "duration": 11158209600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "felipematos@yopmail.com",
      "offset": 26
    },
    {
      "val": "123456",
      "offset": 54
    }
  ],
  "location": "LoginSteps.eu_preencho_os_campos_de_e(String,String)"
});
formatter.result({
  "duration": 546762300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.clico_em_login()"
});
formatter.result({
  "duration": 136197500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "felipematos@yopmail.com",
      "offset": 20
    }
  ],
  "location": "LoginSteps.o_login_e_efetuado(String)"
});
formatter.result({
  "duration": 125264500,
  "status": "passed"
});
formatter.after({
  "duration": 109400,
  "status": "passed"
});
formatter.after({
  "duration": 76100,
  "status": "passed"
});
formatter.after({
  "duration": 1005700,
  "status": "passed"
});
});