package com.facebook.fbavatar.sticker.fetch;

import X.11T;
import X.1BL;
import X.2yD;
import X.5Tn;
import X.5iJ;
import X.5iK;
import X.7zK;
import X.AbF;
import X.AbstractC01653se;
import X.C30G;
import X.EAA;
import X.F9Q;
import X.GEs;

/* loaded from: AvatarStickersSingleQueryDataFetch.class */
public final class AvatarStickersSingleQueryDataFetch extends 5iK {
    public int A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public EAA A04;
    public 5iJ A05;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.fbavatar.sticker.fetch.AvatarStickersSingleQueryDataFetch] */
    public static AvatarStickersSingleQueryDataFetch create(5iJ r301, EAA eaa) {
        ?? obj = new Object();
        obj.A05 = r301;
        obj.A02 = eaa.A02;
        obj.A03 = eaa.A03;
        obj.A01 = eaa.A01;
        obj.A00 = eaa.A00;
        obj.A04 = eaa;
        return obj;
    }

    public 5Tn A00() {
        5iJ r0 = this.A05;
        int i = this.A00;
        boolean z = this.A02;
        boolean z2 = this.A03;
        String str = this.A01;
        11T.A0F(r0, 0);
        2yD A0Q = 1BL.A0Q();
        C30G A0H = AbF.A0H(24);
        A0H.A06("preview_image_width", i);
        A0H.A06("avatar_stickers_connection_first", 2yD.A00(A0Q, 36592958161159157L));
        A0H.A08("fetch_animated_image", 2yD.A03(A0Q, 2342160642783522284L));
        A0H.A08(7zK.A00(311), z);
        A0H.A08("fetch_composer_banner_pose", z2);
        A0H.A05("scale", Double.parseDouble(AbstractC01653se.A01().serverValue));
        if (str != null) {
            A0H.A03("post_id", str);
        }
        F9Q f9q = new F9Q(A0H, (GEs) null);
        f9q.A02(0L);
        f9q.A0B = false;
        return F9Q.A00(r0, f9q, 309734833625258L);
    }
}
