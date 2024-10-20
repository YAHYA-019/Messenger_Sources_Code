package com.facebook.messaging.graph.contactinfomenu.contactbottomsheet;

import X.0FI;
import X.D4x;
import android.os.Bundle;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import java.io.Serializable;

/* loaded from: ContactBottomSheetDialogFragment.class */
public class ContactBottomSheetDialogFragment extends MigBottomSheetDialogFragment {
    public D4x A00;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r0.mUser == null) goto L10;
     */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A1K(X.1Iw r302) {
        /*
            r301 = this;
            r0 = r301
            X.D4x r0 = r0.A00
            java.lang.Class r0 = r0.getClass()
            r0 = r301
            X.D4x r0 = r0.A00
            r303 = r0
            r0 = r303
            com.facebook.mig.scheme.interfaces.MigColorScheme r0 = r0.mColorScheme
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L34
            r0 = r303
            com.google.common.collect.ImmutableList r0 = r0.mItems
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L34
            r0 = r303
            X.DED r0 = r0.mBottomSheetCallback
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L34
            r0 = r303
            com.facebook.user.model.User r0 = r0.mUser
            r303 = r0
            r0 = 1
            r305 = r0
            r0 = r303
            if (r0 != 0) goto L39
        L34:
            r0 = 0
            r305 = r0
            r0 = 0
            r304 = r0
        L39:
            r0 = r305
            com.google.common.base.Preconditions.checkArgument(r0)
            X.QIt r0 = new X.QIt
            r304 = r0
            r0 = r304
            r0.<init>()
            X.QCI r0 = new X.QCI
            r306 = r0
            r0 = r306
            r1 = r302
            r2 = r304
            r0.<init>(r1, r2)
            r0 = r301
            X.D4x r0 = r0.A00
            r307 = r0
            r0 = r307
            com.facebook.user.model.User r0 = r0.mUser
            r304 = r0
            r0 = r306
            X.QIt r0 = r0.A01
            r308 = r0
            r0 = r308
            r1 = r304
            r0.A02 = r1
            r0 = r306
            java.util.BitSet r0 = r0.A02
            r303 = r0
            r0 = r303
            r1 = 3
            r0.set(r1)
            r0 = r307
            X.DED r0 = r0.mBottomSheetCallback
            r304 = r0
            r0 = r308
            r1 = r304
            r0.A00 = r1
            r0 = r303
            r1 = 0
            r0.set(r1)
            r0 = r307
            com.facebook.mig.scheme.interfaces.MigColorScheme r0 = r0.mColorScheme
            r304 = r0
            r0 = r308
            r1 = r304
            r0.A01 = r1
            r0 = r303
            r1 = 1
            r0.set(r1)
            r0 = r307
            com.google.common.collect.ImmutableList r0 = r0.mItems
            r304 = r0
            r0 = r308
            r1 = r304
            r0.A03 = r1
            r0 = r303
            r1 = 2
            r0.set(r1)
            r0 = r306
            java.lang.String[] r0 = r0.A03
            r304 = r0
            r0 = r303
            r1 = r304
            X.C1rs.A02(r0, r1)
            r0 = r306
            r0.A0J()
            r0 = r308
            X.1LI r0 = (X.1LI) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.graph.contactinfomenu.contactbottomsheet.ContactBottomSheetDialogFragment.A1K(X.1Iw):X.1LI");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(217800110);
        super.onCreate(bundle);
        Serializable serializable = requireArguments().getSerializable("builder_key");
        serializable.getClass();
        this.A00 = (D4x) serializable;
        0FI.A08(-305522900, A02);
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("builder_key", this.A00);
    }

    public void onViewStateRestored(Bundle bundle) {
        int A02 = 0FI.A02(-1086306776);
        super/*X.0D2*/.onViewStateRestored(bundle);
        if (bundle != null) {
            Serializable serializable = bundle.getSerializable("builder_key");
            serializable.getClass();
            this.A00 = (D4x) serializable;
        }
        0FI.A08(-1795105930, A02);
    }
}
