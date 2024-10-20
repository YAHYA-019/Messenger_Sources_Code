package com.facebook.messaging.aibot.aiplugins.subscriptions.dialog;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1X9;
import X.7zL;
import X.7zO;
import X.7zR;
import X.7zU;
import X.8DE;
import X.9De;
import X.9Wi;
import X.AQZ;
import X.AQc;
import X.C01i;
import X.C03i;
import android.os.Bundle;
import android.view.View;
import com.facebook.litho.LithoView;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;

/* loaded from: AiSubscriptionsBottomSheetDialogFragment.class */
public final class AiSubscriptionsBottomSheetDialogFragment extends BaseMigBottomSheetDialogFragment {
    public LithoView A00;
    public LithoView A01;
    public 9Wi A02;
    public final C01i A03;
    public final C01i A04;

    public AiSubscriptionsBottomSheetDialogFragment() {
        C03i c03i = C03i.A02;
        this.A03 = AQZ.A00(this, c03i, 30);
        AQZ aqz = new AQZ(this, 34);
        C01i A00 = AQZ.A00(new AQZ(this, 31), c03i, 32);
        this.A04 = 7zU.A0F(new AQZ(A00, 33), aqz, AQc.A00(null, A00, 16), 7zL.A18(8DE.class));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public View A1C() {
        LithoView A0M = 7zR.A0M(this);
        7zR.A11(A0M);
        this.A00 = A0M;
        return A0M;
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return 9De.A00();
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(-217851470);
        super.onDestroyView();
        this.A01 = null;
        this.A00 = null;
        9Wi r0 = this.A02;
        if (r0 == null) {
            11T.A0L("viewDataBridge");
            throw 0Q8.createAndThrow();
        }
        1X9 r02 = r0.A00.A02.A00;
        if (r02 != null) {
            r02.removeAllResultCallbacks();
        }
        0FI.A08(609190340, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        this.A02 = new 9Wi((8DE) this.A04.getValue());
        super.onViewCreated(view, bundle);
        this.A01 = 7zL.A0b(view, 2131364453);
        7zO.A1W(this, 7zO.A0J(this), 42);
    }
}
