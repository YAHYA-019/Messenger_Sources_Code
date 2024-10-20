package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.interstitial.api.FQLFetchInterstitialsParams;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* renamed from: X.4rz, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4rz.class */
public final class C09954rz {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1De A09;
    public final 1Br A0A;

    public C09954rz(1De r302) {
        this.A09 = r302;
        1BY r0 = r302.A00;
        this.A01 = 1Bu.A03(r0, 33031);
        this.A0A = 1Bu.A03(r0, 17108);
        this.A03 = 1Bq.A00(16431);
        this.A04 = 1Bu.A03(r0, 98766);
        this.A00 = 1Bq.A00(49320);
        this.A06 = 1Bq.A00(32817);
        this.A08 = 1Bq.A00(33032);
        this.A07 = 1Bq.A00(49322);
        this.A05 = 1Bq.A00(16504);
        this.A02 = 1Bq.A00(16617);
    }

    public final 1Ho A00(CallerContext callerContext, Collection collection) {
        FQLFetchInterstitialsParams fQLFetchInterstitialsParams = new FQLFetchInterstitialsParams(1BL.A0a(collection));
        Bundle A05 = 1BK.A05();
        A05.putParcelable(1BJ.A00(1296), fQLFetchInterstitialsParams);
        1Ho newInstance_DEPRECATED = ((BlueServiceOperationFactory) 1Br.A0B(this.A01)).newInstance_DEPRECATED(1BJ.A00(1440), A05, 0, callerContext);
        11T.A0A(newInstance_DEPRECATED);
        return newInstance_DEPRECATED;
    }

    public final C3sa A01(ImmutableList immutableList, boolean z) {
        11T.A0F(immutableList, 0);
        C03983zh c03983zh = (C03983zh) 1Bn.A0E((Context) null, this.A09.A00, 85283);
        C30G c30g = new C30G(26);
        c30g.A07("nux_ids", immutableList);
        c30g.A03("device_id", ((1H2) this.A08.A00.get()).A02());
        ((2Jf) c30g).A00.A01(((C3t8) this.A06.A00.get()).A00(), "nt_context");
        c30g.A06("avatar_nux_image_width", ((C4s1) this.A07.A00.get()).A09());
        c30g.A08("is_from_internal_tool", z);
        c30g.A08("is_caa", c03983zh.A00());
        String A03 = ((1Oe) this.A02.A00.get()).A03(C1fe.A0h);
        if (A03 != null) {
            c30g.A03("family_device_id", A03);
        }
        c30g.A08("should_query_for_animation", true);
        String A01 = ((1GS) this.A05.A00.get()).A01();
        11T.A0A(A01);
        c30g.A03("locale", A01);
        return C3sa.A00(c30g);
    }
}
