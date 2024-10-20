package X;

import android.net.Uri;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.58g, reason: invalid class name */
/* loaded from: 58g.class */
public final class C58g implements 55E {
    public final Uri A00;
    public final C2q1 A01;
    public final MigColorScheme A02;

    public C58g(Uri uri, C2q1 c2q1, MigColorScheme migColorScheme) {
        this.A00 = uri;
        this.A02 = migColorScheme;
        this.A01 = c2q1;
    }

    public boolean BVi(55E r302) {
        boolean z = false;
        if (r302.getClass() == C58g.class) {
            C58g c58g = (C58g) r302;
            if (this.A00.equals(c58g.A00) && this.A02.equals(c58g.A02)) {
                z = true;
            }
        }
        return z;
    }
}
