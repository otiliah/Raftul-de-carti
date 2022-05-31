 package raftulDeCarti;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*author: otiliah*/
public class Data {

    private List<Carte> carti = new ArrayList<>();

    public Data() {
        fillListaCarti();
        //sau ... fillListaCartiFromDataBase();
    }

    private void fillListaCarti() {
        carti.add(Carte.getInstance("Head First Design Patterns", "Eric Freeman", "2017", "9780596007126"));
        carti.add(Carte.getInstance("Head First Java", "Kathy Sierra", "2010", "1491910771"));
        carti.add(Carte.getInstance("Amintiri din copilarie", "Ion Creanga", "2015", "1260011399"));
    }


    public List<Carte> getToateCartile() {
        return carti;
    }

    private Predicate<Carte> getFiltrare(eFiltrare eFiltru, String sLitereTastate) {
        switch (eFiltru) {
            case eFiltrareISBN:
                return (p) -> p.getIsbn().toLowerCase().contains(sLitereTastate.toLowerCase());
            case eFiltrareNUME:
                return (p) -> p.getNume().toLowerCase().contains(sLitereTastate.toLowerCase());
            case eFiltrareAUTOR:
                return (p) -> p.getAutor().toLowerCase().contains(sLitereTastate.toLowerCase());
            case eFiltrareAnAPARITIE:
                return (p) -> p.getAnAparitie().toLowerCase().contains(sLitereTastate.toLowerCase());
            default:
                return (p) -> true;
        }
    }

    private Comparator<Carte> getOrdine(eOrdonare eOrdine) {
        switch (eOrdine) {
            case eOrdonareAUTOR:
                return (p1, p2) -> p1.getAutor().compareToIgnoreCase(p2.getAutor());
            case eOrdonareAnAPARITIE:
                return (p1, p2) -> p1.getAnAparitie().compareToIgnoreCase(p2.getAnAparitie());
            default:
            case eOrdonareNUME:
                return (p1, p2) -> p1.getNume().compareToIgnoreCase(p2.getNume());
        }
    }

    public List<Carte> getCartiDeAfisat(eFiltrare eFiltru, eOrdonare eOrdine, String sLitereTastate) {
        Predicate<Carte> filtru = getFiltrare(eFiltru, sLitereTastate);
        Comparator<Carte> comp = getOrdine(eOrdine);

        List<Carte> cartiDeAfisat = carti.stream().filter(filtru).sorted(comp).collect(Collectors.toList());
        return cartiDeAfisat;
    }

    public boolean stergeCarte(Carte carte) {
        return carti.remove(carte);
    }

    public boolean modificareCarte(Carte cSelectata, Carte cEditata) {
        if (!cSelectata.getIsbn().equals(cEditata.getIsbn())) {
            System.out.println("Ceva este in neregula ... ! ");
            return false;
        }

        int indexCarte = getIdxCarte(cSelectata);
        if (indexCarte >= 0) {
            carti.set(indexCarte, cEditata);
            return true;
        }
        return false;
    }

    public boolean adaugaCarte(Carte c) {
        if (getIdxCarte(c) >= 0) {
            System.out.println("Cartea cu " + c.getIsbn() + " exista deja in lista de carti.");
        }
        carti.add(c);
        return true;
    }

    public int getIdxCarte(Carte c) {
        for (int i = 0; i < carti.size(); i++) {
            if (carti.get(i).getIsbn() == c.getIsbn()) {
                return i;
            }
        }
        return -1;
    }
}
