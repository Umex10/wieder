### ITM/MSD - SW Design

## Design Patterns - Excersice

This repo contains a exercise for Design Patterns


# Beispiel Refactor to Design patterns


Erweitern sie bzw. ändern sie das Chatroom- Beispiel

#### Erweitern Sie die Klasse *ChatRoomSingleton* zu einem **Singleton Pattern**

- jeder User soll Zugriff auf den gleichen *Chatroom* haben

- erstellen sie die entsprechen Codestruktur, damit das Singleton Pattern erfüllt wird (beachten beachten sie das **UML-Diagram**)



#### User sollen über neue Message im Chatroom via **Observer Pattern** benachrichtigt werden

- Erstellen sie das Interface *ChatObserver*  und *ChatObservation* lt. UML Diagram

- Erstellen sie die Klasse *ConcreteChatObservation*, die das Interface *ChatObservation* implementiert
- Die Klasse *ChatRoomSingleton* besitzt eine Instanz von *ConcreteChatObservation*, beim Aufruf von 

		 requestUpdates(User user) 
		 
		 chatRoom.requestUpdates(alice); // alice bekommt Nachrichten
	
	wird der jeweilige User via Observer Pattern zur Benachrichtigung benachrichtigt
	
- Klasse *User* implementiert Interface *ChatObserver*		
- nach jeder Message werden jene User über nachrichten informiert   
	
		Bob says Hello
		Alice receives Bob says Hello
		Chris receives Bob says Hello

Die Klasse *ChatMain* soll folgenden Output liefern

	Alice says hi
	Alice receives Alice says hi
	Chris receives Alice says hi
	Bob says Hello
	Alice receives Bob says Hello
	Chris receives Bob says Hello
	Chris says Ciao
	Alice receives Chris says Ciao
	Chris receives Chris says Ciao
	Dean says Grias di
	Alice receives Dean says Grias di
	Chris receives Dean says Grias di


### UML Diagramm

![uml](image/chat_uml.png)



