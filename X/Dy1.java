package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateUtils;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.mms.MmsData;
import com.google.common.base.Preconditions;

/* loaded from: Dy1.class */
public final class Dy1 extends C1rj {
    public 06Z A00;
    public FbUserSession A01;
    public Message A02;

    public Dy1() {
        super("MmsDownloadComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00, this.A02};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String A0u;
        int i;
        E0R A0P = 4YU.A0P(r302);
        Message message = this.A02;
        FzA fzA = A0P.A00;
        Context context = r302.A0D;
        F6T f6t = (F6T) 1Bn.A0E(context, (1BY) null, 99729);
        MmsData A07 = message.A07();
        Preconditions.checkArgument(A07.A00());
        fzA.A00 = 7zL.A14(r302);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        A01.A0r(144.0f);
        A01.A0X();
        A01.A2b();
        A01.A1I(2132214427);
        RQ9 rq9 = f6t.A01;
        String str = message.A1V;
        rq9.A00();
        CNN cnn = f6t.A02;
        HAn A012 = cnn.A01(str);
        HAn hAn = HAn.A05;
        A01.A2T((A012 == hAn || A012 == HAn.A0B) ? null : 1LI.A06(r302, Dy1.class, "MmsDownloadComponent"));
        C2cq A00 = C2cp.A00(r302, 0);
        A00.A17(36.0f);
        A00.A18(18.0f);
        A00.A2Z(2132346886);
        A01.A2d(A00);
        3yF A0L = 2KZ.A0L(r302, 0);
        A0L.A2z(2132213991);
        A0L.A2g();
        Resources resources = context.getResources();
        rq9.A00();
        HAn A013 = cnn.A01(str);
        if (A013 == hAn) {
            i = 2131960366;
        } else {
            if (A013 != HAn.A0B) {
                int i2 = 2131960363;
                if (A013 == HAn.A04) {
                    i2 = 2131960362;
                }
                A0u = 4YU.A0u(resources, 4YU.A0u(resources, Long.valueOf(((A07.A01 + 1024) - 1) / 1024), 2131960376), i2);
                A0L.A3A(A0u);
                A01.A2d(A0L);
                3yF A0L2 = 2KZ.A0L(r302, 0);
                A0L2.A18(36.0f);
                A0L2.A2z(2132213991);
                A0L2.A2g();
                long j = A07.A00;
                A0L2.A3A(context.getResources().getString(2131960365, DateUtils.formatDateTime(context, j, 65560), DateUtils.formatDateTime(context, j, 18945)));
                A01.A2d(A0L2);
                return A01.A00;
            }
            i = 2131960367;
        }
        A0u = resources.getString(i);
        A0L.A3A(A0u);
        A01.A2d(A0L);
        3yF A0L22 = 2KZ.A0L(r302, 0);
        A0L22.A18(36.0f);
        A0L22.A2z(2132213991);
        A0L22.A2g();
        long j2 = A07.A00;
        A0L22.A3A(context.getResources().getString(2131960365, DateUtils.formatDateTime(context, j2, 65560), DateUtils.formatDateTime(context, j2, 18945)));
        A01.A2d(A0L22);
        return A01.A00;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1932591986) {
            if (i != -1351902487) {
                4YV.A1G(r302, obj, i);
                return null;
            }
            1Iw r0 = r302.A00.A00;
            4YU.A0P(r0).A01.onClick(((3xC) obj).A00);
            return null;
        }
        1Iv r02 = r302.A00;
        1Is r03 = r02.A01;
        1Iw r04 = r02.A00;
        Dy1 dy1 = (Dy1) r03;
        E0R A0P = 4YU.A0P(r04);
        ((6Sp) 1Lo.A04((Context) null, dy1.A01, A0P.A02.A00, 50103)).A03(A0P.A01.A00, "");
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.FzA, java.lang.Object, java.lang.Runnable] */
    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        E0R e0r = (E0R) r303;
        Message message = this.A02;
        06Z r0 = this.A00;
        Context context = r302.A0D;
        F6T f6t = (F6T) 1Bn.A0E(context, (1BY) null, 99729);
        ?? obj = new Object();
        ((FzA) obj).A00 = 7zL.A14(r302);
        Rjf rjf = new Rjf(r0, new Rp1(context, message, f6t, (Runnable) obj), message, (6Sp) 1Lo.A04((Context) null, 4YV.A0D(context), f6t.A00, 50103));
        e0r.A00 = obj;
        e0r.A01 = rjf;
        e0r.A02 = f6t;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
