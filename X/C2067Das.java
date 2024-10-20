package X;

import com.facebook.zero.cms.ZeroCmsUtil;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Das, reason: case insensitive filesystem */
/* loaded from: Das.class */
public final class C2067Das extends 1RM {
    public final int A00;
    public final Object A01;

    public C2067Das(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x027f, code lost:
    
        if (r0 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0273, code lost:
    
        if (r0 != null) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 1270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2067Das.A02(java.lang.Object):void");
    }

    public void A03(Throwable th) {
        switch (this.A00) {
            case 0:
                ((1K9) this.A01).onFailure(th);
                return;
            case 1:
                0fH.A0k("FXFBAccessLibrarySSOAndRegFlagNetworkManager", AnonymousClass001.A0Z(th, "Fetch failed: ", AnonymousClass001.A0k()));
                0fH.A0k("FXFBAccessLibrarySSOAndRegFlagAppJob", "Graphql Fetch failed");
                return;
            case 2:
                1Br.A04(((6Oj) this.A01).A04).D0v("CTARefCodeDeliveryHelper", "Messenger platform cta postback ref mutation fails.");
                return;
            case 3:
                C5d7 c5d7 = (C5d7) this.A01;
                synchronized (c5d7) {
                    c5d7.A00 = null;
                }
                return;
            case 4:
                11T.A0F(th, 0);
                6wL.A00((6wL) this.A01, (ImmutableList) null, th);
                return;
            default:
                ZeroCmsUtil zeroCmsUtil = (ZeroCmsUtil) this.A01;
                synchronized (zeroCmsUtil.A0E) {
                    zeroCmsUtil.A00 = null;
                }
                return;
        }
    }
}
