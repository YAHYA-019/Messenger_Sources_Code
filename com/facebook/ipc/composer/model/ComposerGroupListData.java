package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YT;
import X.AbH;
import X.AbL;
import X.AbN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: ComposerGroupListData.class */
public final class ComposerGroupListData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(26);
    public final ImmutableList A00;
    public final ImmutableMap A01;
    public final Boolean A02;
    public final String A03;
    public final String A04;

    public ComposerGroupListData(Parcel parcel) {
        Boolean bool = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            HashMap A0u = AnonymousClass001.A0u();
            int readInt = parcel.readInt();
            int i = 0;
            while (i < readInt) {
                i = AbL.A01(parcel, A0u, i);
            }
            this.A01 = ImmutableMap.copyOf((Map) A0u);
        }
        this.A03 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            int readInt2 = parcel.readInt();
            String[] strArr = new String[readInt2];
            int i2 = 0;
            while (i2 < readInt2) {
                i2 = AbH.A00(parcel, strArr, i2);
            }
            this.A00 = ImmutableList.copyOf(strArr);
        }
        this.A02 = parcel.readInt() != 0 ? Boolean.valueOf(DKH.A1W(parcel)) : bool;
        this.A04 = C3o5.A0O(parcel);
    }

    public ComposerGroupListData(ImmutableList immutableList, ImmutableMap immutableMap, Boolean bool, String str, String str2) {
        this.A01 = immutableMap;
        C1pq.A08(4YT.A00(ActionId.HEADER_DATA_LOADED), str);
        this.A03 = str;
        this.A00 = immutableList;
        this.A02 = bool;
        this.A04 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerGroupListData)) {
                return false;
            }
            ComposerGroupListData composerGroupListData = (ComposerGroupListData) obj;
            if (!11T.A0O(this.A01, composerGroupListData.A01) || !11T.A0O(this.A03, composerGroupListData.A03) || !11T.A0O(this.A00, composerGroupListData.A00) || !11T.A0O(this.A02, composerGroupListData.A02) || !11T.A0O(this.A04, composerGroupListData.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A02, C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A03(this.A01)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableMap immutableMap = this.A01;
        if (immutableMap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0g = DKH.A0g(parcel, immutableMap);
            while (A0g.hasNext()) {
                AbL.A0n(parcel, A0g);
            }
        }
        parcel.writeString(this.A03);
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                C3o5.A0h(parcel, A0Y);
            }
        }
        AbN.A0s(parcel, this.A02);
        1BL.A13(parcel, this.A04);
    }
}
