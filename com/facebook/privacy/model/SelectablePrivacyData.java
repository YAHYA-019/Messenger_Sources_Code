package com.facebook.privacy.model;

import X.1BL;
import X.C53v;
import X.EXR;
import X.FJ8;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.privacy.uafprivacyoption.UAFPrivacyOption;
import com.google.common.base.Objects;
import java.util.Arrays;

/* loaded from: SelectablePrivacyData.class */
public final class SelectablePrivacyData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(62);
    public final PrivacyOptionsResult A00;
    public final UAFPrivacyOption A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public SelectablePrivacyData(Parcel parcel) {
        this.A00 = (PrivacyOptionsResult) 1BL.A0C(parcel, PrivacyOptionsResult.class);
        this.A01 = (UAFPrivacyOption) 1BL.A0C(parcel, UAFPrivacyOption.class);
        this.A04 = C53v.A0S(parcel);
        this.A05 = C53v.A0S(parcel);
        this.A03 = C53v.A0S(parcel);
        this.A02 = C53v.A0S(parcel);
        FJ8.A01(parcel);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0214, code lost:
    
        if (X.11T.A0O(X.ELf.A05.toString(), r303) == false) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A00() {
        /*
            Method dump skipped, instructions count: 717
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.privacy.model.SelectablePrivacyData.A00():java.lang.String");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof SelectablePrivacyData)) {
                return false;
            }
            SelectablePrivacyData selectablePrivacyData = (SelectablePrivacyData) obj;
            if (Objects.equal(this.A00, selectablePrivacyData.A00) && EXR.A00(this.A01, selectablePrivacyData.A01) && this.A04 == selectablePrivacyData.A04 && this.A05 == selectablePrivacyData.A05 && this.A02 == selectablePrivacyData.A02 && this.A03 == selectablePrivacyData.A03) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, Boolean.valueOf(this.A04), Boolean.valueOf(this.A05), Boolean.valueOf(this.A03), Boolean.valueOf(this.A02)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(-1);
    }
}
