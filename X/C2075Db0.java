package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.payments.logging.PaymentsFlowStep;
import java.util.List;

/* renamed from: X.Db0, reason: case insensitive filesystem */
/* loaded from: Db0.class */
public final class C2075Db0 extends 1RM {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public C2075Db0(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A00 = i;
        this.A01 = obj4;
        this.A04 = obj2;
        this.A05 = str;
        this.A02 = obj3;
        this.A03 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x013d, code lost:
    
        if (android.text.TextUtils.isEmpty(r308) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void A02(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2075Db0.A02(java.lang.Object):void");
    }

    public void A03(Throwable th) {
        switch (this.A00) {
            case 0:
                CMI cmi = (CMI) this.A01;
                CMI.A00((Context) this.A03, (FbUserSession) this.A04, (BcH) this.A02, cmi, this.A05);
                return;
            case 1:
                3zH r0 = (3zH) 1Br.A0B(((EKS) this.A04).A06);
                String str = this.A05;
                String str2 = ((CallerContext) this.A01).A03;
                11T.A0A(str2);
                r0.A02(str, str2, th != null ? th.getMessage() : null, (List) this.A03);
                ((GJD) this.A02).BxV();
                return;
            default:
                E5G e5g = (E5G) this.A01;
                e5g.A02.A08(PaymentsFlowStep.A0H, e5g.A00, e5g.A01, th);
                ((GL5) this.A03).BMd(ServiceException.A00(th), (GKX) this.A04, true);
                return;
        }
    }
}
