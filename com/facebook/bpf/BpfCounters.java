package com.facebook.bpf;

import X.0Yg;
import X.0fH;
import X.C0gh;
import java.util.HashMap;

/* loaded from: BpfCounters.class */
public final class BpfCounters {
    public static final boolean A00;

    static {
        boolean z;
        if (0Yg.A00.length() == 0) {
            z = false;
        } else {
            try {
                C0gh.A03("bpfcounters");
                0fH.A0A(BpfCounters.class, "Loaded bpfcounters library");
                z = true;
            } catch (UnsatisfiedLinkError e) {
                0fH.A0K(BpfCounters.class, "Could not load bpfcounters library", e);
                0fH.A0E(BpfCounters.class, "Consider adding dependency on bpfcounters-jni");
                z = false;
            }
        }
        A00 = z;
    }

    public static final native void closeBpfMapImpl(int i);

    public static final native void getBpfCountersImpl(HashMap hashMap, int i);

    public static final native int openBpfMapImpl(String str);
}
