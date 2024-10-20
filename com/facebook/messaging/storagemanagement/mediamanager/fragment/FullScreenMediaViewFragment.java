package com.facebook.messaging.storagemanagement.mediamanager.fragment;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BM;
import X.1Lm;
import X.7zL;
import X.7zO;
import X.7zP;
import X.7zR;
import X.8Y0;
import X.9Kd;
import X.AK7;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C0s8;
import X.C9hr;
import X.DCz;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.messaging.fullscreendialog.FullScreenDialogFragment;
import com.facebook.messaging.storagemanagement.mediamanager.model.MediaItem;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: FullScreenMediaViewFragment.class */
public final class FullScreenMediaViewFragment extends FullScreenDialogFragment {
    public MediaItem A00;
    public C9hr A01;
    public MigColorScheme A02;
    public LithoView A03;
    public final C01i A04 = C01g.A00(C03i.A02, new DCz(this, 6));

    public static final void A05(FullScreenMediaViewFragment fullScreenMediaViewFragment) {
        MediaItem mediaItem = fullScreenMediaViewFragment.A00;
        if (mediaItem != null) {
            C9hr c9hr = fullScreenMediaViewFragment.A01;
            if (c9hr == null) {
                7zL.A1B();
                throw 0Q8.createAndThrow();
            }
            AK7 A19 = 7zL.A19(fullScreenMediaViewFragment, 20);
            7zP.A0O(c9hr.A06).A00(c9hr.A04, C0s8.A11(mediaItem));
            c9hr.A02(A19);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.fullscreendialog.FullScreenDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-20257903);
        super.onCreate(bundle);
        this.A02 = 7zR.A0c(requireContext());
        this.A00 = (MediaItem) requireArguments().getParcelable("media_item_key");
        this.A01 = (C9hr) 1Lm.A06(1BM.A01(this), 68411);
        0FI.A08(1906393330, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1748687465);
        Context requireContext = requireContext();
        MediaItem mediaItem = this.A00;
        8Y0 r309 = null;
        if (mediaItem != null) {
            MigColorScheme migColorScheme = this.A02;
            if (migColorScheme == null) {
                11T.A0L("colorScheme");
                throw 0Q8.createAndThrow();
            }
            r309 = new 8Y0((9Kd) this.A04.getValue(), mediaItem, migColorScheme);
        }
        LithoView A0W = 7zO.A0W(requireContext, this, r309);
        this.A03 = A0W;
        0FI.A08(642822441, A02);
        return A0W;
    }
}
