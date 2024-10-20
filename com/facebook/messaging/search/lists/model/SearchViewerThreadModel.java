package com.facebook.messaging.search.lists.model;

import X.AbK;
import X.CSS;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* loaded from: SearchViewerThreadModel.class */
public final class SearchViewerThreadModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(69);
    public final Uri A00;
    public final ThreadKey A01;
    public final ImmutableList A02;
    public final String A03;

    public SearchViewerThreadModel(Uri uri, ThreadKey threadKey, ImmutableList immutableList, String str) {
        this.A01 = threadKey;
        this.A02 = immutableList;
        this.A03 = str;
        this.A00 = uri;
    }

    public SearchViewerThreadModel(Parcel parcel) {
        this.A01 = AbK.A0X(parcel);
        this.A02 = ImmutableList.copyOf((Collection) parcel.createTypedArrayList(ThreadParticipant.CREATOR));
        this.A03 = parcel.readString();
        this.A00 = (Uri) parcel.readParcelable(null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeTypedList(this.A02);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
    }
}
