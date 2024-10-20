package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.base.Objects;
import java.util.List;

/* renamed from: X.56o, reason: invalid class name */
/* loaded from: 56o.class */
public final class C56o implements AnonymousClass544 {
    public final long A00;
    public final MigColorScheme A01;
    public final List A02;

    public C56o(MigColorScheme migColorScheme, List list, long j) {
        this.A00 = j;
        this.A02 = list;
        this.A01 = migColorScheme;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        boolean z = false;
        if (!11T.A0O(4YV.A0d(anonymousClass544, 0), C56o.class)) {
            return false;
        }
        C56o c56o = (C56o) anonymousClass544;
        if (this.A00 == c56o.A00 && Objects.equal(this.A02, c56o.A02)) {
            z = 4YV.A1Z(this.A01, c56o.A01);
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return this.A00;
    }
}
