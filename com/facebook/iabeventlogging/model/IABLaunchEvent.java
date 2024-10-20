package com.facebook.iabeventlogging.model;

import X.AnonymousClass001;
import X.DKG;
import X.EOw;
import X.JR0;
import X.KOk;
import android.os.Parcel;
import com.facebook.browser.iabcontext.IabCommonTrait;
import com.facebook.privacy.zone.api.ZonedValue;
import java.util.Arrays;
import java.util.List;

/* loaded from: IABLaunchEvent.class */
public final class IABLaunchEvent extends IABEvent {
    public final long A00;
    public final long A01;
    public final IabCommonTrait A02;
    public final ZonedValue A03;
    public final String A04;
    public final String A05;
    public final List A06;

    public IABLaunchEvent(IabCommonTrait iabCommonTrait, ZonedValue zonedValue, String str, String str2, String str3, List list, long j, long j2, long j3, long j4) {
        super(KOk.A0G, str, j, j2);
        this.A03 = zonedValue;
        this.A01 = j3;
        this.A04 = str2;
        this.A00 = j4;
        this.A06 = list;
        this.A02 = iabCommonTrait;
        this.A05 = str3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o("IABLaunchEvent{");
        A0o.append("userClickTs=");
        A0o.append(this.A01);
        A0o.append(", clickSource='");
        char A00 = JR0.A00(this.A04, A0o);
        A0o.append(", flags=");
        A0o.append(this.A00);
        IABEvent.A01(this, A0o, A00);
        A0o.append(super.A00);
        A0o.append(", eligibleExperiences=");
        List list = this.A06;
        String[] strArr = new String[list.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                A0o.append(Arrays.toString(strArr));
                DKG.A1X(A0o, ", iabViewModeLaunchConfig=");
                A0o.append(", iabContext=");
                A0o.append(this.A02);
                A0o.append(", extraInfo=");
                A0o.append(this.A05);
                return AnonymousClass001.A0f(A0o);
            }
            strArr[i2] = ((EOw) list.get(i2)).value;
            i = i2 + 1;
        }
    }

    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A00);
        List list = this.A06;
        String[] strArr = new String[list.size()];
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= list.size()) {
                parcel.writeStringArray(strArr);
                parcel.writeParcelable(null, i);
                parcel.writeParcelable(this.A02, i);
                parcel.writeString(this.A05);
                return;
            }
            strArr[i3] = ((EOw) list.get(i3)).value;
            i2 = i3 + 1;
        }
    }
}
