package com.facebook.messaging.media.folder;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: LocalMediaFolderResult.class */
public final class LocalMediaFolderResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSV.A00(20);
    public final ImmutableList A00;

    public LocalMediaFolderResult(Parcel parcel) {
        Parcelable.Creator creator = Folder.CREATOR;
        ArrayList A0s = AnonymousClass001.A0s();
        parcel.readTypedList(A0s, creator);
        this.A00 = 1BL.A0a(A0s);
    }

    public LocalMediaFolderResult(List list) {
        this.A00 = 1BL.A0a(list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeTypedList(this.A00);
    }
}
