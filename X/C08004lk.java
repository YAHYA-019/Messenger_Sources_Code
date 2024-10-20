package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.inject.FbInjector;

/* renamed from: X.4lk, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4lk.class */
public final class C08004lk implements 1Xc, CallerContextable {
    public static final String __redex_internal_original_name = "VideoServiceAppStateListener";
    public Context A00;
    public final C00i A01 = new 1BQ(67765);
    public final C00i A02;
    public final C00i A03;

    public C08004lk() {
        Context A00 = FbInjector.A00();
        this.A00 = A00;
        this.A03 = new 1HH(A00, 65728);
        this.A02 = new 1BQ(16511);
    }

    public String BB2() {
        return __redex_internal_original_name;
    }

    public void init() {
        int A03 = 0FI.A03(-1586201346);
        1P9 r0 = new 1P9((1I7) this.A03.get());
        r0.A05(new D0R(this, 5), "com.facebook.common.appstate.AppStateManager.USER_ENTERED_APP");
        r0.A02().A00();
        0FI.A09(-2083520092, A03);
    }
}
