package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: X.28b, reason: invalid class name */
/* loaded from: 28b.class */
public abstract class C28b {
    public C28c A00() {
        return ((3Av) this)._version;
    }

    public String A01() {
        return ((3Av) this)._name;
    }

    public String A02() {
        return getClass().getName();
    }

    /* JADX WARN: Type inference failed for: r0v140, types: [X.27T, X.27S] */
    /* JADX WARN: Type inference failed for: r0v172, types: [X.27T, X.27S] */
    /* JADX WARN: Type inference failed for: r0v204, types: [X.27T, X.27S] */
    public void A03(C28e c28e) {
        3Av r0 = (3Av) this;
        JzH jzH = r0._serializers;
        if (jzH != null) {
            c28e.A7K(jzH);
        }
        Jy1 jy1 = r0._deserializers;
        if (jy1 != null) {
            c28e.A5Y(jy1);
        }
        JzH jzH2 = r0._keySerializers;
        if (jzH2 != null) {
            AnonymousClass244 anonymousClass244 = ((C28d) c28e).A00;
            C27d c27d = (C27d) anonymousClass244._serializerFactory;
            28V r02 = c27d._factoryConfig;
            anonymousClass244._serializerFactory = c27d.A09(new 28V(r02._modifiers, r02._additionalSerializers, (28X[]) C28h.A00(jzH2, r02._additionalKeySerializers)));
        }
        C3d8 c3d8 = r0._keyDeserializers;
        if (c3d8 != null) {
            AnonymousClass244 anonymousClass2442 = ((C28d) c28e).A00;
            AnonymousClass277 anonymousClass277 = (AnonymousClass277) anonymousClass2442._deserializationContext._factory;
            C27I c27i = anonymousClass277._factoryConfig;
            anonymousClass2442._deserializationContext = new C27T(anonymousClass2442._deserializationContext, anonymousClass277.A0I(new C27I(c27i._abstractTypeResolvers, c27i._modifiers, c27i._additionalDeserializers, (C27P[]) C28h.A00(c3d8, c27i._additionalKeyDeserializers), c27i._valueInstantiators)));
        }
        3AX r03 = r0._abstractTypes;
        if (r03 != null) {
            AnonymousClass244 anonymousClass2443 = ((C28d) c28e).A00;
            AnonymousClass277 anonymousClass2772 = (AnonymousClass277) anonymousClass2443._deserializationContext._factory;
            C27I c27i2 = anonymousClass2772._factoryConfig;
            anonymousClass2443._deserializationContext = new C27T(anonymousClass2443._deserializationContext, anonymousClass2772.A0I(new C27I((C27L[]) C28h.A00(r03, c27i2._abstractTypeResolvers), c27i2._modifiers, c27i2._additionalDeserializers, c27i2._additionalKeyDeserializers, c27i2._valueInstantiators)));
        }
        C3d9 c3d9 = r0._valueInstantiators;
        if (c3d9 != null) {
            AnonymousClass244 anonymousClass2444 = ((C28d) c28e).A00;
            AnonymousClass277 anonymousClass2773 = (AnonymousClass277) anonymousClass2444._deserializationContext._factory;
            C27I c27i3 = anonymousClass2773._factoryConfig;
            anonymousClass2444._deserializationContext = new C27T(anonymousClass2444._deserializationContext, anonymousClass2773.A0I(new C27I(c27i3._abstractTypeResolvers, c27i3._modifiers, c27i3._additionalDeserializers, c27i3._additionalKeyDeserializers, (27N[]) C28h.A00(c3d9, c27i3._valueInstantiators))));
        }
        28Y r04 = r0._serializerModifier;
        if (r04 != null) {
            c28e.A5G(r04);
        }
        LinkedHashSet linkedHashSet = r0._subtypes;
        if (linkedHashSet != null && linkedHashSet.size() > 0) {
            LinkedHashSet linkedHashSet2 = r0._subtypes;
            3eR[] r05 = (3eR[]) linkedHashSet2.toArray(new 3eR[linkedHashSet2.size()]);
            25X r06 = ((C28d) c28e).A00._subtypeResolver;
            if (r06._registeredSubtypes == null) {
                r06._registeredSubtypes = new LinkedHashSet();
            }
            for (3eR r07 : r05) {
                r06._registeredSubtypes.add(r07);
            }
        }
        C00913pS c00913pS = r0._namingStrategy;
        if (c00913pS != null) {
            AnonymousClass244 anonymousClass2445 = ((C28d) c28e).A00;
            anonymousClass2445._serializationConfig = (C25p) anonymousClass2445._serializationConfig.A0B(c00913pS);
            anonymousClass2445._deserializationConfig = (C26L) anonymousClass2445._deserializationConfig.A0B(c00913pS);
        }
        HashMap hashMap = r0._mixins;
        if (hashMap != null) {
            Iterator A0x = AnonymousClass001.A0x(hashMap);
            while (A0x.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0x);
                Class cls = (Class) A0z.getKey();
                Object value = A0z.getValue();
                C25a c25a = ((C28d) c28e).A00._mixIns;
                java.util.Map map = c25a._localMixIns;
                if (map == null) {
                    map = AnonymousClass001.A0u();
                    c25a._localMixIns = map;
                }
                map.put(new Liw(cls), value);
            }
        }
    }
}
