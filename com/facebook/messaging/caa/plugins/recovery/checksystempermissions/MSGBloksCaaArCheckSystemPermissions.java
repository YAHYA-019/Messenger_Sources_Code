package com.facebook.messaging.caa.plugins.recovery.checksystempermissions;

import X.11T;
import X.1BK;
import X.1BV;
import X.53T;
import X.7zN;
import X.7zS;
import X.AbG;
import X.AbL;
import X.AnonymousClass001;
import X.C2xd;
import X.C5ig;
import X.C5iw;
import X.DKC;
import X.DKE;
import X.DKc;
import X.E9Q;
import X.FGb;
import X.FHh;
import X.Fwk;
import X.GJj;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.facebook.runtimepermissions.RequestPermissionsConfig;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: MSGBloksCaaArCheckSystemPermissions.class */
public final class MSGBloksCaaArCheckSystemPermissions {
    public static final Map A00;
    public static final Map A01;

    static {
        Integer A0i = 7zN.A0i();
        Integer A11 = AbG.A11();
        A01 = 7zS.A14(A11, "android.permission.READ_PHONE_STATE", 1BK.A1G(A0i, "android.permission.GET_ACCOUNTS"), 1BK.A1G(2, "android.permission.READ_CONTACTS"));
        A00 = AbL.A0i(4, "android.permission.READ_PHONE_NUMBERS", 1BK.A1G(A0i, "android.permission.GET_ACCOUNTS"), 1BK.A1G(2, "android.permission.READ_CONTACTS"), 1BK.A1G(A11, "android.permission.READ_PHONE_STATE"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0066, code lost:
    
        r0.add(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.ArrayList A00(java.util.ArrayList r301) {
        /*
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r302 = r0
            r0 = 3
            r303 = r0
            r0 = r303
            java.lang.String r0 = X.GOm.A00(r0)
            r304 = r0
            r0 = r301
            java.util.Iterator r0 = r0.iterator()
            r305 = r0
        L11:
            r0 = r305
            boolean r0 = r0.hasNext()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L7e
            r0 = r305
            java.lang.String r0 = X.AnonymousClass001.A0i(r0)
            r306 = r0
            java.util.Map r0 = com.facebook.messaging.caa.plugins.recovery.checksystempermissions.MSGBloksCaaArCheckSystemPermissions.A00
            r307 = r0
            r0 = r307
            java.util.Iterator r0 = X.1BK.A1B(r0)
            r308 = r0
        L30:
            r0 = r308
            boolean r0 = r0.hasNext()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L70
            r0 = r308
            java.lang.Object r0 = r0.next()
            r309 = r0
            r0 = r309
            int r0 = X.AnonymousClass001.A03(r0)
            r303 = r0
            r0 = r307
            r1 = r303
            java.lang.Object r0 = X.7zN.A0r(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            r310 = r0
            r0 = 0
            r311 = r0
            r0 = r310
            r1 = r306
            r2 = 0
            boolean r0 = X.0CV.A0a(r0, r1, r2)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L30
            r0 = r302
            r1 = r309
            boolean r0 = r0.add(r1)
            goto L11
        L70:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r311 = r0
            r0 = r311
            r1 = r304
            r0.<init>(r1)
            r0 = r311
            throw r0
        L7e:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.caa.plugins.recovery.checksystempermissions.MSGBloksCaaArCheckSystemPermissions.A00(java.util.ArrayList):java.util.ArrayList");
    }

    public final Object A01(Fwk fwk, FHh fHh, DKc dKc) {
        11T.A0F(fwk, 0);
        Object A10 = DKC.A10(dKc, 0);
        A10.getClass();
        AbstractCollection abstractCollection = (AbstractCollection) A10;
        GJj A002 = FGb.A00(dKc, 1);
        Context context = fwk.A00;
        1BV A003 = 1BV.A00(306);
        if (context instanceof C5ig) {
            context = ((ContextWrapper) context).getBaseContext();
            11T.A0A(context);
        }
        if (!(context instanceof Activity)) {
            return null;
        }
        53T A0M = ((C2xd) A003.get()).A0M((Activity) context);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            Object A0r = 7zN.A0r(A00, DKE.A0F(it));
            if (A0r != null) {
                A0s.add(A0r);
            }
        }
        if (A0s.isEmpty()) {
            return null;
        }
        C5iw c5iw = new C5iw();
        c5iw.A00 = 0;
        c5iw.A01 = 1;
        A0M.AHQ(new RequestPermissionsConfig(c5iw), new E9Q(3, A002, this, A0s, fHh), (String[]) A0s.toArray(new String[0]));
        return null;
    }
}
