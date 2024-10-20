package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;

/* loaded from: C4u.class */
public final class C4u {
    public AnonymousClass553 A00;
    public CharSequence A02;
    public MigColorScheme A01 = LightColorScheme.A00();
    public boolean A03 = true;

    public C59s A00() {
        boolean z = this.A03;
        CharSequence charSequence = this.A02;
        MigColorScheme migColorScheme = this.A01;
        if (z) {
            return new C59s(this.A00, migColorScheme, charSequence, 1BL.A1W(charSequence, migColorScheme));
        }
        1BK.A1M(charSequence, migColorScheme);
        return new C59s(AnonymousClass553.A01, migColorScheme, charSequence, false);
    }
}
