package com.facebook.presence.status.cachepopulator;

import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1EZ;
import X.1Fw;
import X.1Kd;
import X.1Lm;
import X.2Ti;
import X.2Tj;
import X.5FY;
import X.D46;
import com.facebook.auth.usersession.FbUserSession;
import java.util.concurrent.Executor;

/* loaded from: StatusCachePopulator.class */
public final class StatusCachePopulator {
    public final 1Br A01 = 1Bu.A00(16428);
    public final 1Br A00 = 1Bq.A00(16457);
    public final 2Ti A02 = new 5FY(this);

    public static final void A00(StatusCachePopulator statusCachePopulator) {
        FbUserSession A04 = 1Fw.A04((1EZ) statusCachePopulator.A01.A00.get());
        1Kd.A0F(new D46(A04, A04, 7), ((2Tj) 1Lm.A06(A04, 33122)).A03(), (Executor) statusCachePopulator.A00.A00.get());
    }
}
