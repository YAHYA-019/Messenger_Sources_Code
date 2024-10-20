package com.facebook.messaging.publicidentity.usernames.quickpromotion.fragments;

import X.1Br;
import X.1Iw;
import X.1LI;
import X.2dQ;
import X.7zU;
import X.8Xn;
import X.9De;
import X.AKX;
import X.C0A2;
import X.DGJ;
import android.net.Uri;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: MessengerPublicIdentityUsernamesUpsellNuxSecondaryBottomSheetFragment.class */
public final class MessengerPublicIdentityUsernamesUpsellNuxSecondaryBottomSheetFragment extends MigBottomSheetDialogFragment {
    public final DGJ A00 = new DGJ() { // from class: X.9z3
        public 1LI AJE(1Iw r302, MigColorScheme migColorScheme) {
            11T.A0F(migColorScheme, 1);
            return new 8UZ(migColorScheme);
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9De, java.lang.Object] */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new Object();
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public DGJ A1E(1Iw r302) {
        return this.A00;
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        Uri uri;
        String BCy = 1Br.A07(2dQ.A01).BCy(36889585775544159L);
        if (BCy == null || BCy.length() == 0) {
            uri = null;
        } else {
            uri = null;
            try {
                uri = C0A2.A03(BCy);
            } catch (SecurityException unused) {
            }
        }
        return new 8Xn(A1F(), 7zU.A0t(this, 22), uri != null ? new AKX(uri, this, 25) : null);
    }
}
