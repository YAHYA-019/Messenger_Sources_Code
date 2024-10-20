package X;

import android.os.Bundle;
import com.google.common.collect.ImmutableList;

/* loaded from: C4q.class */
public final class C4q {
    public final C00i A00 = 1BV.A00(33031);
    public final C1q9 A03 = (C1q9) 1Bi.A03(16823);
    public final 1Ih A02 = (1Ih) 7zM.A19();
    public final C00i A01 = 1BQ.A01();

    public void A00(AnonymousClass214 anonymousClass214, ImmutableList immutableList, long j) {
        Bundle A05 = 1BK.A05();
        A05.putLong("offline_threading_id", j);
        A05.putSerializable("state", anonymousClass214);
        A05.putParcelableArrayList("cant_message_users", immutableList != null ? 1BK.A17(immutableList) : AnonymousClass001.A0s());
        1Ho.A00(4YU.A0L(this.A00).newInstance_DEPRECATED(1BJ.A00(2121), A05, 1), true);
    }
}
