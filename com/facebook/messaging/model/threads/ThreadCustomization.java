package com.facebook.messaging.model.threads;

import X.11T;
import X.1BK;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;

/* loaded from: ThreadCustomization.class */
public final class ThreadCustomization implements Parcelable {
    public static final ThreadCustomization A03 = new ThreadCustomization();
    public static final Parcelable.Creator CREATOR = new C2xc(33);
    public final NicknamesMap A00;
    public final String A01;
    public final String A02;

    /* JADX WARN: Type inference failed for: r0v3, types: [com.facebook.messaging.model.threads.NicknamesMap, java.lang.Object] */
    public ThreadCustomization() {
        this.A02 = null;
        this.A01 = null;
        this.A00 = new Object();
    }

    public ThreadCustomization(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        Parcelable readParcelable = parcel.readParcelable(NicknamesMap.class.getClassLoader());
        if (readParcelable == null) {
            throw 1BK.A0h();
        }
        this.A00 = (NicknamesMap) readParcelable;
    }

    public ThreadCustomization(NicknamesMap nicknamesMap, String str, String str2) {
        this.A02 = str2;
        this.A01 = str;
        this.A00 = nicknamesMap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !11T.A0O(getClass(), obj.getClass())) {
                return false;
            }
            ThreadCustomization threadCustomization = (ThreadCustomization) obj;
            if (!11T.A0O(this.A02, threadCustomization.A02) || !11T.A0O(this.A01, threadCustomization.A01) || !11T.A0O(this.A00, threadCustomization.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str = this.A02;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.A01;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        return (hashCode * 31) + this.A00.hashCode();
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("emojilikeString", this.A02);
        stringHelper.add("avatarStickerInstructionKeyID", this.A01);
        stringHelper.add("nicknamesMap", this.A00);
        return 11T.A02(stringHelper);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }
}
