package com.facebook.xapp.messaging.threadview.theme.custom.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.2Gq;
import X.2Gs;
import X.2xJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C20r;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: CompositeThreadThemeInfo.class */
public final class CompositeThreadThemeInfo implements Parcelable, C20r {
    public static volatile ThreadThemeInfo A04;
    public static final Parcelable.Creator CREATOR = new C2xc(69);
    public final ThreadThemeInfo A00;
    public final ImmutableMap A01;
    public final ThreadThemeInfo A02;
    public final Set A03;

    public CompositeThreadThemeInfo(2Gq r302) {
        this.A00 = r302.A00;
        this.A02 = r302.A01;
        ImmutableMap immutableMap = r302.A02;
        C1pq.A08("themeVariantMap", immutableMap);
        this.A01 = immutableMap;
        this.A03 = Collections.unmodifiableSet(r302.A03);
    }

    public CompositeThreadThemeInfo(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        ThreadThemeInfo threadThemeInfo = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (ThreadThemeInfo) parcel.readParcelable(classLoader);
        }
        this.A02 = parcel.readInt() != 0 ? (ThreadThemeInfo) parcel.readParcelable(classLoader) : threadThemeInfo;
        HashMap hashMap = new HashMap();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            hashMap.put(parcel.readString(), parcel.readParcelable(classLoader));
        }
        this.A01 = ImmutableMap.copyOf((Map) hashMap);
        HashSet hashSet = new HashSet();
        int readInt2 = parcel.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            hashSet.add(parcel.readString());
        }
        this.A03 = Collections.unmodifiableSet(hashSet);
    }

    public ThreadThemeInfo A00() {
        if (this.A03.contains("normalTheme")) {
            return this.A02;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    2xJ r0 = 2Gs.A00;
                    A04 = 2xJ.A00;
                }
            }
        }
        return A04;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CompositeThreadThemeInfo)) {
                return false;
            }
            CompositeThreadThemeInfo compositeThreadThemeInfo = (CompositeThreadThemeInfo) obj;
            if (!11T.A0O(this.A00, compositeThreadThemeInfo.A00) || !11T.A0O(A00(), compositeThreadThemeInfo.A00()) || !11T.A0O(this.A01, compositeThreadThemeInfo.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(A00(), C1pq.A04(this.A00, 1)));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CompositeThreadThemeInfo{darkTheme=");
        A0k.append(this.A00);
        A0k.append(", normalTheme=");
        A0k.append(A00());
        A0k.append(", themeVariantMap=");
        A0k.append(this.A01);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ThreadThemeInfo threadThemeInfo = this.A00;
        if (threadThemeInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(threadThemeInfo, i);
        }
        ThreadThemeInfo threadThemeInfo2 = this.A02;
        if (threadThemeInfo2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(threadThemeInfo2, i);
        }
        ImmutableMap immutableMap = this.A01;
        parcel.writeInt(immutableMap.size());
        1Du it = immutableMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(it);
            parcel.writeString(AnonymousClass001.A0j(A0z));
            parcel.writeParcelable((Parcelable) A0z.getValue(), i);
        }
        Set set = this.A03;
        parcel.writeInt(set.size());
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            parcel.writeString((String) it2.next());
        }
    }
}
