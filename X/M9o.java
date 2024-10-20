package X;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: M9o.class */
public final class M9o extends 5ZS {
    public final SerialDescriptor A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M9o(5Yu r302, 5Yu r303) {
        super(r302, r303);
        int A05 = 7zP.A05(r302, r303, 1);
        SerialDescriptor descriptor = r302.getDescriptor();
        SerialDescriptor descriptor2 = r303.getDescriptor();
        11T.A0F(descriptor, 1);
        11T.A0F(descriptor2, A05);
        this.A00 = new 5ZV("kotlin.collections.HashMap", descriptor, descriptor2);
    }

    public /* bridge */ /* synthetic */ int A01(Object obj) {
        java.util.Map map = (java.util.Map) obj;
        11T.A0F(map, 0);
        return map.size();
    }

    public /* bridge */ /* synthetic */ Object A02(Object obj) {
        java.util.Map map = (java.util.Map) obj;
        11T.A0F(map, 0);
        if (!(map instanceof HashMap)) {
            map = DKC.A1C(map);
        }
        return map;
    }

    public /* bridge */ /* synthetic */ int A04(Object obj) {
        AbstractMap abstractMap = (AbstractMap) obj;
        11T.A0F(abstractMap, 0);
        return abstractMap.size() * 2;
    }

    public /* bridge */ /* synthetic */ Object A05() {
        return AnonymousClass001.A0u();
    }

    public /* bridge */ /* synthetic */ Object A06(Object obj) {
        11T.A0F(obj, 0);
        return obj;
    }

    public /* bridge */ /* synthetic */ Iterator A07(Object obj) {
        java.util.Map map = (java.util.Map) obj;
        11T.A0F(map, 0);
        return AnonymousClass001.A0y(map);
    }

    public SerialDescriptor getDescriptor() {
        return this.A00;
    }
}
