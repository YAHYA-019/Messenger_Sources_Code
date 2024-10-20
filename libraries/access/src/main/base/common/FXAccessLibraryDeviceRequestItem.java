package libraries.access.src.main.base.common;

import X.C67Z;
import X.DKF;
import X.EMS;
import X.FKV;
import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;

/* loaded from: FXAccessLibraryDeviceRequestItem.class */
public final class FXAccessLibraryDeviceRequestItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKV(4);
    public final C67Z A00;
    public final EMS A01;
    public final String A02;

    public FXAccessLibraryDeviceRequestItem(C67Z c67z, EMS ems) {
        this.A00 = c67z;
        this.A01 = ems;
        this.A02 = "";
    }

    public FXAccessLibraryDeviceRequestItem(Parcel parcel) {
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        if (readString == null || readString2 == null || readString3 == null) {
            throw new ParcelFormatException("Did not find expected field");
        }
        this.A00 = C67Z.valueOf(readString);
        this.A01 = EMS.valueOf(readString2);
        this.A02 = readString3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DKF.A1E(parcel, this.A00);
        DKF.A1E(parcel, this.A01);
        parcel.writeString(this.A02);
    }
}
