package com.facebook.messaging.widget.dialog;

import X.0FI;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;

/* loaded from: SlidingSheetFullScreenDialogFragment.class */
public abstract class SlidingSheetFullScreenDialogFragment extends SlidingSheetDialogFragment {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.widget.dialog.SlidingSheetDialogFragment
    public Dialog A0n(Bundle bundle) {
        Fragment fragment;
        Dialog A0n = super.A0n(bundle);
        Window window = A0n.getWindow();
        window.getClass();
        int i = -1;
        if (!A1B()) {
            Fragment requireParentFragment = requireParentFragment();
            while (true) {
                fragment = requireParentFragment;
                if (fragment.mParentFragment == null) {
                    break;
                }
                requireParentFragment = fragment.mParentFragment;
            }
            View view = fragment.mView;
            if (view != null) {
                i = view.getHeight();
            }
        }
        window.setLayout(-1, i);
        return A0n;
    }

    @Override // com.facebook.messaging.widget.dialog.SlidingSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-90281823);
        super.onCreate(bundle);
        int i = 2132608324;
        if (A1B()) {
            i = 2132608323;
        }
        A0g(2, i);
        0FI.A08(1193326645, A02);
    }
}
