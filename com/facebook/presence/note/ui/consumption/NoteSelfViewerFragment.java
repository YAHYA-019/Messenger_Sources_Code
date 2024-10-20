package com.facebook.presence.note.ui.consumption;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BM;
import X.1Bn;
import X.1Iw;
import X.1LI;
import X.1pI;
import X.7zL;
import X.7zN;
import X.7zP;
import X.7zS;
import X.9De;
import X.9LW;
import X.A1v;
import X.AnonymousClass001;
import X.C03513yC;
import X.C37s;
import X.C8d3;
import X.C9mK;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.presence.api.model.RichStatus;
import com.facebook.user.model.User;

/* loaded from: NoteSelfViewerFragment.class */
public final class NoteSelfViewerFragment extends MigBottomSheetDialogFragment {
    public FbUserSession A00;
    public 1pI A01;
    public RichStatus A02;
    public String A03;
    public User A05;
    public boolean A04 = true;
    public final A1v A06 = new A1v(this);

    /* JADX WARN: Multi-variable type inference failed */
    public static final C03513yC A05(NoteSelfViewerFragment noteSelfViewerFragment) {
        FbUserSession fbUserSession = noteSelfViewerFragment.A00;
        if (fbUserSession != null) {
            return (C03513yC) 7zN.A0m(noteSelfViewerFragment, fbUserSession, 68395);
        }
        7zL.A1C();
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37s(61);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        String str;
        MigColorScheme A0j = 7zS.A0j(this);
        FbUserSession fbUserSession = this.A00;
        if (fbUserSession == null) {
            str = "fbUserSession";
        } else {
            A1v a1v = this.A06;
            User user = this.A05;
            if (user == null) {
                str = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
            } else {
                RichStatus richStatus = this.A02;
                if (richStatus != null) {
                    return new C8d3(fbUserSession, A0j, richStatus, A05(this), a1v, user, this.A03);
                }
                str = "richStatus";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        IllegalStateException A0N;
        int i;
        int A02 = 0FI.A02(-1794122315);
        super.onCreate(bundle);
        7zP.A0e(((9LW) 1Bn.A0A(68398)).A00).markerStart(91365276);
        this.A00 = 1BM.A01(this);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(1);
        }
        Parcelable parcelable = requireArguments().getParcelable(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        if (parcelable != null) {
            this.A05 = (User) parcelable;
            Parcelable parcelable2 = requireArguments().getParcelable("rich_status");
            if (parcelable2 != null) {
                this.A02 = (RichStatus) parcelable2;
                0FI.A08(-785162161, A02);
                return;
            } else {
                A0N = AnonymousClass001.A0N("Required value was null.");
                i = -2125731953;
            }
        } else {
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = 966091799;
        }
        0FI.A08(i, A02);
        throw A0N;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(40635724);
        super.onDestroy();
        if (this.A04) {
            A05(this).A03();
        } else {
            this.A04 = true;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(-1);
        }
        RichStatus richStatus = this.A02;
        if (richStatus == null) {
            11T.A0L("richStatus");
            throw 0Q8.createAndThrow();
        }
        C9mK.A01(richStatus);
        0FI.A08(-888777696, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(1948422185);
        super/*androidx.fragment.app.Fragment*/.onPause();
        RichStatus richStatus = this.A02;
        if (richStatus == null) {
            11T.A0L("richStatus");
            throw 0Q8.createAndThrow();
        }
        C9mK.A01(richStatus);
        0FI.A08(-1206060828, A02);
    }
}
