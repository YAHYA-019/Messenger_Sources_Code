package android.support.v4.media.session;

import X.AnonymousClass001;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MediaSessionCompat$Token.class */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(6);
    public final Object A00;

    public MediaSessionCompat$Token(Object obj) {
        this.A00 = obj;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof MediaSessionCompat$Token)) {
                return false;
            }
            Object obj2 = this.A00;
            Object obj3 = ((MediaSessionCompat$Token) obj).A00;
            if (obj2 != null) {
                if (obj3 != null) {
                    return obj2.equals(obj3);
                }
                return false;
            }
            if (obj3 != null) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        return AnonymousClass001.A02(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) this.A00, i);
    }
}
