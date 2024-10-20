package X;

import kotlin.jvm.functions.Function1;

/* loaded from: G7b.class */
public final /* synthetic */ class G7b implements 0Jf, C1rz {
    public final /* synthetic */ Function1 A00;

    public G7b(Function1 function1) {
        this.A00 = function1;
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if ((obj instanceof C1rz) && (obj instanceof 0Jf)) {
            z = 11T.A0O(this.A00, ((0Jf) obj).getFunctionDelegate());
        }
        return z;
    }

    public final C00l getFunctionDelegate() {
        return this.A00;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
