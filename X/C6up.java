package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.6up, reason: invalid class name */
/* loaded from: 6up.class */
public final class C6up implements C2ot {
    public final AaO A00;

    public C6up(AaO aaO) {
        this.A00 = aaO;
    }

    @Override // X.C2ot
    public /* bridge */ /* synthetic */ 1LI CfM(1Iw r302, Object obj, Object obj2) {
        C6ru c6ru = (C6ru) obj;
        11T.A0F(r302, 0);
        11T.A0F(c6ru, 1);
        AnonymousClass690 anonymousClass690 = c6ru.A01;
        if (anonymousClass690.A00 != 0) {
            return null;
        }
        8OY r0 = new 8OY(r302, new 8kJ());
        MigColorScheme migColorScheme = c6ru.A00;
        8kJ r02 = r0.A01;
        r02.A01 = migColorScheme;
        BitSet bitSet = r0.A02;
        bitSet.set(2);
        r02.A00 = this.A00;
        bitSet.set(0);
        r02.A02 = anonymousClass690;
        bitSet.set(1);
        C1rs.A05(bitSet, r0.A03, 3);
        r0.A0J();
        return r02;
    }
}
