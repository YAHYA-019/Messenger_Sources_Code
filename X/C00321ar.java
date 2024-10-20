package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;

/* renamed from: X.1ar, reason: invalid class name and case insensitive filesystem */
/* loaded from: 1ar.class */
public final class C00321ar extends ContextWrapper {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Context baseContext = getBaseContext();
        if (baseContext instanceof C15i) {
            return ((C15i) baseContext).AZ0();
        }
        Resources resources = baseContext.getResources();
        11T.A0A(resources);
        return resources;
    }
}
