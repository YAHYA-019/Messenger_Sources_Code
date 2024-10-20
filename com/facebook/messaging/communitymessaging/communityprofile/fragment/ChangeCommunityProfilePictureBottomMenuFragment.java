package com.facebook.messaging.communitymessaging.communityprofile.fragment;

import X.0FI;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Iw;
import X.53S;
import X.53U;
import X.C00m;
import X.C5ww;
import X.C9ye;
import X.DGJ;
import X.QAg;
import android.os.Bundle;
import com.facebook.mig.bottomsheet.MigActionMenuDialogFragment;

/* loaded from: ChangeCommunityProfilePictureBottomMenuFragment.class */
public final class ChangeCommunityProfilePictureBottomMenuFragment extends MigActionMenuDialogFragment {
    public static final String[] A09 = {"android.permission.CAMERA"};
    public C5ww A00;
    public C5ww A01;
    public 53U A02;
    public 53S A03;
    public C00m A04;
    public boolean A05;
    public boolean A06;
    public final 1Br A07 = 1Bq.A00(66227);
    public final C5ww A08 = C9ye.A01(this, 19);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public DGJ A1E(1Iw r302) {
        int i = 2131953970;
        if (this.A06) {
            i = 2131953961;
        }
        String string = getString(i);
        11T.A0D(string);
        return new QAg(string);
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1181796274);
        super.onCreate(bundle);
        if (bundle != null) {
            this.A06 = bundle.getBoolean("arg_is_cover_photo");
        }
        0FI.A08(-1067354038, A02);
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("arg_is_cover_photo", this.A06);
    }
}
