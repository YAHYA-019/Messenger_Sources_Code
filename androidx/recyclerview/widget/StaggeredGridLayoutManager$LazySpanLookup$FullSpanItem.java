package androidx.recyclerview.widget;

import X.AnonymousClass001;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class */
public final class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(27);
    public int A00;
    public int A01;
    public boolean A02;
    public int[] A03;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("FullSpanItem{mPosition=");
        A0k.append(this.A01);
        A0k.append(", mGapDir=");
        A0k.append(this.A00);
        A0k.append(", mHasUnwantedGapAfter=");
        A0k.append(this.A02);
        A0k.append(", mGapPerSpan=");
        A0k.append(Arrays.toString(this.A03));
        return AnonymousClass001.A0f(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int length;
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
        int[] iArr = this.A03;
        if (iArr == null || (length = iArr.length) <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(length);
            parcel.writeIntArray(this.A03);
        }
    }
}
