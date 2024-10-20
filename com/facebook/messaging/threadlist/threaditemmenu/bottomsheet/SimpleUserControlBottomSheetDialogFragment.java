package com.facebook.messaging.threadlist.threaditemmenu.bottomsheet;

import X.11T;
import X.1BK;
import X.1Iw;
import X.1LI;
import X.7zL;
import X.7zP;
import X.AzH;
import X.Bwz;
import X.C1884Avl;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* loaded from: SimpleUserControlBottomSheetDialogFragment.class */
public final class SimpleUserControlBottomSheetDialogFragment extends MigBottomSheetDialogFragment {
    public Bwz A00;

    public void A12(Bundle bundle) {
        if (bundle == null || this.A00 != null) {
            return;
        }
        A0o();
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        11T.A0F(r302, 0);
        Context A0A = 7zL.A0A(r302);
        Bwz bwz = this.A00;
        if (bwz == null) {
            throw 1BK.A0h();
        }
        C1884Avl c1884Avl = new C1884Avl(7zL.A0W(A0A), new AzH());
        ImmutableList immutableList = bwz.A04;
        AzH azH = c1884Avl.A01;
        azH.A03 = immutableList;
        BitSet bitSet = c1884Avl.A02;
        bitSet.set(3);
        azH.A02 = A1F();
        bitSet.set(1);
        azH.A01 = bwz.A02;
        bitSet.set(0);
        azH.A00 = bwz.A01;
        bitSet.set(5);
        bitSet.set(2);
        azH.A04 = bwz.A05;
        bitSet.set(4);
        7zP.A15(c1884Avl, bitSet, c1884Avl.A03);
        return azH;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        DialogInterface.OnDismissListener onDismissListener;
        11T.A0F(dialogInterface, 0);
        super/*X.0D2*/.onDismiss(dialogInterface);
        Bwz bwz = this.A00;
        if (bwz == null || (onDismissListener = bwz.A00) == null) {
            return;
        }
        onDismissListener.onDismiss(dialogInterface);
    }
}
