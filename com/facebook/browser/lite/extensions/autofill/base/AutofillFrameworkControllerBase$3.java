package com.facebook.browser.lite.extensions.autofill.base;

import X.0FI;
import X.Kve;
import X.LEA;
import X.LET;
import com.facebook.browser.lite.ipc.AutofillContactDataCallback;
import java.util.List;
import java.util.Set;

/* loaded from: AutofillFrameworkControllerBase$3.class */
public final class AutofillFrameworkControllerBase$3 extends AutofillContactDataCallback.Stub {
    public final /* synthetic */ LET A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ Set A02;

    public AutofillFrameworkControllerBase$3(LET let, Integer num, Set set) {
        this.A00 = let;
        this.A02 = set;
        this.A01 = num;
        0FI.A09(1976328366, 0FI.A03(88418367));
    }

    @Override // com.facebook.browser.lite.ipc.AutofillContactDataCallback
    public void BmF(List list) {
        int A03 = 0FI.A03(-698202626);
        LET let = this.A00;
        if (let.A03.A0Q) {
            let.A0A = LEA.A02(list);
        }
        List list2 = let.A0A;
        Set set = this.A02;
        let.A0Q(this.A01, Kve.A00(list2, set), set, false);
        0FI.A09(2030566370, A03);
    }
}
