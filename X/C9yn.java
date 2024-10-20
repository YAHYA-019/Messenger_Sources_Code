package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9yn, reason: invalid class name */
/* loaded from: 9yn.class */
public final class C9yn implements 55Q {
    public /* bridge */ /* synthetic */ 1LI AJD(1Iw r302, AnonymousClass544 anonymousClass544) {
        1LH r304;
        C9yj c9yj = (C9yj) anonymousClass544;
        11T.A0F(r302, 0);
        C1rq A00 = C1rg.A00(r302);
        if (c9yj != null) {
            final MigColorScheme migColorScheme = c9yj.A01;
            final C9a7 c9a7 = c9yj.A00;
            r304 = new 1LH(c9a7, migColorScheme) { // from class: X.8W2
                public final C9a7 A00;
                public final MigColorScheme A01;

                {
                    this.A01 = migColorScheme;
                    this.A00 = c9a7;
                }

                public 1LI A0s(C2k5 c2k5) {
                    11T.A0F(c2k5, 0);
                    List<8K5> A02 = C9iJ.A02(this.A00.A03, c2k5);
                    1Iw r0 = c2k5.A05;
                    ArrayList A0s = AnonymousClass001.A0s();
                    for (8K5 r02 : A02) {
                        A0s.add(7zM.A10(new 56W(r02, this.A01), 55M.A00(r0)));
                    }
                    return new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0s, false);
                }
            };
        } else {
            r304 = null;
        }
        return 7zL.A0d(r304, A00);
    }

    public Class BDi() {
        return C9yj.class;
    }
}
