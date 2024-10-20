package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.85w, reason: invalid class name */
/* loaded from: 85w.class */
public final class C85w extends C1rs {
    public 1Iw A00;
    public C6rP A01;
    public final BitSet A02;
    public final String[] A03;

    public C85w(1Iw r302, C6rP c6rP) {
        super(c6rP, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "glyphFavicon"};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A01 = c6rP;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public C6rP A2V() {
        C1rs.A00(this.A02, this.A03);
        A0J();
        return this.A01;
    }

    public void A2X(7RU r302) {
        this.A01.A01 = r302;
        this.A02.set(1);
    }

    public void A2Y(MigColorScheme migColorScheme) {
        this.A01.A02 = migColorScheme;
        this.A02.set(0);
    }
}
