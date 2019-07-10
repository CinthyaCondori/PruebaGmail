#Author: c.condori.chavarria@accenture.com

@Feature1
Feature: crear_documento_drive

COMO usuario automatizacion.accenture@gmail.com
QUIERO enviar crear un documento drive
PARA presentar una intro a la automatización de pruebas

Background: drive

#HAPPY_PATH
@tag1
Scenario Outline: crear_documento

Given Que se quiere crear un documento
When Se visualiza el buscador al iniciar
And Se visualiza Google drive
And Se visualiza la pantalla de inicio sesion <Email> y <Contraseña>
Then Se visualiza la pantalla drive <Documento>

Examples:

|Email                             |Contraseña      |Documento           |
|automatizacion.accenture@gmail.com|automatizacion12|Documentos de Google|