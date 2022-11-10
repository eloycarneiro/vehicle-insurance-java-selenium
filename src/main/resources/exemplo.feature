Feature: Smoke Test Tricentis
  Como cliente do seguro de automóveis tricentis desejo testar todas as funcionalidades que existe no site

  Background:
    Given que visite a home page do app tricentis

  @run @TESTE-001
  Scenario: Abrir formulário
    When clicar para iniciar preenchimento de seguro
    Then o formulário deverá aparecer na tela com sucesso

  @run @TESTE-002
  Scenario: Abrir formulário e preencher primeiro campo
    When clicar para iniciar preenchimento de seguro
    And o formulário deverá aparecer na tela com sucesso
    Then informar marca selecionada "Porsche"

  @run @TESTE-003
  Scenario: Abrir formulário e preencher primeira aba
    When clicar para iniciar preenchimento de seguro
    And o formulário deverá aparecer na tela com sucesso
    And informar marca selecionada "Renault"
    And informar desempenho do motor 2000
    And informar data de manufatura "10/10/2020"
    And informar numero de assentos 5
    And informar tipo de combustível "Gas"
    And informar faixa de preço 28600
    And informar numero do documento 158931
    And informar milhagem anual 26000

  @run @TESTE-004
  Scenario: Abrir formulário e preencher primeira aba
    When clicar para iniciar preenchimento de seguro
    And o formulário deverá aparecer na tela com sucesso
    And informar dados do veículo
      | Marca     | DesempenhoMotor | DataManufatura | NumeroAssentos | TipoCombustivel | FaixaPreco | NumeroDocumento | MilhagemAnual |
      | Porsche   |     2000        | "10/10/2020"   |          5     | Gas             | 28600      |   158931        |    10000      |
    And seguir para proxima etapa do formulario
#    And informar dados do usuario
#      | Nome      | Sobrenome       | DataNascimento | DataNascimento | Genero          | Endereco   |  País           | CEP | Cidade  |