package com.facebook.messaging.rollcall.presentation.viewer;

import X.0Q8;
import X.11T;
import X.4YV;
import X.7zK;
import X.7zL;
import X.7zN;
import X.AGE;
import X.AnonymousClass001;
import X.C9kf;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.dialog.ConfirmActionDialogFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: RollCallRemovePromptFragment.class */
public final class RollCallRemovePromptFragment extends ConfirmActionDialogFragment {
    public FbUserSession A00;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.dialog.ConfirmActionDialogFragment
    public void A1E() {
        Object parcelable;
        int i = Build.VERSION.SDK_INT;
        Bundle requireArguments = requireArguments();
        if (i >= 33) {
            parcelable = requireArguments.getParcelable("RollCallViewerFragment.thread_key", Parcelable.class);
            if (parcelable == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
        } else {
            parcelable = requireArguments.getParcelable("RollCallViewerFragment.thread_key");
            if (parcelable == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
        }
        ThreadKey threadKey = (ThreadKey) parcelable;
        String string = requireArguments().getString(7zK.A00(228));
        if (string == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        FbUserSession fbUserSession = this.A00;
        if (fbUserSession == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        C9kf c9kf = (C9kf) 7zN.A0m(this, fbUserSession, 68527);
        11T.A0F(threadKey, 0);
        4YV.A11(c9kf.A01).execute(new AGE(threadKey, c9kf, string));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b7  */
    @Override // com.facebook.messaging.dialog.ConfirmActionDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rollcall.presentation.viewer.RollCallRemovePromptFragment.onCreate(android.os.Bundle):void");
    }
}
