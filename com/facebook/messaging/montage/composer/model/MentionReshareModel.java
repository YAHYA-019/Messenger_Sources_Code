package com.facebook.messaging.montage.composer.model;

import X.11T;
import X.C1pq;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.montage.model.MontageUser;

/* loaded from: MentionReshareModel.class */
public final class MentionReshareModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(84);
    public final float A00;
    public final MontageUser A01;
    public final String A02;

    public MentionReshareModel(Parcel parcel) {
        getClass().getClassLoader();
        this.A01 = (MontageUser) MontageUser.CREATOR.createFromParcel(parcel);
        this.A00 = parcel.readFloat();
        this.A02 = parcel.readString();
    }

    public MentionReshareModel(MontageUser montageUser, String str) {
        this.A01 = montageUser;
        this.A00 = 0.7f;
        C1pq.A08("storyId", str);
        this.A02 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MentionReshareModel)) {
                return false;
            }
            MentionReshareModel mentionReshareModel = (MentionReshareModel) obj;
            if (!11T.A0O(this.A01, mentionReshareModel.A01) || this.A00 != mentionReshareModel.A00 || !11T.A0O(this.A02, mentionReshareModel.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, (C1pq.A03(this.A01) * 31) + Float.floatToIntBits(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.A01.writeToParcel(parcel, i);
        parcel.writeFloat(this.A00);
        parcel.writeString(this.A02);
    }
}
