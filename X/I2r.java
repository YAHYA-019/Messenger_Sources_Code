package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.PrivacyContextCoding;
import com.facebook.user.model.User;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: I2r.class */
public final class I2r {
    public 1Yj A00;
    public long A01;
    public final C0t9 A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final HeL A09;
    public final Gs9 A0A;
    public final PrivacyContext A0B;
    public final 2AV A0C;
    public final AtomicBoolean A0D;
    public final AtomicBoolean A0E;
    public final C01i A0F;
    public final FbUserSession A0G;
    public final 1BP A0H;

    /* JADX WARN: Removed duplicated region for block: B:27:0x01b1 A[Catch: Exception -> 0x0213, all -> 0x022b, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0213, blocks: (B:17:0x00f1, B:21:0x00ff, B:24:0x010b, B:27:0x01b1, B:29:0x01e3, B:30:0x01e8, B:35:0x01b9, B:37:0x01c7, B:38:0x01ce, B:40:0x01d7, B:41:0x01dc, B:41:0x01dc, B:43:0x0115, B:44:0x011a, B:47:0x0126, B:50:0x0130, B:51:0x013a, B:56:0x019d, B:56:0x019d, B:58:0x01a2, B:59:0x014b, B:61:0x015c, B:72:0x0198, B:80:0x0200, B:82:0x020b, B:84:0x0212), top: B:16:0x00f1, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b9 A[Catch: Exception -> 0x0213, all -> 0x022b, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0213, blocks: (B:17:0x00f1, B:21:0x00ff, B:24:0x010b, B:27:0x01b1, B:29:0x01e3, B:30:0x01e8, B:35:0x01b9, B:37:0x01c7, B:38:0x01ce, B:40:0x01d7, B:41:0x01dc, B:41:0x01dc, B:43:0x0115, B:44:0x011a, B:47:0x0126, B:50:0x0130, B:51:0x013a, B:56:0x019d, B:56:0x019d, B:58:0x01a2, B:59:0x014b, B:61:0x015c, B:72:0x0198, B:80:0x0200, B:82:0x020b, B:84:0x0212), top: B:16:0x00f1, outer: #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public I2r(com.facebook.auth.usersession.FbUserSession r302) {
        /*
            Method dump skipped, instructions count: 1142
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I2r.<init>(com.facebook.auth.usersession.FbUserSession):void");
    }

    public static final void A00(I2r i2r, Integer num) {
        int i;
        int i2;
        PrivacyContext newPrivacyContextNative = PrivacyContextCoding.newPrivacyContextNative(null, "FBLegacyBroker", Long.toString(681066249448173L));
        11T.A0A(newPrivacyContextNative);
        String A0s = 7zR.A0s();
        JSONObject A12 = AnonymousClass001.A12();
        try {
            switch (num.intValue()) {
                case 0:
                    i2 = 1;
                    break;
                case 1:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
            A12.put("availability_status", i2).put("mutation_id", A0s).put("capabilities", 74);
            2AV r0 = i2r.A0C;
            String obj = A12.toString();
            1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
            MailboxFutureImpl A0P = 1BK.A0P(AQV);
            1Um.A02(AQV, new Iar(r0, A0P, obj, 11), A0P, false);
        } catch (JSONException unused) {
        }
        2AV r02 = i2r.A0C;
        switch (num.intValue()) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            default:
                i = 3;
                break;
        }
        String A0t = 1BK.A0t();
        1Um AQV2 = r02.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P2 = 1BK.A0P(AQV2);
        1Um.A02(AQV2, new IbM(r02, newPrivacyContextNative, A0P2, A0t, i, 1), A0P2, false);
    }

    public void A01() {
        int i;
        C00j.A05("UnifiedPresenceMailboxImpl.loadPresenceStateForAllUsers", -98903474);
        try {
            C00i c00i = this.A04.A00;
            if (((1Ex) c00i.get()).BTw() && !((1Ex) c00i.get()).BU1()) {
                User Auc = ((1Ex) c00i.get()).Auc();
                if (!11T.A0O(Auc != null ? Auc.A13 : null, ConstantsKt.CAMERA_ID_FRONT)) {
                    AtomicBoolean atomicBoolean = this.A0D;
                    if (!atomicBoolean.get() || 1Br.A00(this.A05) - this.A01 >= 5000) {
                        C00i c00i2 = this.A05.A00;
                        if (4YV.A05(c00i2) - this.A01 < 1Br.A06(this.A06).Auy(36600959677568275L)) {
                            i = -1210974565;
                        } else {
                            atomicBoolean.set(true);
                            this.A01 = 4YV.A05(c00i2);
                            this.A0C.A02(new Iby(this, 39), this.A0B, 7zQ.A1a(this.A0F));
                            i = -788456885;
                        }
                    } else {
                        i = 752186249;
                    }
                    C00j.A01(i);
                }
            }
            i = 2104608294;
            C00j.A01(i);
        } catch (Throwable th) {
            C00j.A01(1516368581);
            throw th;
        }
    }
}
