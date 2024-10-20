package X;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2oi, reason: invalid class name */
/* loaded from: 2oi.class */
public final class C2oi implements C2oj {
    public final List A00;
    public final java.util.Map A01;

    public C2oi(C2ob c2ob) {
        C01i c01i = c2ob.A00;
        if (c01i == null) {
            throw AnonymousClass001.A0L("fallbackRenderer not set");
        }
        List singletonList = Collections.singletonList(c01i);
        11T.A0A(singletonList);
        this.A00 = singletonList;
        java.util.Map map = c2ob.A01;
        LinkedHashMap linkedHashMap = new LinkedHashMap(02J.A00(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), 0QD.A0O(this.A00, (Collection) entry.getValue()));
        }
        this.A01 = linkedHashMap;
    }

    @Override // X.C2oj
    public Iterator AUf(Object obj) {
        Iterable iterable = (Iterable) this.A01.get(obj.getClass());
        if (iterable == null) {
            iterable = this.A00;
        }
        11T.A0I(iterable, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Lazy<com.facebook.xapp.messaging.renderer.interfaces.ModelRenderer<ConcreteModel of com.facebook.xapp.messaging.renderer.config.ModelClassRenderMap.get>?>>");
        return 0AI.A06(C2or.A00, 0QD.A03(iterable)).iterator();
    }
}
