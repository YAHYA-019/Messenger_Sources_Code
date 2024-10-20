package X;

import com.facebook.quicksilver.webviewservice.QuicksilverWebviewService;
import java.util.HashMap;

/* loaded from: Fq7.class */
public final class Fq7 implements GIY {
    public final /* synthetic */ QuicksilverWebviewService A00;

    public Fq7(QuicksilverWebviewService quicksilverWebviewService) {
        this.A00 = quicksilverWebviewService;
    }

    public void Bxj(Integer num, String str, String str2, String str3) {
        FIT A0q;
        String str4;
        if (num != 0S2.A0Y) {
            if (num == 0S2.A0j) {
                A0q = DKG.A0q(this.A00);
                str4 = "consume_unsuccessful";
            }
            this.A00.Ccf(str, str2, str3);
        }
        QuicksilverWebviewService quicksilverWebviewService = this.A00;
        FI3.A03(DKG.A0r(quicksilverWebviewService).A07);
        A0q = DKG.A0q(quicksilverWebviewService);
        str4 = "purchase_unsuccessful";
        A0q.A0J(str4, (HashMap) null);
        this.A00.Ccf(str, str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void COw(java.lang.Integer r302, java.lang.Object r303, java.lang.String r304) {
        /*
            r301 = this;
            java.lang.Integer r0 = X.0S2.A0Y
            r305 = r0
            r0 = r302
            r1 = r305
            if (r0 != r1) goto L4b
            r0 = r301
            com.facebook.quicksilver.webviewservice.QuicksilverWebviewService r0 = r0.A00
            r306 = r0
            r0 = r306
            X.FI3 r0 = X.DKG.A0r(r0)
            java.lang.ref.WeakReference r0 = r0.A07
            r305 = r0
            r0 = r305
            X.FI3.A03(r0)
            r0 = r306
            X.FIT r0 = X.DKG.A0q(r0)
            r307 = r0
            java.lang.String r0 = "purchase_successful"
            r306 = r0
        L2b:
            r0 = 0
            r305 = r0
            r0 = r307
            r1 = r306
            r2 = 0
            r0.A0J(r1, r2)
        L36:
            r0 = r301
            com.facebook.quicksilver.webviewservice.QuicksilverWebviewService r0 = r0.A00
            r305 = r0
            r0 = r303
            if (r0 != 0) goto L43
            java.lang.String r0 = ""
            r303 = r0
        L43:
            r0 = r305
            r1 = r304
            r2 = r303
            r0.Ci7(r1, r2)
            return
        L4b:
            java.lang.Integer r0 = X.0S2.A0j
            r305 = r0
            r0 = r302
            r1 = r305
            if (r0 != r1) goto L36
            r0 = r301
            com.facebook.quicksilver.webviewservice.QuicksilverWebviewService r0 = r0.A00
            r305 = r0
            r0 = r305
            X.FIT r0 = X.DKG.A0q(r0)
            r307 = r0
            java.lang.String r0 = "consume_successful"
            r306 = r0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fq7.COw(java.lang.Integer, java.lang.Object, java.lang.String):void");
    }
}
