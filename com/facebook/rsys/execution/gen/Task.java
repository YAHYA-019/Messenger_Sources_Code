package com.facebook.rsys.execution.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.C0il;
import X.HEB;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: Task.class */
public abstract class Task {
    public static 2JQ CONVERTER = IR0.A00(ActionId.VIDEO_PLAYING);

    /* loaded from: Task$CProxy.class */
    public final class CProxy extends Task {
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

        public static native Task createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof Task)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.execution.gen.Task
        public native void run();
    }

    public abstract void run();
}
