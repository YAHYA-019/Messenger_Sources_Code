package fxcache.model;

import X.0S2;
import X.11T;
import X.3PF;
import X.C0ty;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: FxCalAccountLinkageInfoForSwitcher.class */
public final class FxCalAccountLinkageInfoForSwitcher implements Parcelable {
    public long A00;
    public Integer A01;
    public List A02;

    public FxCalAccountLinkageInfoForSwitcher() {
        this(0S2.A00, C0ty.A00, System.currentTimeMillis());
    }

    public FxCalAccountLinkageInfoForSwitcher(Integer num, List list, long j) {
        11T.A0F(num, 3);
        this.A02 = list;
        this.A00 = j;
        this.A01 = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelableArray((Parcelable[]) this.A02.toArray(new FxCalAccountWithSwitcherInfo[0]), i);
        parcel.writeLong(this.A00);
        parcel.writeString(3PF.A01(this.A01));
    }
}
