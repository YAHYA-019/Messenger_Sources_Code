package com.facebook.messaging.business.common.calltoaction.model;

import X.11T;
import X.1BL;
import X.C4Nc;
import X.C4Nd;
import X.C4Ne;
import X.C4Ny;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.util.StringLocaleUtil;
import com.facebook.messaging.business.mdotme.model.PlatformRefParams;
import com.facebook.xapp.messaging.browser.model.MessengerWebViewParams;
import java.util.Arrays;

/* loaded from: CallToAction.class */
public class CallToAction implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4Ny(4);
    public final Uri A00;
    public final Uri A01;
    public final CTACustomerFeedback A02;
    public final CTAInformationIdentify A03;
    public final CTAPaymentInfo A04;
    public final CTAUserConfirmation A05;
    public final C4Ne A06;
    public final C4Nc A07;
    public final CallToActionSimpleTarget A08;
    public final PlatformRefParams A09;
    public final MessengerWebViewParams A0A;
    public final Long A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    public CallToAction(C4Nd c4Nd) {
        this.A0E = c4Nd.A0E;
        this.A0I = c4Nd.A0I;
        this.A00 = c4Nd.A00;
        this.A01 = c4Nd.A01;
        this.A07 = c4Nd.A07;
        this.A08 = c4Nd.A08;
        this.A0K = c4Nd.A0L;
        this.A0J = c4Nd.A0J;
        this.A0L = c4Nd.A0K;
        this.A05 = c4Nd.A05;
        this.A04 = c4Nd.A04;
        this.A03 = c4Nd.A03;
        this.A09 = c4Nd.A09;
        this.A0F = c4Nd.A0F;
        this.A0A = c4Nd.A0A;
        this.A0G = c4Nd.A0G;
        this.A06 = c4Nd.A06;
        this.A02 = c4Nd.A02;
        this.A0D = c4Nd.A0D;
        this.A0B = c4Nd.A0B;
        this.A0H = c4Nd.A0H;
        this.A0C = c4Nd.A0C;
    }

    public CallToAction(Parcel parcel) {
        C4Nc c4Nc;
        this.A0E = parcel.readString();
        this.A0I = parcel.readString();
        this.A00 = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.A01 = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        String readString = parcel.readString();
        boolean z = false;
        if (readString == null || readString.length() == 0) {
            c4Nc = null;
        } else {
            c4Nc = null;
            try {
                c4Nc = C4Nc.valueOf(readString);
            } catch (IllegalArgumentException unused) {
            }
        }
        this.A07 = c4Nc;
        this.A08 = (CallToActionSimpleTarget) parcel.readParcelable(CallToActionSimpleTarget.class.getClassLoader());
        this.A0K = parcel.readInt() == 1;
        this.A0J = parcel.readInt() == 1;
        this.A0L = parcel.readInt() == 1 ? true : z;
        this.A05 = (CTAUserConfirmation) parcel.readParcelable(CTAUserConfirmation.class.getClassLoader());
        this.A04 = (CTAPaymentInfo) parcel.readParcelable(CTAPaymentInfo.class.getClassLoader());
        this.A03 = (CTAInformationIdentify) parcel.readParcelable(CTAInformationIdentify.class.getClassLoader());
        this.A09 = (PlatformRefParams) parcel.readParcelable(PlatformRefParams.class.getClassLoader());
        this.A0F = parcel.readString();
        this.A0A = (MessengerWebViewParams) parcel.readParcelable(MessengerWebViewParams.class.getClassLoader());
        this.A0G = parcel.readString();
        this.A06 = (C4Ne) parcel.readSerializable();
        this.A02 = (CTACustomerFeedback) parcel.readParcelable(CTACustomerFeedback.class.getClassLoader());
        this.A0D = parcel.readString();
        this.A0B = (Long) parcel.readValue(Long.TYPE.getClassLoader());
        this.A0H = parcel.readString();
        this.A0C = parcel.readString();
    }

    public final String A00() {
        String str = this.A0I;
        if (str == null) {
            return "";
        }
        String upperCaseLocaleSafe = StringLocaleUtil.toUpperCaseLocaleSafe(str);
        11T.A0A(upperCaseLocaleSafe);
        return upperCaseLocaleSafe;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !1BL.A1V(this, obj)) {
                return false;
            }
            CallToAction callToAction = (CallToAction) obj;
            if (this.A0K != callToAction.A0K || this.A0J != callToAction.A0J || this.A0L != callToAction.A0L || !11T.A0O(this.A0E, callToAction.A0E) || !11T.A0O(this.A0I, callToAction.A0I) || !11T.A0O(this.A00, callToAction.A00) || !11T.A0O(this.A01, callToAction.A01) || this.A07 != callToAction.A07 || !11T.A0O(this.A08, callToAction.A08) || !11T.A0O(this.A05, callToAction.A05) || !11T.A0O(this.A04, callToAction.A04) || !11T.A0O(this.A03, callToAction.A03) || !11T.A0O(this.A0F, callToAction.A0F) || !11T.A0O(this.A0A, callToAction.A0A) || !11T.A0O(this.A0G, callToAction.A0G) || this.A06 != callToAction.A06 || !11T.A0O(this.A02, callToAction.A02) || !11T.A0O(this.A0D, callToAction.A0D) || !11T.A0O(this.A0B, callToAction.A0B) || !11T.A0O(this.A0H, callToAction.A0H) || !11T.A0O(this.A0C, callToAction.A0C)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.A0E, this.A0I, this.A00, this.A01, this.A07, this.A08, Boolean.valueOf(this.A0K), Boolean.valueOf(this.A0J), Boolean.valueOf(this.A0L), this.A05, this.A04, this.A03, this.A0F, this.A0A, this.A0G, this.A06, this.A02, this.A0D, this.A0B, this.A0H, this.A0C});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0I);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        C4Nc c4Nc = this.A07;
        parcel.writeString(c4Nc != null ? c4Nc.name() : null);
        parcel.writeParcelable(this.A08, i);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A09, i);
        parcel.writeString(this.A0F);
        parcel.writeParcelable(this.A0A, i);
        parcel.writeString(this.A0G);
        parcel.writeSerializable(this.A06);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A0D);
        parcel.writeValue(this.A0B);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0C);
    }
}
