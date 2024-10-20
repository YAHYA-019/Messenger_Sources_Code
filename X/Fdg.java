package X;

import com.facebook.fbservice.service.OperationResult;
import com.google.common.collect.ImmutableList;

/* loaded from: Fdg.class */
public abstract class Fdg implements 1Tf {
    public final C09694qx A00;
    public final ImmutableList A01;

    public Fdg(C09694qx c09694qx, 45O... r303) {
        ImmutableList copyOf = ImmutableList.copyOf(r303);
        this.A00 = c09694qx;
        this.A01 = ImmutableList.copyOf((Iterable) copyOf);
    }

    public OperationResult BMR(1Tu r302, 1TC r303) {
        1Du it = this.A01.iterator();
        while (it.hasNext()) {
            45O r0 = (45O) it.next();
            if (r0.A02().equals(r303.A06)) {
                return DKE.A0T(r0, this.A00, r303.A00.getParcelable(AnonymousClass001.A0X(r0)));
            }
        }
        return r302.BMQ(r303);
    }
}
