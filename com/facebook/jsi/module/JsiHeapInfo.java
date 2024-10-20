package com.facebook.jsi.module;

import X.AnonymousClass001;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: JsiHeapInfo.class */
public class JsiHeapInfo {
    public static final String[] COMMON_STATS = {"full_gcCPUTime", "full_gcCPUTimeSquares", "full_gcMaxCPUPause", "full_gcTime", "full_gcTimeSquares", "full_maxPause", "full_numCollections", "yg_gcCPUTime", "yg_gcCPUTimeSquares", "yg_gcMaxCPUPause", "yg_gcTime", "yg_gcTimeSquares", "yg_maxPause", "yg_numCollections", "numMarkStackOverflows"};
    public final Map mStats = AnonymousClass001.A0u();

    public void accumulate(String str, String str2, long j) {
        boolean equals = str.equals("jsc_mallocBytes");
        if (str.startsWith("hermes_") || str.startsWith("jsc_")) {
            str = str.substring(str.indexOf(95) + 1);
        }
        long stat = getStat(str, str2);
        long max = equals ? Math.max(stat, j) : j + stat;
        AbstractMap abstractMap = (AbstractMap) this.mStats.get(str);
        if (abstractMap == null) {
            abstractMap = AnonymousClass001.A0u();
            this.mStats.put(str, abstractMap);
        }
        abstractMap.put(str2, Long.valueOf(max));
    }

    public long getStat(String str, String str2) {
        AbstractMap abstractMap = (AbstractMap) this.mStats.get(str);
        long j = 0;
        if (abstractMap != null) {
            if (str2.equals("*")) {
                Iterator it = abstractMap.values().iterator();
                while (it.hasNext()) {
                    j += AnonymousClass001.A05(it.next());
                }
            } else {
                Number number = (Number) abstractMap.get(str2);
                if (number != null) {
                    j = number.longValue();
                }
            }
        }
        return j;
    }
}
