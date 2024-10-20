package X;

import android.net.Uri;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.ui.media.attachments.model.MediaResource;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.9lj, reason: invalid class name */
/* loaded from: 9lj.class */
public abstract class C9lj {
    public static final String A01 = 11T.A02(3EU.A0C);
    public static final 1Br A00 = 1Bu.A00(68240);

    public static final LinkedHashMap A00(ThreadKey threadKey, Integer num, String str, boolean z) {
        LinkedHashMap A1C = 1BK.A1C();
        if (str != null && num != null) {
            A1C.put(C5g6.A00, new C82f(str, num.intValue(), 0));
        }
        if (z) {
            A1C.put(C5g7.A00, new C82c(A01, 0));
        }
        A1C.put(5gL.A00, new 82U(z, threadKey.A0z(), 0));
        return A1C;
    }

    public static final void A01(MediaResource mediaResource, C78c c78c, C77n c77n, 6RU r304, List list) {
        LinkedHashMap linkedHashMap;
        Uri uri;
        11T.A0F(list, 1);
        if (mediaResource != null) {
            LinkedHashMap linkedHashMap2 = c78c.A00;
            Uri uri2 = mediaResource.A0E;
            if (linkedHashMap2.containsKey(uri2)) {
                linkedHashMap = 1BK.A1C();
                Iterator A0x = AnonymousClass001.A0x(linkedHashMap2);
                while (A0x.hasNext()) {
                    Map.Entry A0z = AnonymousClass001.A0z(A0x);
                    Object key = A0z.getKey();
                    Object value = A0z.getValue();
                    if (11T.A0O(key, uri2)) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            MediaResource A0Z = 4YU.A0Z(it);
                            linkedHashMap.put(A0Z.A0E, A0Z);
                        }
                    } else {
                        linkedHashMap.put(key, value);
                    }
                }
                c77n.ClL(new C78c(linkedHashMap));
                7FI.A02(r304, 7Ao.A00);
                if (mediaResource != null || (uri = mediaResource.A0E) == null) {
                }
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (11T.A0O(4YU.A0Z(it2).A0E, uri)) {
                            return;
                        }
                    }
                }
                7FI.A02(r304, new 6rE(uri));
                return;
            }
        }
        linkedHashMap = new LinkedHashMap(c78c.A00);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            MediaResource A0Z2 = 4YU.A0Z(it3);
            linkedHashMap.put(A0Z2.A0E, A0Z2);
        }
        c77n.ClL(new C78c(linkedHashMap));
        7FI.A02(r304, 7Ao.A00);
        if (mediaResource != null) {
        }
    }

    public static final void A02(6RU r301, CharSequence charSequence, List list, java.util.Map map) {
        HashSet A0v = AnonymousClass001.A0v();
        long nowNanos = AwakeTimeSinceBootClock.INSTANCE.nowNanos();
        HashSet A07 = C1pq.A07(list, 4YT.A00(901), A0v, A0v);
        C1pq.A08("messageMetadataMap", map);
        7FI.A02(r301, new 7Af(charSequence, (String) null, list, map, 4YV.A10("messageMetadataMap", A07), nowNanos));
    }
}
