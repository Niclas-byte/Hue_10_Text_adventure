public class TextMessage {
    private void startGame(){
        System.out.println("""
                Du bist in einer verlassenen Villa gefangen und musst einen Weg hinausfinden.
                """);
    }
    private void entranceHall(){
        System.out.println("""
                Sie sind gerade in der Eingangshalle. Hier befindet sich
                eine alte Standuhr und eine alte Truhe.
                Was möchtest du machen?
                w....nach Norden
                a....nach Westen
                s....nach Süden
                d....nach Osten
                u....untersuchen
                """);
    }
     private void library(){
         System.out.println("""
                 Hier befindet sich die Küche. In der Küche schaust du dich ein
                 wenig um und findest einen Herd, ein Kochbuch und ein Messer in
                 einer Messerhalterung.
                 Was tust du?
                 a....nach Westen
                 u....untersuchen
                 """);
     }
}
