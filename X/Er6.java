package X;

import android.net.Uri;
import com.facebook.graphql.enums.GraphQLGamesInstantPlaySupportedOrientation;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.graphql.enums.GraphQLXFBInstantGameConsentExperienceType;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.HashSet;

/* loaded from: Er6.class */
public final class Er6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Uri A08;
    public final GNr A09;
    public final GraphQLGamesInstantPlaySupportedOrientation A0A;
    public final GraphQLXFBInstantGameConsentExperienceType A0B;
    public final GNf A0C;
    public final C2299Djj A0D;
    public final C2307Djr A0E;
    public final Efu A0F;
    public final ImmutableList A0G;
    public final ImmutableList A0H;
    public final ImmutableList A0I;
    public final ImmutableList A0J;
    public final ImmutableList A0K;
    public final ImmutableList A0L;
    public final ImmutableList A0M;
    public final ImmutableList A0N;
    public final ImmutableList A0O;
    public final ImmutableList A0P;
    public final ImmutableList A0Q;
    public final ImmutableList A0R;
    public final ImmutableSet A0S;
    public final ImmutableSet A0T;
    public final ImmutableSet A0U;
    public final ImmutableSet A0V;
    public final Integer A0W;
    public final String A0X;
    public final String A0Y;
    public final String A0Z;
    public final String A0a;
    public final String A0b;
    public final String A0c;
    public final String A0d;
    public final String A0e;
    public final String A0f;
    public final String A0g;
    public final String A0h;
    public final String A0i;
    public final String A0j;
    public final String A0k;
    public final String A0l;
    public final String A0m;
    public final String A0n;
    public final String A0o;
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
    public final boolean A10;
    public final boolean A11;

    /* JADX WARN: Multi-variable type inference failed */
    public Er6(Uri uri, GNr gNr, GraphQLGamesInstantPlaySupportedOrientation graphQLGamesInstantPlaySupportedOrientation, GraphQLXFBInstantGameConsentExperienceType graphQLXFBInstantGameConsentExperienceType, GNf gNf, C2299Djj c2299Djj, C2307Djr c2307Djr, Efu efu, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, ImmutableList immutableList5, ImmutableList immutableList6, ImmutableList immutableList7, ImmutableList immutableList8, ImmutableList immutableList9, ImmutableList immutableList10, ImmutableList immutableList11, ImmutableList immutableList12, ImmutableSet immutableSet, ImmutableSet immutableSet2, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        Object obj = efu;
        this.A0g = str10;
        this.A0h = str11;
        this.A0A = graphQLGamesInstantPlaySupportedOrientation;
        this.A0o = str18;
        this.A0n = str17;
        this.A0i = str12;
        this.A0j = str13;
        this.A0f = str9;
        this.A08 = uri;
        this.A0l = str15;
        this.A0N = immutableList8;
        this.A0m = str16;
        this.A07 = i8;
        this.A0v = z7;
        this.A0w = z8;
        this.A0k = str14;
        this.A0R = immutableList12;
        this.A0x = z9;
        this.A0V = immutableSet2;
        this.A0F = efu == null ? new Object() : obj;
        this.A0e = str8;
        this.A0d = str7;
        this.A0c = str6;
        this.A0u = z6;
        this.A05 = i6;
        this.A06 = i7;
        this.A0H = immutableList2;
        this.A11 = z13;
        this.A0b = str5;
        this.A10 = z12;
        this.A0a = str4;
        this.A0t = z5;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = i5;
        this.A0K = immutableList5;
        this.A0q = z2;
        this.A0s = z4;
        this.A00 = i;
        this.A0Y = str2;
        this.A0X = str;
        this.A0I = immutableList3;
        this.A0L = immutableList6;
        this.A09 = gNr;
        HashSet A0v = AnonymousClass001.A0v();
        HashSet A0v2 = AnonymousClass001.A0v();
        HashSet A0v3 = AnonymousClass001.A0v();
        if (immutableSet != null) {
            1Du it = immutableSet.iterator();
            while (it.hasNext()) {
                2JY A0P = 7zL.A0P(it);
                if (A0P.A0t(GraphQLStringDefUtil.A00(), "GraphQLInstantGamesSDKMessage", -902914157) != null && !"UNSET_OR_UNRECOGNIZED_ENUM_VALUE".equals(A0P.A0t(GraphQLStringDefUtil.A00(), "GraphQLInstantGamesSDKMessage", -902914157))) {
                    A0v.add(A0P.A0t(GraphQLStringDefUtil.A00(), "GraphQLInstantGamesSDKMessage", -902914157));
                }
                if (A0P.A0t(GraphQLStringDefUtil.A00(), "GraphQLInstantGamesGenericDialogType", -1252739735) != null && !"UNSET_OR_UNRECOGNIZED_ENUM_VALUE".equals(A0P.A0t(GraphQLStringDefUtil.A00(), "GraphQLInstantGamesGenericDialogType", -1252739735))) {
                    A0P.A0t(GraphQLStringDefUtil.A00(), "GraphQLInstantGamesGenericDialogType", -1252739735);
                    A0v2.add(A0P.A0t(GraphQLStringDefUtil.A00(), "GraphQLInstantGamesGenericDialogType", -1252739735));
                }
                if (A0P.A0t(GraphQLStringDefUtil.A00(), "GraphQLInstantGamesPassThroughRequestType", 1254592437) != null && !"UNSET_OR_UNRECOGNIZED_ENUM_VALUE".equals(A0P.A0t(GraphQLStringDefUtil.A00(), "GraphQLInstantGamesPassThroughRequestType", 1254592437))) {
                    A0v3.add(A0P.A0t(GraphQLStringDefUtil.A00(), "GraphQLInstantGamesPassThroughRequestType", 1254592437));
                }
            }
        }
        ImmutableSet A07 = ImmutableSet.A07(A0v);
        11T.A0A(A07);
        this.A0U = A07;
        ImmutableSet A072 = ImmutableSet.A07(A0v2);
        11T.A0A(A072);
        this.A0S = A072;
        ImmutableSet A073 = ImmutableSet.A07(A0v3);
        11T.A0A(A073);
        this.A0T = A073;
        this.A0Z = str3;
        this.A0y = z10;
        this.A0r = z3;
        this.A0p = z;
        this.A0B = graphQLXFBInstantGameConsentExperienceType;
        this.A0z = z11;
        this.A0E = c2307Djr;
        this.A0C = gNf;
        this.A0J = immutableList4;
        this.A0D = c2299Djj;
        this.A0P = immutableList10;
        this.A0Q = immutableList11;
        this.A0O = immutableList9;
        this.A0M = immutableList7;
        this.A0G = immutableList;
        this.A0W = num;
    }
}
