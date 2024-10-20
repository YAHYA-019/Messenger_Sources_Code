package com.facebook.messaging.viewonce.nux;

import X.1BK;
import X.1Bq;
import X.1Br;
import X.4YT;
import X.4YU;
import X.7zO;
import X.C00m;
import X.C0B7;
import X.C5id;
import X.FIu;
import android.os.Bundle;
import com.facebook.mig.nux.MigNuxBottomSheet;
import java.io.Serializable;

/* loaded from: ViewOnceMessageNuxFragment.class */
public final class ViewOnceMessageNuxFragment extends MigNuxBottomSheet {
    public final 1Br A01 = 1Bq.A00(66642);
    public final 1Br A00 = 1BK.A0C();

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A05(ViewOnceMessageNuxFragment viewOnceMessageNuxFragment, String str) {
        ((FIu) 7zO.A0l(viewOnceMessageNuxFragment, 100011)).A09(viewOnceMessageNuxFragment.requireContext(), 4YU.A0F(str), C5id.A0Z);
        super.A0o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void A0o() {
        Serializable serializable;
        Bundle bundle = this.mArguments;
        if (bundle != null && (serializable = bundle.getSerializable(4YT.A00(721))) != null) {
            C0B7.A04(serializable, 0);
            C00m c00m = (C00m) serializable;
            if (c00m != null) {
                c00m.invoke();
            }
        }
        super.A0o();
    }
}
