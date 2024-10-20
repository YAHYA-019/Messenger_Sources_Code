package androidx.work.multiprocess.parcelable;

import X.1BL;
import X.KtB;
import X.LGo;
import android.app.Notification;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ParcelableForegroundRequestInfo.class */
public final class ParcelableForegroundRequestInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(32);
    public final KtB A00;
    public final String A01;

    public ParcelableForegroundRequestInfo(KtB ktB, String str) {
        this.A01 = str;
        this.A00 = ktB;
    }

    public ParcelableForegroundRequestInfo(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = new KtB(parcel.readInt(), (Notification) 1BL.A0C(parcel, getClass()), parcel.readInt());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        KtB ktB = this.A00;
        parcel.writeInt(ktB.A01);
        parcel.writeInt(ktB.A00);
        parcel.writeParcelable(ktB.A02, i);
    }
}
