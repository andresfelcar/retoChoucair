#Autor: Andres Felipe Caro Arango Email: afca120@gmail.com
  #language: en

Feature: Yo como usuario quiero crear una nueva Business Unit y crear una reunion

  Background:
    Given el usuario ingresa a la pagina

  Scenario: yo como usuario quiero crear una business unit

    When el usuario se loguea con los datos
      | usuario | contrasena |
      | admin   | serenity   |
    And el usuario crea una business unit con los datos
      | nombre        | parentUnit |
      | Reto_Choucair | Acme Corp. |
    And el usuario crea la reunion con los datos
      | meetingName      | meetingType | meetingNumber | startDate  | endDate    | startTime | endTime | location | unit          | organizedBy | reporter     | attendeeList    |
      | REUNION CHOUCAIR | Customer    | 5217570       | 02/12/2022 | 02/12/2022 | 02:00     | 03:00   | On Site  | Reto_Choucair | Eric Butler | Alexis Lopez | Brandon Coleman |
    Then el usuario vera la business unit


