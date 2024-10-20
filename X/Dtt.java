package X;

import java.util.BitSet;

/* loaded from: Dtt.class */
public final class Dtt extends C1rs {
    public 1Iw A00;
    public Dzl A01;
    public final BitSet A02;
    public final String[] A03;

    public Dtt(1Iw r302, Dzl dzl) {
        super(dzl, r302, 0, 0);
        this.A03 = new String[]{"checkoutData", "colorScheme", "onQRSaveListener", "orderId", "paymentType", "perPaymentMethodOfferId", "priceTableRows", "qrCode", "qrCodeNote", "sessionId"};
        BitSet A18 = 1BK.A18(10);
        this.A02 = A18;
        this.A01 = dzl;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A05(this.A02, this.A03, 10);
        A0J();
        return this.A01;
    }
}
