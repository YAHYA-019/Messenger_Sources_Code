package com.facebook.messaging.model.share;

import X.11T;
import X.1BL;
import X.82M;
import X.BM7;
import X.BUM;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.p2p.service.model.transactions.SendPaymentMessageParams;
import com.facebook.xapp.messaging.composer.broadcast.transportagnostic.sender.xma.data.SendTamXMAMessageParams;

/* loaded from: SentShareAttachment.class */
public final class SentShareAttachment implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(50);
    public final Bundle A00;
    public final BM7 A01;
    public final Share A02;
    public final SendPaymentMessageParams A03;
    public final SendTamXMAMessageParams A04;

    public SentShareAttachment(BM7 bm7, Share share, SendPaymentMessageParams sendPaymentMessageParams) {
        this.A01 = bm7;
        this.A02 = share;
        this.A03 = sendPaymentMessageParams;
        this.A04 = null;
        this.A00 = null;
    }

    public SentShareAttachment(Bundle bundle, BM7 bm7, Share share, SendTamXMAMessageParams sendTamXMAMessageParams) {
        this.A01 = bm7;
        this.A04 = sendTamXMAMessageParams;
        this.A00 = bundle;
        this.A02 = share;
        this.A03 = null;
    }

    public SentShareAttachment(Parcel parcel) {
        BM7 bm7 = BM7.A03;
        BM7 A00 = BUM.A00(parcel.readString());
        A00.getClass();
        this.A01 = A00;
        this.A02 = (Share) 1BL.A0C(parcel, Share.class);
        this.A03 = (SendPaymentMessageParams) 1BL.A0C(parcel, SendPaymentMessageParams.class);
        this.A04 = (SendTamXMAMessageParams) 1BL.A0C(parcel, SendTamXMAMessageParams.class);
        this.A00 = (Bundle) 1BL.A0C(parcel, Bundle.class);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01.DBSerialValue);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A00, i);
    }
}
