package X;

import android.net.Uri;

/* renamed from: X.9xg, reason: invalid class name */
/* loaded from: 9xg.class */
public final class C9xg implements Aay {
    public final Uri A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C9xg(Uri uri, String str, String str2, String str3, String str4) {
        this.A01 = str;
        this.A00 = uri;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9xg)) {
                return false;
            }
            C9xg c9xg = (C9xg) obj;
            if (!11T.A0O(this.A01, c9xg.A01) || !"FALLBACK_XMA_PREVIEW_ID".equals("FALLBACK_XMA_PREVIEW_ID") || !11T.A0O(this.A00, c9xg.A00) || !11T.A0O(this.A02, c9xg.A02) || !11T.A0O(this.A03, c9xg.A03) || !11T.A0O(this.A04, c9xg.A04)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.DFr
    public String getId() {
        return "FALLBACK_XMA_PREVIEW_ID";
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A00, 1BK.A03("FALLBACK_XMA_PREVIEW_ID", C1pq.A03(this.A01) * 31)))));
    }
}
