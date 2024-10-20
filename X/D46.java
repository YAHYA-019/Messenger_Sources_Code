package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: D46.class */
public final class D46 implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public D46(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public void onFailure(Throwable th) {
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                ((C10374tG) this.A01).A04.remove(this.A02);
                return;
            case 1:
                0fH.A0j("ThreadViewFriendingUtil", "SGF QP failed to fetch small group param");
                7KN.A00 = null;
                7zL.A1R(this.A01);
                return;
            case 2:
                11T.A0F(th, 0);
                str = "MarketplaceReportBuyerCtaHandler";
                str2 = "Error fetching marketplace thread data";
                0fH.A0r(str, str2, th);
                return;
            case 3:
                11T.A0F(th, 0);
                str = "MarketplaceReportSellerCtaHandler";
                str2 = "Error fetching marketplace thread data";
                0fH.A0r(str, str2, th);
                return;
            case 4:
                ((1FX) this.A02).setException(th);
                return;
            case 5:
                ((1FX) this.A02).set(1BK.A0d());
                boolean z = 5Xc.A0F;
                str = "TincanMsysInitializerImpl";
                str2 = "Failed to get user id from MSYS sync";
                0fH.A0r(str, str2, th);
                return;
            case 6:
                0fH.A0p("BusinessInboxBadgeQuery", "Query business inbox badging failed.", th);
                5fJ r0 = (5fJ) this.A01;
                FbUserSession fbUserSession = (FbUserSession) this.A02;
                boolean A1Q = AnonymousClass001.A1Q(r0.A00, 2);
                r0.A00 = 0;
                if (A1Q) {
                    r0.A00(fbUserSession);
                    return;
                }
                return;
            case 7:
                ((1qG) 1Lm.A06((FbUserSession) this.A02, 66713)).A00(1BJ.A00(309), 1BJ.A00(1261), AnonymousClass001.A1Z());
                return;
            default:
                11T.A0F(th, 0);
                ((6V8) this.A02).A01("Failed to read the client autoplay setting from the server.", th);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x03e6, code lost:
    
        if (r0.isEmpty() != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x08b9, code lost:
    
        if (r307 != null) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x08bc, code lost:
    
        ((X.6HT) X.1Br.A0B(r0.A01)).A02(r0, r307);
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x08ce, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x08d7, code lost:
    
        if (r307 != null) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0913, code lost:
    
        if (r307 != null) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0916, code lost:
    
        ((X.6HT) X.1Br.A0B(r0.A01)).A01(r0, r307);
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0928, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0931, code lost:
    
        if (r307 != null) goto L387;
     */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0531  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 2619
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D46.onSuccess(java.lang.Object):void");
    }
}
