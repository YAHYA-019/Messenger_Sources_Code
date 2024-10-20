package X;

import com.google.android.gms.common.Feature;
import java.util.Arrays;

/* renamed from: X.3OZ, reason: invalid class name */
/* loaded from: 3OZ.class */
public final class C3OZ {
    public final Feature A00;
    public final 28I A01;

    public /* synthetic */ C3OZ(Feature feature, 28I r303) {
        this.A01 = r303;
        this.A00 = feature;
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof C3OZ)) {
            C3OZ c3oz = (C3OZ) obj;
            if (AbstractC09524qc.A00(this.A01, c3oz.A01) && AbstractC09524qc.A00(this.A00, c3oz.A00)) {
                z = true;
            }
        }
        return z;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public final String toString() {
        3OO r0 = new 3OO(this);
        r0.A00(this.A01, "key");
        r0.A00(this.A00, "feature");
        return r0.toString();
    }
}
