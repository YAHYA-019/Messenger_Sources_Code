package X;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Fxj.class */
public final class Fxj implements GHD {
    public final GHD A00;

    public Fxj(GHD ghd) {
        this.A00 = ghd;
    }

    public static String A00(Object obj, boolean z, boolean z2) {
        if (!(obj instanceof List) && !(obj instanceof java.util.Map)) {
            return obj == null ? "" : String.valueOf(obj);
        }
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            A03(jsonWriter, obj, z, z2);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e) {
            return AnonymousClass001.A0Z(e, "Exception in serialization ", AnonymousClass001.A0k());
        }
    }

    public static ArrayList A01(JSONArray jSONArray) {
        int length = jSONArray.length();
        ArrayList A0t = AnonymousClass001.A0t(length);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return A0t;
            }
            Object obj = jSONArray.get(i2);
            if (!(obj instanceof String)) {
                if (obj instanceof JSONObject) {
                    obj = A02((JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    obj = A01((JSONArray) obj);
                } else if (!(obj instanceof Integer)) {
                    if (obj instanceof Double) {
                        obj = FB1.A00(DKC.A00(obj));
                    } else if (obj instanceof Float) {
                        obj = FB1.A00(7zM.A00(obj));
                    } else {
                        if (obj instanceof Boolean) {
                            A0t.add(obj);
                        } else if (!(obj instanceof Long)) {
                        }
                        i = i2 + 1;
                    }
                }
            }
            A0t.add(obj);
            i = i2 + 1;
        }
    }

    public static HashMap A02(JSONObject jSONObject) {
        HashMap A0u = AnonymousClass001.A0u();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String A0i = AnonymousClass001.A0i(keys);
            Object obj = jSONObject.get(A0i);
            if (!(obj instanceof String)) {
                if (obj instanceof JSONObject) {
                    obj = A02((JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    obj = A01((JSONArray) obj);
                } else if (!(obj instanceof Integer)) {
                    if (obj instanceof Double) {
                        obj = FB1.A00(DKC.A00(obj));
                    } else if (obj instanceof Float) {
                        obj = FB1.A00(7zM.A00(obj));
                    } else if (obj instanceof Boolean) {
                        A0u.put(A0i, obj);
                    } else if (obj instanceof Long) {
                    }
                }
            }
            A0u.put(A0i, obj);
        }
        return A0u;
    }

    public static void A03(JsonWriter jsonWriter, Object obj, boolean z, boolean z2) {
        String valueOf;
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            boolean A1V = AnonymousClass001.A1V(obj);
            if (z2) {
                jsonWriter.value(A1V ? 1L : 0L);
                return;
            } else {
                jsonWriter.value(A1V);
                return;
            }
        }
        if (obj instanceof String) {
            valueOf = (String) obj;
        } else {
            if (obj instanceof java.util.Map) {
                jsonWriter.beginObject();
                if (z) {
                    TreeMap treeMap = new TreeMap();
                    Iterator A0y = AnonymousClass001.A0y((java.util.Map) obj);
                    while (A0y.hasNext()) {
                        Map.Entry A0z = AnonymousClass001.A0z(A0y);
                        treeMap.put(String.valueOf(A0z.getKey()), A0z.getValue());
                    }
                    Iterator A0x = AnonymousClass001.A0x(treeMap);
                    while (A0x.hasNext()) {
                        Map.Entry A0z2 = AnonymousClass001.A0z(A0x);
                        jsonWriter.name(AnonymousClass001.A0j(A0z2));
                        A03(jsonWriter, A0z2.getValue(), z, z2);
                    }
                } else {
                    Iterator A0y2 = AnonymousClass001.A0y((java.util.Map) obj);
                    while (A0y2.hasNext()) {
                        Map.Entry A0z3 = AnonymousClass001.A0z(A0y2);
                        jsonWriter.name(String.valueOf(A0z3.getKey()));
                        A03(jsonWriter, A0z3.getValue(), z, z2);
                    }
                }
                jsonWriter.endObject();
                return;
            }
            if (obj instanceof List) {
                jsonWriter.beginArray();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    A03(jsonWriter, it.next(), z, z2);
                }
                jsonWriter.endArray();
                return;
            }
            valueOf = String.valueOf(obj);
        }
        jsonWriter.value(valueOf);
    }

    public Object AQy(FHh fHh, DKc dKc, String str) {
        short s = -1;
        switch (str.hashCode()) {
            case -863899808:
                s = DKE.A18("bk.action.string.JsonDecode", str);
                break;
            case -826958968:
                s = DKE.A19("bk.action.string.JsonEncode", str);
                break;
            case -138615772:
                s = DKE.A1A("bk.action.string.JsonEncodeV2", str);
                break;
            case -138615771:
                if (str.equals("bk.action.string.JsonEncodeV3")) {
                    s = 3;
                    break;
                }
                break;
            case 1509306073:
                if (str.equals("bk.action.string.JsonDecodeArray")) {
                    s = 4;
                    break;
                }
                break;
        }
        switch (s) {
            case 0:
                try {
                    Object A10 = DKC.A10(dKc, 0);
                    A10.getClass();
                    return A02(DKC.A1F((String) A10));
                } catch (JSONException e) {
                    throw new IllegalArgumentException("Trying to decode malformed json", e);
                }
            case 1:
                return A00(DKC.A10(dKc, 0), false, true);
            case 2:
                List list = dKc.A00;
                return A00(list.get(0), FB1.A02(list.get(1)), true);
            case 3:
                List list2 = dKc.A00;
                return A00(list2.get(0), FB1.A02(list2.get(1)), false);
            case 4:
                try {
                    Object A102 = DKC.A10(dKc, 0);
                    A102.getClass();
                    return A01(new JSONArray((String) A102));
                } catch (JSONException e2) {
                    throw new IllegalArgumentException("Trying to decode malformed json", e2);
                }
            default:
                return this.A00.AQy(fHh, dKc, str);
        }
    }
}
