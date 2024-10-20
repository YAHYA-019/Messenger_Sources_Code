package X;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.4wd, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4wd.class */
public final class C11394wd extends C04v {
    public int A00;
    public String A01;
    public Set A02;
    public boolean A03;
    public final String A04;
    public final String A05;

    public /* synthetic */ C11394wd(String str, String str2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.A05 = str;
        this.A04 = str2;
        this.A01 = null;
        this.A02 = linkedHashSet;
        this.A03 = false;
        this.A00 = 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C11394wd)) {
                return false;
            }
            C11394wd c11394wd = (C11394wd) obj;
            if (!11T.A0O(this.A05, c11394wd.A05) || !11T.A0O(this.A04, c11394wd.A04) || !11T.A0O(this.A01, c11394wd.A01) || !11T.A0O(this.A02, c11394wd.A02) || this.A03 != c11394wd.A03 || this.A00 != c11394wd.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A02 = (4YV.A02(this.A05) + 1BL.A05(this.A04)) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return ((AnonymousClass002.A05(this.A02, (A02 + i) * 31) + AnonymousClass002.A00(this.A03 ? 1 : 0)) * 31) + this.A00;
    }
}
