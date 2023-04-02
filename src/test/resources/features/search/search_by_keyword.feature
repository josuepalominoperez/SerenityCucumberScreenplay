Feature: Transferencias propias

  Scenario: Transferencia cuenta soles a dolares
    Given Ferxxo esta mirando BXI LoginPage
    When he enters "user"
    And he types "password"
    And he switches to Posicion Global
    And he closes the modals
    And he clicks on soles account
    And he clicks on Operaciones
    And he clicks on Realizar Transferencia
    And he clicks on Next
    And he sends one sol
    And he confirms the operation
    Then he sees the summary


