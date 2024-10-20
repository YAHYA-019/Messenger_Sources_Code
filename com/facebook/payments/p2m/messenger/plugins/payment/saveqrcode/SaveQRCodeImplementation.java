package com.facebook.payments.p2m.messenger.plugins.payment.saveqrcode;

import X.11T;
import X.1BK;
import X.1BL;
import X.1Bu;
import X.1Iw;
import X.48U;
import X.53S;
import X.53T;
import X.7zL;
import X.AnonymousClass001;
import X.C1A3;
import X.C5iw;
import X.DKC;
import X.DKD;
import X.DKc;
import X.FEK;
import X.FGJ;
import X.FGb;
import X.FHh;
import X.Fwk;
import X.GJj;
import X.RZO;
import X.Rjr;
import X.Rwd;
import android.content.Context;
import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.payments.checkout.model.CheckoutData;
import com.facebook.runtimepermissions.RequestPermissionsConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: SaveQRCodeImplementation.class */
public final class SaveQRCodeImplementation {
    public static final Object A00(Fwk fwk, FHh fHh, DKc dKc) {
        11T.A0F(fwk, 0);
        Context context = fwk.A00;
        1Iw A0W = 7zL.A0W(context);
        MigColorScheme migColorScheme = fwk.A01.A01;
        Object A10 = DKC.A10(dKc, 0);
        A10.getClass();
        String str = (String) A10;
        Object A102 = DKC.A10(dKc, 1);
        A102.getClass();
        String str2 = (String) A102;
        List list = dKc.A00;
        String A0x = DKD.A0x(list, 2);
        String A0x2 = DKD.A0x(list, 3);
        Object obj = list.get(4);
        11T.A0I(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        Set entrySet = ((Map) obj).entrySet();
        ArrayList A1E = C1A3.A1E(entrySet);
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(it);
            A1E.add(new RZO(AnonymousClass001.A0j(A0z), 1BK.A16(A0z), false));
        }
        GJj A00 = FGb.A00(dKc, 5);
        GJj A002 = FGb.A00(dKc, 6);
        String A0x3 = DKD.A0x(list, 9);
        Integer num = (Integer) list.get(10);
        Integer num2 = (Integer) list.get(11);
        Rjr rjr = Rjr.A00;
        53T A003 = ((53S) 1Bu.A06(context, 49478)).A00(context);
        String[] strArr = 48U.A00;
        if (A003.BNK(strArr)) {
            FGJ.A02(rjr, (View) null, A0W, migColorScheme, (CheckoutData) null, 1BL.A0a(A1E), num, num2, str, str2, A0x2, A0x, A0x3);
            FEK.A00(fHh, DKc.A01, A00);
            return null;
        }
        C5iw c5iw = new C5iw();
        c5iw.A00 = 1;
        c5iw.A06 = true;
        A003.AHQ(new RequestPermissionsConfig(c5iw), new Rwd(rjr, A0W, migColorScheme, fHh, A00, A002, num, num2, str, str2, A0x2, A0x, A0x3, A1E), strArr);
        return null;
    }
}
