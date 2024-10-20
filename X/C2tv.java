package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.inject.FbInjector;

/* renamed from: X.2tv, reason: invalid class name */
/* loaded from: 2tv.class */
public final class C2tv implements CallerContextable {
    public static final String __redex_internal_original_name = "FbAppModuleDownloader";
    public final 1Fe A00;
    public final C00i A01;
    public final C2u2 A02;
    public final C2tw A03;
    public final C00a A04;

    public C2tv() {
        this.A01 = new 1BQ(84633);
        this.A04 = (C00a) 1Bi.A03(65716);
        this.A03 = (C2tw) 1Bi.A03(17130);
        this.A00 = (1Fe) 1Bi.A03(16496);
        Context A00 = FbInjector.A00();
        C2tx c2tx = (C2tx) 1Bi.A03(17131);
        C2ty c2ty = (C2ty) 1Bi.A03(17132);
        1BQ r0 = new 1BQ(49750);
        this.A02 = new C2u2(A00, c2ty, (C2u1) 1Bi.A03(33257), c2tx, (C2tz) 1Bi.A03(17133), r0, "voltron");
    }

    public C2tv(int i) {
    }
}
