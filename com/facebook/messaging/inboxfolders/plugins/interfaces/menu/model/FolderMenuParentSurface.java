package com.facebook.messaging.inboxfolders.plugins.interfaces.menu.model;

import X.0Pz;
import X.11T;
import X.7zL;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FolderMenuParentSurface.class */
public final class FolderMenuParentSurface implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(84);
    public final String A00;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        String str = this.A00;
        boolean z = false;
        if ((obj instanceof FolderMenuParentSurface) && 11T.A0O(str, ((FolderMenuParentSurface) obj).A00)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return 0Pz.A0X("FolderMenuParentSurface(folderMenuParentSurface=", this.A00, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
    }
}
