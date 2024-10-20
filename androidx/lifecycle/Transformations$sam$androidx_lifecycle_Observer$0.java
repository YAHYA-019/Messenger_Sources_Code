package androidx.lifecycle;

import X.0Jf;
import X.11T;
import X.C00l;
import kotlin.jvm.functions.Function1;

/* loaded from: Transformations$sam$androidx_lifecycle_Observer$0.class */
public final /* synthetic */ class Transformations$sam$androidx_lifecycle_Observer$0 implements 0Jf, Observer {
    public final /* synthetic */ Function1 function;

    public Transformations$sam$androidx_lifecycle_Observer$0(Function1 function1) {
        this.function = function1;
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if ((obj instanceof Observer) && (obj instanceof 0Jf)) {
            z = 11T.A0O(this.function, ((0Jf) obj).getFunctionDelegate());
        }
        return z;
    }

    public final C00l getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return this.function.hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
