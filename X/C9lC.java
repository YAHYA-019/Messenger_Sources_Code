package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;

/* renamed from: X.9lC, reason: invalid class name */
/* loaded from: 9lC.class */
public final class C9lC {
    public CharSequence A02;
    public CharSequence A03;
    public CharSequence A04;
    public boolean A05 = true;
    public AnonymousClass553 A00 = AnonymousClass553.A01;
    public MigColorScheme A01 = LightColorScheme.A00();

    public static C9lC A00() {
        int i = C5yu.A00;
        return new C9lC();
    }

    public static void A01(C9lC c9lC, C2k7 c2k7, int i) {
        c9lC.A04(3yH.A09(c2k7, i));
    }

    public final C5z2 A02() {
        int i = C5yu.A00;
        CharSequence charSequence = this.A03;
        if (charSequence == null) {
            11T.A0L("text");
            throw 0Q8.createAndThrow();
        }
        return new C5z2(this.A00, this.A01, charSequence, this.A04, this.A02, null, this.A05);
    }

    public final void A03(AnonymousClass553 anonymousClass553) {
        11T.A0F(anonymousClass553, 0);
        this.A00 = anonymousClass553;
    }

    public final void A04(CharSequence charSequence) {
        11T.A0F(charSequence, 0);
        this.A03 = charSequence;
    }
}
