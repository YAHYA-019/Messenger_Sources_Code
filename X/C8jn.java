package X;

import android.text.TextUtils;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.8jn, reason: invalid class name */
/* loaded from: 8jn.class */
public final class C8jn extends C1rj {
    public int A00;
    public int A01;
    public long A02;
    public FbUserSession A03;
    public 5zD A04;
    public ImmutableList A05;
    public CharSequence A06;
    public String A07;

    public C8jn() {
        super("PollPublishedOptionComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A07, this.A03, Long.valueOf(this.A02), this.A06, this.A04, Integer.valueOf(this.A00), this.A05, Integer.valueOf(this.A01)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        int i;
        Object[] objArr;
        FbUserSession fbUserSession = this.A03;
        CharSequence charSequence = this.A06;
        ImmutableList immutableList = this.A05;
        int i2 = this.A01;
        int i3 = this.A00;
        long j = this.A02;
        String str = this.A07;
        5zD r0 = this.A04;
        C28o c28o = (C28o) 1Bi.A03(16909);
        23F r02 = (23F) 1Lo.A04(r302.A0D, fbUserSession, (1BY) null, 33102);
        MigColorScheme Axg = r0.Axg();
        C1rq A01 = C1rg.A01(r302, null, 0);
        A01.A10(100.0f);
        C1ro c1ro = C1ro.CENTER;
        A01.A2h(c1ro);
        2KD A012 = 2K3.A01(r302, 0);
        A012.A2k();
        A012.A2b();
        A012.A2z(charSequence);
        A012.A2x(Axg);
        A012.A2q(1);
        2RH r03 = 2RH.A05;
        7zO.A1L(A012, r03);
        A012.A0j(1.0f);
        A01.A2e(A012);
        2rS A00 = 2rR.A00(r302);
        A00.A0k(0.0f);
        7zO.A1S(A00, (List) null, immutableList);
        7zT.A1R(A00);
        A00.A2a(3);
        A00.A2d(true);
        A00.A2b(Axg);
        2rR r04 = A00.A01;
        r04.A00 = i2;
        r04.A09 = true;
        r04.A01 = Axg.Awo();
        A01.A2e(A00);
        float min = i3 > 0 ? Math.min(i2 / i3, 1.0f) : 0.0f;
        int B4l = r0.B4l();
        int A05 = 7zO.A05(Axg, 251658240, 352321535);
        2cM A013 = 2cK.A01(r302, (String) null, 0);
        A013.A10(100.0f);
        A013.A1N(8);
        String charSequence2 = charSequence.toString();
        int min2 = Math.min(i2 > 3 ? Math.min(2, i2) : Math.min(i2, 3), immutableList.size());
        int i4 = i2 - min2;
        int round = Math.round(min * 100.0f);
        StringBuilder A0k = AnonymousClass001.A0k();
        for (int i5 = 0; i5 < min2; i5++) {
            C2cd.A07(c28o.A04(r02.A00((UserKey) immutableList.get(i5)), false), A0k, AnonymousClass001.A1P(i5));
        }
        if (i2 == 0) {
            i = 2131952469;
            objArr = new Object[]{charSequence2};
        } else if (i4 == 0) {
            i = 2131952470;
            objArr = new Object[]{charSequence2, Integer.valueOf(round), A0k};
        } else {
            i = 2131952471;
            objArr = new Object[]{charSequence2, Integer.valueOf(round), A0k, Integer.valueOf(i4)};
        }
        A013.A2S(r302.A0E(i, objArr));
        4YU.A1N(A01, r03);
        A013.A2d(A01);
        8T3 A002 = C8o0.A00(r302);
        A002.A2Y(min);
        C8o0 c8o0 = A002.A00;
        c8o0.A02 = A05;
        A002.A2X(8.0f);
        c8o0.A06 = new int[]{B4l};
        c8o0.A05 = true;
        c8o0.A04 = AnonymousClass001.A0h(AnonymousClass001.A0n("poll"), j);
        A002.A10(100.0f);
        A002.A12(6.0f);
        A013.A2d(A002);
        if (TextUtils.isEmpty(str)) {
            return A013.A00;
        }
        C1rq A014 = C1rg.A01(r302, null, 0);
        2rS A003 = 2rR.A00(r302);
        A003.A2b(Axg);
        A003.A2Z(48.0f);
        7zO.A1S(A003, (List) null, ImmutableList.of((Object) 1BK.A0X(str)));
        A003.A1y(c1ro);
        4YU.A1O(A003, 2RH.A04, C26z.RIGHT);
        A014.A2e(A003);
        A014.A2h(c1ro);
        A014.A2g(c1ro);
        return 7zL.A0c(A013, A014);
    }
}
