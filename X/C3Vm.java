package X;

import java.util.List;

/* renamed from: X.3Vm, reason: invalid class name */
/* loaded from: 3Vm.class */
public final class C3Vm implements 1xJ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C3Vm(1xB r302, 1xH r303, int i) {
        this.A00 = i;
        this.A02 = r302;
        this.A01 = r303;
    }

    public /* bridge */ /* synthetic */ void Cit(Object obj) {
        1xH r307;
        C87e c87e;
        boolean z = obj instanceof C87e;
        if (this.A00 != 0) {
            if (z) {
                C1x3 c1x3 = ((1xB) this.A02).A05;
                if (c1x3.A07) {
                    r307 = (1xH) this.A01;
                    Boolean bool = c1x3.A00;
                    c87e = bool != null ? new C87e(bool) : new 8EF(new Exception());
                }
            }
            r307 = (1xH) this.A01;
            c87e = new 8EF(new Exception());
        } else {
            if (z) {
                C1x3 c1x32 = ((1xB) this.A02).A05;
                if (c1x32.A07) {
                    r307 = (1xH) this.A01;
                    List list = c1x32.A05;
                    if (list == null) {
                        11T.A0L("virtualDevicesList");
                        throw 0Q8.createAndThrow();
                    }
                    c87e = new C87e(new 9GV(1xB.A02(list)));
                }
            }
            r307 = (1xH) this.A01;
            c87e = new 8EF(new Exception());
        }
        r307.A04(c87e);
    }
}
