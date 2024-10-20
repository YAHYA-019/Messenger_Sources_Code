package libraries.fxcallauncher.model;

import X.0Pz;
import X.11T;
import X.4YV;
import X.7zM;
import X.AnonymousClass002;
import X.FKV;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FxUnifiedLauncherAddedAccount.class */
public final class FxUnifiedLauncherAddedAccount implements Parcelable {
    public static final Parcelable.Creator A03 = new FKV(6);
    public String A02 = "";
    public String A01 = "";
    public String A00 = "";

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FxUnifiedLauncherAddedAccount)) {
                return false;
            }
            FxUnifiedLauncherAddedAccount fxUnifiedLauncherAddedAccount = (FxUnifiedLauncherAddedAccount) obj;
            if (!11T.A0O(this.A02, fxUnifiedLauncherAddedAccount.A02) || !11T.A0O(this.A01, fxUnifiedLauncherAddedAccount.A01) || !11T.A0O(this.A00, fxUnifiedLauncherAddedAccount.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A00, AnonymousClass002.A07(this.A01, 4YV.A02(this.A02)));
    }

    public String toString() {
        return 0Pz.A11("FxUnifiedLauncherAddedAccount(userId_DEPRECATED_DO_NOT_USE=", this.A02, ", obId=", this.A01, ", accountType=", this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
