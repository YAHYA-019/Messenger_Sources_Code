package X;

import com.google.common.base.Equivalence;
import com.google.common.base.Preconditions;
import com.google.common.collect.MapMaker$Dummy;
import com.google.common.collect.MapMakerInternalMap;

/* renamed from: X.3Nl, reason: invalid class name */
/* loaded from: 3Nl.class */
public final class C3Nl {
    public final MapMakerInternalMap A00;

    public C3Nl(1pU r302) {
        MapMakerInternalMap.Strength strength;
        LfF lfF;
        MapMakerInternalMap.Strength strength2;
        Equivalence.Equals equals = Equivalence.Equals.INSTANCE;
        Equivalence equivalence = r302.A02;
        Preconditions.checkState(AnonymousClass001.A1U(equivalence), "key equivalence was already set to %s", equivalence);
        equals.getClass();
        r302.A02 = equals;
        r302.A05 = true;
        MapMakerInternalMap.Strength strength3 = r302.A03;
        MapMakerInternalMap.Strength strength4 = MapMakerInternalMap.Strength.A00;
        if ((strength3 == null || strength3 == strength4) && ((strength = r302.A04) == null || strength == strength4)) {
            lfF = LfD.A00;
        } else {
            strength3 = strength3 == null ? strength4 : strength3;
            MapMakerInternalMap.Strength strength5 = MapMakerInternalMap.Strength.A01;
            if (strength3 != strength5 || ((strength2 = r302.A04) != null && strength2 != strength4)) {
                MapMakerInternalMap.Strength strength6 = r302.A04;
                if (strength6 != null && strength6 == strength5) {
                    throw AnonymousClass001.A0L("Map cannot have both weak and dummy values");
                }
                throw new AssertionError();
            }
            lfF = LfF.A00;
        }
        this.A00 = new MapMakerInternalMap(r302, lfF);
    }

    public Object A00(Object obj) {
        MapMakerInternalMap mapMakerInternalMap;
        Object key;
        do {
            mapMakerInternalMap = this.A00;
            if (obj != null) {
                int A00 = MapMakerInternalMap.A00(mapMakerInternalMap, obj);
                1vG A03 = MapMakerInternalMap.A01(mapMakerInternalMap, A00).A03(obj, A00);
                if (A03 != null && (key = A03.getKey()) != null) {
                    return key;
                }
            }
        } while (mapMakerInternalMap.putIfAbsent(obj, MapMaker$Dummy.A01) != null);
        return obj;
    }
}
