package com.facebook.navigation.tabbar.state;

import X.11T;
import X.4YT;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: TabTag.class */
public abstract class TabTag implements Parcelable {
    public final String A00;

    public TabTag(String str) {
        11T.A0F(str, 2);
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof TabTag) {
            TabTag tabTag = (TabTag) obj;
            Object A00 = 4YT.A00(242);
            if (A00.equals(A00) && 11T.A0O(tabTag.A00, this.A00) && "profile".equals("profile")) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return Long.toString(190055527696468L).hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
