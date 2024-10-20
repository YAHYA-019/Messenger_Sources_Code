package com.facebook.messaging.publicchats.plugins.threadview.messageaspagevoiceswitchtoast;

import X.0Q8;
import X.11T;
import android.os.Bundle;
import com.facebook.mig.nux.MigNuxBottomSheet;

/* loaded from: MessageAsPageDisclosureBottomsheet.class */
public final class MessageAsPageDisclosureBottomsheet extends MigNuxBottomSheet {
    public String A00;
    public String A01;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r307 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0060, code lost:
    
        if (r307 == null) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.nux.MigNuxBottomSheet, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r302) {
        /*
            r301 = this;
            r0 = 2021106390(0x7877a2d6, float:2.0090625E34)
            r303 = r0
            r0 = r303
            int r0 = X.0FI.A02(r0)
            r304 = r0
            r0 = r301
            r1 = r302
            super.onCreate(r1)
            java.lang.String r0 = "Required value was null."
            r305 = r0
            java.lang.String r0 = "thread_image_url"
            r306 = r0
            r0 = r302
            if (r0 == 0) goto L26
            r0 = r302
            r1 = r306
            java.lang.String r0 = r0.getString(r1)
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L48
        L26:
            r0 = r301
            android.os.Bundle r0 = r0.requireArguments()
            r1 = r306
            java.lang.String r0 = r0.getString(r1)
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L48
            r0 = r305
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0N(r0)
            r306 = r0
            r0 = -1742144658(0xffffffff9828fb6e, float:-2.184043E-24)
            r303 = r0
        L40:
            r0 = r303
            r1 = r304
            X.0FI.A08(r0, r1)
            r0 = r306
            throw r0
        L48:
            r0 = r301
            r1 = r307
            r0.A01 = r1
            java.lang.String r0 = "profile_name"
            r306 = r0
            r0 = r302
            if (r0 == 0) goto L63
            r0 = r302
            r1 = r306
            java.lang.String r0 = r0.getString(r1)
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L80
        L63:
            r0 = r301
            android.os.Bundle r0 = r0.requireArguments()
            r1 = r306
            java.lang.String r0 = r0.getString(r1)
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L80
            r0 = r305
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0N(r0)
            r306 = r0
            r0 = 1891607061(0x70bfa215, float:4.7446066E29)
            r303 = r0
            goto L40
        L80:
            r0 = r301
            r1 = r307
            r0.A00 = r1
            r0 = -401621663(0xffffffffe80fbd61, float:-2.7151673E24)
            r1 = r304
            X.0FI.A08(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.publicchats.plugins.threadview.messageaspagevoiceswitchtoast.MessageAsPageDisclosureBottomsheet.onCreate(android.os.Bundle):void");
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        String str = this.A00;
        if (str == null) {
            11T.A0L("profileName");
            throw 0Q8.createAndThrow();
        }
        bundle.putString("profile_name", str);
        bundle.putString("thread_image_url", this.A01);
    }
}
