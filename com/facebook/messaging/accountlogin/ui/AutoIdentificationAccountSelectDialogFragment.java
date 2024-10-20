package com.facebook.messaging.accountlogin.ui;

import X.0FI;
import X.1BL;
import X.1BV;
import X.1Lo;
import X.1iF;
import X.2Ov;
import X.AbK;
import X.Bzx;
import X.C00i;
import X.C2kx;
import X.COX;
import android.os.Bundle;
import com.facebook.account.recovery.common.model.AccountCandidateModel;
import com.facebook.litho.LithoView;
import java.util.ArrayList;

/* loaded from: AutoIdentificationAccountSelectDialogFragment.class */
public class AutoIdentificationAccountSelectDialogFragment extends 2Ov {
    public C00i A00;
    public Bzx A01;
    public String A02;
    public ArrayList A03;
    public LithoView A04;
    public final C2kx A07 = new C2kx();
    public final C00i A08 = 1BV.A00(67646);
    public final C00i A05 = 1BV.A00(85282);
    public final C00i A06 = 1BV.A00(84025);

    public static boolean A05(AutoIdentificationAccountSelectDialogFragment autoIdentificationAccountSelectDialogFragment) {
        ArrayList arrayList = autoIdentificationAccountSelectDialogFragment.A03;
        return (arrayList == null || arrayList.size() != 1 || COX.A01(((AccountCandidateModel) arrayList.get(0)).A00(), autoIdentificationAccountSelectDialogFragment.A02).endsWith("@gmail.com")) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0120, code lost:
    
        if (r317 == null) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.app.Dialog A0n(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.accountlogin.ui.AutoIdentificationAccountSelectDialogFragment.A0n(android.os.Bundle):android.app.Dialog");
    }

    public 1iF A17() {
        return AbK.A0F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1206264909);
        super.onCreate(bundle);
        this.A00 = 1Lo.A02(1BL.A0G(this), this, 17067);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A03 = bundle2.getParcelableArrayList("account_candidate_models");
            this.A02 = bundle2.getString("device_emails");
        }
        0FI.A08(831004743, A02);
    }
}
