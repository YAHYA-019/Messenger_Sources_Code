package com.facebook.contacts.server;

import X.1BL;
import X.DKF;
import X.FKX;
import X.Qo9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.contacts.model.PhonebookContact;

/* loaded from: UploadBulkContactChange.class */
public final class UploadBulkContactChange implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(53);
    public final PhonebookContact A00;
    public final Qo9 A01;
    public final String A02;
    public final String A03;

    public UploadBulkContactChange(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A00 = (PhonebookContact) 1BL.A0C(parcel, PhonebookContact.class);
        this.A01 = Enum.valueOf(Qo9.class, parcel.readString());
        this.A03 = parcel.readString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r302 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public UploadBulkContactChange(com.facebook.contacts.model.PhonebookContact r302, X.Qo9 r303, java.lang.String r304, java.lang.String r305) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            X.Qo9 r0 = X.Qo9.A02
            r306 = r0
            r0 = r303
            r1 = r306
            if (r0 == r1) goto L19
            r0 = 0
            r307 = r0
            r0 = 0
            r306 = r0
            r0 = r302
            if (r0 == 0) goto L1c
        L19:
            r0 = 1
            r307 = r0
        L1c:
            r0 = r307
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r305
            java.lang.Class r0 = r0.getClass()
            r0 = r301
            r1 = r304
            r0.A02 = r1
            r0 = r301
            r1 = r302
            r0.A00 = r1
            r0 = r301
            r1 = r303
            r0.A01 = r1
            r0 = r301
            r1 = r305
            r0.A03 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.contacts.server.UploadBulkContactChange.<init>(com.facebook.contacts.model.PhonebookContact, X.Qo9, java.lang.String, java.lang.String):void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
        DKF.A1E(parcel, this.A01);
        parcel.writeString(this.A03);
    }
}
