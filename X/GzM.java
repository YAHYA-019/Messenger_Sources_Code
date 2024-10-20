package X;

import android.app.Activity;
import com.facebook.rtc.activities.CallPermissionsActivity;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: GzM.class */
public final class GzM extends Frf {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ IRF A01;
    public final /* synthetic */ SettableFuture A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public GzM(Activity activity, IRF irf, SettableFuture settableFuture, Integer num, String str, boolean z) {
        this.A03 = num;
        this.A00 = activity;
        this.A02 = settableFuture;
        this.A01 = irf;
        this.A04 = str;
        this.A05 = z;
    }

    private final void A00(Integer num) {
        IRF irf = this.A01;
        2QN r0 = irf.A1e;
        r0.A0D(AnonymousClass001.A1W(num, 0S2.A01));
        if (num != 0S2.A00) {
            1Br.A07(((HUn) 1Br.A0B(irf.A1O)).A00).AZk(36319480405571678L);
        } else {
            irf.A0a();
        }
        this.A02.A04();
        irf.A0o(num, this.A04, this.A05);
        JOY.A02(r0, irf).AGy("video_toggle_set_video_state_step");
        1Br.A0C(irf.A1L);
    }

    @Override // X.Frf
    public void onPermissionsCheckCanceled() {
        AbG.A1W(this.A02, false);
        1Br.A0C(this.A01.A1L);
    }

    @Override // X.Frf
    public void onPermissionsGranted() {
        A00(this.A03);
    }

    @Override // X.Frf
    public void onPermissionsNotGranted(String[] strArr, String[] strArr2) {
        boolean A1X = 1BL.A1X(strArr, strArr2);
        Activity activity = this.A00;
        SettableFuture settableFuture = this.A02;
        IRF irf = this.A01;
        if (activity != null && !CallPermissionsActivity.A16(strArr2, strArr, A1X)) {
            4zI.A00("CallPermissionsActivity", "onPermissionsDenied.  Starting call, with optional permissions denied", new Object[0]);
        } else if ((strArr.length != A1X || !11T.A0O(strArr[0], "android.permission.CAMERA")) && (strArr2.length != A1X || !11T.A0O(strArr2[0], "android.permission.CAMERA"))) {
            AbG.A1W(settableFuture, false);
            1Br.A0C(irf.A1L);
            return;
        }
        A00(0S2.A01);
    }
}
