package X;

import android.net.Uri;
import java.util.BitSet;

/* renamed from: X.590, reason: invalid class name */
/* loaded from: 590.class */
public final class AnonymousClass590 implements 58M {
    public /* bridge */ /* synthetic */ 1LI AK4(1Iw r302, 55E r303, 47Q r304) {
        AnonymousClass591 anonymousClass591 = (AnonymousClass591) r303;
        boolean A1X = 1BL.A1X(r302, anonymousClass591);
        8Pl r0 = new 8Pl(r302, new C8m9());
        Uri uri = anonymousClass591.A00;
        C8m9 c8m9 = r0.A01;
        c8m9.A00 = uri;
        BitSet bitSet = r0.A02;
        bitSet.set(A1X ? 1 : 0);
        c8m9.A01 = anonymousClass591.A01;
        bitSet.set(3);
        c8m9.A03 = anonymousClass591.A03;
        bitSet.set(2);
        c8m9.A02 = anonymousClass591.A02;
        bitSet.set(0);
        C1rs.A02(bitSet, r0.A03);
        r0.A0J();
        return c8m9;
    }

    public Class BDi() {
        return AnonymousClass591.class;
    }
}
