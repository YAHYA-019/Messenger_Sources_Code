package android.support.v4.media.session;

import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* loaded from: MediaSessionCompat$ResultReceiverWrapper.class */
public final class MediaSessionCompat$ResultReceiverWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(5);
    public ResultReceiver A00;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.A00.writeToParcel(parcel, i);
    }
}
