package X;

import android.net.Uri;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.591, reason: invalid class name */
/* loaded from: 591.class */
public final class AnonymousClass591 implements 55E {
    public final Uri A00;
    public final Uri A01;
    public final MigColorScheme A02;
    public final Long A03;

    public AnonymousClass591(Uri uri, Uri uri2, MigColorScheme migColorScheme, Long l) {
        this.A00 = uri;
        this.A01 = uri2;
        this.A03 = l;
        this.A02 = migColorScheme;
    }

    public boolean BVi(55E r302) {
        boolean z = false;
        if (!11T.A0O(4YV.A0d(r302, 0), AnonymousClass591.class)) {
            return false;
        }
        AnonymousClass591 anonymousClass591 = (AnonymousClass591) r302;
        if (11T.A0O(this.A00, anonymousClass591.A00) && 11T.A0O(this.A01, anonymousClass591.A01) && 11T.A0O(this.A03, anonymousClass591.A03)) {
            z = 4YV.A1a(this.A02, anonymousClass591.A02, false);
        }
        return z;
    }
}
