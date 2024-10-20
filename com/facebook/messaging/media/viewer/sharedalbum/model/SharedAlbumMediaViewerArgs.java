package com.facebook.messaging.media.viewer.sharedalbum.model;

import X.11T;
import X.1BK;
import X.7zQ;
import X.7zR;
import X.AnonymousClass002;
import X.C04v;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: SharedAlbumMediaViewerArgs.class */
public final class SharedAlbumMediaViewerArgs extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(32);
    public final long A00;
    public final List A01;
    public final String A02;

    public SharedAlbumMediaViewerArgs(String str, List list, long j) {
        7zR.A1O(str, list);
        this.A00 = j;
        this.A02 = str;
        this.A01 = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SharedAlbumMediaViewerArgs)) {
                return false;
            }
            SharedAlbumMediaViewerArgs sharedAlbumMediaViewerArgs = (SharedAlbumMediaViewerArgs) obj;
            if (this.A00 != sharedAlbumMediaViewerArgs.A00 || !11T.A0O(this.A02, sharedAlbumMediaViewerArgs.A02) || !11T.A0O(this.A01, sharedAlbumMediaViewerArgs.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, AnonymousClass002.A07(this.A02, 7zQ.A02(this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A02);
        parcel.writeStringList(this.A01);
    }
}
