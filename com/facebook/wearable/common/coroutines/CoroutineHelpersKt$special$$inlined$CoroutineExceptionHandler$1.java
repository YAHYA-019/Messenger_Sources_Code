package com.facebook.wearable.common.coroutines;

import X.0DC;
import X.0DE;
import X.G7R;
import X.J9o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: CoroutineHelpersKt$special$$inlined$CoroutineExceptionHandler$1.class */
public final class CoroutineHelpersKt$special$$inlined$CoroutineExceptionHandler$1 extends 0DC implements CoroutineExceptionHandler {
    public CoroutineHelpersKt$special$$inlined$CoroutineExceptionHandler$1(G7R g7r) {
        super(g7r);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(0DE r302, Throwable th) {
        final J9o j9o = new J9o(th, 31);
        new Thread() { // from class: X.12w
            public static final String __redex_internal_original_name = "ThreadsKt$thread$thread$1";

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                C00m.this.invoke();
            }
        }.start();
    }
}
