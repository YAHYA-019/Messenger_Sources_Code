package com.facebook.photos.creativeediting.model;

import X.11T;
import X.1BL;
import X.7zM;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: SwipeableParams.class */
public final class SwipeableParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(24);
    public Integer A00;
    public String A01;
    public String A02;
    public List A03;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (!(obj instanceof SwipeableParams)) {
                return false;
            }
            SwipeableParams swipeableParams = (SwipeableParams) obj;
            if (11T.A0O(this.A02, swipeableParams.A02) && this.A00 == swipeableParams.A00) {
                ImmutableList A0a = 1BL.A0a(this.A03);
                ImmutableList A0a2 = 1BL.A0a(swipeableParams.A03);
                if (A0a.size() == A0a2.size()) {
                    int size = A0a.size();
                    int i = 0;
                    while (true) {
                        int i2 = i;
                        if (i2 < size) {
                            if (!((StickerParams) A0a.get(i2)).A02((StickerParams) A0a2.get(i2))) {
                                break;
                            }
                            i = i2 + 1;
                        } else {
                            break;
                        }
                    }
                }
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str;
        int hashCode = (527 + this.A02.hashCode()) * 31;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 1:
                str = "FRAME";
                break;
            case 2:
                str = "MASK";
                break;
            case 3:
                str = "PARTICLE_EFFECT";
                break;
            default:
                str = "FILTER";
                break;
        }
        return hashCode + 7zM.A04(str, intValue);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeTypedArray((Parcelable[]) this.A03.toArray(new StickerParams[0]), i);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00.intValue());
        parcel.writeString(this.A01);
    }
}
