package X;

/* renamed from: X.9lu, reason: invalid class name */
/* loaded from: 9lu.class */
public final class C9lu {
    public final 1Br A00 = 1Bu.A00(67775);

    public static final Boolean A00(C9lu c9lu, C5fv c5fv) {
        C5wn c5wn;
        6wZ r0 = (6wZ) 1Br.A0B(c9lu.A00);
        C5gN c5gN = C5gN.A00;
        C5wn c5wn2 = (C5wn) c5fv.AxW(c5gN);
        Boolean bool = null;
        if (!1Br.A07(r0.A00).AZk(11T.A0O(c5wn2 != null ? c5wn2.A04 : null, "930215145186465") ? 36322478293272114L : 36322478293141040L) && (c5wn = (C5wn) c5fv.AxW(c5gN)) != null) {
            bool = c5wn.A00;
        }
        return bool;
    }

    public static final boolean A01(C9lu c9lu, boolean z, boolean z2) {
        6wZ r0 = (6wZ) 1Br.A0B(c9lu.A00);
        if (z) {
            return 1Br.A07(r0.A00).AZk(z2 ? 36322478293206577L : 36322478293075503L);
        }
        return r0.A00();
    }

    public static final boolean A02(C5fv c5fv) {
        C5wn A0g;
        String str;
        if ((!(c5fv instanceof 5gP) && !(c5fv instanceof C5v9)) || (A0g = 7zO.A0g(c5fv)) == null || (str = A0g.A03) == null || str.length() == 0) {
            return false;
        }
        String str2 = A0g.A04;
        11T.A0F(str2, 0);
        return str2.equals("2191329907595522") ^ true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (A01(r301, r304, X.AnonymousClass001.A1W(r0, r0)) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A03(com.facebook.stickers.model.Sticker r302, boolean r303, boolean r304) {
        /*
            r301 = this;
            r0 = r302
            com.facebook.graphql.enums.GraphQLStickerType r0 = r0.A0B
            r305 = r0
            com.facebook.graphql.enums.GraphQLStickerType r0 = com.facebook.graphql.enums.GraphQLStickerType.CUSTOM
            r306 = r0
            r0 = r305
            r1 = r306
            if (r0 != r1) goto L16
            r0 = r303
            if (r0 == 0) goto L50
        L16:
            r0 = r302
            java.lang.String r0 = r0.A0H
            r307 = r0
            r0 = r307
            r1 = 0
            X.11T.A0F(r0, r1)
            java.lang.String r0 = "2191329907595522"
            r308 = r0
            r0 = r307
            r1 = r308
            boolean r0 = r0.equals(r1)
            r1 = 1
            r0 = r0 ^ r1
            r309 = r0
            r0 = r309
            if (r0 == 0) goto L50
            r0 = r305
            r1 = r306
            boolean r0 = X.AnonymousClass001.A1W(r0, r1)
            r309 = r0
            r0 = r301
            r1 = r304
            r2 = r309
            boolean r0 = A01(r0, r1, r2)
            r310 = r0
            r0 = 1
            r309 = r0
            r0 = r310
            if (r0 != 0) goto L56
        L50:
            r0 = 0
            r309 = r0
            r0 = 0
            r308 = r0
        L56:
            r0 = r309
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9lu.A03(com.facebook.stickers.model.Sticker, boolean, boolean):boolean");
    }
}
