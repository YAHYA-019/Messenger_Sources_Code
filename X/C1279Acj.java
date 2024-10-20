package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.http.interfaces.RequestPriority;
import com.facebook.inject.FbInjector;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;

/* renamed from: X.Acj, reason: case insensitive filesystem */
/* loaded from: Acj.class */
public final class C1279Acj {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final java.util.Map A03;
    public final FbUserSession A04;

    public C1279Acj(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A04 = fbUserSession;
        this.A00 = 1Lm.A01(fbUserSession, 82722);
        this.A02 = 1BK.A0C();
        this.A01 = 1Bq.A00(65837);
        java.util.Map synchronizedMap = Collections.synchronizedMap(AnonymousClass001.A0u());
        11T.A0A(synchronizedMap);
        this.A03 = synchronizedMap;
    }

    public static final 2FT A00(C1279Acj c1279Acj, String str) {
        1Vd A0K = 7zM.A0K(FbInjector.A00());
        11T.A0A(A0K);
        if (str.length() == 0) {
            throw 1BK.A0g();
        }
        C3sa A0L = 7zM.A0L(AbJ.A0H(str), new 2Jf(2JX.class, (Class) null, "FetchPageResponsivenessQuery", (String) null, "fbandroid", 2070946108, 0, 3383700713L, 3383700713L, false, true));
        A0L.A03.A03 = RequestPriority.INTERACTIVE;
        A0L.A09(180L);
        A0L.A0A(180L);
        4YU.A1J(A0L, 280599736436178L);
        2FT A00 = AeR.A00(A0K, A0L);
        D3F d3f = D3F.A00;
        1JU r0 = 1JU.A01;
        2FT A02 = 2FP.A02(d3f, A00, r0);
        A01(c1279Acj, A02, str);
        1Kd.A0F(new D48(str, c1279Acj, 8), A02, r0);
        return A02;
    }

    public static final void A01(C1279Acj c1279Acj, ListenableFuture listenableFuture, String str) {
        if (1Br.A07(c1279Acj.A02).AZk(2342167347227348585L)) {
            c1279Acj.A03.put(str, listenableFuture);
        } else {
            synchronized (c1279Acj) {
                c1279Acj.A03.put(str, listenableFuture);
            }
        }
    }

    public static final void A02(C1279Acj c1279Acj, String str) {
        if (1Br.A07(c1279Acj.A02).AZk(2342167347227348585L)) {
            c1279Acj.A03.remove(str);
        } else {
            synchronized (c1279Acj) {
                c1279Acj.A03.remove(str);
            }
        }
    }

    public final Bj1 A03(String str) {
        Bj1 A00;
        11T.A0F(str, 0);
        if (1Br.A07(this.A02).AZk(2342167347227348585L)) {
            return ((C1280Ack) 1Br.A0B(this.A00)).A00(str);
        }
        synchronized (this) {
            A00 = ((C1280Ack) 1Br.A0B(this.A00)).A00(str);
        }
        return A00;
    }

    public final void A04(C1282Acm c1282Acm, String str) {
        C1280Ack c1280Ack = (C1280Ack) 1Br.A0B(this.A00);
        synchronized (c1280Ack) {
            if (c1282Acm == null) {
                c1282Acm = c1280Ack.A02;
            }
            c1280Ack.A01.A02(str, c1282Acm);
        }
    }
}
