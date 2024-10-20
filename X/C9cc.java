package X;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.9cc, reason: invalid class name */
/* loaded from: 9cc.class */
public final class C9cc {
    public static volatile Uri A05;
    public final int A00;
    public final Uri A01;
    public final ImmutableList A02;
    public final String A03;
    public final Set A04;

    public C9cc(Uri uri, ImmutableList immutableList, String str, Set set, int i) {
        C1pq.A08("albumName", str);
        this.A03 = str;
        this.A00 = i;
        this.A01 = uri;
        C1pq.A08("parentFolderIndices", immutableList);
        this.A02 = immutableList;
        this.A04 = Collections.unmodifiableSet(set);
    }

    public Uri A00() {
        if (this.A04.contains("albumThumbnail")) {
            return this.A01;
        }
        if (A05 == null) {
            synchronized (this) {
                if (A05 == null) {
                    Uri uri = Uri.EMPTY;
                    11T.A0B(uri);
                    A05 = uri;
                }
            }
        }
        return A05;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9cc)) {
                return false;
            }
            C9cc c9cc = (C9cc) obj;
            if (!11T.A0O(this.A03, c9cc.A03) || this.A00 != c9cc.A00 || !11T.A0O(A00(), c9cc.A00()) || !11T.A0O(this.A02, c9cc.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(A00(), (C1pq.A03(this.A03) * 31) + this.A00));
    }
}
