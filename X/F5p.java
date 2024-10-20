package X;

import com.google.common.base.Platform;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableSet;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: F5p.class */
public final class F5p {
    public final ImmutableSet A01;
    public final C00i A00 = 1BQ.A00();
    public final Random A03 = (Random) 1Bn.A0A(116395);
    public final AtomicBoolean A02 = new AtomicBoolean();

    public F5p() {
        ImmutableSet A07;
        1Hz r0 = new 1Hz();
        String BDB = 1BK.A0N(this.A00).BDB(1GD.A07, 36874781022355836L);
        if (Platform.stringIsNullOrEmpty(BDB)) {
            A07 = RegularImmutableSet.A05;
        } else {
            1Hz r02 = new 1Hz();
            r02.A08(DKE.A16(BDB));
            A07 = r02.A07();
        }
        r0.A08(A07);
        this.A01 = r0.A07();
    }

    public static final F5p A00() {
        return new F5p();
    }
}
