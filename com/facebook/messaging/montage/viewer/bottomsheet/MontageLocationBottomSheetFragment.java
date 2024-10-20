package com.facebook.messaging.montage.viewer.bottomsheet;

import X.0FI;
import X.11T;
import X.AnonymousClass001;
import X.GOm;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.messaging.montage.model.montagemetadata.MontageActorInfo;
import com.facebook.messaging.montage.model.montagemetadata.MontageStoryLocationData;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.UserKey;

/* loaded from: MontageLocationBottomSheetFragment.class */
public final class MontageLocationBottomSheetFragment extends MigBottomSheetDialogFragment {
    public DialogInterface.OnDismissListener A00;
    public MontageActorInfo A01;
    public MontageStoryLocationData A02;
    public MigColorScheme A03;
    public UserKey A04;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0049, code lost:
    
        if (X.0CU.A0O(r0) != false) goto L8;
     */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A1K(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.viewer.bottomsheet.MontageLocationBottomSheetFragment.A1K(X.1Iw):X.1LI");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        IllegalStateException A0N;
        int i;
        MontageActorInfo montageActorInfo;
        UserKey userKey;
        int A02 = 0FI.A02(1183854160);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        MontageStoryLocationData montageStoryLocationData = null;
        if (bundle2 != null) {
            montageStoryLocationData = (MontageStoryLocationData) bundle2.getParcelable("montage_location_attribution");
        }
        if (montageStoryLocationData != null) {
            this.A02 = montageStoryLocationData;
            Bundle bundle3 = this.mArguments;
            if (bundle3 == null || (montageActorInfo = (MontageActorInfo) bundle3.getParcelable(GOm.A00(291))) == null) {
                A0N = AnonymousClass001.A0N("Required value was null.");
                i = -1371558663;
            } else {
                this.A01 = montageActorInfo;
                Bundle bundle4 = this.mArguments;
                if (bundle4 != null && (userKey = (UserKey) bundle4.getParcelable("montage_user_key")) != null) {
                    this.A04 = userKey;
                    0FI.A08(-443399841, A02);
                    return;
                } else {
                    A0N = AnonymousClass001.A0N("Required value was null.");
                    i = 74318668;
                }
            }
        } else {
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = 7929641;
        }
        0FI.A08(i, A02);
        throw A0N;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        11T.A0F(dialogInterface, 0);
        super/*X.0D2*/.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.A00;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
