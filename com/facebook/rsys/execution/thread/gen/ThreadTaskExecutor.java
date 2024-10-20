package com.facebook.rsys.execution.thread.gen;

import X.AbstractC2326GOr;
import X.C0il;
import X.HEC;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.execution.gen.TaskExecutor;

/* loaded from: ThreadTaskExecutor.class */
public abstract class ThreadTaskExecutor {

    /* loaded from: ThreadTaskExecutor$CProxy.class */
    public final class CProxy extends ThreadTaskExecutor {
        static {
            if (HEC.A00) {
                return;
            }
            C0il.A0B(AbstractC2326GOr.A1U() ? "rsysthreadexecutionjniStaging" : "rsysthreadexecutionjniLatest");
            HEC.A00 = true;
        }

        public static native ThreadTaskExecutor createFromMcfType(McfReference mcfReference);

        public static native TaskExecutor createTaskExecutor(String str);

        public static native long nativeGetMcfTypeId();
    }
}
