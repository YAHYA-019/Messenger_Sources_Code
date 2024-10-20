package com.facebook.messaging.communitymessaging.plugins.takedowns.bottomsheet;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BM;
import X.1Br;
import X.1Iw;
import X.1LI;
import X.9De;
import X.AbG;
import X.AxN;
import X.BpH;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: ChatTakedownBottomSheetDialogFragment.class */
public final class ChatTakedownBottomSheetDialogFragment extends MigBottomSheetDialogFragment {
    public FbUserSession A00;
    public ChatTakedownBottomSheetModel A01;

    /* JADX WARN: Multi-variable type inference failed */
    public static final AxN A05(ChatTakedownBottomSheetDialogFragment chatTakedownBottomSheetDialogFragment, boolean z) {
        Context requireContext = chatTakedownBottomSheetDialogFragment.requireContext();
        1Br A0c = AbG.A0c();
        MigColorScheme A1F = chatTakedownBottomSheetDialogFragment.A1F();
        BpH bpH = new BpH(requireContext, A0c, chatTakedownBottomSheetDialogFragment);
        ChatTakedownBottomSheetModel chatTakedownBottomSheetModel = chatTakedownBottomSheetDialogFragment.A01;
        if (chatTakedownBottomSheetModel != null) {
            return new AxN(bpH, A1F, chatTakedownBottomSheetModel.A04, z);
        }
        11T.A0L("model");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Throwable, java.util.concurrent.Executor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0x() {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.communitymessaging.plugins.takedowns.bottomsheet.ChatTakedownBottomSheetDialogFragment.A0x():void");
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return 9De.A00();
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        11T.A0F(r302, 0);
        return A05(this, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(2008437923);
        super.onCreate(bundle);
        this.A00 = 1BM.A01(this);
        Parcelable parcelable = requireArguments().getParcelable("ChatTakedownBottomSheetModel");
        if (parcelable != null) {
            this.A01 = (ChatTakedownBottomSheetModel) parcelable;
            0FI.A08(-631397456, A02);
        } else {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A08(-503745387, A02);
            throw A0h;
        }
    }
}
