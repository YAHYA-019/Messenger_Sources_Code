package X;

import com.facebook.nativeutil.NativeList;
import com.facebook.nativeutil.NativeMap;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.3ti, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3ti.class */
public abstract class AbstractC01993ti {
    public static Object A00(Object obj) {
        List list;
        if (obj != null) {
            if ((obj instanceof Float) || (obj instanceof Byte)) {
                return Double.valueOf(((Number) obj).doubleValue());
            }
            if (obj instanceof java.util.Map) {
                return new NativeMap((java.util.Map) obj);
            }
            if (obj.getClass().isArray()) {
                NativeList nativeList = NativeList.$redex_init_class;
                list = ImmutableList.of(obj);
            } else if (obj instanceof List) {
                list = (List) obj;
            }
            return new NativeList(list);
        }
        obj = null;
        return obj;
    }
}
