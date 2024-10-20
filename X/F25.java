package X;

import com.google.common.collect.ImmutableList;

/* loaded from: F25.class */
public abstract class F25 {
    public static final ImmutableList A00(boolean z, boolean z2) {
        ImmutableList immutableList = z ? z2 ? FIK.A0A : FIK.A06 : z2 ? FIK.A0B : FIK.A07;
        11T.A0D(immutableList);
        return immutableList;
    }

    public static final boolean A01(int i) {
        boolean z = false;
        if (i != 198 && 100 <= i) {
            if (i < 200) {
                return true;
            }
            if (i >= 250) {
                z = true;
            }
        }
        return z;
    }
}
