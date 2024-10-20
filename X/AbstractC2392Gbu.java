package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.Gbu, reason: case insensitive filesystem */
/* loaded from: Gbu.class */
public abstract class AbstractC2392Gbu extends 1pK implements JOH {
    public static final String __redex_internal_original_name = "CanvasBaseCameraFragment";
    public int A00;
    public Hrw A01;
    public I9K A02;
    public String A03;
    public ScheduledFuture A04;
    public boolean A05;
    public boolean A08;
    public final HeF A09 = new HeF();
    public final Htr A0A = new Htr();
    public final HTa A0C = new Object();
    public final HTb A0D = new Object();
    public final HTc A0E = new HTc();
    public final Hg1 A0B = new Hg1();
    public boolean A06 = true;
    public boolean A07 = true;

    public void A1X() {
        GnK gnK = (GnK) this;
        if (gnK.A1b()) {
            ScheduledFuture scheduledFuture = gnK.A04;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                gnK.A04 = null;
            }
            Hag hag = gnK.A01;
            if (hag != null) {
                hag.A01.A05(false);
            }
        }
    }

    public void A1Y() {
        GnK gnK = (GnK) this;
        if (gnK.A1b()) {
            Hrw hrw = gnK.A01;
            if (!hrw.A01.A0G || gnK.A05) {
                return;
            }
            if (HAE.A05.equals(hrw.A00.A1Q.Aio().A00) || gnK.A0C.A00 != 0) {
                return;
            }
            HmI hmI = (HmI) gnK.A08.get();
            FbUserSession fbUserSession = gnK.A00;
            fbUserSession.getClass();
            if (!hmI.A00(fbUserSession)) {
                if (!gnK.A1b() || gnK.A01 == null) {
                    return;
                }
                ((5WA) gnK.A0B.get()).A00.markerPoint(5505156, "CAMERA_VIEW_READY");
                gnK.A01.A01.A03();
                return;
            }
            Hag hag = gnK.A01;
            if (hag != null) {
                hag.A01.A04();
            }
            I9K i9k = gnK.A02;
            if (i9k != null) {
                i9k.A02();
            }
        }
    }

    public void A1Z(HCK hck) {
        IP3 ip3;
        Hag hag = ((GnK) this).A01;
        if (hag != null) {
            ICU icu = hag.A01;
            if (!icu.A07 || hck == null || (ip3 = icu.A04) == null) {
                return;
            }
            int i = hck.degrees - icu.A0Q.degrees;
            I8M i8m = ip3.A0H;
            i8m.A00 = i;
            2Wo r0 = i8m.A04;
            if (r0.A00 != null) {
                r0.A01().setRotation(-i);
            }
        }
    }

    public void A1a(boolean z, boolean z2) {
        Hag hag;
        boolean z3;
        GnK gnK = (GnK) this;
        if (gnK.A1b() && gnK.A05 && (hag = gnK.A01) != null) {
            if (z2) {
                z3 = false;
                hag.A01.A09 = false;
            } else {
                hag.A01.A09 = z;
                Hrw hrw = gnK.A01;
                if (hrw != null) {
                    DKE.A0C(hrw.A01.A0A);
                }
                z3 = true;
            }
            gnK.A0A.A01(z3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r0.A01 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A1b() {
        /*
            r301 = this;
            r0 = r301
            r302 = r0
            r0 = r301
            X.GnK r0 = (X.GnK) r0
            r302 = r0
            r0 = r302
            X.Hag r0 = r0.A01
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1b
            r0 = r302
            X.Hrw r0 = r0.A01
            r302 = r0
            r0 = 1
            r304 = r0
            r0 = r302
            if (r0 != 0) goto L1f
        L1b:
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
        L1f:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2392Gbu.A1b():boolean");
    }

    public C6x7 AbZ() {
        return C6x7.A03;
    }

    public C6x1 Aba() {
        return C6x1.A02;
    }

    public boolean Bkd() {
        if (!A1b() || !this.A05) {
            return false;
        }
        I4q Aio = this.A01.A00.A1Q.Aio();
        HAE hae = Aio.A00;
        HAq hAq = Aio.A01;
        if ((hae != HAE.A02 && hae != HAE.A03) || 02L.A0C(hAq, new HAq[]{HAq.A0N, HAq.A0E, HAq.A0L, HAq.A05, HAq.A08, HAq.A07, HAq.A06, HAq.A0J, HAq.A0I, HAq.A0F}) || GOo.A1W(HAq.A0B, HAq.A0C, hAq) || !A1b()) {
            return false;
        }
        A1X();
        this.A00 = 0;
        return false;
    }

    public void Bn9() {
        IEh iEh;
        I2s i2s;
        HsU hsU;
        A1Y();
        I9K i9k = this.A02;
        if (i9k != null) {
            IQ1 iq1 = i9k.A00;
            CallerContext callerContext = IQ1.A1m;
            ((2Pf) iq1.A1I.A00.get()).A00();
            C2394Gbw c2394Gbw = iq1.A1E;
            if (c2394Gbw != null && (iEh = c2394Gbw.A03) != null && (i2s = iEh.A0A) != null && (hsU = i2s.A01) != null) {
                hsU.A00();
            }
            if (iq1.A0E) {
                iq1.A1Q.CzY();
            }
            IWN iwn = iq1.A1Q;
            iwn.Cws();
            AbstractC2392Gbu A00 = IBw.A00(iq1);
            if (((5Q1) iq1.A0m.get()).A02()) {
                C15h c15h = iq1.A1c;
                HCK hck = ((HqO) c15h.get()).A00;
                if (hck == null) {
                    hck = ((HqO) c15h.get()).A01;
                }
                A00.A1Z(hck);
            }
            iwn.CiN();
        }
    }

    public void BqH(H9e h9e) {
        A1Y();
    }

    public void BqI(boolean z) {
        if (z) {
            A1Y();
        } else if (A1b()) {
            A1X();
            this.A00 = 0;
        }
    }
}
