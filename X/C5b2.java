package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.inject.FbInjector;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

/* renamed from: X.5b2, reason: invalid class name */
/* loaded from: 5b2.class */
public final class C5b2 implements CallerContextable {
    public static final String __redex_internal_original_name = "MontagePrefetchAndWarmUpHelper";
    public final FbUserSession A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final java.util.Map A06;
    public final 1De A07;
    public final 1Br A08;

    public C5b2(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A07 = r303;
        this.A00 = fbUserSession;
        1BY r0 = r303.A00;
        this.A03 = 1Lm.A03(fbUserSession, r0, 68232);
        this.A02 = 1Bu.A03(r0, 49353);
        this.A01 = 1Bq.A00(67765);
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        this.A05 = 1HG.A00(A00, 66579);
        this.A04 = 1Lm.A03(fbUserSession, r0, 17038);
        this.A08 = 1Lm.A03(fbUserSession, r0, 85200);
        this.A06 = new HashMap();
    }

    public final void A00(C5ah c5ah, ImmutableList immutableList) {
        11T.A0F(c5ah, 0);
        11T.A0F(immutableList, 1);
        ((1FP) this.A01.A00.get()).D3D(3Ds.A04, 0S2.A01, new GPE(c5ah, this, immutableList), "montage_prefetch_warmup");
    }
}
