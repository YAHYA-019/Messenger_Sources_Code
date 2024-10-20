package com.facebook.soloader;

import X.AnonymousClass001;
import X.C0ib;
import android.content.Context;

/* loaded from: SoLoaderDSONotFoundError.class */
public class SoLoaderDSONotFoundError extends SoLoaderULError {
    public SoLoaderDSONotFoundError(String str) {
        super(str);
    }

    public SoLoaderDSONotFoundError(String str, String str2) {
        super(str, str2);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [com.facebook.soloader.SoLoaderULError, com.facebook.soloader.SoLoaderDSONotFoundError] */
    public static SoLoaderDSONotFoundError create(String str, Context context, C0ib[] c0ibArr) {
        StringBuilder A0o = AnonymousClass001.A0o("couldn't find DSO to load: ");
        A0o.append(str);
        A0o.append("\n\texisting SO sources: ");
        for (int i = 0; i < c0ibArr.length; i++) {
            A0o.append("\n\t\tSoSource ");
            A0o.append(i);
            A0o.append(": ");
            A0o.append(c0ibArr[i].toString());
        }
        if (context != null) {
            A0o.append("\n\tNative lib dir: ");
            AnonymousClass001.A1I(A0o, context.getApplicationInfo().nativeLibraryDir);
        }
        return new SoLoaderULError(str, A0o.toString());
    }
}
