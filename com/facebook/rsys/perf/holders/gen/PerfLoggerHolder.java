package com.facebook.rsys.perf.holders.gen;

import X.2JQ;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: PerfLoggerHolder.class */
public class PerfLoggerHolder {
    public static 2JQ CONVERTER = LVi.A00(40);
    public static long sMcfTypeId;
    public final McfReference perfLogger;

    public PerfLoggerHolder(McfReference mcfReference) {
        mcfReference.getClass();
        this.perfLogger = mcfReference;
    }

    public static native PerfLoggerHolder createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PerfLoggerHolder) {
            return this.perfLogger.equals(((PerfLoggerHolder) obj).perfLogger);
        }
        return false;
    }

    public int hashCode() {
        return 527 + this.perfLogger.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PerfLoggerHolder{perfLogger=");
        return AbstractC2327GOs.A0U(this.perfLogger, A0k);
    }
}
