package X;

import com.facebook.rsys.syncedclock.helpers.RtcCallFetchServerTimePostResult;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* loaded from: Fh6.class */
public final class Fh6 implements 1Ro {
    public static final String __redex_internal_original_name = "RtcCallFetchServerTime";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        C04083zw A0T = DKC.A0T();
        A0T.A0D = "fetch_server_time";
        A0T.A0F = "msgr_rtc_fetch_server_time";
        A0T.A02();
        A0T.A0E = "POST";
        return DKE.A0X(A0T, (ImmutableList) obj);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        try {
            anonymousClass439.A03();
        } catch (2L0 e) {
            4zI.A03.A02(__redex_internal_original_name, "Api error in synced clock", e, AnonymousClass001.A1Z());
        }
        Iterator A1e = anonymousClass439.A00().A1e(RtcCallFetchServerTimePostResult.class);
        A1e.getClass();
        return A1e.next();
    }
}
