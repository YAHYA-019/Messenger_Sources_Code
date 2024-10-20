package com.facebook.wearable.common.comms.hera.shared.context;

import X.11T;
import X.1BK;
import X.AnonymousClass001;
import X.C00m;
import java.util.Map;

/* loaded from: HeraContext.class */
public final class HeraContext {
    public final Map instances = 1BK.A1C();
    public final Map factories = 1BK.A1C();

    public final /* synthetic */ Object getObject() {
        throw AnonymousClass001.A0q("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public final Object getObject(String str) {
        11T.A0F(str, 0);
        Object obj = this.instances.get(str);
        if (obj == null) {
            C00m c00m = (C00m) this.factories.get(str);
            if (c00m == null) {
                return null;
            }
            obj = c00m.invoke();
        }
        return obj;
    }

    public final /* synthetic */ C00m provide(C00m c00m) {
        throw AnonymousClass001.A0q("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public final C00m provide(String str, C00m c00m) {
        11T.A0H(str, c00m);
        return (C00m) this.factories.put(str, c00m);
    }

    public final /* synthetic */ HeraContext provide(Object obj) {
        throw AnonymousClass001.A0q("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public final HeraContext provide(String str, Object obj) {
        11T.A0H(str, obj);
        this.instances.put(str, obj);
        return this;
    }

    public final /* synthetic */ Object requireObject() {
        throw AnonymousClass001.A0q("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public final Object requireObject(String str) {
        11T.A0F(str, 0);
        Object object = getObject(str);
        if (object != null) {
            return object;
        }
        throw 1BK.A0h();
    }

    public final void reset() {
        this.instances.clear();
        this.factories.clear();
    }
}
