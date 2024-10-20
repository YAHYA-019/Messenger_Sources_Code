package com.facebook.ipc.model;

import X.AnonymousClass001;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: PageTopic.class */
public class PageTopic implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(60);
    public final String displayName;
    public final long id;
    public final int pageCount;
    public final List parentIds;
    public final String pic;

    public PageTopic() {
        this.id = -1;
        this.displayName = null;
        this.pic = null;
        this.parentIds = AnonymousClass001.A0s();
        this.pageCount = -1;
    }

    public PageTopic(Parcel parcel) {
        this.id = parcel.readLong();
        this.displayName = parcel.readString();
        this.pic = parcel.readString();
        ArrayList A0s = AnonymousClass001.A0s();
        this.parentIds = A0s;
        parcel.readList(A0s, List.class.getClassLoader());
        this.pageCount = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof PageTopic) && this.id == ((PageTopic) obj).id) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return (int) this.id;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeString(this.displayName);
        parcel.writeString(this.pic);
        parcel.writeList(this.parentIds);
        parcel.writeInt(this.pageCount);
    }
}
