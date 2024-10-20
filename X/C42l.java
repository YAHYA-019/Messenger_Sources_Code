package X;

import android.net.Uri;
import com.facebook.common.json.FbJsonDeserializer;
import com.facebook.common.json.UriDeserializer;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.42l, reason: invalid class name */
/* loaded from: 42l.class */
public abstract class C42l {
    public static final FbJsonDeserializer A00;
    public static final ConcurrentMap A01;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.facebook.common.json.FbJsonDeserializer] */
    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        A01 = concurrentHashMap;
        A00 = new Object();
        concurrentHashMap.put(24X.class, JsonNodeDeserializer.A00);
        concurrentHashMap.put(String.class, StringDeserializer.A00);
        concurrentHashMap.put(Integer.class, C42u.A00(Integer.class, Integer.class.getName()));
        concurrentHashMap.put(Long.class, C42u.A00(Long.class, Long.class.getName()));
        concurrentHashMap.put(Boolean.class, C42u.A00(Boolean.class, Boolean.class.getName()));
        concurrentHashMap.put(Float.class, C42u.A00(Float.class, Float.class.getName()));
        concurrentHashMap.put(Double.class, C42u.A00(Double.class, Double.class.getName()));
        concurrentHashMap.put(Uri.class, new UriDeserializer());
        concurrentHashMap.put(28P.class, new TokenBufferDeserializer());
        concurrentHashMap.put(Object.class, new UntypedObjectDeserializer((24S) null, (24S) null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ba, code lost:
    
        if (r303 == null) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Type inference failed for: r303v14, types: [java.lang.Object, com.facebook.common.json.TreeFragmentModelBase64Deserializer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fasterxml.jackson.databind.JsonDeserializer A00(java.lang.Class r301) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42l.A00(java.lang.Class):com.fasterxml.jackson.databind.JsonDeserializer");
    }
}
