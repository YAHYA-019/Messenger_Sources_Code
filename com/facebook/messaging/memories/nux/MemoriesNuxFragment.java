package com.facebook.messaging.memories.nux;

import X.0FI;
import X.0ND;
import X.0Q8;
import X.11T;
import X.1pI;
import X.1vD;
import X.2Ov;
import X.7zM;
import X.9qT;
import X.AQr;
import X.C01i;
import X.C03i;
import X.C5fi;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: MemoriesNuxFragment.class */
public final class MemoriesNuxFragment extends 2Ov {
    public static boolean A02;
    public 1pI A00;
    public final C01i A01 = AQr.A01(this, C03i.A02, 30);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A05(MemoriesNuxFragment memoriesNuxFragment) {
        1pI r0 = memoriesNuxFragment.A00;
        if (r0 != null) {
            if (!r0.BVa()) {
                return;
            }
            memoriesNuxFragment.requireActivity().BDe().A1R("memory_nux_dismissed_result", Bundle.EMPTY);
            1pI r02 = memoriesNuxFragment.A00;
            if (r02 != null) {
                r02.CeH("MemoriesNuxFragment");
                return;
            }
        }
        11T.A0L("contentViewManager");
        throw 0Q8.createAndThrow();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = 0FI.A02(-726421516);
        11T.A0F(layoutInflater, 0);
        View A0G = 7zM.A0G(layoutInflater, viewGroup, 2132542539, false);
        0FI.A08(611974916, A022);
        return A0G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A022 = 0FI.A02(-396122887);
        requireActivity().BDe().A1R("memory_nux_dismissed_result", Bundle.EMPTY);
        super.onDestroyView();
        0FI.A08(184081830, A022);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        0ND.A00(view, new 9qT(this, 1));
        C5fi.A00(getActivity());
        this.A00 = 1vD.A00(view);
    }
}
