package com.facebook.messaging.encryptedbackups.passkey.ui.setup;

import X.0Q8;
import X.0fH;
import X.11T;
import X.1BL;
import X.7zL;
import X.7zO;
import X.7zR;
import X.7zT;
import X.7zU;
import X.7zV;
import X.8Cw;
import X.ACb;
import X.AJe;
import X.AJi;
import X.AQn;
import X.AQt;
import X.AnonymousClass001;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C2ya;
import X.C96q;
import X.C97j;
import X.C9af;
import X.FAn;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.facebook.messaging.encryptedbackups.basefragment.BaseFragment;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;

/* loaded from: EbPasskeySetupFragment.class */
public final class EbPasskeySetupFragment extends BaseFragment {
    public 8Cw A00;
    public FAn A01;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A0B(EbPasskeySetupFragment ebPasskeySetupFragment) {
        String str;
        8Cw r0 = ebPasskeySetupFragment.A00;
        if (r0 == null) {
            str = "viewModel";
        } else {
            C9af c9af = r0.A00;
            if (c9af != null) {
                c9af.A01.flowEndCancel(c9af.A00, CancelReason.USER_CANCELLED);
            }
            if (!ebPasskeySetupFragment.A1l()) {
                7zR.A14(ebPasskeySetupFragment);
                return;
            }
            if (ebPasskeySetupFragment.A01 != null) {
                Intent A05 = 7zV.A05(Bundle.EMPTY, ebPasskeySetupFragment, C97j.A0O.key, ebPasskeySetupFragment.A1l() ? 1 : 0);
                if (A05 != null) {
                    ebPasskeySetupFragment.A1Y(A05);
                    return;
                }
                return;
            }
            str = "intentBuilder";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        AQn A01 = AQn.A01(this, 36);
        C01i A00 = C01g.A00(C03i.A02, AQn.A01(AQn.A01(this, 33), 34));
        this.A00 = (8Cw) 7zU.A0F(AQn.A01(A00, 35), A01, AQt.A01(null, A00, 47), 7zL.A18(8Cw.class)).getValue();
        this.A01 = 7zR.A0Y();
        8Cw r0 = this.A00;
        if (r0 == null) {
            11T.A0L("viewModel");
            throw 0Q8.createAndThrow();
        }
        0fH.A0j("EbPasskeySetupViewModel", AnonymousClass001.A0Z(r0, "onFragmentCreate for ", AnonymousClass001.A0k()));
        1BL.A1I(bundle, "savedInstanceState=", "EbPasskeySetupViewModel", AnonymousClass001.A0k());
        if (bundle == null) {
            UserFlowLogger userFlowLogger = r0.A05;
            ACb aCb = new ACb(new C9af(userFlowLogger, userFlowLogger.generateNewFlowId(231346147)));
            C2ya c2ya = r0.impl;
            if (c2ya != null) {
                if (c2ya.A03) {
                    C2ya.A00(aCb);
                } else {
                    synchronized (c2ya.A00) {
                        c2ya.A02.add(aCb);
                    }
                }
            }
            C9af c9af = aCb.A00;
            r0.A00 = c9af;
            c9af.A01.flowStart(c9af.A00, new UserFlowConfig(C96q.A0A.toString(), false));
            C9af c9af2 = r0.A00;
            if (c9af2 != null) {
                c9af2.A00("PASSKEY_UPSELL_SCREEN_IMPRESSION");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        8Cw r0 = this.A00;
        if (r0 == null) {
            11T.A0L("viewModel");
            throw 0Q8.createAndThrow();
        }
        7zT.A1C(this, new AJi(this, null, 13), r0.A07);
        AJe.A03(this, 7zO.A0J(this), 1);
    }
}
