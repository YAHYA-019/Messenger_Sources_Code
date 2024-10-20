package X;

import android.net.Uri;

/* loaded from: Kpg.class */
public final class Kpg {
    public final Uri A00;
    public final String A01;
    public final String A02;

    public Kpg(Uri uri, String str, String str2) {
        this.A00 = uri;
        this.A01 = str;
        this.A02 = str2;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("NavDeepLinkRequest");
        A0k.append("{");
        Uri uri = this.A00;
        if (uri != null) {
            A0k.append(" uri=");
            A0k.append(String.valueOf(uri));
        }
        String str = this.A01;
        if (str != null) {
            A0k.append(" action=");
            A0k.append(str);
        }
        String str2 = this.A02;
        if (str2 != null) {
            A0k.append(" mimetype=");
            A0k.append(str2);
        }
        String A0d = AnonymousClass001.A0d(" }", A0k);
        11T.A0A(A0d);
        return A0d;
    }
}
