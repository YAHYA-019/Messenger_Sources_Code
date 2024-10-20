package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* renamed from: X.75a, reason: invalid class name */
/* loaded from: 75a.class */
public final class C75a implements 74V {
    public final FbUserSession A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A04;
    public final 4kB A06;
    public final Context A07;
    public final 72V A08;
    public final HeterogeneousMap A09;
    public final 1Br A03 = 1Bq.A00(68077);
    public final 1Br A05 = 1Bq.A00(147832);

    public C75a(Context context, FbUserSession fbUserSession, 72V r304, 4kB r305, HeterogeneousMap heterogeneousMap) {
        this.A08 = r304;
        this.A07 = context;
        this.A00 = fbUserSession;
        this.A06 = r305;
        this.A09 = heterogeneousMap;
        this.A02 = 1Lm.A00(context, fbUserSession, 65961);
        this.A01 = 1Bu.A01(context, 68925);
        this.A04 = 1Bu.A01(context, 116182);
    }

    public static final void A00(C75a c75a, String str, boolean z) {
        if (str != null) {
            5Et r0 = (5Et) 1Br.A0B(c75a.A04);
            if (z) {
                r0.A03(319, str);
            } else {
                r0.A01.A01(319, str);
            }
        }
    }

    public void A7C(Capabilities capabilities, Long l, Long l2, String str, String str2) {
        11T.A0F(str, 0);
        11T.A0F(str2, 1);
        String A00 = ((5Et) this.A04.A00.get()).A00(319);
        if (l != null) {
            this.A06.A73((int) l.longValue(), "SEND_MESSAGE_API_START");
        }
        5P8 r0 = (5P8) this.A02.A00.get();
        this.A03.A00.get();
        String A002 = 5QA.A00(this.A08.A00);
        Long valueOf = Long.valueOf(l2 != null ? l2.longValue() : -1);
        this.A01.A00.get();
        LoggingOption A003 = 5Q5.A00((PrivacyContext) null, (Integer) null, 319, l, A00, (String) null, (String) null);
        this.A05.A00.get();
        r0.A01(A003, valueOf, Long.valueOf(Long.parseLong(this.A00.A02)), A002, str2, str).addResultCallback(new A0F(this, l, A00, 4));
    }

    public void Cf4(Capabilities capabilities, Long l, String str, String str2) {
        11T.A0F(str, 0);
        String A00 = ((5Et) this.A04.A00.get()).A00(319);
        5P8 r0 = (5P8) this.A02.A00.get();
        this.A03.A00.get();
        String A002 = 5QA.A00(this.A08.A00);
        this.A01.A00.get();
        LoggingOption A003 = 5Q5.A00((PrivacyContext) null, (Integer) null, 319, (Number) null, A00, (String) null, (String) null);
        this.A05.A00.get();
        r0.A01(A003, -1, Long.valueOf(Long.parseLong(this.A00.A02)), A002, (String) null, str).addResultCallback(new A08(A00, this, 0));
    }
}
