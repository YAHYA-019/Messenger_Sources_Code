package X;

import com.fasterxml.jackson.annotation.JsonTypeId;
import java.lang.annotation.Annotation;
import java.util.HashMap;

/* renamed from: X.67v, reason: invalid class name */
/* loaded from: 67v.class */
public final class C67v implements C24w {
    public HashMap A00;

    /* JADX WARN: Type inference failed for: r301v2, types: [X.67v, java.lang.Object] */
    public static C67v A00(C67v c67v, C67v c67v2) {
        HashMap hashMap;
        if (c67v == null || (hashMap = c67v.A00) == null || hashMap.isEmpty()) {
            return c67v2;
        }
        C67v c67v3 = c67v;
        if (c67v2 != null) {
            HashMap hashMap2 = c67v2.A00;
            c67v3 = c67v;
            if (hashMap2 != null) {
                c67v3 = c67v;
                if (!hashMap2.isEmpty()) {
                    HashMap A0u = AnonymousClass001.A0u();
                    for (Annotation annotation : hashMap2.values()) {
                        A0u.put(annotation.annotationType(), annotation);
                    }
                    for (Annotation annotation2 : c67v.A00.values()) {
                        A0u.put(annotation2.annotationType(), annotation2);
                    }
                    ?? obj = new Object();
                    obj.A00 = A0u;
                    c67v3 = obj;
                }
            }
        }
        return c67v3;
    }

    public boolean A01() {
        HashMap hashMap = this.A00;
        if (hashMap == null) {
            return false;
        }
        return hashMap.containsKey(JsonTypeId.class);
    }

    @Override // X.C24w
    public Annotation AUd(Class cls) {
        HashMap hashMap = this.A00;
        if (hashMap == null) {
            return null;
        }
        return (Annotation) hashMap.get(cls);
    }

    @Override // X.C24w
    public boolean BNG(Class[] clsArr) {
        boolean z = false;
        if (this.A00 != null) {
            int i = 0;
            while (true) {
                if (!this.A00.containsKey(clsArr[i])) {
                    i++;
                    if (i >= 8) {
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    @Override // X.C24w
    public int size() {
        HashMap hashMap = this.A00;
        if (hashMap == null) {
            return 0;
        }
        return hashMap.size();
    }

    public String toString() {
        HashMap hashMap = this.A00;
        return hashMap == null ? "[null]" : hashMap.toString();
    }
}
