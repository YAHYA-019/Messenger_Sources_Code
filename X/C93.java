package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Collections;
import java.util.Set;

/* loaded from: C93.class */
public final class C93 {
    public static volatile C1u3 A06;
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final C1u3 A04;
    public final Set A05;

    public C93(C1u3 c1u3, String str, String str2, Set set, int i, boolean z) {
        C1pq.A08("description", str);
        this.A01 = str;
        this.A04 = c1u3;
        this.A00 = i;
        this.A03 = z;
        AbF.A1V(str2);
        this.A02 = str2;
        this.A05 = Collections.unmodifiableSet(set);
        String str3 = this.A02;
        if (str3 == null || str3.length() == 0) {
            throw 1BK.A0g();
        }
    }

    public C1u3 A00() {
        if (this.A05.contains(PublicKeyCredentialControllerUtility.JSON_KEY_ICON)) {
            return this.A04;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = C1u3.A3u;
                }
            }
        }
        return A06;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C93)) {
                return false;
            }
            C93 c93 = (C93) obj;
            if (!11T.A0O(this.A01, c93.A01) || A00() != c93.A00() || this.A00 != c93.A00 || this.A03 != c93.A03 || !11T.A0O(this.A02, c93.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = C1pq.A03(this.A01);
        return C1pq.A04(this.A02, C1pq.A02((((A03 * 31) + C3o5.A03(A00())) * 31) + this.A00, this.A03));
    }
}
