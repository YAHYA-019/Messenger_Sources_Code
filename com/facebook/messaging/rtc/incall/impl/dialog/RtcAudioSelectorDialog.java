package com.facebook.messaging.rtc.incall.impl.dialog;

import X.0FI;
import X.0Q8;
import X.2Qa;
import X.2Qn;
import X.7zL;
import X.7zN;
import X.7zO;
import X.7zT;
import X.IYv;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: RtcAudioSelectorDialog.class */
public final class RtcAudioSelectorDialog extends MigBottomSheetDialogFragment {
    public FbUserSession A00;
    public final 2Qn A01 = IYv.A00(this, 18);

    /* JADX WARN: Multi-variable type inference failed */
    public void A0z() {
        super.A0z();
        FbUserSession fbUserSession = this.A00;
        if (fbUserSession == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        ((2Qa) 7zN.A0m(this, fbUserSession, 33089)).A03(this.A01);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A10() {
        super.A10();
        FbUserSession fbUserSession = this.A00;
        if (fbUserSession == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        ((2Qa) 7zN.A0m(this, fbUserSession, 33089)).A02(this.A01);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x011c, code lost:
    
        if (r306 == null) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01dd  */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.0CL] */
    /* JADX WARN: Type inference failed for: r301v0, types: [com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment, androidx.fragment.app.Fragment, com.facebook.messaging.rtc.incall.impl.dialog.RtcAudioSelectorDialog] */
    /* JADX WARN: Type inference failed for: r305v1, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r305v4, types: [java.util.AbstractCollection] */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A1K(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.dialog.RtcAudioSelectorDialog.A1K(X.1Iw):X.1LI");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1237964097);
        super.onCreate(bundle);
        this.A00 = 7zT.A08(this);
        ((BaseMigBottomSheetDialogFragment) this).A00 = (MigColorScheme) 7zO.A0l(this, 16980);
        0FI.A08(-183434501, A02);
    }
}
