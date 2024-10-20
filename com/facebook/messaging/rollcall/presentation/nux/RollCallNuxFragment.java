package com.facebook.messaging.rollcall.presentation.nux;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BM;
import X.1Iw;
import X.1LI;
import X.1Lo;
import X.1MV;
import X.7zN;
import X.7zO;
import X.83S;
import X.8Lf;
import X.8NJ;
import X.8Tn;
import X.9De;
import X.9zA;
import X.BOr;
import X.C37s;
import X.C8xf;
import X.C9ey;
import X.DGJ;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.dextricks.DexStore;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* loaded from: RollCallNuxFragment.class */
public final class RollCallNuxFragment extends MigBottomSheetDialogFragment {
    public RollCallNuxConfig A00;
    public boolean A01;
    public FbUserSession A02;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A05(RollCallNuxFragment rollCallNuxFragment, String str, String str2) {
        String str3;
        C9ey c9ey;
        long j;
        BOr bOr;
        String str4;
        FbUserSession fbUserSession = rollCallNuxFragment.A02;
        if (fbUserSession == null) {
            str3 = "fbUserSession";
        } else {
            Integer num = 1Lo.A05;
            1MV r0 = new 1MV(fbUserSession, 68525);
            RollCallNuxConfig rollCallNuxConfig = rollCallNuxFragment.A00;
            str3 = DexStore.CONFIG_FILENAME;
            if (rollCallNuxConfig != null) {
                if (rollCallNuxConfig == RollCallNuxConfig.A03) {
                    c9ey = (C9ey) r0.get();
                    j = rollCallNuxFragment.requireArguments().getLong("arg_thread_id");
                    bOr = BOr.A0o;
                    str4 = "prompt_creation_nux";
                } else {
                    if (rollCallNuxConfig != RollCallNuxConfig.A04) {
                        return;
                    }
                    c9ey = (C9ey) r0.get();
                    j = rollCallNuxFragment.requireArguments().getLong("arg_thread_id");
                    bOr = BOr.A0o;
                    str4 = "prompt_participation_nux";
                }
                C9ey.A00(bOr, c9ey, str, str2, str4, j);
                return;
            }
        }
        11T.A0L(str3);
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        RollCallNuxConfig rollCallNuxConfig = this.A00;
        if (rollCallNuxConfig != null) {
            return rollCallNuxConfig.isCommunityMessaging ? new C37s(75) : super.A1D();
        }
        11T.A0L(DexStore.CONFIG_FILENAME);
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public DGJ A1E(1Iw r302) {
        return new 9zA(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        8Tn A07 = 8Tn.A07(r302, this);
        RollCallNuxConfig rollCallNuxConfig = this.A00;
        if (rollCallNuxConfig != null) {
            String A0s = 7zN.A0s(this, rollCallNuxConfig.buttonId);
            8Lf r0 = new 8Lf(83S.A00(this, 12), 83S.A00(this, 13), A0s, getString(2131964650));
            RollCallNuxConfig rollCallNuxConfig2 = this.A00;
            if (rollCallNuxConfig2 != null) {
                String string = getString(rollCallNuxConfig2.titleId);
                RollCallNuxConfig rollCallNuxConfig3 = this.A00;
                if (rollCallNuxConfig3 != null) {
                    String string2 = getString(rollCallNuxConfig3.subtitleId);
                    C8xf A00 = C8xf.A00(2132411118);
                    11T.A0D(string);
                    return 8Tn.A0A(A07, new 8NJ(r0, A00, string2, (CharSequence) null, string, (List) null, true));
                }
            }
        }
        11T.A0L(DexStore.CONFIG_FILENAME);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-1179977904);
        super.onCreate(bundle);
        this.A02 = 1BM.A01(this);
        boolean z = requireArguments().getBoolean("force_dark_mode_param");
        this.A01 = z;
        if (z) {
            ((BaseMigBottomSheetDialogFragment) this).A00 = (MigColorScheme) 7zO.A0l(this, 16980);
        }
        Parcelable parcelable = requireArguments().getParcelable("config_param");
        if (parcelable == null) {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A08(-1218497552, A02);
            throw A0h;
        }
        this.A00 = (RollCallNuxConfig) parcelable;
        A05(this, "impression", null);
        0FI.A08(998044741, A02);
    }
}
