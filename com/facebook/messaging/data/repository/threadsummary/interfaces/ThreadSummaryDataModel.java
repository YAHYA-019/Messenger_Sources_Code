package com.facebook.messaging.data.repository.threadsummary.interfaces;

import X.11T;
import X.82M;
import X.C1pq;
import X.C3o5;
import X.C5xo;
import X.C5xp;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ThreadSummaryDataModel.class */
public final class ThreadSummaryDataModel implements Parcelable, C5xo {
    public static final Parcelable.Creator CREATOR = new 82M(29);
    public final ThreadSummary A00;
    public final String A01;
    public final String A02;

    public ThreadSummaryDataModel(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this) == 0 ? null : (ThreadSummary) ThreadSummary.CREATOR.createFromParcel(parcel);
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public ThreadSummaryDataModel(ThreadSummary threadSummary, String str, String str2) {
        this.A00 = threadSummary;
        C1pq.A08("failureMessage", str);
        this.A01 = str;
        C1pq.A08("status", str2);
        this.A02 = str2;
        C5xp.A00(this);
    }

    @Override // X.C5xo
    public String AlZ() {
        return this.A01;
    }

    @Override // X.C5xo
    public String BCK() {
        return this.A02;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ThreadSummaryDataModel)) {
                return false;
            }
            ThreadSummaryDataModel threadSummaryDataModel = (ThreadSummaryDataModel) obj;
            if (!11T.A0O(this.A00, threadSummaryDataModel.A00) || !11T.A0O(this.A01, threadSummaryDataModel.A01) || !11T.A0O(this.A02, threadSummaryDataModel.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ThreadSummary threadSummary = this.A00;
        if (threadSummary == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadSummary.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
