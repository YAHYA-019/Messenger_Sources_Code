package X;

import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.provider.Settings;
import com.facebook.acra.constants.ActionId;
import com.facebook.facecast.display.debugoverlay.FacecastDebugOverlayService;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.List;

/* loaded from: I2d.class */
public final class I2d {
    public static final 1G2 A08;
    public static final 1G2 A09;
    public static final 1G2 A0A;
    public FacecastDebugOverlayService A00;
    public boolean A01;
    public boolean A02;
    public final 1BP A07 = FbInjector.A00;
    public final 1Br A04 = 1BK.A0E();
    public final Handler A06 = AnonymousClass001.A07();
    public final IGe A03 = new IGe(this);
    public final List A05 = AnonymousClass001.A0s();

    static {
        1G2 A00 = 1G3.A00(1G0.A02, "facecastdisplay.debugoverlay");
        A0A = A00;
        A08 = 1G3.A00(A00, "positionX");
        A09 = 1G3.A00(A00, "positionY");
    }

    public final void A00(CharSequence charSequence, CharSequence charSequence2, String str) {
        QVr qVr;
        C00i c00i = this.A04.A00;
        FbSharedPreferences A0S = 1BK.A0S(c00i);
        1G2 r0 = C1gl.A0L;
        if (A0S.AZn(r0, false)) {
            if (DKD.A10() != Thread.currentThread()) {
                this.A06.post(new J1o(this, charSequence, charSequence2, str));
                return;
            }
            FacecastDebugOverlayService facecastDebugOverlayService = this.A00;
            if (facecastDebugOverlayService != null && (qVr = facecastDebugOverlayService.A00) != null) {
                String A10 = 0Pz.A10("StackType: ", "legacy", "\nBroadcastId: ", (String) null, "\nEngine Status: ", (String) null);
                QVr.A00(qVr, charSequence, charSequence2, str);
                if (A10 != null) {
                    QVr.A00(qVr, "LiveWith", A10, str);
                    return;
                }
                return;
            }
            this.A05.add(new HdS(charSequence, charSequence2, str));
            if (!1BK.A0S(c00i).AZn(r0, false) || this.A01) {
                return;
            }
            FacecastDebugOverlayService facecastDebugOverlayService2 = this.A00;
            if (facecastDebugOverlayService2 == null || facecastDebugOverlayService2.A00 == null) {
                if (Settings.canDrawOverlays(7zL.A09())) {
                    this.A01 = 7zL.A09().bindService(C3o5.A0D(7zL.A09(), FacecastDebugOverlayService.class), (ServiceConnection) this.A03, 513);
                    return;
                }
                if (this.A02) {
                    return;
                }
                Intent A0A2 = 4YU.A0A(1BJ.A00(330));
                A0A2.setData(C0A2.A03(0Pz.A0W(1BJ.A00(ActionId.RTMP_PACKET_RECEIVED), 7zL.A09().getPackageName())));
                DKC.A1I(7zL.A09(), "[FB-Only] Need overlay permission to show the facecast debug overlay.", 1);
                0LS.A02(7zL.A09(), A0A2);
                this.A02 = true;
            }
        }
    }
}
