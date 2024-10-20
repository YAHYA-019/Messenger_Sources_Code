package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* loaded from: I4u.class */
public final class I4u {
    public IKT A00;
    public JQ0 A01;
    public Icn A02;
    public N1W A03;
    public Ij0 A04;
    public JQ1 A05;
    public JJE A06;
    public final JEO A07;
    public final JLp A08;
    public final int A09;
    public final IHW A0A;

    public I4u() {
        this(null, 0);
    }

    public I4u(IHW ihw, int i) {
        this.A0A = ihw;
        this.A09 = i;
        this.A07 = new IOv(this);
        this.A08 = new Id3(this, 0);
    }

    /* JADX WARN: Type inference failed for: r0v47, types: [X.N1W, java.lang.Object] */
    public final void A00() {
        0fH.A0j("AREngineHelper", "updateTouchInput ");
        JQ0 jq0 = this.A01;
        JQ1 jq1 = this.A05;
        if (jq1 == null || !jq1.BNN() || jq0 == null) {
            return;
        }
        0fH.A0j("AREngineHelper", "updateTouchInput went inside");
        View B4V = jq1.B4V();
        11T.A0A(B4V);
        jq0.D7b(B4V);
        IKT ikt = this.A00;
        if (ikt == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        View B4V2 = jq1.B4V();
        11T.A0A(B4V2);
        N1W n1w = ikt.A00;
        if (n1w == null) {
            WeakReference A14 = 7zL.A14(B4V2);
            ?? obj = new Object();
            obj.A00 = A14;
            ikt.A00 = obj;
        } else {
            n1w.A02(7zL.A14(B4V2));
        }
        N1W n1w2 = ikt.A00;
        11T.A0D(n1w2);
        Icn icn = this.A02;
        if (icn == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        icn.CZQ(new Iio(n1w2));
        this.A03 = n1w2;
    }

    public final void A01(HP3 hp3, HwD hwD, Icn icn) {
        this.A02 = icn;
        if (hp3 != null) {
            icn.A02 = hp3;
        }
        if (hwD != null) {
            icn.A03 = hwD;
        }
        IHW ihw = this.A0A;
        if (ihw != null) {
            Handler handler = ihw.A01;
            if (handler.getLooper() != Looper.myLooper()) {
                handler.sendMessage(Message.obtain(ihw.A04.A00, 4, icn));
            } else {
                IHW.A00(icn, ihw);
            }
            icn.A07 = true;
            icn.A00 = this.A09;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [X.JJE] */
    public final void A02(List list) {
        Ij0 ij0;
        Ij0 ij02;
        Iterator it = list.iterator();
        while (true) {
            ij0 = null;
            if (!it.hasNext()) {
                ij02 = null;
                break;
            }
            JMy jMy = (JMy) it.next();
            if (jMy instanceof Ij0) {
                Ij0 ij03 = (Ij0) jMy;
                if (jMy instanceof JJE) {
                    ij0 = (JJE) jMy;
                }
                ij02 = ij0;
                ij0 = ij03;
            }
        }
        this.A04 = ij0;
        this.A06 = ij02;
        Icn icn = this.A02;
        if (icn == null) {
            throw 1BK.A0h();
        }
        if (icn.A01 == null) {
            icn.A06 = list;
        } else {
            icn.A06 = null;
            Icn.A05(icn, new Iin(list), null);
        }
    }
}
