package X;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Gqa.class */
public final class Gqa extends CZq implements DHL {
    public C2637Gjr A00;
    public HG0 A01;
    public final MutableLiveData A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final JFc A08;
    public final 1qP A09;
    public final 3Fu A0A;

    public Gqa(FbUserSession fbUserSession, Context context) {
        11T.A0G(fbUserSession, 1, context);
        this.A04 = GOn.A0a(context, fbUserSession);
        this.A06 = GOn.A0Z(context, fbUserSession);
        this.A05 = 1Lm.A00(context, fbUserSession, 114849);
        this.A07 = GOn.A0T(context, fbUserSession);
        this.A03 = GOn.A0c(context, fbUserSession);
        this.A02 = new MutableLiveData();
        this.A00 = new C2637Gjr(null, GOp.A0T(this.A03).A06().A00 ? new 8Lr(7, Boolean.valueOf(IEo.A05(this.A03)), true) : new 8Lr(7, (Object) null, false), false, true);
        this.A0A = Gyu.A00(this, 9);
        this.A08 = new IYY(this);
        this.A09 = new Gpy(this, 6);
    }

    public static void A00(H9F h9f, C2637Gjr c2637Gjr, Gqa gqa, boolean z, boolean z2) {
        8Lr r0 = c2637Gjr.A01;
        11T.A0F(r0, 3);
        C2637Gjr c2637Gjr2 = new C2637Gjr(h9f, r0, z, z2);
        gqa.A00 = c2637Gjr2;
        gqa.A02.postValue(c2637Gjr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (X.AbG.A0m(r0).A0I() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A01(X.Gqa r301) {
        /*
            r0 = r301
            X.Gjr r0 = r0.A00
            r302 = r0
            r0 = r301
            X.1Br r0 = r0.A07
            X.00i r0 = r0.A00
            r303 = r0
            r0 = r303
            X.2Qb r0 = X.AbG.A0m(r0)
            r304 = r0
            r0 = r304
            boolean r0 = r0.A0H()
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L30
            r0 = r303
            X.2Qb r0 = X.AbG.A0m(r0)
            r304 = r0
            r0 = r304
            boolean r0 = r0.A0I()
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L33
        L30:
            r0 = 0
            r306 = r0
        L33:
            r0 = r302
            boolean r0 = r0.A02
            r307 = r0
            r0 = r302
            X.H9F r0 = r0.A00
            r1 = r302
            r2 = r301
            r3 = r307
            r4 = r306
            A00(r0, r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gqa.A01(X.Gqa):void");
    }

    public Integer APa(boolean z) {
        Integer num = z ? 0S2.A00 : 0S2.A01;
        GOp.A0s(this.A04).A0w(!z);
        return num;
    }

    public ListenableFuture D3o() {
        return GOp.A0s(this.A04).A0c();
    }

    public void onAttach() {
        1Br r0 = this.A06;
        GOp.A0w(r0).A7G(this.A0A);
        GOn.A1V(AbJ.A0X(this.A07), this.A09);
        Hpr hpr = (Hpr) 1Br.A0B(this.A05);
        JFc jFc = this.A08;
        11T.A0F(jFc, 0);
        hpr.A03.add(jFc);
        C00i c00i = this.A03.A00;
        if (GOo.A0T(c00i).A06().A00) {
            HG0 hg0 = this.A01;
            if (hg0 == null) {
                hg0 = new Gpo(this, 3);
                this.A01 = hg0;
            }
            GOo.A0T(c00i).A0B(hg0);
        }
        C2637Gjr c2637Gjr = this.A00;
        A00(c2637Gjr.A00, c2637Gjr, this, GOq.A1T(r0), c2637Gjr.A03);
        A01(this);
    }

    public void onDetach() {
        GOp.A0w(this.A06).Cf7(this.A0A);
        2Qb A0X = AbJ.A0X(this.A07);
        A0X.A0V.remove(this.A09);
        Hpr hpr = (Hpr) 1Br.A0B(this.A05);
        JFc jFc = this.A08;
        11T.A0F(jFc, 0);
        hpr.A03.remove(jFc);
        HG0 hg0 = this.A01;
        if (hg0 != null) {
            GOp.A0T(this.A03).A0C(hg0);
        }
    }
}
