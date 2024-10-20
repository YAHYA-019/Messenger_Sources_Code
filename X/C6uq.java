package X;

import android.view.View;
import com.google.common.collect.ImmutableList;

/* renamed from: X.6uq, reason: invalid class name */
/* loaded from: 6uq.class */
public final class C6uq implements C2ot {
    public final AaO A00;

    public C6uq(AaO aaO) {
        this.A00 = aaO;
    }

    @Override // X.C2ot
    public /* bridge */ /* synthetic */ 1LI CfM(1Iw r302, Object obj, Object obj2) {
        C9g0 c9g0;
        C6rG c6rG = (C6rG) obj;
        11T.A0F(r302, 0);
        11T.A0F(c6rG, 1);
        7Vq r0 = c6rG.A00;
        C8So A00 = 8oN.A00(r302);
        A00.A2X(r0.A05);
        String str = c6rG.A02;
        8oN r02 = A00.A01;
        r02.A0A = str;
        r02.A00 = new 9pS(this, r0, 1);
        r02.A09 = r0.A0E;
        r02.A01 = r0.A03;
        CharSequence charSequence = c6rG.A01;
        if (charSequence != null) {
            r02.A0D = ImmutableList.of((Object) 7Uy.A01(charSequence.toString()));
        }
        View.OnClickListener onClickListener = r0.A02;
        if (onClickListener != null) {
            String str2 = r0.A09;
            11T.A0A(str2);
            c9g0 = 9DU.A00(onClickListener, str2);
        } else {
            c9g0 = null;
        }
        r02.A04 = c9g0;
        Long l = r0.A07;
        if (l != null) {
            String str3 = r0.A0A;
            11T.A0A(str3);
            r02.A05 = 9DU.A00(new 9pW(0, l, this, r0), str3);
        }
        Long l2 = r0.A08;
        if (l2 != null) {
            String str4 = r0.A0C;
            11T.A0A(str4);
            r02.A06 = 9DU.A00(new 9pW(1, l2, this, r0), str4);
        }
        return A00.A2V();
    }
}
