package X;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: M9j.class */
public final class M9j extends 5cJ {
    public final SerialDescriptor A00;

    public M9j(5Yu r302) {
        super(r302);
        SerialDescriptor descriptor = r302.getDescriptor();
        11T.A0F(descriptor, 1);
        this.A00 = new 5cM(descriptor);
    }

    public /* bridge */ /* synthetic */ Object A02(Object obj) {
        Collection collection = (Collection) obj;
        11T.A0F(collection, 0);
        return collection instanceof LinkedHashSet ? collection : new LinkedHashSet(collection);
    }

    public /* bridge */ /* synthetic */ int A04(Object obj) {
        AbstractCollection abstractCollection = (AbstractCollection) obj;
        11T.A0F(abstractCollection, 0);
        return abstractCollection.size();
    }

    public /* bridge */ /* synthetic */ Object A05() {
        return 7zL.A15();
    }

    public /* bridge */ /* synthetic */ Object A06(Object obj) {
        11T.A0F(obj, 0);
        return obj;
    }

    public /* bridge */ /* synthetic */ void A08(Object obj, int i, Object obj2) {
        AbstractCollection abstractCollection = (AbstractCollection) obj;
        11T.A0F(abstractCollection, 0);
        abstractCollection.add(obj2);
    }

    public SerialDescriptor getDescriptor() {
        return this.A00;
    }
}
