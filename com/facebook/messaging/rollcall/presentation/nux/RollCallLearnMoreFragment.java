package com.facebook.messaging.rollcall.presentation.nux;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1Bi;
import X.1Iw;
import X.1LI;
import X.2yD;
import X.7zN;
import X.7zO;
import X.8Lf;
import X.8Ll;
import X.8NJ;
import X.8Tn;
import X.9De;
import X.C1u3;
import X.C37r;
import X.C37s;
import X.C61c;
import X.C8xf;
import X.DGJ;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.common.dextricks.DexStore;
import com.facebook.messaging.rollcall.presentation.nux.RollCallLearnMoreFragment;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* loaded from: RollCallLearnMoreFragment.class */
public final class RollCallLearnMoreFragment extends MigBottomSheetDialogFragment {
    public RollCallLearnMoreNuxConfig A00;

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        int i;
        C61c c61c = (C61c) 1Bi.A03(68021);
        if (2yD.A03(C61c.A00(c61c), 36320790371319502L)) {
            i = 100;
        } else {
            if (!c61c.A08()) {
                return new C37s(80);
            }
            i = 85;
        }
        return new C37r(i);
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public DGJ A1E(1Iw r302) {
        return new DGJ() { // from class: X.9z9
            public 1LI AJE(1Iw r3022, MigColorScheme migColorScheme) {
                1BK.A1M(r3022, migColorScheme);
                C1u2 A0I = 4YV.A0I();
                C1rq A01 = C1rg.A01(r3022, null, 0);
                A01.A0N();
                7zO.A1H(A01, 2RH.A03);
                C2cm A00 = C2cl.A00(r3022);
                7zN.A18(A00, C1u3.A0U, A0I);
                7zM.A1H(A00, migColorScheme);
                A00.A2W();
                7zR.A1A(A00, new AR2(RollCallLearnMoreFragment.this, 33));
                return 7zL.A0c(A00, A01);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        8Tn A07 = 8Tn.A07(r302, this);
        RollCallLearnMoreNuxConfig rollCallLearnMoreNuxConfig = this.A00;
        if (rollCallLearnMoreNuxConfig != null) {
            String string = getString(rollCallLearnMoreNuxConfig.titleId);
            RollCallLearnMoreNuxConfig rollCallLearnMoreNuxConfig2 = this.A00;
            if (rollCallLearnMoreNuxConfig2 != null) {
                Integer num = rollCallLearnMoreNuxConfig2.subtitleId;
                String string2 = num != null ? getString(num.intValue()) : null;
                C8xf A00 = C8xf.A00(2132411118);
                RollCallLearnMoreNuxConfig rollCallLearnMoreNuxConfig3 = this.A00;
                if (rollCallLearnMoreNuxConfig3 != null) {
                    8Ll r0 = new 8Ll(rollCallLearnMoreNuxConfig3.icon1Type, (CharSequence) null, getString(rollCallLearnMoreNuxConfig3.icon1TitleId), (String) null, 10);
                    C1u3 c1u3 = C1u3.A6a;
                    RollCallLearnMoreNuxConfig rollCallLearnMoreNuxConfig4 = this.A00;
                    if (rollCallLearnMoreNuxConfig4 != null) {
                        8Ll r02 = new 8Ll(c1u3, (CharSequence) null, getString(rollCallLearnMoreNuxConfig4.icon2TitleId), (String) null, 10);
                        C1u3 c1u32 = C1u3.A3A;
                        RollCallLearnMoreNuxConfig rollCallLearnMoreNuxConfig5 = this.A00;
                        if (rollCallLearnMoreNuxConfig5 != null) {
                            List A0v = 7zN.A0v(r0, r02, new 8Ll(c1u32, (CharSequence) null, getString(rollCallLearnMoreNuxConfig5.icon3TitleId), (String) null, 10));
                            11T.A0D(string);
                            A07.A2Y(new 8NJ((8Lf) null, A00, string2, (CharSequence) null, string, A0v, true));
                            A07.A2X();
                            A07.A1A(10.0f);
                            return A07.A2W();
                        }
                    }
                }
            }
        }
        11T.A0L(DexStore.CONFIG_FILENAME);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-1384950673);
        super.onCreate(bundle);
        if (requireArguments().getBoolean("force_dark_mode_param")) {
            ((BaseMigBottomSheetDialogFragment) this).A00 = (MigColorScheme) 7zO.A0l(this, 16980);
        }
        Parcelable parcelable = requireArguments().getParcelable("config_param");
        if (parcelable != null) {
            this.A00 = (RollCallLearnMoreNuxConfig) parcelable;
            0FI.A08(113691870, A02);
        } else {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A08(-191028210, A02);
            throw A0h;
        }
    }
}
