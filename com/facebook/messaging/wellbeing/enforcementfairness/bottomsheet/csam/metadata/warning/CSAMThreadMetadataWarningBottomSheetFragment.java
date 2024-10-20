package com.facebook.messaging.wellbeing.enforcementfairness.bottomsheet.csam.metadata.warning;

import X.0Q8;
import X.11T;
import X.1EK;
import X.1Iw;
import X.1LI;
import X.1iF;
import X.7zU;
import X.8Y7;
import X.AnonymousClass018;
import X.C5nv;
import X.C9l9;
import X.CJ2;
import X.RTD;
import android.content.DialogInterface;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.fury.context.ReqContext;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: CSAMThreadMetadataWarningBottomSheetFragment.class */
public final class CSAMThreadMetadataWarningBottomSheetFragment extends MigBottomSheetDialogFragment {
    public int A00 = 8;
    public C5nv A01;
    public ThreadSummary A02;
    public C9l9 A03;
    public CJ2 A04;
    public FbUserSession A05;
    public RTD A06;

    public 1iF A17() {
        return new 1iF(264058138846505L);
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        MigColorScheme A1F = A1F();
        RTD rtd = this.A06;
        if (rtd != null) {
            return new 8Y7(rtd, A1F, 7zU.A0t(this, 33));
        }
        11T.A0L("model");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d5  */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 849
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.wellbeing.enforcementfairness.bottomsheet.csam.metadata.warning.CSAMThreadMetadataWarningBottomSheetFragment.onCreate(android.os.Bundle):void");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        11T.A0F(dialogInterface, 0);
        super/*X.0D2*/.onDismiss(dialogInterface);
        1EK.A08("CSAMThreadMetadataWarningBottomSheetFragment");
        try {
            ReqContext A04 = AnonymousClass018.A04("CSAMThreadMetadataWarningBottomSheetFragment", 0);
            try {
                C5nv c5nv = this.A01;
                if (c5nv != null) {
                    C9l9 c9l9 = this.A03;
                    if (c9l9 == null) {
                        11T.A0L("logger");
                        throw 0Q8.createAndThrow();
                    }
                    c9l9.A02(c5nv);
                }
                CJ2 cj2 = this.A04;
                if (cj2 != null) {
                    cj2.A04(false);
                }
                if (A04 != null) {
                    A04.close();
                }
            } finally {
            }
        } finally {
            1EK.A03();
        }
    }
}
