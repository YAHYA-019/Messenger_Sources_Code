package X;

import android.net.Uri;

/* renamed from: X.9xf, reason: invalid class name */
/* loaded from: 9xf.class */
public final class C9xf implements Aay {
    public final Uri A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C9xf(Uri uri, String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = uri;
        this.A03 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9xf)) {
                return false;
            }
            C9xf c9xf = (C9xf) obj;
            if (!11T.A0O(this.A01, c9xf.A01) || !11T.A0O(this.A02, c9xf.A02) || !"CONTACT_SHARE_XMA_PREVIEW_ID".equals("CONTACT_SHARE_XMA_PREVIEW_ID") || !11T.A0O(this.A00, c9xf.A00) || !11T.A0O(this.A03, c9xf.A03)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.DFr
    public String getId() {
        return "CONTACT_SHARE_XMA_PREVIEW_ID";
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A00, 1BK.A03("CONTACT_SHARE_XMA_PREVIEW_ID", C1pq.A04(this.A02, C1pq.A03(this.A01)) * 31)));
    }
}
