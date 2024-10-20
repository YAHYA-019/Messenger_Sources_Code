package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.model.art.EffectItem;
import com.facebook.rsys.crypto.gen.CryptoE2eeModel;

/* loaded from: I5n.class */
public final class I5n {
    public 1BY A00;
    public final HdH A01;
    public final HdR A02;
    public final I1V A03;
    public final 2JN A04;

    public I5n(1BO r302) {
        HdH hdH = (HdH) 1Bn.A0E((Context) null, (1BY) null, 114804);
        HdR hdR = (HdR) 1Lo.A04((Context) null, 1Fw.A05((1BY) null), (1BY) null, 115473);
        I1V i1v = (I1V) 1Bn.A0E((Context) null, (1BY) null, 115479);
        2JN r0 = (2JN) 1Lo.A04((Context) null, 1Fw.A05((1BY) null), (1BY) null, 33088);
        7zT.A1W(hdH, hdR, i1v, r0);
        this.A01 = hdH;
        this.A02 = hdR;
        this.A03 = i1v;
        this.A04 = r0;
        this.A00 = 7zL.A0Q(r302);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0525  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(X.Hqg r301, X.I5n r302, java.lang.Boolean r303, java.lang.Integer r304, int r305) {
        /*
            Method dump skipped, instructions count: 1452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I5n.A00(X.Hqg, X.I5n, java.lang.Boolean, java.lang.Integer, int):void");
    }

    public int A01() {
        1BY r0 = this.A00;
        return IFr.A01(AbL.A0W(1Lo.A04((Context) null, 1Fw.A05(r0), r0, 33088)));
    }

    public String A02() {
        1BY r0 = this.A00;
        2QN r02 = (2QO) 1Lo.A04((Context) null, 1Fw.A05(r0), r0, 99977);
        return r02.BQN() ? r02.A0r : "";
    }

    public void A03(FbUserSession fbUserSession, String str, String str2) {
        if (A05()) {
            return;
        }
        IZI izi = (JOJ) 1Lo.A04((Context) null, fbUserSession, this.A00, 83902);
        ((2Iq) 1Bi.A03(16960)).A01(0Pz.A0W("rtc_notification_shown.", str));
        IZI izi2 = izi;
        AbN.A0X(izi2).A01(izi2.A01, new Ifc("NOTIFICATION_SHOWN_", HKp.A00(new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str2})), 0Pz.A0W("NOTIFICATION_SHOWN_", str));
    }

    public void A04(String str, String str2) {
        if (A05()) {
            return;
        }
        ((2Iq) 1Bi.A03(16960)).A01(0Pz.A0v("rtc_notification_failed_to_show.", str, "_", str2));
    }

    public final boolean A05() {
        CryptoE2eeModel cryptoE2eeModel = (CryptoE2eeModel) GOo.A0p(CryptoE2eeModel.CONVERTER, this.A04.A01());
        boolean z = false;
        if (cryptoE2eeModel != null && cryptoE2eeModel.mode == 2) {
            z = true;
        }
        return z;
    }

    public boolean A06(EffectItem effectItem) {
        HPs hPs = (HPs) 1Bn.A0E((Context) null, this.A00, 115284);
        boolean z = false;
        if (!effectItem.A06() && !effectItem.A09() && A05() && !1BK.A0N(hPs.A00).AZk(36317401641659617L)) {
            z = true;
        }
        return z;
    }

    public boolean A07(EffectItem effectItem) {
        53B r0 = (53B) 1Bn.A0E((Context) null, this.A00, 115026);
        if (A05()) {
            return true;
        }
        return (effectItem.A06() || effectItem.A09()) && 53B.A00(r0).AZk(36314296383840097L);
    }
}
