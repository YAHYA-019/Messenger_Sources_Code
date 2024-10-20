package com.facebook.messaging.service.model;

import X.1BL;
import X.4YV;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.results.DataFetchDisposition;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.base.MoreObjects;

/* loaded from: FetchMessagesContextResult.class */
public final class FetchMessagesContextResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(91);
    public final long A00;
    public final DataFetchDisposition A01;
    public final MessagesCollection A02;
    public final ThreadSummary A03;

    public FetchMessagesContextResult(Parcel parcel) {
        this.A02 = (MessagesCollection) 1BL.A0C(parcel, MessagesCollection.class);
        this.A01 = (DataFetchDisposition) 1BL.A0C(parcel, DataFetchDisposition.class);
        this.A00 = parcel.readLong();
        this.A03 = (ThreadSummary) 1BL.A0C(parcel, ThreadSummary.class);
    }

    public FetchMessagesContextResult(DataFetchDisposition dataFetchDisposition, MessagesCollection messagesCollection, ThreadSummary threadSummary, long j) {
        this.A02 = messagesCollection;
        this.A01 = dataFetchDisposition;
        this.A00 = j;
        this.A03 = threadSummary;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("messagesCollection", this.A02);
        stringHelper.add("disposition", this.A01);
        stringHelper.add("clientTimeMs", this.A00);
        return 4YV.A0s(stringHelper, this.A03, "threadSummary");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeLong(this.A00);
        parcel.writeParcelable(this.A03, i);
    }
}
