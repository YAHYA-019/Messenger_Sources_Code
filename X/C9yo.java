package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.9yo, reason: invalid class name */
/* loaded from: 9yo.class */
public final class C9yo implements 55A {
    public final C1u7 A00;
    public final MigColorScheme A01;
    public final 2KE A02;
    public final CharSequence A03;

    public C9yo(C1u7 c1u7, MigColorScheme migColorScheme, 2KE r304, CharSequence charSequence) {
        this.A03 = charSequence;
        this.A02 = r304;
        this.A01 = migColorScheme;
        this.A00 = c1u7;
    }

    public boolean BVg(55A r302) {
        boolean z = false;
        if (!11T.A0O(4YV.A0d(r302, 0), C9yo.class)) {
            return false;
        }
        C9yo c9yo = (C9yo) r302;
        if (11T.A0O(this.A03, c9yo.A03) && this.A02 == c9yo.A02 && 11T.A0O(this.A01, c9yo.A01) && this.A00 == c9yo.A00) {
            z = true;
        }
        return z;
    }
}
