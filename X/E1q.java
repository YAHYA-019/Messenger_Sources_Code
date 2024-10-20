package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: E1q.class */
public final class E1q extends GS2 {
    public final Context A00;
    public final 1De A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final DEx A09;
    public final 2JM A0A;
    public final Erw A0B;
    public final JLm A0C;
    public final ETl A0D;
    public final GF7 A0E;
    public final AtomicBoolean A0F;

    public E1q(Context context, 1De r303) {
        super("CoplayDrawerPluginPresenter");
        this.A01 = r303;
        this.A00 = context;
        this.A08 = 1Bu.A01(context, 16428);
        this.A0F = DKC.A1E(false);
        this.A06 = 1Bu.A01(context, 99473);
        this.A02 = 7zM.A0Q();
        this.A03 = 1Bu.A01(context, 85227);
        this.A04 = 1Bu.A01(context, 67677);
        this.A05 = 7zM.A0h(r303, 115728);
        this.A07 = 7zM.A0P();
        this.A0C = new E1l(this);
        this.A09 = new FjM(this);
        this.A0B = new Erw(this);
        this.A0D = new E1m(this, 0);
        this.A0E = new Fjp(this);
        this.A0A = new Fjm(this, 0);
    }

    public static final void A00(FbUserSession fbUserSession, E1q e1q) {
        Context context = e1q.A00;
        8LW A01 = new 54D(fbUserSession, context).A01();
        if (A01 == null || !9Dz.A00(A01).A00()) {
            return;
        }
        ((IED) 1Lm.A05(context, fbUserSession, 99477)).A07(0S2.A0Y);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r309v2, types: [X.Eqn, java.lang.Object] */
    public static final void A01(FbUserSession fbUserSession, E1q e1q) {
        Object obj;
        ImmutableList build;
        Context context = e1q.A00;
        FAb fAb = (FAb) 1Lm.A05(context, fbUserSession, 99472);
        FAS fas = (FAS) 1Lm.A05(context, fbUserSession, 99471);
        EzE ezE = (EzE) 1Lm.A05(context, fbUserSession, 99470);
        if (e1q.A0V().isPresent()) {
            Fju fju = (Fju) e1q.A0V().get();
            ?? obj2 = new Object();
            fju.getClass();
            obj2.A03 = fju.A03;
            obj2.A04 = fju.A04;
            obj2.A02 = fju.A02;
            obj2.A07 = fju.A07;
            obj2.A08 = fju.A08;
            obj2.A09 = fju.A09;
            obj2.A0A = fju.A0A;
            obj2.A0B = fju.A0B;
            obj2.A00 = fju.A00;
            obj2.A01 = fju.A01;
            obj2.A06 = fju.A06;
            obj2.A05 = fju.A05;
            obj = obj2;
        } else {
            obj = new Object();
        }
        obj.A0B = fas.A0A;
        obj.A05 = fas.A01();
        obj.A01 = fas.A01;
        obj.A00 = fas.A00;
        obj.A03 = fas.A03;
        List<I9O> list = fas.A09;
        if (list == null) {
            build = null;
        } else {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (I9O i9o : list) {
                final String str = i9o.A03.A03;
                11T.A0A(str);
                String str2 = i9o.A07;
                if (str2 == null) {
                    str2 = i9o.A09;
                    if (str2 == null) {
                        str2 = i9o.A08;
                    }
                }
                final String str3 = str2;
                builder.m11011add(new Object(str, str3) { // from class: X.9Op
                    public final String A00;
                    public final String A01;

                    {
                        this.A00 = str;
                        this.A01 = str3;
                    }
                });
            }
            build = builder.build();
        }
        obj.A08 = build;
        obj.A04 = (fas.A06.size() < fas.A01 || fAb.A00 != null) ? ELM.A03 : fAb.A07 ? ELM.A04 : ELM.A02;
        obj.A02 = fas.A02;
        obj.A06 = fas.A07;
        obj.A07 = fas.A08;
        obj.A09 = ezE.A02();
        obj.A0A = ezE.A01();
        e1q.A0Z(new Fju(obj));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0040, code lost:
    
        if (X.1Br.A06(((X.FFo) r0.get()).A08).AZk(36313905541553358L) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A02(X.E1q r301) {
        /*
            r0 = r301
            X.1Br r0 = r0.A04
            X.00i r0 = r0.A00
            r302 = r0
            r0 = r302
            java.lang.Object r0 = r0.get()
            X.FFo r0 = (X.FFo) r0
            r303 = r0
            r0 = r303
            boolean r0 = r0.A0T
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L43
            r0 = r302
            java.lang.Object r0 = r0.get()
            X.FFo r0 = (X.FFo) r0
            X.1Br r0 = r0.A08
            X.1CO r0 = X.1Br.A06(r0)
            r301 = r0
            r0 = 36313905541553358(0x81034e00361cce, double:3.02839831661462E-306)
            r305 = r0
            r0 = r301
            r1 = r305
            boolean r0 = r0.AZk(r1)
            r307 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r307
            if (r0 == 0) goto L45
        L43:
            r0 = 1
            r304 = r0
        L45:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E1q.A02(X.E1q):boolean");
    }

    public void A0b() {
        Context context = this.A00;
        FbUserSession A0F = 4YV.A0F(context);
        ((JOS) 1Lm.A05(context, A0F, 99475)).CeV(this.A0C);
        FAS fas = (FAS) 1Lm.A05(context, A0F, 99471);
        Erw erw = this.A0B;
        if (erw != null) {
            fas.A0I.remove(erw);
        }
        ((FAb) 1Lm.A05(context, A0F, 99472)).A06(this.A0D);
        fas.A0J.clear();
        CNU cnu = (CNU) 1Lm.A05(context, A0F, 85234);
        DEx dEx = this.A09;
        if (dEx != null) {
            cnu.A09.remove(dEx);
        }
        EzE ezE = (EzE) 1Lm.A05(context, A0F, 99470);
        GF7 gf7 = this.A0E;
        if (gf7 != null) {
            ezE.A04.remove(gf7);
        }
        ((2JN) 1Lm.A05(context, A0F, 33088)).A02(this.A0A);
    }

    public /* bridge */ /* synthetic */ void A0c(JFq jFq) {
        11T.A0F(jFq, 0);
        Context context = this.A00;
        FbUserSession A0F = 4YV.A0F(context);
        ((JOS) 1Lm.A05(context, A0F, 99475)).A60(this.A0C);
        FAS fas = (FAS) 1Lm.A05(context, A0F, 99471);
        Erw erw = this.A0B;
        if (erw != null) {
            fas.A0I.add(erw);
        }
        if (fas.A0J.isEmpty()) {
            fas.A05(EMv.A04);
        }
        ((FAb) 1Lm.A05(context, A0F, 99472)).A05(this.A0D);
        CNU cnu = (CNU) 1Lm.A05(context, A0F, 85234);
        DEx dEx = this.A09;
        if (dEx != null) {
            cnu.A09.add(dEx);
        }
        EzE ezE = (EzE) 1Lm.A05(context, A0F, 99470);
        GF7 gf7 = this.A0E;
        if (gf7 != null) {
            ezE.A04.add(gf7);
        }
        ((2JN) 1Lm.A05(context, A0F, 33088)).A03(this.A0A, AnonymousClass001.A0v());
        A01(A0F, this);
    }

    public void A0d(boolean z) {
        Context context = this.A00;
        ((EzE) 1Lm.A05(context, 4YV.A0F(context), 99470)).A00(z);
    }
}
