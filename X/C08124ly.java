package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.inject.FbInjector;

/* renamed from: X.4ly, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ly.class */
public final class C08124ly {
    public static final String A06 = 0Pz.A0W(C08124ly.class.getCanonicalName(), ".USER_ENTERED_DEVICE");
    public static final String A07 = 0Pz.A0W(C08124ly.class.getCanonicalName(), ".USER_LEFT_DEVICE");
    public Context A00;
    public final 1I7 A01;
    public final C08134lz A02;
    public final C00i A03;
    public final C00i A04;
    public volatile long A05;

    public C08124ly() {
        Context A00 = FbInjector.A00();
        this.A00 = A00;
        this.A01 = (1I7) 1Hv.A02(A00, 65728);
        this.A04 = new 1BQ(99390);
        this.A03 = new 1BQ(65726);
        C08134lz c08134lz = (C08134lz) 1Bi.A03(49233);
        this.A02 = c08134lz;
        c08134lz.A00((Handler) this.A03.get(), new C3Vy(this, 0));
    }
}
