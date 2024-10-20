package X;

import android.net.Uri;
import java.lang.ref.WeakReference;

/* renamed from: X.123, reason: invalid class name */
/* loaded from: 123.class */
public final class AnonymousClass123 {
    public final Uri A00;
    public final 10E A01;
    public final C0zj A02;
    public final WeakReference A03;

    public AnonymousClass123(Uri uri, 10E r303, C0zj c0zj, WeakReference weakReference) {
        this.A03 = weakReference;
        this.A01 = r303;
        this.A00 = uri;
        this.A02 = c0zj;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass123)) {
                return false;
            }
            AnonymousClass123 anonymousClass123 = (AnonymousClass123) obj;
            if (!11T.A0O(this.A03, anonymousClass123.A03) || !11T.A0O(this.A01, anonymousClass123.A01) || !11T.A0O(this.A00, anonymousClass123.A00) || this.A02 != anonymousClass123.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A05(this.A00, AnonymousClass002.A05(this.A01, this.A03.hashCode() * 31)) + AnonymousClass001.A02(this.A02)) * 31 * 31) + 1231;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("FileReceivingParams(context=");
        A0k.append(this.A03);
        A0k.append(", scope=");
        A0k.append(this.A01);
        A0k.append(", uri=");
        A0k.append(this.A00);
        A0k.append(", forcedDestination=");
        A0k.append(this.A02);
        A0k.append(", inboundPrefix=");
        A0k.append((String) null);
        A0k.append(", preferCacheIfInternal=");
        A0k.append(true);
        return AnonymousClass001.A0g(A0k, ')');
    }
}
