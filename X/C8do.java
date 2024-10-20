package X;

import android.view.ActionMode;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8do, reason: invalid class name */
/* loaded from: 8do.class */
public final class C8do extends 1LH {
    public final 6RU A00;
    public final 1Im A01;
    public final HighlightsFeedContent A02;
    public final A5E A03;
    public final 2Of A04;
    public final 78U A05;
    public final C77v A06;
    public final 6wU A07;
    public final C6xp A08;

    public C8do(1Im r302, HighlightsFeedContent highlightsFeedContent, A5E a5e, 6RU r305, 2Of r306, 78U r307, C77v c77v, 6wU r309, C6xp c6xp) {
        7zT.A1U(r309, c77v, c6xp);
        4YV.A1M(r307, 5, r302);
        11T.A0F(r306, 9);
        this.A00 = r305;
        this.A07 = r309;
        this.A06 = c77v;
        this.A08 = c6xp;
        this.A05 = r307;
        this.A03 = a5e;
        this.A01 = r302;
        this.A02 = highlightsFeedContent;
        this.A04 = r306;
    }

    public 1LI A0s(C2k5 c2k5) {
        C8dq c8dq;
        11T.A0F(c2k5, 0);
        A5E a5e = this.A03;
        if ((a5e != null ? a5e.A00 : null) == 95K.A02) {
            return null;
        }
        final C6xp c6xp = this.A08;
        6tM r0 = c6xp.A03;
        11T.A0I(r0, "null cannot be cast to non-null type com.facebook.xapp.bolt.theme.mds.MdsBoltTheme");
        2lQ r02 = 2lO.A02;
        int A00 = r0.A00(0S2.A0N);
        Integer num = 0S2.A00;
        2lO A0Z = 7zQ.A0Z(7zS.A0c(4YV.A0L((2lO) null, num, 7zL.A0j(A00), 1), 0S2.A01, true), num, AVD.A01(this, 15));
        C2sn A0L = 7zR.A0L(c2k5);
        78U r03 = this.A05;
        7Te r04 = r03.A00;
        if (r04 != null) {
            MigColorScheme migColorScheme = r0.A00;
            int i = c6xp.A00;
            ABJ abj = ABJ.A00;
            CharSequence charSequence = r03.A03;
            CharSequence charSequence2 = r03.A02;
            2Of r05 = this.A04;
            C5j5 c5j5 = C5j5.A00;
            11T.A0B(c5j5);
            c8dq = new C8dq(c5j5, migColorScheme, r05, r04, abj, charSequence, charSequence2, i, false);
        } else {
            c8dq = null;
        }
        A0L.A00(c8dq);
        2lO A0Y = 7zT.A0Y(4YV.A0L(7zQ.A0X((2lO) null, 0S2.A0C, 0.0f), num, C1ro.STRETCH, 0), 7zN.A0U(3yH.A02(A0L)), 3yH.A03(A0L));
        C2sn A0K = 7zS.A0K(A0L);
        1Iw r06 = A0K.A00;
        6RU r07 = this.A00;
        6wU r08 = this.A07;
        final C77v c77v = this.A06;
        final 1Im r09 = this.A01;
        A0K.A00(new 7Ex((ActionMode.Callback) null, (ActionMode.Callback) null, (1LI) null, (1LI) null, (1LI) null, r06, r09, r07, c77v, r08, c6xp, r06.A0D(2131957892), (String) null, 0, 2132279327, 2132279327, 2132279313, 0, 0, 33324928, false, false, false));
        7zQ.A1F(new 1LH(r09, c77v, c6xp) { // from class: X.8X8
            public final 1Im A00;
            public final C77v A01;
            public final C6xp A02;

            {
                7zR.A1N(c77v, r09);
                this.A01 = c77v;
                this.A02 = c6xp;
                this.A00 = r09;
            }

            public 1LI A0s(C2k5 c2k52) {
                11T.A0F(c2k52, 0);
                boolean z = this.A01.A03;
                if (!z) {
                    return null;
                }
                C1u2 A0I = 4YV.A0I();
                1Iw r010 = c2k52.A05;
                C87y A002 = 7Sk.A00(r010);
                2lQ r011 = 2lO.A02;
                C5z7.A00(A002, 7zS.A0R((2lO) null, 0.0f));
                A002.A0D(7Ee.A00(7zL.A0A(r010)));
                A002.A2Y(z);
                int A003 = this.A02.A03.A00(0S2.A0K);
                7Sk r012 = A002.A01;
                r012.A00 = A003;
                A002.A2X(7zM.A01());
                r012.A01 = A0I.A03(C1u3.A5k);
                r012.A03 = this.A00;
                return A002.A2W();
            }
        }, A0K, A0L, A0Y);
        return C2so.A02(A0L, c2k5, A0Z);
    }
}
