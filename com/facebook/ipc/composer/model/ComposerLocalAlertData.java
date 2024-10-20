package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.AbH;
import X.AbI;
import X.AbL;
import X.AbN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKE;
import X.DKH;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: ComposerLocalAlertData.class */
public final class ComposerLocalAlertData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(35);
    public final int A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final ImmutableMap A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public ComposerLocalAlertData(Parcel parcel) {
        ImmutableList immutableList = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        int i = 0;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            int readInt = parcel.readInt();
            Integer[] numArr = new Integer[readInt];
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= readInt) {
                    break;
                }
                numArr[i3] = AbI.A0z(parcel);
                i2 = i3 + 1;
            }
            this.A01 = ImmutableList.copyOf(numArr);
        }
        this.A00 = parcel.readInt();
        HashMap A0u = AnonymousClass001.A0u();
        int readInt2 = parcel.readInt();
        int i4 = 0;
        while (i4 < readInt2) {
            i4 = AbL.A01(parcel, A0u, i4);
        }
        this.A03 = ImmutableMap.copyOf((Map) A0u);
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        this.A09 = AbN.A1U(parcel);
        if (parcel.readInt() != 0) {
            int readInt3 = parcel.readInt();
            String[] strArr = new String[readInt3];
            while (i < readInt3) {
                i = AbH.A00(parcel, strArr, i);
            }
            immutableList = ImmutableList.copyOf(strArr);
        }
        this.A02 = immutableList;
    }

    public ComposerLocalAlertData(ImmutableList immutableList, ImmutableList immutableList2, ImmutableMap immutableMap, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        this.A04 = str;
        this.A05 = str2;
        this.A01 = immutableList;
        this.A00 = i;
        C1pq.A08("geoAreas", immutableMap);
        this.A03 = immutableMap;
        this.A06 = str3;
        this.A07 = str4;
        this.A08 = str5;
        this.A09 = z;
        this.A02 = immutableList2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerLocalAlertData)) {
                return false;
            }
            ComposerLocalAlertData composerLocalAlertData = (ComposerLocalAlertData) obj;
            if (!11T.A0O(this.A04, composerLocalAlertData.A04) || !11T.A0O(this.A05, composerLocalAlertData.A05) || !11T.A0O(this.A01, composerLocalAlertData.A01) || this.A00 != composerLocalAlertData.A00 || !11T.A0O(this.A03, composerLocalAlertData.A03) || !11T.A0O(this.A06, composerLocalAlertData.A06) || !11T.A0O(this.A07, composerLocalAlertData.A07) || !11T.A0O(this.A08, composerLocalAlertData.A08) || this.A09 != composerLocalAlertData.A09 || !11T.A0O(this.A02, composerLocalAlertData.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A02(C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A03, (C1pq.A04(this.A01, C1pq.A04(this.A05, C1pq.A03(this.A04))) * 31) + this.A00)))), this.A09));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        ImmutableList immutableList = this.A01;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                parcel.writeInt(DKE.A0F(A0Y));
            }
        }
        parcel.writeInt(this.A00);
        1Du A0g = DKH.A0g(parcel, this.A03);
        while (A0g.hasNext()) {
            AbL.A0n(parcel, A0g);
        }
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A07);
        1BL.A13(parcel, this.A08);
        parcel.writeInt(this.A09 ? 1 : 0);
        ImmutableList immutableList2 = this.A02;
        if (immutableList2 == null) {
            parcel.writeInt(0);
            return;
        }
        1Du A0Y2 = AbL.A0Y(parcel, immutableList2);
        while (A0Y2.hasNext()) {
            C3o5.A0h(parcel, A0Y2);
        }
    }
}
