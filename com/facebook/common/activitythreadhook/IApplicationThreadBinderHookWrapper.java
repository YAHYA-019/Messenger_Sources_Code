package com.facebook.common.activitythreadhook;

import X.0FI;
import android.app.IApplicationThread;
import com.facebook.common.binderhooker.BinderHook;
import com.facebook.common.binderhooker.IWrappedBinderHook;

/* loaded from: IApplicationThreadBinderHookWrapper.class */
public abstract class IApplicationThreadBinderHookWrapper extends BinderHook implements IApplicationThread, IWrappedBinderHook {
    public final BinderHook A00;

    @Override // com.facebook.common.binderhooker.IWrappedBinderHook
    public BinderHook getWrappedBinderHook() {
        int A03 = 0FI.A03(-1110698793);
        BinderHook binderHook = this.A00;
        0FI.A09(1305332004, A03);
        return binderHook;
    }
}
