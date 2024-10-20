package X;

import android.graphics.Color;
import com.facebook.acra.constants.ActionId;
import com.google.common.collect.ImmutableSet;

/* renamed from: X.2rg, reason: invalid class name */
/* loaded from: 2rg.class */
public final class C2rg implements C2rh {
    public static final C1cm A08 = new C1cm("Threads Fetch Web", "FQL/GQL fetches related to threads/messages", Color.argb(255, 255, ActionId.DISPLAYED, 0));
    public static final C1cm A07 = new C1cm("Threads Fetch DB", "Thread operations at DB level", -65281);
    public static final C1cm A05 = new C1cm("Threads Fetch Cache", "Thread operations Cache level", -7829368);
    public static final C1cm A06 = new C1cm("Threads Fetch Caller", "Thread operations' callers", -16777216);
    public static final C1cm A02 = new C1cm("Delta", "Deltas from the sync protocol", Color.argb(255, 0, 200, 0));
    public static final C1cm A03 = new C1cm("Sync Exception", "Uncaught exceptions from the sync protocol", -65536);
    public static final C1cm A04 = new C1cm("Sync network", "Sync connection events (i.e. get_diffs)", -16776961);
    public static final C1cm A00 = new C1cm("Carrier Messaging", "Messages/threads created by carrier messaging", -65536);
    public static final C1cm A01 = new C1cm("Secure Message over whatsapp", "Secure messages sent or received by whatsapp infra", -16711936);

    @Override // X.C2rh
    public ImmutableSet BEI() {
        ImmutableSet A062 = ImmutableSet.A06(A08, A07, A05, A06, A02, A03, A04, A00, A01);
        11T.A0A(A062);
        return A062;
    }
}
