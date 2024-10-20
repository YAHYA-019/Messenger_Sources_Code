package X;

import com.google.common.collect.ImmutableList;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.9X2, reason: invalid class name */
/* loaded from: 9X2.class */
public final class C9X2 {
    public final C00i A00 = 1BQ.A01();

    public ImmutableList A00(String str) {
        if (str == null) {
            return ImmutableList.of();
        }
        ImmutableList.Builder A0h = 4YU.A0h();
        try {
            JSONArray jSONArray = new JSONArray(str);
            int i = 0;
            while (true) {
                if (i >= jSONArray.length()) {
                    break;
                }
                A0h.m11011add((Object) Long.valueOf(jSONArray.getLong(i)));
                i++;
            }
        } catch (JSONException e) {
            e.printStackTrace();
            1BK.A09(this.A00).D0v("DbParticipantIdListSerialization", 0Pz.A0W("deserializeParticipantIds: Exception while parsing JSON participant Ids ]", e.toString()));
        }
        return A0h.build();
    }
}
