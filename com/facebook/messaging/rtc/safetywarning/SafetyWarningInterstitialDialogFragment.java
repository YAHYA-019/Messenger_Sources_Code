package com.facebook.messaging.rtc.safetywarning;

import X.11T;
import X.1BK;
import X.1Br;
import X.1iF;
import X.2Ov;
import X.7zN;
import X.7zQ;
import X.AbF;
import X.BVT;
import X.C3o5;
import X.C7m;
import X.CDw;
import X.DHN;
import X.EAX;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* loaded from: SafetyWarningInterstitialDialogFragment.class */
public final class SafetyWarningInterstitialDialogFragment extends 2Ov {
    public Dialog A00;
    public DHN A01;
    public final 1Br A02 = 7zN.A0I(this);

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        SafetyWarningInterstitialViewState safetyWarningInterstitialViewState = (SafetyWarningInterstitialViewState) requireArguments().getParcelable("safety_warning_interstitial_view_state");
        if (safetyWarningInterstitialViewState == null) {
            throw 1BK.A0h();
        }
        Context requireContext = requireContext();
        ImmutableList immutableList = safetyWarningInterstitialViewState.A02;
        String str = safetyWarningInterstitialViewState.A04;
        11T.A0A(str);
        String str2 = safetyWarningInterstitialViewState.A06;
        11T.A0A(str2);
        CDw cDw = new CDw();
        CDw.A00(cDw, this, ActionId.APP_MAIN);
        String str3 = safetyWarningInterstitialViewState.A03;
        cDw.A02 = str3;
        AbF.A1V(str3);
        cDw.A00 = safetyWarningInterstitialViewState.A00();
        C7m c7m = new C7m(cDw);
        CDw cDw2 = new CDw();
        CDw.A00(cDw2, this, ActionId.MQTT_CONNECTING);
        String str4 = safetyWarningInterstitialViewState.A05;
        cDw2.A02 = str4;
        AbF.A1V(str4);
        cDw2.A00 = safetyWarningInterstitialViewState.A01();
        ImmutableList of = ImmutableList.of((Object) c7m, (Object) new C7m(cDw2));
        11T.A0A(of);
        MigColorScheme A0m = 7zQ.A0m(this.A02);
        C3o5.A0k(requireContext, 0, A0m);
        EAX A00 = BVT.A00(requireContext, (Drawable) null, A0m, of, str, str2, immutableList, false);
        this.A00 = A00;
        11T.A0I(A00, "null cannot be cast to non-null type com.facebook.fbui.bottomsheetdialog.BottomSheetDialog");
        return A00;
    }

    public 1iF A17() {
        return AbF.A0C(3461599647265142L);
    }

    public void onCancel(DialogInterface dialogInterface) {
        11T.A0F(dialogInterface, 0);
        DHN dhn = this.A01;
        if (dhn != null) {
            dhn.C8f();
        }
    }
}
