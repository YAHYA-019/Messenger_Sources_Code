package X;

import com.google.android.gms.common.Feature;

/* loaded from: L7b.class */
public abstract class L7b {
    public final int A00;
    public final boolean A01;
    public final Feature[] A02;

    public L7b() {
        this.A02 = null;
        this.A01 = false;
        this.A00 = 0;
    }

    public L7b(Feature[] featureArr, int i, boolean z) {
        this.A02 = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.A01 = z2;
        this.A00 = i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.L2K, java.lang.Object] */
    public static L2K A00() {
        ?? obj = new Object();
        ((L2K) obj).A02 = true;
        ((L2K) obj).A00 = 0;
        return obj;
    }
}
