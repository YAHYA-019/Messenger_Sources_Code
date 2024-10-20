package X;

import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: L7i.class */
public final class L7i {
    public boolean A00;
    public final LtK A01 = LtK.A02(new JcX[16]);
    public final LtK A02 = LtK.A02(new Kdm[16]);
    public final LtK A03 = LtK.A02(new LPQ[16]);
    public final LtK A04 = LtK.A02(new Kdm[16]);
    public final MNF A05;

    public L7i(MNF mnf) {
        this.A05 = mnf;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014a A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0141 -> B:9:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(X.LPR r301, X.Kdm r302) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L7i.A00(X.LPR, X.Kdm):void");
    }

    public static final void A01(L7i l7i) {
        if (l7i.A00) {
            return;
        }
        l7i.A00 = true;
        MNF mnf = l7i.A05;
        M3K A00 = M3K.A00(l7i, 37);
        LtK ltK = ((AndroidComposeView) mnf).A0T;
        if (ltK.A0D(A00)) {
            return;
        }
        ltK.A0C(A00);
    }
}
