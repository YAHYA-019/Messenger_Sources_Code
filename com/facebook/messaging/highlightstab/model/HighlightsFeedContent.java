package com.facebook.messaging.highlightstab.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.4YW;
import X.5Yu;
import X.5cH;
import X.5cI;
import X.5cN;
import X.5cO;
import X.5cP;
import X.5cQ;
import X.5cR;
import X.5cS;
import X.5cT;
import X.82M;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass831;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C04v;
import X.C0ty;
import X.C3o5;
import X.C7wn;
import X.C7xs;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.common.dextricks.Constants;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: HighlightsFeedContent.class */
public final class HighlightsFeedContent extends C04v implements Parcelable {
    public static final 5Yu[] A0t;
    public int A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public String A04;
    public final int A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Double A08;
    public final Integer A09;
    public final Integer A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Long A0F;
    public final Long A0G;
    public final Long A0H;
    public final Long A0I;
    public final Long A0J;
    public final Long A0K;
    public final Long A0L;
    public final Long A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;
    public final String A0X;
    public final String A0Y;
    public final String A0Z;
    public final String A0a;
    public final String A0b;
    public final String A0c;
    public final String A0d;
    public final String A0e;
    public final String A0f;
    public final List A0g;
    public final List A0h;
    public final List A0i;
    public final List A0j;
    public final List A0k;
    public final List A0l;
    public final List A0m;
    public final List A0n;
    public final C01i A0o;
    public final boolean A0p;
    public final boolean A0q;
    public final C01i A0r;
    public final C01i A0s;
    public static final Companion Companion = new Object();
    public static final Parcelable.Creator CREATOR = new 82M(35);

    /* loaded from: HighlightsFeedContent$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return C7wn.A00;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.messaging.highlightstab.model.HighlightsFeedContent$Companion, java.lang.Object] */
    static {
        5Yu[] r0 = new 5Yu[52];
        System.arraycopy(new 5Yu[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}, 0, r0, 0, 27);
        5Yu r02 = new 5cI(5cH.A00);
        5Yu r03 = new 5cI(5cN.A00);
        5Yu r04 = new 5cI(5cO.A00);
        5cP r05 = 5cP.A00;
        System.arraycopy(new 5Yu[]{null, r02, r03, r04, new 5cI(r05), new 5cI(r05), new 5cI(5cQ.A00), new 5cI(5cR.A00), new 5cI(5cS.A00), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}, 0, r0, 27, 25);
        A0t = r0;
    }

    public /* synthetic */ HighlightsFeedContent(Boolean bool, Boolean bool2, Double d, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        List list9 = list8;
        int i5 = i4;
        List list10 = list7;
        List list11 = list3;
        List list12 = list2;
        List list13 = list;
        List list14 = list6;
        List list15 = list5;
        List list16 = list4;
        if (7 != (i & 7)) {
            int[] iArr = {i, i2};
            int[] iArr2 = {7, 0};
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = C7wn.A01;
            11T.A0F(pluginGeneratedSerialDescriptor, 2);
            ArrayList A0s = AnonymousClass001.A0s();
            int i6 = 0;
            do {
                int i7 = iArr2[i6] & (iArr[i6] ^ (-1));
                if (i7 != 0) {
                    int i8 = 0;
                    do {
                        if ((i7 & 1) != 0) {
                            A0s.add(pluginGeneratedSerialDescriptor.A08[(i6 * 32) + i8]);
                        }
                        i7 >>>= 1;
                        i8++;
                    } while (i8 < 32);
                }
                i6++;
            } while (i6 < 2);
            throw new C7xs("com.facebook.messaging.highlightstab.model.HighlightsFeedContent", A0s);
        }
        this.A0P = str;
        this.A0Z = str2;
        this.A05 = i3;
        if ((i & 8) == 0) {
            this.A0d = null;
        } else {
            this.A0d = str3;
        }
        if ((i & 16) == 0) {
            this.A0V = null;
        } else {
            this.A0V = str4;
        }
        if ((i & 32) == 0) {
            this.A0Q = null;
        } else {
            this.A0Q = str5;
        }
        if ((i & 64) == 0) {
            this.A0M = null;
        } else {
            this.A0M = l;
        }
        if ((i & 128) == 0) {
            this.A0f = null;
        } else {
            this.A0f = str6;
        }
        if ((i & 256) == 0) {
            this.A0O = null;
        } else {
            this.A0O = str7;
        }
        if ((i & 512) == 0) {
            this.A0c = null;
        } else {
            this.A0c = str8;
        }
        if ((i & 1024) == 0) {
            this.A0H = null;
        } else {
            this.A0H = l2;
        }
        if ((i & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) == 0) {
            this.A0A = null;
        } else {
            this.A0A = num;
        }
        if ((i & RequestDefragmentingOutputStream.BODY_BUFFER_SIZE) == 0) {
            this.A09 = null;
        } else {
            this.A09 = num2;
        }
        if ((i & 8192) == 0) {
            this.A0J = null;
        } else {
            this.A0J = l3;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) == 0) {
            this.A0I = null;
        } else {
            this.A0I = l4;
        }
        if ((i & Constants.LOAD_RESULT_PGO) == 0) {
            this.A0N = null;
        } else {
            this.A0N = str9;
        }
        if ((i & 65536) == 0) {
            this.A0B = null;
        } else {
            this.A0B = num3;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) == 0) {
            this.A0D = null;
        } else {
            this.A0D = num4;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) == 0) {
            this.A0C = null;
        } else {
            this.A0C = num5;
        }
        if ((i & Constants.LOAD_RESULT_WITH_VDEX_ODEX) == 0) {
            this.A0W = null;
        } else {
            this.A0W = str10;
        }
        if ((1048576 & i) == 0) {
            this.A0U = null;
        } else {
            this.A0U = str11;
        }
        if ((2097152 & i) == 0) {
            this.A0X = null;
        } else {
            this.A0X = str12;
        }
        if ((4194304 & i) == 0) {
            this.A0K = null;
        } else {
            this.A0K = l5;
        }
        if ((8388608 & i) == 0) {
            this.A0T = null;
        } else {
            this.A0T = str13;
        }
        if ((16777216 & i) == 0) {
            this.A07 = null;
        } else {
            this.A07 = bool;
        }
        if ((33554432 & i) == 0) {
            this.A0a = null;
        } else {
            this.A0a = str14;
        }
        if ((67108864 & i) == 0) {
            this.A0b = null;
        } else {
            this.A0b = str15;
        }
        if ((134217728 & i) == 0) {
            this.A08 = null;
        } else {
            this.A08 = d;
        }
        this.A0m = (268435456 & i) == 0 ? C0ty.A00 : list13;
        this.A0n = (536870912 & i) == 0 ? C0ty.A00 : list12;
        this.A0j = (1073741824 & i) == 0 ? C0ty.A00 : list11;
        this.A0g = (i & ((-1) << (-1))) == 0 ? C0ty.A00 : list16;
        this.A0l = (i2 & 1) == 0 ? C0ty.A00 : list15;
        this.A0k = (i2 & 2) == 0 ? C0ty.A00 : list14;
        this.A0h = (i2 & 4) == 0 ? C0ty.A00 : list10;
        this.A0i = (i2 & 8) == 0 ? C0ty.A00 : list9;
        if ((i2 & 16) == 0) {
            this.A0L = null;
        } else {
            this.A0L = l6;
        }
        if ((i2 & 32) == 0) {
            this.A0R = null;
        } else {
            this.A0R = str16;
        }
        if ((i2 & 64) == 0) {
            this.A06 = null;
        } else {
            this.A06 = bool2;
        }
        if ((i2 & 128) == 0) {
            this.A0E = null;
        } else {
            this.A0E = num6;
        }
        if ((i2 & 256) == 0) {
            this.A02 = null;
        } else {
            this.A02 = l7;
        }
        if ((i2 & 512) == 0) {
            this.A03 = null;
        } else {
            this.A03 = l8;
        }
        if ((i2 & 1024) == 0) {
            this.A01 = null;
        } else {
            this.A01 = num7;
        }
        if ((i2 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) == 0) {
            this.A04 = null;
        } else {
            this.A04 = str17;
        }
        this.A00 = (i2 & RequestDefragmentingOutputStream.BODY_BUFFER_SIZE) == 0 ? -1 : i5;
        if ((i2 & 8192) == 0) {
            this.A0F = null;
        } else {
            this.A0F = l9;
        }
        if ((i2 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) == 0) {
            this.A0S = null;
        } else {
            this.A0S = str18;
        }
        if ((i2 & Constants.LOAD_RESULT_PGO) == 0) {
            this.A0e = null;
        } else {
            this.A0e = str19;
        }
        if ((i2 & 65536) == 0) {
            this.A0G = null;
        } else {
            this.A0G = l10;
        }
        if ((i2 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) == 0) {
            this.A0Y = null;
        } else {
            this.A0Y = str20;
        }
        if ((i2 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) == 0) {
            this.A0p = true;
        } else {
            this.A0p = z;
        }
        if ((i2 & Constants.LOAD_RESULT_WITH_VDEX_ODEX) == 0) {
            this.A0q = true;
        } else {
            this.A0q = z2;
        }
        C03i c03i = C03i.A02;
        this.A0s = C01g.A00(c03i, 5cT.A00);
        this.A0r = C01g.A00(c03i, new AnonymousClass831(this, 44));
        this.A0o = C01g.A00(c03i, new AnonymousClass831(this, 45));
    }

    public HighlightsFeedContent(Boolean bool, Boolean bool2, Double d, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, int i, int i2, boolean z, boolean z2) {
        11T.A0F(str, 1);
        11T.A0F(str2, 2);
        this.A0P = str;
        this.A0Z = str2;
        this.A05 = i;
        this.A0d = str3;
        this.A0V = str4;
        this.A0Q = str5;
        this.A0M = l;
        this.A0f = str6;
        this.A0O = str7;
        this.A0c = str8;
        this.A0H = l2;
        this.A0A = num;
        this.A09 = num2;
        this.A0J = l3;
        this.A0I = l4;
        this.A0N = str9;
        this.A0B = num3;
        this.A0D = num4;
        this.A0C = num5;
        this.A0W = str10;
        this.A0U = str11;
        this.A0X = str12;
        this.A0K = l5;
        this.A0T = str13;
        this.A07 = bool;
        this.A0a = str14;
        this.A0b = str15;
        this.A08 = d;
        this.A0m = list;
        this.A0n = list2;
        this.A0j = list3;
        this.A0g = list4;
        this.A0l = list5;
        this.A0k = list6;
        this.A0h = list7;
        this.A0i = list8;
        this.A0L = l6;
        this.A0R = str16;
        this.A06 = bool2;
        this.A0E = num6;
        this.A02 = l7;
        this.A03 = l8;
        this.A01 = num7;
        this.A04 = str17;
        this.A00 = i2;
        this.A0F = l9;
        this.A0S = str18;
        this.A0e = str19;
        this.A0G = l10;
        this.A0Y = str20;
        this.A0p = z;
        this.A0q = z2;
        C03i c03i = C03i.A02;
        this.A0s = C01g.A00(c03i, 5cT.A00);
        this.A0r = C01g.A00(c03i, new AnonymousClass831(this, 44));
        this.A0o = C01g.A00(c03i, new AnonymousClass831(this, 45));
    }

    public final int A00() {
        return ((Number) this.A0r.getValue()).intValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof HighlightsFeedContent)) {
                return false;
            }
            HighlightsFeedContent highlightsFeedContent = (HighlightsFeedContent) obj;
            if (!11T.A0O(this.A0P, highlightsFeedContent.A0P) || !11T.A0O(this.A0Z, highlightsFeedContent.A0Z) || this.A05 != highlightsFeedContent.A05 || !11T.A0O(this.A0d, highlightsFeedContent.A0d) || !11T.A0O(this.A0V, highlightsFeedContent.A0V) || !11T.A0O(this.A0Q, highlightsFeedContent.A0Q) || !11T.A0O(this.A0M, highlightsFeedContent.A0M) || !11T.A0O(this.A0f, highlightsFeedContent.A0f) || !11T.A0O(this.A0O, highlightsFeedContent.A0O) || !11T.A0O(this.A0c, highlightsFeedContent.A0c) || !11T.A0O(this.A0H, highlightsFeedContent.A0H) || !11T.A0O(this.A0A, highlightsFeedContent.A0A) || !11T.A0O(this.A09, highlightsFeedContent.A09) || !11T.A0O(this.A0J, highlightsFeedContent.A0J) || !11T.A0O(this.A0I, highlightsFeedContent.A0I) || !11T.A0O(this.A0N, highlightsFeedContent.A0N) || !11T.A0O(this.A0B, highlightsFeedContent.A0B) || !11T.A0O(this.A0D, highlightsFeedContent.A0D) || !11T.A0O(this.A0C, highlightsFeedContent.A0C) || !11T.A0O(this.A0W, highlightsFeedContent.A0W) || !11T.A0O(this.A0U, highlightsFeedContent.A0U) || !11T.A0O(this.A0X, highlightsFeedContent.A0X) || !11T.A0O(this.A0K, highlightsFeedContent.A0K) || !11T.A0O(this.A0T, highlightsFeedContent.A0T) || !11T.A0O(this.A07, highlightsFeedContent.A07) || !11T.A0O(this.A0a, highlightsFeedContent.A0a) || !11T.A0O(this.A0b, highlightsFeedContent.A0b) || !11T.A0O(this.A08, highlightsFeedContent.A08) || !11T.A0O(this.A0m, highlightsFeedContent.A0m) || !11T.A0O(this.A0n, highlightsFeedContent.A0n) || !11T.A0O(this.A0j, highlightsFeedContent.A0j) || !11T.A0O(this.A0g, highlightsFeedContent.A0g) || !11T.A0O(this.A0l, highlightsFeedContent.A0l) || !11T.A0O(this.A0k, highlightsFeedContent.A0k) || !11T.A0O(this.A0h, highlightsFeedContent.A0h) || !11T.A0O(this.A0i, highlightsFeedContent.A0i) || !11T.A0O(this.A0L, highlightsFeedContent.A0L) || !11T.A0O(this.A0R, highlightsFeedContent.A0R) || !11T.A0O(this.A06, highlightsFeedContent.A06) || !11T.A0O(this.A0E, highlightsFeedContent.A0E) || !11T.A0O(this.A02, highlightsFeedContent.A02) || !11T.A0O(this.A03, highlightsFeedContent.A03) || !11T.A0O(this.A01, highlightsFeedContent.A01) || !11T.A0O(this.A04, highlightsFeedContent.A04) || this.A00 != highlightsFeedContent.A00 || !11T.A0O(this.A0F, highlightsFeedContent.A0F) || !11T.A0O(this.A0S, highlightsFeedContent.A0S) || !11T.A0O(this.A0e, highlightsFeedContent.A0e) || !11T.A0O(this.A0G, highlightsFeedContent.A0G) || !11T.A0O(this.A0Y, highlightsFeedContent.A0Y) || this.A0p != highlightsFeedContent.A0p || this.A0q != highlightsFeedContent.A0q) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A05 = (((((((((((((((((((((((((AnonymousClass002.A05(this.A0i, AnonymousClass002.A05(this.A0h, AnonymousClass002.A05(this.A0k, AnonymousClass002.A05(this.A0l, AnonymousClass002.A05(this.A0g, AnonymousClass002.A05(this.A0j, AnonymousClass002.A05(this.A0n, AnonymousClass002.A05(this.A0m, (((((((((((((((((((((((((((((((((((((((((((((((((((AnonymousClass002.A07(this.A0Z, 4YV.A02(this.A0P)) + this.A05) * 31) + 1BL.A05(this.A0d)) * 31) + 1BL.A05(this.A0V)) * 31) + 1BL.A05(this.A0Q)) * 31) + AnonymousClass001.A02(this.A0M)) * 31) + 1BL.A05(this.A0f)) * 31) + 1BL.A05(this.A0O)) * 31) + 1BL.A05(this.A0c)) * 31) + AnonymousClass001.A02(this.A0H)) * 31) + AnonymousClass001.A02(this.A0A)) * 31) + AnonymousClass001.A02(this.A09)) * 31) + AnonymousClass001.A02(this.A0J)) * 31) + AnonymousClass001.A02(this.A0I)) * 31) + 1BL.A05(this.A0N)) * 31) + AnonymousClass001.A02(this.A0B)) * 31) + AnonymousClass001.A02(this.A0D)) * 31) + AnonymousClass001.A02(this.A0C)) * 31) + 1BL.A05(this.A0W)) * 31) + 1BL.A05(this.A0U)) * 31) + 1BL.A05(this.A0X)) * 31) + AnonymousClass001.A02(this.A0K)) * 31) + 1BL.A05(this.A0T)) * 31) + AnonymousClass001.A02(this.A07)) * 31) + 1BL.A05(this.A0a)) * 31) + 1BL.A05(this.A0b)) * 31) + AnonymousClass001.A02(this.A08)) * 31)))))))) + AnonymousClass001.A02(this.A0L)) * 31) + 1BL.A05(this.A0R)) * 31) + AnonymousClass001.A02(this.A06)) * 31) + AnonymousClass001.A02(this.A0E)) * 31) + AnonymousClass001.A02(this.A02)) * 31) + AnonymousClass001.A02(this.A03)) * 31) + AnonymousClass001.A02(this.A01)) * 31) + 1BL.A05(this.A04)) * 31) + this.A00) * 31) + AnonymousClass001.A02(this.A0F)) * 31) + 1BL.A05(this.A0S)) * 31) + 1BL.A05(this.A0e)) * 31) + AnonymousClass001.A02(this.A0G)) * 31;
        String str = this.A0Y;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((A05 + i) * 31) + AnonymousClass002.A00(this.A0p ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0q ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A0P);
        parcel.writeString(this.A0Z);
        parcel.writeInt(this.A05);
        parcel.writeString(this.A0d);
        parcel.writeString(this.A0V);
        parcel.writeString(this.A0Q);
        C3o5.A0g(parcel, this.A0M);
        parcel.writeString(this.A0f);
        parcel.writeString(this.A0O);
        parcel.writeString(this.A0c);
        C3o5.A0g(parcel, this.A0H);
        C3o5.A0f(parcel, this.A0A);
        C3o5.A0f(parcel, this.A09);
        C3o5.A0g(parcel, this.A0J);
        C3o5.A0g(parcel, this.A0I);
        parcel.writeString(this.A0N);
        C3o5.A0f(parcel, this.A0B);
        C3o5.A0f(parcel, this.A0D);
        C3o5.A0f(parcel, this.A0C);
        parcel.writeString(this.A0W);
        parcel.writeString(this.A0U);
        parcel.writeString(this.A0X);
        C3o5.A0g(parcel, this.A0K);
        parcel.writeString(this.A0T);
        Boolean bool = this.A07;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.A0a);
        parcel.writeString(this.A0b);
        Double d = this.A08;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Iterator A09 = 4YW.A09(parcel, this.A0m);
        while (A09.hasNext()) {
            ((HighlightsReactionContent) A09.next()).writeToParcel(parcel, i);
        }
        Iterator A092 = 4YW.A09(parcel, this.A0n);
        while (A092.hasNext()) {
            ((HighlightsReplyMessageContent) A092.next()).writeToParcel(parcel, i);
        }
        Iterator A093 = 4YW.A09(parcel, this.A0j);
        while (A093.hasNext()) {
            ((HighlightsImmersiveMessageContent) A093.next()).writeToParcel(parcel, i);
        }
        Iterator A094 = 4YW.A09(parcel, this.A0g);
        while (A094.hasNext()) {
            ((HighlightsAttachmentContent) A094.next()).writeToParcel(parcel, i);
        }
        Iterator A095 = 4YW.A09(parcel, this.A0l);
        while (A095.hasNext()) {
            ((HighlightsAttachmentContent) A095.next()).writeToParcel(parcel, i);
        }
        Iterator A096 = 4YW.A09(parcel, this.A0k);
        while (A096.hasNext()) {
            ((HighlightsMemberContent) A096.next()).writeToParcel(parcel, i);
        }
        Iterator A097 = 4YW.A09(parcel, this.A0h);
        while (A097.hasNext()) {
            ((HighlightsGenAiContent) A097.next()).writeToParcel(parcel, i);
        }
        Iterator A098 = 4YW.A09(parcel, this.A0i);
        while (A098.hasNext()) {
            ((HighlightsEventContent) A098.next()).writeToParcel(parcel, i);
        }
        C3o5.A0g(parcel, this.A0L);
        parcel.writeString(this.A0R);
        Boolean bool2 = this.A06;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        C3o5.A0f(parcel, this.A0E);
        C3o5.A0g(parcel, this.A02);
        C3o5.A0g(parcel, this.A03);
        C3o5.A0f(parcel, this.A01);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A00);
        C3o5.A0g(parcel, this.A0F);
        parcel.writeString(this.A0S);
        parcel.writeString(this.A0e);
        C3o5.A0g(parcel, this.A0G);
        parcel.writeString(this.A0Y);
        parcel.writeInt(this.A0p ? 1 : 0);
        parcel.writeInt(this.A0q ? 1 : 0);
    }
}
