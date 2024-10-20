package X;

import com.facebook.graphql.enums.EnumHelper;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.5g9, reason: invalid class name */
/* loaded from: 5g9.class */
public abstract class C5g9 {
    public final JSONObject A00;

    public C5g9(JSONObject jSONObject) {
        this.A00 = jSONObject;
    }

    public static ImmutableList A00(Class cls, String str, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return ImmutableList.of();
        }
        try {
            Constructor constructor = cls.getConstructor(JSONObject.class);
            ImmutableList.Builder builder = new ImmutableList.Builder();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= optJSONArray.length()) {
                    return builder.build();
                }
                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                if (optJSONObject != null) {
                    try {
                        builder.m11011add(constructor.newInstance(optJSONObject));
                    } catch (InstantiationException | InvocationTargetException unused) {
                    }
                }
                i = i2 + 1;
            }
        } catch (IllegalAccessException | NoSuchMethodException unused2) {
            return ImmutableList.of();
        }
    }

    public static String A01(C5g9 c5g9, Object obj) {
        return ((0AC) obj).A03(Long.valueOf(c5g9.A00.optLong("expiration_timestamp_ms")), c5g9.A07("url"), c5g9.A07("url_fallback"));
    }

    public final C5g9 A02(Class cls, String str) {
        JSONObject optJSONObject = this.A00.optJSONObject(str);
        if (optJSONObject == null) {
            return null;
        }
        try {
            return (C5g9) cls.getConstructor(JSONObject.class).newInstance(optJSONObject);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public final ImmutableList A03(String str) {
        JSONArray optJSONArray = this.A00.optJSONArray(str);
        if (optJSONArray == null) {
            return ImmutableList.of();
        }
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= optJSONArray.length()) {
                return builder.build();
            }
            builder.m11011add((Object) Integer.valueOf(optJSONArray.optInt(i2)));
            i = i2 + 1;
        }
    }

    public final ImmutableList A04(String str) {
        JSONArray optJSONArray = this.A00.optJSONArray(str);
        if (optJSONArray == null) {
            return ImmutableList.of();
        }
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= optJSONArray.length()) {
                return builder.build();
            }
            builder.m11011add((Object) optJSONArray.optString(i2));
            i = i2 + 1;
        }
    }

    public final ImmutableList A05(String str, Class cls) {
        JSONArray optJSONArray = this.A00.optJSONArray(str);
        if (optJSONArray == null) {
            return ImmutableList.of();
        }
        try {
            Constructor constructor = cls.getConstructor(JSONObject.class);
            ImmutableList.Builder builder = new ImmutableList.Builder();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= optJSONArray.length()) {
                    return builder.build();
                }
                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                if (optJSONObject != null) {
                    try {
                        builder.m11011add(constructor.newInstance(optJSONObject));
                    } catch (InstantiationException | InvocationTargetException unused) {
                    }
                }
                i = i2 + 1;
            }
        } catch (IllegalAccessException | NoSuchMethodException unused2) {
            return ImmutableList.of();
        }
    }

    public final Enum A06(Enum r302, String str) {
        return EnumHelper.A00(r302, this.A00.optString(str));
    }

    public final String A07(String str) {
        JSONObject jSONObject = this.A00;
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    public final boolean A08(String str) {
        JSONObject jSONObject = this.A00;
        boolean z = true;
        if (jSONObject.optInt(str) != 1) {
            z = false;
        }
        return jSONObject.optBoolean(str, z);
    }
}
