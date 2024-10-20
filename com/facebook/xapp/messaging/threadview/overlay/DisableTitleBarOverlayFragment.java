package com.facebook.xapp.messaging.threadview.overlay;

import X.0FI;
import X.1Iw;
import X.1iF;
import X.2Ov;
import X.4YT;
import X.6KV;
import X.6tK;
import X.8YW;
import X.AQY;
import X.C01g;
import X.C01i;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;

/* loaded from: DisableTitleBarOverlayFragment.class */
public final class DisableTitleBarOverlayFragment extends 2Ov {
    public final C01i A00 = C01g.A01(new AQY(this, 33));

    public 1iF A17() {
        return new 1iF(195771409088126L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-406932781);
        ((6KV) this.A00.getValue()).A02();
        1Iw A00 = 6tK.A00(requireContext());
        Bundle requireArguments = requireArguments();
        boolean z = requireArguments.getBoolean(4YT.A00(1206));
        int i = requireArguments.getInt(4YT.A00(1537));
        String A002 = 4YT.A00(1538);
        LithoView A022 = LithoView.A02(new 8YW(requireArguments.containsKey(A002) ? Integer.valueOf(requireArguments.getInt(A002)) : null, i, z), A00);
        0FI.A08(-431178921, A02);
        return A022;
    }

    public void onDestroy() {
        int A02 = 0FI.A02(370266991);
        super.onDestroy();
        ((6KV) this.A00.getValue()).A05(-1);
        0FI.A08(-629965506, A02);
    }
}
