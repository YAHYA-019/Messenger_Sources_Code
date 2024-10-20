package com.facebook.messaging.model.messagemetadata.types.p2ppayments;

import X.1JF;
import X.2DM;
import X.4YU;
import X.CSX;
import X.DJf;
import X.QqB;
import android.os.Parcel;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.messaging.model.messagemetadata.common.MessageMetadata;
import java.util.Arrays;

/* loaded from: P2PPaymentMetadata.class */
public final class P2PPaymentMetadata implements MessageMetadata {
    public static final DJf CREATOR = new CSX(1);
    public final float A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public P2PPaymentMetadata(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readLong();
        this.A02 = parcel.readString();
        this.A04 = parcel.readString();
    }

    public P2PPaymentMetadata(String str, String str2, String str3, float f, long j) {
        this.A03 = str;
        this.A00 = f;
        this.A01 = j;
        this.A02 = str2;
        this.A04 = str3;
    }

    @Override // com.facebook.messaging.model.messagemetadata.common.MessageMetadata
    public 2DM AIA() {
        2DM A0f = 4YU.A0f();
        A0f.A0o(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, QqB.A05.value);
        A0f.A0o(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.A03);
        A0f.A0h("confidence", this.A00);
        A0f.A0j("amount", this.A01);
        A0f.A0o("currency", this.A02);
        A0f.A0o(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, this.A04);
        return A0f;
    }

    @Override // com.facebook.messaging.model.messagemetadata.common.MessageMetadata
    public QqB BHP() {
        return QqB.A05;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof P2PPaymentMetadata)) {
            P2PPaymentMetadata p2PPaymentMetadata = (P2PPaymentMetadata) obj;
            if (1JF.A0C(this.A03, p2PPaymentMetadata.A03) && this.A00 == p2PPaymentMetadata.A00 && this.A01 == p2PPaymentMetadata.A01 && 1JF.A0C(this.A02, p2PPaymentMetadata.A02) && 1JF.A0C(this.A04, p2PPaymentMetadata.A04)) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.A00)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeFloat(this.A00);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
    }
}
