package libraries.access.src.main.base.common;

import X.FKV;
import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: FXAccessLibraryDeviceRequest.class */
public final class FXAccessLibraryDeviceRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKV(3);
    public final List A00;

    public FXAccessLibraryDeviceRequest(Parcel parcel) {
        ArrayList createTypedArrayList = parcel.createTypedArrayList(FXAccessLibraryDeviceRequestItem.CREATOR);
        if (createTypedArrayList == null) {
            throw new ParcelFormatException("Did not find expected field");
        }
        this.A00 = createTypedArrayList;
    }

    public FXAccessLibraryDeviceRequest(List list) {
        this.A00 = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.A00);
    }
}
