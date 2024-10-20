package com.facebook.tigon;

import X.0Pz;
import X.42E;
import X.42F;
import X.4OD;
import X.C42M;
import java.io.PrintStream;
import java.util.Arrays;

/* loaded from: TigonCallbacksIntegerBufferJavaHelper.class */
public class TigonCallbacksIntegerBufferJavaHelper {
    public static void onEOM(TigonCallbacks tigonCallbacks, byte[] bArr, int i) {
        boolean z;
        try {
            z = true;
        } catch (OutOfMemoryError e) {
            e = e;
            z = false;
        }
        try {
            tigonCallbacks.onEOM(42E.A01(bArr, i));
        } catch (OutOfMemoryError e2) {
            e = e2;
            String A0v = 0Pz.A0v("OutOfMemory in TigonCallbacksIntegerBufferJavaHelper onEOM. size:", String.valueOf(i), " tigonSummaryDeserialized:", String.valueOf(z));
            PrintStream printStream = System.out;
            printStream.println(A0v);
            printStream.println(Arrays.toString(e.getStackTrace()));
            throw new Error(A0v, e);
        }
    }

    public static void onError(TigonCallbacks tigonCallbacks, byte[] bArr, int i, byte[] bArr2, int i2) {
        tigonCallbacks.onError(42E.A00(bArr, i), 42E.A01(bArr2, i2));
    }

    public static void onResponse(TigonCallbacks tigonCallbacks, byte[] bArr, int i) {
        42F r0 = new 42F(bArr, i);
        tigonCallbacks.onResponse(new C42M(4OD.A00(r0), 42E.A00.A03(r0)));
    }

    public static void onStarted(TigonCallbacks tigonCallbacks, byte[] bArr, int i) {
        tigonCallbacks.onStarted(42E.A03(bArr, i));
    }

    public static void onWillRetry(TigonCallbacks tigonCallbacks, byte[] bArr, int i, byte[] bArr2, int i2) {
        tigonCallbacks.onWillRetry(42E.A00(bArr, i), 42E.A01(bArr2, i2));
    }
}
