package X;

import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: M9h.class */
public final class M9h extends 5cK {
    public final 0BZ A00;
    public final SerialDescriptor A01;

    public M9h(0BZ r302, 5Yu r303) {
        super(r303);
        this.A00 = r302;
        SerialDescriptor descriptor = r303.getDescriptor();
        11T.A0F(descriptor, 1);
        this.A01 = new 5cM(descriptor);
    }

    public /* bridge */ /* synthetic */ int A01(Object obj) {
        Object[] objArr = (Object[]) obj;
        11T.A0F(objArr, 0);
        return objArr.length;
    }

    public /* bridge */ /* synthetic */ Object A02(Object obj) {
        return 1BK.A17(JR0.A0x((Object[]) obj));
    }

    public /* bridge */ /* synthetic */ int A04(Object obj) {
        AbstractCollection abstractCollection = (AbstractCollection) obj;
        11T.A0F(abstractCollection, 0);
        return abstractCollection.size();
    }

    public /* bridge */ /* synthetic */ Object A05() {
        return AnonymousClass001.A0s();
    }

    public /* bridge */ /* synthetic */ Object A06(Object obj) {
        AbstractCollection abstractCollection = (AbstractCollection) obj;
        11T.A0F(abstractCollection, 0);
        0BZ r0 = this.A00;
        11T.A0F(r0, 1);
        Object newInstance = Array.newInstance((Class<?>) C11e.A00(r0), abstractCollection.size());
        11T.A0I(newInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = abstractCollection.toArray((Object[]) newInstance);
        11T.A0A(array);
        return array;
    }

    public /* bridge */ /* synthetic */ Iterator A07(Object obj) {
        Object[] objArr = (Object[]) obj;
        11T.A0F(objArr, 0);
        return new 0AR(objArr);
    }

    public /* bridge */ /* synthetic */ void A08(Object obj, int i, Object obj2) {
        AbstractList abstractList = (AbstractList) obj;
        11T.A0F(abstractList, 0);
        abstractList.add(i, obj2);
    }

    public SerialDescriptor getDescriptor() {
        return this.A01;
    }
}
