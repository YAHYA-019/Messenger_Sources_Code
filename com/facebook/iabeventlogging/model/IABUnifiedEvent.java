package com.facebook.iabeventlogging.model;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.C3o5;
import X.DKH;
import X.EW2;
import X.KOk;
import X.KOr;
import android.os.Parcel;

/* loaded from: IABUnifiedEvent.class */
public final class IABUnifiedEvent extends IABEvent {
    public final long A00;
    public final long A01;
    public final KOr A02;
    public final Integer A03;
    public final String A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IABUnifiedEvent(KOr kOr, Integer num, String str, String str2, long j, long j2) {
        super(KOk.A0Q, str, j, j2);
        C3o5.A0k(str, 1, num);
        this.A05 = str;
        this.A01 = j;
        this.A00 = j2;
        this.A02 = kOr;
        this.A03 = num;
        this.A04 = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o("IABUnifiedEvent{");
        DKH.A1I(this, ", type=", A0o);
        DKH.A1T(A0o, this.A05);
        A0o.append(this.A01);
        A0o.append(", createdAtTs=");
        A0o.append(this.A00);
        A0o.append(", unifiedEventName=");
        A0o.append(this.A02);
        A0o.append(", unifiedEventCategory=");
        A0o.append(EW2.A00(this.A03));
        A0o.append(", reason=");
        A0o.append(this.A04);
        String A0f = AnonymousClass001.A0f(A0o);
        11T.A0A(A0f);
        return A0f;
    }

    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        super.writeToParcel(parcel, i);
        1BL.A12(parcel, this.A02);
        parcel.writeString(EW2.A00(this.A03));
        parcel.writeString(this.A04);
    }
}
