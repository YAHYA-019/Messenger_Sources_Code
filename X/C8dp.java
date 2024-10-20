package X;

import com.facebook.messaging.photos.service.MediaMessageItem;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8dp, reason: invalid class name */
/* loaded from: 8dp.class */
public final class C8dp extends 1LH {
    public final 2O4 A00;
    public final 8Lu A01;
    public final 9cG A02;
    public final AaM A03;
    public final MediaMessageItem A04;
    public final MigColorScheme A05;
    public final C66e A06;
    public final boolean A07;
    public final boolean A08;

    public C8dp(2O4 r302, 8Lu r303, 9cG r304, AaM aaM, MediaMessageItem mediaMessageItem, MigColorScheme migColorScheme, C66e c66e, boolean z, boolean z2) {
        11T.A0F(migColorScheme, 3);
        this.A01 = r303;
        this.A04 = mediaMessageItem;
        this.A05 = migColorScheme;
        this.A08 = z;
        this.A03 = aaM;
        this.A02 = r304;
        this.A00 = r302;
        this.A07 = z2;
        this.A06 = c66e;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        return EWB.A00(c2k5, (2lO) null, new AW4(this, 18));
    }
}
