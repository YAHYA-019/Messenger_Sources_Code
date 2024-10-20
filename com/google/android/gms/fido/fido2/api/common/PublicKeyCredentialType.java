package com.google.android.gms.fido.fido2.api.common;

import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: PublicKeyCredentialType.class */
public final class PublicKeyCredentialType implements Parcelable {
    public static final /* synthetic */ PublicKeyCredentialType[] A00;
    public static final PublicKeyCredentialType A01;
    public static final Parcelable.Creator CREATOR;
    public final String zzb = "public-key";

    static {
        PublicKeyCredentialType publicKeyCredentialType = new PublicKeyCredentialType();
        A01 = publicKeyCredentialType;
        A00 = new PublicKeyCredentialType[]{publicKeyCredentialType};
        CREATOR = LGm.A00(1);
    }

    public static PublicKeyCredentialType A00(String str) {
        PublicKeyCredentialType[] values = values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                throw new Exception(String.format("PublicKeyCredentialType %s not supported", str));
            }
            PublicKeyCredentialType publicKeyCredentialType = values[i2];
            if (str.equals(publicKeyCredentialType.zzb)) {
                return publicKeyCredentialType;
            }
            i = i2 + 1;
        }
    }

    public static PublicKeyCredentialType valueOf(String str) {
        return (PublicKeyCredentialType) Enum.valueOf(PublicKeyCredentialType.class, str);
    }

    public static PublicKeyCredentialType[] values() {
        return (PublicKeyCredentialType[]) A00.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzb);
    }
}
