package X;

import com.facebook.auth.usersession.FbUserSession;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* renamed from: X.5ve, reason: invalid class name */
/* loaded from: 5ve.class */
public final class C5ve extends 2UV {
    public final C00i A00;

    public C5ve() {
        super((Executor) 1Bi.A03(16432));
        this.A00 = new 1BQ(49868);
    }

    public /* bridge */ /* synthetic */ 2UW A02(Object obj) {
        boolean z;
        if (((C5vf) obj).A00 != 0S2.A00) {
            C00i c00i = this.A00;
            C5vg c5vg = (C5vg) c00i.get();
            synchronized (c5vg) {
                z = false;
                if (c5vg.A00 > 0) {
                    z = true;
                }
            }
            if (z) {
                boolean A01 = ((C5vg) c00i.get()).A01();
                2JX A00 = ((C5vg) c00i.get()).A00();
                if (A00 != null) {
                    return new 2UW(A01 ? 0S2.A01 : 0S2.A0C, A00);
                }
            }
        }
        2UW r0 = 2UV.A03;
        11T.A0I(r0, "null cannot be cast to non-null type com.facebook.common.loader.AbstractListenableFutureFbLoader.LoaderResult<RESULT of com.facebook.common.loader.AbstractListenableFutureFbLoader.LoaderResult.Companion.forResultNotCached>");
        return r0;
    }

    public /* bridge */ /* synthetic */ ListenableFuture A03(2UW r302, Object obj) {
        ListenableFuture D3C;
        FbUserSession A04 = 1Fw.A04((1EZ) 1Bn.A0A(16428));
        C5vg c5vg = (C5vg) this.A00.get();
        synchronized (c5vg) {
            C5vh c5vh = c5vg.A03;
            if (c5vh == null) {
                D3C = ((1KE) c5vg.A05.get()).D3C(new DAy(A04, c5vg, 2));
                c5vg.A03 = new C5vh(D3C);
            } else {
                D3C = 1Kd.A08(c5vh.A00);
            }
        }
        return D3C;
    }
}
