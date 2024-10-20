package X;

import com.google.common.base.MoreObjects;
import java.util.Arrays;

/* renamed from: X.44r, reason: invalid class name */
/* loaded from: 44r.class */
public final class C44r implements Comparable {
    public final int A00;
    public final 2xB A01;

    public C44r(2xB r302, int i) {
        this.A00 = i;
        this.A01 = r302;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C44r c44r = (C44r) obj;
        if (c44r == null) {
            return -1;
        }
        return 2xG.A00.A02(this.A00, c44r.A00).A03(this.A01.A02, c44r.A01.A02).A01();
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof C44r) {
            C44r c44r = (C44r) obj;
            if (this.A00 == c44r.A00 && 11T.A0O(this.A01.A02, c44r.A01.A02)) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A01.A02});
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("rank", this.A00);
        stringHelper.add("LazyInterstitialControllerHolder", this.A01);
        return 11T.A02(stringHelper);
    }
}
