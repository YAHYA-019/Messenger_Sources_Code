package com.facebook.messaginginblue.mtv.threadview.initparams;

import X.11T;
import X.1BL;
import X.4YV;
import X.82M;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass207;
import X.C04v;
import X.C97b;
import X.C97y;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.facebook.xapp.messaging.threadview.initparams.model.ThreadInitParamsMetadata;
import com.google.common.collect.ImmutableMap;

/* loaded from: MibThreadInitParamsMetadata.class */
public final class MibThreadInitParamsMetadata extends C04v implements ThreadInitParamsMetadata {
    public static final AnonymousClass207 A0I;
    public static final Parcelable.Creator CREATOR = new 82M(97);
    public final String A00;
    public final boolean A01;
    public final long A02;
    public final C97y A03;
    public final C97b A04;
    public final ImmutableMap A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A0I = new AnonymousClass207(MibThreadInitParamsMetadata.class, null);
    }

    public MibThreadInitParamsMetadata(C97y c97y, C97b c97b, ImmutableMap immutableMap, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        1BL.A1F(str, str2);
        11T.A0F(c97y, 5);
        11T.A0F(str6, 16);
        this.A07 = str;
        this.A00 = str2;
        this.A08 = str3;
        this.A02 = j;
        this.A03 = c97y;
        this.A0E = z;
        this.A0D = z2;
        this.A0F = z3;
        this.A0H = z4;
        this.A01 = z5;
        this.A05 = immutableMap;
        this.A0C = str4;
        this.A0A = str5;
        this.A04 = c97b;
        this.A0G = z6;
        this.A06 = str6;
        this.A09 = str7;
        this.A0B = str8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MibThreadInitParamsMetadata)) {
                return false;
            }
            MibThreadInitParamsMetadata mibThreadInitParamsMetadata = (MibThreadInitParamsMetadata) obj;
            if (!11T.A0O(this.A07, mibThreadInitParamsMetadata.A07) || !11T.A0O(this.A00, mibThreadInitParamsMetadata.A00) || !11T.A0O(this.A08, mibThreadInitParamsMetadata.A08) || this.A02 != mibThreadInitParamsMetadata.A02 || this.A03 != mibThreadInitParamsMetadata.A03 || this.A0E != mibThreadInitParamsMetadata.A0E || this.A0D != mibThreadInitParamsMetadata.A0D || this.A0F != mibThreadInitParamsMetadata.A0F || this.A0H != mibThreadInitParamsMetadata.A0H || this.A01 != mibThreadInitParamsMetadata.A01 || !11T.A0O(this.A05, mibThreadInitParamsMetadata.A05) || !11T.A0O(this.A0C, mibThreadInitParamsMetadata.A0C) || !11T.A0O(this.A0A, mibThreadInitParamsMetadata.A0A) || this.A04 != mibThreadInitParamsMetadata.A04 || this.A0G != mibThreadInitParamsMetadata.A0G || !11T.A0O(this.A06, mibThreadInitParamsMetadata.A06) || !11T.A0O(this.A09, mibThreadInitParamsMetadata.A09) || !11T.A0O(this.A0B, mibThreadInitParamsMetadata.A0B)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A07 = (AnonymousClass002.A07(this.A06, (((((((((((((((((((AnonymousClass002.A05(this.A03, AnonymousClass002.A02(this.A02, (AnonymousClass002.A07(this.A00, 4YV.A02(this.A07)) + 1BL.A05(this.A08)) * 31)) + AnonymousClass002.A00(this.A0E ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0D ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0F ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0H ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A01 ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A05)) * 31) + 1BL.A05(this.A0C)) * 31) + 1BL.A05(this.A0A)) * 31) + AnonymousClass001.A02(this.A04)) * 31) + AnonymousClass002.A00(this.A0G ? 1 : 0)) * 31) + 1BL.A05(this.A09)) * 31;
        String str = this.A0B;
        if (str != null) {
            i = str.hashCode();
        }
        return A07 + i;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MibThreadInitParamsMetadata(pluginKey=");
        A0k.append(this.A07);
        A0k.append(", entryPointTag=");
        A0k.append(this.A00);
        A0k.append(", productType=");
        A0k.append(this.A08);
        A0k.append(", instanceId=");
        A0k.append(this.A02);
        A0k.append(", threadPresentationStyle=");
        A0k.append(this.A03);
        A0k.append(", isBackToInbox=");
        A0k.append(this.A0E);
        A0k.append(", isBackToFeed=");
        A0k.append(this.A0D);
        A0k.append(", isPageThread=");
        A0k.append(this.A0F);
        A0k.append(", isVerified=");
        A0k.append(this.A0H);
        A0k.append(", isBottomSheetView=");
        A0k.append(this.A01);
        A0k.append(", perfLoggingAnnotations=");
        A0k.append(this.A05);
        A0k.append(", threadSessionId=");
        A0k.append(this.A0C);
        A0k.append(", referrerSessionId=");
        A0k.append(this.A0A);
        A0k.append(", genAiPromptType=");
        A0k.append(this.A04);
        A0k.append(", isThreadAiBot=");
        A0k.append(this.A0G);
        A0k.append(", codeEntryPoint=");
        A0k.append(this.A06);
        A0k.append(", qplJoinId=");
        A0k.append(this.A09);
        A0k.append(", storyTrackingInfo=");
        A0k.append(this.A0B);
        return 4YV.A0x(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A00);
        parcel.writeString(this.A08);
        parcel.writeLong(this.A02);
        1BL.A12(parcel, this.A03);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeSerializable(this.A05);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0A);
        C97b c97b = this.A04;
        if (c97b == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1BL.A12(parcel, c97b);
        }
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0B);
    }
}
