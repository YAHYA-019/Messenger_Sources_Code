package com.facebook.iabeventlogging.model;

import X.AnonymousClass001;
import X.JR0;
import X.KOk;
import android.os.Parcel;
import com.facebook.privacy.zone.api.ZonedValue;
import com.facebook.privacy.zone.policy.ZonePolicy;
import java.util.ArrayList;

/* loaded from: IABFirstPauseEvent.class */
public final class IABFirstPauseEvent extends IABEvent {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final long A0D;
    public final long A0E;
    public final ZonedValue A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final ArrayList A0J;
    public final boolean A0K;
    public final boolean A0L;

    public IABFirstPauseEvent(ZonedValue zonedValue, String str, String str2, String str3, String str4, ArrayList arrayList, int i, int i2, int i3, int i4, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z, boolean z2) {
        super(KOk.A07, str, j, j2);
        this.A07 = j10;
        this.A08 = j11;
        this.A0D = j3;
        this.A0E = j4;
        this.A05 = j5;
        this.A0C = j6;
        this.A06 = j7;
        this.A09 = j8;
        this.A0A = j9;
        this.A04 = j;
        this.A0J = arrayList;
        this.A0F = zonedValue == null ? new ZonedValue(ZonePolicy.A03, "") : zonedValue;
        this.A0I = str2;
        this.A0G = str3;
        this.A00 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A01 = i4;
        this.A0K = z;
        this.A0H = str4;
        this.A0L = z2;
        this.A0B = j12;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o("IABFirstPauseEvent{");
        A0o.append("userClickTs=");
        A0o.append(this.A0D);
        A0o.append(", webRequestStartedTs=");
        A0o.append(this.A0E);
        A0o.append(", browserOpenTs=");
        A0o.append(this.A05);
        A0o.append(", scrollReadyTs=");
        A0o.append(this.A0C);
        A0o.append(", landingPageDomContentLoadedTs=");
        A0o.append(this.A06);
        A0o.append(", landingPageLoadedTs=");
        A0o.append(this.A09);
        A0o.append(", landingPageViewEndedTs=");
        A0o.append(this.A0A);
        A0o.append(", browserCloseTs=");
        A0o.append(this.A04);
        A0o.append(", backgroundTimePairs=");
        A0o.append(this.A0J);
        A0o.append(", initialLandUrl='");
        char A00 = JR0.A00(this.A0I, A0o);
        A0o.append(", clickSource='");
        A0o.append(this.A0G);
        A0o.append(A00);
        A0o.append(", dismissMethod=");
        A0o.append(this.A00);
        A0o.append(", landingPageStatusCode=");
        A0o.append(this.A02);
        A0o.append(", sslErrorCode=");
        A0o.append(this.A03);
        A0o.append(", interactionCount=");
        A0o.append(this.A01);
        IABEvent.A01(this, A0o, A00);
        A0o.append(super.A00);
        A0o.append(", isInitialUrlIsOpenApp=");
        A0o.append(this.A0K);
        A0o.append(", deepLinkUrl=");
        A0o.append(this.A0H);
        A0o.append(", shouldUseLEDesign=");
        A0o.append(this.A0L);
        A0o.append(", landingPageFirstContentfulPaintTs=");
        A0o.append(this.A07);
        A0o.append(", landingPageLargestContentfulPaintTs=");
        A0o.append(this.A08);
        A0o.append(", maxInteractionDelayMs=");
        A0o.append(this.A0B);
        return AnonymousClass001.A0f(A0o);
    }

    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.A0D);
        parcel.writeLong(this.A0E);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A0C);
        parcel.writeLong(this.A06);
        parcel.writeLong(this.A09);
        parcel.writeLong(this.A0A);
        parcel.writeList(this.A0J);
        parcel.writeParcelable(this.A0F, i);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0G);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeByte(this.A0K ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A0H);
        parcel.writeByte(this.A0L ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A07);
        parcel.writeLong(this.A08);
        parcel.writeLong(this.A0B);
    }
}
