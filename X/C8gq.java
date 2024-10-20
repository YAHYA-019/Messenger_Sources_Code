package X;

import android.graphics.Typeface;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.messaging.highlightstab.model.HighlightsReplyMessageContent;
import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8gq, reason: invalid class name */
/* loaded from: 8gq.class */
public final class C8gq extends 1LH {
    public static final long A06 = 7zP.A0A();
    public static final long A07 = 7zP.A0D();
    public final Aaj A00;
    public final HighlightsFeedContent A01;
    public final C9yk A02;
    public final User A03;
    public final 5zD A04;
    public final MigColorScheme A05;

    public C8gq(5zD r302, Aaj aaj, HighlightsFeedContent highlightsFeedContent, C9yk c9yk, MigColorScheme migColorScheme, User user) {
        1BL.A11(1, migColorScheme, aaj, r302);
        11T.A0F(c9yk, 6);
        this.A05 = migColorScheme;
        this.A01 = highlightsFeedContent;
        this.A00 = aaj;
        this.A04 = r302;
        this.A03 = user;
        this.A02 = c9yk;
    }

    public 1LI A0s(C2k5 c2k5) {
        MontageBucketPreview A00;
        11T.A0F(c2k5, 0);
        HighlightsFeedContent highlightsFeedContent = this.A01;
        List list = highlightsFeedContent.A0n;
        ArrayList A0z = 7zO.A0z(list, 0);
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object obj : list) {
            if (((HighlightsReplyMessageContent) obj).A0Q) {
                A0z.add(obj);
            } else {
                A0s.add(obj);
            }
        }
        03Y A1G = A0s.size() <= 3 ? 1BK.A1G(list, C0ty.A00) : 1BK.A1G(0QD.A0O(A0z, 0QD.A0d(A0s, 07C.A07(A0s.size() - 2, A0s.size()))), 0QD.A0d(A0s, new 07E(0, A0s.size() - 3)));
        List<HighlightsReplyMessageContent> list2 = (List) A1G.first;
        List list3 = (List) A1G.second;
        C2sn A0U = 7zQ.A0U(c2k5.A05);
        if (1BK.A1Y(list3)) {
            2lQ r0 = 2lO.A02;
            2lO A0L = 4YV.A0L(4YV.A0K((2lO) null, 0S2.A08, A06), 0S2.A1G, AV6.A00(list3, this, 24), 1);
            C2sn A0K = 7zS.A0K(A0U);
            String A0s2 = 7zO.A0s(A0K, list3.size(), 2131957891);
            int B4i = this.A05.B4i();
            long j = A07;
            Typeface typeface = Typeface.DEFAULT_BOLD;
            2KG r02 = 2KG.A04;
            long A08 = 7zP.A08();
            3yF A0W = 7zP.A0W(A0K, A0s2, 0);
            7zS.A1Q(A0K, A0W, B4i, j);
            A0W.A33(0);
            7zT.A15(typeface, A0K, A0W, A08);
            A0W.A38(r02);
            A0W.A2t(0);
            A0W.A2h();
            7zT.A1N(A0W, false, true);
            A0W.A37((2K8) null);
            7zQ.A1F(A0W.A2W(), A0K, A0U, A0L);
        }
        for (HighlightsReplyMessageContent highlightsReplyMessageContent : list2) {
            11T.A0F(highlightsReplyMessageContent, 0);
            Iterator it = 9GK.A00.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C5fv A4m = ((AXt) it.next()).A4m(highlightsReplyMessageContent);
                if (A4m != null) {
                    long j2 = highlightsReplyMessageContent.A00;
                    String valueOf = String.valueOf(j2);
                    User user = this.A03;
                    boolean A0O = 11T.A0O(valueOf, user.A13);
                    MigColorScheme migColorScheme = this.A05;
                    8gD r03 = new 8gD(this.A04, migColorScheme, A4m, A0O);
                    long j3 = C8ha.A0F;
                    String A072 = A0O ? user.A07() : highlightsReplyMessageContent.A0O;
                    AV6 A002 = AV6.A00(highlightsReplyMessageContent, this, 25);
                    UserKey A003 = A0O ? user.A0k : UserKey.A00(Long.valueOf(j2));
                    11T.A0D(A003);
                    C9yk c9yk = this.A02;
                    A0U.A00(new C8ha(r03, null, highlightsFeedContent, migColorScheme, C1ro.FLEX_END, (!C1ub.A03.A0G() || (A00 = C9lf.A00(c9yk, A003)) == null) ? 0S2.A00 : A00.A09 ? 0S2.A01 : 0S2.A0C, A072, null, null, A002, new 84V(5, this, highlightsReplyMessageContent, A0O), 0.0f, C8ha.A0F, 1BL.A1X(A003, c9yk), false));
                }
            }
        }
        return new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0U.A01, false);
    }
}
