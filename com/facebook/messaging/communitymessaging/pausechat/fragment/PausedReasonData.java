package com.facebook.messaging.communitymessaging.pausechat.fragment;

import X.11T;
import X.1BL;
import X.7zL;
import X.7zM;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.channels.pause.model.PausedReasonEnum;

/* loaded from: PausedReasonData.class */
public final class PausedReasonData extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(7);
    public final PausedReasonEnum A00;
    public final String A01;

    public PausedReasonData(PausedReasonEnum pausedReasonEnum, String str) {
        1BL.A1F(pausedReasonEnum, str);
        this.A00 = pausedReasonEnum;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PausedReasonData)) {
                return false;
            }
            PausedReasonData pausedReasonData = (PausedReasonData) obj;
            if (this.A00 != pausedReasonData.A00 || !11T.A0O(this.A01, pausedReasonData.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A01, 1BL.A03(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }
}
