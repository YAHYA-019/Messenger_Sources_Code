package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: X.9t6, reason: invalid class name */
/* loaded from: 9t6.class */
public final class C9t6 implements DEg {
    public final Context A00;
    public final 08O A01;

    public C9t6() {
        Context A0J = 7zP.A0J();
        08O r0 = (08O) 1Bi.A03(6);
        this.A00 = A0J;
        this.A01 = r0;
    }

    @Override // X.DEg
    public boolean BLX(Uri uri) {
        this.A01.A06().A0A(this.A00, new Intent(AbstractC00603o4.A00(1), uri));
        return true;
    }
}
