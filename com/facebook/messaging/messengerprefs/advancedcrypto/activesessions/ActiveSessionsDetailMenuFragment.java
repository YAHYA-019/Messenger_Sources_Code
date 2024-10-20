package com.facebook.messaging.messengerprefs.advancedcrypto.activesessions;

import X.04J;
import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1Iw;
import X.1LI;
import X.1UG;
import X.4YV;
import X.9zG;
import X.AnonymousClass001;
import X.AxC;
import X.Bf9;
import X.DFH;
import X.DGJ;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.advancedcryptotransport.model.PeerDevice;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: ActiveSessionsDetailMenuFragment.class */
public final class ActiveSessionsDetailMenuFragment extends MigBottomSheetDialogFragment {
    public PeerDevice A00;
    public DFH A01;
    public 04J A02;
    public String A03;

    public static final void A05(ActiveSessionsDetailMenuFragment activeSessionsDetailMenuFragment, String str) {
        04J r303 = activeSessionsDetailMenuFragment.A02;
        if (r303 == null) {
            r303 = 4YV.A0B();
            activeSessionsDetailMenuFragment.A02 = r303;
        }
        1UG A08 = 1BK.A08(r303, "messenger_armadillo_md_active_sessions");
        if (A08.isSampled()) {
            String str2 = activeSessionsDetailMenuFragment.A03;
            if (str2 != null) {
                if (str2.equals("")) {
                    return;
                }
                A08.A7R("event_name", str);
                String str3 = activeSessionsDetailMenuFragment.A03;
                if (str3 != null) {
                    A08.A7R("flow_id", str3);
                    A08.BZL();
                    return;
                }
            }
            11T.A0L("loggerFlowId");
            throw 0Q8.createAndThrow();
        }
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public DGJ A1E(1Iw r302) {
        return new 9zG(this, 2);
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        11T.A0F(r302, 0);
        MigColorScheme A1F = A1F();
        PeerDevice peerDevice = this.A00;
        if (peerDevice != null) {
            return new AxC(peerDevice, new Bf9(this), A1F);
        }
        11T.A0L("peerDevice");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        IllegalStateException A0N;
        int i;
        int A02 = 0FI.A02(994265108);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Parcelable parcelable = requireArguments.getParcelable("CONTENT_PEER_DEVICE_ARG");
        if (parcelable != null) {
            this.A00 = (PeerDevice) parcelable;
            String string = requireArguments.getString("CONTENT_LOGGER_FLOW_ID_ARG");
            if (string != null) {
                this.A03 = string;
                0FI.A08(344875647, A02);
                return;
            } else {
                A0N = AnonymousClass001.A0N("Required value was null.");
                i = 1351478888;
            }
        } else {
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = -1500493386;
        }
        0FI.A08(i, A02);
        throw A0N;
    }

    public void onStart() {
        int A02 = 0FI.A02(-794572385);
        super/*X.0D2*/.onStart();
        A05(this, "armadillo_active_sessions_info_page_open");
        0FI.A08(-1229740460, A02);
    }

    public void onStop() {
        int A02 = 0FI.A02(-83265525);
        super/*X.0D2*/.onStop();
        A05(this, "armadillo_active_sessions_info_page_close");
        0FI.A08(1843886706, A02);
    }
}
