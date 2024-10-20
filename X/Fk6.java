package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Fk6.class */
public final class Fk6 implements 55B {
    public final MigColorScheme A00;
    public final CharSequence A01;

    public Fk6(MigColorScheme migColorScheme, CharSequence charSequence) {
        this.A00 = migColorScheme;
        this.A01 = charSequence;
    }

    public boolean BVh(55B r302) {
        boolean z = false;
        if (r302 != null && 11T.A0O(r302.getClass(), Fk6.class)) {
            Fk6 fk6 = (Fk6) r302;
            if (11T.A0O(this.A01, fk6.A01) && 11T.A0O(this.A00, fk6.A00)) {
                z = true;
            }
        }
        return z;
    }
}
