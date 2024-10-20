package com.facebook.navigation.tabbar.state;

import X.11T;
import X.1BL;
import X.AbM;
import X.AnonymousClass001;
import X.DKF;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* loaded from: NavigationConfig.class */
public final class NavigationConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(11);
    public final ImmutableList A00;
    public final int A01;

    public NavigationConfig(Parcel parcel) {
        ArrayList A0s = AnonymousClass001.A0s();
        DKF.A1D(parcel, TabTag.class, A0s);
        this.A00 = 1BL.A0a(A0s);
        this.A01 = parcel.readInt();
    }

    public NavigationConfig(ImmutableList immutableList) {
        this.A00 = immutableList;
        this.A01 = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof NavigationConfig) {
            NavigationConfig navigationConfig = (NavigationConfig) obj;
            if (Objects.equal(this.A00, navigationConfig.A00) && this.A01 == navigationConfig.A01) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return AbM.A05(this.A00, Integer.valueOf(this.A01));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeList(this.A00);
        parcel.writeInt(this.A01);
    }
}
