package com.facebook.messaging.encryptedbackups.restoreflow.fragment;

import X.08O;
import X.0DE;
import X.0DR;
import X.0Pz;
import X.0Q8;
import X.0S2;
import X.0fH;
import X.11T;
import X.1Bi;
import X.1Bn;
import X.1G9;
import X.1NK;
import X.1Ql;
import X.2Zo;
import X.2Zy;
import X.2aI;
import X.2aK;
import X.48X;
import X.7zM;
import X.7zO;
import X.7zP;
import X.7zQ;
import X.7zR;
import X.7zT;
import X.83X;
import X.9IO;
import X.AJG;
import X.AJi;
import X.C1ud;
import X.C1wg;
import X.C1wh;
import X.C1wj;
import X.C1wk;
import X.C3O6;
import X.C5ic;
import X.C96p;
import X.C96z;
import X.C9i0;
import X.C9qq;
import X.C9up;
import X.GF6;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.facebook.messaging.encryptedbackups.basefragment.BaseFragment;
import com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController;
import com.facebook.messaging.encryptedbackups.gdrive.viewdata.GoogleDriveViewData;
import com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.Set;

/* loaded from: HighFrictionRestoreIntroFragment.class */
public final class HighFrictionRestoreIntroFragment extends EncryptedBackupsBaseFragment implements GF6 {
    public C9i0 A00;
    public GoogleAuthController A01;
    public GoogleDriveViewData A02;
    public C5ic A03;
    public 08O A04;
    public Integer A05;
    public 2aI A06;
    public 2aI A07;
    public 48X A08;
    public C3O6 A09;
    public 83X A0A;
    public C1wh A0B;

    public static final void A0C(HighFrictionRestoreIntroFragment highFrictionRestoreIntroFragment, boolean z) {
        2aI r0 = highFrictionRestoreIntroFragment.A06;
        if (r0 == null) {
            11T.A0L("viewBoundBackgroundScope");
            throw 0Q8.createAndThrow();
        }
        2aK.A03((Integer) null, (0DE) null, new AJG(highFrictionRestoreIntroFragment, (0DR) null, 5, z), r0, 3);
    }

    public static final boolean A0D(HighFrictionRestoreIntroFragment highFrictionRestoreIntroFragment) {
        83X r0 = highFrictionRestoreIntroFragment.A0A;
        if (r0 == null) {
            11T.A0L("availableVdCache");
            throw 0Q8.createAndThrow();
        }
        Set A00 = r0.A00();
        if (A00 == null || !A00.contains(C96p.A06)) {
            return false;
        }
        C1ud A1e = highFrictionRestoreIntroFragment.A1e();
        return !7zM.A1a(A1e, C1ud.A00(A1e), 36316426691160056L);
    }

    public void A1B(Bundle bundle) {
        super.A1B(bundle);
        A1o().A03();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        String str;
        super.A1S(bundle);
        this.A09 = (C3O6) 1Bn.A0A(68812);
        this.A03 = 7zQ.A0l();
        this.A08 = 7zQ.A0f();
        C3O6 c3o6 = this.A09;
        if (c3o6 != null) {
            this.A05 = c3o6.A00(C1wj.A03);
            this.A0A = (83X) 1Bi.A03(68887);
            this.A04 = 7zR.A0l();
            this.A0B = (C1wh) 1Bi.A03(66525);
            this.A02 = new GoogleDriveViewData(requireContext(), BaseFragment.A06(this, 147583), C96z.A02, 0S2.A0C);
            if (A0D(this)) {
                GoogleDriveViewData googleDriveViewData = this.A02;
                if (googleDriveViewData == null) {
                    str = "googleDriveViewData";
                } else {
                    googleDriveViewData.A0J();
                }
            }
            this.A01 = (GoogleAuthController) 1Bn.A0A(68867);
            this.A00 = (C9i0) 7zO.A0l(this, 68871);
            A1m().A07("RESTORE_INTRO_SCREEN_IMPRESSION");
            return;
        }
        str = "touchPointProvider";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // X.GF6
    public boolean Bkd() {
        A1m().A07("RESTORE_WITH_GDRIVE_BACK_BUTTON_TAP");
        A1m().A07("RESTORE_INTRO_SCREEN_BACK_BUTTON_EXIT");
        C9up A1m = A1m();
        if (A1m.A01) {
            if (A1m.A00.finishEventOnBackPressed) {
                A1m.A07("EXIT_WITH_BACK_BUTTON");
            } else {
                A1m.A05("EXIT_WITH_BACK_BUTTON");
            }
        }
        48X r0 = this.A08;
        if (r0 == null) {
            11T.A0L("cooldownHelper");
            throw 0Q8.createAndThrow();
        }
        r0.A00();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        this.A07 = 7zO.A16(getViewLifecycleOwner());
        this.A06 = 2Zy.A00(getViewLifecycleOwner(), 2Zo.A00());
        GoogleAuthController googleAuthController = this.A01;
        if (googleAuthController == null) {
            str = "googleAuthController";
        } else {
            FragmentActivity requireActivity = requireActivity();
            Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
            GoogleDriveViewData googleDriveViewData = this.A02;
            str = "googleDriveViewData";
            if (googleDriveViewData != null) {
                9IO r0 = (9IO) googleDriveViewData.A0M.getValue();
                2aI r02 = this.A06;
                if (r02 == null) {
                    str = "viewBoundBackgroundScope";
                } else {
                    googleAuthController.A0B(requireActivity, lifecycle, r0, "HighFrictionRestoreIntroFragment", r02);
                    GoogleDriveViewData googleDriveViewData2 = this.A02;
                    if (googleDriveViewData2 != null) {
                        7zT.A1C(this, new AJi(this, null, 16), googleDriveViewData2.A0O);
                        GoogleDriveViewData googleDriveViewData3 = this.A02;
                        if (googleDriveViewData3 != null) {
                            C9qq.A00(this, googleDriveViewData3.A05, 58);
                            C1wh c1wh = this.A0B;
                            if (c1wh != null) {
                                if (c1wh.A00) {
                                    return;
                                }
                                c1wh.A00 = true;
                                C1wk A0Z = 7zP.A0Z(c1wh.A03);
                                FbSharedPreferences A03 = C1wk.A03(A0Z);
                                1G9 r03 = 1NK.A4U;
                                1G9 A01 = C1wg.A01(A0Z, r03, 1);
                                long j = -1;
                                long Av1 = A03.Av1(A01, j);
                                FbSharedPreferences A032 = C1wk.A03(A0Z);
                                1G9 r04 = 1NK.A4V;
                                int ArU = A032.ArU(C1wg.A01(A0Z, r04, 1), 0);
                                1Ql A02 = C1wk.A02(A0Z);
                                1G9 A012 = C1wg.A01(A0Z, r04, 1);
                                int i = ArU + 1;
                                A02.CaE(A012, i);
                                if (Av1 == j) {
                                    7zR.A1I(A0Z, A02, C1wg.A01(A0Z, r03, 1));
                                    0fH.A0j("NuxFlagManager", "updateHighFrictionRestoreImpressionTimeStamp to now");
                                }
                                0fH.A0j("NuxFlagManager", 0Pz.A0T("updateHighFrictionRestoreImpression to ", i));
                                A02.commitImmediately();
                                return;
                            }
                            str = "ebNuxStateManager";
                        }
                    }
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
