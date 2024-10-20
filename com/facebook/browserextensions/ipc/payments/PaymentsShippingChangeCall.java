package com.facebook.browserextensions.ipc.payments;

import X.JJa;
import X.LGq;
import X.MMa;
import X.Qtq;
import X.Qym;
import android.os.Bundle;
import com.facebook.businessextension.jscalls.BusinessExtensionJSBridgeCall;

/* loaded from: PaymentsShippingChangeCall.class */
public final class PaymentsShippingChangeCall extends BusinessExtensionJSBridgeCall implements JJa {
    public static final MMa CREATOR = new LGq(6);

    @Override // X.JJa
    public Bundle Ab1(Qtq qtq, String str) {
        return Qym.A00(qtq, str, this.A05, (String) null);
    }
}
