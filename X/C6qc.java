package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.graphql.enums.GraphQLStickerType;

/* renamed from: X.6qc, reason: invalid class name */
/* loaded from: 6qc.class */
public final class C6qc {
    public final int A00;
    public final int A01;
    public final CallerContext A02;
    public final 4gJ A03;
    public final 3xX A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public C6qc(CallerContext callerContext, 4gJ r303, GraphQLStickerType graphQLStickerType, 3xX r305, String str, String str2, String str3, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A06 = str2;
        this.A07 = str3;
        this.A08 = graphQLStickerType != null ? graphQLStickerType.name() : null;
        this.A01 = i2;
        this.A0C = z4;
        this.A0D = z5;
        this.A0B = z3;
        this.A02 = callerContext;
        this.A03 = r303;
        this.A04 = r305;
        this.A05 = str;
        this.A09 = z;
        this.A0A = z2;
        this.A00 = i;
        this.A0E = z6;
    }
}
