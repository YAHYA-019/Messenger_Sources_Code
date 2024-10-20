package X;

import java.util.AbstractMap;

/* loaded from: K71.class */
public final class K71 extends K75 {
    public final /* synthetic */ K77 zza;

    public K71(K77 k77) {
        this.zza = k77;
    }

    @Override // X.Ly5
    public final boolean A09() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.zza.A00;
        LBh.A01(i, i2);
        objArr = this.zza.A02;
        int i3 = i + i;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = this.zza.A02;
        Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.zza.A00;
        return i;
    }
}
