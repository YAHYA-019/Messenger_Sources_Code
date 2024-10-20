package com.facebook.messaging.inbox2.activenow.model;

import X.1BL;
import X.82M;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* loaded from: GroupPresenceInfo.class */
public final class GroupPresenceInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(37);
    public final ThreadSummary A00;
    public final ImmutableList A01;

    public GroupPresenceInfo(Parcel parcel) {
        this.A00 = (ThreadSummary) 1BL.A0C(parcel, ThreadSummary.class);
        this.A01 = ImmutableList.copyOf((Collection) parcel.createTypedArrayList(User.CREATOR));
    }

    public GroupPresenceInfo(ThreadSummary threadSummary, ImmutableList immutableList) {
        this.A00 = threadSummary;
        this.A01 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.A01);
        parcel.writeParcelable(this.A00, i);
    }
}
