package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.inject.FbInjector;
import com.facebook.payments.p2p.messenger.common.idv.IdvPhaseLifecycleData;
import com.facebook.payments.p2p.phases.PaymentPhaseWrapper;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Fn4.class */
public final class Fn4 implements GJt {
    public 1BY A00;
    public EwT A01;
    public String A02;
    public final C00i A04 = FbInjector.A00;
    public final 6Gx A05 = DKD.A0Z();
    public final C15h A07 = G7K.A01(this, 98);
    public final C00i A06 = AbH.A0F();
    public boolean A03 = false;

    public Fn4(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    private RTQ A00() {
        String str = null;
        ImmutableMap immutableMap = RegularImmutableMap.A03;
        ImmutableMap immutableMap2 = immutableMap;
        String str2 = (String) this.A07.get();
        C1pq.A08("userId", str2);
        String str3 = this.A02;
        7aO r0 = this.A05.A00;
        if (r0 != null) {
            str = r0.A04;
        }
        EwT ewT = this.A01;
        if (ewT != null) {
            immutableMap2 = ewT.A01;
            C1pq.A08("userInput", immutableMap2);
            immutableMap = ewT.A00;
            C1pq.A08("inputFiles", immutableMap);
        }
        return new RTQ(immutableMap, immutableMap2, str3, str, str2);
    }

    @Override // X.GJt
    public void BYc(Bundle bundle, Bundle bundle2) {
    }

    @Override // X.GJt
    public ListenableFuture CBP(ImmutableList immutableList) {
        1BY r0 = this.A00;
        1FV A00 = ((FcL) 1Lo.A04((Context) null, 1Fw.A05(r0), r0, 98528)).A00(A00());
        return AbJ.A0t(this.A06, new FvT(this, immutableList, 2), A00);
    }

    @Override // X.GJt
    public ListenableFuture CYB(PaymentPhaseWrapper paymentPhaseWrapper) {
        IdvPhaseLifecycleData idvPhaseLifecycleData;
        if (paymentPhaseWrapper != null && (idvPhaseLifecycleData = paymentPhaseWrapper.A01) != null) {
            2JX r0 = paymentPhaseWrapper.A00;
            if (!DKH.A0e(r0).isEmpty()) {
                DKF.A1X("IDV", r0.A0t(GraphQLStringDefUtil.A00(), "GraphQLPaymentPhaseType", -310905986));
                this.A02 = idvPhaseLifecycleData.A00;
                this.A03 = idvPhaseLifecycleData.A01;
                return C3o5.A0J(paymentPhaseWrapper);
            }
        }
        6Gx r02 = this.A05;
        FHR fhr = new FHR("init");
        fhr.A04(ER3.A0E);
        r02.A05(fhr);
        boolean z = false;
        if (paymentPhaseWrapper != null) {
            ImmutableList A0e = DKH.A0e(paymentPhaseWrapper.A00);
            if (!A0e.isEmpty() && "IDV".equals(AbG.A0E(A0e, 0).A2R()) && ((TreeJNI) A0e.get(0)).getBooleanValue(-1691448151)) {
                z = true;
            }
        }
        this.A03 = z;
        1BY r03 = this.A00;
        return AbJ.A0t(this.A06, new Fvf(this, 19), ((FcL) 1Lo.A04((Context) null, 1Fw.A05(r03), r03, 98528)).A00(A00()));
    }

    @Override // X.GJt
    public void CjT(Bundle bundle) {
    }
}
