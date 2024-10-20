package android.support.v4.media;

import X.0QO;
import X.7zN;
import X.C04r;
import X.LGo;
import X.Qwl;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MediaMetadataCompat.class */
public final class MediaMetadataCompat implements Parcelable {
    public static final C04r A01;
    public static final Parcelable.Creator CREATOR;
    public final Bundle A00;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0QO, X.04r] */
    static {
        ?? r0 = new 0QO(0);
        A01 = r0;
        Integer A0i = 7zN.A0i();
        r0.put("android.media.metadata.TITLE", A0i);
        r0.put("android.media.metadata.ARTIST", A0i);
        r0.put("android.media.metadata.DURATION", 0);
        r0.put("android.media.metadata.ALBUM", A0i);
        r0.put("android.media.metadata.AUTHOR", A0i);
        r0.put("android.media.metadata.WRITER", A0i);
        r0.put("android.media.metadata.COMPOSER", A0i);
        r0.put("android.media.metadata.COMPILATION", A0i);
        r0.put("android.media.metadata.DATE", A0i);
        r0.put("android.media.metadata.YEAR", 0);
        r0.put("android.media.metadata.GENRE", A0i);
        r0.put("android.media.metadata.TRACK_NUMBER", 0);
        r0.put("android.media.metadata.NUM_TRACKS", 0);
        r0.put("android.media.metadata.DISC_NUMBER", 0);
        r0.put("android.media.metadata.ALBUM_ARTIST", A0i);
        r0.put("android.media.metadata.ART", 2);
        r0.put("android.media.metadata.ART_URI", A0i);
        r0.put("android.media.metadata.ALBUM_ART", 2);
        r0.put("android.media.metadata.ALBUM_ART_URI", A0i);
        r0.put("android.media.metadata.USER_RATING", 3);
        r0.put("android.media.metadata.RATING", 3);
        r0.put("android.media.metadata.DISPLAY_TITLE", A0i);
        r0.put("android.media.metadata.DISPLAY_SUBTITLE", A0i);
        r0.put("android.media.metadata.DISPLAY_DESCRIPTION", A0i);
        r0.put("android.media.metadata.DISPLAY_ICON", 2);
        r0.put("android.media.metadata.DISPLAY_ICON_URI", A0i);
        r0.put("android.media.metadata.MEDIA_ID", A0i);
        r0.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        r0.put("android.media.metadata.MEDIA_URI", A0i);
        r0.put("android.media.metadata.ADVERTISEMENT", 0);
        r0.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = LGo.A00(2);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.A00 = parcel.readBundle(Qwl.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.A00);
    }
}
