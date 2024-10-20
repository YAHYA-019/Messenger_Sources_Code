package X;

import kotlin.jvm.functions.Function1;

/* loaded from: J63.class */
public final /* synthetic */ class J63 implements 0Jf, AbA {
    public final /* synthetic */ Function1 A00;

    public J63(Function1 function1) {
        this.A00 = function1;
    }

    @Override // X.AbA
    public final /* synthetic */ void BQ5(8LW r302) {
        this.A00.invoke(r302);
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if ((obj instanceof AbA) && (obj instanceof 0Jf)) {
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
