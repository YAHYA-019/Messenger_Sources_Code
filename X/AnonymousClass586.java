package X;

import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.586, reason: invalid class name */
/* loaded from: 586.class */
public final class AnonymousClass586 implements 55H {
    public final View.OnClickListener A00;
    public final MigColorScheme A01;
    public final String A02;

    public AnonymousClass586(View.OnClickListener onClickListener, MigColorScheme migColorScheme, String str) {
        11T.A0F(migColorScheme, 2);
        this.A02 = str;
        this.A01 = migColorScheme;
        this.A00 = onClickListener;
    }

    public boolean BVe(55H r302) {
        boolean z = false;
        if (!11T.A0O(4YV.A0d(r302, 0), AnonymousClass586.class)) {
            return false;
        }
        AnonymousClass586 anonymousClass586 = (AnonymousClass586) r302;
        if (11T.A0O(this.A02, anonymousClass586.A02) && 11T.A0O(this.A01, anonymousClass586.A01)) {
            z = 4YV.A1a(this.A00, anonymousClass586.A00, false);
        }
        return z;
    }
}
