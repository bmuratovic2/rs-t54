package sample;

import javafx.beans.property.SimpleStringProperty;

public class Korisnik {
    private SimpleStringProperty Ime = new SimpleStringProperty("");
    private SimpleStringProperty Prezime = new SimpleStringProperty("");
    private SimpleStringProperty Email = new SimpleStringProperty("");
    private SimpleStringProperty Korisnickoime = new SimpleStringProperty("");
    private SimpleStringProperty Lozinka = new SimpleStringProperty("");

}
    public String getIme() {
        return Ime.get();
    }

    public SimpleStringProperty imeProperty() {
        return Ime;
    }

    public void setIme(String Ime) {
        this.Ime.set(Ime);
    }

    public String getPrezime() {
        return Prezime.get();
    }

    public SimpleStringProperty PrezimeProperty() {
        return Prezime;
    }

    public void setPrezime(String Prezime) {
        this.Prezime.set(Prezime);
    }

    public String getEmail() {
        return Email.get();
    }

    public SimpleStringProperty EmailProperty() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email.set(Email);
    }

    public String getKorisnickoime() {
        return Korisnickoime.get();
    }

    public SimpleStringProperty KorisnickoimeProperty() {
        return Korisnickoime;
    }

    public void setKorisnickoime(String Korisnickoime) {
        this.Ime.set(Korisnickoime);
    }

    public String getLozinka() {
        return Lozinka.get();
    }

    public SimpleStringProperty LozinkaProperty() {
        return Lozinka;
    }

    public void setLozinka(String Lozinka) {
        this.Lozinka.set(Lozinka);
    }


    public Korisnik(){}

    public Korisnik(String Ime, String Prezime, String Email, String Korisnickoime, String Lozinka){
        this.Ime = new SimpleStringProperty(Ime);
        this.Prezime = new SimpleStringProperty(Prezime);
        this.Email = new SimpleStringProperty(Email);
        this.Korisnickoime = new SimpleStringProperty(Korisnickoime);
        this.Lozinka = new SimpleStringProperty(Lozinka);
        }


    @Override
    public String toString() {
        String str = Ime.get() + " " + Prezime.get();
        return str;
}

    public void mailProperty() {}

    public void prezimeProperty() {
    }

    public void korisnickoImeProperty() {}

    public Object lozinkaProperty() {
        return null;
    }
}







