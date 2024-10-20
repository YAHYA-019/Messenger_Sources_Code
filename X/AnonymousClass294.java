package X;

import com.facebook.presence.model.PresenceItem;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.294, reason: invalid class name */
/* loaded from: 294.class */
public final class AnonymousClass294 {
    public final 1Br A01 = 1Bq.A00(115564);
    public final 1Br A00 = 1Bq.A00(115565);

    public final void A00(ImmutableList immutableList, Integer num, String str) {
        String str2;
        HashMap hashMap = new HashMap();
        1Du it = immutableList.iterator();
        boolean z = false;
        long j = 0;
        long j2 = 0;
        while (it.hasNext()) {
            PresenceItem presenceItem = (PresenceItem) it.next();
            11T.A0D(presenceItem);
            Long l = presenceItem.A03;
            if (l != null && (l.longValue() & 1073741824) == 1073741824) {
                UserKey userKey = presenceItem.A02;
                if (userKey != null) {
                    String str3 = userKey.id;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("user_id", userKey).put("is_active", presenceItem.A07).put("last_active_time_s", presenceItem.A01).put("active_client_bits", presenceItem.A00).put("all_capability_bits", l).put("aloha_proxy_user_id", presenceItem.A04);
                        Long l2 = presenceItem.A05;
                        if (l2 != null) {
                            jSONObject.put("correlation_id", l2);
                        }
                        String str4 = presenceItem.A06;
                        if (str4 != null) {
                            jSONObject.put("publish_id", str4);
                        }
                        str2 = jSONObject.toString();
                    } catch (JSONException unused) {
                        str2 = "";
                    }
                    hashMap.put(str3, str2);
                }
                z = true;
            }
            if (presenceItem.A07) {
                j++;
            } else if (presenceItem.A01 != -1) {
                j2++;
            }
        }
        if (z) {
            5Ch r0 = (5Ch) this.A01.A00.get();
            1UG A00 = 1UD.A00((04J) r0.A01.A00.get(), 1ZG.A01, "msgr_presence_update");
            if (A00.isSampled() && ((2yD) ((5Ci) r0.A00.A00.get()).A00.A00.get()).AZk(36313351487297768L)) {
                A00.A7R("event_type", "BATCH_RECEIVED");
                A00.A7R("client_request_id", str);
                A00.A6J("presence_data", hashMap);
                A00.BZL();
            }
        }
        if (num == 0S2.A01 || num == 0S2.A0C) {
            3Ks r02 = (3Ks) 1Br.A0B(this.A00);
            String A002 = 3H4.A00(num);
            1UG A08 = 1BK.A08(1Br.A02(r02.A00), "presence_bladerunner_migration_client");
            if (A08.isSampled() && str != null && 1Br.A07(r02.A01).AZl(36315580575327420L, false)) {
                A08.A7R("event_id", str);
                A08.A7R("experiment_cohort", A002);
                A08.A6H("active_counts", Long.valueOf(j));
                A08.A6H("recently_active_counts", Long.valueOf(j2));
                A08.A7R("event_name", "PRESENCE_UPDATE_RECEIVED");
                A08.BZL();
            }
        }
    }
}
