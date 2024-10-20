package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.enums.GraphQLStickerType;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.stickers.model.Sticker;
import java.util.Set;

/* loaded from: I4b.class */
public final class I4b {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;

    public I4b(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A01 = 1Lm.A01(fbUserSession, 116063);
        this.A00 = 1Bu.A00(115920);
        this.A02 = 1Lm.A01(fbUserSession, 116050);
    }

    public static final String A00(HBG hbg) {
        switch (hbg.ordinal()) {
            case 0:
                return "ANIMATION";
            case 1:
                return "STICKER";
            case 2:
                return "GIF_STICKER_FROM_GIPHY";
            case 3:
                return "GIF_FOR_AR_PLATFORM";
            case 4:
                return "GIF_KEYBOARD_TINCAN";
            case 5:
                return "GIF_SUPPORTED_IN_E2EE";
            case 6:
                return "AVATAR_STICKER";
            case 7:
                return "GENERATED_STICKER";
            default:
                return "STICKER_SUGGESTIONS";
        }
    }

    public final void A01(ThreadKey threadKey, Sticker sticker, HBG hbg, Boolean bool, String str, int i, int i2, int i3) {
        ((I5K) 1Br.A0B(this.A01)).A02(sticker, str, A00(hbg), i, i2, i3, true);
        HzA hzA = (HzA) 1Br.A0B(this.A02);
        long j = i3;
        if (AnonymousClass001.A1O(hzA.A00.length())) {
            return;
        }
        GraphQLStickerType graphQLStickerType = sticker.A0B;
        String str2 = sticker.A0F;
        C98O c98o = C98O.A0K;
        GraphQLStickerType graphQLStickerType2 = GraphQLStickerType.AVATAR;
        if (graphQLStickerType == graphQLStickerType2) {
            str2 = sticker.A0D;
            if (str2 == null) {
                str2 = str2;
            }
            c98o = C98O.A0F;
        }
        Set set = hzA.A04;
        if (set.contains(str2)) {
            return;
        }
        if (graphQLStickerType == GraphQLStickerType.PAIR_AI_GENERATED || (graphQLStickerType == graphQLStickerType2 && GOq.A0h(hzA.A03).AZk(36310808868422854L))) {
            set.add(str2);
            1UG A08 = 1BK.A08(1Br.A02(hzA.A02), 4YT.A00(39));
            if (A08.isSampled()) {
                GOn.A1Q(A08, hzA.A00);
                A08.A5c(c98o, "send_source");
                A08.A6H("absolute_position", Long.valueOf(j));
                A08.A09("is_download");
                A08.A7R("search_query", str);
                A08.A7R("item_collection_id", sticker.A0H);
                A08.A7R("item_id", str2);
                A08.A5c(HvN.A01(graphQLStickerType), "sticker_type");
                AbstractC2327GOs.A0o(A08, bool, HzA.A00(threadKey, hzA));
                A08.BZL();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x01e3, code lost:
    
        if (r324 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A02(com.facebook.messaging.model.threadkey.ThreadKey r302, com.facebook.stickers.model.Sticker r303, X.HBG r304, java.lang.Boolean r305, java.lang.String r306, int r307, int r308, int r309) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I4b.A02(com.facebook.messaging.model.threadkey.ThreadKey, com.facebook.stickers.model.Sticker, X.HBG, java.lang.Boolean, java.lang.String, int, int, int):void");
    }

    public final void A03(Sticker sticker, String str, int i, int i2) {
        Long A0f;
        I5K i5k = (I5K) 1Br.A0B(this.A01);
        HQE hqe = (HQE) 1Br.A0B(i5k.A06);
        Integer num = 0CU.A0O(str) ? 0S2.A00 : 0S2.A01;
        String str2 = i5k.A00;
        1Br r0 = i5k.A02;
        String str3 = ((Hrr) 1Br.A0B(r0)).A02;
        String A00 = ((7Rw) 1Br.A0B(i5k.A03)).A00();
        Integer num2 = sticker.A02 != null ? 0S2.A00 : 0S2.A01;
        String str4 = sticker.A0D;
        long longValue = (str4 == null || (A0f = 0CW.A0f(str4)) == null) ? 0L : A0f.longValue();
        boolean A1W = AnonymousClass001.A1W(((Hrr) 1Br.A0B(r0)).A01, 0S2.A02);
        String str5 = sticker.A0E;
        String A13 = 4YU.A13(str);
        C3o5.A0k(A13, 1, num2);
        1UG A08 = 1BK.A08(1Br.A02(hqe.A00), 1BJ.A00(1035));
        0DA r02 = new 0DA();
        r02.A07("referrer_surface", "message_thread");
        I68.A00(r02, num2, i2, longValue);
        GOp.A1M(r02, A1W);
        GOq.A1C(r02, i);
        r02.A07("search_query", A13);
        GOq.A1F(r02, "sticker_template_name", str5, A00, str3);
        if (A08.isSampled()) {
            GOp.A1L(r02, A08, str2);
            A08.A7R("product", num.intValue() != 0 ? "search" : "ranking");
            A08.BZL();
        }
    }
}
