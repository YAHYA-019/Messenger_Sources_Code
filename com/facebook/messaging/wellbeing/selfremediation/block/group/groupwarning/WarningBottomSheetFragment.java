package com.facebook.messaging.wellbeing.selfremediation.block.group.groupwarning;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1Iw;
import X.1LI;
import X.1iF;
import X.7zP;
import X.AbN;
import X.B5J;
import X.BiZ;
import X.C1893Avu;
import X.QK8;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* loaded from: WarningBottomSheetFragment.class */
public final class WarningBottomSheetFragment extends MigBottomSheetDialogFragment {
    public B5J A00;
    public WarningBottomSheetParam A01;
    public final BiZ A02 = new BiZ(this);

    public 1iF A17() {
        return AbN.A0B();
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        11T.A0F(r302, 0);
        C1893Avu c1893Avu = new C1893Avu(r302, new QK8());
        MigColorScheme A1F = A1F();
        1LI r0 = c1893Avu.A01;
        ((QK8) r0).A01 = A1F;
        BitSet bitSet = c1893Avu.A02;
        bitSet.set(1);
        WarningBottomSheetParam warningBottomSheetParam = this.A01;
        if (warningBottomSheetParam == null) {
            11T.A0L("param");
            throw 0Q8.createAndThrow();
        }
        ((QK8) r0).A05 = warningBottomSheetParam.A03;
        bitSet.set(5);
        ((QK8) r0).A02 = warningBottomSheetParam.A00;
        bitSet.set(2);
        ((QK8) r0).A03 = warningBottomSheetParam.A01;
        bitSet.set(3);
        ((QK8) r0).A04 = warningBottomSheetParam.A02;
        bitSet.set(4);
        ((QK8) r0).A00 = this.A02;
        bitSet.set(0);
        7zP.A15(c1893Avu, bitSet, c1893Avu.A03);
        return r0;
    }

    public void onCancel(DialogInterface dialogInterface) {
        11T.A0F(dialogInterface, 0);
        B5J b5j = this.A00;
        if (b5j != null) {
            b5j.A00.A02();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        WarningBottomSheetParam warningBottomSheetParam;
        int A02 = 0FI.A02(1683820377);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (warningBottomSheetParam = (WarningBottomSheetParam) bundle2.getParcelable("param")) == null) {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A08(-1192449116, A02);
            throw A0h;
        }
        this.A01 = warningBottomSheetParam;
        0FI.A08(809151505, A02);
    }
}
