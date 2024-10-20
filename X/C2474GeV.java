package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.rsys.appstate.gen.AppstateApi;
import com.facebook.rsys.appstate.gen.AppstateModel;

/* renamed from: X.GeV, reason: case insensitive filesystem */
/* loaded from: GeV.class */
public final class C2474GeV extends C1q6 {
    public final 1De A00;
    public final 1Br A01;
    public final C15h A02 = J5u.A03(this, 63);
    public final 2Qn A03 = IYv.A00(this, 38);
    public final IgU A04;
    public final 0CM A05;

    public C2474GeV(1De r302) {
        this.A00 = r302;
        this.A01 = GOp.A0J(r302);
        C08j igU = new IgU(this, 1);
        this.A04 = igU;
        this.A05 = new 0CM(new C08j[]{igU});
    }

    public static final void A00(C2474GeV c2474GeV, boolean z) {
        AppstateApi appstateApi;
        AppstateModel appstateModel = (AppstateModel) GOo.A0p(AppstateModel.CONVERTER, GOn.A0x(4YU.A0n(1Br.A03(c2474GeV.A01), c2474GeV.A00, 33088)));
        if ((appstateModel == null || appstateModel.isBackgrounded != z) && (appstateApi = (AppstateApi) c2474GeV.A02.get()) != null) {
            appstateApi.setIsBackgrounded(z);
        }
    }

    public static final void A01(C2474GeV c2474GeV, boolean z) {
        AppstateApi appstateApi;
        AppstateModel appstateModel = (AppstateModel) GOo.A0p(AppstateModel.CONVERTER, GOn.A0x(4YU.A0n(1Br.A03(c2474GeV.A01), c2474GeV.A00, 33088)));
        if ((appstateModel == null || appstateModel.isScreenOff != z) && (appstateApi = (AppstateApi) c2474GeV.A02.get()) != null) {
            appstateApi.setIsScreenOff(z);
        }
    }

    @Override // X.C1q6, X.C1pu
    public void BiN(Bundle bundle, Fragment fragment) {
        11T.A0F(fragment, 0);
        09X.A00();
        09X.A03(fragment.requireContext(), this.A05);
    }

    @Override // X.C1q6, X.C1pu, X.C1pv
    public void BtG(Fragment fragment) {
        11T.A0F(fragment, 0);
        fragment.requireContext().unregisterReceiver(this.A05);
    }

    @Override // X.C1q6, X.C1pu
    public void CHq(Fragment fragment) {
        ((2Qa) 4YU.A0n(1Br.A03(this.A01), this.A00, 33089)).A02(this.A03);
        A00(this, false);
        A01(this, false);
    }

    @Override // X.C1q6, X.C1pu, X.C1pv
    public void CMf(Fragment fragment) {
        A01(this, false);
    }

    @Override // X.C1q6, X.C1pu, X.C1pv
    public void CNf(Fragment fragment) {
        ((2Qa) 4YU.A0n(1Br.A03(this.A01), this.A00, 33089)).A03(this.A03);
        A00(this, true);
        A01(this, true);
    }
}
