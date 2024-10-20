package libraries.fxcallauncher.model;

import X.11T;
import X.C0ty;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: FxUnifiedLauncherCallbackInfo.class */
public final class FxUnifiedLauncherCallbackInfo implements Parcelable {
    public String A00;
    public String A01;
    public String A02;
    public List A03;

    public FxUnifiedLauncherCallbackInfo() {
        C0ty c0ty = C0ty.A00;
        11T.A0F(c0ty, 2);
        this.A01 = "";
        this.A03 = c0ty;
        this.A02 = "";
        this.A00 = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeParcelableArray((Parcelable[]) this.A03.toArray(new FxUnifiedLauncherAddedAccount[0]), i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }
}
