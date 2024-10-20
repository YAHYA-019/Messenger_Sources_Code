package X;

import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.7ey, reason: invalid class name */
/* loaded from: 7ey.class */
public abstract class C7ey extends 1EJ {
    public static final 5GB A00() {
        2yD A0Q = 1BL.A0Q();
        1Br A00 = 1Bu.A00(67231);
        1Br A002 = 1Bu.A00(67232);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) 1Bi.A03(16465);
        ArrayList A0s = AnonymousClass001.A0s();
        if (A0Q.AZk(36314257725398826L)) {
            A0s.add(A00.get());
        }
        if (A0Q.AZk(36314257725595435L)) {
            A0s.add(A002.get());
        }
        return new 5GB(5GA.A00, A0s, scheduledExecutorService);
    }
}
