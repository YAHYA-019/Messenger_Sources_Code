package com.facebook.inspiration.model;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.4YV;
import X.7zN;
import X.AbF;
import X.AbH;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C2325Dka;
import X.C3o5;
import X.DKF;
import X.DKG;
import X.DKH;
import X.FJ8;
import X.FKf;
import X.RZX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLAREffectsDeliveryPrefetchDecisionType;
import com.facebook.graphql.enums.GraphQLGradientDirection;
import com.facebook.graphql.enums.GraphQLInspirationsAccountSettingsSaveSource;
import com.facebook.graphql.enums.GraphQLInspirationsCaptureMode;
import com.facebook.inspiration.model.attribution.InspirationEffectAttribution;
import com.facebook.ipc.media.data.MediaData;
import com.facebook.videocodec.effects.model.MsqrdGLConfig;
import com.google.common.collect.ImmutableList;

/* loaded from: InspirationEffect.class */
public final class InspirationEffect implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(47);
    public final double A00;
    public final GraphQLAREffectsDeliveryPrefetchDecisionType A01;
    public final GraphQLGradientDirection A02;
    public final GraphQLInspirationsAccountSettingsSaveSource A03;
    public final InspirationEffectManifest A04;
    public final InspirationVideoTemplate A05;
    public final InspirationEffectAttribution A06;
    public final MediaData A07;
    public final C2325Dka A08;
    public final MsqrdGLConfig A09;
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
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
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

    public InspirationEffect(RZX rzx) {
        this.A0C = rzx.A0C;
        this.A0D = rzx.A0D;
        this.A0E = rzx.A0E;
        this.A0F = rzx.A0F;
        this.A06 = rzx.A06;
        String str = rzx.A0G;
        C1pq.A08("effectId", str);
        this.A0G = str;
        this.A04 = rzx.A04;
        String str2 = rzx.A0H;
        C1pq.A08("effectTypeLabel", str2);
        this.A0H = str2;
        this.A08 = rzx.A08;
        ImmutableList immutableList = rzx.A0A;
        C1pq.A08("gradientColors", immutableList);
        this.A0A = immutableList;
        this.A02 = rzx.A02;
        this.A0Q = rzx.A0Q;
        this.A0R = rzx.A0R;
        String str3 = rzx.A0I;
        AbF.A1T(str3);
        this.A0I = str3;
        this.A0S = rzx.A0S;
        this.A0T = rzx.A0T;
        this.A0U = rzx.A0U;
        this.A0V = rzx.A0V;
        this.A0W = rzx.A0W;
        this.A0X = rzx.A0X;
        this.A09 = rzx.A09;
        this.A01 = rzx.A01;
        this.A0J = rzx.A0J;
        String str4 = rzx.A0K;
        C1pq.A08("promptType", str4);
        this.A0K = str4;
        this.A0L = rzx.A0L;
        this.A00 = rzx.A00;
        this.A03 = rzx.A03;
        this.A07 = rzx.A07;
        this.A0M = rzx.A0M;
        this.A0Y = rzx.A0Y;
        this.A0N = rzx.A0N;
        ImmutableList immutableList2 = rzx.A0B;
        C1pq.A08("supportedCaptureModes", immutableList2);
        this.A0B = immutableList2;
        this.A05 = rzx.A05;
        this.A0O = rzx.A0O;
        String str5 = rzx.A0P;
        C1pq.A08("trackingString", str5);
        this.A0P = str5;
        this.A0Z = rzx.A0Z;
    }

    public InspirationEffect(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        InspirationVideoTemplate inspirationVideoTemplate = null;
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
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = (InspirationEffectAttribution) InspirationEffectAttribution.CREATOR.createFromParcel(parcel);
        }
        this.A0G = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (InspirationEffectManifest) parcel.readParcelable(A0e);
        }
        this.A0H = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = (C2325Dka) FJ8.A01(parcel);
        }
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        int i = 0;
        while (i < readInt) {
            i = AbH.A00(parcel, strArr, i);
        }
        this.A0A = ImmutableList.copyOf(strArr);
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = GraphQLGradientDirection.values()[parcel.readInt()];
        }
        this.A0Q = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0R = 1BM.A07(parcel);
        this.A0I = parcel.readString();
        this.A0S = 1BM.A07(parcel);
        this.A0T = 1BM.A07(parcel);
        this.A0U = 1BM.A07(parcel);
        this.A0V = 1BM.A07(parcel);
        this.A0W = 1BM.A07(parcel);
        this.A0X = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = (MsqrdGLConfig) MsqrdGLConfig.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = GraphQLAREffectsDeliveryPrefetchDecisionType.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0J = null;
        } else {
            this.A0J = parcel.readString();
        }
        this.A0K = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0L = null;
        } else {
            this.A0L = parcel.readString();
        }
        this.A00 = parcel.readDouble();
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = GraphQLInspirationsAccountSettingsSaveSource.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = DKG.A0Y(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0M = null;
        } else {
            this.A0M = parcel.readString();
        }
        this.A0Y = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A0N = null;
        } else {
            this.A0N = parcel.readString();
        }
        int readInt2 = parcel.readInt();
        GraphQLInspirationsCaptureMode[] graphQLInspirationsCaptureModeArr = new GraphQLInspirationsCaptureMode[readInt2];
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= readInt2) {
                break;
            }
            graphQLInspirationsCaptureModeArr[i3] = GraphQLInspirationsCaptureMode.values()[parcel.readInt()];
            i2 = i3 + 1;
        }
        this.A0B = ImmutableList.copyOf(graphQLInspirationsCaptureModeArr);
        this.A05 = parcel.readInt() != 0 ? (InspirationVideoTemplate) parcel.readParcelable(A0e) : inspirationVideoTemplate;
        this.A0O = C3o5.A0O(parcel);
        this.A0P = parcel.readString();
        this.A0Z = AbJ.A1W(parcel);
    }

    public InspirationEffect(GraphQLAREffectsDeliveryPrefetchDecisionType graphQLAREffectsDeliveryPrefetchDecisionType, GraphQLGradientDirection graphQLGradientDirection, InspirationVideoTemplate inspirationVideoTemplate, C2325Dka c2325Dka, MsqrdGLConfig msqrdGLConfig, ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, double d, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.A0C = str;
        this.A0D = str2;
        this.A0E = str3;
        this.A0F = str4;
        this.A06 = null;
        C1pq.A08("effectId", str5);
        this.A0G = str5;
        this.A04 = null;
        C1pq.A08("effectTypeLabel", str6);
        this.A0H = str6;
        this.A08 = c2325Dka;
        C1pq.A08("gradientColors", immutableList);
        this.A0A = immutableList;
        this.A02 = graphQLGradientDirection;
        this.A0Q = z;
        this.A0R = z2;
        AbF.A1T(str7);
        this.A0I = str7;
        this.A0S = false;
        this.A0T = z3;
        this.A0U = z4;
        this.A0V = z5;
        this.A0W = z6;
        this.A0X = z7;
        this.A09 = msqrdGLConfig;
        this.A01 = graphQLAREffectsDeliveryPrefetchDecisionType;
        this.A0J = str8;
        C1pq.A08("promptType", str9);
        this.A0K = str9;
        this.A0L = null;
        this.A00 = d;
        this.A03 = null;
        this.A07 = null;
        this.A0M = "camera_roll";
        this.A0Y = z8;
        this.A0N = str10;
        C1pq.A08("supportedCaptureModes", immutableList2);
        this.A0B = immutableList2;
        this.A05 = inspirationVideoTemplate;
        this.A0O = str11;
        C1pq.A08("trackingString", str12);
        this.A0P = str12;
        this.A0Z = z9;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationEffect)) {
                return false;
            }
            InspirationEffect inspirationEffect = (InspirationEffect) obj;
            if (!11T.A0O(this.A0C, inspirationEffect.A0C) || !11T.A0O(this.A0D, inspirationEffect.A0D) || !11T.A0O(this.A0E, inspirationEffect.A0E) || !11T.A0O(this.A0F, inspirationEffect.A0F) || !11T.A0O(this.A06, inspirationEffect.A06) || !11T.A0O(this.A0G, inspirationEffect.A0G) || !11T.A0O(this.A04, inspirationEffect.A04) || !11T.A0O(this.A0H, inspirationEffect.A0H) || !11T.A0O(this.A08, inspirationEffect.A08) || !11T.A0O(this.A0A, inspirationEffect.A0A) || this.A02 != inspirationEffect.A02 || this.A0Q != inspirationEffect.A0Q || this.A0R != inspirationEffect.A0R || !11T.A0O(this.A0I, inspirationEffect.A0I) || this.A0S != inspirationEffect.A0S || this.A0T != inspirationEffect.A0T || this.A0U != inspirationEffect.A0U || this.A0V != inspirationEffect.A0V || this.A0W != inspirationEffect.A0W || this.A0X != inspirationEffect.A0X || !11T.A0O(this.A09, inspirationEffect.A09) || this.A01 != inspirationEffect.A01 || !11T.A0O(this.A0J, inspirationEffect.A0J) || !11T.A0O(this.A0K, inspirationEffect.A0K) || !11T.A0O(this.A0L, inspirationEffect.A0L) || this.A00 != inspirationEffect.A00 || this.A03 != inspirationEffect.A03 || !11T.A0O(this.A07, inspirationEffect.A07) || !11T.A0O(this.A0M, inspirationEffect.A0M) || this.A0Y != inspirationEffect.A0Y || !11T.A0O(this.A0N, inspirationEffect.A0N) || !11T.A0O(this.A0B, inspirationEffect.A0B) || !11T.A0O(this.A05, inspirationEffect.A05) || !11T.A0O(this.A0O, inspirationEffect.A0O) || !11T.A0O(this.A0P, inspirationEffect.A0P) || this.A0Z != inspirationEffect.A0Z) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A0A, C1pq.A04(this.A08, C1pq.A04(this.A0H, C1pq.A04(this.A04, C1pq.A04(this.A0G, C1pq.A04(this.A06, C1pq.A04(this.A0F, C1pq.A04(this.A0E, C1pq.A04(this.A0D, C1pq.A03(this.A0C))))))))));
        int A042 = C1pq.A04(this.A09, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A0I, C1pq.A02(C1pq.A02((A04 * 31) + C3o5.A03(this.A02), this.A0Q), this.A0R)), this.A0S), this.A0T), this.A0U), this.A0V), this.A0W), this.A0X));
        int A00 = C1pq.A00(this.A00, C1pq.A04(this.A0L, C1pq.A04(this.A0K, C1pq.A04(this.A0J, (A042 * 31) + C3o5.A03(this.A01)))));
        return C1pq.A02(C1pq.A04(this.A0P, C1pq.A04(this.A0O, C1pq.A04(this.A05, C1pq.A04(this.A0B, C1pq.A04(this.A0N, C1pq.A02(C1pq.A04(this.A0M, C1pq.A04(this.A07, (A00 * 31) + DKF.A04(this.A03))), this.A0Y)))))), this.A0Z);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A0C);
        1BL.A13(parcel, this.A0D);
        1BL.A13(parcel, this.A0E);
        1BL.A13(parcel, this.A0F);
        InspirationEffectAttribution inspirationEffectAttribution = this.A06;
        if (inspirationEffectAttribution == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationEffectAttribution.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A0G);
        C3o5.A0d(parcel, this.A04, i);
        parcel.writeString(this.A0H);
        DKH.A0y(parcel, this.A08);
        1Du A0b = 1BL.A0b(parcel, this.A0A);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        C3o5.A0e(parcel, this.A02);
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeInt(this.A0R ? 1 : 0);
        parcel.writeString(this.A0I);
        parcel.writeInt(this.A0S ? 1 : 0);
        parcel.writeInt(this.A0T ? 1 : 0);
        parcel.writeInt(this.A0U ? 1 : 0);
        parcel.writeInt(this.A0V ? 1 : 0);
        parcel.writeInt(this.A0W ? 1 : 0);
        parcel.writeInt(this.A0X ? 1 : 0);
        MsqrdGLConfig msqrdGLConfig = this.A09;
        if (msqrdGLConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            msqrdGLConfig.writeToParcel(parcel, i);
        }
        C3o5.A0e(parcel, this.A01);
        1BL.A13(parcel, this.A0J);
        parcel.writeString(this.A0K);
        1BL.A13(parcel, this.A0L);
        parcel.writeDouble(this.A00);
        C3o5.A0e(parcel, this.A03);
        DKH.A10(parcel, this.A07, i);
        1BL.A13(parcel, this.A0M);
        parcel.writeInt(this.A0Y ? 1 : 0);
        1BL.A13(parcel, this.A0N);
        1Du A0b2 = 1BL.A0b(parcel, this.A0B);
        while (A0b2.hasNext()) {
            7zN.A0z(parcel, (GraphQLInspirationsCaptureMode) A0b2.next());
        }
        C3o5.A0d(parcel, this.A05, i);
        1BL.A13(parcel, this.A0O);
        parcel.writeString(this.A0P);
        parcel.writeInt(this.A0Z ? 1 : 0);
    }
}
