package libraries.access.src.main.base.common;

import X.7zO;
import X.C67Z;
import X.EMS;
import X.FKV;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: FXDeviceItem.class */
public final class FXDeviceItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKV(5);
    public C67Z A00;
    public final Long A01;
    public final String A02;
    public final EMS A03;

    public FXDeviceItem(Parcel parcel) {
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        EMS ems = null;
        this.A00 = readString == null ? null : C67Z.valueOf(readString);
        this.A03 = readString2 != null ? EMS.valueOf(readString2) : ems;
        this.A02 = parcel.readString();
        this.A01 = 7zO.A0j(parcel);
    }

    public FXDeviceItem(Long l, String str, C67Z c67z, EMS ems) {
        this.A00 = c67z;
        this.A03 = ems;
        this.A02 = str;
        this.A01 = l;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            FXDeviceItem fXDeviceItem = (FXDeviceItem) obj;
            if (this.A00 != fXDeviceItem.A00) {
                return false;
            }
            String str = this.A02;
            String str2 = fXDeviceItem.A02;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.A03 != fXDeviceItem.A03) {
                return false;
            }
            Long l = this.A01;
            Long l2 = fXDeviceItem.A01;
            if (l != null) {
                return l.equals(l2);
            }
            if (l2 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A02, this.A03, this.A01});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C67Z c67z = this.A00;
        String str = null;
        parcel.writeString(c67z == null ? null : c67z.toString());
        EMS ems = this.A03;
        if (ems != null) {
            str = ems.toString();
        }
        parcel.writeString(str);
        parcel.writeString(this.A02);
        Long l = this.A01;
        parcel.writeLong(l == null ? -1 : l.longValue());
    }
}
