package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;

/* loaded from: Dw4.class */
public final class Dw4 extends 1LH {
    public static final CallerContext A03;
    public static final java.util.Map A04;
    public final C00m A00;
    public final C00m A01;
    public final String A02;

    static {
        java.util.Map map = 0BY.A03;
        A03 = CallerContext.A0B(C0Bx.A01(Dw4.class));
        A04 = 4YW.A0A("comments_sticker_nux", 4YV.A13(2131956754, 2131956752), 1BK.A1G("stories_stickers_picker", 4YV.A13(2131956753, 2131956751)));
    }

    public Dw4(String str, C00m c00m, C00m c00m2) {
        11T.A0F(c00m2, 2);
        this.A00 = c00m;
        this.A01 = c00m2;
        this.A02 = str;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        java.util.Map map = A04;
        String str = this.A02;
        03Y r0 = (03Y) map.get(str);
        int A032 = r0 != null ? AnonymousClass001.A03(r0.first) : 2131956753;
        03Y r02 = (03Y) map.get(str);
        int A033 = r02 != null ? AnonymousClass001.A03(r02.second) : 2131956751;
        boolean AZk = DKE.A0c().AZk(72340172821302526L);
        2lQ r03 = 2lO.A02;
        2lO A0K = 4YV.A0K((2lO) null, 0S2.A0A, 7zP.A0A());
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw r04 = A0L.A00;
        C2cq A00 = C2cp.A00(r04, 0);
        A00.A0T();
        A00.A10(60.0f);
        int i = 2132344934;
        if (AZk) {
            i = 2132475939;
        }
        A00.A2Z(i);
        A0L.A00(A00.A2W());
        C2152Dfg A042 = AbstractC2178Dg6.A04(r04, 0);
        A042.A05 = 3yH.A09(A0L, A032);
        A042.A03 = EP4.A0F;
        A042.A0e(true);
        A042.A0R(0.0f);
        C26z c26z = C26z.ALL;
        A042.A0h(c26z, 6.0f);
        AbstractC2178Dg6.A06(A042).A10(100.0f);
        FAa A002 = FAa.A00();
        Context context = r04.A0D;
        2Mg r05 = 2Me.A02;
        A002.A05(r05.A02(context));
        AbstractC2178Dg6.A0H(A042, A002);
        CallerContext callerContext = A03;
        AbstractC2178Dg6.A08(callerContext, A042, A0L);
        C2152Dfg c2152Dfg = new C2152Dfg(r04);
        c2152Dfg.A05 = 3yH.A09(A0L, A033);
        c2152Dfg.A03 = EP4.A08;
        c2152Dfg.A0R(0.0f);
        c2152Dfg.A0h(c26z, 6.0f);
        AbstractC2178Dg6.A06(c2152Dfg).A10(100.0f);
        FAa A003 = FAa.A00();
        A003.A05(r05.A03(context, 2MR.A2B));
        AbstractC2178Dg6.A0H(c2152Dfg, A003);
        AbstractC2178Dg6.A08(callerContext, c2152Dfg, A0L);
        AbstractC2162Dfq abstractC2162Dfq = new AbstractC2162Dfq(r04);
        abstractC2162Dfq.A0h(3yH.A09(A0L, 2131956769));
        abstractC2162Dfq.A04 = ENO.A03;
        abstractC2162Dfq.A03 = ENu.A02;
        abstractC2162Dfq.A0X(C26z.TOP, 4.0f);
        abstractC2162Dfq.A06 = 7zO.A0U(new JBV(this, 25));
        AbstractC2178Dg6.A08(callerContext, abstractC2162Dfq, A0L);
        return C2so.A04(A0L, c2k5, A0K);
    }
}
