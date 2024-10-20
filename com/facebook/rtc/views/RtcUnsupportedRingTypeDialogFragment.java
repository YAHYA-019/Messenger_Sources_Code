package com.facebook.rtc.views;

import X.1BK;
import X.1iF;
import X.2Ov;
import X.AbF;
import X.DKF;
import X.DKS;
import android.app.Dialog;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;

/* loaded from: RtcUnsupportedRingTypeDialogFragment.class */
public class RtcUnsupportedRingTypeDialogFragment extends 2Ov {
    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        String string = requireArguments().getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        FragmentActivity requireActivity = requireActivity();
        DKS dks = new DKS(requireActivity);
        dks.A0B(requireActivity.getString(2131968093));
        dks.A0A(1BK.A0v(requireActivity, string, 2131968112));
        DKS.A01(dks, DKF.A0o(requireActivity), this, 88);
        return dks.A0I();
    }

    public 1iF A17() {
        return AbF.A0C(594492937905231L);
    }
}
