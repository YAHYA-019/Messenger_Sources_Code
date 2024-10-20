package com.facebook.messaging.msys.thread.debug;

import X.0CW;
import X.0FI;
import X.11T;
import X.1BM;
import X.1Br;
import X.2Ov;
import X.7zL;
import X.7zO;
import X.7zR;
import X.7zU;
import X.8DK;
import X.AJe;
import X.AQa;
import X.AQd;
import X.AnonymousClass536;
import X.C00g;
import X.C01i;
import X.C03i;
import X.I3n;
import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;

/* loaded from: MessageDebugMenuFragment.class */
public final class MessageDebugMenuFragment extends 2Ov implements C00g {
    public Bundle A00;
    public FbUserSession A01;
    public LithoView A02;
    public Long A03;
    public final C01i A04;
    public final C01i A05;

    public MessageDebugMenuFragment() {
        AQa aQa = new AQa(this, 28);
        C01i A00 = AQa.A00(new AQa(this, 25), C03i.A02, 26);
        this.A05 = 7zU.A0F(new AQa(A00, 27), aQa, new AQd(null, A00, 49), 7zL.A18(8DK.class));
        this.A04 = AQa.A00(this, C03i.A03, 24);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A12(Bundle bundle) {
        AJe.A03(this, 7zO.A0J(this), 49);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-2021507947);
        super.onCreate(bundle);
        A0g(0, R.style.Theme.Light.NoTitleBar.Fullscreen);
        this.A01 = 1BM.A01(this);
        0FI.A08(-624701075, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-813187405);
        LithoView A0M = 7zR.A0M(this);
        this.A02 = A0M;
        0FI.A08(1101810995, A02);
        return A0M;
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(-1654191233);
        super.onDestroyView();
        this.A02 = null;
        ((AnonymousClass536) 1Br.A0B(((I3n) this.A04.getValue()).A03)).A0E("msg_debug_menu");
        0FI.A08(1526374438, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        String string;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (string = bundle2.getString("message_pk")) == null) {
            return;
        }
        Bundle bundle3 = this.mArguments;
        this.A00 = bundle3 != null ? bundle3.getBundle("data_model_bundle") : null;
        this.A03 = 0CW.A0e(string);
    }
}
