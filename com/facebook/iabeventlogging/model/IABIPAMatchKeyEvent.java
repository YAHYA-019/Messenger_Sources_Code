package com.facebook.iabeventlogging.model;

import X.0Oa;
import X.11T;
import X.AnonymousClass001;
import X.DKH;
import X.KOk;
import android.os.Parcel;

/* loaded from: IABIPAMatchKeyEvent.class */
public final class IABIPAMatchKeyEvent extends IABEvent {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final String A04;
    public final String A05;
    public final 0Oa A06;

    public IABIPAMatchKeyEvent(String str, String str2, 0Oa r304, long j, long j2, long j3, long j4) {
        super(KOk.A0B, str, j, j2);
        this.A05 = str;
        this.A03 = j;
        this.A01 = j2;
        this.A06 = r304;
        this.A02 = j3;
        this.A00 = j4;
        this.A04 = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o("IABOpenSecureInfoPopupEvent{");
        DKH.A1I(this, "type=", A0o);
        DKH.A1T(A0o, this.A05);
        A0o.append(this.A03);
        A0o.append(", createdAtTs=");
        A0o.append(this.A01);
        A0o.append(", firstMatchKey=");
        0Oa r0 = this.A06;
        A0o.append((String) r0.first);
        A0o.append(", secondMatchKey=");
        A0o.append((String) r0.second);
        A0o.append(", thirdMatchKey=");
        A0o.append((String) r0.third);
        A0o.append(", elapsedTime=");
        A0o.append(this.A02);
        A0o.append(", adId=");
        A0o.append(this.A00);
        A0o.append(", clickId=");
        A0o.append(this.A04);
        String A0f = AnonymousClass001.A0f(A0o);
        11T.A0A(A0f);
        return A0f;
    }

    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        super.writeToParcel(parcel, i);
        0Oa r0 = this.A06;
        parcel.writeString((String) r0.first);
        parcel.writeString((String) r0.second);
        parcel.writeString((String) r0.third);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A04);
    }
}
