package com.facebook.messaging.location.nearbyplacespicker;

import X.0FI;
import X.1BV;
import X.1iF;
import X.7zL;
import X.AbF;
import X.AbstractC2385Gbm;
import X.C00i;
import X.IVF;
import X.JEv;
import X.RMq;
import android.os.Bundle;
import com.facebook.messaging.location.picker.LocationPickerDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: NearbyPlacesPickerDialogFragment.class */
public class NearbyPlacesPickerDialogFragment extends LocationPickerDialogFragment {
    public RMq A00;
    public C00i A01;
    public final JEv A02 = new IVF(this, 2);

    public 1iF A17() {
        return AbF.A0C(1645341882290020L);
    }

    @Override // com.facebook.messaging.location.picker.LocationPickerDialogFragment
    public JEv A1C() {
        return this.A02;
    }

    @Override // com.facebook.messaging.location.picker.LocationPickerDialogFragment
    public AbstractC2385Gbm A1D() {
        return new AbstractC2385Gbm();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.location.picker.LocationPickerDialogFragment
    public String A1E() {
        return getString(2131963376);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.fullscreendialog.FullScreenDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-1932342024);
        super.onCreate(bundle);
        A0g(2, 2132608330);
        1BV A0R = 7zL.A0R(getContext(), 16979);
        this.A01 = A0R;
        if (((MigColorScheme) A0R.get()).BDl() == -16777216) {
            A0g(2, 2132608331);
        } else {
            A0g(2, 2132608330);
        }
        0FI.A08(-144997863, A02);
    }
}
