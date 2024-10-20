package X;

/* loaded from: Hvi.class */
public abstract class Hvi {
    public static final void A00(JQ9 jq9, String str, long j) {
        11T.A0F(jq9, 0);
        0fH.A0j(str, "logRecordingRequested QPL RECORDING");
        jq9.Bb7("recording_requested", str, "", null, j);
        jq9.Bwl(19);
    }

    public static final void A01(JQ9 jq9, String str, long j) {
        11T.A0F(jq9, 0);
        0fH.A0j(str, "logRecordingStopRequested QPL RECORDING");
        jq9.Bb7("recording_stop_requested", str, "", null, j);
        jq9.Bwj(19, "recording_stop_requested");
    }
}
