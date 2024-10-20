package com.facebook.ipc.model;

import X.AnonymousClass001;
import X.C41w;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FacebookProfile.class */
public class FacebookProfile implements Parcelable, C41w {
    public static final Parcelable.Creator CREATOR = new CSR(56);
    public int A00;
    public final String A01;
    public final String A02;
    public final String mDisplayName;
    public final long mId;
    public final String mImageUrl;
    public String mTypeString;

    public FacebookProfile() {
        this.mId = -1;
        this.mDisplayName = null;
        this.mImageUrl = null;
        this.A00 = 0;
        this.A01 = null;
        this.A02 = null;
    }

    public FacebookProfile(Parcel parcel) {
        this.mId = parcel.readLong();
        this.mDisplayName = parcel.readString();
        this.mImageUrl = parcel.readString();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
    }

    @Override // X.C41w
    public /* bridge */ /* synthetic */ Object CY7() {
        int i;
        String str = this.mTypeString;
        if (str != null) {
            if (str.equals("page")) {
                i = 1;
            } else if (str.equals("group")) {
                i = 3;
            } else if (str.equals("event")) {
                i = 4;
            }
            this.A00 = i;
        }
        this.mTypeString = null;
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r301.mId != ((com.facebook.ipc.model.FacebookProfile) r302).mId) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof com.facebook.ipc.model.FacebookProfile
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L26
            r0 = r301
            long r0 = r0.mId
            r304 = r0
            r0 = r302
            com.facebook.ipc.model.FacebookProfile r0 = (com.facebook.ipc.model.FacebookProfile) r0
            r302 = r0
            r0 = r302
            long r0 = r0.mId
            r306 = r0
            r0 = r304
            r1 = r306
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r308 = r0
            r0 = 1
            r303 = r0
            r0 = r308
            if (r0 == 0) goto L28
        L26:
            r0 = 0
            r303 = r0
        L28:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ipc.model.FacebookProfile.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return (int) this.mId;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("FacebookProfile(");
        A0k.append(this.mDisplayName);
        A0k.append(" (id=");
        A0k.append(this.mId);
        return AnonymousClass001.A0d("))", A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mId);
        parcel.writeString(this.mDisplayName);
        parcel.writeString(this.mImageUrl);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
