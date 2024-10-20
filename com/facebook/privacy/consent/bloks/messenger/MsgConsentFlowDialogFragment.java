package com.facebook.privacy.consent.bloks.messenger;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.2Ov;
import X.EXQ;
import X.Em4;
import X.F3s;
import X.FyG;
import android.os.Bundle;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: MsgConsentFlowDialogFragment.class */
public final class MsgConsentFlowDialogFragment extends 2Ov {
    public MigColorScheme A00;
    public FyG A01;
    public Em4 A02;
    public String A03;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0073, code lost:
    
        if (r312 != null) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v270, types: [android.graphics.drawable.ColorDrawable] */
    /* JADX WARN: Type inference failed for: r301v0, types: [androidx.fragment.app.Fragment, java.lang.Object, com.facebook.privacy.consent.bloks.messenger.MsgConsentFlowDialogFragment] */
    /* JADX WARN: Type inference failed for: r315v8, types: [androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.app.Dialog A0n(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 1333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.privacy.consent.bloks.messenger.MsgConsentFlowDialogFragment.A0n(android.os.Bundle):android.app.Dialog");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-1082144555);
        super.onCreate(bundle);
        String string = requireArguments().getString("prompt_id");
        if (string == null) {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A08(1227305965, A02);
            throw A0h;
        }
        this.A03 = string;
        Em4 em4 = (Em4) F3s.A01.get(string);
        if (em4 == null) {
            String str = this.A03;
            if (str == null) {
                11T.A0L("promptId");
                throw 0Q8.createAndThrow();
            }
            EXQ.A00(this, str);
        } else {
            this.A02 = em4;
        }
        0FI.A08(1276065145, A02);
    }
}
