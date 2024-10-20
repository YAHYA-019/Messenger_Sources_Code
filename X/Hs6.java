package X;

import android.util.LruCache;
import com.facebook.common.stringformat.StringFormatUtil;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;

/* loaded from: Hs6.class */
public final class Hs6 {
    public final I3m A01 = new I3m((-1) >>> 1, 100);
    public final StringBuilder A02 = AnonymousClass001.A0k();
    public final LruCache A00 = new LruCache(10);

    public final void A00(ImmutableMap immutableMap, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        LruCache lruCache = this.A00;
        java.util.Map map = (java.util.Map) lruCache.get(str);
        if (map == null) {
            map = AnonymousClass001.A0u();
            lruCache.put(str, map);
        }
        if (immutableMap == null) {
            throw 1BK.A0h();
        }
        map.putAll(immutableMap);
    }

    public final void A01(Integer num, String str, String str2, Object... objArr) {
        String str3;
        switch (num.intValue()) {
            case 0:
                str3 = "LIVE_POLLER_START";
                break;
            case 1:
                str3 = "LIVE_POLLER_SUCCEED";
                break;
            default:
                str3 = "LIVE_POLLER_FAIL";
                break;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        11T.A0F(copyOf, 3);
        String A0W = 0Pz.A0W("videoId=", str);
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(str2, Arrays.copyOf(copyOf, copyOf.length));
        11T.A0F(A0W, 0);
        StringBuilder sb = this.A02;
        sb.setLength(0);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append('[');
        A0k.append(A0W);
        A0k.append("] ");
        1BK.A1R(sb, A0k);
        sb.append(str3);
        String A0u = 1BL.A0u(", ", formatStrLocaleSafe, sb);
        11T.A0A(A0u);
        0fH.A0j("video_events", A0u);
        this.A01.A00(A0u);
    }
}
