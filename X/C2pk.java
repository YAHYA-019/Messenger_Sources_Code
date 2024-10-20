package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.2pk, reason: invalid class name */
/* loaded from: 2pk.class */
public final class C2pk extends C1rj {
    public 2iH A00;
    public C2gi A01;
    public MigColorScheme A02;

    public C2pk() {
        super("M4ThreadItemCallToActionComponent");
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C2gi c2gi = this.A01;
        MigColorScheme migColorScheme = this.A02;
        C1u2 c1u2 = (C1u2) 1Bi.A03(16839);
        C2ql c2ql = (C2ql) c2gi.A05.A01("THREAD_ITEM_CTA", (Class) null);
        if (c2ql == null) {
            return null;
        }
        if (!c2ql.A07) {
            EnumC02393v2 enumC02393v2 = c2ql.A00;
            if (enumC02393v2 == null) {
                return null;
            }
            C83g A00 = C02413v4.A00(r302);
            A00.A2Z(enumC02393v2.mButtonGlyph);
            A00.A2a(enumC02393v2.mIconSize);
            A00.A2e(migColorScheme);
            A00.A2b(c2gi.A00.isSet() ? null : 1LI.A02(r302, C2pk.class, 0S2.A01, "M4ThreadItemCallToActionComponent", (Object[]) null, -1351902487));
            String str = c2ql.A04;
            if (str == null) {
                str = c2ql.A05;
            }
            A00.A2S(str);
            return A00.A2V();
        }
        C1u3 c1u3 = ((C1uz) 1Bi.A03(66227)).A02(37) ? c2ql.A00.mIconGlyph : C1u3.A4n;
        8Ph r0 = new 8Ph(r302, new 8mF());
        String str2 = c2ql.A05;
        8mF r02 = r0.A01;
        r02.A05 = str2;
        BitSet bitSet = r0.A02;
        bitSet.set(0);
        r02.A01 = r0.A02.A0B(c1u2.A04(c1u3, C1u4.SIZE_32));
        r0.A2S(c2ql.A04);
        r02.A03 = migColorScheme;
        r02.A06 = c2ql.A06;
        r0.A2T(c2gi.A00.isSet() ? null : 1LI.A02(r302, C2pk.class, 0S2.A01, "M4ThreadItemCallToActionComponent", (Object[]) null, -1351902487));
        r02.A00 = -13513658;
        C1rs.A05(bitSet, r0.A03, 1);
        r0.A0J();
        return r02;
    }
}
