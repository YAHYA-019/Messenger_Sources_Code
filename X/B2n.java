package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueRegSoftMatch;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* loaded from: B2n.class */
public final class B2n extends B2z implements CallerContextable {
    public static final String __redex_internal_original_name = "AccountLoginRegSoftmatchFragment";
    public COx A00;
    public DEf A01;
    public C50z A02;
    public final BPY A05 = new B37(this, 8);
    public final REc A04 = new REc(this);
    public final C00i A03 = AlJ.A03(this);

    public 1iF A1R() {
        return AbK.A0F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A02 = (C50z) 1Bn.A0A(49449);
        String A00 = 1BJ.A00(536);
        COx cOx = new COx(this, ((AlJ) this).A00, new C00(getContext()), this.A05, A00, "register_operation", "registerMessengerOnlyUserParams", false);
        COx.A02(cOx);
        this.A00 = cOx;
    }

    @Override // X.B2z
    public 1LI A1c(C7xz c7xz, 1Iw r303) {
        QMF qmf;
        if (((AccountLoginSegueRegSoftMatch) ((AlJ) this).A01).A06() != null) {
            QBS qbs = new QBS(r303, new QMF());
            MigColorScheme A0p = AbF.A0p(this.A03);
            qmf = qbs.A01;
            qmf.A04 = A0p;
            BitSet bitSet = qbs.A02;
            bitSet.set(0);
            qmf.A03 = ((AccountLoginSegueRegSoftMatch) ((AlJ) this).A01).A06();
            bitSet.set(2);
            qmf.A00 = c7xz;
            qmf.A01 = this.A04;
            qmf.A02 = AlJ.A06();
            bitSet.set(1);
            C1rs.A03(bitSet, qbs.A03);
            qbs.A0J();
        } else {
            qmf = new 2AW();
        }
        return (1LI) qmf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof DEf) {
            this.A01 = (DEf) context;
        }
    }
}
