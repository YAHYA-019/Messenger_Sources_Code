package androidx.lifecycle;

import X.04S;
import X.0DE;
import X.0DR;
import X.0Ds;
import X.1BL;
import X.2Zs;
import X.2aK;
import X.2aN;
import X.4ZJ;
import X.AJV;

/* loaded from: LiveDataScopeImpl.class */
public final class LiveDataScopeImpl implements LiveDataScope {
    public final 0DE coroutineContext;
    public CoroutineLiveData target;

    public LiveDataScopeImpl(CoroutineLiveData coroutineLiveData, 0DE r303) {
        1BL.A1F(coroutineLiveData, r303);
        this.target = coroutineLiveData;
        2Zs r0 = 2aN.A00;
        this.coroutineContext = r303.plus(4ZJ.A00.A01());
    }

    @Override // androidx.lifecycle.LiveDataScope
    public Object emit(Object obj, 0DR r303) {
        Object A00 = 2aK.A00(r303, this.coroutineContext, new AJV(obj, this, (0DR) null, 18));
        if (A00 != 0Ds.A02) {
            A00 = 04S.A00;
        }
        return A00;
    }
}
