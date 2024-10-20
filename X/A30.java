package X;

import kotlin.jvm.functions.Function1;

/* loaded from: A30.class */
public final class A30 implements AbA, AXA, 0Jf {
    public final int A00;
    public final Object A01;

    public A30(IE3 ie3) {
        this.A00 = 3;
        this.A01 = ie3;
    }

    public A30(Function1 function1, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
                11T.A0F(function1, 1);
                break;
        }
        this.A01 = function1;
    }

    @Override // X.AbA
    public final /* synthetic */ void BQ5(8LW r302) {
        2JS r0;
        if (3 - this.A00 != 0) {
            7zL.A1T(this.A01, r302);
            return;
        }
        11T.A0F(r302, 0);
        IE3 ie3 = (IE3) this.A01;
        if (!9Dw.A00(r302).A01 || (r0 = r302.A00) == null) {
            return;
        }
        4zI.A03.A05("RtcNotificationControllerCallBinder", "Call UI is visible; updating foreground service", new Object[0]);
        IE3.A00(r0, ie3, false, true);
    }

    public final boolean equals(Object obj) {
        Object functionDelegate;
        boolean z = obj instanceof AbA;
        boolean z2 = false;
        if (3 - this.A00 != 0) {
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
        return 3 - this.A00 != 0 ? (C00l) this.A01 : new 01I(1, 11U.class, "onUiVisibilityChanged", "setUpForCustomActionUpdates$onUiVisibilityChanged(Lcom/facebook/rtc/notification/RtcNotificationController;Lcom/facebook/rp/platform/statemanagement/rpstate/RpState;)V", 0);
    }

    public final int hashCode() {
        return (3 - this.A00 != 0 ? this.A01 : getFunctionDelegate()).hashCode();
    }
}
