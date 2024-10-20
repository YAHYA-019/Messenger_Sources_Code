package X;

import com.facebook.messaging.communitymessaging.events.creation.EventCreationState;
import java.util.Calendar;

/* loaded from: Ciy.class */
public final class Ciy implements DGj {
    public final /* synthetic */ C1977Ay6 A00;

    public Ciy(C1977Ay6 c1977Ay6) {
        this.A00 = c1977Ay6;
    }

    @Override // X.DGj
    public void Bso(Calendar calendar) {
        CNk cNk = this.A00.A05.A00.A03;
        if (cNk == null) {
            11T.A0L("eventCreationUiModel");
            throw 0Q8.createAndThrow();
        }
        cNk.A03(EventCreationState.A00(cNk.A02(), null, null, null, null, null, null, null, null, calendar, 4063, false));
    }

    @Override // X.DGj
    public void Bsq(Calendar calendar) {
        CNk cNk = this.A00.A05.A00.A03;
        if (cNk == null) {
            11T.A0L("eventCreationUiModel");
            throw 0Q8.createAndThrow();
        }
        cNk.A03(EventCreationState.A00(cNk.A02(), null, null, null, null, null, null, null, calendar, null, 4079, false));
    }
}
