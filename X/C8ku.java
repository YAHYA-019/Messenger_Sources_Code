package X;

import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.composer.theme.model.ThreadThemeInfo;
import java.util.BitSet;

/* renamed from: X.8ku, reason: invalid class name */
/* loaded from: 8ku.class */
public final class C8ku extends C1rj {
    public 9W4 A00;
    public ThreadKey A01;
    public C9a1 A02;
    public ThreadThemeInfo A03;
    public boolean A04;

    public C8ku() {
        super("ThemeCustomizationPickerRichListItemComponent");
    }

    public final Object[] A0k() {
        return new Object[]{Boolean.valueOf(this.A04), this.A00, this.A02, this.A01, this.A03};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        8kY r313;
        C1rh A0d;
        C1rh A0d2;
        C2cp c2cp;
        ThreadThemeInfo threadThemeInfo = this.A03;
        9W4 r0 = this.A00;
        boolean z = this.A04;
        boolean A1X = 1BL.A1X(r302, threadThemeInfo);
        11T.A0F(r0, 2);
        C1rq A01 = C1rg.A01(r302, null, 0);
        A01.A2T(!z ? 1LI.A09(r302, C8ku.class, "ThemeCustomizationPickerRichListItemComponent", -235350043) : null);
        A01.A0e();
        A01.A0r(72.0f);
        A01.A1C(r0.A01);
        ColorDrawable A0D = 7zL.A0D(0);
        ColorDrawable A0D2 = 7zL.A0D(0);
        C07004ik A0J = 7zR.A0J();
        InterfaceC07034in interfaceC07034in = InterfaceC07034in.A04;
        A0J.A00(interfaceC07034in);
        A0J.A06(7zL.A0D(threadThemeInfo.A02));
        A0J.A0O = A1X;
        A0J.A0E = interfaceC07034in;
        C06974ih A0L = 7zL.A0L(A0J);
        C1rq A012 = C1rg.A01(r302, null, 0);
        A012.A0S();
        A012.A0l(72.0f);
        A012.A25(C26z.END, r0.A00);
        C1ro c1ro = C1ro.CENTER;
        A012.A2h(c1ro);
        Uri uri = threadThemeInfo.A08;
        if (uri != null) {
            5BH A0B = 7zN.A0B(uri, r302);
            A0B.A0l(50.0f);
            A0B.A0z(50.0f);
            A0B.A2Z(A0L);
            r313 = 7zL.A0K(A0B);
        } else {
            8RS r02 = new 8RS(r302, new 8kY());
            Drawable A00 = C9gu.A01.A00(9EJ.A00(threadThemeInfo), 3yG.A04(7zQ.A0J(r302), 50.0f));
            r313 = r02.A01;
            r313.A01 = A00;
            BitSet bitSet = r02.A02;
            bitSet.set(0);
            r313.A00 = 7zL.A04(r02, 50.0f);
            bitSet.set(A1X ? 1 : 0);
            r313.A04 = false;
            bitSet.set(2);
            r313.A02 = A0D;
            bitSet.set(3);
            r313.A03 = A0D2;
            bitSet.set(4);
            C1rs.A04(bitSet, r02.A03);
            r02.A0J();
        }
        11T.A0A(r313);
        A012.A2f(r313);
        7zL.A1M(A012, A01);
        C1rq A013 = C1rg.A01(r302, null, 0);
        A013.A2h(c1ro);
        A013.A0r(72.0f);
        2cM A014 = 2cK.A01(r302, (String) null, 0);
        String str = threadThemeInfo.A0E;
        11T.A0A(str);
        int i = r0.A0C;
        float f = r0.A06;
        Typeface typeface = r0.A0F;
        if (str.equals("")) {
            A0d = null;
        } else {
            C1rq A002 = C1rg.A00(r302);
            3yF A0v = 7zM.A0v(r302, str, 0);
            A0v.A2u(A1X ? 1 : 0);
            A0v.A2x(i);
            A0v.A2s(f);
            A0v.A34(typeface);
            A0v.A37(2K5.A03);
            A0v.A38(2KG.A03);
            A0d = 7zL.A0d(A0v.A2W(), A002);
        }
        A014.A2e(A0d);
        String str2 = threadThemeInfo.A0G;
        if (str2 == null) {
            str2 = "";
        }
        int i2 = r0.A0B;
        float f2 = r0.A05;
        Typeface typeface2 = r0.A0E;
        if (11T.A0O(str2, "")) {
            A0d2 = null;
        } else {
            C1rq A003 = C1rg.A00(r302);
            3yF A0v2 = 7zM.A0v(r302, str2, 0);
            A0v2.A2u(2);
            A0v2.A2x(i2);
            A0v2.A2s(f2);
            A0v2.A34(typeface2);
            A0v2.A37(2K5.A03);
            A0v2.A38(2KG.A03);
            A0d2 = 7zL.A0d(A0v2.A2W(), A003);
        }
        A014.A2e(A0d2);
        A014.A0j(1.0f);
        7zL.A1H(A014, A013);
        if (z) {
            C2cq A0u = 7zM.A0u(r0.A0I, r302, 0);
            A0u.A2S(7zN.A0u(r302, str, 2131955398));
            A0u.A0S();
            A0u.A1y(c1ro);
            A0u.A13(16.0f);
            c2cp = A0u.A2W();
        } else {
            c2cp = null;
        }
        A013.A2f(c2cp);
        A013.A0j(1.0f);
        A013.A0k(1.0f);
        7zL.A1M(A013, A01);
        return A01.A00;
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != -235350043) {
            return null;
        }
        C8ku c8ku = (C8ku) r302.A00.A01;
        ThreadThemeInfo threadThemeInfo = c8ku.A03;
        C9a1 c9a1 = c8ku.A02;
        ThreadKey threadKey = c8ku.A01;
        1BL.A1F(threadThemeInfo, c9a1);
        c9a1.A00(threadKey, threadThemeInfo);
        return null;
    }
}
