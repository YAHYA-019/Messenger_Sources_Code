package com.facebook.abtest.qe.protocol.sync.user;

import X.4YV;
import X.AbJ;
import X.AnonymousClass001;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Map;

/* loaded from: SyncQuickExperimentUserInfoResult.class */
public final class SyncQuickExperimentUserInfoResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGo(51);
    public final ImmutableMap A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public SyncQuickExperimentUserInfoResult(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A05 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A04 = AbJ.A1W(parcel);
        this.A03 = parcel.readString();
        this.A00 = ImmutableMap.copyOf((Map) parcel.readHashMap(SyncQuickExperimentUserInfoResult.class.getClassLoader()));
    }

    public SyncQuickExperimentUserInfoResult(ImmutableMap immutableMap, String str, String str2, String str3, boolean z, boolean z2) {
        this.A01 = str;
        this.A02 = str2;
        this.A04 = z2;
        this.A05 = z;
        this.A03 = str3;
        this.A00 = ImmutableMap.copyOf((Map) immutableMap);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof SyncQuickExperimentUserInfoResult) {
            SyncQuickExperimentUserInfoResult syncQuickExperimentUserInfoResult = (SyncQuickExperimentUserInfoResult) obj;
            if (Objects.equal(this.A01, syncQuickExperimentUserInfoResult.A01) && Objects.equal(this.A02, syncQuickExperimentUserInfoResult.A02) && this.A05 == syncQuickExperimentUserInfoResult.A05 && this.A04 == syncQuickExperimentUserInfoResult.A04 && Objects.equal(this.A03, syncQuickExperimentUserInfoResult.A03)) {
                z = 4YV.A1Z(this.A00, ImmutableMap.copyOf((Map) syncQuickExperimentUserInfoResult.A00));
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02, Boolean.valueOf(this.A05), Boolean.valueOf(this.A04), this.A03, this.A00});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A03);
        parcel.writeMap(this.A00);
    }
}
