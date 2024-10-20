package X;

import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* renamed from: X.8e7, reason: invalid class name */
/* loaded from: 8e7.class */
public final class C8e7 extends 1LH {
    public final View.OnClickListener A00;
    public final FbUserSession A01;
    public final QAd A02;
    public final JKE A03;
    public final AnonymousClass553 A04;
    public final AnonymousClass553 A05;
    public final AnonymousClass553 A06;
    public final AnonymousClass553 A07;
    public final AnonymousClass553 A08;
    public final MigColorScheme A09;

    public C8e7(View.OnClickListener onClickListener, FbUserSession fbUserSession, QAd qAd, JKE jke, AnonymousClass553 anonymousClass553, AnonymousClass553 anonymousClass5532, AnonymousClass553 anonymousClass5533, AnonymousClass553 anonymousClass5534, AnonymousClass553 anonymousClass5535, MigColorScheme migColorScheme) {
        this.A02 = qAd;
        this.A00 = onClickListener;
        this.A04 = anonymousClass553;
        this.A05 = anonymousClass5532;
        this.A08 = anonymousClass5533;
        this.A09 = migColorScheme;
        this.A01 = fbUserSession;
        this.A03 = jke;
        this.A06 = anonymousClass5534;
        this.A07 = anonymousClass5535;
    }

    public 1LI A0s(C2k5 c2k5) {
        1LI r304;
        ImmutableList AVW;
        11T.A0F(c2k5, 0);
        1Bi.A03(115033);
        C2iw A0Z = 7zL.A0Z();
        1Iw r0 = c2k5.A05;
        QFA qfa = new QFA(r0, new QMe());
        qfa.A1w(A0Z);
        QAd qAd = this.A02;
        QMe qMe = qfa.A01;
        qMe.A04 = qAd;
        BitSet bitSet = qfa.A02;
        bitSet.set(4);
        qMe.A05 = qAd;
        bitSet.set(11);
        qMe.A06 = this.A03;
        bitSet.set(10);
        qMe.A09 = this.A06;
        bitSet.set(6);
        qMe.A07 = this.A04;
        bitSet.set(2);
        qMe.A08 = this.A05;
        bitSet.set(5);
        qMe.A0A = this.A07;
        bitSet.set(7);
        qMe.A0B = this.A08;
        bitSet.set(8);
        boolean z = qAd.A0C;
        if (z || (AVW = qAd.AVW()) == null) {
            r304 = null;
        } else {
            MigColorScheme migColorScheme = this.A09;
            11T.A0F(migColorScheme, 2);
            8Pg r02 = new 8Pg(r0, new C8ke());
            C8ke c8ke = r02.A01;
            c8ke.A03 = AVW;
            BitSet bitSet2 = r02.A02;
            bitSet2.set(1);
            c8ke.A00 = qAd.AVV();
            bitSet2.set(0);
            c8ke.A02 = migColorScheme;
            bitSet2.set(2);
            c8ke.A06 = true;
            c8ke.A01 = new 9xJ(r0, A0Z);
            bitSet2.set(3);
            r304 = r02.A2V();
        }
        qMe.A02 = r304;
        bitSet.set(1);
        MigColorScheme migColorScheme2 = this.A09;
        View.OnClickListener onClickListener = this.A00;
        QD8 qd8 = new QD8(c2k5.AeS(), new QJA());
        QJA qja = qd8.A01;
        qja.A02 = migColorScheme2;
        BitSet bitSet3 = qd8.A02;
        bitSet3.set(2);
        qja.A00 = !z ? 1 : 0;
        bitSet3.set(0);
        qja.A04 = qAd.Ag5();
        qja.A05 = z ? qAd.AbU() : qAd.AbR();
        bitSet3.set(3);
        qja.A01 = onClickListener;
        bitSet3.set(1);
        qMe.A01 = qd8.A2V();
        bitSet.set(0);
        qMe.A0C = migColorScheme2;
        bitSet.set(3);
        qMe.A00 = this.A01;
        bitSet.set(9);
        return qfa.A2W();
    }
}
