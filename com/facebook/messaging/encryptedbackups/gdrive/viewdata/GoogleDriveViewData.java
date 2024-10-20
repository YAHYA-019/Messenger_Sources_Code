package com.facebook.messaging.encryptedbackups.gdrive.viewdata;

import X.04S;
import X.0DR;
import X.0Ds;
import X.0Jq;
import X.0S2;
import X.0fH;
import X.0zV;
import X.11T;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.2bX;
import X.7zM;
import X.7zO;
import X.7zR;
import X.7zS;
import X.7zU;
import X.96R;
import X.99K;
import X.9YZ;
import X.AQt;
import X.AQv;
import X.AnonymousClass001;
import X.C01i;
import X.C03i;
import X.C2b5;
import X.C4G6;
import X.C4G7;
import X.C8ro;
import X.C8rv;
import X.C8rw;
import X.C8rz;
import X.C8sI;
import X.C96q;
import X.C96z;
import X.C9X4;
import X.C9m2;
import X.C9up;
import X.C9uq;
import X.JjV;
import X.RTm;
import android.content.Context;
import androidx.lifecycle.LiveData;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: GoogleDriveViewData.class */
public final class GoogleDriveViewData {
    public String A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final 2bX A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final 96R A0J;
    public final C96z A0K;
    public final Integer A0L;
    public final C01i A0M;
    public final C4G7 A0N;
    public final 0zV A0O;
    public final boolean A0P;
    public final 1Br A0Q;

    public GoogleDriveViewData(Context context, FbUserSession fbUserSession, C96z c96z, Integer num) {
        7zR.A1N(fbUserSession, c96z);
        this.A0K = c96z;
        this.A0L = num;
        this.A07 = 1Lm.A00(context, fbUserSession, 16874);
        this.A0A = 1Lm.A00(context, fbUserSession, 68795);
        this.A0Q = 1Lm.A00(context, fbUserSession, 68798);
        this.A0F = 7zM.A0b();
        this.A0G = 1Bq.A00(68790);
        this.A0H = 7zM.A0V();
        this.A0D = 7zM.A0Z();
        this.A06 = 1Lm.A00(context, fbUserSession, 68902);
        this.A0C = 1Bu.A01(context, 68866);
        this.A0B = 7zM.A0W();
        this.A08 = 1Bu.A01(context, 68865);
        this.A0I = 1Lm.A00(context, fbUserSession, 68884);
        this.A09 = 1Bu.A01(context, 68910);
        this.A0E = 1Bu.A01(context, 66524);
        this.A0J = c96z.flowType;
        this.A0P = c96z.isFromSettingToggle;
        this.A05 = new LiveData(C8rv.A00);
        this.A01 = "";
        this.A00 = "";
        this.A0M = AQv.A00(this, C03i.A02, 7);
        C4G6 c4g6 = new C4G6(0);
        this.A0N = c4g6;
        this.A0O = 0Jq.A03(c4g6);
    }

    public static final 9YZ A00(GoogleDriveViewData googleDriveViewData) {
        return (9YZ) 1Br.A0B(googleDriveViewData.A0Q);
    }

    public static final C9up A01(GoogleDriveViewData googleDriveViewData) {
        return 7zO.A0Z(googleDriveViewData.A0F);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A02(X.99K r301, com.facebook.messaging.encryptedbackups.gdrive.viewdata.GoogleDriveViewData r302, X.0DR r303) {
        /*
            r0 = 45
            r304 = r0
            r0 = r304
            r1 = r303
            boolean r0 = X.AIe.A03(r0, r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto La6
            r0 = r303
            r306 = r0
            r0 = r303
            X.AIe r0 = (X.AIe) r0
            r306 = r0
            r0 = r306
            int r0 = r0.A00
            r307 = r0
            r0 = -1
            r1 = -1
            int r0 = r0 << r1
            r308 = r0
            r0 = r307
            r1 = r308
            r0 = r0 & r1
            r305 = r0
            r0 = r305
            if (r0 == 0) goto La6
            r0 = r307
            r1 = r308
            int r0 = r0 - r1
            r307 = r0
            r0 = r306
            r1 = r307
            r0.A00 = r1
        L3e:
            r0 = r306
            java.lang.Object r0 = r0.A02
            r309 = r0
            X.0Ds r0 = X.0Ds.A02
            r310 = r0
            r0 = r306
            int r0 = r0.A00
            r305 = r0
            r0 = 1
            r308 = r0
            r0 = r305
            if (r0 == 0) goto L78
            r0 = r305
            r1 = r308
            if (r0 != r1) goto Lb1
            r0 = r306
            java.lang.Object r0 = r0.A01
            com.facebook.messaging.encryptedbackups.gdrive.viewdata.GoogleDriveViewData r0 = (com.facebook.messaging.encryptedbackups.gdrive.viewdata.GoogleDriveViewData) r0
            r302 = r0
            r0 = r309
            X.0Dt.A00(r0)
        L6e:
            r0 = r302
            r1 = r308
            r0.A03 = r1
            X.04S r0 = X.04S.A00
            return r0
        L78:
            r0 = r309
            X.0Dt.A00(r0)
            r0 = r302
            X.4G7 r0 = r0.A0N
            r311 = r0
            r0 = r306
            r1 = r302
            r0.A01 = r1
            r0 = r306
            r1 = r308
            r0.A00 = r1
            r0 = r311
            r1 = r301
            r2 = r306
            java.lang.Object r0 = r0.CkQ(r1, r2)
            r311 = r0
            r0 = r311
            r1 = r310
            if (r0 != r1) goto L6e
            r0 = r310
            return r0
        La6:
            r0 = r302
            r1 = r303
            r2 = r304
            X.AIe r0 = X.AIe.A01(r0, r1, r2)
            r306 = r0
            goto L3e
        Lb1:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0M()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.viewdata.GoogleDriveViewData.A02(X.99K, com.facebook.messaging.encryptedbackups.gdrive.viewdata.GoogleDriveViewData, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A03(X.RLE r301, com.facebook.messaging.encryptedbackups.gdrive.viewdata.GoogleDriveViewData r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.viewdata.GoogleDriveViewData.A03(X.RLE, com.facebook.messaging.encryptedbackups.gdrive.viewdata.GoogleDriveViewData, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A04(X.RTm r301, com.facebook.messaging.encryptedbackups.gdrive.viewdata.GoogleDriveViewData r302, java.lang.String r303, X.0DR r304) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.viewdata.GoogleDriveViewData.A04(X.RTm, com.facebook.messaging.encryptedbackups.gdrive.viewdata.GoogleDriveViewData, java.lang.String, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A05(X.RTm r301, com.facebook.messaging.encryptedbackups.gdrive.viewdata.GoogleDriveViewData r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.viewdata.GoogleDriveViewData.A05(X.RTm, com.facebook.messaging.encryptedbackups.gdrive.viewdata.GoogleDriveViewData, X.0DR):java.lang.Object");
    }

    private final void A06(RTm rTm) {
        C2b5 c2b5;
        Object obj;
        0fH.A0j("GoogleDriveViewData", "deleteFileSuppressErrors()");
        A08(this, "GDRIVE_API_DELETE_FILE_START", "GDRIVE_API_DELETE_FILE_START");
        try {
            new JjV(AQt.A01(rTm, this, 44).invoke());
        } catch (Exception e) {
            c2b5 = new C2b5(e);
        }
        if (c2b5 instanceof JjV) {
            obj = null;
        } else {
            if (!(c2b5 instanceof C2b5)) {
                throw 1BK.A1F();
            }
            obj = c2b5.A00;
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            0fH.A0u("GoogleDriveViewData", "Error deleting file", th);
        }
        A08(this, "GDRIVE_API_DELETE_FILE_END", "GDRIVE_API_DELETE_FILE_END");
    }

    public static final void A07(GoogleDriveViewData googleDriveViewData, String str) {
        if (!AnonymousClass001.A1W(googleDriveViewData.A0J, 96R.A03)) {
            7zO.A0Z(googleDriveViewData.A0F).A07(str);
        } else {
            A00(googleDriveViewData).A00(str);
            C9m2.A01((C9m2) 1Br.A0B(googleDriveViewData.A0A), str, 6);
        }
    }

    public static final void A08(GoogleDriveViewData googleDriveViewData, String str, String str2) {
        int ordinal = googleDriveViewData.A0J.ordinal();
        if (ordinal == 0) {
            A00(googleDriveViewData).A00(str);
        } else if (ordinal == 1) {
            7zO.A0Z(googleDriveViewData.A0F).A07(str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (X.7zP.A0a(r301.A0B).A09() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A09() {
        /*
            r301 = this;
            r0 = r301
            X.96z r0 = r0.A0K
            r302 = r0
            X.96z r0 = X.C96z.A03
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 != r1) goto L22
            r0 = r301
            X.1Br r0 = r0.A0B
            X.1ud r0 = X.7zP.A0a(r0)
            r303 = r0
            r0 = r303
            boolean r0 = r0.A09()
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L27
        L22:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L27:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.viewdata.GoogleDriveViewData.A09():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x03b6, code lost:
    
        if (r317 != r0) goto L138;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0060. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A0A(androidx.fragment.app.FragmentActivity r302, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController r303, X.0DR r304, X.C00m r305, boolean r306) {
        /*
            Method dump skipped, instructions count: 2190
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.viewdata.GoogleDriveViewData.A0A(androidx.fragment.app.FragmentActivity, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController, X.0DR, X.00m, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A0B(X.RLE r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.viewdata.GoogleDriveViewData.A0B(X.RLE, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0184, code lost:
    
        if (r309 == r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A0C(X.RLE r302, X.0DR r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.viewdata.GoogleDriveViewData.A0C(X.RLE, X.0DR, boolean):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0318, code lost:
    
        if (r313 == r0) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0497, code lost:
    
        if (X.0CU.A0T(r0, r310, false) == true) goto L197;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A0D(X.RTm r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 1252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.viewdata.GoogleDriveViewData.A0D(X.RTm, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0145, code lost:
    
        if (r316 == r0) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A0E(X.RTm r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.viewdata.GoogleDriveViewData.A0E(X.RTm, X.0DR):java.lang.Object");
    }

    public final Object A0F(Exception exc, 0DR r303) {
        Object A02 = A02(((C9X4) 1Br.A0B(this.A08)).A00(exc, AnonymousClass001.A1W(this.A0J, 96R.A03), A09()), this, r303);
        if (A02 != 0Ds.A02) {
            A02 = 04S.A00;
        }
        return A02;
    }

    public final void A0G() {
        if (this.A0K.flowType != 96R.A03 || 11T.A0O(this.A05.getValue(), C8rz.A00)) {
            return;
        }
        C9m2 c9m2 = (C9m2) 1Br.A0B(this.A0A);
        synchronized (c9m2.A03) {
            if (c9m2.A00 instanceof C8sI) {
                C9m2.A01(c9m2, "SETUP_WITH_GDRIVE_OTHER_CANCEL", 6);
            }
        }
    }

    public final void A0H() {
        1Br r0 = this.A0F;
        7zO.A0Z(r0).A07("RESTORE_WITH_GDRIVE_SUCCESS");
        7zO.A0Z(r0).A03(0S2.A0Y);
    }

    public final void A0I() {
        int ordinal = this.A0J.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                7zO.A0Z(this.A0F).A05("RESTORE_WITH_GDRIVE_BACK_BUTTON_TAP");
            }
        } else if (this.A0P) {
            C9m2.A01((C9m2) 1Br.A0B(this.A0A), "SETUP_WITH_GDRIVE_CLOSE_BUTTON_TAP", 6);
        } else {
            7zU.A0P(this.A0G).A06("SETUP_WITH_GDRIVE_CLOSE_BUTTON_TAP");
        }
    }

    public final void A0J() {
        int ordinal = this.A0J.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                7zO.A0Z(this.A0F).A07("RESTORE_WITH_GDRIVE_SCREEN_IMPRESSION");
            }
        } else if (this.A0P) {
            C9m2 c9m2 = (C9m2) 1Br.A0B(this.A0A);
            int intValue = this.A0L.intValue();
            C9m2.A01(c9m2, intValue != 0 ? intValue != 1 ? "SETUP_WITH_HIGH_FRICTION_RESTORE_SCREEN_IMPRESSION" : "SETUP_WITH_ADVANCE_SCREEN_IMPRESSION" : "SETUP_WITH_GDRIVE_SCREEN_IMPRESSION", 8);
        } else {
            C9uq A0P = 7zU.A0P(this.A0G);
            int intValue2 = this.A0L.intValue();
            A0P.A08(intValue2 != 0 ? intValue2 != 1 ? "SETUP_WITH_HIGH_FRICTION_RESTORE_SCREEN_IMPRESSION" : "SETUP_WITH_ADVANCE_SCREEN_IMPRESSION" : "SETUP_WITH_GDRIVE_SCREEN_IMPRESSION");
        }
    }

    public final void A0K() {
        0fH.A0j("GoogleDriveViewData", "saveRecoveryCodeToBlockStoreAfterRestore()");
        7zS.A1I(this.A06, this.A0P ? C96q.A0I : 7zO.A0Z(this.A0F).A00);
    }

    public final void A0L(99K r302) {
        11T.A0F(r302, 0);
        if (r302 instanceof C8ro) {
            return;
        }
        if (AnonymousClass001.A1W(this.A0J, 96R.A03)) {
            A00(this).A00("GDRIVE_ERROR_DIALOG_IMPRESSION");
        } else {
            7zO.A0Z(this.A0F).A07("GDRIVE_ERROR_DIALOG_IMPRESSION");
        }
    }

    public final boolean A0M() {
        return 11T.A0O(this.A05.getValue(), C8rw.A00);
    }
}
