package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.Arrays;

/* renamed from: X.5z2, reason: invalid class name */
/* loaded from: 5z2.class */
public final class C5z2 extends C5yu {
    public final AnonymousClass553 A00;
    public final MigColorScheme A01;
    public final CharSequence A02;
    public final CharSequence A03;
    public final CharSequence A04;
    public final String A05;
    public final boolean A06;

    public C5z2(AnonymousClass553 anonymousClass553, MigColorScheme migColorScheme, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, String str, boolean z) {
        this.A03 = charSequence;
        this.A04 = charSequence2;
        this.A06 = z;
        this.A00 = anonymousClass553;
        this.A01 = migColorScheme;
        this.A02 = charSequence3;
        this.A05 = str;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof C5z2)) {
                return false;
            }
            C5z2 c5z2 = (C5z2) obj;
            if (11T.A0O(this.A03, c5z2.A03) && this.A06 == c5z2.A06 && 11T.A0O(this.A01, c5z2.A01) && 11T.A0O(this.A02, c5z2.A02) && 11T.A0O(this.A05, c5z2.A05)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03});
    }
}
