package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.4bh, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4bh.class */
public final class C04614bh {
    public final FbUserSession A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1CO A04;
    public volatile boolean A05;

    public C04614bh(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A00 = fbUserSession;
        this.A01 = 1Bq.A00(33013);
        this.A03 = 1Lm.A01(fbUserSession, 100241);
        this.A02 = 1Bq.A00(16467);
        this.A04 = (1CO) 1Bi.A03(16385);
    }

    public static final void A00(C04614bh c04614bh, boolean z) {
        C00i c00i = c04614bh.A01.A00;
        1Ql edit = ((FbSharedPreferences) c00i.get()).edit();
        C00i c00i2 = c04614bh.A03.A00;
        edit.putBoolean(((1M0) c00i2.get()).A00("business_chat_disclosure/has_user_seen_disclosure"), z).commit();
        if (((FbSharedPreferences) c00i.get()).BNM(((1M0) c00i2.get()).A00("business_chat_disclosure/has_user_continued"))) {
            1Ql A0U = 1BL.A0U(c00i);
            A0U.Cdj(((1M0) c00i2.get()).A00("business_chat_disclosure/has_user_continued"));
            A0U.commit();
        }
    }
}
