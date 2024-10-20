package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.5c3, reason: invalid class name */
/* loaded from: 5c3.class */
public final class C5c3 {
    public static final C9iO A05 = new Object();
    public List A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final java.util.Map A04;

    public C5c3(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A01 = fbUserSession;
        0fH.A0j("SeenItemsCache", "Initialized Seen items cache");
        this.A03 = 1Bq.A00(66774);
        this.A02 = 1Bq.A00(99390);
        this.A04 = new LinkedHashMap();
        this.A00 = new ArrayList();
    }

    public static final LinkedHashMap A00(8Ke r301, C5c3 c5c3, Integer num) {
        int i;
        Object obj;
        HighlightsFeedContent highlightsFeedContent;
        0fH.A0j("SeenItemsCache", C9iO.A01(r301, num));
        String str = null;
        if (r301.A07 < C1ub.A00().Auy(36603111456905232L)) {
            return null;
        }
        if (C1ub.A00().AZk(36321636495868561L)) {
            if (r301.A05 < 100.0f) {
                i = r301.A04;
            }
            obj = r301.A0A;
            if (!(obj instanceof HighlightsFeedContent) && (highlightsFeedContent = (HighlightsFeedContent) obj) != null) {
                long j = r301.A08;
                if (j <= 0) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("Expected impression event timestamp for ");
                    A0k.append(C9iO.A00(r301));
                    A0k.append(" (");
                    A0k.append(j);
                    0fH.A0n("SeenItemsCache", 4YV.A0x(A0k));
                    j = 1Br.A00(c5c3.A02);
                    r301.A08 = j;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("content_id", highlightsFeedContent.A0P);
                linkedHashMap.put("feed_type", Integer.valueOf(highlightsFeedContent.A05));
                String str2 = highlightsFeedContent.A0W;
                if (str2 != null && !0CU.A0O(str2)) {
                    str = str2;
                }
                linkedHashMap.put("message_id", str);
                linkedHashMap.put("thread_id", highlightsFeedContent.A0M);
                linkedHashMap.put(JQw.A00(7), Long.valueOf(j));
                linkedHashMap.put("max_visible_percentage", Integer.valueOf(C1ub.A00().AZk(36321636495868561L) ? r301.A05 : r301.A03));
                linkedHashMap.put("max_coverage_percentage", Integer.valueOf(r301.A04));
                linkedHashMap.put("impression_duration_ms", Long.valueOf(r301.A07));
                return linkedHashMap;
            }
        }
        i = r301.A03;
        if (i < 50.0f) {
            return null;
        }
        obj = r301.A0A;
        return !(obj instanceof HighlightsFeedContent) ? null : null;
    }

    public final ImmutableList A01() {
        String str;
        String str2;
        List list = this.A00;
        this.A00 = new ArrayList();
        Iterator it = this.A04.values().iterator();
        while (it.hasNext()) {
            LinkedHashMap A00 = A00((8Ke) it.next(), this, 0S2.A0C);
            if (A00 != null) {
                list.add(A00);
            }
        }
        ImmutableList sortedCopyOf = ImmutableList.sortedCopyOf(new Ls7(2), list);
        11T.A0D(sortedCopyOf);
        0fH.A0j("SeenItemsCache", 0Pz.A0d("Flushed the following ", " items from cache\n", sortedCopyOf.size()));
        if (0fH.A01.BTv(3)) {
            1Du it2 = sortedCopyOf.iterator();
            while (it2.hasNext()) {
                java.util.Map map = (java.util.Map) it2.next();
                11T.A0D(map);
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("[FLUSH] ");
                Object obj = map.get("content_id");
                String str3 = null;
                if ((obj instanceof String) && (str2 = (String) obj) != null) {
                    Object obj2 = map.get("message_id");
                    if (obj2 instanceof String) {
                        str3 = (String) obj2;
                    }
                    str = 0Pz.A0j(str2, "::", str3);
                    if (str != null) {
                        A0k.append(str);
                        A0k.append(" (ts: ");
                        A0k.append(map.get(JQw.A00(7)));
                        A0k.append(7zK.A00(50));
                        A0k.append(map.get("impression_duration_ms"));
                        A0k.append(", max_visibility % ");
                        A0k.append(map.get("max_visible_percentage"));
                        A0k.append(", max_coverage % ");
                        0fH.A0j("SeenItemsCache", AnonymousClass002.A0K(map.get("max_coverage_percentage"), A0k));
                    }
                }
                str = "";
                A0k.append(str);
                A0k.append(" (ts: ");
                A0k.append(map.get(JQw.A00(7)));
                A0k.append(7zK.A00(50));
                A0k.append(map.get("impression_duration_ms"));
                A0k.append(", max_visibility % ");
                A0k.append(map.get("max_visible_percentage"));
                A0k.append(", max_coverage % ");
                0fH.A0j("SeenItemsCache", AnonymousClass002.A0K(map.get("max_coverage_percentage"), A0k));
            }
        }
        return sortedCopyOf;
    }
}
