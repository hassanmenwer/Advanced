package solid.lsp;

import java.util.ArrayList;

public abstract class OfferController {

    protected ArrayList<Offer> offers = new ArrayList<>();

    public ArrayList<Offer> getOffers() {
        ArrayList<Offer> tmpOffers = new ArrayList<>();
        for (Offer offer : offers) {
            tmpOffers.add(offer);
        }
        return tmpOffers;
    }

    void addOffers(Offer offer) {
        this.offers.add(offer);
    }

}
