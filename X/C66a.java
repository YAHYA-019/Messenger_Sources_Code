package X;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.66a, reason: invalid class name */
/* loaded from: 66a.class */
public enum C66a {
    JPG("jpg"),
    PNG("png"),
    GIF("gif"),
    WEBP("webp"),
    MP4("mp4");

    public static final java.util.Map A00 = ImmutableMap.of((Object) "image/webp", (Object) "webp", (Object) "video/mp4", (Object) "mp4");
    public final String stringValue;

    C66a(String str) {
        this.stringValue = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C66a A00(String str) {
        if (str == null) {
            return null;
        }
        java.util.Map map = A00;
        if (map.containsKey(str)) {
            str = map.get(str);
        }
        C66a[] values = values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return null;
            }
            C66a c66a = values[i2];
            if (Objects.equal(c66a.stringValue, str)) {
                return c66a;
            }
            i = i2 + 1;
        }
    }
}
