package X;

import com.facebook.messaging.montage.model.cards.MontageStickerOverlayBounds;
import java.util.HashSet;
import java.util.Set;

/* loaded from: Hpo.class */
public final class Hpo {
    public MontageStickerOverlayBounds A00;
    public String A01;
    public String A02;
    public Set A05 = AnonymousClass001.A0v();
    public String A03 = "";
    public String A04 = "";

    public void A00(MontageStickerOverlayBounds montageStickerOverlayBounds) {
        this.A00 = montageStickerOverlayBounds;
        C1pq.A08("montageStickerOverlayBounds", montageStickerOverlayBounds);
        if (this.A05.contains("montageStickerOverlayBounds")) {
            return;
        }
        HashSet A1E = AbF.A1E(this.A05);
        this.A05 = A1E;
        A1E.add("montageStickerOverlayBounds");
    }
}
