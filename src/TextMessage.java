public class TextMessage {
    public void startGame(){
        System.out.println("""
                Du bist in einer verlassenen Villa gefangen und musst einen Weg hinausfinden.
                """);
    }
    public void entranceHall(){
        System.out.println("""
                Sie sind gerade in der Eingangshalle. Hier befindet sich
                eine alte Standuhr und eine alte Truhe.
                Was möchtest du machen?
                w....nach Norden
                a....nach Westen
                s....nach Süden
                d....nach Osten
                u....umschauen
                """);
    }
     public void kitchen(){
         System.out.println("""
                 Hier befindet sich die Küche. In der Küche schaust du dich ein
                 wenig um und findest einen Herd, ein Kochbuch und ein Messer in
                 einer Messerhalterung.
                 Was tust du?
                 a....nach Westen
                 u....umschauen
                 """);
     }
     public void library(){
         System.out.println("""
                 Du befindest dich nun in einer alten und staubigen Bibliothek,
                 wo dich riesige Bücherregale erwarten.
                 Was tust du?
                 w....nach Norden
                 s....nach Süden
                 u....umschauen
                 """);
     }
     public void study(){
         System.out.println("""
                 Du befindest in einem Arbeitszimmer.
                 Was tust du?
                 s....nach Süden
                 u....umschauen
                 """);
     }
}
