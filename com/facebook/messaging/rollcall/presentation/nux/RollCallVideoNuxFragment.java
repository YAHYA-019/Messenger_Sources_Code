package com.facebook.messaging.rollcall.presentation.nux;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1Iw;
import X.1LI;
import X.7zL;
import X.7zN;
import X.7zO;
import X.83S;
import X.8Kz;
import X.8Lf;
import X.9De;
import X.9zB;
import X.AnonymousClass001;
import X.C37r;
import X.DGJ;
import X.QHC;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.common.dextricks.DexStore;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: RollCallVideoNuxFragment.class */
public final class RollCallVideoNuxFragment extends MigBottomSheetDialogFragment {
    public RollCallNuxConfig A00;
    public boolean A01;
    public int A02;
    public int A03;
    public String A04;
    public String A05;

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37r(100);
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public DGJ A1E(1Iw r302) {
        return new 9zB(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        if (this.A04 == null || this.A05 == null) {
            return 7zL.A0Y();
        }
        MigColorScheme A1F = A1F();
        String str = this.A04;
        if (str == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        String str2 = this.A05;
        if (str2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        8Kz r0 = new 8Kz(this.A02, this.A03, str, 1, str2);
        RollCallNuxConfig rollCallNuxConfig = this.A00;
        if (rollCallNuxConfig != null) {
            String A0s = 7zN.A0s(this, rollCallNuxConfig.titleId);
            RollCallNuxConfig rollCallNuxConfig2 = this.A00;
            if (rollCallNuxConfig2 != null) {
                String A0s2 = 7zN.A0s(this, rollCallNuxConfig2.subtitleId);
                RollCallNuxConfig rollCallNuxConfig3 = this.A00;
                if (rollCallNuxConfig3 != null) {
                    String A0s3 = 7zN.A0s(this, rollCallNuxConfig3.buttonId);
                    return new QHC(new 8Lf(83S.A00(this, 14), 83S.A00(this, 15), A0s3, getString(2131964650)), r0, A1F, A0s, A0s2);
                }
            }
        }
        11T.A0L(DexStore.CONFIG_FILENAME);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-270253002);
        super.onCreate(bundle);
        boolean z = requireArguments().getBoolean("force_dark_mode");
        this.A01 = z;
        if (z) {
            ((BaseMigBottomSheetDialogFragment) this).A00 = (MigColorScheme) 7zO.A0l(this, 16980);
        }
        Parcelable parcelable = requireArguments().getParcelable("config_param");
        if (parcelable == null) {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A08(869981392, A02);
            throw A0h;
        }
        RollCallNuxConfig rollCallNuxConfig = (RollCallNuxConfig) parcelable;
        this.A00 = rollCallNuxConfig;
        if (rollCallNuxConfig == null) {
            11T.A0L(DexStore.CONFIG_FILENAME);
            throw 0Q8.createAndThrow();
        }
        this.A05 = rollCallNuxConfig.videoUri;
        this.A04 = rollCallNuxConfig.videoId;
        this.A03 = rollCallNuxConfig.videoWidth;
        this.A02 = rollCallNuxConfig.videoHeight;
        0FI.A08(-1349828900, A02);
    }
}
