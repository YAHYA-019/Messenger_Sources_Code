package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Huc.class */
public final class Huc {
    public final long A00;
    public final HAy A01;
    public final String A02;
    public final HashMap A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final List A07;

    public Huc(I9H i9h) {
        this.A02 = i9h.A02;
        this.A01 = i9h.A01;
        this.A04 = i9h.A04;
        this.A00 = i9h.A00;
        this.A05 = i9h.A05;
        this.A03 = i9h.A03;
        List list = i9h.A06;
        Collections.sort(list, J4o.A00);
        this.A06 = list;
        List list2 = i9h.A07;
        Collections.sort(list2, J4p.A00);
        this.A07 = list2;
    }

    public I9H A00() {
        I9H i9h = new I9H(this.A01, this.A02, this.A00);
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            i9h.A02((HuY) it.next());
        }
        for (Rau rau : this.A07) {
            i9h.A01(rau.A01, rau.A00);
        }
        Iterator it2 = this.A06.iterator();
        while (it2.hasNext()) {
            i9h.A06.add(it2.next());
        }
        Iterator it3 = this.A05.iterator();
        while (it3.hasNext()) {
            i9h.A03((RSc) it3.next());
        }
        return i9h;
    }

    public JSONObject A01() {
        JSONObject A12 = AnonymousClass001.A12();
        A12.put("mName", this.A02);
        A12.put("mStartAtTimeUs", this.A00);
        A12.put("mTrackType", this.A01.mValue);
        List list = this.A04;
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(((HuY) it.next()).A00());
        }
        A12.put("mSegments", jSONArray);
        List<Rau> list2 = this.A07;
        JSONArray jSONArray2 = new JSONArray();
        for (Rau rau : list2) {
            JSONObject A122 = AnonymousClass001.A12();
            A122.put("mTargetTimeRange", rau.A01.A04());
            A122.put("mSpeed", rau.A00);
            jSONArray2.put(A122);
        }
        A12.put("mTimelineSpeedList", jSONArray2);
        List list3 = this.A06;
        JSONArray jSONArray3 = new JSONArray();
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            jSONArray3.put(((JLS) it2.next()).D4Q());
        }
        A12.put("mTimelinePtsMutatorList", jSONArray3);
        List<RSc> list4 = this.A05;
        JSONArray jSONArray4 = new JSONArray();
        for (RSc rSc : list4) {
            JSONObject A123 = AnonymousClass001.A12();
            A123.put("mTargetTimeRange", rSc.A00.A04());
            A123.put("mMediaEffect", rSc.A01.D4R());
            jSONArray4.put(A123);
        }
        A12.put("mTimelineEffects", jSONArray4);
        return A12;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Huc huc = (Huc) obj;
            if (!this.A02.equals(huc.A02) || this.A00 != huc.A00 || !this.A04.equals(huc.A04) || this.A01 != huc.A01 || !this.A07.equals(huc.A07) || !this.A05.equals(huc.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A04, this.A01, this.A07, this.A05, Long.valueOf(this.A00)});
    }

    public String toString() {
        try {
            return A01().toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
