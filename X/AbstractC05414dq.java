package X;

import android.content.Context;
import com.facebook.auth.viewercontext.ViewerContext;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.4dq, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4dq.class */
public abstract class AbstractC05414dq {
    public static AbstractC05414dq A00(C05424dr c05424dr, InterfaceC01633sc interfaceC01633sc) {
        ViewerContext BKF = interfaceC01633sc.BKF();
        BKF.getClass();
        return (AbstractC05414dq) 1Lo.A04((Context) null, ((1Fv) 1Bi.A03(66351)).A08(BKF), c05424dr.A00, 49185);
    }

    public 1Vd A02() {
        return this instanceof C05404dp ? 1VX.A0D(((C05404dp) this).A00) : (1Vd) ((C05424dr) this).A01.get();
    }

    public C03713yu A03(C3sa c3sa) {
        1Vd A02;
        if (this instanceof C05424dr) {
            C05424dr c05424dr = (C05424dr) this;
            if (C05424dr.A01(c05424dr, c3sa)) {
                return A00(c05424dr, c3sa).A03(c3sa);
            }
            A02 = c05424dr.A02();
        } else {
            A02 = A02();
        }
        return A02.A04(c3sa);
    }

    public ListenableFuture A04(5Dh r302, 5Dj r303) {
        1Vd A02;
        if (this instanceof C05424dr) {
            C05424dr c05424dr = (C05424dr) this;
            if (C05424dr.A01(c05424dr, r302)) {
                return A00(c05424dr, r302).A04(r302, r303);
            }
            A02 = c05424dr.A02();
        } else {
            A02 = A02();
        }
        return A02.A08(r302, r303);
    }

    public ListenableFuture A05(5Dj r302, 5Do r303) {
        1Vd A02;
        if (this instanceof C05424dr) {
            C05424dr c05424dr = (C05424dr) this;
            5Dh A01 = r303.A01();
            if (C05424dr.A01(c05424dr, A01)) {
                return A00(c05424dr, A01).A05(r302, r303);
            }
            A02 = c05424dr.A02();
        } else {
            A02 = A02();
        }
        return 1Vd.A01(A02, r302, r303);
    }

    public ListenableFuture A06(5Dh r302) {
        return A02().A08(r302, 5Dj.A01);
    }
}
