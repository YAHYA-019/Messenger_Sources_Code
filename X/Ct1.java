package X;

import android.net.Uri;

/* loaded from: Ct1.class */
public final class Ct1 implements DFr {
    public final Uri A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public Ct1(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, false);
    }

    public Ct1(String str, String str2, String str3, String str4, String str5, boolean z) {
        Uri uri;
        if (str == null) {
            uri = null;
        } else {
            uri = null;
            try {
                uri = C0A2.A03(str);
            } catch (SecurityException unused) {
            }
        }
        this.A00 = uri;
        this.A03 = str2;
        this.A02 = str3;
        this.A04 = str4;
        this.A01 = str5;
        this.A05 = z;
    }

    @Override // X.DFr
    public String getId() {
        return "LINK_PREVIEW_ID";
    }
}
