package com.facebook.messaging.service.model;

import X.1BL;
import X.C53v;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.results.DataFetchDisposition;
import com.facebook.messaging.model.messages.MessagesCollection;

/* loaded from: FetchMoreMessagesResult.class */
public final class FetchMoreMessagesResult implements Parcelable {
    public static final FetchMoreMessagesResult A04 = new FetchMoreMessagesResult(DataFetchDisposition.A0I, null, -1);
    public static final Parcelable.Creator CREATOR = CSS.A00(93);
    public final long A00;
    public final DataFetchDisposition A01;
    public final MessagesCollection A02;
    public final boolean A03;

    public FetchMoreMessagesResult(Parcel parcel) {
        this.A01 = (DataFetchDisposition) 1BL.A0C(parcel, DataFetchDisposition.class);
        this.A02 = (MessagesCollection) 1BL.A0C(parcel, MessagesCollection.class);
        this.A00 = parcel.readLong();
        this.A03 = C53v.A0S(parcel);
    }

    public FetchMoreMessagesResult(DataFetchDisposition dataFetchDisposition, MessagesCollection messagesCollection, long j) {
        this.A01 = dataFetchDisposition;
        this.A02 = messagesCollection;
        this.A00 = j;
        this.A03 = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A03 ? 1 : 0);
    }
}
