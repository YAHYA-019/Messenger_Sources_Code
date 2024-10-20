package com.facebook.messaging.internalprefs.presence;

import X.0D2;
import X.0FI;
import X.0Q8;
import X.11T;
import X.1BM;
import X.1Br;
import X.1Iw;
import X.2Ov;
import X.2TI;
import X.2cK;
import X.2cM;
import X.6rU;
import X.7ZF;
import X.7zL;
import X.7zM;
import X.7zP;
import X.7zQ;
import X.AVD;
import X.C9nj;
import X.C9oG;
import X.DR6;
import android.app.Dialog;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.user.model.User;

/* loaded from: StatusInjectDialogFragment.class */
public final class StatusInjectDialogFragment extends 2Ov {
    public User A00;
    public String A02;
    public String A03;
    public LithoView A04;
    public Long A01 = 600000L;
    public final 1Br A05 = 7zM.A0d();

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A05(StatusInjectDialogFragment statusInjectDialogFragment) {
        IBinder windowToken;
        InputMethodManager inputMethodManager;
        LithoView lithoView = statusInjectDialogFragment.A04;
        if (lithoView == null || (windowToken = lithoView.getWindowToken()) == null || (inputMethodManager = (InputMethodManager) statusInjectDialogFragment.requireContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        FbUserSession A01 = 1BM.A01(this);
        if (bundle == null) {
            bundle = this.mArguments;
        }
        6rU r305 = null;
        Parcelable parcelable = bundle != null ? bundle.getParcelable(PublicKeyCredentialControllerUtility.JSON_KEY_USER) : null;
        11T.A0I(parcelable, "null cannot be cast to non-null type com.facebook.user.model.User");
        this.A00 = (User) parcelable;
        2TI A0p = 7zQ.A0p();
        1Iw A0T = 7zP.A0T(this);
        LithoView lithoView = new LithoView(A0T);
        this.A04 = lithoView;
        2cM A012 = 2cK.A01(A0T, (String) null, 0);
        7ZF A013 = 6rU.A01(A0T, 0);
        A013.A2g("Status Text");
        A013.A2f(7zL.A0a(AVD.A01(this, 23)));
        A012.A2d(A013);
        if (!A0p.A03()) {
            7ZF A014 = 6rU.A01(A0T, 0);
            A014.A2g("Emoji");
            A014.A2f(7zL.A0a(AVD.A01(this, 24)));
            7ZF.A06(A014);
            A014.A0J();
            r305 = A014.A01;
        }
        A012.A2e(r305);
        7ZF A015 = 6rU.A01(A0T, 0);
        A015.A2g("Expiration Timestamp");
        A015.A2h(String.valueOf(this.A01));
        A015.A2f(7zL.A0a(AVD.A01(this, 25)));
        lithoView.A0y(7zL.A0U(A012, A015));
        DR6 A02 = 7zQ.A0l().A02(requireContext());
        A02.A0I(this.A04);
        A02.A0G(new C9nj(4, A01, A0p, this), "Done");
        A02.A0E(new C9oG(this, 50), "Cancel");
        return A02.A04();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        Window window;
        Window window2;
        int A02 = 0FI.A02(-1739233461);
        super/*androidx.fragment.app.Fragment*/.onResume();
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.clearFlags(131080);
        }
        Dialog dialog2 = ((0D2) this).A01;
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setSoftInputMode(5);
        }
        Dialog dialog3 = ((0D2) this).A01;
        if (dialog3 != null) {
            dialog3.setCanceledOnTouchOutside(false);
        }
        0FI.A08(-354622886, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super/*X.0D2*/.onSaveInstanceState(bundle);
        User user = this.A00;
        if (user == null) {
            11T.A0L(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            throw 0Q8.createAndThrow();
        }
        bundle.putParcelable(PublicKeyCredentialControllerUtility.JSON_KEY_USER, user);
    }
}
