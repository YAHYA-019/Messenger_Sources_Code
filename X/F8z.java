package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: F8z.class */
public final class F8z {
    public final 1Br A02 = 1BK.A0C();
    public final 1Br A01 = 1Bq.A00(65755);
    public final 1Br A00 = AbG.A0K();
    public final 1Br A03 = 7zM.A0P();

    public static final void A00(Context context, FbUserSession fbUserSession, F8z f8z, DqI dqI, SettableFuture settableFuture) {
        String A01;
        C3sa A0L;
        FwL A00;
        EU9.A00(context);
        boolean AZk = 1Br.A07(f8z.A02).AZk(36326313698547125L);
        String A002 = 1BJ.A00(11);
        2Jd A0Q = DKC.A0Q();
        String str = dqI.A02;
        A0Q.A09("app_id", str);
        A0Q.A09("bloks_versioning_id", A002);
        int i = dqI.A00;
        boolean z = dqI.A03;
        if (i != 0) {
            Object obj = dqI.A01;
            if (!z) {
                obj = AnonymousClass001.A12().put("params", AnonymousClass001.A12().put("server_params", obj));
                11T.A0A(obj);
            }
            A01 = obj.toString();
        } else {
            java.util.Map map = (java.util.Map) dqI.A01;
            if (!z) {
                map = C4O5.A02(map);
            }
            if (AZk) {
                A01 = EUW.A00(map);
                A0Q.A09("params", A01);
                C30G A0H = AbF.A0H(4);
                DKC.A1S(A0Q, A0H, "params");
                DKC.A1S(C3tA.A00(), A0H, "nt_context");
                A0L = AbK.A0L(A0H);
                A0L.A0B = false;
                A0L.A07 = 0Pz.A0Y(A0L.A07, str, '-');
                A00 = FwL.A00(settableFuture, 3);
                if (((1Ew) 1Br.A0B(f8z.A01)).BNC() || ((1G1) fbUserSession).A07) {
                    1VX.A0G(context).A02(A0L, A00, 4YV.A11(f8z.A00));
                } else {
                    ((DKN) 1Bu.A06(context, 68643)).A00().A0C(A0L, A00, 4YV.A11(f8z.A00));
                    return;
                }
            }
            A01 = FIV.A01(map);
        }
        11T.A0A(A01);
        A0Q.A09("params", A01);
        C30G A0H2 = AbF.A0H(4);
        DKC.A1S(A0Q, A0H2, "params");
        DKC.A1S(C3tA.A00(), A0H2, "nt_context");
        A0L = AbK.A0L(A0H2);
        A0L.A0B = false;
        A0L.A07 = 0Pz.A0Y(A0L.A07, str, '-');
        A00 = FwL.A00(settableFuture, 3);
        if (((1Ew) 1Br.A0B(f8z.A01)).BNC()) {
        }
        1VX.A0G(context).A02(A0L, A00, 4YV.A11(f8z.A00));
    }

    public final void A01(Context context, FbUserSession fbUserSession, GHZ ghz, DqI dqI) {
        11T.A0F(fbUserSession, 0);
        4YV.A11(this.A00).execute(new G5Z(context, fbUserSession, ghz, this, dqI));
    }

    public final void A02(Context context, ETW etw, DqI dqI, java.util.Map map) {
        4YV.A11(this.A00).execute(new G67(context, 4YV.A0E(context), null, etw, this, dqI, map));
    }
}
