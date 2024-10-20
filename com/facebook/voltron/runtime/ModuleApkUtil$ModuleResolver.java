package com.facebook.voltron.runtime;

import X.0Pz;
import android.content.Context;

/* loaded from: ModuleApkUtil$ModuleResolver.class */
public class ModuleApkUtil$ModuleResolver {
    public static String A00(Context context, String str) {
        String str2;
        String[] strArr = context.getApplicationInfo().splitSourceDirs;
        if (strArr != null) {
            String A0j = 0Pz.A0j("split_", str, ".apk");
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= strArr.length) {
                    break;
                }
                str2 = strArr[i2];
                if (str2.endsWith(A0j)) {
                    break;
                }
                i = i2 + 1;
            }
            return str2;
        }
        str2 = null;
        return str2;
    }
}
