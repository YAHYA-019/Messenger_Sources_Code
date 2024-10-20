package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import java.util.BitSet;

/* renamed from: X.8lt, reason: invalid class name */
/* loaded from: 8lt.class */
public final class C8lt extends C1rj {
    public static final MigColorScheme A02 = LightColorScheme.A00();
    public MigColorScheme A00;
    public String A01;

    public C8lt() {
        super("MessengerMePreferenceListHeader");
        this.A00 = A02;
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A01};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String str = this.A01;
        MigColorScheme migColorScheme = this.A00;
        11T.A0G(r302, 0, migColorScheme);
        8Pr r0 = new 8Pr(r302, new 8jF());
        8jF r02 = r0.A01;
        r02.A01 = str;
        BitSet bitSet = r0.A02;
        bitSet.set(0);
        r02.A00 = migColorScheme;
        C1rs.A01(bitSet, r0.A03);
        r0.A0J();
        return r02;
    }
}
