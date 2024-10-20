package android.support.v4.media;

import X.AnonymousClass001;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MediaBrowserCompat$MediaItem.class */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(0);
    public final int A00;
    public final MediaDescriptionCompat A01;

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o("MediaItem{");
        A0o.append("mFlags=");
        A0o.append(this.A00);
        A0o.append(", mDescription=");
        A0o.append(this.A01);
        return AnonymousClass001.A0f(A0o);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        this.A01.writeToParcel(parcel, i);
    }
}
