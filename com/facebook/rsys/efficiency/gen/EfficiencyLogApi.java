package com.facebook.rsys.efficiency.gen;

import X.2JQ;
import X.C0il;
import X.ESV;
import X.FdC;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mci.Execution;
import com.facebook.simplejni.NativeHolder;

/* loaded from: EfficiencyLogApi.class */
public abstract class EfficiencyLogApi {
    public static 2JQ CONVERTER = new FdC(0);

    /* loaded from: EfficiencyLogApi$CProxy.class */
    public final class CProxy extends EfficiencyLogApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            if (ESV.A00) {
                return;
            }
            Execution.initialize();
            C0il.A0B("jniperflogger");
            C0il.A0B("rsysefficiencyjni");
            ESV.A00 = true;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native EfficiencyLogApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.efficiency.gen.EfficiencyLogApi
        public native void cancelEventWithRegistryKeyWithoutStat(int i, String str);

        @Override // com.facebook.rsys.efficiency.gen.EfficiencyLogApi
        public native void endEventStatWithRegistryKey(int i, String str);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof EfficiencyLogApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        @Override // com.facebook.rsys.efficiency.gen.EfficiencyLogApi
        public native void failEventStatWithRegistryKey(int i, String str);

        public native int hashCode();

        @Override // com.facebook.rsys.efficiency.gen.EfficiencyLogApi
        public native void startEventStatCollection(int i, String str);

        @Override // com.facebook.rsys.efficiency.gen.EfficiencyLogApi
        public native void startEventStatCollectionWithEvent(int i, int i2, String str);
    }

    public abstract void cancelEventWithRegistryKeyWithoutStat(int i, String str);

    public abstract void endEventStatWithRegistryKey(int i, String str);

    public abstract void failEventStatWithRegistryKey(int i, String str);

    public abstract void startEventStatCollection(int i, String str);

    public abstract void startEventStatCollectionWithEvent(int i, int i2, String str);
}
