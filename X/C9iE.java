package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.TriState;
import com.facebook.fbavatar.config.AvatarConfigRepository;
import com.facebook.fbavatar.sticker.fetch.MsgrAvatarStickerDataSource;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.9iE, reason: invalid class name */
/* loaded from: 9iE.class */
public final class C9iE {
    public boolean A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final ConcurrentHashMap A08;
    public final 1De A09;
    public volatile Set A0A;

    public C9iE(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A09 = r303;
        1BY r0 = r303.A00;
        this.A03 = 1Bu.A03(r0, 68617);
        this.A06 = 1Lm.A03(fbUserSession, r0, 68616);
        this.A01 = 1Lm.A03(fbUserSession, r0, 66197);
        this.A02 = 1Lm.A03(fbUserSession, r0, 68724);
        this.A07 = 1Lm.A03(fbUserSession, r0, 68619);
        this.A0A = AnonymousClass001.A0v();
        this.A08 = new ConcurrentHashMap();
        this.A05 = 1Lm.A03(fbUserSession, r0, 68618);
        this.A04 = 1Lm.A03(fbUserSession, r0, 68376);
        9V9 r02 = (9V9) 1Br.A0B(this.A07);
        C5op c5op = r02.A00;
        if (c5op != null) {
            c5op.A00();
        }
        MsgrAvatarStickerDataSource msgrAvatarStickerDataSource = (MsgrAvatarStickerDataSource) 1Br.A0B(r02.A03);
        1G1 r03 = r02.A01;
        Ewv ewv = r02.A02;
        boolean AZk = 7G3.A00((7G3) 1Br.A0B(r02.A04)).AZk(36318479679369891L);
        9H1 r04 = new 9H1(r02);
        11T.A0F(ewv, 1);
        Eua eua = (Eua) 4YU.A0o(r03, msgrAvatarStickerDataSource.A00, 99905);
        GraphQlQueryParamSet A0M = 7zL.A0M();
        4YV.A1A(4YU.A0J(GraphQlCallInput.A02, r03.A05, "user_id"), A0M, "input");
        A0M.A04(DKB.A00(501), Integer.valueOf(EVN.A00(4YV.A09(msgrAvatarStickerDataSource.A03), (C09964s0) 1Br.A0B(msgrAvatarStickerDataSource.A04), 4.0f, 0.0f, 4)));
        A0M.A03(DKB.A00(391), Boolean.valueOf(AZk));
        C3sa A0L = 7zM.A0L(A0M, new C01983tf(8IU.class, "AvatarStickerSubscription", "airbender_sticker_subscribe", -2130321579, 2970785274L, 2970785274L));
        11T.A0D(A0L);
        r02.A00 = eua.A00(C9dz.A00, A0L, new ABp(msgrAvatarStickerDataSource, r04, 1));
        7zO.A1W(this, 7zN.A0y(), 39);
        ((9YT) 1Br.A0B(this.A06)).A00 = new GAa(this, 44);
    }

    public static final void A00(C9iE c9iE, 8Lt r302) {
        AbstractMap abstractMap;
        if (r302 == null) {
            Iterator A0x = AnonymousClass001.A0x(c9iE.A08);
            while (A0x.hasNext()) {
                ((AZu) AnonymousClass001.A0z(A0x).getKey()).CNT(TriState.UNSET, null, C0ty.A00);
            }
            return;
        }
        List list = (List) r302.A02;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = ((8Le) it.next()).A02;
            if (obj != null) {
                A0s.add(obj);
            }
        }
        HashSet A0v = AnonymousClass001.A0v();
        ArrayList A0s2 = AnonymousClass001.A0s();
        for (Object obj2 : A0s) {
            7zR.A1T(((8K7) obj2).A08, obj2, A0v, A0s2);
        }
        boolean A02 = ((7G3) 1Br.A0B(c9iE.A03)).A02();
        AbstractMap abstractMap2 = c9iE.A08;
        if (A02) {
            abstractMap = 1BK.A1C();
            Iterator A0x2 = AnonymousClass001.A0x(abstractMap2);
            while (A0x2.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0x2);
                if (11T.A0O(A0z.getValue(), r302.A03)) {
                    1BL.A1O(abstractMap, A0z);
                }
            }
        } else {
            abstractMap = abstractMap2;
        }
        Iterator A0y = AnonymousClass001.A0y(abstractMap);
        while (A0y.hasNext()) {
            ((AZu) AnonymousClass001.A0z(A0y).getKey()).CNT((TriState) r302.A01, null, A0s2);
        }
    }

    public final 0oO A01(ThreadKey threadKey) {
        11T.A0F(threadKey, 0);
        0zV r0 = ((AvatarConfigRepository) 1Br.A0B(this.A01)).A06;
        Object A0B = 1Br.A0B(this.A02);
        0N0 r02 = new 0N0(AJj.A01(A0B, threadKey, null, 22));
        AJV ajv = new AJV(A0B, null, 29);
        int i = 0Jx.A00;
        return new 0oO(1, new 0oW(new 0oS(ajv, r02, 4), 4), r0, new AJn(0, null));
    }

    public final void A02() {
        ((C9lA) 1Br.A0B(this.A05)).A01();
        ((9YT) 1Br.A0B(this.A06)).A00((8Lt) null);
    }

    public final void A03(AZu aZu, ThreadKey threadKey) {
        11T.A0H(aZu, threadKey);
        this.A08.put(aZu, threadKey);
        C9lA c9lA = (C9lA) 1Br.A0B(this.A05);
        9Gz r0 = new 9Gz(this);
        9H0 r02 = new 9H0(this);
        c9lA.A01 = r0;
        c9lA.A02 = r02;
    }

    public final void A04(ThreadKey threadKey, Integer num) {
        11T.A0F(threadKey, 0);
        C00i c00i = this.A03.A00;
        if (7G3.A00((7G3) c00i.get()).AZk(36318479680352940L)) {
            ((9lK) 1Br.A0B(this.A04)).A04(0S2.A1G, AnonymousClass001.A0K());
            2aK.A03((Integer) null, (0DE) null, new AJV(threadKey, this, (0DR) null, 28), 7zN.A0y(), 3);
            return;
        }
        8Lt r0 = (8Lt) ((9YT) 1Br.A0B(this.A06)).A02.get();
        if (r0 == null || (!11T.A0O(r0.A03, threadKey) && ((7G3) c00i.get()).A02())) {
            ((C9lA) 1Br.A0B(this.A05)).A02(threadKey, num, this.A00);
        } else {
            ((9lK) 1Br.A0B(this.A04)).A02(8Hf.A00);
            A00(this, r0);
        }
    }

    public final boolean A05() {
        return 7G3.A00((7G3) 1Br.A0B(this.A03)).AZk(36318479680352940L);
    }
}
