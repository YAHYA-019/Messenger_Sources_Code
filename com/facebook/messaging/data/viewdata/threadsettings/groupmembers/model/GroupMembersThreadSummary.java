package com.facebook.messaging.data.viewdata.threadsettings.groupmembers.model;

import X.1BL;
import X.7zL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: GroupMembersThreadSummary.class */
public final class GroupMembersThreadSummary implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(35);
    public final ThreadSummary A00;

    public GroupMembersThreadSummary(Parcel parcel) {
        this.A00 = (ThreadSummary) 1BL.A0C(parcel, GroupMembersThreadSummary.class);
    }

    public GroupMembersThreadSummary(ThreadSummary threadSummary) {
        this.A00 = threadSummary;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }
}
