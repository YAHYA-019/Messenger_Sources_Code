package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.stickers.service.models.GenerateText2StickerParams;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

/* loaded from: I5H.class */
public final class I5H {
    public final 1De A00;
    public final 1Br A03 = 1Bq.A00(68416);
    public final 1Br A02 = 1Bq.A00(50153);
    public final 1Br A05 = 1Bq.A00(16484);
    public final 1Br A01 = 1Bq.A00(83122);
    public final 1Br A04 = 7zM.A0S();

    public I5H(1De r302) {
        this.A00 = r302;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x02c6, code lost:
    
        if (r0 != false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ea A[Catch: Exception -> 0x02ab, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x02ab, blocks: (B:23:0x010e, B:24:0x0114, B:28:0x0122, B:31:0x012d, B:32:0x0132, B:34:0x0143, B:37:0x014f, B:38:0x0156, B:42:0x01ea, B:46:0x0219, B:48:0x0220, B:49:0x0224, B:49:0x0224, B:51:0x0229, B:52:0x0230, B:53:0x0235, B:53:0x0235, B:56:0x023c, B:58:0x0245, B:60:0x024e, B:64:0x025e, B:65:0x0265, B:66:0x026b, B:67:0x0270, B:67:0x0270, B:69:0x0275, B:70:0x027a, B:72:0x028d, B:73:0x0294, B:75:0x029b, B:79:0x0212, B:83:0x016e, B:86:0x0179, B:87:0x017e, B:88:0x0184, B:90:0x0195, B:93:0x01a1, B:96:0x01b1, B:99:0x01bc, B:100:0x01c1, B:101:0x01c7, B:102:0x01cd), top: B:22:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0212 A[Catch: Exception -> 0x02ab, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x02ab, blocks: (B:23:0x010e, B:24:0x0114, B:28:0x0122, B:31:0x012d, B:32:0x0132, B:34:0x0143, B:37:0x014f, B:38:0x0156, B:42:0x01ea, B:46:0x0219, B:48:0x0220, B:49:0x0224, B:49:0x0224, B:51:0x0229, B:52:0x0230, B:53:0x0235, B:53:0x0235, B:56:0x023c, B:58:0x0245, B:60:0x024e, B:64:0x025e, B:65:0x0265, B:66:0x026b, B:67:0x0270, B:67:0x0270, B:69:0x0275, B:70:0x027a, B:72:0x028d, B:73:0x0294, B:75:0x029b, B:79:0x0212, B:83:0x016e, B:86:0x0179, B:87:0x017e, B:88:0x0184, B:90:0x0195, B:93:0x01a1, B:96:0x01b1, B:99:0x01bc, B:100:0x01c1, B:101:0x01c7, B:102:0x01cd), top: B:22:0x010e }] */
    /* JADX WARN: Type inference failed for: r310v2 */
    /* JADX WARN: Type inference failed for: r310v3 */
    /* JADX WARN: Type inference failed for: r310v4, types: [java.util.AbstractCollection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.C2636Gjo A00(X.I5H r301, java.lang.Object r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I5H.A00(X.I5H, java.lang.Object, java.lang.String):X.Gjo");
    }

    public final 2FT A01() {
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A04("limit", 19);
        return 2FP.A02(new Imb(this, 11), AbstractC2326GOr.A0F(this.A00).A00().A09(7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "FetchTrendingGeneratedAiStickers", (String) null, "fbandroid", -1785500046, 0, 3896339652L, 3896339652L, false, true))), 4YV.A11(this.A05));
    }

    public final 2FT A02(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 0);
        return 2FP.A02(new Imb(this, 10), ((DKN) 1De.A00(this.A00, 68643)).A00().A09(7zM.A0L(7zL.A0M(), new 2Jf(2JX.class, (Class) null, "FetchUserGeneratedAiStickers", (String) null, "fbandroid", -522832517, 0, 1220168884L, 1220168884L, false, true))), 4YV.A11(this.A05));
    }

    public final 2FT A03(ImmutableList immutableList, String str, boolean z) {
        GenerateText2StickerParams generateText2StickerParams = new GenerateText2StickerParams(immutableList, Boolean.valueOf(z), str);
        GraphQlQueryParamSet A0M = 7zL.A0M();
        boolean A1W = DKE.A1W(A0M, "prompt", generateText2StickerParams.A02);
        A0M.A05("media_type", "image/png");
        String A05 = ((C6pl) 1Br.A0B(this.A02)).A05();
        11T.A0A(A05);
        Double valueOf = Double.valueOf(Double.parseDouble(A05));
        A0M.A04(4YT.A00(1452), valueOf);
        boolean A1T = AnonymousClass001.A1T(valueOf);
        A0M.A05("caller", 4YT.A00(404));
        Boolean bool = generateText2StickerParams.A01;
        A0M.A03("bypass_cache", bool);
        boolean A1T2 = AnonymousClass001.A1T(bool);
        A0M.A06("animate_source_sticker_ids", generateText2StickerParams.A00);
        Preconditions.checkArgument(A1W);
        Preconditions.checkArgument(A1T);
        Preconditions.checkArgument(A1T2);
        C3sa A0L = 7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "GenerateText2Stickers", (String) null, "fbandroid", 1182132890, 0, 1069736903L, 1069736903L, false, true));
        4YU.A1J(A0L, 1320400665486574L);
        C00i c00i = this.A03.A00;
        A0L.A0A(AnonymousClass842.A00((AnonymousClass842) c00i.get()).Auy(36602428556252994L));
        A0L.A09(z ? 0L : AnonymousClass842.A00((AnonymousClass842) c00i.get()).Auy(36602428556252994L));
        7zP.A0e(this.A04).markerStart(625161889, str.hashCode());
        2FT A02 = 2FP.A02(new Imf(this, generateText2StickerParams, 6), AbstractC2326GOr.A0F(this.A00).A00().A09(A0L), (immutableList == null || immutableList.isEmpty()) ? 4YV.A11(this.A05) : 1JU.A01);
        11T.A0D(A02);
        1Kd.A0E(new D48(str, this, 9), A02);
        return A02;
    }

    public final void A04(FbUserSession fbUserSession, String str) {
        boolean A1X = 1BL.A1X(fbUserSession, str);
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A05("sticker_id", str);
        ((DKN) 1De.A00(this.A00, 68643)).A00().A09(AbO.A09(A0M, new C01643sd(Q94.class, "AddUserGeneratedAiStickers", null, null, "fbandroid", -337909499, 0, 3568578065L, 3568578065L, false, A1X)));
    }
}
