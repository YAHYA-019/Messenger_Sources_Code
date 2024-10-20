package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.fbavatar.config.AvatarConfigRepository;
import com.facebook.graphql.enums.GraphQLStickerType;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.Set;

/* loaded from: I5X.class */
public final class I5X {
    public String A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final Set A04;

    public I5X(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A03 = 1Bu.A00(116055);
        this.A02 = 1Bu.A00(116058);
        this.A01 = 1Lm.A01(fbUserSession, 66197);
        this.A04 = 7zL.A15();
        this.A00 = 7zR.A0s();
    }

    private final String A00() {
        Integer num;
        C6oY c6oY = ((AvatarConfigRepository) 1Br.A0B(this.A01)).A00;
        if (c6oY == null || (num = c6oY.A03) == null) {
            return null;
        }
        return num == 0S2.A01 ? "2" : ConstantsKt.CAMERA_ID_BACK;
    }

    public final String A01() {
        return this.A00;
    }

    public final void A02(8K7 r302, int i, long j, boolean z, boolean z2) {
        11T.A0F(r302, 0);
        Hfj hfj = r302.A04.A00;
        if (hfj != null) {
            Integer num = z ? 0S2.A00 : 0S2.A01;
            if (!z2) {
                HZw hZw = (HZw) 1Br.A0B(this.A02);
                String str = this.A00;
                int i2 = hfj.A00;
                int i3 = hfj.A02;
                boolean z3 = true;
                if (r302.A00 <= 1) {
                    z3 = false;
                }
                boolean A1W = AnonymousClass001.A1W(r302.A06.A0B, GraphQLStickerType.AVATAR_AI_GENERATED);
                String A00 = A00();
                C6oY c6oY = ((AvatarConfigRepository) 1Br.A0B(this.A01)).A00;
                String A0q = c6oY != null ? 7zO.A0q(c6oY.A02) : null;
                C00i c00i = hZw.A01.A00;
                if (AbstractC2326GOr.A1X(c00i)) {
                    1UG A08 = 1BK.A08(1Br.A02(hZw.A00), "avatar_stickers_measurement_e2ee_avatar_sticker_tray_send");
                    0DA r0 = new 0DA();
                    GOq.A1E(r0, str);
                    Long A0l = 1BK.A0l(i3);
                    GOq.A1D(r0, A0l);
                    I68.A02(r0, num, true, z3, A1W);
                    GOp.A1K(r0, i2);
                    r0.A06("result_size", A0l);
                    AbstractC2326GOr.A19(r0, c00i, A00, A0q);
                    if (A08.isSampled()) {
                        A08.A7T(r0, "event_data");
                        A08.BZL();
                        return;
                    }
                    return;
                }
                return;
            }
            Hlj hlj = (Hlj) 1Br.A0B(this.A03);
            String str2 = this.A00;
            int i4 = hfj.A00;
            int i5 = hfj.A01;
            DqM dqM = r302.A05;
            String str3 = dqM.A03;
            11T.A0F(str3, 0);
            Long A0f = 0CW.A0f(str3);
            if (A0f != null) {
                int i6 = hfj.A03;
                int i7 = hfj.A02;
                String str4 = dqM.A04;
                boolean z4 = true;
                if (r302.A00 <= 1) {
                    z4 = false;
                }
                Boolean valueOf = Boolean.valueOf(z4);
                1UG A082 = 1BK.A08(1Br.A02(hlj.A00), 1BJ.A00(1018));
                0DA r02 = new 0DA();
                I68.A01(r02, num, A0f, "sticker_template_id");
                r02.A06("sticker_rank", 1BK.A0l(i));
                r02.A06("sticker_page_index", 1BK.A0l(i5));
                GOp.A1K(r02, i4);
                r02.A06("total_pages", 1BK.A0l(i6));
                AbstractC2327GOs.A0j(r02, j);
                GOq.A1C(r02, i7);
                r02.A07("search_query", "");
                r02.A07("sticker_template_name", str4);
                r02.A07("sticker_usage_id_extra", (String) null);
                r02.A03("is_social_sticker", valueOf);
                if (A082.isSampled()) {
                    GOp.A1L(r02, A082, str2);
                    A082.A7R("product", "ranking");
                    A082.BZL();
                }
            }
        }
    }

    public final void A03(8K7 r302, int i, boolean z, boolean z2) {
        1UG A08;
        synchronized (this) {
            11T.A0F(r302, 0);
            Hfj hfj = r302.A04.A00;
            if (hfj != null) {
                Set set = this.A04;
                String str = r302.A07;
                if (!set.contains(str)) {
                    set.add(str);
                    Integer num = z ? 0S2.A00 : 0S2.A01;
                    if (z2) {
                        Hlj hlj = (Hlj) 1Br.A0B(this.A03);
                        String str2 = this.A00;
                        int i2 = hfj.A00;
                        int i3 = hfj.A01;
                        int i4 = hfj.A02;
                        DqM dqM = r302.A05;
                        String str3 = dqM.A03;
                        11T.A0F(str3, 0);
                        Long A0f = 0CW.A0f(str3);
                        if (A0f != null) {
                            int i5 = hfj.A03;
                            String str4 = dqM.A04;
                            boolean z3 = true;
                            if (r302.A00 <= 1) {
                                z3 = false;
                            }
                            Boolean valueOf = Boolean.valueOf(z3);
                            A08 = 1BK.A08(1Br.A02(hlj.A00), 1BJ.A00(1016));
                            0DA r0 = new 0DA();
                            r0.A06("sticker_template_id", A0f);
                            GOp.A1K(r0, i2);
                            I68.A01(r0, num, 1BK.A0l(i5), "total_pages");
                            r0.A06("sticker_rank", 1BK.A0l(i));
                            r0.A06("sticker_page_index", 1BK.A0l(i3));
                            GOq.A1C(r0, i4);
                            r0.A07("search_query", "");
                            r0.A07("sticker_template_name", str4);
                            r0.A07("sticker_id", str);
                            r0.A03("is_social_sticker", valueOf);
                            if (A08.isSampled()) {
                                GOp.A1L(r0, A08, str2);
                                A08.A7R("product", "ranking");
                                A08.BZL();
                            }
                        }
                    } else {
                        HZw hZw = (HZw) 1Br.A0B(this.A02);
                        String str5 = this.A00;
                        int i6 = hfj.A00;
                        int i7 = hfj.A02;
                        long j = i;
                        boolean z4 = true;
                        if (r302.A00 <= 1) {
                            z4 = false;
                        }
                        boolean A1W = AnonymousClass001.A1W(r302.A06.A0B, GraphQLStickerType.AVATAR_AI_GENERATED);
                        String str6 = r302.A08;
                        11T.A0F(str6, 0);
                        Long A0f2 = 0CW.A0f(str6);
                        long longValue = A0f2 != null ? A0f2.longValue() : -1;
                        String str7 = r302.A05.A04;
                        String A00 = A00();
                        C6oY c6oY = ((AvatarConfigRepository) 1Br.A0B(this.A01)).A00;
                        String A0q = c6oY != null ? 7zO.A0q(c6oY.A02) : null;
                        11T.A0F(str7, 9);
                        C00i c00i = hZw.A01.A00;
                        if (1BK.A0I(c00i).AZk(36321228457853047L)) {
                            A08 = 1BK.A08(1Br.A02(hZw.A00), 1BJ.A00(1019));
                            0DA r02 = new 0DA();
                            GOq.A1E(r02, str5);
                            Long A0l = 1BK.A0l(i7);
                            GOq.A1D(r02, A0l);
                            r02.A06("sticker_rank", Long.valueOf(j));
                            I68.A02(r02, num, true, z4, A1W);
                            GOp.A1K(r02, i6);
                            r02.A06("result_size", A0l);
                            r02.A06("media_template_id", Long.valueOf(longValue));
                            r02.A07("media_template_name", str7);
                            if (1BK.A0I(c00i).AZk(36321228457918584L)) {
                                r02.A07("avatar_style_id", A00);
                                r02.A07("avatar_revision_id", A0q);
                            }
                            if (A08.isSampled()) {
                                A08.A7T(r02, "event_data");
                                A08.BZL();
                            }
                        }
                    }
                }
            }
        }
    }

    public final void A04(boolean z) {
        if (z) {
            Hlj hlj = (Hlj) 1Br.A0B(this.A03);
            String str = this.A00;
            1UG A08 = 1BK.A08(1Br.A02(hlj.A00), 1BJ.A00(1014));
            0DA r0 = new 0DA();
            r0.A07("search_query", "");
            AbstractC2326GOr.A18(r0, A08, str);
        }
        this.A00 = 7zR.A0s();
    }

    public final void A05(boolean z) {
        if (z) {
            Hlj hlj = (Hlj) 1Br.A0B(this.A03);
            String str = this.A00;
            1UG A08 = 1BK.A08(1Br.A02(hlj.A00), 1BJ.A00(1017));
            0DA r0 = new 0DA();
            r0.A07("referrer_surface", "message_thread");
            r0.A07("ui_component", "message_reply");
            AbstractC2326GOr.A18(r0, A08, str);
            return;
        }
        HZw hZw = (HZw) 1Br.A0B(this.A02);
        String str2 = this.A00;
        String A00 = A00();
        C6oY c6oY = ((AvatarConfigRepository) 1Br.A0B(this.A01)).A00;
        String A0q = c6oY != null ? 7zO.A0q(c6oY.A02) : null;
        C00i c00i = hZw.A01.A00;
        if (AbstractC2326GOr.A1X(c00i)) {
            1UG A082 = 1BK.A08(1Br.A02(hZw.A00), "avatar_stickers_measurement_e2ee_avatar_sticker_tray_launch");
            0DA r02 = new 0DA();
            GOq.A1E(r02, str2);
            GOq.A1D(r02, 4YV.A0j());
            AbstractC2326GOr.A19(r02, c00i, A00, A0q);
            if (A082.isSampled()) {
                A082.A7T(r02, "event_data");
                A082.BZL();
            }
        }
    }
}
