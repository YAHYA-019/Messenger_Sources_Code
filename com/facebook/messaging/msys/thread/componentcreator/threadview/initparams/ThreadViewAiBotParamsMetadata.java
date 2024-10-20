package com.facebook.messaging.msys.thread.componentcreator.threadview.initparams;

import X.11T;
import X.1BL;
import X.5SW;
import X.7zK;
import X.82M;
import X.AnonymousClass207;
import X.C04v;
import X.C3o5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.aibot.nux.model.AiBotNuxStatus;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.facebook.xapp.messaging.threadview.initparams.model.ThreadInitParamsMetadata;
import java.util.ArrayList;

/* loaded from: ThreadViewAiBotParamsMetadata.class */
public final class ThreadViewAiBotParamsMetadata extends C04v implements ThreadInitParamsMetadata {
    public static final AnonymousClass207 A0Q;
    public static final Parcelable.Creator CREATOR = new 82M(68);
    public final AiBotNuxStatus A00;
    public final Integer A01;
    public final Long A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final 5SW A0F;
    public final Integer A0G;
    public final ArrayList A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A0Q = new AnonymousClass207(ThreadViewAiBotParamsMetadata.class, null);
    }

    public ThreadViewAiBotParamsMetadata() {
        this(null, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
    }

    public ThreadViewAiBotParamsMetadata(AiBotNuxStatus aiBotNuxStatus, 5SW r303, Integer num, Integer num2, Long l, ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20) {
        this.A08 = z;
        this.A0E = z2;
        this.A07 = z3;
        this.A0D = z4;
        this.A0F = r303;
        this.A00 = aiBotNuxStatus;
        this.A04 = z5;
        this.A01 = num;
        this.A09 = z6;
        this.A0A = z7;
        this.A06 = z8;
        this.A0B = z9;
        this.A02 = l;
        this.A0M = z10;
        this.A0N = z11;
        this.A0H = arrayList;
        this.A0L = z12;
        this.A03 = z13;
        this.A0C = z14;
        this.A0J = z15;
        this.A0I = z16;
        this.A0O = z17;
        this.A0K = z18;
        this.A0P = z19;
        this.A05 = z20;
        this.A0G = num2;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "META_AI_FAB";
            case 2:
                return "META_AI_TAB";
            case 3:
                return 7zK.A00(186);
            default:
                return 7zK.A00(198);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ThreadViewAiBotParamsMetadata)) {
                return false;
            }
            ThreadViewAiBotParamsMetadata threadViewAiBotParamsMetadata = (ThreadViewAiBotParamsMetadata) obj;
            if (this.A08 != threadViewAiBotParamsMetadata.A08 || this.A0E != threadViewAiBotParamsMetadata.A0E || this.A07 != threadViewAiBotParamsMetadata.A07 || this.A0D != threadViewAiBotParamsMetadata.A0D || this.A0F != threadViewAiBotParamsMetadata.A0F || !11T.A0O(this.A00, threadViewAiBotParamsMetadata.A00) || this.A04 != threadViewAiBotParamsMetadata.A04 || this.A01 != threadViewAiBotParamsMetadata.A01 || this.A09 != threadViewAiBotParamsMetadata.A09 || this.A0A != threadViewAiBotParamsMetadata.A0A || this.A06 != threadViewAiBotParamsMetadata.A06 || this.A0B != threadViewAiBotParamsMetadata.A0B || !11T.A0O(this.A02, threadViewAiBotParamsMetadata.A02) || this.A0M != threadViewAiBotParamsMetadata.A0M || this.A0N != threadViewAiBotParamsMetadata.A0N || !11T.A0O(this.A0H, threadViewAiBotParamsMetadata.A0H) || this.A0L != threadViewAiBotParamsMetadata.A0L || this.A03 != threadViewAiBotParamsMetadata.A03 || this.A0C != threadViewAiBotParamsMetadata.A0C || this.A0J != threadViewAiBotParamsMetadata.A0J || this.A0I != threadViewAiBotParamsMetadata.A0I || this.A0O != threadViewAiBotParamsMetadata.A0O || this.A0K != threadViewAiBotParamsMetadata.A0K || this.A0P != threadViewAiBotParamsMetadata.A0P || this.A05 != threadViewAiBotParamsMetadata.A05 || !11T.A0O(this.A0G, threadViewAiBotParamsMetadata.A0G)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1237;
        if (this.A08) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A0E) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A07) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A0D) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        5SW r0 = this.A0F;
        int i9 = 0;
        int hashCode = (i8 + (r0 == null ? 0 : r0.hashCode())) * 31;
        AiBotNuxStatus aiBotNuxStatus = this.A00;
        int hashCode2 = (hashCode + (aiBotNuxStatus == null ? 0 : aiBotNuxStatus.hashCode())) * 31;
        int i10 = 1237;
        if (this.A04) {
            i10 = 1231;
        }
        int i11 = (hashCode2 + i10) * 31;
        Integer num = this.A01;
        int hashCode3 = (i11 + (num == null ? 0 : A00(num).hashCode() + num.intValue())) * 31;
        int i12 = 1237;
        if (this.A09) {
            i12 = 1231;
        }
        int i13 = (hashCode3 + i12) * 31;
        int i14 = 1237;
        if (this.A0A) {
            i14 = 1231;
        }
        int i15 = (i13 + i14) * 31;
        int i16 = 1237;
        if (this.A06) {
            i16 = 1231;
        }
        int i17 = (i15 + i16) * 31;
        int i18 = 1237;
        if (this.A0B) {
            i18 = 1231;
        }
        int i19 = (i17 + i18) * 31;
        Long l = this.A02;
        int hashCode4 = (i19 + (l == null ? 0 : l.hashCode())) * 31;
        int i20 = 1237;
        if (this.A0M) {
            i20 = 1231;
        }
        int i21 = (hashCode4 + i20) * 31;
        int i22 = 1237;
        if (this.A0N) {
            i22 = 1231;
        }
        int i23 = (i21 + i22) * 31;
        ArrayList arrayList = this.A0H;
        int hashCode5 = (i23 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        int i24 = 1237;
        if (this.A0L) {
            i24 = 1231;
        }
        int i25 = (hashCode5 + i24) * 31;
        int i26 = 1237;
        if (this.A03) {
            i26 = 1231;
        }
        int i27 = (i25 + i26) * 31;
        int i28 = 1237;
        if (this.A0C) {
            i28 = 1231;
        }
        int i29 = (i27 + i28) * 31;
        int i30 = 1237;
        if (this.A0J) {
            i30 = 1231;
        }
        int i31 = (i29 + i30) * 31;
        int i32 = 1237;
        if (this.A0I) {
            i32 = 1231;
        }
        int i33 = (i31 + i32) * 31;
        int i34 = 1237;
        if (this.A0O) {
            i34 = 1231;
        }
        int i35 = (i33 + i34) * 31;
        int i36 = 1237;
        if (this.A0K) {
            i36 = 1231;
        }
        int i37 = (i35 + i36) * 31;
        int i38 = 1237;
        if (this.A0P) {
            i38 = 1231;
        }
        int i39 = (i37 + i38) * 31;
        int i40 = 1237;
        if (this.A05) {
            i40 = 1231;
        }
        int i41 = (i39 + i40) * 31;
        Integer num2 = this.A0G;
        if (num2 != null) {
            i9 = num2.hashCode();
        }
        return i41 + i9;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        5SW r0 = this.A0F;
        if (r0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1BL.A12(parcel, r0);
        }
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A04 ? 1 : 0);
        Integer num = this.A01;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(A00(num));
        }
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        C3o5.A0g(parcel, this.A02);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeStringList(this.A0H);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        C3o5.A0f(parcel, this.A0G);
    }
}
