package X;

import com.facebook.xapp.messaging.threadview.model.photo.Photo;
import java.util.BitSet;

/* renamed from: X.85t, reason: invalid class name */
/* loaded from: 85t.class */
public final class C85t extends C1rs {
    public 1Iw A00;
    public 7Jz A01;
    public final BitSet A02;
    public final String[] A03;

    public C85t(1Iw r302, 7Jz r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"photo"};
        BitSet A18 = 1BK.A18(1);
        this.A02 = A18;
        this.A01 = r303;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public 7Jz A2V() {
        C1rs.A01(this.A02, this.A03);
        A0J();
        return this.A01;
    }

    public void A2X(Photo photo) {
        this.A01.A0D = photo;
        this.A02.set(0);
    }
}
