package X;

import android.os.Bundle;

/* renamed from: X.49k, reason: invalid class name */
/* loaded from: 49k.class */
public final class C49k {
    public final Bundle A00;

    public C49k(Bundle bundle) {
        this.A00 = bundle;
    }

    public int A00(String str, int i) {
        return this.A00.getInt(str, i);
    }

    public /* bridge */ /* synthetic */ Bundle A01() {
        return this.A00;
    }

    public String A02(String str) {
        String string = this.A00.getString(str);
        if (string != null) {
            return string;
        }
        return null;
    }

    public void A03(String str, int i) {
        this.A00.putInt(str, i);
    }

    public void A04(String str, String str2) {
        this.A00.putString(str, str2);
    }
}
