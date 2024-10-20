package X;

import com.facebook.zero.rewritenative.ZeroNativeRequestInterceptor;
import com.google.common.collect.ImmutableList;

/* renamed from: X.2Bu, reason: invalid class name */
/* loaded from: 2Bu.class */
public final class C2Bu implements 1Xr {
    public ZeroNativeRequestInterceptor A00 = null;
    public final C00i A01 = new 1BQ(66820);

    public boolean CIH(ImmutableList immutableList) {
        if (this.A00 == null || ((1Pz) this.A01.get()).A01()) {
            return false;
        }
        this.A00.rulesChanged(immutableList);
        return false;
    }
}
