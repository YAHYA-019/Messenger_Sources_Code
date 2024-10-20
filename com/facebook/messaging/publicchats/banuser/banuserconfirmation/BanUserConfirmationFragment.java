package com.facebook.messaging.publicchats.banuser.banuserconfirmation;

import X.0FI;
import X.1BM;
import X.1Iw;
import X.1LI;
import X.7zO;
import X.7zQ;
import X.8Xf;
import X.9De;
import X.AbJ;
import X.AnonymousClass001;
import X.Bgb;
import X.BqK;
import X.C1306Adj;
import X.C5ic;
import X.CZF;
import X.CfG;
import android.os.Build;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.user.model.User;

/* loaded from: BanUserConfirmationFragment.class */
public final class BanUserConfirmationFragment extends MigBottomSheetDialogFragment {
    public FbUserSession A00;
    public CfG A01;
    public C1306Adj A02;
    public BqK A03;
    public C5ic A04;
    public final Bgb A05 = new Bgb(this);

    /* JADX WARN: Multi-variable type inference failed */
    public static final User A05(BanUserConfirmationFragment banUserConfirmationFragment) {
        Object parcelable;
        int i = Build.VERSION.SDK_INT;
        Bundle requireArguments = banUserConfirmationFragment.requireArguments();
        if (i >= 33) {
            parcelable = requireArguments.getParcelable(PublicKeyCredentialControllerUtility.JSON_KEY_USER, User.class);
            if (parcelable == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
        } else {
            parcelable = requireArguments.getParcelable(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            if (parcelable == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
        }
        return (User) parcelable;
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return 9De.A00();
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        this.A02 = AbJ.A0W();
        return new 8Xf(CZF.A00(this, 33), A1F(), A05(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1512651063);
        super.onCreate(bundle);
        this.A00 = 1BM.A01(this);
        this.A04 = 7zQ.A0l();
        this.A03 = (BqK) 7zO.A0l(this, 82729);
        0FI.A08(-1470404168, A02);
    }
}
