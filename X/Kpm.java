package X;

import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: Kpm.class */
public final class Kpm {
    public final /* synthetic */ L7l A00;
    public final /* synthetic */ java.util.Map A01;
    public final /* synthetic */ boolean A02;

    public Kpm(L7l l7l, java.util.Map map, boolean z) {
        this.A02 = z;
        this.A00 = l7l;
        this.A01 = map;
    }

    public final void A00() {
        LiH liH;
        if (this.A02) {
            1UG A08 = 1BK.A08(1Br.A02(this.A00.A00), "si_native_webview_redirect");
            java.util.Map map = this.A01;
            if (!A08.isSampled() || (liH = (LiH) map.get("INTEGRITY_LOGGER")) == null) {
                return;
            }
            A08.A7R(1BJ.A00(1884), liH.originalUrl);
            List<LiG> unmodifiableList = Collections.unmodifiableList(liH._redirectChain);
            ArrayList A0y = 7zO.A0y(unmodifiableList);
            for (LiG liG : unmodifiableList) {
                0DA r0 = new 0DA();
                r0.A07("domain", liG.domain);
                r0.A07("md5Domain", liG.MD5Domain);
                r0.A07("url", liG.url);
                r0.A07("md5Path", liG.MD5Path);
                Boolean bool = liG.httpRedirect;
                if (bool != null) {
                    r0.A03("httpRedirect", bool);
                }
                A0y.add(r0);
            }
            A08.A7h(DKB.A00(512), A0y);
            List unmodifiableList2 = Collections.unmodifiableList(liH._safeBrowsingData);
            ArrayList A0y2 = 7zO.A0y(unmodifiableList2);
            Iterator it = unmodifiableList2.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0Q("getEvent");
            }
            A08.A7h("safe_browsing", A0y2);
            Set unmodifiableSet = Collections.unmodifiableSet(liH._resourceDomains);
            11T.A0A(unmodifiableSet);
            A08.A7h("request_domains", 1BK.A17(unmodifiableSet));
            java.util.Map unmodifiableMap = Collections.unmodifiableMap(liH._resourceCounts);
            11T.A0A(unmodifiableMap);
            A08.A6J("resources_mime_type_count", unmodifiableMap);
            Set unmodifiableSet2 = Collections.unmodifiableSet(liH._imagesUrl);
            11T.A0A(unmodifiableSet2);
            A08.A7h("images_url", 1BK.A17(unmodifiableSet2));
            A08.A5H("is_page_loaded", liH.isPageLoaded);
            A08.A7R("sim_hash", liH.simHash);
            A08.A7R("sim_hash_text", liH.simHashText);
            A08.A7R("sim_hash_dom", liH.simHashDOM);
            A08.A6H(1BJ.A00(108), liH.pageSize);
            A08.A7R("ad_id", (String) null);
            java.util.Map unmodifiableMap2 = Collections.unmodifiableMap(liH.htmlTagCounts);
            11T.A0A(unmodifiableMap2);
            A08.A6J("html_tag_counts", unmodifiableMap2);
            java.util.Map unmodifiableMap3 = Collections.unmodifiableMap(liH._imagesSizes);
            11T.A0A(unmodifiableMap3);
            HashMap A0u = AnonymousClass001.A0u();
            Iterator A0y3 = AnonymousClass001.A0y(unmodifiableMap3);
            while (A0y3.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y3);
                Object key = A0z.getKey();
                0DA r02 = new 0DA();
                r02.A06(Property.ICON_TEXT_FIT_WIDTH, Long.valueOf(((LiD) A0z.getValue()).width));
                r02.A06(Property.ICON_TEXT_FIT_HEIGHT, Long.valueOf(((LiD) A0z.getValue()).height));
                A0u.put(key, r02);
            }
            A08.A6J("images_sizes", A0u);
            java.util.Map map2 = liH._originToSimHash;
            A08.A6J("origin_to_sim_hash", map2 == null ? null : Collections.unmodifiableMap(map2));
            java.util.Map map3 = liH._originToSimHash;
            A08.A6J("origin_to_sim_hash_text", map3 == null ? null : Collections.unmodifiableMap(map3));
            java.util.Map map4 = liH._originToSimHash;
            A08.A6J("origin_to_sim_hash_dom", map4 == null ? null : Collections.unmodifiableMap(map4));
            String str = liH.trackingCodes;
            if (str != null) {
                ArrayList A0s = AnonymousClass001.A0s();
                A0s.add(str);
                A08.A7h("tracking_codes", A0s);
            }
            A08.BZL();
        }
    }
}
