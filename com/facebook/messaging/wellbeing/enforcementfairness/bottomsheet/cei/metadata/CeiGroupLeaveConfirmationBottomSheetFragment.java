package com.facebook.messaging.wellbeing.enforcementfairness.bottomsheet.cei.metadata;

import X.0Q8;
import X.11T;
import X.1Br;
import X.1Bu;
import X.1Iw;
import X.1LI;
import X.1iF;
import X.83U;
import X.8Zp;
import X.C5nv;
import X.C98R;
import X.C9l9;
import X.CJ2;
import X.DCy;
import android.content.DialogInterface;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.wellbeing.enforcementfairness.model.cei.metadata.GroupThreadLeaveConfirmationModel;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: CeiGroupLeaveConfirmationBottomSheetFragment.class */
public final class CeiGroupLeaveConfirmationBottomSheetFragment extends MigBottomSheetDialogFragment {
    public C5nv A00;
    public C9l9 A01;
    public int A02 = -1;
    public FbUserSession A03;
    public ThreadSummary A04;
    public GroupThreadLeaveConfirmationModel A05;
    public CJ2 A06;

    public 1iF A17() {
        return new 1iF(264058138846505L);
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        1Br A00 = 1Bu.A00(68771);
        MigColorScheme A1F = A1F();
        GroupThreadLeaveConfirmationModel groupThreadLeaveConfirmationModel = this.A05;
        if (groupThreadLeaveConfirmationModel != null) {
            return new 8Zp(groupThreadLeaveConfirmationModel, A1F, new DCy(this, 36), 83U.A01(A00, this, 44));
        }
        11T.A0L("model");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.wellbeing.enforcementfairness.bottomsheet.cei.metadata.CeiGroupLeaveConfirmationBottomSheetFragment.onCreate(android.os.Bundle):void");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        11T.A0F(dialogInterface, 0);
        super/*X.0D2*/.onDismiss(dialogInterface);
        C5nv c5nv = this.A00;
        if (c5nv != null) {
            C9l9 c9l9 = this.A01;
            if (c9l9 == null) {
                11T.A0L("logger");
                throw 0Q8.createAndThrow();
            }
            if (c5nv.A00()) {
                C9l9.A01(C98R.A0O, c9l9);
            }
        }
        CJ2 cj2 = this.A06;
        if (cj2 != null) {
            cj2.A03();
        }
    }
}
