package com.facebook.msys.dasm;

import X.C0il;
import X.C1jO;
import android.content.Context;
import android.content.res.AssetManager;

/* loaded from: DasmSupportHelper.class */
public class DasmSupportHelper {
    public static volatile Context sContext;

    static {
        synchronized (C1jO.class) {
            if (!C1jO.A00) {
                C0il.A0B("msysjnidasm");
                C1jO.A00 = true;
            }
        }
    }

    public static AssetManager assets() {
        if (sContext != null) {
            return sContext.getAssets();
        }
        return null;
    }
}
