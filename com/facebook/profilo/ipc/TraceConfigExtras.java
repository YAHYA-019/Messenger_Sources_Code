package com.facebook.profilo.ipc;

import X.0qE;
import X.AnonymousClass001;
import X.C0ld;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.profilo.config.ConfigParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: TraceConfigExtras.class */
public final class TraceConfigExtras implements Parcelable {
    public static final TraceConfigExtras A07 = new TraceConfigExtras(null, null, null, null, null);
    public static final Parcelable.Creator CREATOR = new 0qE(3);
    public final int A00;
    public final C0ld A01;
    public final TreeMap A02;
    public final TreeMap A03;
    public final TreeMap A04;
    public final TreeMap A05;
    public final TreeMap A06;

    public TraceConfigExtras(C0ld c0ld, int i) {
        this.A01 = c0ld;
        this.A00 = i;
        this.A04 = null;
        this.A03 = null;
        this.A02 = null;
        this.A05 = null;
        this.A06 = null;
    }

    public TraceConfigExtras(Parcel parcel) {
        this.A01 = null;
        this.A00 = -1;
        Class<?> cls = getClass();
        Bundle readBundle = parcel.readBundle(cls.getClassLoader());
        Set<String> keySet = readBundle.keySet();
        if (keySet.isEmpty()) {
            this.A04 = null;
        } else {
            this.A04 = new TreeMap();
            Iterator<String> it = keySet.iterator();
            while (it.hasNext()) {
                String A0i = AnonymousClass001.A0i(it);
                AnonymousClass001.A1A(A0i, this.A04, readBundle.getInt(A0i));
            }
        }
        Bundle readBundle2 = parcel.readBundle(cls.getClassLoader());
        Set<String> keySet2 = readBundle2.keySet();
        if (keySet2.isEmpty()) {
            this.A02 = null;
        } else {
            this.A02 = new TreeMap();
            Iterator<String> it2 = keySet2.iterator();
            while (it2.hasNext()) {
                String A0i2 = AnonymousClass001.A0i(it2);
                this.A02.put(A0i2, Boolean.valueOf(readBundle2.getBoolean(A0i2)));
            }
        }
        Bundle readBundle3 = parcel.readBundle(cls.getClassLoader());
        Set<String> keySet3 = readBundle3.keySet();
        if (keySet3.isEmpty()) {
            this.A03 = null;
        } else {
            this.A03 = new TreeMap();
            Iterator<String> it3 = keySet3.iterator();
            while (it3.hasNext()) {
                String A0i3 = AnonymousClass001.A0i(it3);
                this.A03.put(A0i3, readBundle3.getIntArray(A0i3));
            }
        }
        Bundle readBundle4 = parcel.readBundle(cls.getClassLoader());
        Set<String> keySet4 = readBundle4.keySet();
        if (keySet4.isEmpty()) {
            this.A05 = null;
        } else {
            this.A05 = new TreeMap();
            Iterator<String> it4 = keySet4.iterator();
            while (it4.hasNext()) {
                String A0i4 = AnonymousClass001.A0i(it4);
                this.A05.put(A0i4, readBundle4.getStringArrayList(A0i4));
            }
        }
        Bundle readBundle5 = parcel.readBundle(cls.getClassLoader());
        Set<String> keySet5 = readBundle5.keySet();
        if (keySet5.isEmpty()) {
            this.A06 = null;
            return;
        }
        this.A06 = new TreeMap();
        Iterator<String> it5 = keySet5.iterator();
        while (it5.hasNext()) {
            String A0i5 = AnonymousClass001.A0i(it5);
            this.A06.put(A0i5, new String(readBundle5.getCharArray(A0i5)));
        }
    }

    public TraceConfigExtras(TreeMap treeMap, TreeMap treeMap2, TreeMap treeMap3, TreeMap treeMap4, TreeMap treeMap5) {
        this.A04 = treeMap;
        this.A02 = treeMap2;
        this.A03 = treeMap3;
        this.A05 = treeMap4;
        this.A06 = treeMap5;
        this.A01 = null;
        this.A00 = -1;
    }

    public int A00(String str, int i) {
        Number number;
        C0ld c0ld = this.A01;
        if (c0ld != null) {
            return c0ld.optTraceConfigParamInt(this.A00, str, i);
        }
        TreeMap treeMap = this.A04;
        if (treeMap != null && (number = (Number) treeMap.get(str)) != null) {
            i = number.intValue();
        }
        return i;
    }

    public String A01(String str) {
        String str2;
        C0ld c0ld = this.A01;
        if (c0ld != null) {
            return c0ld.optTraceConfigParamString(this.A00, str, null);
        }
        TreeMap treeMap = this.A06;
        if (treeMap == null || (str2 = (String) treeMap.get(str)) == null) {
            return null;
        }
        return str2;
    }

    public boolean A02(String str, boolean z) {
        Boolean bool;
        C0ld c0ld = this.A01;
        if (c0ld != null) {
            return c0ld.optTraceConfigParamBool(this.A00, str, z);
        }
        TreeMap treeMap = this.A02;
        if (treeMap != null && (bool = (Boolean) treeMap.get(str)) != null) {
            z = bool.booleanValue();
        }
        return z;
    }

    public int[] A03(String str) {
        C0ld c0ld = this.A01;
        if (c0ld != null) {
            return c0ld.optTraceConfigParamIntList(this.A00, str);
        }
        TreeMap treeMap = this.A03;
        if (treeMap == null) {
            return null;
        }
        return (int[]) treeMap.get(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C0ld c0ld;
        TreeMap treeMap = this.A04;
        TreeMap treeMap2 = this.A02;
        TreeMap treeMap3 = this.A03;
        TreeMap treeMap4 = this.A05;
        TreeMap treeMap5 = this.A06;
        int i2 = this.A00;
        if (i2 >= 0 && (c0ld = this.A01) != null) {
            ConfigParams traceConfigParams = c0ld.getTraceConfigParams(i2);
            treeMap = traceConfigParams.intParams;
            treeMap2 = traceConfigParams.boolParams;
            treeMap3 = traceConfigParams.intListParams;
        }
        Bundle bundle = new Bundle();
        if (treeMap != null) {
            Iterator A0x = AnonymousClass001.A0x(treeMap);
            while (A0x.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0x);
                bundle.putInt(AnonymousClass001.A0j(A0z), AnonymousClass001.A03(A0z.getValue()));
            }
        }
        parcel.writeBundle(bundle);
        Bundle bundle2 = new Bundle();
        if (treeMap2 != null) {
            Iterator A0x2 = AnonymousClass001.A0x(treeMap2);
            while (A0x2.hasNext()) {
                Map.Entry A0z2 = AnonymousClass001.A0z(A0x2);
                bundle2.putBoolean(AnonymousClass001.A0j(A0z2), AnonymousClass001.A1V(A0z2.getValue()));
            }
        }
        parcel.writeBundle(bundle2);
        Bundle bundle3 = new Bundle();
        if (treeMap3 != null) {
            Iterator A0x3 = AnonymousClass001.A0x(treeMap3);
            while (A0x3.hasNext()) {
                Map.Entry A0z3 = AnonymousClass001.A0z(A0x3);
                bundle3.putIntArray(AnonymousClass001.A0j(A0z3), (int[]) A0z3.getValue());
            }
        }
        parcel.writeBundle(bundle3);
        Bundle bundle4 = new Bundle();
        if (treeMap4 != null) {
            Iterator A0x4 = AnonymousClass001.A0x(treeMap4);
            while (A0x4.hasNext()) {
                Map.Entry A0z4 = AnonymousClass001.A0z(A0x4);
                bundle4.putStringArrayList(AnonymousClass001.A0j(A0z4), (ArrayList) A0z4.getValue());
            }
        }
        parcel.writeBundle(bundle4);
        Bundle bundle5 = new Bundle();
        if (treeMap5 != null) {
            Iterator A0x5 = AnonymousClass001.A0x(treeMap5);
            while (A0x5.hasNext()) {
                Map.Entry A0z5 = AnonymousClass001.A0z(A0x5);
                bundle5.putCharArray(AnonymousClass001.A0j(A0z5), ((String) A0z5.getValue()).toCharArray());
            }
        }
        parcel.writeBundle(bundle5);
    }
}
