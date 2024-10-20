package com.facebook.xapp.messaging.message.multiselect.bottomsheet;

import X.1BV;
import X.1Iw;
import X.1LI;
import X.7zL;
import X.7zN;
import X.A8O;
import X.A8P;
import X.AXF;
import X.AZn;
import X.C8a6;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: BulkDeleteBottomDialogFragment.class */
public final class BulkDeleteBottomDialogFragment extends MigBottomSheetDialogFragment {
    public AZn A00;
    public final AXF A01 = new A8P(this);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        int i = requireArguments().getInt("selected_message_count_arg");
        boolean z = requireArguments().getBoolean("should_show_delete_for_everyone_arg");
        1BV A0R = 7zL.A0R(requireContext(), 16979);
        return new C8a6(7zN.A0W(A0R), new A8O(this), i, z);
    }
}
