package com.facebook.xapp.messaging.composer.confirmsendmessage;

import X.0Gm;
import X.11T;
import X.1Iw;
import X.1LI;
import X.8YP;
import X.AKN;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: ConfirmSendMessageFragment.class */
public final class ConfirmSendMessageFragment extends MigBottomSheetDialogFragment {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        Bundle bundle = this.mArguments;
        Parcelable parcelable = bundle != null ? bundle.getParcelable(TraceFieldType.Uri) : null;
        Parcelable.Creator creator = Uri.CREATOR;
        11T.A0B(creator);
        return new 8YP((Uri) 0Gm.A01(creator, parcelable, Uri.class), new AKN(this, 1), new AKN(this, 2));
    }
}
