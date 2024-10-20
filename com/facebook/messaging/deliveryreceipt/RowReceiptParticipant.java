package com.facebook.messaging.deliveryreceipt;

import X.4YV;
import X.82M;
import X.G6b;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.google.common.base.MoreObjects;
import java.util.Comparator;

/* loaded from: RowReceiptParticipant.class */
public final class RowReceiptParticipant implements Parcelable {
    public static final Comparator A02 = new G6b(3);
    public static final Parcelable.Creator CREATOR = new 82M(30);
    public final long A00;
    public final ParticipantInfo A01;

    public RowReceiptParticipant(Parcel parcel) {
        Object A0l = 4YV.A0l(parcel, ParticipantInfo.class);
        A0l.getClass();
        this.A01 = (ParticipantInfo) A0l;
        this.A00 = parcel.readLong();
    }

    public RowReceiptParticipant(ParticipantInfo participantInfo, long j) {
        this.A01 = participantInfo;
        this.A00 = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(RowReceiptParticipant.class);
        stringHelper.add("participantInfo", this.A01);
        stringHelper.add("readTimestampMs", this.A00);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.A01);
        parcel.writeLong(this.A00);
    }
}
