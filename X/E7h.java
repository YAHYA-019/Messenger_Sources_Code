package X;

import android.content.Context;
import com.facebook.graphql.executor.GraphQLResult;
import com.facebook.inject.FbInjector;
import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: E7h.class */
public final class E7h extends AbstractC06534h6 {
    public C00i A00 = 1BQ.A02(66351);
    public C00i A01 = FbInjector.A00;
    public final C00i A03 = 1BV.A00(16430);
    public Semaphore A02 = new Semaphore(0);

    @Override // X.AbstractC06534h6
    public Context A00() {
        return 1BK.A04(this.A01);
    }

    @Override // X.AbstractC06534h6
    public ImmutableList A01() {
        return ImmutableList.of((Object) "NO_LAUNCH_HOLD_ON_CLIENT");
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [X.RNp, java.lang.Object] */
    @Override // X.AbstractC06534h6
    public void A03(GraphQLResult graphQLResult) {
        Object obj;
        2JY A0K;
        C7z6 c7z6;
        Em5 em5 = (Em5) C3o5.A0N(this.A00, 99686);
        if (graphQLResult == null || (obj = ((AbstractC08294mh) graphQLResult).A03) == null || (A0K = AbF.A0K((2JY) obj, 2JX.class, -1624701692)) == null || (c7z6 = (C7z6) A0K.A0L(1034957566, 7ZO.class, -978886642)) == null) {
            return;
        }
        String str = super.A00;
        C00i c00i = em5.A00;
        if (((C08504n6) 1Bn.A0A(49255)).A02(c7z6, str)) {
            ?? obj2 = new Object();
            ((RNp) obj2).A02 = c7z6.Amp();
            ((RNp) obj2).A01 = c7z6.BH7();
            ((RNp) obj2).A03 = c7z6.Axz();
            boolean BNg = c7z6.BNg();
            ((RNp) obj2).A04 = BNg;
            if (BNg) {
                ((RNp) obj2).A00 = c7z6.BHH();
            }
            EjH ejH = (EjH) c00i.get();
            String str2 = em5.A02;
            1G2 r0 = AbstractC06454gx.A00;
            1G2 A01 = 1G3.A01(r0, str2);
            C00i c00i2 = ejH.A00;
            RH1 rh1 = (RH1) new Gson().A04(1BK.A0R(c00i2).BD0(A01), RH1.class);
            if (rh1 == null) {
                rh1 = new RH1();
            }
            List list = rh1.A00;
            if (list == null) {
                list = AnonymousClass001.A0s();
                rh1.A00 = list;
            }
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str3 = ((RNp) it.next()).A02;
                    if (str3 != null && str3.equals(((RNp) obj2).A02)) {
                        break;
                    }
                }
            }
            list.add(obj2);
            1G2 A012 = 1G3.A01(r0, ejH.A01);
            1Ql A0V = 1BL.A0V(c00i2);
            A0V.CaL(A012, new Gson().A06(rh1));
            A0V.commit();
        }
        this.A02.release();
    }

    public boolean A04(TimeUnit timeUnit) {
        try {
            if (!this.A02.tryAcquire(1000L, timeUnit)) {
                return false;
            }
            4YU.A0G(this.A03).post(new S92(this));
            return true;
        } catch (InterruptedException e) {
            0fH.A0u("DelayedLaunchPrivacyFlowTriggerFetcher", "Thread interrupted when it's waiting for PFT response: %s", e);
            return false;
        }
    }
}
