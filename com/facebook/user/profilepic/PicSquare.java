package com.facebook.user.profilepic;

import X.1JW;
import X.C2xc;
import X.C3im;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: PicSquare.class */
public class PicSquare implements Parcelable {
    public static final Comparator A00 = new C3im(5);
    public static final Parcelable.Creator CREATOR = new C2xc(60);
    public final ImmutableList mPicSquareUrlsWithSizes;

    public PicSquare() {
        this.mPicSquareUrlsWithSizes = null;
    }

    public PicSquare(Parcel parcel) {
        this.mPicSquareUrlsWithSizes = ImmutableList.copyOf((Collection) parcel.readArrayList(PicSquareUrlWithSize.class.getClassLoader()));
    }

    public PicSquare(PicSquareUrlWithSize picSquareUrlWithSize) {
        this(picSquareUrlWithSize, null, null);
    }

    public PicSquare(PicSquareUrlWithSize picSquareUrlWithSize, PicSquareUrlWithSize picSquareUrlWithSize2, PicSquareUrlWithSize picSquareUrlWithSize3) {
        ImmutableList of;
        boolean z = false;
        int i = picSquareUrlWithSize != null ? 1 : 0;
        i = picSquareUrlWithSize2 != null ? i + 1 : i;
        i = picSquareUrlWithSize3 != null ? i + 1 : i;
        Preconditions.checkArgument(i != 0 ? true : z);
        if (i == 1) {
            of = picSquareUrlWithSize != null ? ImmutableList.of((Object) picSquareUrlWithSize) : picSquareUrlWithSize2 != null ? ImmutableList.of((Object) picSquareUrlWithSize2) : ImmutableList.of((Object) picSquareUrlWithSize3);
        } else if (i != 2) {
            if (picSquareUrlWithSize.size <= picSquareUrlWithSize2.size) {
                picSquareUrlWithSize2 = picSquareUrlWithSize;
                picSquareUrlWithSize = picSquareUrlWithSize2;
            }
            if (picSquareUrlWithSize.size <= picSquareUrlWithSize3.size) {
                picSquareUrlWithSize3 = picSquareUrlWithSize;
                picSquareUrlWithSize = picSquareUrlWithSize3;
            }
            of = ImmutableList.of((Object) picSquareUrlWithSize2, (Object) picSquareUrlWithSize3, (Object) picSquareUrlWithSize);
        } else {
            if (picSquareUrlWithSize == null) {
                picSquareUrlWithSize = picSquareUrlWithSize3;
            } else if (picSquareUrlWithSize2 == null) {
                picSquareUrlWithSize2 = picSquareUrlWithSize3;
            }
            of = picSquareUrlWithSize.size < picSquareUrlWithSize2.size ? ImmutableList.of((Object) picSquareUrlWithSize, (Object) picSquareUrlWithSize2) : ImmutableList.of((Object) picSquareUrlWithSize2, (Object) picSquareUrlWithSize);
        }
        this.mPicSquareUrlsWithSizes = of;
    }

    public PicSquare(ImmutableList immutableList) {
        Preconditions.checkArgument(!immutableList.isEmpty());
        ArrayList A02 = 1JW.A02(immutableList);
        Collections.sort(A02, A00);
        this.mPicSquareUrlsWithSizes = ImmutableList.copyOf((Collection) A02);
    }

    public PicSquareUrlWithSize A00(int i) {
        int size = this.mPicSquareUrlsWithSizes.size();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= size) {
                return (PicSquareUrlWithSize) this.mPicSquareUrlsWithSizes.get(size - 1);
            }
            PicSquareUrlWithSize picSquareUrlWithSize = (PicSquareUrlWithSize) this.mPicSquareUrlsWithSizes.get(i3);
            if (i <= picSquareUrlWithSize.size) {
                return picSquareUrlWithSize;
            }
            i2 = i3 + 1;
        }
    }

    public PicSquareUrlWithSize A01(int i) {
        int size = this.mPicSquareUrlsWithSizes.size();
        int i2 = 0;
        int abs = Math.abs(i - ((PicSquareUrlWithSize) this.mPicSquareUrlsWithSizes.get(0)).size);
        int i3 = 1;
        while (true) {
            int i4 = i3;
            ImmutableList immutableList = this.mPicSquareUrlsWithSizes;
            if (i4 >= size) {
                return (PicSquareUrlWithSize) immutableList.get(i2);
            }
            if (Math.abs(i - ((PicSquareUrlWithSize) immutableList.get(i4)).size) <= abs) {
                i2 = i4;
            }
            i3 = i4 + 1;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equal(this.mPicSquareUrlsWithSizes, ((PicSquare) obj).mPicSquareUrlsWithSizes);
    }

    public int hashCode() {
        ImmutableList immutableList = this.mPicSquareUrlsWithSizes;
        return (immutableList == null ? 0 : immutableList.hashCode()) + 31;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(PicSquare.class);
        stringHelper.add("mPicSquareUrlsWithSizes", this.mPicSquareUrlsWithSizes);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.mPicSquareUrlsWithSizes);
    }
}
