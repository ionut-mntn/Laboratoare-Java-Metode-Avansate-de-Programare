# Hausaufgabe_3  Deadline 7-te Woche - 16 November 2020

Eine Universität braucht eine kleine Anwendung, an der sich Studierende für einen bestimmten lab3.model.Kurs anmelden können. Jeder lab3.model.Kurs hat einen Namen, einen Lehrer, eine maximale Anzahl von Schülern, eine Liste der eingeschriebenen Schüler und die Anzahl der Credits. Jeder lab3.model.Student ist eine lab3.model.Person, die auch einen Studentenausweis, eine Anzahl von eingeschriebenen Credits und eine Liste von eingeschriebenen Kurse hat. 
 
Erstellen Sie eine Anwendung, mit der Sie Informationen zum lab3.model.Kurs und zu den Teilnehmern hinzufügen, löschen, ändern und abrufen können.
Die Anwendung ermöglicht es den Studenten, sich für einen bestimmten lab3.model.Kurs anzumelden. Wenn für den lab3.model.Kurs keine Plätze verfügbar sind, erhält der lab3.model.Student eine Warnmeldung und muss einen anderen lab3.model.Kurs aus der Liste der verfügbaren auswählen.
Mit der Anwendung können Sie die Kurse, die verfügbaren Plätze haben und deren Anzahl anzeigen;
Die Anwendung ermöglicht die Anzeige von Studenten, die sich für einen bestimmten lab3.model.Kurs angemeldet haben;
Mit der Anwendung können Sie alle verfügbaren Kurse anzeigen;
Jeder lab3.model.Student kann Kurse mit bis zu 30 Credits wählen. Wenn der lab3.model.Student einen lab3.model.Kurs auswählen möchte und die Anzahl der Credits überschritten wird, erhält er eine Fehlermeldung und der lab3.model.Kurs wird nicht zu seiner Kursliste hinzugefügt.
Jede Änderung der Anzahl der Credits eines Kurses wirkt sich implizit auf die Gesamtanzahl der Credits aus, die ein lab3.model.Student hat, wenn er in diesem lab3.model.Kurs eingeschrieben ist.
Der Lehrer kann den lab3.model.Kurs, den er unterrichtet, löschen, und die Studenten werden aus der Liste dieses Kurses gelöscht.
 
Die Anwendung berücksichtigt die ModelViewController-Muster. Die erforderlichen Repositories befinden sich in Memory (Listen, die zuerst direkt aus dem Code geladen wurden, bevor das Programm ausgeführt wird) und implementieren die generische IRepository-Schnittstelle (siehe Anhang).
Das Modelldiagramm stellt nur einen Ausgangspunkt dar, das Modell kann nach Bedarf umgebaut werden. 

![uml diagram](https://github.com/MapUBB2020/Hausaufgabe_3/blob/main/UML_Diagram.png?raw=true)

Hausaufgabe:

Mit der Verwendung von lab3Basic.zip Projekt, lösen Sie folgendes:

Modellieren Sie diese Anwendung und implementieren Sie die Logik bis Repository Layer: Implementierung Model, Implementierung InMemoryRepository von ICrudRepository für alle notwendige Klassen;

Funktionalität testen durch JUnits;

Javadocs generieren;


----------------------------------------------------------------------------------------------------------------
Herausforderungen:
----------------------------------------------------------------------------------------------------------------

Getters und Setters für alle model Klassen

Collections Framework

Implementieren des MVC-Musters

JUnits
