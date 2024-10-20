package X;

import android.net.Uri;

/* renamed from: X.9xd, reason: invalid class name */
/* loaded from: 9xd.class */
public final class C9xd implements DFr {
    public final Uri A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    public C9xd(Integer num, String str, String str2, String str3) {
        Uri uri = null;
        try {
            uri = C0A2.A03(str == null ? "" : str);
        } catch (SecurityException unused) {
        }
        this.A00 = uri;
        this.A03 = str2;
        this.A02 = str3;
        this.A01 = num;
    }

    @Override // X.DFr
    public String getId() {
        return "GAME_SHARE_PREVIEW_ID";
    }
}
