package X;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: X.0T1, reason: invalid class name */
/* loaded from: 0T1.class */
public final class C0T1 {
    public final String A00;
    public final List A01;
    public final Set A02;
    public final C01i A03;
    public final boolean A04;

    public C0T1(String str, List list, Set set, boolean z) {
        11T.A0F(list, 1);
        this.A01 = list;
        this.A00 = str;
        this.A02 = set;
        this.A04 = z;
        this.A03 = C01g.A00(C03i.A02, new C0hm(this));
    }

    public static void A00(C0T1 c0t1, AbstractCollection abstractCollection, List list) {
        abstractCollection.add(new C0T1(c0t1.A00, list, c0t1.A02, c0t1.A04));
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof C0T1) {
            C0T1 c0t1 = (C0T1) obj;
            if (11T.A0O(c0t1.A00, this.A00) && 11T.A0O(c0t1.A02, this.A02) && 11T.A0O(c0t1.A01, this.A01) && c0t1.A04 == this.A04) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A02, this.A01, Boolean.valueOf(this.A04)});
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ExpectedAppIdentity(certificateHashes=");
        A0k.append(this.A03.getValue());
        A0k.append(", packageName='");
        A0k.append(this.A00);
        A0k.append("', domains=");
        A0k.append(this.A02);
        A0k.append(", allowExtraTrailingSigningCerts=");
        A0k.append(this.A04);
        return AnonymousClass001.A0g(A0k, ')');
    }
}
