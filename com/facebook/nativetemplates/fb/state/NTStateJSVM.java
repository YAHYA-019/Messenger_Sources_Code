package com.facebook.nativetemplates.fb.state;

import X.1Bn;
import X.50F;
import X.AnonymousClass001;
import X.C15h;
import X.G7G;
import android.content.Context;
import android.os.Build;
import com.facebook.acra.constants.ActionId;
import com.facebook.java2js.JSContext;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: NTStateJSVM.class */
public final class NTStateJSVM {
    public volatile JSContext A03;
    public final 50F A00 = (50F) 1Bn.A0A(49434);
    public final C15h A02 = new G7G(this, 19);
    public final AtomicBoolean A01 = new AtomicBoolean(false);

    public static JSContext A00(Context context, NTStateJSVM nTStateJSVM) {
        if (nTStateJSVM.A03 == null) {
            50F r0 = nTStateJSVM.A00;
            int id = (int) Thread.currentThread().getId();
            r0.AR8(ActionId.ON_VIEW_CREATED_END, id);
            JSContext jSContext = JSContext.$redex_init_class;
            String packageName = context.getPackageName();
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append(Build.MODEL);
            A0k.append(" - ");
            A0k.append(Build.VERSION.RELEASE);
            A0k.append(" - API ");
            A0k.append(Build.VERSION.SDK_INT);
            String obj = A0k.toString();
            "Global".getClass();
            JSContext jSContext2 = new JSContext("Global", packageName, obj, "NT:State", null, null, false, false, 33554432, 67108864, 0L, null);
            r0.AR6(ActionId.ON_VIEW_CREATED_END, id);
            nTStateJSVM.A03 = jSContext2;
        }
        return nTStateJSVM.A03;
    }
}
