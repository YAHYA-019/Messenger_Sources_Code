package X;

import android.app.usage.UsageStatsManager;
import android.content.Context;
import com.facebook.common.util.StringLocaleUtil;
import com.facebook.inject.FbInjector;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.base.Joiner;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3r5, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3r5.class */
public final class C01443r5 {
    public final C00i A02 = new 1BQ(32905);
    public final C00i A04 = new 1BQ(131252);
    public final C00i A03 = new 1BQ(16772);
    public final C00i A01 = new 1BQ(16960);
    public final C00i A05 = new 1BQ(16634);
    public final C00i A00 = FbInjector.A00;

    public static 2Jy A00(String str, String str2, String str3, String str4, String str5, java.util.Map map) {
        2Jy r0 = new 2Jy(StringLocaleUtil.toLowerCaseLocaleSafe(str));
        if (str5 != null) {
            r0.A0D("pigeon_reserved_keyword_module", str5);
        }
        if (str2 != null) {
            r0.A0D("status", StringLocaleUtil.toLowerCaseLocaleSafe(str2));
        }
        if (str4 != null) {
            r0.A0D("pigeon_reserved_keyword_obj_id", str4);
        }
        if (str3 != null) {
            r0.A0D("pigeon_reserved_keyword_obj_type", str3);
        }
        for (Map.Entry entry : map.entrySet()) {
            r0.A0D((String) entry.getKey(), (String) entry.getValue());
        }
        0fH.A13("ReliabilityAnalyticsLogger", "Reliability event. Category: %s, Status %s, Object Type %s, Object ID %s, Map:\n %s", new Object[]{str, str2, str3, str4, map});
        return r0;
    }

    public static String A01(Object obj, Object obj2, AbstractMap abstractMap, List list) {
        abstractMap.put(obj, obj2);
        if (list != null && !list.isEmpty()) {
            abstractMap.put("message_id", new Joiner(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).join(list));
        }
        return InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1;
    }

    public static void A02(String str, AbstractMap abstractMap, List list) {
        if (list.isEmpty()) {
            return;
        }
        abstractMap.put("failed_batch_ids", new Joiner(str).join(list));
    }

    public void A03(2Jy r302) {
        boolean A09 = ((1CQ) this.A04.get()).A09(68, false);
        5sP A00 = 5sP.A00((C1kw) this.A03.get());
        if (A09) {
            A00.A02(r302);
        } else {
            A00.A03(r302);
        }
    }

    public void A04(Integer num, String str, String str2, String str3, String str4) {
        ((2Iq) this.A01.get()).A00(0Pz.A0j("push_arrived-", str, "-null"));
        1UG A00 = 1UD.A00((04J) this.A05.get(), 1ZG.A03, "notif_push_arrived");
        if (A00.isSampled()) {
            A00.A7R(Property.SYMBOL_Z_ORDER_SOURCE, str);
            A00.A7R("push_id", str2);
            A00.A7R("receiver_push_type", str3);
            A00.A7R("select_push_type", str4);
            if (num != null) {
                A00.A6H("priority_diff", Long.valueOf(num.longValue()));
            }
            if (((UsageStatsManager) ((Context) this.A00.get()).getSystemService("usagestats")) != null) {
                A00.A6H("standby_bucket", Long.valueOf(r0.getAppStandbyBucket()));
            }
            A00.BZL();
        }
    }

    public void A05(String str, String str2) {
        1UG A00 = 1UD.A00((04J) this.A05.get(), 1ZG.A01, "clear_notif");
        if (A00.isSampled()) {
            A00.A7R("t_key", str);
            A00.A7R("reason", str2);
            A00.BZL();
        }
    }

    public void A06(String str, String str2, String str3, String str4, String str5, java.util.Map map) {
        this.A02.get();
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        if (str2 != null) {
            hashMap.put("push_id", str2);
        }
        A08(0Pz.A0W("messaging_push_notif_", str), str3, str4, str5, null, hashMap);
    }

    public void A07(String str, String str2, String str3, String str4, String str5, java.util.Map map) {
        5sP.A00((C1kw) this.A03.get()).A02(A00(str, str2, str3, str4, str5, map));
    }

    public void A08(String str, String str2, String str3, String str4, String str5, java.util.Map map) {
        if (((1CQ) this.A04.get()).A09(68, false)) {
            A07(str, str2, str3, str4, str5, map);
        } else {
            5sP.A00((C1kw) this.A03.get()).A03(A00(str, str2, str3, str4, str5, map));
        }
    }

    public final void A09(String str, String str2, java.util.Map map) {
        A08(str, str2, null, null, null, map);
    }

    public void A0A(String str, List list, List list2, int i, int i2, long j, long j2) {
        this.A02.get();
        HashMap A0u = AnonymousClass001.A0u();
        if (str != null) {
            A0u.put(Property.SYMBOL_Z_ORDER_SOURCE, str);
        }
        A0u.put("watermark_timestamp", Long.toString(j));
        A0u.put("message_count", Integer.toString(i));
        A02(A01("batch_id", Long.toString(j2), A0u, list), A0u, list2);
        if (i2 > 0) {
            A0u.put("failed_count", Integer.toString(i2));
        }
        A0D("delivery_receipt_new_send_attempt", A0u);
    }

    public void A0B(String str, List list, List list2, int i, int i2, long j, long j2) {
        this.A02.get();
        HashMap A0u = AnonymousClass001.A0u();
        if (str != null) {
            A0u.put(Property.SYMBOL_Z_ORDER_SOURCE, str);
        }
        String A01 = A01("watermark_timestamp", Long.toString(j), A0u, list);
        A0u.put("message_count", Integer.toString(i));
        A0u.put("batch_id", Long.toString(j2));
        A02(A01, A0u, list2);
        if (i2 > 0) {
            A0u.put("failed_count", Integer.toString(i2));
        }
        A0D("delivery_receipt_new_send_success", A0u);
    }

    public void A0C(String str, List list, List list2, int i, long j, long j2) {
        this.A02.get();
        HashMap A0u = AnonymousClass001.A0u();
        if (str != null) {
            A0u.put(Property.SYMBOL_Z_ORDER_SOURCE, str);
        }
        String A01 = A01("watermark_timestamp", Long.toString(j), A0u, list);
        A0u.put("message_count", Integer.toString(i));
        A0u.put("batch_id", Long.toString(j2));
        A02(A01, A0u, list2);
        A0D("delivery_receipt_new_send_failure", A0u);
    }

    public final void A0D(String str, java.util.Map map) {
        A08(str, null, null, null, null, map);
    }
}
