package com.facebook.messaging.wellbeing.plugins.ixt.leavegroup;

import X.0CL;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Br;
import X.1Bu;
import X.1He;
import X.1Kd;
import X.1Lm;
import X.2FP;
import X.2FR;
import X.2eQ;
import X.2fE;
import X.47F;
import X.4YU;
import X.7hZ;
import X.AK5;
import X.AbI;
import X.AbJ;
import X.AbK;
import X.BTa;
import X.Bdh;
import X.BpX;
import X.C00i;
import X.C2050DaD;
import X.C2sa;
import X.C3o5;
import X.CHy;
import X.CRO;
import X.CfG;
import X.D3A;
import X.D4S;
import X.DKc;
import X.FEK;
import X.FGb;
import X.FHh;
import X.Fwk;
import X.GJj;
import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadCriteria;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.service.model.FetchThreadParams;
import com.facebook.user.model.UserKey;
import java.util.concurrent.Executor;

/* loaded from: MSGBloksIXTLeaveGroupImplementation.class */
public final class MSGBloksIXTLeaveGroupImplementation {
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.0CL] */
    public static final Object A00(Fwk fwk, FHh fHh, DKc dKc) {
        7hZ r322;
        7hZ r305;
        ThreadSummary A06;
        11T.A0F(fwk, 0);
        ?? obj = new Object();
        if (!(fwk instanceof C2050DaD)) {
            return null;
        }
        ((0CL) obj).element = ((C2050DaD) fwk).A02;
        Context context = fwk.A00;
        FEK fek = new FEK(fHh);
        1Br A01 = 1Bu.A01(context, 82631);
        ThreadKey A0Y = AbI.A0Y(String.valueOf(dKc.A00.get(0)));
        GJj gJj = ((FGb) dKc.A01(1)).A00;
        String str = ((ViewerContext) 1Bu.A06(context, 83431)).mUserId;
        11T.A0A(str);
        CRO cro = new CRO(1, fek, (Object) obj, gJj, 1Bu.A01(context, 82648), A0Y, UserKey.A00(1BK.A0n(str)));
        Executor A1C = AbJ.A1C();
        BpX bpX = (BpX) 1Bu.A06(context, 82765);
        CfG A012 = ((CHy) 1Bu.A06(context, 82650)).A01(context, 2131958716);
        A012.ABm();
        CallerContext A0B = CallerContext.A0B("MSGBloksIXTLeaveGroupImplementation");
        C2sa c2sa = C2sa.A00;
        11T.A0F(c2sa, 2);
        Bdh bdh = bpX.A01;
        C00i c00i = bpX.A00;
        Object A03 = 1Bi.A03(66234);
        11T.A0F(bdh, 1);
        1BK.A1J(c00i, 2, A03);
        1BY r0 = bdh.A00.A00;
        2fE r02 = (2fE) 1Lm.A07(AbK.A0D(r0), r0, 17064);
        if (!2fE.A01(r02, A0Y).BWh(A0Y, 0) || (A06 = r02.A06(A0Y)) == null) {
            Bundle A05 = 1BK.A05();
            A05.putParcelable("fetchThreadParams", new FetchThreadParams(1He.A04, null, ThreadCriteria.A02.A00(A0Y), null, 20, 0L, false, false, false, false, true));
            try {
                r322 = 2FP.A02(D3A.A00, 4YU.A0M(A05, A0B, (BlueServiceOperationFactory) 1Bn.A0E((Context) null, r0, 33031), 1BJ.A00(1300), true), 2eQ.A01);
            } catch (Throwable th) {
                r322 = new 7hZ(th);
                r305 = r322;
            }
        } else {
            r322 = C3o5.A0J(A06);
        }
        r305 = r322;
        if (!c2sa.equals(c2sa)) {
            r305 = BTa.A00(c2sa, r322);
        }
        2FR A032 = 2FR.A03(47F.A00(c00i, r305, "OpFetchCommunityChannel failed", "OpFetchCommunityChannel failed", new AK5(A03, 11)));
        11T.A0A(A032);
        1Kd.A0F(new D4S(12, context, cro, A012, A01), A032, A1C);
        return null;
    }
}
