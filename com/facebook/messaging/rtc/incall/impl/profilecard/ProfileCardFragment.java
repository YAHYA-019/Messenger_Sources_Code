package com.facebook.messaging.rtc.incall.impl.profilecard;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BM;
import X.1Iw;
import X.1LI;
import X.1Lm;
import X.2Qa;
import X.2Qn;
import X.7zO;
import X.AV2;
import X.Cp7;
import X.QI0;
import X.QoL;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: ProfileCardFragment.class */
public final class ProfileCardFragment extends MigBottomSheetDialogFragment {
    public 2Qa A00;
    public QoL A01;
    public ProfileCardUserInfo A02;
    public final 2Qn A03 = new Cp7(this, 2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        String str;
        ProfileCardUserInfo profileCardUserInfo = this.A02;
        if (profileCardUserInfo == null) {
            str = "userInfo";
        } else {
            QoL qoL = this.A01;
            if (qoL != null) {
                return new QI0(qoL, profileCardUserInfo, (MigColorScheme) 7zO.A0l(this, 16980), new AV2(this, 3));
            }
            str = "style";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(331809116);
        super.onCreate(bundle);
        Parcelable parcelable = requireArguments().getParcelable("user_info");
        if (parcelable == null) {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A08(1509198576, A02);
            throw A0h;
        }
        this.A02 = (ProfileCardUserInfo) parcelable;
        QoL serializable = requireArguments().getSerializable("style");
        11T.A0I(serializable, "null cannot be cast to non-null type com.facebook.messaging.rtc.incall.impl.profilecard.ProfileCardStyle");
        this.A01 = serializable;
        ((BaseMigBottomSheetDialogFragment) this).A00 = (MigColorScheme) 7zO.A0l(this, 16980);
        2Qa r0 = (2Qa) 1Lm.A05(requireContext(), 1BM.A01(this), 33089);
        this.A00 = r0;
        if (r0 != null) {
            r0.A02(this.A03);
        }
        0FI.A08(235001519, A02);
    }

    public void onDestroy() {
        int A02 = 0FI.A02(428756293);
        2Qa r0 = this.A00;
        if (r0 != null) {
            r0.A03(this.A03);
        }
        super.onDestroy();
        0FI.A08(-11212530, A02);
    }
}
