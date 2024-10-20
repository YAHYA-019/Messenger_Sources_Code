package X;

import com.facebook.messaging.montage.model.cards.MontageStickerOverlayBounds;
import java.util.HashSet;
import java.util.Set;

/* loaded from: HqX.class */
public final class HqX {
    public double A00;
    public MontageStickerOverlayBounds A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A09;
    public String A0A;
    public Set A0B = AnonymousClass001.A0v();
    public String A08 = "";

    public HqX A00(MontageStickerOverlayBounds montageStickerOverlayBounds) {
        this.A01 = montageStickerOverlayBounds;
        C1pq.A08("montageStickerOverlayBounds", montageStickerOverlayBounds);
        if (!this.A0B.contains("montageStickerOverlayBounds")) {
            HashSet A1E = AbF.A1E(this.A0B);
            this.A0B = A1E;
            A1E.add("montageStickerOverlayBounds");
        }
        return this;
    }
}
