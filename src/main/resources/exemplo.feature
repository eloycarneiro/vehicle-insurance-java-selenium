Feature: Smoke Test Tricentis
  Como cliente do seguro de automóveis tricentis desejo testar todas as funcionalidades que existe no site

  Background:
    Given que visite a home page do app tricentis

  @run @TESTE-001
  Scenario: Abrir formulário
    When clicar para iniciar preenchimento de seguro
    Then o formulário deverá aparecer na tela com sucesso

  @run @TESTE-002
  Scenario: Abrir formulário
    When clicar para iniciar preenchimento de seguro
    And o formulário deverá aparecer na tela com sucesso
    Then informar primeira aba de dados do cliente