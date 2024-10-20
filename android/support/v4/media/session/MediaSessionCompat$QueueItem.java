package android.support.v4.media.session;

import X.AnonymousClass001;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

/* loaded from: MediaSessionCompat$QueueItem.class */
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(4);
    public final long A00;
    public final MediaDescriptionCompat A01;

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.A01 = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.A00 = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MediaSession.QueueItem {Description=");
        A0k.append(this.A01);
        A0k.append(", Id=");
        A0k.append(this.A00);
        return AnonymousClass001.A0d(" }", A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.A01.writeToParcel(parcel, i);
        parcel.writeLong(this.A00);
    }
}
