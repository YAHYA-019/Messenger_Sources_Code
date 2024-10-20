package X;

import com.google.common.base.MoreObjects;

/* renamed from: X.9yq, reason: invalid class name */
/* loaded from: 9yq.class */
public final class C9yq implements 55B {
    public final int A00;
    public final int A01 = Math.max(1, 1);
    public final CharSequence A02;
    public final CharSequence A03;

    public C9yq(CharSequence charSequence, CharSequence charSequence2, int i) {
        this.A02 = charSequence;
        this.A03 = charSequence2;
        this.A00 = Math.max(1, i);
    }

    public boolean BVh(55B r302) {
        boolean z = false;
        if (!11T.A0O(4YV.A0d(r302, 0), C9yq.class)) {
            return false;
        }
        C9yq c9yq = (C9yq) r302;
        if (11T.A0O(this.A02, c9yq.A02) && 11T.A0O(this.A03, c9yq.A03) && this.A00 == c9yq.A00 && this.A01 == c9yq.A01) {
            z = true;
        }
        return z;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("firstText", this.A02);
        stringHelper.add("secondeText", this.A03);
        stringHelper.add("maxFirstLines", this.A00);
        stringHelper.add("maxSecondLines", this.A01);
        return 11T.A02(stringHelper);
    }
}
