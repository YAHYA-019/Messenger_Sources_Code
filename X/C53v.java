package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Absent;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.53v, reason: invalid class name */
/* loaded from: 53v.class */
public final class C53v {
    public static Optional A00(Parcel parcel, Class cls) {
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return null;
        }
        if (readInt == 1) {
            return Absent.INSTANCE;
        }
        if (readInt == 2) {
            return Optional.of(1BL.A0C(parcel, cls));
        }
        throw 4YV.A0h("Invalid state of the parcel to read Optional from: ", readInt);
    }

    public static ImmutableList A01(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        return ImmutableList.copyOf((Collection) arrayList);
    }

    public static ImmutableList A02(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 1) {
            return null;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        parcel.readTypedList(A0s, creator);
        return ImmutableList.copyOf((Collection) A0s);
    }

    public static ImmutableList A03(Parcel parcel, Class cls) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Enum.valueOf(cls, (String) it.next()));
        }
        return ImmutableList.copyOf((Collection) arrayList2);
    }

    public static ImmutableList A04(Parcel parcel, Class cls) {
        ArrayList readArrayList = parcel.readArrayList(cls.getClassLoader());
        if (readArrayList != null) {
            return ImmutableList.copyOf((Collection) readArrayList);
        }
        return null;
    }

    public static ImmutableMap A05(Parcel parcel) {
        HashMap hashMap = new HashMap();
        parcel.readMap(hashMap, C53v.class.getClassLoader());
        return ImmutableMap.copyOf((java.util.Map) hashMap);
    }

    public static ImmutableSet A06(Parcel parcel, ClassLoader classLoader) {
        ArrayList readArrayList = parcel.readArrayList(classLoader);
        if (readArrayList == null) {
            return null;
        }
        return ImmutableSet.A07(C1n3.A04(readArrayList));
    }

    public static Enum A07(Parcel parcel, Class cls) {
        String readString = parcel.readString();
        if (readString == null) {
            return null;
        }
        return Enum.valueOf(cls, readString);
    }

    public static Integer A08(Parcel parcel) {
        if (parcel.readInt() == 1) {
            return Integer.valueOf(parcel.readInt());
        }
        return null;
    }

    public static Object A09(Parcel parcel) {
        return parcel.readValue(C53v.class.getClassLoader());
    }

    public static void A0A(Parcel parcel, 24X r302) {
        parcel.writeString(r302 == null ? null : r302.toString());
    }

    public static void A0B(Parcel parcel, Optional optional, int i) {
        int i2;
        if (optional == null) {
            i2 = 0;
        } else {
            i2 = 1;
            if (optional.isPresent()) {
                parcel.writeInt(2);
                parcel.writeParcelable((Parcelable) optional.get(), i);
                return;
            }
        }
        parcel.writeInt(i2);
    }

    public static void A0C(Parcel parcel, ImmutableList immutableList) {
        ArrayList arrayList = new ArrayList();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            arrayList.add(((Enum) it.next()).name());
        }
        parcel.writeStringList(arrayList);
    }

    public static void A0D(Parcel parcel, ImmutableList immutableList) {
        boolean A1U = AnonymousClass001.A1U(immutableList);
        parcel.writeInt(A1U ? 1 : 0);
        if (!A1U) {
            parcel.writeTypedList(immutableList);
        }
    }

    public static void A0E(Parcel parcel, 1Mu r302) {
        HashMap hashMap = new HashMap();
        A0N(parcel, hashMap);
        for (Map.Entry entry : hashMap.entrySet()) {
            r302.Ca1((Iterable) entry.getValue(), entry.getKey());
        }
    }

    public static void A0F(Parcel parcel, 1Mu r302) {
        int readInt = parcel.readInt();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= readInt) {
                return;
            }
            Parcelable A0C = 1BL.A0C(parcel, C53v.class);
            ArrayList A0s = AnonymousClass001.A0s();
            parcel.readList(A0s, C53v.class.getClassLoader());
            r302.Ca1(A0s, A0C);
            i = i2 + 1;
        }
    }

    public static void A0G(Parcel parcel, 1Mu r302) {
        HashMap A0u = AnonymousClass001.A0u();
        Iterator A0y = AnonymousClass001.A0y(r302.AAK());
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            A0u.put(A0z.getKey(), 1BK.A17((Collection) A0z.getValue()));
        }
        A0P(parcel, A0u);
    }

    public static void A0H(Parcel parcel, 1Mu r302) {
        java.util.Map AAK = r302.AAK();
        parcel.writeInt(AAK.size());
        Iterator A0y = AnonymousClass001.A0y(AAK);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            parcel.writeParcelable((Parcelable) A0z.getKey(), 0);
            parcel.writeList(1JW.A02((Iterable) A0z.getValue()));
        }
    }

    public static void A0I(Parcel parcel, Boolean bool) {
        int i;
        if (bool == null) {
            i = 0;
        } else {
            parcel.writeInt(1);
            i = bool.booleanValue() ? 1 : 0;
        }
        parcel.writeInt(i);
    }

    public static void A0J(Parcel parcel, Enum r302) {
        parcel.writeString(r302 == null ? null : r302.name());
    }

    public static void A0K(Parcel parcel, Integer num) {
        int intValue;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }

    public static void A0L(Parcel parcel, Long l) {
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public static void A0M(Parcel parcel, List list) {
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeStringList(list);
        }
    }

    public static void A0N(Parcel parcel, java.util.Map map) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Bundle readBundle = parcel.readBundle(C53v.class.getClassLoader());
        if (readBundle == null || readBundle.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            map.put(str, readBundle.getParcelableArrayList(str));
        }
    }

    public static void A0O(Parcel parcel, java.util.Map map) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        parcel.readStringList(arrayList);
        parcel.readStringList(arrayList2);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= arrayList.size()) {
                return;
            }
            map.put(arrayList.get(i2), arrayList2.get(i2));
            i = i2 + 1;
        }
    }

    public static void A0P(Parcel parcel, java.util.Map map) {
        Bundle A05 = 1BK.A05();
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            String A0j = AnonymousClass001.A0j(A0z);
            A0s.add(A0j);
            A05.putParcelableArrayList(A0j, (ArrayList) A0z.getValue());
        }
        parcel.writeStringList(A0s);
        parcel.writeBundle(A05);
    }

    public static void A0Q(Parcel parcel, java.util.Map map) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (map != null) {
            for (Object obj : map.keySet()) {
                arrayList.add(obj);
                arrayList2.add(map.get(obj));
            }
        }
        parcel.writeStringList(arrayList);
        parcel.writeStringList(arrayList2);
    }

    public static void A0R(Parcel parcel, Set set) {
        ArrayList A0s;
        if (set == null) {
            A0s = null;
        } else {
            A0s = AnonymousClass001.A0s();
            A0s.addAll(set);
        }
        parcel.writeList(A0s);
    }

    public static boolean A0S(Parcel parcel) {
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        return z;
    }
}
