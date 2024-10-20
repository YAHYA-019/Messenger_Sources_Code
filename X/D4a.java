package X;

import android.os.Handler;
import com.facebook.litho.LithoView;
import com.facebook.presence.api.model.RichStatus;

/* loaded from: D4a.class */
public final class D4a implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public D4a(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A01 = obj4;
        this.A05 = obj5;
        this.A02 = obj;
    }

    public void onFailure(Throwable th) {
        switch (this.A00) {
            case 0:
                0fH.A0n("MontageShareUtil", AnonymousClass001.A0Z(th, "resolve thread key error:", 7zO.A0x(th, 0)));
                AbM.A1R(this.A04);
                return;
            case 1:
                ((Handler) this.A04).post(new D5U((CfG) this.A03));
                return;
            case 2:
                11T.A0F(th, 0);
                0fH.A0s("CcInboxUpsellsGraphqlRepository", "Exception thrown while fetching thread summary", th);
                ((C3Nb) this.A02).A00(null);
                return;
            case 3:
                0fH.A0n("ThreadCutoverViewOpenHelper", "failed to resolve one to one thread key");
                return;
            case 4:
                11T.A0F(th, 0);
                ((1FX) this.A03).set(this.A01);
                0fH.A0v("ThreadCutoverHelper", AnonymousClass001.A0Z(th, "Callback for MsysShimLookupService.resolveThreadType failed : ", AnonymousClass001.A0k()), th);
                return;
            case 5:
            case 6:
            default:
                return;
            case 7:
                11T.A0F(th, 0);
                0fH.A0r("StoryBoostingRanker", "OpFetchUserByKey future onFailure", th);
                return;
            case 8:
                11T.A0F(th, 0);
                C1566All.A08((LithoView) this.A04, (RichStatus) this.A02, (C1566All) this.A05, th.getMessage());
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x0579, code lost:
    
        if (r0.getBooleanValue(1240610283) == false) goto L104;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0819  */
    /* JADX WARN: Type inference failed for: r1v14, types: [com.google.common.util.concurrent.ListenableFuture] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 3377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D4a.onSuccess(java.lang.Object):void");
    }
}
