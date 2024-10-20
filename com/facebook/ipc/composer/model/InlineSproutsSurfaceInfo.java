package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.3EM;
import X.4YV;
import X.7zN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: InlineSproutsSurfaceInfo.class */
public final class InlineSproutsSurfaceInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(92);
    public final ImmutableList A00;
    public final ImmutableMap A01;
    public final String A02;
    public final String A03;

    public InlineSproutsSurfaceInfo(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A02 = parcel.readInt() != 0 ? parcel.readString() : null;
        HashMap A0u = AnonymousClass001.A0u();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            A0u.put(3EM.values()[parcel.readInt()], parcel.readParcelable(A0e));
        }
        this.A01 = ImmutableMap.copyOf((Map) A0u);
        this.A03 = C3o5.A0O(parcel);
        int readInt2 = parcel.readInt();
        3EM[] r0 = new 3EM[readInt2];
        for (int i2 = 0; i2 < readInt2; i2++) {
            r0[i2] = 3EM.values()[parcel.readInt()];
        }
        this.A00 = ImmutableList.copyOf(r0);
    }

    public InlineSproutsSurfaceInfo(ImmutableList immutableList, ImmutableMap immutableMap, String str, String str2) {
        this.A02 = str;
        C1pq.A08("sproutMetadata", immutableMap);
        this.A01 = immutableMap;
        this.A03 = str2;
        C1pq.A08("sprouts", immutableList);
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InlineSproutsSurfaceInfo)) {
                return false;
            }
            InlineSproutsSurfaceInfo inlineSproutsSurfaceInfo = (InlineSproutsSurfaceInfo) obj;
            if (!11T.A0O(this.A02, inlineSproutsSurfaceInfo.A02) || !11T.A0O(this.A01, inlineSproutsSurfaceInfo.A01) || !11T.A0O(this.A03, inlineSproutsSurfaceInfo.A03) || !11T.A0O(this.A00, inlineSproutsSurfaceInfo.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A04(this.A01, C1pq.A03(this.A02))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A02);
        1Du A0g = DKH.A0g(parcel, this.A01);
        while (A0g.hasNext()) {
            Map.Entry entry = (Map.Entry) A0g.next();
            7zN.A0z(parcel, (3EM) entry.getKey());
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
        1BL.A13(parcel, this.A03);
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            7zN.A0z(parcel, (3EM) A0b.next());
        }
    }
}
