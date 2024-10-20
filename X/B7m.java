package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: B7m.class */
public final class B7m extends GS2 {
    public String A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final FbUserSession A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final CDR A0G;
    public final 1qP A0H;
    public final CpC A0I;
    public final 2TO A0J;
    public final List A0K;
    public final List A0L;
    public final java.util.Map A0M;
    public final java.util.Map A0N;
    public final C15h A0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B7m(FbUserSession fbUserSession, Context context) {
        super("AddParticipantsPresenter");
        1BL.A1F(fbUserSession, context);
        this.A05 = fbUserSession;
        this.A04 = context;
        this.A0A = 1Bq.A00(65723);
        this.A0D = 1Bq.A00(16461);
        this.A06 = 1Bu.A01(context, 85069);
        1Br A01 = 1Bu.A01(context, 148135);
        this.A0C = A01;
        1Br.A0C(A01);
        this.A0I = new CpC(context, fbUserSession);
        this.A09 = 1Bu.A01(context, 1010);
        this.A0O = DBe.A00(this, 96);
        this.A07 = 1Lm.A00(context, fbUserSession, 99475);
        this.A0F = 1Bu.A01(context, 85079);
        this.A08 = 1Lm.A00(context, fbUserSession, 85218);
        this.A0E = 1Lm.A00(context, fbUserSession, 17016);
        this.A0B = 1Lm.A00(context, fbUserSession, 33088);
        this.A0K = AnonymousClass001.A0s();
        this.A0L = AnonymousClass001.A0s();
        this.A0M = AnonymousClass001.A0u();
        this.A0N = AnonymousClass001.A0u();
        this.A0J = new BFd(this, 1);
        this.A0H = new B7W(this, 0);
        C1F6 c1f6 = (C1F6) 1Br.A0B(this.A09);
        Context A012 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            CDR cdr = new CDR();
            1Bn.A0K();
            FbInjector.A04(A012);
            this.A0G = cdr;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A012);
            throw th;
        }
    }

    public static final ImmutableList A00(B7m b7m) {
        String str;
        ImmutableList copyOf = ImmutableList.copyOf((Collection) ((!b7m.A01 || (str = b7m.A00) == null || str.length() == 0) ? b7m.A0K : b7m.A0L));
        11T.A0D(copyOf);
        return copyOf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0366, code lost:
    
        if (((X.HpO) X.1Br.A0B(r301.A08)).A03.size() > 1) goto L56;
     */
    /* JADX WARN: Type inference failed for: r305v3, types: [java.lang.Object, X.By2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A01(X.B7m r301) {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B7m.A01(X.B7m):void");
    }

    public boolean A0a() {
        return true;
    }

    public void A0b() {
        ((1XZ) 1Br.A0B(this.A0A)).Cez(this.A0J);
        COZ coz = (COZ) 1Br.A0B(this.A06);
        ((2Qa) 1Lo.A04((Context) null, this.A05, coz.A01, 33089)).A03(coz.A08);
        ((C1O) coz.A02.get()).A00.remove(coz);
        JZj jZj = coz.A00;
        if (jZj != null) {
            jZj.dismiss();
            coz.A00 = null;
        }
        2Qb A0X = AbJ.A0X(this.A0E);
        A0X.A0V.remove(this.A0H);
        ImmutableList.Builder A0h = 4YU.A0h();
        A0h.addAll(this.A0K);
        1Du it = AbJ.A0s(A0h, this.A0L).iterator();
        while (it.hasNext()) {
            DIe dIe = (DIe) it.next();
            dIe.Cqj(null);
            dIe.AEC();
        }
    }

    public /* bridge */ /* synthetic */ void A0c(JFq jFq) {
        11T.A0F(jFq, 0);
        ((1XZ) 1Br.A0B(this.A0A)).A77(this.A0J);
        COZ coz = (COZ) 1Br.A0B(this.A06);
        FbUserSession fbUserSession = this.A05;
        ((2Qa) 1Lo.A04((Context) null, fbUserSession, coz.A01, 33089)).A02(coz.A08);
        ((C1O) coz.A02.get()).A00.add(coz);
        2Qb A0X = AbJ.A0X(this.A0E);
        A0X.A0V.add(this.A0H);
        List list = this.A0K;
        if (list.isEmpty()) {
            Object obj = this.A0O.get();
            11T.A0A(obj);
            list.add(obj);
        }
        List list2 = this.A0L;
        if (list2.isEmpty()) {
            list2.add(this.A0I);
        }
        ImmutableList.Builder A0h = 4YU.A0h();
        A0h.addAll(list);
        1Du it = AbJ.A0s(A0h, list2).iterator();
        while (it.hasNext()) {
            ((DIe) it.next()).Cqj(this);
        }
        1Du it2 = A00(this).iterator();
        while (it2.hasNext()) {
            DIe dIe = (DIe) it2.next();
            if (dIe.Au1().isEmpty()) {
                dIe.D1s(fbUserSession);
            } else {
                dIe.CbG();
            }
        }
        A01(this);
    }

    public void A0d(DIe dIe, boolean z) {
        boolean z2;
        Boolean valueOf = Boolean.valueOf(z);
        java.util.Map map = this.A0M;
        map.put(dIe, valueOf);
        if (A00(this).contains(dIe)) {
            1Du it = A00(this).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                Object next = it.next();
                if (map.containsKey(next) && 1BK.A1X(map.get(next), true)) {
                    z2 = true;
                    break;
                }
            }
            if (this.A03 != z2) {
                this.A03 = z2;
                4zI.A03.A05("AddParticipantsPresenter", "isLoading: %s", new Object[]{Boolean.valueOf(z2)});
                A01(this);
            }
        }
    }
}
