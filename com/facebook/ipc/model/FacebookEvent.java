package com.facebook.ipc.model;

import X.1BK;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.base.MoreObjects;
import java.util.Arrays;

/* loaded from: FacebookEvent.class */
public class FacebookEvent implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(53);
    public long mEndTime;
    public long mEventId = -1;
    public String mName = null;
    public String mPicSquare = null;
    public long mStartTime;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r301.mEventId != ((com.facebook.ipc.model.FacebookEvent) r302).mEventId) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof com.facebook.ipc.model.FacebookEvent
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L26
            r0 = r302
            com.facebook.ipc.model.FacebookEvent r0 = (com.facebook.ipc.model.FacebookEvent) r0
            r302 = r0
            r0 = r301
            long r0 = r0.mEventId
            r304 = r0
            r0 = r302
            long r0 = r0.mEventId
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ipc.model.FacebookEvent.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return Arrays.hashCode(1BK.A1Z(this.mEventId));
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(FacebookEvent.class);
        stringHelper.add(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.mEventId);
        stringHelper.add(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.mName);
        stringHelper.add("pic", this.mPicSquare);
        stringHelper.add("start", this.mStartTime);
        stringHelper.add("end", this.mEndTime);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mEventId);
        parcel.writeString(this.mName);
        parcel.writeString(this.mPicSquare);
        parcel.writeLong(this.mStartTime);
        parcel.writeLong(this.mEndTime);
    }
}
