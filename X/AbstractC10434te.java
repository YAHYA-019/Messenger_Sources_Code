package X;

import android.content.Context;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* renamed from: X.4te, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4te.class */
public abstract class AbstractC10434te {
    public static final void A00(Context context) {
        String str;
        11T.A0F(context, 0);
        FbNetworkManager fbNetworkManager = (FbNetworkManager) 1Bi.A03(16687);
        C10264sx c10264sx = (C10264sx) 1Bn.A0E(context, (1BY) null, 82240);
        Integer num = fbNetworkManager.A0K() ? 0S2.A00 : fbNetworkManager.A0N() ? 0S2.A01 : 0S2.A0C;
        int intValue = num.intValue();
        switch (intValue) {
            case 0:
                str = "WIFI";
                break;
            case 1:
                str = "CELLULAR";
                break;
            default:
                str = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
                break;
        }
        0fH.A0j("MessageSearchHelper", 0Pz.A0W("Network status has been updated ", str));
        MailboxFeature mailboxFeature = (MailboxFeature) 1Lm.A07(((1Fv) 1Bi.A03(66351)).A04(), c10264sx.A02.A00, 82465);
        Iah iah = new Iah(num, c10264sx, 6);
        int i = 2;
        if (intValue == 0) {
            i = 1;
        } else if (intValue != 1) {
            i = 0;
        }
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new A0E(i, 0, mailboxFeature, mailboxFutureImpl))) {
            mailboxFutureImpl.cancel(false);
        }
        mailboxFutureImpl.addResultCallback(iah);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (X.C1gb.A02((X.C1gb) r0).AZk(36322280725955866L) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A01(boolean r301) {
        /*
            r0 = 66630(0x10446, float:9.3369E-41)
            r302 = r0
            r0 = r301
            if (r0 == 0) goto L30
            r0 = r302
            java.lang.Object r0 = X.1Bi.A03(r0)     // Catch: java.lang.Throwable -> Lf
            r303 = r0
            goto L10
        Lf:
            throw r0
        L10:
            r0 = r303
            X.1gb r0 = (X.C1gb) r0
            r303 = r0
            r0 = r303
            X.1CO r0 = X.C1gb.A02(r0)
            r304 = r0
            r0 = 36322280725955866(0x810aec001a451a, double:3.033694816954927E-306)
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.AZk(r1)
            r307 = r0
            r0 = 1
            r302 = r0
            r0 = r307
            if (r0 != 0) goto L34
        L30:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L34:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC10434te.A01(boolean):boolean");
    }
}
