package com.facebook.messaging.publicchats.takedowns.bottomsheet;

import X.11T;
import X.1BL;
import X.4YV;
import X.C1pq;
import X.C3o5;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ChannelTakedownBottomSheetModel.class */
public final class ChannelTakedownBottomSheetModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSS(38);
    public final ThreadSummary A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public ChannelTakedownBottomSheetModel(Parcel parcel) {
        this.A01 = C3o5.A01(parcel, this) != 0 ? parcel.readString() : null;
        this.A03 = 4YV.A1U(parcel.readInt());
        this.A00 = (ThreadSummary) ThreadSummary.CREATOR.createFromParcel(parcel);
        this.A02 = C3o5.A0O(parcel);
    }

    public ChannelTakedownBottomSheetModel(ThreadSummary threadSummary, String str, String str2, boolean z) {
        this.A01 = str;
        this.A03 = z;
        C1pq.A08("threadSummary", threadSummary);
        this.A00 = threadSummary;
        this.A02 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ChannelTakedownBottomSheetModel)) {
                return false;
            }
            ChannelTakedownBottomSheetModel channelTakedownBottomSheetModel = (ChannelTakedownBottomSheetModel) obj;
            if (!11T.A0O(this.A01, channelTakedownBottomSheetModel.A01) || this.A03 != channelTakedownBottomSheetModel.A03 || !11T.A0O(this.A00, channelTakedownBottomSheetModel.A00) || !11T.A0O(this.A02, channelTakedownBottomSheetModel.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A00, C1pq.A02(C1pq.A03(this.A01), this.A03)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        parcel.writeInt(this.A03 ? 1 : 0);
        this.A00.writeToParcel(parcel, i);
        1BL.A13(parcel, this.A02);
    }
}
