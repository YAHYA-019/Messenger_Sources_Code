package X;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.tincan.msys.TincanMsysMediaTranscodingHelper;
import com.facebook.rp.platform.stunconnectionchecker.StunConnectionChecker;
import com.facebook.rtc.activities.ZeroRatingActivity;
import com.facebook.rtc.interfaces.RtcCallStartParams;
import com.facebook.stickers.model.Sticker;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.base.Objects;

/* loaded from: Inc.class */
public final class Inc implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public Inc(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
    }

    private void A00() {
        0D2 r0;
        Dialog dialog;
        Object obj = (Context) this.A02;
        if ((obj instanceof C1em) && C0D1.A01(((C1em) obj).BDe()) && (dialog = (r0 = (0D2) this.A03).A01) != null && dialog.isShowing()) {
            r0.A0o();
        }
    }

    public void onFailure(Throwable th) {
        switch (this.A00) {
            case 0:
                A00();
                return;
            case 1:
                0fH.A0r(4YT.A00(307), "failed future callback", th);
                throw AnonymousClass001.A0U(th);
            case 2:
                11T.A0F(th, 0);
                4zI.A03.A02("RtcLauncherImpl", "Unable to update thread key in startMultiwayCallAfterPermissionCheck as needed", th, new Object[0]);
                return;
            default:
                0fH.A0z("StickerDrawable", "Error loading sticker %s", th, new Object[]{((C6qc) this.A03).A06});
                return;
        }
    }

    public void onSuccess(Object obj) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        switch (this.A00) {
            case 0:
                A00();
                return;
            case 1:
                ((1FX) this.A03).set(((5HQ) ((TincanMsysMediaTranscodingHelper) this.A01).A05.get()).A01((MediaResource) this.A02));
                return;
            case 2:
                I4B i4b = new I4B((RtcCallStartParams) this.A02);
                i4b.A01 = (ThreadKey) obj;
                RtcCallStartParams rtcCallStartParams = new RtcCallStartParams(i4b);
                C5V0 c5v0 = (C5V0) this.A03;
                FbUserSession fbUserSession = (FbUserSession) this.A01;
                JQN BGd = I7M.A00(c5v0.A0F).BGd(rtcCallStartParams.A09);
                BGd.Bct("RtcLauncher_startMultiwayCallAfterPermissionCheck", (String) null);
                if (rtcCallStartParams.A00 == 0 || !((2BQ) 1Br.A0B(c5v0.A07)).A05("free_messenger_rtc_interstitial")) {
                    c5v0.A0E(fbUserSession, rtcCallStartParams);
                } else {
                    BGd.ARr("multiway_zero_rating_interstitial");
                    IEA.A04((IEA) 4YU.A0n(fbUserSession, c5v0.A00, 115612), 16252929, (short) 4);
                    try {
                        C00i c00i = c5v0.A03.A00;
                        Intent putExtra = C3o5.A0D((Context) c00i.get(), ZeroRatingActivity.class).putExtra("EXTRA_CALL_PARAMS", rtcCallStartParams);
                        11T.A0A(putExtra);
                        putExtra.setFlags(268468224);
                        AbK.A0r(c5v0.A0H).A0A((Context) c00i.get(), putExtra);
                    } catch (ActivityNotFoundException e) {
                        4zI.A03.A09("RtcLauncherImpl", "ZeroRatingActivity was not found", new Object[]{e});
                        c5v0.A0E(fbUserSession, rtcCallStartParams);
                    }
                }
                if (((2BR) 1Br.A0B(c5v0.A0N)).A0L()) {
                    C00i c00i2 = c5v0.A09.A00;
                    if (1BK.A0M(c00i2).AZk(36326240684103014L)) {
                        ((2BQ) 1Br.A0B(c5v0.A07)).A05("free_messenger_rtc_interstitial");
                        StunConnectionChecker stunConnectionChecker = new StunConnectionChecker();
                        Context A05 = AbJ.A05(c5v0.A03);
                        boolean AZk = 1BK.A0M(c00i2).AZk(2342169249897862503L);
                        int A00 = 2yD.A00(1BK.A0M(c00i2), 36607715660930873L);
                        1BK.A0M(c00i2).AZk(2342169249898059112L);
                        int A002 = 2yD.A00(1BK.A0M(c00i2), 36607715660996410L);
                        Iez iez = new Iez(rtcCallStartParams);
                        11T.A0F(A05, 0);
                        if (AZk) {
                            Object systemService = A05.getSystemService("connectivity");
                            if (!(systemService instanceof ConnectivityManager) || (connectivityManager = (ConnectivityManager) systemService) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() != 0) {
                                4zI.A03.A06("StunConnectionChecker", "not testing STUN connection due to not cellular connection", new Object[0]);
                                return;
                            }
                        }
                        2aK.A03((Integer) null, (0DE) null, new StunConnectionChecker.testConnectionIfEnabled.1(iez, stunConnectionChecker, (0DR) null, A00, A002, stunConnectionChecker.A00.now()), 7zN.A0y(), 3);
                        return;
                    }
                    return;
                }
                return;
            default:
                Sticker sticker = (Sticker) obj;
                C6qc c6qc = (C6qc) this.A03;
                String str = c6qc.A06;
                6fM r0 = (6fM) this.A01;
                InterfaceC07034in interfaceC07034in = 6fM.A0I;
                if (!Objects.equal(str, r0.A07) || sticker == null) {
                    return;
                }
                6fM.A00((FbUserSession) this.A02, r0, c6qc, r0.A05.A09(sticker, c6qc));
                80T r02 = r0.A0D;
                if (r02 != null) {
                    r02.C4g(sticker, c6qc);
                    return;
                }
                return;
        }
    }
}
