package com.facebook.pages.app.clicktomessengerads.reportedoutcomes.permissions.ui.fragments;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BM;
import X.1Bi;
import X.1LH;
import X.1pK;
import X.2S0;
import X.6gN;
import X.6gO;
import X.7zR;
import X.8fK;
import X.9LO;
import X.AQp;
import X.C00i;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.litho.LithoView;

/* loaded from: ReportedOutcomesPermissionsFragment.class */
public final class ReportedOutcomesPermissionsFragment extends 1pK implements 2S0 {
    public static String A02 = "UNKNOWN";
    public FbUserSession A00;
    public LithoView A01;

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A00 = 1BM.A01(this);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(1);
        }
    }

    public boolean Bkd() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        8fK r312;
        int A022 = 0FI.A02(1533713595);
        C00i c00i = ((9LO) 1Bi.A03(68303)).A00.A00;
        6gN r0 = (6gN) c00i.get();
        c00i.get();
        if (r0.A01("should_enable_universal_mbs_ads_event_sharing_settings", 6gO.A00())) {
            r312 = new 8fK(AQp.A01(this, 19), AQp.A01(this, 20));
        } else {
            final AQp A01 = AQp.A01(this, 21);
            final AQp A012 = AQp.A01(this, 22);
            r312 = new 1LH(A01, A012) { // from class: X.8fn
                public static final CallerContext A03 = CallerContext.A0B("ReportedOutcomesPermissionsComponent");
                public final 1Br A00 = 1Bq.A00(99773);
                public final C00m A01;
                public final C00m A02;

                {
                    this.A01 = A01;
                    this.A02 = A012;
                }

                public 1LI A0s(C2k5 c2k5) {
                    7zM.A1Z(c2k5);
                    9W7 r02 = 9GM.A01;
                    7zL.A1L(c2k5.A05);
                    9GM.A04.getValue();
                    throw AnonymousClass001.A0Q("getStaticBackgroundAttrs");
                }
            };
        }
        LithoView A0M = 7zR.A0M(this);
        this.A01 = A0M;
        A0M.A0x(r312);
        LithoView lithoView = this.A01;
        if (lithoView == null) {
            11T.A0L("lithoView");
            throw 0Q8.createAndThrow();
        }
        0FI.A08(-1066469817, A022);
        return lithoView;
    }
}
