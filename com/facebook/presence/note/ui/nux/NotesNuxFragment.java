package com.facebook.presence.note.ui.nux;

import X.1BK;
import X.1Br;
import X.1Iw;
import X.1LI;
import X.1pI;
import X.9De;
import X.A20;
import X.C37s;
import X.C8f6;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: NotesNuxFragment.class */
public final class NotesNuxFragment extends MigBottomSheetDialogFragment {
    public 1pI A00;
    public final 1Br A01 = 1BK.A0E();

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37s(90);
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        this.A02 = true;
        this.A03 = true;
        BaseMigBottomSheetDialogFragment.A06(this);
        return new C8f6(A1F(), new A20(this));
    }
}
