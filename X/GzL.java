package X;

import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.audio.composer.VoiceClipKeyboardView;
import com.facebook.messaging.neue.nux.NuxFragment;
import com.facebook.messaging.neue.nux.profilepic.PartialNuxCameraFragment;

/* loaded from: GzL.class */
public final class GzL extends Frf {
    public final int A00;
    public final Object A01;

    public GzL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static final QPM A00(boolean z) {
        QPM qpm = new QPM();
        qpm.setArguments(0PK.A00(7zQ.A1b(AbE.A00(404), Boolean.valueOf(z))));
        return qpm;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [androidx.fragment.app.Fragment, X.Alu, X.1pK] */
    @Override // X.Frf
    public void onPermissionsCheckCanceled() {
        switch (this.A00) {
            case 1:
                ?? r0 = (C1575Alu) this.A01;
                if (r0.A1V()) {
                    06Z childFragmentManager = r0.getChildFragmentManager();
                    11T.A0A(childFragmentManager);
                    C06c c06c = new C06c(childFragmentManager);
                    c06c.A0L(A00(r0.A05), C1575Alu.A0B);
                    c06c.A04();
                    return;
                }
                return;
            case 3:
                ICU icu = (ICU) this.A01;
                if (11T.A0O(icu.A0h, "qr_code")) {
                    9XO r02 = icu.A0b;
                    boolean z = icu.A0l;
                    String str = icu.A0i;
                    11T.A0F(str, 1);
                    7zV.A16(1Br.A02(r02.A00), z ? "qr_code_camera_access_settings_dialog_allow" : "qr_code_camera_access_consent_dialog_allow", str);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v150, types: [androidx.fragment.app.Fragment, X.Alu, X.1pK] */
    @Override // X.Frf
    public void onPermissionsGranted() {
        String str;
        HSk hSk;
        GnK gnK;
        I9K i9k;
        1pK A00;
        switch (this.A00) {
            case 0:
                2Wo r0 = ((VoiceClipKeyboardView) this.A01).A0C;
                if (r0 != null) {
                    r0.A02();
                    return;
                } else {
                    str = "audioPermissionRequestViewStubHolder";
                    break;
                }
            case 1:
                ?? r02 = (C1575Alu) this.A01;
                if (r02.A1V()) {
                    06Z childFragmentManager = r02.getChildFragmentManager();
                    11T.A0A(childFragmentManager);
                    C06c c06c = new C06c(childFragmentManager);
                    c06c.A0L(A00(r02.A05), C1575Alu.A0B);
                    c06c.A04();
                    return;
                }
                return;
            case 2:
                H4t h4t = (H4t) this.A01;
                2Wo r03 = h4t.A0M;
                if (r03 == null) {
                    str = "swipeableMediatrayPermissionRequestViewStubHolder";
                    break;
                } else {
                    r03.A02();
                    View view = h4t.A00;
                    if (view != null) {
                        view.setVisibility(0);
                        H4t.A04(h4t, true);
                        h4t.A0V();
                        return;
                    }
                    str = "loadingView";
                    break;
                }
            case 3:
                ICU icu = (ICU) this.A01;
                icu.A06 = "consent_dialogue";
                icu.A03();
                HSl hSl = icu.A03;
                if (hSl != null && (hSk = hSl.A00.A00) != null && (i9k = (gnK = hSk.A00).A02) != null) {
                    IQ1 iq1 = i9k.A00;
                    iq1.A0I();
                    IDM idm = iq1.A1J;
                    idm.A06 = true;
                    if (C6x9.A05(idm.A0K)) {
                        IDM.A03(idm);
                        idm.A0H.A0H();
                    } else {
                        IDM.A00(idm);
                        IDM.A01(idm);
                        IDM.A02(idm);
                        idm.A0H.A0H();
                        IDa iDa = idm.A0J;
                        int A0G = iDa.A06.A0G();
                        IDa.A02(iDa, A0G);
                        GVu gVu = iDa.A00;
                        if (gVu != null && (A00 = GVu.A00(gVu, A0G)) != null) {
                            IDa.A01(A00, iDa);
                        }
                    }
                    if (gnK.A03 != null) {
                        HrY hrY = (HrY) gnK.A0A.get();
                        String str2 = gnK.A03;
                        11T.A0F(str2, 0);
                        if (!hrY.A01.A00()) {
                            AbstractC2326GOr.A1P(1Br.A02(hrY.A00), 1BJ.A00(1780), str2);
                        }
                    }
                }
                if (11T.A0O(icu.A0h, "qr_code")) {
                    9XO r04 = icu.A0b;
                    boolean z = icu.A0l;
                    String str3 = icu.A0i;
                    11T.A0F(str3, 1);
                    7zV.A16(1Br.A02(r04.A00), z ? "qr_code_camera_access_settings_dialog_allow" : "qr_code_camera_access_consent_dialog_allow", str3);
                    return;
                }
                return;
            case 4:
                PartialNuxCameraFragment partialNuxCameraFragment = (PartialNuxCameraFragment) this.A01;
                IES ies = partialNuxCameraFragment.A08;
                ies.getClass();
                ies.A07(partialNuxCameraFragment.A0A.A02);
                IES ies2 = partialNuxCameraFragment.A08;
                IES.A02(ies2);
                IES.A00(Qpb.A0D, ies2);
                IES.A01(new Hy4(Qpb.A0B), ies2);
                IES ies3 = partialNuxCameraFragment.A08;
                IES.A02(ies3);
                if (ies3.A0B) {
                    partialNuxCameraFragment.A06.setVisibility(4);
                    return;
                }
                return;
            default:
                ((NuxFragment) this.A01).A1e("action_take_picture", "nux_profile_pic_take_picture");
                return;
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r0v88, types: [androidx.fragment.app.Fragment, X.Alu, X.1pK] */
    @Override // X.Frf
    public void onPermissionsNotGranted(String[] strArr, String[] strArr2) {
        HSk hSk;
        I9K i9k;
        switch (this.A00) {
            case 1:
                ?? r0 = (C1575Alu) this.A01;
                if (r0.A1V()) {
                    06Z childFragmentManager = r0.getChildFragmentManager();
                    11T.A0A(childFragmentManager);
                    C06c c06c = new C06c(childFragmentManager);
                    c06c.A0L(A00(r0.A05), C1575Alu.A0B);
                    c06c.A04();
                    return;
                }
                return;
            case 2:
            default:
                return;
            case 3:
                ICU icu = (ICU) this.A01;
                AbF.A0v(icu.A0E).A01(new FEd(new Object[]{C3Om.A01(icu.A01, (1yM) 1Br.A0B(icu.A0F))}, 2131953740));
                if (icu.A0W.A0E.A05()) {
                    HSl hSl = icu.A03;
                    if (hSl != null && (hSk = hSl.A00.A00) != null && (i9k = hSk.A00.A02) != null) {
                        IQ1 iq1 = i9k.A00;
                        CallerContext callerContext = IQ1.A1m;
                        iq1.A1N.A0o();
                    }
                    if (11T.A0O(icu.A0h, "qr_code")) {
                        9XO r02 = icu.A0b;
                        boolean z = icu.A0l;
                        String str = icu.A0i;
                        11T.A0F(str, 1);
                        7zV.A16(1Br.A02(r02.A00), z ? "qr_code_camera_access_settings_dialog_deny" : "qr_code_camera_access_consent_dialog_deny", str);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                for (String str2 : strArr) {
                    if (str2.equals("android.permission.CAMERA")) {
                        PartialNuxCameraFragment partialNuxCameraFragment = (PartialNuxCameraFragment) this.A01;
                        partialNuxCameraFragment.A0B.A04();
                        partialNuxCameraFragment.A1e(null, "nux_profile_pic_auto_skip");
                        return;
                    }
                }
                return;
        }
    }
}
