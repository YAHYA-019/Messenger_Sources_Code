package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: Chh.class */
public final class Chh implements DEg {
    public final Context A00;
    public final 08O A01;

    public Chh() {
        Context A0J = 7zP.A0J();
        08O r0 = (08O) 1Bi.A03(6);
        this.A00 = A0J;
        this.A01 = r0;
    }

    @Override // X.DEg
    public boolean BLX(Uri uri) {
        boolean z = false;
        if ("fb-messenger".equals(uri.getScheme()) && "compose".equals(uri.getAuthority())) {
            this.A01.A06().A0A(this.A00, new Intent("com.facebook.orca.notify.SECURE_VIEW", uri.buildUpon().authority("autocompose").build()));
            z = true;
        }
        return z;
    }
}
