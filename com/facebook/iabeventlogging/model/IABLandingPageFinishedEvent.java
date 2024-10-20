package com.facebook.iabeventlogging.model;

import X.11T;
import X.AnonymousClass001;
import X.JR0;
import X.KOk;
import android.os.Parcel;
import com.facebook.privacy.zone.api.ZonedValue;
import java.util.List;

/* loaded from: IABLandingPageFinishedEvent.class */
public final class IABLandingPageFinishedEvent extends IABEvent {
    public final ZonedValue A00;
    public final String A01;
    public final long A02;
    public final List A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IABLandingPageFinishedEvent(ZonedValue zonedValue, String str, String str2, List list, long j, long j2) {
        super(KOk.A0C, str, j, j2);
        11T.A0F(str, 1);
        this.A02 = j2;
        this.A00 = zonedValue;
        this.A01 = str2;
        this.A03 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o("IABLandingPageFinishedEvent{");
        A0o.append("zonedInitialUrl='");
        char A00 = JR0.A00("--zone_wrapped_value--", A0o);
        A0o.append(", initialLandUrl='");
        A0o.append(this.A01);
        A0o.append(A00);
        IABEvent.A01(this, A0o, A00);
        A0o.append(this.A02);
        A0o.append(", postClickEligibleExperienceTypes=");
        A0o.append(this.A03);
        String A0f = AnonymousClass001.A0f(A0o);
        11T.A0A(A0f);
        return A0f;
    }

    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeList(this.A03);
    }
}
