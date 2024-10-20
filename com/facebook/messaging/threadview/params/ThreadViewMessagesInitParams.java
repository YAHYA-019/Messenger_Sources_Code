package com.facebook.messaging.threadview.params;

import X.82M;
import X.BLU;
import X.C1239Abh;
import X.C53v;
import X.C5ap;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.business.bmcconversionfoundations.pdp.params.PdpInitParams;
import com.facebook.messaging.business.common.calltoaction.CallToActionContextParams;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.facebook.messaging.business.mdotme.model.PlatformRefParams;
import com.facebook.messaging.communitymessaging.adminonboarding.hintcard.HintCardParams;
import com.facebook.messaging.composer.params.ComposerInitParams;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.GroupThreadAssociatedFbGroup;

/* loaded from: ThreadViewMessagesInitParams.class */
public final class ThreadViewMessagesInitParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(93);
    public final Intent A00;
    public final PdpInitParams A01;
    public final CallToActionContextParams A02;
    public final CallToAction A03;
    public final PlatformRefParams A04;
    public final HintCardParams A05;
    public final ComposerInitParams A06;
    public final ThreadKey A07;
    public final GroupThreadAssociatedFbGroup A08;
    public final BLU A09;
    public final C5ap A0A;
    public final Integer A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;

    public ThreadViewMessagesInitParams(C1239Abh c1239Abh) {
        this.A06 = c1239Abh.A06;
        this.A0G = c1239Abh.A0G;
        this.A00 = c1239Abh.A00;
        this.A09 = c1239Abh.A09;
        this.A04 = c1239Abh.A04;
        this.A03 = c1239Abh.A03;
        this.A02 = c1239Abh.A02;
        this.A0E = c1239Abh.A0E;
        this.A0F = c1239Abh.A0F;
        this.A07 = c1239Abh.A07;
        this.A0B = c1239Abh.A0B;
        this.A0M = c1239Abh.A0M;
        this.A0L = c1239Abh.A0L;
        this.A0N = c1239Abh.A0N;
        this.A0K = c1239Abh.A0K;
        this.A08 = c1239Abh.A08;
        this.A0D = c1239Abh.A0D;
        this.A0C = c1239Abh.A0C;
        this.A0H = c1239Abh.A0H;
        this.A0A = c1239Abh.A0A;
        this.A0J = c1239Abh.A0J;
        this.A01 = c1239Abh.A01;
        this.A0I = c1239Abh.A0I;
        this.A05 = c1239Abh.A05;
    }

    public ThreadViewMessagesInitParams(Parcel parcel) {
        CallToAction callToAction;
        CallToActionContextParams callToActionContextParams;
        boolean z;
        GroupThreadAssociatedFbGroup groupThreadAssociatedFbGroup;
        ThreadKey threadKey;
        PdpInitParams pdpInitParams;
        this.A06 = (ComposerInitParams) parcel.readParcelable(ComposerInitParams.class.getClassLoader());
        this.A0G = parcel.readString();
        this.A00 = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.A09 = parcel.readSerializable();
        this.A04 = (PlatformRefParams) parcel.readParcelable(PlatformRefParams.class.getClassLoader());
        parcel.readInt();
        HintCardParams hintCardParams = null;
        try {
            callToAction = (CallToAction) parcel.readParcelable(CallToAction.class.getClassLoader());
            callToActionContextParams = (CallToActionContextParams) parcel.readParcelable(CallToActionContextParams.class.getClassLoader());
        } catch (BadParcelableException unused) {
            callToAction = null;
            callToActionContextParams = null;
        }
        this.A03 = callToAction;
        this.A02 = callToActionContextParams;
        this.A0E = parcel.readString();
        this.A0F = parcel.readString();
        this.A0B = C53v.A08(parcel);
        this.A0M = C53v.A0S(parcel);
        boolean z2 = false;
        try {
            z = C53v.A0S(parcel);
        } catch (BadParcelableException unused2) {
            z = false;
        }
        this.A0L = z;
        try {
            z2 = C53v.A0S(parcel);
        } catch (BadParcelableException unused3) {
        }
        this.A0N = z2;
        this.A0K = parcel.readString();
        try {
            groupThreadAssociatedFbGroup = (GroupThreadAssociatedFbGroup) parcel.readParcelable(GroupThreadAssociatedFbGroup.class.getClassLoader());
        } catch (BadParcelableException unused4) {
            groupThreadAssociatedFbGroup = null;
        }
        this.A08 = groupThreadAssociatedFbGroup;
        try {
            threadKey = (ThreadKey) parcel.readParcelable(ThreadKey.class.getClassLoader());
        } catch (BadParcelableException unused5) {
            threadKey = null;
        }
        this.A07 = threadKey;
        this.A0D = parcel.readString();
        this.A0C = parcel.readString();
        this.A0H = parcel.readString();
        this.A0A = (C5ap) C53v.A07(parcel, C5ap.class);
        this.A0J = parcel.readString();
        try {
            pdpInitParams = (PdpInitParams) parcel.readParcelable(PdpInitParams.class.getClassLoader());
        } catch (BadParcelableException unused6) {
            pdpInitParams = null;
        }
        this.A01 = pdpInitParams;
        this.A0I = parcel.readString();
        try {
            hintCardParams = (HintCardParams) parcel.readParcelable(HintCardParams.class.getClassLoader());
        } catch (BadParcelableException unused7) {
        }
        this.A05 = hintCardParams;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Abh] */
    public static C1239Abh A00() {
        return new Object();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A06, i);
        parcel.writeString(this.A0G);
        parcel.writeParcelable(this.A00, i);
        parcel.writeSerializable(this.A09);
        parcel.writeParcelable(this.A04, i);
        parcel.writeInt(0);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0F);
        C53v.A0K(parcel, this.A0B);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeString(this.A0K);
        parcel.writeParcelable(this.A08, i);
        parcel.writeParcelable(this.A07, i);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0H);
        C53v.A0J(parcel, this.A0A);
        parcel.writeString(this.A0J);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A0I);
        parcel.writeParcelable(this.A05, i);
    }
}
