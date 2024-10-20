package com.facebook.xapp.messaging.composer.theme.customization.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.C1pq;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.composer.theme.model.ThreadThemeInfo;
import com.google.common.collect.ImmutableList;

/* loaded from: ThemeCustomizationPickerParams.class */
public final class ThemeCustomizationPickerParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(49);
    public final ThreadKey A00;
    public final ThreadThemeInfo A01;
    public final ImmutableList A02;

    /* JADX WARN: Multi-variable type inference failed */
    public ThemeCustomizationPickerParams(Parcel parcel) {
        getClass().getClassLoader();
        Parcelable.Creator creator = ThreadThemeInfo.CREATOR;
        this.A01 = (ThreadThemeInfo) creator.createFromParcel(parcel);
        int readInt = parcel.readInt();
        ThreadThemeInfo[] threadThemeInfoArr = new ThreadThemeInfo[readInt];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= readInt) {
                break;
            }
            threadThemeInfoArr[i2] = creator.createFromParcel(parcel);
            i = i2 + 1;
        }
        this.A02 = ImmutableList.copyOf(threadThemeInfoArr);
        this.A00 = parcel.readInt() == 0 ? null : (ThreadKey) ThreadKey.CREATOR.createFromParcel(parcel);
    }

    public ThemeCustomizationPickerParams(ThreadKey threadKey, ThreadThemeInfo threadThemeInfo, ImmutableList immutableList) {
        C1pq.A08("currentTheme", threadThemeInfo);
        this.A01 = threadThemeInfo;
        C1pq.A08("themeOptions", immutableList);
        this.A02 = immutableList;
        this.A00 = threadKey;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ThemeCustomizationPickerParams)) {
                return false;
            }
            ThemeCustomizationPickerParams themeCustomizationPickerParams = (ThemeCustomizationPickerParams) obj;
            if (!11T.A0O(this.A01, themeCustomizationPickerParams.A01) || !11T.A0O(this.A02, themeCustomizationPickerParams.A02) || !11T.A0O(this.A00, themeCustomizationPickerParams.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A04(this.A02, C1pq.A03(this.A01)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.A01.writeToParcel(parcel, i);
        1Du A0b = 1BL.A0b(parcel, this.A02);
        while (A0b.hasNext()) {
            ((ThreadThemeInfo) A0b.next()).writeToParcel(parcel, i);
        }
        ThreadKey threadKey = this.A00;
        if (threadKey == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadKey.writeToParcel(parcel, i);
        }
    }
}
