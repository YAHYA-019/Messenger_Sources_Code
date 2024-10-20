package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.5c5, reason: invalid class name */
/* loaded from: 5c5.class */
public final class C5c5 {
    public final ConcurrentHashMap A01 = new ConcurrentHashMap();
    public final 1Br A00 = 1Bu.A00(68560);

    public static final C5c6 A00(C5c5 c5c5, C5c2 c5c2) {
        ConcurrentHashMap concurrentHashMap = c5c5.A01;
        C5c6 c5c6 = (C5c6) concurrentHashMap.get(c5c2);
        if (c5c6 == null || !c5c6.A01) {
            return c5c6;
        }
        concurrentHashMap.remove(c5c2);
        StringBuilder sb = new StringBuilder();
        sb.append("Trying to retrieve tracker that has previously ended. Scenario=");
        sb.append(c5c2);
        0fH.A0n("HighlightsTabTTRCController", sb.toString());
        return null;
    }

    private final ArrayList A01() {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap concurrentHashMap = this.A01;
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            Object key = entry.getKey();
            C5c6 c5c6 = (C5c6) entry.getValue();
            if (c5c6.A01) {
                concurrentHashMap.remove(key);
            } else {
                arrayList.add(c5c6);
            }
        }
        return arrayList;
    }

    public final void A02() {
        ArrayList A01 = A01();
        if (A01.isEmpty()) {
            0fH.A0j("HighlightsTabTTRCController", "onCachedContentQueryStarted> No trackers are active");
        }
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            C5c6 c5c6 = (C5c6) it.next();
            if (c5c6.A04.get()) {
                0fH.A0j("HighlightsTabTTRCTracker", 0Pz.A0r("markerId=", ", init=", " onCachedContentQuery_Started", 91369891, c5c6.A00));
                c5c6.A0O("highlights_tab_feed");
            }
        }
    }

    public final void A03(int i) {
        ArrayList A01 = A01();
        if (A01.isEmpty()) {
            0fH.A0j("HighlightsTabTTRCController", "onCachedContentQueryCompleted> No trackers are active");
        }
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            C5c6 c5c6 = (C5c6) it.next();
            if (c5c6.A04.get()) {
                c5c6.A0L("highlights_tab_feed");
                0fH.A0j("HighlightsTabTTRCTracker", 0Pz.A0r("markerId=", ", init=", " onCachedContentQuery_Completed", 91369891, c5c6.A00));
                C5c6.A00(c5c6).annotate("feed_item_count_cached_content", i);
            }
        }
    }

    public final void A04(C5c2 c5c2) {
        C5c6 A00 = A00(this, c5c2);
        if (A00 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNetworkQueryCompleted> Tracker not active for scenario ");
            sb.append(c5c2);
            0fH.A0j("HighlightsTabTTRCController", sb.toString());
            return;
        }
        if (A00.A04.get()) {
            0fH.A0j("HighlightsTabTTRCTracker", 0Pz.A0r("markerId=", ", init=", " onNetworkQuery_Completed", 91369891, A00.A00));
            A00.A0P("fetch_network_content_end");
            A00.A03.set(true);
        }
    }

    public final void A05(C5c2 c5c2) {
        11T.A0F(c5c2, 0);
        C5c6 A00 = A00(this, c5c2);
        if (A00 != null) {
            if (A00.A04.get()) {
                0fH.A0j("HighlightsTabTTRCTracker", 0Pz.A0r("markerId=", ", init=", " onNetworkQuery_Started", 91369891, A00.A00));
                A00.A0P("fetch_network_content_start");
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("onNetworkQueryStarted> Tracker not active for scenario ");
        sb.append(c5c2);
        0fH.A0j("HighlightsTabTTRCController", sb.toString());
    }

    public final void A06(C5c2 c5c2) {
        ArrayList A01 = A01();
        if (A01.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSurfaceLeft> Tracker not active for scenario ");
            sb.append(c5c2);
            0fH.A0j("HighlightsTabTTRCController", sb.toString());
        }
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            C5c6 c5c6 = (C5c6) it.next();
            if (c5c6.A04.get()) {
                0fH.A0j("HighlightsTabTTRCTracker", 0Pz.A0r("markerId=", ", init=", " onSurfaceLeft", 91369891, c5c6.A00));
                if (c5c6.A05.get() != 0) {
                    C5c6.A01(c5c6);
                } else {
                    0fH.A0j("HighlightsTabTTRCTracker", 0Pz.A0d("markerId=", " onSurfaceLeft", 91369891));
                    0fH.A0j("HighlightsTabTTRCTracker", 0Pz.A0r("markerId=", ", init=", " onSurfaceLeft", 91369891, c5c6.A00));
                    c5c6.A0R("leftSurface");
                    c5c6.A01 = true;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x01cd, code lost:
    
        if (r309 != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A07(X.C5c2 r302, int r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5c5.A07(X.5c2, int, boolean):void");
    }

    public final void A08(C5c2 c5c2, boolean z) {
        ConcurrentHashMap concurrentHashMap = this.A01;
        C5c6 c5c6 = (C5c6) concurrentHashMap.get(c5c2);
        if (c5c6 == null) {
            this.A00.A00.get();
            c5c6 = new C5c6(z);
            concurrentHashMap.put(c5c2, c5c6);
        }
        if (!c5c6.A04.getAndSet(true)) {
            long now = ((C0dr) c5c6.A02.A00.get()).now();
            c5c6.A00 = now;
            0fH.A0j("HighlightsTabTTRCTracker", 0Pz.A0e("markerId=", " onStart initTimeStamp=", 91369891, now));
            c5c6.A0E(91369891, 0);
            c5c6.A0G(c5c6.A00);
            c5c6.A0T("highlights_tab_feed", 1, 0L);
            c5c6.A0c("time_to_recent_content", true);
        }
        int ordinal = c5c2.ordinal();
        C5c6.A00(c5c6).annotate("action_type", ordinal != 4 ? ordinal != 2 ? 1BJ.A00(1949) : AnonymousClass000.A00(181) : "pagination");
    }
}
