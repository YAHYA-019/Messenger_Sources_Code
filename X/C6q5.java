package X;

import com.facebook.common.network.FbNetworkManager;

/* renamed from: X.6q5, reason: invalid class name */
/* loaded from: 6q5.class */
public final class C6q5 {
    public final 1Br A03 = 1Bq.A00(16772);
    public final 1Br A00 = 1Bq.A00(99390);
    public final 1Br A02 = 1Bq.A00(84488);
    public final 1Br A01 = 1Bq.A00(16687);

    public static final 2Jy A00(C6q5 c6q5, 5R2 r302, String str, long j) {
        2Jy r0 = new 2Jy(AbstractC00603o4.A00(304));
        r0.A0D("event_type", "download");
        r0.A0D("sticker_id", str);
        String str2 = r302.dbName;
        String A00 = DKB.A00(79);
        r0.A0D(A00, str2);
        r0.A0C("timestamp", ((C0dp) c6q5.A00.A00.get()).now());
        r0.A0C("download_time_ms", ((C0dr) c6q5.A02.A00.get()).now() - j);
        r0.A0F("appears_to_be_connected_on_wifi", ((FbNetworkManager) c6q5.A01.A00.get()).A0K());
        r0.A0D(A00, r302.dbName);
        return r0;
    }
}
