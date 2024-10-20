package com.facebook.messaging.business.common.calltoaction;

import X.06Z;
import X.11T;
import X.5SW;
import X.BMF;
import X.C2qv;
import X.CFh;
import X.CSW;
import X.DEm;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.xapp.messaging.browser.model.MessengerWebViewParams;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;

/* loaded from: CallToActionContextParams.class */
public final class CallToActionContextParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(24);
    public 06Z A00;
    public DEm A01;
    public boolean A02;
    public final Bundle A03;
    public final BMF A04;
    public final Message A05;
    public final ThreadKey A06;
    public final ThreadSummary A07;
    public final NavigationTrigger A08;
    public final 5SW A09;
    public final MessengerWebViewParams A0A;
    public final ImmutableMap A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;

    public CallToActionContextParams(CFh cFh) {
        this.A00 = cFh.A01;
        this.A06 = cFh.A05;
        this.A07 = cFh.A06;
        this.A05 = cFh.A04;
        this.A01 = cFh.A03;
        this.A03 = cFh.A00;
        this.A08 = cFh.A07;
        this.A0E = cFh.A0C;
        this.A0F = cFh.A0D;
        this.A0D = cFh.A0B;
        this.A04 = cFh.A02;
        this.A09 = cFh.A08;
        this.A0A = cFh.A09;
        this.A0B = cFh.A0F.build();
        this.A02 = cFh.A0E;
        this.A0C = cFh.A0A;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x007c, code lost:
    
        if (r0.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CallToActionContextParams(android.os.Parcel r302) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.business.common.calltoaction.CallToActionContextParams.<init>(android.os.Parcel):void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof CallToActionContextParams)) {
                return false;
            }
            CallToActionContextParams callToActionContextParams = (CallToActionContextParams) obj;
            if (this.A02 == callToActionContextParams.A02 && C2qv.A01(this.A06, callToActionContextParams.A06) && C2qv.A01(this.A07, callToActionContextParams.A07) && C2qv.A01(this.A05, callToActionContextParams.A05) && C2qv.A01(this.A03, callToActionContextParams.A03) && C2qv.A01(this.A08, callToActionContextParams.A08) && C2qv.A01(this.A0C, callToActionContextParams.A0C) && C2qv.A01(this.A0E, callToActionContextParams.A0E) && C2qv.A01(this.A0F, callToActionContextParams.A0F) && C2qv.A01(this.A0D, callToActionContextParams.A0D) && this.A04 == callToActionContextParams.A04 && this.A09 == callToActionContextParams.A09 && C2qv.A01(this.A0A, callToActionContextParams.A0A) && C2qv.A01(this.A0B, callToActionContextParams.A0B) && C2qv.A01(this.A00, callToActionContextParams.A00) && C2qv.A01(this.A01, callToActionContextParams.A01)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A06, this.A07, this.A05, this.A03, this.A08, this.A0C, this.A0E, this.A0F, this.A0D, this.A04, this.A09, this.A0A, this.A0B, this.A00, this.A01, Boolean.valueOf(this.A02)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A06, i);
        parcel.writeParcelable(this.A07, i);
        parcel.writeParcelable(this.A05, i);
        parcel.writeBundle(this.A03);
        parcel.writeParcelable(this.A08, i);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0D);
        5SW r0 = this.A09;
        String str = null;
        parcel.writeString(r0 != null ? r0.name() : null);
        BMF bmf = this.A04;
        if (bmf != null) {
            str = bmf.name();
        }
        parcel.writeString(str);
        parcel.writeParcelable(this.A0A, i);
        parcel.writeSerializable(this.A0B);
        parcel.writeByte(this.A02 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A0C);
    }
}
