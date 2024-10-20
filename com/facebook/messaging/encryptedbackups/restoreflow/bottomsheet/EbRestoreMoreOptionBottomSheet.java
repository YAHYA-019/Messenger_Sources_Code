package com.facebook.messaging.encryptedbackups.restoreflow.bottomsheet;

import X.0FI;
import X.0Q8;
import X.0QD;
import X.11T;
import X.1BL;
import X.1BM;
import X.1Iw;
import X.1LI;
import X.7zL;
import X.7zM;
import X.96C;
import X.9ZP;
import X.AVJ;
import X.AnonymousClass001;
import X.C8fg;
import android.os.Bundle;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: EbRestoreMoreOptionBottomSheet.class */
public final class EbRestoreMoreOptionBottomSheet extends MigBottomSheetDialogFragment {
    public 9ZP A00;

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        MigColorScheme A1F = A1F();
        9ZP r0 = this.A00;
        if (r0 == null) {
            7zL.A1B();
            throw 0Q8.createAndThrow();
        }
        List A00 = r0.A00();
        int i = C8fg.A03;
        return new C8fg(A1F, A00, AVJ.A01(this, 24));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        ArrayList<String> stringArrayList;
        int A02 = 0FI.A02(1243319886);
        super.onCreate(bundle);
        this.A00 = new 9ZP(7zM.A0C(this, 147595), 1BM.A01(this));
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList("bundleDisableOptions")) != null) {
            ArrayList A0z = 1BL.A0z(stringArrayList);
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String A0i = AnonymousClass001.A0i(it);
                11T.A0D(A0i);
                A0z.add(96C.valueOf(A0i));
            }
            Set A0f = 0QD.A0f(A0z);
            if (A0f != null) {
                9ZP r0 = this.A00;
                if (r0 == null) {
                    7zL.A1B();
                    throw 0Q8.createAndThrow();
                }
                r0.A00 = 0QD.A0O(A0f, r0.A00);
            }
        }
        0FI.A08(-1556810971, A02);
    }
}
