package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.4YV;
import X.AbH;
import X.AbI;
import X.AbJ;
import X.AbL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: ComposerPageTargetData.class */
public final class ComposerPageTargetData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(52);
    public final int A00;
    public final int A01;
    public final AdsAnimatorConfiguration A02;
    public final ComposerCallToAction A03;
    public final ComposerGetBookingsThirdPartyData A04;
    public final ComposerLocalAlertData A05;
    public final ComposerLocation A06;
    public final ComposerPostToInstagramData A07;
    public final MusicStickerEligibility A08;
    public final PagesComposerMigrationConfig A09;
    public final ImmutableList A0A;
    public final ImmutableList A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;
    public final boolean A0l;
    public final boolean A0m;
    public final boolean A0n;
    public final boolean A0o;
    public final boolean A0p;
    public final boolean A0q;
    public final boolean A0r;
    public final boolean A0s;
    public final boolean A0t;
    public final boolean A0u;
    public final boolean A0v;
    public final boolean A0w;
    public final boolean A0x;
    public final boolean A0y;
    public final boolean A0z;

    public ComposerPageTargetData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        ComposerPostToInstagramData composerPostToInstagramData = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (AdsAnimatorConfiguration) parcel.readParcelable(A0e);
        }
        this.A0K = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A00 = parcel.readInt();
        this.A0L = 1BM.A07(parcel);
        this.A0M = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            int i = 0;
            while (i < readInt) {
                i = AbH.A00(parcel, strArr, i);
            }
            this.A0A = ImmutableList.copyOf(strArr);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (ComposerGetBookingsThirdPartyData) parcel.readParcelable(A0e);
        }
        int readInt2 = parcel.readInt();
        ComposerPageShareSheetConfig[] composerPageShareSheetConfigArr = new ComposerPageShareSheetConfig[readInt2];
        int i2 = 0;
        while (i2 < readInt2) {
            i2 = AbI.A01(parcel, A0e, composerPageShareSheetConfigArr, i2);
        }
        this.A0B = ImmutableList.copyOf(composerPageShareSheetConfigArr);
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = parcel.readString();
        }
        this.A0N = 1BM.A07(parcel);
        this.A0O = 1BM.A07(parcel);
        this.A0E = parcel.readString();
        this.A0P = 1BM.A07(parcel);
        this.A0Q = 1BM.A07(parcel);
        this.A0R = 1BM.A07(parcel);
        this.A0S = 1BM.A07(parcel);
        this.A0T = 1BM.A07(parcel);
        this.A0U = 1BM.A07(parcel);
        this.A0V = 1BM.A07(parcel);
        this.A0W = 1BM.A07(parcel);
        this.A0X = 1BM.A07(parcel);
        this.A0Y = 1BM.A07(parcel);
        this.A0Z = 1BM.A07(parcel);
        this.A0a = 1BM.A07(parcel);
        this.A0b = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (ComposerLocalAlertData) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = (MusicStickerEligibility) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (ComposerCallToAction) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = (ComposerLocation) parcel.readParcelable(A0e);
        }
        this.A0G = parcel.readString();
        this.A0H = parcel.readString();
        this.A0I = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = (PagesComposerMigrationConfig) parcel.readParcelable(A0e);
        }
        this.A07 = parcel.readInt() != 0 ? (ComposerPostToInstagramData) parcel.readParcelable(A0e) : composerPostToInstagramData;
        this.A01 = parcel.readInt();
        this.A0c = 1BM.A07(parcel);
        this.A0d = 1BM.A07(parcel);
        this.A0e = 1BM.A07(parcel);
        this.A0f = 1BM.A07(parcel);
        this.A0g = 1BM.A07(parcel);
        this.A0h = 1BM.A07(parcel);
        this.A0i = 1BM.A07(parcel);
        this.A0j = 1BM.A07(parcel);
        this.A0k = 1BM.A07(parcel);
        this.A0l = 1BM.A07(parcel);
        this.A0m = 1BM.A07(parcel);
        this.A0n = 1BM.A07(parcel);
        this.A0o = 1BM.A07(parcel);
        this.A0p = 1BM.A07(parcel);
        this.A0q = 1BM.A07(parcel);
        this.A0r = 1BM.A07(parcel);
        this.A0s = 1BM.A07(parcel);
        this.A0t = 1BM.A07(parcel);
        this.A0u = 1BM.A07(parcel);
        this.A0v = 1BM.A07(parcel);
        this.A0w = 1BM.A07(parcel);
        this.A0x = 1BM.A07(parcel);
        this.A0y = 1BM.A07(parcel);
        this.A0z = AbJ.A1W(parcel);
        this.A0J = C3o5.A0O(parcel);
    }

    public ComposerPageTargetData(AdsAnimatorConfiguration adsAnimatorConfiguration, ComposerCallToAction composerCallToAction, ComposerGetBookingsThirdPartyData composerGetBookingsThirdPartyData, ComposerLocalAlertData composerLocalAlertData, ComposerLocation composerLocation, ComposerPostToInstagramData composerPostToInstagramData, MusicStickerEligibility musicStickerEligibility, PagesComposerMigrationConfig pagesComposerMigrationConfig, ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, boolean z32, boolean z33, boolean z34, boolean z35, boolean z36, boolean z37, boolean z38, boolean z39, boolean z40, boolean z41, boolean z42) {
        this.A02 = adsAnimatorConfiguration;
        this.A0K = z;
        this.A00 = i;
        this.A0L = z2;
        this.A0M = z3;
        this.A0A = immutableList;
        this.A04 = composerGetBookingsThirdPartyData;
        C1pq.A08("composerPageShareSheetConfigs", immutableList2);
        this.A0B = immutableList2;
        this.A0C = str;
        this.A0D = str2;
        this.A0N = z4;
        this.A0O = z5;
        C1pq.A08("entryPointSessionId", str3);
        this.A0E = str3;
        this.A0P = z6;
        this.A0Q = z7;
        this.A0R = z8;
        this.A0S = z9;
        this.A0T = z10;
        this.A0U = z11;
        this.A0V = z12;
        this.A0W = z13;
        this.A0X = z14;
        this.A0Y = z15;
        this.A0Z = z16;
        this.A0a = z17;
        this.A0b = z18;
        this.A05 = composerLocalAlertData;
        this.A08 = musicStickerEligibility;
        this.A0F = str4;
        this.A03 = composerCallToAction;
        this.A06 = composerLocation;
        C1pq.A08("pageName", str5);
        this.A0G = str5;
        C1pq.A08("pagePhoneNumber", str6);
        this.A0H = str6;
        C1pq.A08("pageProfilePicUrl", str7);
        this.A0I = str7;
        this.A09 = pagesComposerMigrationConfig;
        this.A07 = composerPostToInstagramData;
        this.A01 = i2;
        this.A0c = z19;
        this.A0d = z20;
        this.A0e = z21;
        this.A0f = z22;
        this.A0g = z23;
        this.A0h = z24;
        this.A0i = z25;
        this.A0j = z26;
        this.A0k = z27;
        this.A0l = z28;
        this.A0m = z29;
        this.A0n = z30;
        this.A0o = z31;
        this.A0p = z32;
        this.A0q = z33;
        this.A0r = z34;
        this.A0s = z35;
        this.A0t = z36;
        this.A0u = z37;
        this.A0v = z38;
        this.A0w = z39;
        this.A0x = z40;
        this.A0y = z41;
        this.A0z = z42;
        this.A0J = str8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerPageTargetData)) {
                return false;
            }
            ComposerPageTargetData composerPageTargetData = (ComposerPageTargetData) obj;
            if (!11T.A0O(this.A02, composerPageTargetData.A02) || this.A0K != composerPageTargetData.A0K || this.A00 != composerPageTargetData.A00 || this.A0L != composerPageTargetData.A0L || this.A0M != composerPageTargetData.A0M || !11T.A0O(this.A0A, composerPageTargetData.A0A) || !11T.A0O(this.A04, composerPageTargetData.A04) || !11T.A0O(this.A0B, composerPageTargetData.A0B) || !11T.A0O(this.A0C, composerPageTargetData.A0C) || !11T.A0O(this.A0D, composerPageTargetData.A0D) || this.A0N != composerPageTargetData.A0N || this.A0O != composerPageTargetData.A0O || !11T.A0O(this.A0E, composerPageTargetData.A0E) || this.A0P != composerPageTargetData.A0P || this.A0Q != composerPageTargetData.A0Q || this.A0R != composerPageTargetData.A0R || this.A0S != composerPageTargetData.A0S || this.A0T != composerPageTargetData.A0T || this.A0U != composerPageTargetData.A0U || this.A0V != composerPageTargetData.A0V || this.A0W != composerPageTargetData.A0W || this.A0X != composerPageTargetData.A0X || this.A0Y != composerPageTargetData.A0Y || this.A0Z != composerPageTargetData.A0Z || this.A0a != composerPageTargetData.A0a || this.A0b != composerPageTargetData.A0b || !11T.A0O(this.A05, composerPageTargetData.A05) || !11T.A0O(this.A08, composerPageTargetData.A08) || !11T.A0O(this.A0F, composerPageTargetData.A0F) || !11T.A0O(this.A03, composerPageTargetData.A03) || !11T.A0O(this.A06, composerPageTargetData.A06) || !11T.A0O(this.A0G, composerPageTargetData.A0G) || !11T.A0O(this.A0H, composerPageTargetData.A0H) || !11T.A0O(this.A0I, composerPageTargetData.A0I) || !11T.A0O(this.A09, composerPageTargetData.A09) || !11T.A0O(this.A07, composerPageTargetData.A07) || this.A01 != composerPageTargetData.A01 || this.A0c != composerPageTargetData.A0c || this.A0d != composerPageTargetData.A0d || this.A0e != composerPageTargetData.A0e || this.A0f != composerPageTargetData.A0f || this.A0g != composerPageTargetData.A0g || this.A0h != composerPageTargetData.A0h || this.A0i != composerPageTargetData.A0i || this.A0j != composerPageTargetData.A0j || this.A0k != composerPageTargetData.A0k || this.A0l != composerPageTargetData.A0l || this.A0m != composerPageTargetData.A0m || this.A0n != composerPageTargetData.A0n || this.A0o != composerPageTargetData.A0o || this.A0p != composerPageTargetData.A0p || this.A0q != composerPageTargetData.A0q || this.A0r != composerPageTargetData.A0r || this.A0s != composerPageTargetData.A0s || this.A0t != composerPageTargetData.A0t || this.A0u != composerPageTargetData.A0u || this.A0v != composerPageTargetData.A0v || this.A0w != composerPageTargetData.A0w || this.A0x != composerPageTargetData.A0x || this.A0y != composerPageTargetData.A0y || this.A0z != composerPageTargetData.A0z || !11T.A0O(this.A0J, composerPageTargetData.A0J)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A0J, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02((C1pq.A04(this.A07, C1pq.A04(this.A09, C1pq.A04(this.A0I, C1pq.A04(this.A0H, C1pq.A04(this.A0G, C1pq.A04(this.A06, C1pq.A04(this.A03, C1pq.A04(this.A0F, C1pq.A04(this.A08, C1pq.A04(this.A05, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A0E, C1pq.A02(C1pq.A02(C1pq.A04(this.A0D, C1pq.A04(this.A0C, C1pq.A04(this.A0B, C1pq.A04(this.A04, C1pq.A04(this.A0A, C1pq.A02(C1pq.A02((C1pq.A02(C1pq.A03(this.A02), this.A0K) * 31) + this.A00, this.A0L), this.A0M)))))), this.A0N), this.A0O)), this.A0P), this.A0Q), this.A0R), this.A0S), this.A0T), this.A0U), this.A0V), this.A0W), this.A0X), this.A0Y), this.A0Z), this.A0a), this.A0b))))))))))) * 31) + this.A01, this.A0c), this.A0d), this.A0e), this.A0f), this.A0g), this.A0h), this.A0i), this.A0j), this.A0k), this.A0l), this.A0m), this.A0n), this.A0o), this.A0p), this.A0q), this.A0r), this.A0s), this.A0t), this.A0u), this.A0v), this.A0w), this.A0x), this.A0y), this.A0z));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A02, i);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A0M ? 1 : 0);
        ImmutableList immutableList = this.A0A;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                C3o5.A0h(parcel, A0Y);
            }
        }
        C3o5.A0d(parcel, this.A04, i);
        1Du A0b = 1BL.A0b(parcel, this.A0B);
        while (A0b.hasNext()) {
            parcel.writeParcelable((ComposerPageShareSheetConfig) A0b.next(), i);
        }
        1BL.A13(parcel, this.A0C);
        1BL.A13(parcel, this.A0D);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeString(this.A0E);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeInt(this.A0R ? 1 : 0);
        parcel.writeInt(this.A0S ? 1 : 0);
        parcel.writeInt(this.A0T ? 1 : 0);
        parcel.writeInt(this.A0U ? 1 : 0);
        parcel.writeInt(this.A0V ? 1 : 0);
        parcel.writeInt(this.A0W ? 1 : 0);
        parcel.writeInt(this.A0X ? 1 : 0);
        parcel.writeInt(this.A0Y ? 1 : 0);
        parcel.writeInt(this.A0Z ? 1 : 0);
        parcel.writeInt(this.A0a ? 1 : 0);
        parcel.writeInt(this.A0b ? 1 : 0);
        C3o5.A0d(parcel, this.A05, i);
        C3o5.A0d(parcel, this.A08, i);
        1BL.A13(parcel, this.A0F);
        C3o5.A0d(parcel, this.A03, i);
        C3o5.A0d(parcel, this.A06, i);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0I);
        C3o5.A0d(parcel, this.A09, i);
        C3o5.A0d(parcel, this.A07, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A0c ? 1 : 0);
        parcel.writeInt(this.A0d ? 1 : 0);
        parcel.writeInt(this.A0e ? 1 : 0);
        parcel.writeInt(this.A0f ? 1 : 0);
        parcel.writeInt(this.A0g ? 1 : 0);
        parcel.writeInt(this.A0h ? 1 : 0);
        parcel.writeInt(this.A0i ? 1 : 0);
        parcel.writeInt(this.A0j ? 1 : 0);
        parcel.writeInt(this.A0k ? 1 : 0);
        parcel.writeInt(this.A0l ? 1 : 0);
        parcel.writeInt(this.A0m ? 1 : 0);
        parcel.writeInt(this.A0n ? 1 : 0);
        parcel.writeInt(this.A0o ? 1 : 0);
        parcel.writeInt(this.A0p ? 1 : 0);
        parcel.writeInt(this.A0q ? 1 : 0);
        parcel.writeInt(this.A0r ? 1 : 0);
        parcel.writeInt(this.A0s ? 1 : 0);
        parcel.writeInt(this.A0t ? 1 : 0);
        parcel.writeInt(this.A0u ? 1 : 0);
        parcel.writeInt(this.A0v ? 1 : 0);
        parcel.writeInt(this.A0w ? 1 : 0);
        parcel.writeInt(this.A0x ? 1 : 0);
        parcel.writeInt(this.A0y ? 1 : 0);
        parcel.writeInt(this.A0z ? 1 : 0);
        1BL.A13(parcel, this.A0J);
    }
}
