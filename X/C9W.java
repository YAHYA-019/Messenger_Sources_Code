package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Collections;
import java.util.Set;

/* loaded from: C9W.class */
public final class C9W {
    public static volatile String A05;
    public static volatile String A06;
    public static volatile String A07;
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Set A04;

    public C9W(String str, String str2, String str3, Set set, int i) {
        this.A01 = str;
        this.A00 = i;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = Collections.unmodifiableSet(set);
    }

    public String A00() {
        if (this.A04.contains(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
            return this.A01;
        }
        if (A05 == null) {
            synchronized (this) {
                if (A05 == null) {
                    A05 = "";
                }
            }
        }
        return A05;
    }

    public String A01() {
        if (this.A04.contains(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) {
            return this.A02;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = "";
                }
            }
        }
        return A06;
    }

    public String A02() {
        if (this.A04.contains("profilePicUrl")) {
            return this.A03;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    A07 = "";
                }
            }
        }
        return A07;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9W)) {
                return false;
            }
            C9W c9w = (C9W) obj;
            if (!11T.A0O(A00(), c9w.A00()) || this.A00 != c9w.A00 || !11T.A0O(A01(), c9w.A01()) || !11T.A0O(A02(), c9w.A02())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(A02(), C1pq.A04(A01(), (C1pq.A03(A00()) * 31) + this.A00));
    }
}
