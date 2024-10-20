package com.facebook.messaging.aibot.nux;

import X.0Q8;
import X.11T;
import X.1BK;
import X.1Bn;
import X.1Iw;
import X.1pI;
import X.2dU;
import X.3vU;
import X.6Bw;
import X.7zO;
import X.8Tn;
import X.9De;
import X.9zG;
import X.AQX;
import X.AV1;
import X.AVM;
import X.BOj;
import X.C00m;
import X.C77c;
import X.C8nn;
import X.C8r1;
import X.DGJ;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.litho.LithoView;
import com.facebook.messaging.aibot.nux.homenav.AiBotNuxBottomsheetLeftNavFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent;
import java.io.Serializable;

/* loaded from: AiBotNuxBottomsheetFragment.class */
public class AiBotNuxBottomsheetFragment extends BaseMigBottomSheetDialogFragment {
    public 1pI A00;
    public C77c A01;
    public C00m A02;
    public LithoView A03;
    public 3vU A04;

    /* JADX WARN: Multi-variable type inference failed */
    private final BOj A1K() {
        Bundle bundle = this.mArguments;
        BOj bOj = null;
        Serializable serializable = bundle != null ? bundle.getSerializable("AiBotNuxBottomsheetFragment.entry_point") : null;
        if (serializable instanceof BOj) {
            bOj = (BOj) serializable;
        }
        return bOj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public View A1C() {
        ThreadKey threadKey;
        C77c c77c = (C77c) 7zO.A0l(this, 68283);
        11T.A0F(c77c, 0);
        this.A01 = c77c;
        this.A04 = (3vU) 1Bn.A0A(68258);
        LithoView lithoView = new LithoView(requireContext(), (AttributeSet) null);
        this.A03 = lithoView;
        1Iw r0 = lithoView.A09;
        String str = "lithoView";
        8Tn A00 = C8nn.A00(r0);
        A00.A2a(A1F());
        A00.A2X();
        C77c c77c2 = this.A01;
        if (c77c2 != null) {
            11T.A0D(r0);
            MigColorScheme A1F = A1F();
            3vU r02 = this.A04;
            if (r02 != null) {
                A00.A2Y(c77c2.A0A(A1K(), r0, A1F, r02, AV1.A00(this, 24)));
                lithoView.A0y(A00.A2W());
                3vU r03 = this.A04;
                if (r03 != null) {
                    r03.A0E(A1K());
                    Bundle bundle = this.mArguments;
                    if (bundle != null && (threadKey = (ThreadKey) bundle.getParcelable("AiBotNuxBottomsheetFragment.thread_key")) != null) {
                        2dU.A01((6Bw) null, new PRELoggingEvent(1BK.A01(threadKey)));
                    }
                    LithoView lithoView2 = this.A03;
                    if (lithoView2 != null) {
                        return lithoView2;
                    }
                }
            }
            11T.A0L("logger");
            throw 0Q8.createAndThrow();
        }
        str = "aiBotNuxUtils";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return 9De.A00();
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public DGJ A1E(1Iw r302) {
        return new 9zG(this, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDismiss(DialogInterface dialogInterface) {
        String str;
        11T.A0F(dialogInterface, 0);
        3vU r0 = this.A04;
        if (r0 != null) {
            3vU.A06(A1K(), r0, "cancel", 11);
            Bundle bundle = this.mArguments;
            if (bundle == null || !bundle.getBoolean("AiBotNuxFragment.skip_bot_picker")) {
                if (this.A03 == null) {
                    return;
                }
                1pI r02 = this.A00;
                if (r02 != null && r02.BVa()) {
                    if (this instanceof AiBotNuxBottomsheetLeftNavFragment) {
                        if (A1K() == BOj.A0A) {
                            C8r1.A01.A00(A1K(), new AQX(this, 4), new AVM(this, 40));
                        }
                    } else if (this.A01 != null) {
                        Bundle bundle2 = this.mArguments;
                        C77c.A07(A1K(), r02, bundle2 != null ? bundle2.getBoolean("AiBotNuxFragment.finish_activity_on_picker_close") : false);
                    } else {
                        str = "aiBotNuxUtils";
                    }
                }
            }
            C00m c00m = this.A02;
            if (c00m != null) {
                c00m.invoke();
            }
            super/*X.0D2*/.onDismiss(dialogInterface);
            return;
        }
        str = "logger";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
