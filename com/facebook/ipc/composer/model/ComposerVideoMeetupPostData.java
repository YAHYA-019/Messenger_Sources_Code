package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ComposerVideoMeetupPostData.class */
public final class ComposerVideoMeetupPostData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(77);
    public final String A00;
    public final String A01;
    public final boolean A02;

    public ComposerVideoMeetupPostData(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this) != 0 ? parcel.readString() : null;
        this.A01 = C3o5.A0O(parcel);
        this.A02 = AbN.A1U(parcel);
    }

    public ComposerVideoMeetupPostData(String str, String str2, boolean z) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerVideoMeetupPostData)) {
                return false;
            }
            ComposerVideoMeetupPostData composerVideoMeetupPostData = (ComposerVideoMeetupPostData) obj;
            if (!11T.A0O(this.A00, composerVideoMeetupPostData.A00) || !11T.A0O(this.A01, composerVideoMeetupPostData.A01) || this.A02 != composerVideoMeetupPostData.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A04(this.A01, C1pq.A03(this.A00)), this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
