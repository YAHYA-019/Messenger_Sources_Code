package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.58k, reason: invalid class name */
/* loaded from: 58k.class */
public final class C58k implements 55E {
    public final 7RU A00;
    public final MigColorScheme A01;

    public C58k(7RU r302, MigColorScheme migColorScheme) {
        this.A01 = migColorScheme;
        this.A00 = r302;
    }

    public boolean BVi(55E r302) {
        boolean z = false;
        if (r302 instanceof C58k) {
            C58k c58k = (C58k) r302;
            if (this.A01 == c58k.A01 && this.A00 == c58k.A00) {
                z = true;
            }
        }
        return z;
    }
}
