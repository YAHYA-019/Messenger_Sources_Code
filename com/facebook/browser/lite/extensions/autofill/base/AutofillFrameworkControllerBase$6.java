package com.facebook.browser.lite.extensions.autofill.base;

import X.0FI;
import X.LEA;
import X.LET;
import com.facebook.browser.lite.ipc.AutofillContactDataCallback;
import java.util.List;

/* loaded from: AutofillFrameworkControllerBase$6.class */
public final class AutofillFrameworkControllerBase$6 extends AutofillContactDataCallback.Stub {
    public final /* synthetic */ LET A00;

    public AutofillFrameworkControllerBase$6(LET let) {
        this.A00 = let;
        0FI.A09(1967169064, 0FI.A03(1269239284));
    }

    @Override // com.facebook.browser.lite.ipc.AutofillContactDataCallback
    public void BmF(List list) {
        int A03 = 0FI.A03(1789124006);
        LET let = this.A00;
        if (let.A03.A0Q) {
            let.A0A = LEA.A02(list);
        }
        0FI.A09(959344954, A03);
    }
}
