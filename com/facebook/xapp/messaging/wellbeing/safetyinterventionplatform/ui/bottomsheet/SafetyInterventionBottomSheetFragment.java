package com.facebook.xapp.messaging.wellbeing.safetyinterventionplatform.ui.bottomsheet;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1Iw;
import X.1LI;
import X.83S;
import X.8DG;
import X.8fC;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: SafetyInterventionBottomSheetFragment.class */
public final class SafetyInterventionBottomSheetFragment extends MigBottomSheetDialogFragment {
    public 8DG A00;
    public 8DG A01;
    public 1LI A02;
    public boolean A03;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void A0o() {
        super.A0o();
        8DG r0 = this.A00;
        if (r0 == null) {
            11T.A0L("bottomSheetViewModel");
            throw 0Q8.createAndThrow();
        }
        r0.A00.onClick(this.mView);
        this.A03 = true;
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        8fC r303 = this.A02;
        if (r303 == null) {
            MigColorScheme A1F = A1F();
            8DG r0 = this.A00;
            if (r0 == null) {
                11T.A0L("bottomSheetViewModel");
                throw 0Q8.createAndThrow();
            }
            r303 = new 8fC(A1F, r0);
            this.A02 = r303;
        }
        return r303;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.lifecycle.ViewModelProvider$Factory, java.lang.Object] */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        8DG r0;
        int A02 = 0FI.A02(352864664);
        super.onCreate(bundle);
        8DG r02 = new ViewModelProvider((ViewModelStoreOwner) this, (ViewModelProvider.Factory) new Object()).get(8DG.class);
        this.A00 = r02;
        if (bundle != null || (r0 = this.A01) == null) {
            A0o();
        } else {
            if (r02 == null) {
                11T.A0L("bottomSheetViewModel");
                throw 0Q8.createAndThrow();
            }
            r02.A0C = r0.A0C;
            r02.A0B = r0.A0B;
            r02.A09 = r0.A09;
            r02.A01 = 83S.A00(this, 68);
            r02.A0A = r0.A0A;
            r02.A02 = 83S.A00(this, 69);
            r02.A00 = r0.A00;
            r02.A03 = r0.A03;
            r02.A04 = r0.A04;
            r02.A05 = r0.A05;
            r02.A07 = r0.A07;
            r02.A06 = r0.A06;
            r02.A08 = r0.A08;
        }
        0FI.A08(-1440935807, A02);
    }

    public void onDestroy() {
        int A02 = 0FI.A02(1709632155);
        super.onDestroy();
        if (!this.A03) {
            A0o();
        }
        0FI.A08(10219698, A02);
    }
}
