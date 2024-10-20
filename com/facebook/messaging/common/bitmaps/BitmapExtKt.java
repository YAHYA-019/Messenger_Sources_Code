package com.facebook.messaging.common.bitmaps;

import X.04S;
import X.07E;
import X.0DR;
import X.0Ds;
import X.2aG;
import X.AJZ;
import X.AeI;
import android.graphics.Bitmap;
import android.graphics.Color;
import kotlin.jvm.functions.Function1;

/* loaded from: BitmapExtKt.class */
public abstract class BitmapExtKt {
    public static final int A01 = Color.argb(255, 0, 0, 0);
    public static final int A00 = Color.argb(0, 0, 0, 0);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0057  */
    /* JADX WARN: Type inference failed for: r313v0, types: [java.lang.Object, X.0PI] */
    /* JADX WARN: Type inference failed for: r314v0, types: [java.lang.Object, X.0PI] */
    /* JADX WARN: Type inference failed for: r315v0, types: [java.lang.Object, X.0PI] */
    /* JADX WARN: Type inference failed for: r316v0, types: [java.lang.Object, X.0PI] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A00(android.graphics.Bitmap r301, java.util.List r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.common.bitmaps.BitmapExtKt.A00(android.graphics.Bitmap, java.util.List, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x014a, code lost:
    
        if (A02(r305, r0, r0, java.lang.Runtime.getRuntime().availableProcessors()) == r0) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0052  */
    /* JADX WARN: Type inference failed for: r314v0, types: [java.lang.Object, X.0CL] */
    /* JADX WARN: Type inference failed for: r314v1 */
    /* JADX WARN: Type inference failed for: r314v10 */
    /* JADX WARN: Type inference failed for: r314v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A01(android.graphics.Bitmap r301, X.0DR r302, int r303) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.common.bitmaps.BitmapExtKt.A01(android.graphics.Bitmap, X.0DR, int):java.lang.Object");
    }

    public static final Object A02(0DR r301, Function1 function1, 07E r303, int i) {
        Object A002 = 2aG.A00(r301, new AJZ((0DR) null, new AeI(function1, 37), r303, i));
        0Ds r0 = 0Ds.A02;
        if (A002 != r0) {
            A002 = 04S.A00;
        }
        if (A002 != r0) {
            A002 = 04S.A00;
        }
        return A002;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x01cf -> B:13:0x00ab). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A03(X.0DR r301, int[] r302, int r303, int r304, int r305) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.common.bitmaps.BitmapExtKt.A03(X.0DR, int[], int, int, int):java.lang.Object");
    }

    public static final int[] A04(Bitmap bitmap) {
        int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        return iArr;
    }
}
