package X;

import android.content.Intent;
import android.net.Uri;

/* loaded from: Hm3.class */
public final class Hm3 {
    public RFk A00;

    public boolean A00(Intent intent, int i, int i2) {
        RFk rFk;
        if (i != 4113 || i2 != -1 || intent == null || (rFk = this.A00) == null) {
            return false;
        }
        Uri data = intent.getData();
        Gre gre = rFk.A00;
        ICX icx = gre.A01;
        String obj = data.toString();
        RYi rYi = icx.A00;
        ICX icx2 = rYi.A02;
        Uri uri = null;
        try {
            uri = C0A2.A03(obj);
        } catch (SecurityException unused) {
        }
        RYi.A00(rYi, ICX.A00(uri, icx2), obj, "custom");
        ICX icx3 = gre.A01;
        ICX.A00(data, icx3);
        ICX.A01(icx3, data.toString());
        gre.A1c();
        return true;
    }
}
