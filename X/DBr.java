package X;

import kotlin.jvm.functions.Function2;

/* loaded from: DBr.class */
public final /* synthetic */ class DBr implements 0Jf, DEp {
    public final /* synthetic */ Function2 A00;

    public DBr(Function2 function2) {
        this.A00 = function2;
    }

    @Override // X.DEp
    public final /* synthetic */ boolean AEo(BLB blb, C2fr c2fr) {
        return AnonymousClass001.A1V(this.A00.invoke(blb, c2fr));
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if ((obj instanceof DEp) && (obj instanceof 0Jf)) {
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
