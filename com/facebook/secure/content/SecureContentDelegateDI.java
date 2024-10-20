package com.facebook.secure.content;

import X.09Q;
import X.0RF;
import X.AnonymousClass053;
import android.content.Context;
import android.os.Binder;

/* loaded from: SecureContentDelegateDI.class */
public abstract class SecureContentDelegateDI extends DeferredInitAbstractContentProviderDIDelegate {
    public SecureContentDelegateDI(0RF r302) {
        super(r302);
    }

    @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
    public final boolean A0d() {
        Context context = ((AnonymousClass053) this).A00.getContext();
        try {
            return 09Q.A04(context, context.getApplicationInfo().uid, Binder.getCallingUid());
        } catch (SecurityException unused) {
            return false;
        }
    }
}
