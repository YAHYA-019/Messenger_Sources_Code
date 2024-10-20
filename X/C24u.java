package X;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.24u, reason: invalid class name */
/* loaded from: 24u.class */
public abstract class C24u {
    public static final C24w A01 = new Object();
    public final Object A00;

    public C24u(Object obj) {
        this.A00 = obj;
    }

    public C24u A00(Annotation annotation) {
        3BU r0 = (3BU) this;
        r0.A00.put(annotation.annotationType(), annotation);
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.67v, java.lang.Object] */
    public C67v A01() {
        ?? obj = new Object();
        for (Annotation annotation : ((3BU) this).A00.values()) {
            HashMap hashMap = obj.A00;
            if (hashMap == null) {
                hashMap = AnonymousClass001.A0u();
                obj.A00 = hashMap;
            }
            Annotation annotation2 = (Annotation) hashMap.put(annotation.annotationType(), annotation);
            if (annotation2 != null) {
                annotation2.equals(annotation);
            }
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.67v, X.24w, java.lang.Object] */
    public C24w A02() {
        HashMap hashMap = ((3BU) this).A00;
        if (hashMap.size() != 2) {
            ?? obj = new Object();
            obj.A00 = hashMap;
            return obj;
        }
        Iterator it = hashMap.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        Map.Entry entry2 = (Map.Entry) it.next();
        return new 3dC((Class) entry.getKey(), (Class) entry2.getKey(), (Annotation) entry.getValue(), (Annotation) entry2.getValue());
    }

    public boolean A03(Annotation annotation) {
        return ((3BU) this).A00.containsKey(annotation.annotationType());
    }
}
