package X;

import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8mr, reason: invalid class name */
/* loaded from: 8mr.class */
public final class C8mr extends C1rj {
    public static final C1p8 A0D;
    public static final C1p8 A0E;
    public static final C1p8 A0F;
    public static final C1p8 A0G;
    public 2MQ A00;
    public 2Re A01;
    public C4Ux A02;
    public AnonymousClass553 A03;
    public C1p8 A04;
    public C1p8 A05;
    public C1p8 A06;
    public C1p8 A07;
    public C1p8 A08;
    public C1p8 A09;
    public MigColorScheme A0A;
    public String A0B;
    public boolean A0C;

    static {
        C1ut c1ut = C1ut.A08;
        A0D = c1ut;
        A0F = C1ut.A0A;
        A0G = c1ut;
        A0E = 2cR.A04;
    }

    public C8mr() {
        super("BloksMigIconButton");
        this.A04 = A0D;
        this.A07 = A0E;
        this.A0C = true;
        this.A08 = A0G;
        this.A09 = A0F;
    }

    public final Object[] A0k() {
        return new Object[]{this.A0B, this.A02, this.A0A, this.A04, this.A05, this.A06, this.A07, this.A00, this.A01, Boolean.valueOf(this.A0C), this.A03, this.A08, this.A09};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        2MQ r0 = this.A00;
        2Re r02 = this.A01;
        MigColorScheme migColorScheme = this.A0A;
        boolean z = this.A0C;
        String str = this.A0B;
        AnonymousClass553 anonymousClass553 = this.A03;
        C4Ux c4Ux = this.A02;
        C1p8 c1p8 = this.A05;
        C1p8 c1p82 = this.A04;
        C1p8 c1p83 = this.A06;
        C1p8 c1p84 = this.A07;
        C1p8 c1p85 = this.A09;
        C1p8 c1p86 = this.A08;
        11T.A0F(r302, 0);
        1BL.A1H(r0, r02, migColorScheme);
        7zP.A1O(c1p82, 9, c1p84);
        7zR.A1R(c1p85, c1p86);
        C83g A00 = C02413v4.A00(r302);
        A00.A2Z(r0);
        A00.A2a(r02);
        A00.A2g(z);
        A00.A2f(str);
        A00.A2e(migColorScheme);
        A00.A2b(anonymousClass553 != null ? 1LI.A09(r302, C8mr.class, "BloksMigIconButton", -1755229903) : null);
        C02413v4 c02413v4 = A00.A01;
        c02413v4.A04 = c4Ux;
        A00.A2d(c1p8);
        c02413v4.A05 = c1p82;
        c02413v4.A07 = c1p83;
        c02413v4.A08 = c1p84;
        c02413v4.A0A = c1p85;
        c02413v4.A09 = c1p86;
        return A00.A2V();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1755229903) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Is r0 = r302.A00.A01;
        View view = ((3xC) obj).A00;
        AnonymousClass553 anonymousClass553 = ((C8mr) r0).A03;
        11T.A0F(view, 2);
        if (anonymousClass553 == null) {
            return null;
        }
        anonymousClass553.onClick(view);
        return null;
    }
}
