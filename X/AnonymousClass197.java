package X;

import android.text.TextUtils;

/* renamed from: X.197, reason: invalid class name */
/* loaded from: 197.class */
public final class AnonymousClass197 {
    public String A02 = "";
    public String A03 = "";
    public String A01 = "";
    public String A00 = "";

    public void A00(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("#") || str.length() != 22) {
            return;
        }
        this.A01 = str;
    }

    public void A01(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 11) {
            return;
        }
        this.A03 = str;
    }
}
