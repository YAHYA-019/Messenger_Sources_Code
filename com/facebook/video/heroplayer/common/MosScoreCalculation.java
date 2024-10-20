package com.facebook.video.heroplayer.common;

import X.6Yl;
import X.6Zt;
import X.AnonymousClass001;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: MosScoreCalculation.class */
public abstract class MosScoreCalculation {
    public static float A00(6Yl r301, int i, boolean z) {
        String str;
        6Zt r0 = r301.A0N;
        String str2 = r0.A04;
        str = "";
        if (str2 == null) {
            str2 = str;
        }
        String str3 = r0.A05;
        str = str3 != null ? str3 : "";
        if (!z || str2.isEmpty()) {
            str2 = str;
        }
        return A02(A03(str2), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static float A01(java.lang.String r301, int r302, int r303) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.heroplayer.common.MosScoreCalculation.A01(java.lang.String, int, int):float");
    }

    public static float A02(TreeMap treeMap, int i) {
        Object value;
        if (treeMap.isEmpty()) {
            return 0.0f;
        }
        Integer valueOf = Integer.valueOf(i);
        if (treeMap.containsKey(valueOf)) {
            value = treeMap.get(valueOf);
        } else {
            Map.Entry lowerEntry = treeMap.lowerEntry(valueOf);
            Map.Entry higherEntry = treeMap.higherEntry(valueOf);
            if (lowerEntry == null) {
                value = higherEntry.getValue();
            } else {
                if (higherEntry != null) {
                    return ((Number) higherEntry.getValue()).floatValue() + (((AnonymousClass001.A03(higherEntry.getKey()) - i) * (((Number) lowerEntry.getValue()).floatValue() - ((Number) higherEntry.getValue()).floatValue())) / (AnonymousClass001.A03(higherEntry.getKey()) - AnonymousClass001.A03(lowerEntry.getKey())));
                }
                value = lowerEntry.getValue();
            }
        }
        return ((Number) value).floatValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        throw X.0Pz.A05("Ill formatted string:", r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.TreeMap A03(java.lang.String r301) {
        /*
            java.util.TreeMap r0 = new java.util.TreeMap
            r302 = r0
            r0 = r302
            r0.<init>()
            java.lang.String r0 = ","
            r303 = r0
            r0 = r301
            r1 = r303
            java.lang.String[] r0 = r0.split(r1)
            r304 = r0
            r0 = r304
            int r0 = r0.length     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L93
            r305 = r0
            r0 = 0
            r301 = r0
            r0 = 0
            r306 = r0
        L1a:
            r0 = r306
            r1 = r305
            if (r0 >= r1) goto L91
            r0 = r304
            r1 = r306
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L93
            r307 = r0
            java.lang.String r0 = ":"
            r303 = r0
            r0 = r307
            r1 = r303
            java.lang.String[] r0 = r0.split(r1)     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L93
            r308 = r0
            r0 = r308
            int r0 = r0.length     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L93
            r309 = r0
            r0 = 2
            r310 = r0
            r0 = 2
            r311 = r0
            r0 = r309
            r1 = r310
            if (r0 != r1) goto L81
            r0 = r308
            r1 = 0
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L93
            r303 = r0
            r0 = r303
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L93
            r310 = r0
            r0 = r310
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L93
            r312 = r0
            r0 = 1
            r310 = r0
            r0 = 1
            r311 = r0
            r0 = r308
            r1 = r310
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L93
            r303 = r0
            r0 = r303
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L93
            r311 = r0
            r0 = r311
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L93
            r303 = r0
            r0 = r302
            r1 = r312
            r2 = r303
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L93
            r0 = r306
            r1 = 1
            int r0 = r0 + r1
            r306 = r0
            goto L1a
        L81:
            java.lang.String r0 = "Ill formatted string:"
            r303 = r0
            r0 = r303
            r1 = r307
            java.lang.IllegalArgumentException r0 = X.0Pz.A05(r0, r1)     // Catch: java.lang.Throwable -> L93
            r303 = r0
            r0 = r303
            throw r0     // Catch: java.lang.Throwable -> L93 java.lang.Throwable -> L93
        L8d:
            r0 = r302
            r0.clear()
        L91:
            r0 = r302
            return r0
        L93:
            goto L8d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.heroplayer.common.MosScoreCalculation.A03(java.lang.String):java.util.TreeMap");
    }
}
