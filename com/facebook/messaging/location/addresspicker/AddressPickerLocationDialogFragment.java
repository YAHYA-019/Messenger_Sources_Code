package com.facebook.messaging.location.addresspicker;

import X.0FI;
import X.1Bn;
import X.1iF;
import X.6KV;
import X.7zO;
import X.82O;
import X.AbF;
import X.Bfz;
import X.Cls;
import X.JEv;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.facebook.messaging.location.picker.LocationPickerDialogFragment;

/* loaded from: AddressPickerLocationDialogFragment.class */
public class AddressPickerLocationDialogFragment extends LocationPickerDialogFragment {
    public InputMethodManager A00;
    public Bfz A01;
    public 6KV A02;
    public 82O A03;
    public final JEv A04 = new Cls(this, 1);

    public 1iF A17() {
        return AbF.A0C(1645341882290020L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.fullscreendialog.FullScreenDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1686239466);
        super.onCreate(bundle);
        this.A03 = (82O) 1Bn.A0A(65571);
        this.A00 = (InputMethodManager) 7zO.A0m(this, 100189);
        A0g(2, 2132608325);
        0FI.A08(-1306980220, A02);
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(-1243769765);
        super.onDestroyView();
        this.A02.A05(-1);
        0FI.A08(829865190, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.location.picker.LocationPickerDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A02 = this.A03.A00(getContext());
        if (A16() != null) {
            A16().setRequestedOrientation(1);
        }
        this.A02.A02();
    }
}
