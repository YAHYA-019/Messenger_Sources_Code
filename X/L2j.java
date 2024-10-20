package X;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: L2j.class */
public final class L2j {
    public String A0E = "";
    public String A0F = "";
    public String A0D = "";
    public long A04 = 0;
    public long A00 = 0;
    public long A01 = 0;
    public long A02 = 0;
    public long A03 = 0;
    public long A07 = 0;
    public long A0A = 0;
    public long A0B = 0;
    public long A08 = 0;
    public long A09 = 0;
    public long A05 = 0;
    public long A06 = 0;
    public java.util.Map A0G = AnonymousClass001.A0u();
    public long A0C = 0;
    public boolean A0I = false;
    public boolean A0H = false;

    public static L2j A00(JSONObject jSONObject) {
        L2j l2j = new L2j();
        l2j.A0E = jSONObject.getString("cache_name");
        l2j.A0F = jSONObject.getString(1BJ.A00(549));
        l2j.A0D = jSONObject.getString("cache_key");
        l2j.A04 = jSONObject.getLong("item_size_b");
        l2j.A00 = jSONObject.getLong("action_count");
        l2j.A01 = jSONObject.getLong("get_count");
        l2j.A03 = jSONObject.getLong("insert_count");
        l2j.A07 = jSONObject.getLong("remove_count");
        l2j.A02 = jSONObject.getLong("hit_count");
        l2j.A05 = jSONObject.getLong("refetch_count");
        l2j.A06 = jSONObject.getLong("refresh_count");
        l2j.A08 = jSONObject.getLong("remove_count_by_eviction");
        l2j.A09 = jSONObject.getLong("remove_count_by_staleness");
        l2j.A0B = jSONObject.getLong("remove_count_by_user");
        l2j.A0A = jSONObject.getLong("remove_count_by_unknown");
        java.util.Map map = l2j.A0G;
        map.clear();
        JSONObject jSONObject2 = jSONObject.getJSONObject("additional_metadata");
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String A0i = AnonymousClass001.A0i(keys);
            map.put(A0i, jSONObject2.getString(A0i));
        }
        l2j.A0C = jSONObject.getLong("tracking_start_time_ms");
        l2j.A0I = jSONObject.getBoolean("last_known_existence");
        l2j.A0H = jSONObject.getBoolean("had_known_existence");
        return l2j;
    }

    public HashMap A01() {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("item_size_b", Long.valueOf(this.A04));
        A0u.put("action_count", Long.valueOf(this.A00));
        A0u.put("get_count", Long.valueOf(this.A01));
        A0u.put("insert_count", Long.valueOf(this.A03));
        A0u.put("remove_count", Long.valueOf(this.A07));
        A0u.put("hit_count", Long.valueOf(this.A02));
        A0u.put("refetch_count", Long.valueOf(this.A05));
        A0u.put("refresh_count", Long.valueOf(this.A06));
        A0u.put("remove_count_by_eviction", Long.valueOf(this.A08));
        A0u.put("remove_count_by_staleness", Long.valueOf(this.A09));
        A0u.put("remove_count_by_user", Long.valueOf(this.A0B));
        A0u.put("remove_count_by_unknown", Long.valueOf(this.A0A));
        return A0u;
    }
}
