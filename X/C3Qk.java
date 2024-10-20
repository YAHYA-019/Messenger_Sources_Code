package X;

import java.util.Set;

/* renamed from: X.3Qk, reason: invalid class name */
/* loaded from: 3Qk.class */
public final class C3Qk {
    public static final GjM A00 = new GjM("Cold Start", "Messenger app cold start time");
    public static final GjM A04 = new GjM("TLTV", "Thread List to Thread View");
    public static final GjM A01 = new GjM("LSS", "Local Send Speed");
    public static final GjM A05 = new GjM("Typing Delays", "Typing Delays");
    public static final GjM A02 = new GjM("Init Sync", "1Trace init sync latency");
    public static final GjM A03 = new GjM("Resume Sync", "1Trace resume sync latency");

    public Set A00() {
        return 02H.A02(new GjM[]{A00, A04, A01, A05, A02, A03});
    }
}
