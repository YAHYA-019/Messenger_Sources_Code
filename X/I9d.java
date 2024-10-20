package X;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: I9d.class */
public final class I9d {
    public HashMap A00;
    public HashMap A01;
    public HashMap A02;
    public boolean A03;
    public HashMap A04;

    public I9d(I4d i4d) {
        HashMap A0u = AnonymousClass001.A0u();
        this.A02 = A0u;
        A0u.putAll(i4d.A02);
        HashMap A0u2 = AnonymousClass001.A0u();
        this.A00 = A0u2;
        A0u2.putAll(i4d.A00);
        HashMap A0u3 = AnonymousClass001.A0u();
        this.A01 = A0u3;
        A0u3.putAll(i4d.A01);
        this.A04 = AnonymousClass001.A0u();
    }

    public static JSONObject A00(Map.Entry entry) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("TrackType", ((HAy) entry.getKey()).mValue);
        return jSONObject;
    }

    private void A01() {
        if (this.A03) {
            return;
        }
        Iterator A13 = GOo.A13(this.A02);
        while (A13.hasNext()) {
            AbstractMap abstractMap = (AbstractMap) A13.next();
            HashMap A0u = AnonymousClass001.A0u();
            Iterator A0x = AnonymousClass001.A0x(abstractMap);
            while (A0x.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0x);
                Object key = A0z.getKey();
                Huc huc = (Huc) A0z.getValue();
                A0u.put(key, 1BK.A17(huc.A04));
                this.A04.put(huc.A01, A0u);
            }
        }
        this.A03 = true;
    }

    public int A02(HAy hAy, String str) {
        A01();
        AbstractMap abstractMap = (AbstractMap) this.A02.get(hAy);
        if (abstractMap == null) {
            return -1;
        }
        Iterator A0x = AnonymousClass001.A0x(abstractMap);
        while (A0x.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0x);
            if (((Huc) A0z.getValue()).A02.equals(str)) {
                return AnonymousClass001.A03(A0z.getKey());
            }
        }
        return -1;
    }

    public I4d A03() {
        I4d i4d = new I4d();
        Iterator A13 = GOo.A13(this.A02);
        while (A13.hasNext()) {
            AbstractMap abstractMap = (AbstractMap) A13.next();
            for (int i = 0; i < abstractMap.size(); i++) {
                Huc huc = (Huc) GOo.A0s(abstractMap, i);
                if (huc == null) {
                    throw AnonymousClass001.A0L("track composition is null");
                }
                i4d.A03(huc);
            }
        }
        Iterator A0x = AnonymousClass001.A0x(this.A00);
        while (A0x.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0x);
            Iterator A1G = GOn.A1G(A0z.getValue());
            while (A1G.hasNext()) {
                RSc rSc = (RSc) A1G.next();
                i4d.A01(rSc.A00, (HAy) A0z.getKey(), rSc.A01);
            }
        }
        return i4d;
    }

    public Huc A04(HAy hAy, int i) {
        A01();
        AbstractMap abstractMap = (AbstractMap) this.A02.get(hAy);
        if (abstractMap != null) {
            return (Huc) GOo.A0s(abstractMap, i);
        }
        return null;
    }

    public String A05() {
        try {
            JSONObject A12 = AnonymousClass001.A12();
            HashMap hashMap = this.A02;
            JSONArray jSONArray = new JSONArray();
            Iterator A0x = AnonymousClass001.A0x(hashMap);
            while (A0x.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0x);
                JSONObject A00 = A00(A0z);
                AbstractMap abstractMap = (AbstractMap) A0z.getValue();
                JSONArray jSONArray2 = new JSONArray();
                Iterator A0x2 = AnonymousClass001.A0x(abstractMap);
                while (A0x2.hasNext()) {
                    Map.Entry A0z2 = AnonymousClass001.A0z(A0x2);
                    JSONObject A122 = AnonymousClass001.A12();
                    A122.put("TrackIndex", A0z2.getKey());
                    A122.put("MediaTrackComposition", A0z2.getValue().hashCode());
                    jSONArray2.put(A122);
                }
                A00.put("TrackMap", jSONArray2);
                jSONArray.put(A00);
            }
            A12.put("mTypeToTracksMap", jSONArray);
            HashMap hashMap2 = this.A00;
            JSONArray jSONArray3 = new JSONArray();
            Iterator A0x3 = AnonymousClass001.A0x(hashMap2);
            while (A0x3.hasNext()) {
                Map.Entry A0z3 = AnonymousClass001.A0z(A0x3);
                JSONObject A002 = A00(A0z3);
                List list = (List) A0z3.getValue();
                JSONArray jSONArray4 = new JSONArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jSONArray4.put(it.next().hashCode());
                }
                A002.put("TimelineEffects", jSONArray4);
                jSONArray3.put(A002);
            }
            A12.put("mTrackTypeToTimelineEffects", jSONArray3);
            return A12.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public String A06() {
        try {
            return A0A().toString();
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    public HashMap A07(HAy hAy) {
        HashMap A0u = AnonymousClass001.A0u();
        List A1I = GOn.A1I(hAy, this.A00);
        if (A1I != null && !A1I.isEmpty()) {
            A0u.put(7zN.A0h(), A1I);
        }
        HashMap A08 = A08(hAy);
        if (A08 != null) {
            Iterator A0x = AnonymousClass001.A0x(A08);
            while (A0x.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0x);
                Huc huc = (Huc) A0z.getValue();
                Object key = A0z.getKey();
                List list = huc.A05;
                if (!list.isEmpty()) {
                    A0u.put(key, list);
                }
            }
        }
        return A0u;
    }

    public HashMap A08(HAy hAy) {
        A01();
        HashMap hashMap = this.A02;
        if (hashMap.get(hAy) != null) {
            return (HashMap) hashMap.get(hAy);
        }
        return null;
    }

    public List A09(HAy hAy, int i) {
        A01();
        AbstractMap abstractMap = (AbstractMap) this.A04.get(hAy);
        if (abstractMap != null) {
            return (List) GOo.A0s(abstractMap, i);
        }
        return null;
    }

    public JSONObject A0A() {
        JSONObject A12 = AnonymousClass001.A12();
        HashMap hashMap = this.A02;
        JSONArray jSONArray = new JSONArray();
        Iterator A0x = AnonymousClass001.A0x(hashMap);
        while (A0x.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0x);
            JSONObject A00 = A00(A0z);
            AbstractMap abstractMap = (AbstractMap) A0z.getValue();
            JSONArray jSONArray2 = new JSONArray();
            Iterator A0x2 = AnonymousClass001.A0x(abstractMap);
            while (A0x2.hasNext()) {
                Map.Entry A0z2 = AnonymousClass001.A0z(A0x2);
                JSONObject A122 = AnonymousClass001.A12();
                A122.put("TrackIndex", A0z2.getKey());
                A122.put("MediaTrackComposition", ((Huc) A0z2.getValue()).A01());
                jSONArray2.put(A122);
            }
            A00.put("TrackMap", jSONArray2);
            jSONArray.put(A00);
        }
        A12.put("mTypeToTracksMap", jSONArray);
        HashMap hashMap2 = this.A00;
        JSONArray jSONArray3 = new JSONArray();
        Iterator A0x3 = AnonymousClass001.A0x(hashMap2);
        while (A0x3.hasNext()) {
            Map.Entry A0z3 = AnonymousClass001.A0z(A0x3);
            JSONObject A002 = A00(A0z3);
            List<RSc> list = (List) A0z3.getValue();
            JSONArray jSONArray4 = new JSONArray();
            for (RSc rSc : list) {
                JSONObject A123 = AnonymousClass001.A12();
                A123.put("mTargetTimeRange", rSc.A00.A04());
                A123.put("mMediaEffect", rSc.A01.D4R());
                jSONArray4.put(A123);
            }
            A002.put("TimelineEffects", jSONArray4);
            jSONArray3.put(A002);
        }
        A12.put("mTrackTypeToTimelineEffects", jSONArray3);
        return A12;
    }

    public void A0B() {
        HashMap hashMap = this.A02;
        boolean z = !hashMap.isEmpty();
        RuntimeException A0T = AnonymousClass001.A0T("type to track map is empty");
        if (!z) {
            throw new RuntimeException("media composition validation error", A0T);
        }
        Iterator A13 = GOo.A13(hashMap);
        while (A13.hasNext()) {
            AbstractMap abstractMap = (AbstractMap) A13.next();
            ArrayList A0t = AnonymousClass001.A0t(abstractMap.size());
            Iterator A132 = GOo.A13(abstractMap);
            while (A132.hasNext()) {
                Huc huc = (Huc) A132.next();
                for (HuY huY : huc.A04) {
                    File file = huY.A04;
                    if (file != null) {
                        boolean exists = file.exists();
                        FileNotFoundException fileNotFoundException = new FileNotFoundException(0Pz.A0W("source file not exist. path=", file.getPath()));
                        if (!exists) {
                            throw new RuntimeException("media track segment validation error", fileNotFoundException);
                        }
                        boolean canRead = file.canRead();
                        IOException A0o = DKE.A0o("source file cannot be read. path=", file.getPath());
                        if (!canRead) {
                            throw new RuntimeException("media track segment validation error", A0o);
                        }
                    } else {
                        boolean z2 = huY.A05 != null;
                        IllegalArgumentException A0L = AnonymousClass001.A0L("url cannot be null");
                        if (!z2) {
                            throw new RuntimeException("media track segment validation error", A0L);
                        }
                    }
                }
                String str = huc.A02;
                if (A0t.contains(str)) {
                    throw new RuntimeException("media composition validation error", AnonymousClass001.A0N("duplicate track name"));
                }
                A0t.add(str);
            }
        }
    }

    public boolean A0C(HAy hAy) {
        AbstractMap abstractMap = (AbstractMap) this.A02.get(hAy);
        boolean z = false;
        if (abstractMap != null) {
            Iterator A0x = AnonymousClass001.A0x(abstractMap);
            loop0: while (true) {
                if (!A0x.hasNext()) {
                    break;
                }
                Iterator A1D = GOp.A1D(((Huc) GOp.A15(A0x)).A07);
                while (A1D.hasNext()) {
                    if (!C0ec.A00(((Rau) A1D.next()).A00, 1.0f)) {
                        z = true;
                        break loop0;
                    }
                }
            }
        }
        return z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            I9d i9d = (I9d) obj;
            if (!IFX.A0A(this.A02, i9d.A02) || !IFX.A0A(this.A00, i9d.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbM.A05(this.A02, this.A00);
    }

    public String toString() {
        try {
            return A0A().toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
