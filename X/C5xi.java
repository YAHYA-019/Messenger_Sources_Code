package X;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5xi, reason: invalid class name */
/* loaded from: 5xi.class */
public final class C5xi implements C2oj {
    public final List A00;
    public final java.util.Map A01;

    public C5xi(C2ot c2ot, java.util.Map map) {
        List singletonList = Collections.singletonList(c2ot);
        11T.A0A(singletonList);
        this.A00 = singletonList;
        LinkedHashMap linkedHashMap = new LinkedHashMap(02J.A00(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), 0QD.A0O(this.A00, (Collection) entry.getValue()));
        }
        this.A01 = linkedHashMap;
    }

    public C5xi(C5xg c5xg) {
        C2ot c2ot = c5xg.A00;
        if (c2ot == null) {
            throw AnonymousClass001.A0L(1BJ.A00(1277));
        }
        List singletonList = Collections.singletonList(c2ot);
        11T.A0A(singletonList);
        this.A00 = singletonList;
        java.util.Map map = c5xg.A01;
        LinkedHashMap linkedHashMap = new LinkedHashMap(02J.A00(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), 0QD.A0O(this.A00, (Collection) entry.getValue()));
        }
        this.A01 = linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006a, code lost:
    
        if (r306 != null) goto L11;
     */
    @Override // X.C2oj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Iterator AUf(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r301
            java.util.Map r0 = r0.A01
            java.util.Set r0 = r0.entrySet()
            r303 = r0
            r0 = r303
            java.util.Iterator r0 = r0.iterator()
            r304 = r0
        L11:
            r0 = r304
            boolean r0 = r0.hasNext()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L7e
            r0 = r304
            java.lang.Object r0 = r0.next()
            r306 = r0
            r0 = r306
            r303 = r0
            r0 = r306
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getKey()
            java.lang.Class r0 = (java.lang.Class) r0
            r303 = r0
            r0 = r303
            r1 = r302
            boolean r0 = r0.isInstance(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L11
        L43:
            r0 = r306
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L75
            r0 = r306
            java.lang.Object r0 = r0.getValue()
            r306 = r0
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.facebook.xapp.messaging.renderer.interfaces.ModelRenderer<ConcreteModel of com.facebook.xapp.messaging.renderer.config.ModelInstanceOfEagerRenderMap.get$lambda$3>>"
            r303 = r0
            r0 = r306
            r1 = r303
            X.11T.A0I(r0, r1)
            r0 = r306
            java.util.List r0 = (java.util.List) r0
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L75
        L6d:
            r0 = r306
            java.util.Iterator r0 = r0.iterator()
            return r0
        L75:
            r0 = r301
            java.util.List r0 = r0.A00
            r306 = r0
            goto L6d
        L7e:
            r0 = 0
            r306 = r0
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5xi.AUf(java.lang.Object):java.util.Iterator");
    }
}
