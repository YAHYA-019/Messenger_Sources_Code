package X;

import android.text.TextUtils;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;

/* renamed from: X.8mp, reason: invalid class name */
/* loaded from: 8mp.class */
public final class C8mp extends C1rj {
    public int A00;
    public 1LI A01;
    public AnonymousClass954 A02;
    public AaA A03;
    public MigColorScheme A04;
    public C2fr A05;
    public CharSequence A06;
    public CharSequence A07;
    public CharSequence A08;
    public CharSequence A09;
    public CharSequence A0A;
    public boolean A0B;
    public boolean A0C;

    public C8mp() {
        super("MigQuickPromotionBanner");
        this.A00 = 0;
    }

    public static 8Ta A00(1Iw r301) {
        return new 8Ta(r301, new C8mp());
    }

    public final Object[] A0k() {
        MigColorScheme migColorScheme = this.A04;
        CharSequence charSequence = this.A06;
        Boolean valueOf = Boolean.valueOf(this.A0B);
        1LI r0 = this.A01;
        Integer valueOf2 = Integer.valueOf(this.A00);
        CharSequence charSequence2 = this.A07;
        Boolean valueOf3 = Boolean.valueOf(this.A0C);
        AaA aaA = this.A03;
        CharSequence charSequence3 = this.A08;
        AnonymousClass954 anonymousClass954 = this.A02;
        CharSequence charSequence4 = this.A09;
        Boolean A0d = 1BK.A0d();
        return new Object[]{migColorScheme, charSequence, valueOf, r0, valueOf2, charSequence2, valueOf3, aaA, charSequence3, anonymousClass954, charSequence4, A0d, this.A05, this.A0A, A0d};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C8mp c8mp = (C8mp) super.A0l();
        c8mp.A01 = 4YV.A0J(c8mp.A01);
        return c8mp;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        MigColorScheme migColorScheme = this.A04;
        CharSequence charSequence = this.A07;
        1LI r0 = this.A01;
        CharSequence charSequence2 = this.A0A;
        C2fr c2fr = this.A05;
        CharSequence charSequence3 = this.A06;
        CharSequence charSequence4 = this.A08;
        CharSequence charSequence5 = this.A09;
        int i = this.A00;
        boolean z = this.A0B;
        boolean z2 = this.A0C;
        AaA aaA = this.A03;
        AnonymousClass954 anonymousClass954 = this.A02;
        migColorScheme.getClass();
        boolean z3 = !TextUtils.isEmpty(charSequence4);
        boolean z4 = !TextUtils.isEmpty(charSequence5);
        if (anonymousClass954 == null) {
            anonymousClass954 = AnonymousClass954.PRIMARY;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        if (z4) {
            charSequence5.getClass();
            A0s.add(new 9RY(83S.A00(aaA, 42), AnonymousClass954.SECONDARY, charSequence5));
        }
        if (z3) {
            charSequence4.getClass();
            A0s.add(new 9RY(83S.A00(aaA, 43), anonymousClass954, charSequence4));
        }
        8TB A01 = 8oO.A01(r302);
        A01.A2Y(migColorScheme);
        8oO r02 = A01.A01;
        r02.A07 = charSequence;
        r02.A02 = 7zQ.A0T(r0);
        r02.A08 = charSequence2;
        r02.A05 = c2fr;
        r02.A06 = charSequence3;
        if (r02.A09.isEmpty()) {
            r02.A09 = A0s;
        } else {
            r02.A09.addAll(A0s);
        }
        r02.A00 = i;
        r02.A0A = z;
        r02.A0B = z2;
        r02.A03 = new 9zX(aaA);
        return A01.A2W();
    }
}
