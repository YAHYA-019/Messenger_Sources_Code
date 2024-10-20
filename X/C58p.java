package X;

import android.net.Uri;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.base.Objects;

/* renamed from: X.58p, reason: invalid class name */
/* loaded from: 58p.class */
public final class C58p implements 55E {
    public final int A00;
    public final Uri A01;
    public final C2q1 A02;
    public final C2py A03;
    public final MigColorScheme A04;

    public C58p(Uri uri, C2q1 c2q1, C2py c2py, MigColorScheme migColorScheme, int i) {
        this.A01 = uri;
        this.A02 = c2q1;
        this.A03 = c2py;
        this.A04 = migColorScheme;
        this.A00 = i;
    }

    public boolean BVi(55E r302) {
        boolean z = false;
        if (r302.getClass() == C58p.class) {
            C58p c58p = (C58p) r302;
            if (Objects.equal(this.A01, c58p.A01) && Objects.equal(this.A02, c58p.A02) && Objects.equal(this.A03, c58p.A03) && Objects.equal(this.A04, c58p.A04) && Objects.equal(Integer.valueOf(this.A00), Integer.valueOf(c58p.A00))) {
                z = true;
            }
        }
        return z;
    }
}
