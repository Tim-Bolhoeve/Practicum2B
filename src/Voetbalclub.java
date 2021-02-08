public class Voetbalclub {
    int aantalGespeeld;
    int aantalPunten;
    int aantalGewonnen;
    int aantalgelijk;
    int aantalVerloren;
    String club;

    public Voetbalclub(String club){
        this.club = club;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w'){
            aantalGespeeld ++;
            aantalPunten = aantalPunten + 3;
            aantalGewonnen ++;
        }
        if (ch == 'g'){
            aantalGespeeld ++;
            aantalPunten = aantalPunten + 1;
            aantalgelijk ++;
        }
        if (ch == 'v'){
            aantalGespeeld ++;
            aantalVerloren ++;
        }
    }

    public int aantalGespeeld() {
        return aantalGespeeld;
    }

    public int aantalPunten(){
        return aantalPunten;
    }

    public String toString(){
        String tekst = club + "\t" + aantalGespeeld + " " + aantalGewonnen + " " +aantalgelijk + " " +aantalVerloren + " " +aantalPunten;
        return tekst;
    }
}
