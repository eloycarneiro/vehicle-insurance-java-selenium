Feature: Smoke Test Tricentis
  Como cliente do seguro de automóveis tricentis desejo testar todas as funcionalidades que existe no site

  Background:
    Given que visite a home page do app tricentis

  @run
  Scenario: Abrir formulário
    When clicar para iniciar preenchimento de seguro
    Then o formulário deverá aparecer na tela com sucesso