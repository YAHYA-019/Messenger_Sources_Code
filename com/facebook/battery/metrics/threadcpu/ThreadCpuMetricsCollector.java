package com.facebook.battery.metrics.threadcpu;

import X.0Ht;
import X.0KH;
import X.0Ll;
import X.0Lq;
import X.0Lr;
import X.0Ls;
import X.0Pz;
import X.0fH;
import X.AnonymousClass001;
import X.C0Az;
import X.C0B1;
import android.os.Process;
import android.util.Pair;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.HashMap;
import java.util.Map;

/* loaded from: ThreadCpuMetricsCollector.class */
public final class ThreadCpuMetricsCollector extends C0Az {
    @Override // X.C0Az
    public /* bridge */ /* synthetic */ C0B1 A03() {
        return new 0Ll();
    }

    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, X.0Ht] */
    @Override // X.C0Az
    public /* bridge */ /* synthetic */ boolean A04(C0B1 c0b1) {
        0Ll r0 = (0Ll) c0b1;
        if (r0 == null) {
            throw AnonymousClass001.A0L("Null value passed to getSnapshot!");
        }
        try {
            HashMap A00 = 0Lq.A00();
            if (A00 == null) {
                return false;
            }
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : A00.entrySet()) {
                0Ls A01 = 0Lr.A01(0Lr.A02(StringFormatUtil.formatStrLocaleSafe("/proc/%d/task/%s/stat", Integer.valueOf(Process.myPid()), entry.getKey())));
                if (A01 != null) {
                    hashMap.put((String) entry.getKey(), new Pair(entry.getValue(), A01));
                }
            }
            r0.threadCpuMap.keySet().retainAll(hashMap.keySet());
            for (Map.Entry entry2 : hashMap.entrySet()) {
                try {
                    int parseInt = Integer.parseInt((String) entry2.getKey());
                    Object obj = ((Pair) entry2.getValue()).first;
                    0Ls r02 = (0Ls) ((Pair) entry2.getValue()).second;
                    ?? obj2 = new Object();
                    ((0Ht) obj2).userTimeS = r02.A03;
                    ((0Ht) obj2).systemTimeS = r02.A02;
                    HashMap hashMap2 = r0.threadCpuMap;
                    Integer valueOf = Integer.valueOf(parseInt);
                    if (hashMap2.containsKey(valueOf)) {
                        ((0Ht) ((Pair) r0.threadCpuMap.get(valueOf)).second).A0D((0Ht) obj2);
                    } else {
                        r0.threadCpuMap.put(valueOf, new Pair(obj, obj2));
                    }
                } catch (NumberFormatException e) {
                    0KH.A00("com.facebook.battery.metrics.threadcpu.ThreadCpuMetricsCollector", 0Pz.A0W("Thread Id is not an integer: ", AnonymousClass001.A0j(entry2)), e);
                }
            }
            return true;
        } catch (Exception e2) {
            0fH.A0H(0Lq.class, "Error getting thread level CPU Usage data", e2);
            return false;
        }
    }
}
