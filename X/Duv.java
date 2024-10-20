package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import java.util.ArrayList;

/* loaded from: Duv.class */
public final class Duv extends 1LH {
    public final 8Lg A00;
    public final MigColorScheme A01;

    public Duv(8Lg r302, MigColorScheme migColorScheme) {
        this.A01 = migColorScheme;
        this.A00 = r302;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        1Br A01 = 1Bu.A01(3vP.A00(c2k5), 83250);
        8Lg r0 = this.A00;
        1Iw r02 = c2k5.A05;
        ArrayList A0s = AnonymousClass001.A0s();
        String str = r0.A04;
        MigColorScheme migColorScheme = this.A01;
        Object obj = r0.A02;
        C5yw A0b = 7zN.A0b(r02, false);
        A0b.A2i(false);
        A0b.A2b(migColorScheme);
        A0b.A2d(new FkI(obj, 2));
        A0b.A2f(str);
        A0s.add(A0b.A2V());
        CQY A00 = ((C1i) A01.get()).A00(r02, migColorScheme);
        String str2 = r0.A03;
        CharSequence charSequence = (CharSequence) r0.A01;
        boolean z = r0.A05;
        CQY.A03(A00, new Fk1(0, obj, z), "", str2, z);
        int i = 9GF.A01;
        LightColorScheme.A00();
        A00.A0L(new C55g(C1u7.A0A, migColorScheme, 2KE.A04, charSequence, 2RH.A03.A00(), i, i, -1, true));
        C8m6 A09 = A00.A09();
        if (A09 != null) {
            A0s.add(A09);
        }
        return new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0s, false);
    }
}
