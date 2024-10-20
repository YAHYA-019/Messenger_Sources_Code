package X;

import android.text.TextUtils;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Ayn, reason: case insensitive filesystem */
/* loaded from: Ayn.class */
public final class C1994Ayn extends C1rj {
    public int A00;
    public int A01;
    public C1u7 A02;
    public C1u7 A03;
    public MigColorScheme A04;
    public 2KE A05;
    public 2KE A06;
    public CharSequence A07;
    public CharSequence A08;

    public C1994Ayn() {
        super("MigSectionHeaderTextColumn");
        this.A00 = 2;
        this.A01 = 1;
    }

    public final Object[] A0k() {
        return new Object[]{this.A04, this.A07, Integer.valueOf(this.A00), this.A02, this.A05, this.A08, Integer.valueOf(this.A01), this.A03, this.A06};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        CharSequence charSequence = this.A08;
        2KE r0 = this.A06;
        C1u7 c1u7 = this.A03;
        2KE r02 = this.A05;
        C1u7 c1u72 = this.A02;
        MigColorScheme migColorScheme = this.A04;
        CharSequence charSequence2 = this.A07;
        int i = this.A01;
        int i2 = this.A00;
        if (i <= 0) {
            throw AnonymousClass001.A0L("Title max lines must be larger than 0");
        }
        if (i2 <= 0) {
            throw AnonymousClass001.A0L("Subtitle max lines must be larger than 0");
        }
        2cM A0M = 7zN.A0M(r302, (String) null);
        A0M.A0L();
        2KD A0f = 7zR.A0f(r302, charSequence, false);
        A0f.A2y(r0);
        A0f.A2w(c1u7);
        A0f.A2x(migColorScheme);
        A0f.A2q(i);
        A0M.A2d(A0f);
        if (!TextUtils.isEmpty(charSequence2)) {
            2KD A0f2 = 7zR.A0f(r302, charSequence2, false);
            A0f2.A2y(r02);
            A0f2.A2w(c1u72);
            A0f2.A2x(migColorScheme);
            A0f2.A2q(i2);
            A0M.A2W(A0f2);
        }
        return A0M.A00;
    }
}
