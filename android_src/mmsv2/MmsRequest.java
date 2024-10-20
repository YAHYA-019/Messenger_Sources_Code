package android_src.mmsv2;

import X.4YW;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: MmsRequest.class */
public abstract class MmsRequest implements Parcelable {
    public boolean A00;
    public final String A01;
    public final ExecutorService A02 = Executors.newCachedThreadPool();
    public final PendingIntent A03;
    public final Uri A04;

    public MmsRequest(Parcel parcel) {
        ClassLoader classLoader = MmsRequest.class.getClassLoader();
        this.A00 = 4YW.A0K(parcel);
        this.A01 = parcel.readString();
        this.A04 = (Uri) parcel.readParcelable(classLoader);
        this.A03 = (PendingIntent) parcel.readParcelable(classLoader);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A00 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A04, 0);
        parcel.writeParcelable(this.A03, 0);
    }
}
