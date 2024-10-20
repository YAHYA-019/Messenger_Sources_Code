package com.facebook.messaging.media.upload.common;

import X.0S2;
import X.AbM;
import X.AnonymousClass001;
import X.C0A2;
import X.CSV;
import X.DKF;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: EncryptedPhotoUploadResult.class */
public final class EncryptedPhotoUploadResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(29);
    public final Uri A00;
    public final Integer A01;
    public final Long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final byte[] A06;

    public EncryptedPhotoUploadResult(Uri uri, Integer num, Long l, String str, String str2, String str3, byte[] bArr) {
        this.A05 = str;
        this.A00 = uri;
        this.A01 = num;
        this.A03 = str2;
        this.A06 = bArr;
        this.A04 = str3;
        this.A02 = l;
    }

    public EncryptedPhotoUploadResult(Parcel parcel) {
        Integer num;
        this.A05 = parcel.readString();
        Uri uri = null;
        try {
            uri = C0A2.A03(AbM.A0t(parcel));
        } catch (SecurityException unused) {
        }
        uri.getClass();
        this.A00 = uri;
        String readString = parcel.readString();
        if (readString.equals("Success")) {
            num = 0S2.A00;
        } else {
            if (!readString.equals("Failure")) {
                throw AnonymousClass001.A0L(readString);
            }
            num = 0S2.A01;
        }
        this.A01 = num;
        this.A03 = parcel.readString();
        this.A06 = (byte[]) parcel.readValue(null);
        this.A04 = parcel.readString();
        this.A02 = (Long) parcel.readValue(null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        DKF.A1E(parcel, this.A00);
        parcel.writeString(1 - this.A01.intValue() != 0 ? "Success" : "Failure");
        parcel.writeString(this.A03);
        parcel.writeValue(this.A06);
        parcel.writeString(this.A04);
        parcel.writeValue(this.A02);
    }
}
