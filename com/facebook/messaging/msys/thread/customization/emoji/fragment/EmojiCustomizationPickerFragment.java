package com.facebook.messaging.msys.thread.customization.emoji.fragment;

import X.0FI;
import X.0fH;
import X.11T;
import X.1iF;
import X.C2rw;
import android.os.Bundle;
import com.facebook.messaging.widget.dialog.SlidingSheetDialogFragment;
import com.facebook.xapp.messaging.composer.hotlike.model.LikeIconCustomizationPickerParams;

/* loaded from: EmojiCustomizationPickerFragment.class */
public final class EmojiCustomizationPickerFragment extends SlidingSheetDialogFragment {
    public LikeIconCustomizationPickerParams A00;

    public 1iF A17() {
        return new 1iF(557220298628848L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.widget.dialog.SlidingSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int i;
        int A02 = 0FI.A02(-714175769);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || bundle2.getParcelable("args_picker_params_model") == null) {
            A0p();
            0fH.A0o("EmojiCustomizationPickerFragment", "Invalid args for creating EmojiCustomizationPickerFragment");
            i = 1576665276;
        } else {
            Bundle bundle3 = this.mArguments;
            11T.A0D(bundle3);
            this.A00 = (LikeIconCustomizationPickerParams) bundle3.getParcelable("args_picker_params_model");
            i = -1432732845;
        }
        0FI.A08(i, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x05d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onCreateView(android.view.LayoutInflater r302, android.view.ViewGroup r303, android.os.Bundle r304) {
        /*
            Method dump skipped, instructions count: 1628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.msys.thread.customization.emoji.fragment.EmojiCustomizationPickerFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStop() {
        int A02 = 0FI.A02(1500563118);
        super/*X.0D2*/.onStop();
        if (C2rw.A00(requireContext())) {
            A0p();
        }
        0FI.A08(1033401558, A02);
    }
}
