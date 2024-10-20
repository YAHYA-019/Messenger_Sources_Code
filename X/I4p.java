package X;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: I4p.class */
public final class I4p {
    public final AtomicBoolean A06 = new AtomicBoolean();
    public final EnumSet A03 = EnumSet.noneOf(EPG.class);
    public final C03m A00 = new C03m();
    public final C00i A04 = AbH.A0K();
    public final C00i A01 = 1BV.A00(116030);
    public final C00i A02 = 1BV.A00(116026);
    public final HTf A05 = new HTf(this);

    private void A00(boolean z, boolean z2) {
        HmK A0P;
        String str;
        if (z != z2) {
            try {
                C03m c03m = this.A00;
                Iterator it = c03m.A00().iterator();
                while (it.hasNext()) {
                    C2397Gbz c2397Gbz = ((HTv) it.next()).A00;
                    if (c2397Gbz.A1n()) {
                        I5c i5c = c2397Gbz.A0R;
                        if (z2) {
                            i5c.A05(true);
                            A0P = GOo.A0P(c2397Gbz);
                            str = "long_press_start";
                        } else {
                            i5c.A05(false);
                            A0P = GOo.A0P(c2397Gbz);
                            str = "long_press_end";
                        }
                        A0P.A00(str);
                        C2397Gbz.A0j(c2397Gbz);
                        C2397Gbz.A0i(c2397Gbz);
                    }
                }
                c03m.A01();
            } catch (Throwable th) {
                this.A00.A01();
                throw th;
            }
        }
    }

    public void A01(EPG epg) {
        AbI.A1N(this.A04);
        EnumSet enumSet = this.A03;
        synchronized (enumSet) {
            if (enumSet.isEmpty()) {
                return;
            }
            boolean A03 = A03();
            enumSet.remove(epg);
            A00(A03, A03());
        }
    }

    public void A02(EPG epg) {
        boolean A03;
        boolean A032;
        AbI.A1N(this.A04);
        EnumSet enumSet = this.A03;
        synchronized (enumSet) {
            A03 = A03();
            enumSet.add(epg);
            A032 = A03();
        }
        A00(A03, A032);
    }

    public boolean A03() {
        boolean z = true;
        if (this.A06.get()) {
            return true;
        }
        EnumSet enumSet = this.A03;
        synchronized (enumSet) {
            if (enumSet.isEmpty()) {
                z = false;
            }
        }
        return z;
    }
}
