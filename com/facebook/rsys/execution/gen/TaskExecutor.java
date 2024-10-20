package com.facebook.rsys.execution.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.C0il;
import X.HEB;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: TaskExecutor.class */
public abstract class TaskExecutor {
    public static 2JQ CONVERTER = IR0.A00(ActionId.RTMP_CONNECTION_CONNECTED);

    /* loaded from: TaskExecutor$CProxy.class */
    public final class CProxy extends TaskExecutor {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            if (HEB.A00) {
                return;
            }
            C0il.A0B(AbstractC2326GOr.A1U() ? "rsysexecutionjniStaging" : "rsysexecutionjniLatest");
            HEB.A00 = true;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native TaskExecutor createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof TaskExecutor)) {
                return false;
            }
            return nativeEquals(obj);
        }

        @Override // com.facebook.rsys.execution.gen.TaskExecutor
        public native void execute(Task task, long j);

        public native int hashCode();

        @Override // com.facebook.rsys.execution.gen.TaskExecutor
        public native boolean isCurrent();
    }

    public abstract void execute(Task task, long j);

    public abstract boolean isCurrent();
}
