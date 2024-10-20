package com.facebook.messaging.messengerprefs.notif;

import X.0fH;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.BDO;
import X.Cxe;
import com.facebook.auth.usersession.FbUserSession;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: NotifSettingsUpdateHandler.class */
public final class NotifSettingsUpdateHandler {
    public final 1Br A06 = 1Bq.A00(16432);
    public final 1Br A04 = 1Bu.A00(83252);
    public final 1Br A00 = 1Bu.A00(83253);
    public final 1Br A01 = 1Bu.A00(83254);
    public final 1Br A05 = 1Bu.A00(83256);
    public final 1Br A02 = 1Bu.A00(83265);
    public final 1Br A03 = 1Bu.A00(83255);

    public static final void A00(FbUserSession fbUserSession, NotifSettingsUpdateHandler notifSettingsUpdateHandler) {
        try {
            ((BDO) 1Lm.A06(fbUserSession, 67450)).A00(new Cxe(fbUserSession, notifSettingsUpdateHandler, 6));
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            String message = e.getMessage();
            0fH.A0s("NotifSettingsUpdateHandler", message != null ? message : "", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008e, code lost:
    
        if (r0.A04() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A01() {
        /*
            r301 = this;
            r0 = 66536(0x103e8, float:9.3237E-41)
            java.lang.Object r0 = X.1Bi.A03(r0)
            X.21W r0 = (X.21W) r0
            r302 = r0
            r0 = 131336(0x20108, float:1.84041E-40)
            java.lang.Object r0 = X.1Bn.A0A(r0)
            X.307 r0 = (X.AnonymousClass307) r0
            X.21W r0 = r0.A00
            r303 = r0
            r0 = r303
            X.1CO r0 = X.21W.A00(r0)
            r304 = r0
            r0 = 36326661590963992(0x810ee800015718, double:3.036465293626393E-306)
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.AZk(r1)
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L91
            r0 = r302
            X.1CO r0 = X.21W.A00(r0)
            r308 = r0
            r0 = 36319123923416678(0x81080d00023666, double:3.031698442317721E-306)
            r309 = r0
            X.1GD r0 = new X.1GD
            r303 = r0
            r0 = r303
            r0.<init>()
            r0 = r303
            X.1GD r0 = X.1GD.A01(r0)
            r303 = r0
            r0 = 1
            r311 = r0
            r0 = r303
            r1 = r311
            r0.A04 = r1
            r0 = r303
            X.1GD r0 = X.1GD.A01(r0)
            r303 = r0
            r0 = r303
            r1 = r311
            r0.A02 = r1
            r0 = r308
            r1 = r303
            r2 = r309
            boolean r0 = r0.AZr(r1, r2)
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L91
            r0 = r302
            boolean r0 = r0.A08()
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L91
            r0 = r302
            boolean r0 = r0.A06()
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L91
            r0 = r302
            boolean r0 = r0.A04()
            r311 = r0
            r0 = 0
            r307 = r0
            r0 = 0
            r303 = r0
            r0 = r311
            if (r0 == 0) goto L94
        L91:
            r0 = 1
            r307 = r0
        L94:
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.messengerprefs.notif.NotifSettingsUpdateHandler.A01():boolean");
    }
}
