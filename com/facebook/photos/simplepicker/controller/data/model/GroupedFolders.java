package com.facebook.photos.simplepicker.controller.data.model;

import X.11T;
import X.1BK;
import X.1Du;
import X.1Fj;
import X.4YV;
import X.AbI;
import X.AbL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: GroupedFolders.class */
public final class GroupedFolders implements Parcelable {
    public static volatile ImmutableList A03;
    public static volatile ImmutableMap A04;
    public static final Parcelable.Creator CREATOR = FKW.A00(31);
    public final ImmutableList A00;
    public final ImmutableMap A01;
    public final Set A02;

    public GroupedFolders(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        ImmutableMap immutableMap = null;
        int i = 0;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            int readInt = parcel.readInt();
            Folder[] folderArr = new Folder[readInt];
            int i2 = 0;
            while (i2 < readInt) {
                i2 = AbI.A01(parcel, A0e, folderArr, i2);
            }
            this.A00 = ImmutableList.copyOf(folderArr);
        }
        if (parcel.readInt() != 0) {
            HashMap A0u = AnonymousClass001.A0u();
            int readInt2 = parcel.readInt();
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= readInt2) {
                    break;
                }
                A0u.put(parcel.readString(), parcel.readParcelable(A0e));
                i3 = i4 + 1;
            }
            immutableMap = ImmutableMap.copyOf((Map) A0u);
        }
        this.A01 = immutableMap;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt3 = parcel.readInt();
        while (i < readInt3) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A02 = Collections.unmodifiableSet(A0v);
    }

    public GroupedFolders(ImmutableList immutableList, ImmutableMap immutableMap, Set set) {
        this.A00 = immutableList;
        this.A01 = immutableMap;
        this.A02 = Collections.unmodifiableSet(set);
    }

    public ImmutableList A00() {
        if (this.A02.contains("folders")) {
            return this.A00;
        }
        if (A03 == null) {
            synchronized (this) {
                if (A03 == null) {
                    A03 = 1Fj.A01(ImmutableList.builder());
                }
            }
        }
        return A03;
    }

    public ImmutableMap A01() {
        if (this.A02.contains("groupedFolders")) {
            return this.A01;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    ImmutableMap build = 1BK.A0c().build();
                    11T.A0A(build);
                    A04 = build;
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
            if (!(obj instanceof GroupedFolders)) {
                return false;
            }
            GroupedFolders groupedFolders = (GroupedFolders) obj;
            if (!11T.A0O(A00(), groupedFolders.A00()) || !11T.A0O(A01(), groupedFolders.A01())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(A01(), C1pq.A03(A00()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                parcel.writeParcelable((Folder) A0Y.next(), i);
            }
        }
        ImmutableMap immutableMap = this.A01;
        if (immutableMap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0g = DKH.A0g(parcel, immutableMap);
            while (A0g.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0g);
                parcel.writeString(AnonymousClass001.A0j(A0z));
                parcel.writeParcelable((Parcelable) A0z.getValue(), i);
            }
        }
        Iterator A0S = C3o5.A0S(parcel, this.A02);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
