package X;

import kotlin.jvm.functions.Function1;

/* loaded from: Iey.class */
public final class Iey implements AbA, AXA, 0Jf {
    public final int A00;
    public final Object A01;

    public Iey(GpR gpR) {
        this.A00 = 1;
        this.A01 = gpR;
    }

    public Iey(Function1 function1, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                11T.A0F(function1, 1);
                break;
        }
        this.A01 = function1;
    }

    @Override // X.AbA
    public final /* synthetic */ void BQ5(8LW r302) {
        if (1 - this.A00 != 0) {
            7zL.A1T(this.A01, r302);
            return;
        }
        11T.A0F(r302, 0);
        H5G h5g = ((HgG) this.A01).A00.A00;
        JFp jFp = H5G.A0W;
        GrU.A08(GOo.A0V(h5g));
    }

    public final boolean equals(Object obj) {
        Object functionDelegate;
        boolean z = obj instanceof AbA;
        boolean z2 = false;
        if (1 - this.A00 != 0) {
            if (z && (obj instanceof 0Jf)) {
                functionDelegate = this.A01;
                z2 = 11T.A0O(functionDelegate, ((0Jf) obj).getFunctionDelegate());
            }
        } else if (z && (obj instanceof 0Jf)) {
            functionDelegate = getFunctionDelegate();
            z2 = 11T.A0O(functionDelegate, ((0Jf) obj).getFunctionDelegate());
        }
        return z2;
    }

    public final C00l getFunctionDelegate() {
        return 1 - this.A00 != 0 ? (C00l) this.A01 : new 01I(1, this.A01, GpR.class, "screenShareStateOnChange", "screenShareStateOnChange(Lcom/facebook/rp/platform/statemanagement/rpstate/RpState;)V", 0);
    }

    public final int hashCode() {
        return (1 - this.A00 != 0 ? this.A01 : getFunctionDelegate()).hashCode();
    }
}
