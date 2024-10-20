package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;

/* loaded from: B7b.class */
public final class B7b extends CZq {
    public int A00;
    public C00m A01;
    public final MutableLiveData A02;
    public final MutableLiveData A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final LifecycleOwner A0B;
    public final FbUserSession A0C;
    public final 1De A0D;
    public final GpZ A0E;
    public final B7W A0F;
    public final 2Qn A0G;
    public final 54D A0H;
    public final BHi A0I;

    public B7b() {
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    public B7b(LifecycleOwner lifecycleOwner, FbUserSession fbUserSession, 1De r304) {
        11T.A0F(fbUserSession, 3);
        this.A0D = r304;
        this.A0B = lifecycleOwner;
        this.A0C = fbUserSession;
        1BY r0 = r304.A00;
        this.A05 = 1Bu.A03(r0, 83719);
        this.A07 = 1Bu.A03(r0, 85146);
        this.A08 = 1Lm.A03(fbUserSession, r0, 99981);
        this.A0A = 1Lm.A03(fbUserSession, r0, 17016);
        this.A09 = 1Lm.A03(fbUserSession, r0, 33089);
        this.A04 = 1Lm.A03(fbUserSession, r0, 99475);
        this.A06 = 1Lm.A03(fbUserSession, r0, 82190);
        this.A03 = 7zL.A0H();
        this.A02 = new LiveData(Boolean.valueOf(A01(this)));
        this.A0H = new 54D(fbUserSession, AbJ.A05(this.A05));
        this.A0F = new B7W(this, 4);
        this.A0E = new GpZ(this, 17);
        this.A0I = new BHi(this, 4);
        this.A0G = new Cp7(this, 0);
    }

    public static final void A00(B7b b7b) {
        MutableLiveData mutableLiveData;
        Object obj;
        C00i c00i = b7b.A0A.A00;
        int A07 = AbG.A0m(c00i).A07();
        if (AbG.A0m(c00i).A0Q() && b7b.A00 != A07) {
            b7b.A00 = A07;
            mutableLiveData = b7b.A03;
            BqQ bqQ = (BqQ) 1Br.A0B(b7b.A07);
            LifecycleOwner lifecycleOwner = b7b.A0B;
            FbUserSession fbUserSession = b7b.A0C;
            4YV.A1N(lifecycleOwner, fbUserSession);
            try {
                if (A07 == 1 || A07 == 4) {
                    C1F6 c1f6 = (C1F6) 1Br.A0B(bqQ.A01);
                    Context A04 = AbI.A04(bqQ.A00);
                    bqQ = FbInjector.A01();
                    AbL.A0y(c1f6);
                    new B7U(A04, lifecycleOwner, fbUserSession);
                } else {
                    C1F6 c1f62 = (C1F6) 1Br.A0B(bqQ.A02);
                    bqQ = FbInjector.A01();
                    AbL.A0y(c1f62);
                    new B7V(lifecycleOwner, fbUserSession, 7zQ.A0S(c1f62));
                }
                1Bn.A0K();
                FbInjector.A04(bqQ);
                11T.A0D(obj);
            } catch (Throwable th) {
                1Bn.A0K();
                FbInjector.A04(bqQ);
                throw th;
            }
        } else {
            if (b7b.A00 == A07) {
                return;
            }
            b7b.A00 = A07;
            mutableLiveData = b7b.A03;
            obj = null;
        }
        mutableLiveData.postValue(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0060, code lost:
    
        if (((X.2Qa) X.1Br.A0B(r301.A09)).A05() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A01(X.B7b r301) {
        /*
            r0 = r301
            X.1Br r0 = r0.A06
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.HbN r0 = (X.HbN) r0
            r302 = r0
            r0 = r302
            boolean r0 = r0.A00
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L63
            r0 = r301
            X.1Br r0 = r0.A04
            X.00i r0 = r0.A00
            r304 = r0
            r0 = r304
            java.lang.Object r0 = r0.get()
            X.JOS r0 = (X.JOS) r0
            X.GR1 r0 = (X.GR1) r0
            X.JOL r0 = r0.A08
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L63
            r0 = r304
            java.lang.Object r0 = r0.get()
            X.JOS r0 = (X.JOS) r0
            X.GR1 r0 = (X.GR1) r0
            r302 = r0
            r0 = r302
            int r0 = r0.A06
            r305 = r0
            r0 = 4
            r303 = r0
            r0 = r305
            r1 = r303
            if (r0 == r1) goto L63
            r0 = r301
            X.1Br r0 = r0.A09
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.2Qa r0 = (X.2Qa) r0
            r302 = r0
            r0 = r302
            boolean r0 = r0.A05()
            r305 = r0
            r0 = 1
            r303 = r0
            r0 = r305
            if (r0 == 0) goto L67
        L63:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L67:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B7b.A01(X.B7b):boolean");
    }

    public void onAttach() {
        2Qb A0X = AbJ.A0X(this.A0A);
        A0X.A0V.add(this.A0F);
        ((JOS) 1Br.A0B(this.A04)).A60(this.A0E);
        ((2Qa) 1Br.A0B(this.A09)).A02(this.A0G);
        ((2QT) 1Br.A0B(this.A08)).A67(this.A0I);
        this.A01 = this.A0H.A02(new J9x(this, 15), JAU.A00, true);
        this.A02.postValue(Boolean.valueOf(A01(this)));
        A00(this);
    }

    public void onDetach() {
        2Qb A0X = AbJ.A0X(this.A0A);
        A0X.A0V.remove(this.A0F);
        ((JOS) 1Br.A0B(this.A04)).CeV(this.A0E);
        ((2Qa) 1Br.A0B(this.A09)).A03(this.A0G);
        ((2QT) 1Br.A0B(this.A08)).CeZ(this.A0I);
        C00m c00m = this.A01;
        if (c00m != null) {
            c00m.invoke();
        }
        this.A01 = null;
    }
}
