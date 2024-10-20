package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1x8, reason: invalid class name */
/* loaded from: 1x8.class */
public final class C1x8 {
    public final C1x9 A00;
    public final 1xB A01;
    public final LightweightQuickPerformanceLogger A02;
    public final AtomicInteger A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public C1x8(C1x6 c1x6, C1x5 c1x5, C1x7 c1x7, C1x4 c1x4, C1x3 c1x3, 1Uj r307, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, boolean z, boolean z2, boolean z3) {
        11T.A0F(r307, 1);
        11T.A0F(c1x3, 5);
        11T.A0F(lightweightQuickPerformanceLogger, 7);
        C1x9 c1x9 = new C1x9(c1x5, c1x4, r307);
        1xB r0 = new 1xB(c1x6, c1x7, c1x4, c1x3, r307, lightweightQuickPerformanceLogger);
        this.A00 = c1x9;
        this.A01 = r0;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = z3;
        this.A02 = lightweightQuickPerformanceLogger;
        this.A03 = new AtomicInteger(0);
    }

    public final 1xH A00() {
        1xH r0 = new 1xH();
        JTY jty = new JTY(this.A02, 1021655799, this.A03.getAndIncrement());
        jty.A00();
        jty.A02("MSYS");
        C1x9 c1x9 = this.A00;
        1xH r02 = new 1xH();
        if (c1x9.A03.A00()) {
            1xA r03 = c1x9.A04;
            C3b5 c3b5 = new C3b5(c1x9, r02, 0);
            1Um A0R = 1BL.A0R(r03);
            MailboxFutureImpl A0Q = 1BK.A0Q(A0R, c3b5);
            1Um.A02(A0R, new LXJ(A0Q, r03, 5), A0Q, false);
        } else {
            C1x9.A02(r02);
        }
        r02.A03(new LVC(r0, jty, 3));
        return r0;
    }

    public final 1xH A01() {
        return this.A05 ? 1xB.A00(this.A01, C87i.GOOGLE_ONE_AUTO_BACKUP, "fetchTPIDForAutoBackup") : C1x9.A00(this.A00, 5);
    }

    public final 1xH A02() {
        8EF c87e;
        if (!this.A05) {
            C1x9 c1x9 = this.A00;
            1xH r0 = new 1xH();
            if (!c1x9.A03.A00()) {
                C1x9.A02(r0);
                return r0;
            }
            1xA r02 = c1x9.A04;
            C3b5 c3b5 = new C3b5(c1x9, r0, 2);
            1Um A0O = 1BK.A0O(r02, 2);
            MailboxFutureImpl A0Q = 1BK.A0Q(A0O, c3b5);
            1Um.A00(A0O, new LXJ(A0Q, r02, 8), A0Q);
            return r0;
        }
        1xB r03 = this.A01;
        1xH r04 = new 1xH();
        if (r03.A03.A00()) {
            C1x3 c1x3 = r03.A05;
            if (!c1x3.A07) {
                1xB.A01(r03, "fetchVirtualDevicesMetadata", false, false, false, true, true).A03(new C3Vm(r03, r04, 0));
                return r04;
            }
            List list = c1x3.A05;
            if (list == null) {
                11T.A0L("virtualDevicesList");
                throw 0Q8.createAndThrow();
            }
            c87e = new C87e(new 9GV(1xB.A02(list)));
        } else {
            c87e = new 8EF(new Exception());
        }
        r04.A04(c87e);
        return r04;
    }

    public final 1xH A03() {
        8EF c87e;
        if (!this.A05) {
            C1x9 c1x9 = this.A00;
            1xH r0 = new 1xH();
            if (!c1x9.A03.A00()) {
                C1x9.A02(r0);
                return r0;
            }
            1xA r02 = c1x9.A04;
            C3b7 c3b7 = new C3b7(r0, 1);
            1Um A0O = 1BK.A0O(r02, 2);
            MailboxFutureImpl A0Q = 1BK.A0Q(A0O, c3b7);
            1Um.A00(A0O, new LXK(r02, A0Q, 2, 7), A0Q);
            return r0;
        }
        1xB r03 = this.A01;
        1xH r04 = new 1xH();
        if (r03.A03.A00()) {
            C1x3 c1x3 = r03.A05;
            if (!c1x3.A07) {
                1xB.A01(r03, "getIsAndroidAutoRestoreOptedOut", false, false, false, true, true).A03(new C3Vm(r03, r04, 1));
                return r04;
            }
            Boolean bool = c1x3.A00;
            c87e = bool != null ? new C87e(bool) : new 8EF(new Exception());
        } else {
            c87e = new 8EF(new Exception());
        }
        r04.A04(c87e);
        return r04;
    }

    public final 1xH A04() {
        Exception exc;
        8EF c87e;
        if (!this.A05) {
            C1x9 c1x9 = this.A00;
            1xH r0 = new 1xH();
            if (!c1x9.A03.A00()) {
                C1x9.A02(r0);
                return r0;
            }
            1xA r02 = c1x9.A04;
            C3b7 c3b7 = new C3b7(r0, 2);
            1Um A0O = 1BK.A0O(r02, 2);
            MailboxFutureImpl A0Q = 1BK.A0Q(A0O, c3b7);
            1Um.A00(A0O, new LXJ(A0Q, r02, 6), A0Q);
            return r0;
        }
        1xB r03 = this.A01;
        1xH r04 = new 1xH();
        if (r03.A03.A00()) {
            C1x3 c1x3 = r03.A05;
            if (c1x3.A07) {
                c87e = new C87e(Boolean.valueOf(c1x3.A08));
                r04.A04(c87e);
                return r04;
            }
            exc = new Exception();
        } else {
            exc = new Exception();
        }
        c87e = new 8EF(exc);
        r04.A04(c87e);
        return r04;
    }

    public final 1xH A05() {
        1xH r0 = new 1xH();
        JTY jty = new JTY(this.A02, 1021642512, this.A03.getAndIncrement());
        jty.A00();
        C1x9 c1x9 = this.A00;
        1xH r02 = new 1xH();
        if (c1x9.A03.A00()) {
            1xA r03 = c1x9.A04;
            C3b5 c3b5 = new C3b5(c1x9, r02, 5);
            1Um A0R = 1BL.A0R(r03);
            MailboxFutureImpl A0Q = 1BK.A0Q(A0R, c3b5);
            1Um.A00(A0R, new LXJ(A0Q, r03, 7), A0Q);
        } else {
            C1x9.A02(r02);
        }
        r02.A03(new LVC(jty, r0, 7));
        return r0;
    }

    public final 1xH A06() {
        C1x9 c1x9 = this.A00;
        1xH r0 = new 1xH();
        if (!c1x9.A03.A00()) {
            C1x9.A02(r0);
            return r0;
        }
        1xA r02 = c1x9.A04;
        C3b7 c3b7 = new C3b7(r0, 5);
        1Um A0R = 1BL.A0R(r02);
        MailboxFutureImpl A0Q = 1BK.A0Q(A0R, c3b7);
        1Um.A00(A0R, new LXJ(A0Q, r02, 4), A0Q);
        return r0;
    }

    public final 1xH A07(C96a c96a) {
        1xH r0 = new 1xH();
        JTY jty = new JTY(this.A02, 1021654781, this.A03.getAndIncrement());
        jty.A00();
        C1x9 c1x9 = this.A00;
        1xH r02 = new 1xH();
        1xA r03 = c1x9.A04;
        Integer valueOf = Integer.valueOf(c96a.decisionVal);
        C3b7 c3b7 = new C3b7(r02, 3);
        1Um A0R = 1BL.A0R(r03);
        MailboxFutureImpl A0Q = 1BK.A0Q(A0R, c3b7);
        1Um.A00(A0R, new LXK(r03, A0Q, valueOf, 5), A0Q);
        r02.A03(new LVC(jty, r0, 6));
        return r0;
    }

    public final 1xH A08(C96p c96p) {
        C1x9 c1x9 = this.A00;
        1xH r0 = new 1xH();
        if (c1x9.A03.A00()) {
            1xA r02 = c1x9.A04;
            Number number = c96p.type;
            C3b5 c3b5 = new C3b5(c96p, r0, 3);
            1Um AQV = r02.mMailboxApiHandleMetaProvider.AQV(2);
            MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
            mailboxFutureImpl.Cu4(c3b5);
            if (!AQV.Cj2(new LXK(r02, mailboxFutureImpl, number, 3))) {
                mailboxFutureImpl.cancel(false);
                return r0;
            }
        } else {
            C1x9.A02(r0);
        }
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.JTY, java.lang.Object, X.Jk8] */
    public final 1xH A09(C96p c96p, String str, String str2) {
        1xH r314;
        LVC lvc;
        11T.A0F(str, 0);
        ?? jty = new JTY(this.A02, 1021646192, this.A03.getAndIncrement());
        String name = c96p.name();
        11T.A0F(name, 0);
        jty.A00();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = ((JTY) jty).A02;
        int i = ((JTY) jty).A01;
        lightweightQuickPerformanceLogger.markerAnnotate(1021646192, i, "vd_type", name);
        1xH r0 = new 1xH();
        if (this.A04) {
            jty.A02("GRAPHQL");
            r314 = new 1xH();
            lightweightQuickPerformanceLogger.markerPoint(1021646192, i, "parse_recovery_code_start");
            C1x9 c1x9 = this.A00;
            1xH r02 = new 1xH();
            1xA r03 = c1x9.A04;
            LXA lxa = new LXA(r02, 0);
            1Um A0R = 1BL.A0R(r03);
            MailboxFutureImpl A0Q = 1BK.A0Q(A0R, lxa);
            1Um.A02(A0R, new LXC(r03, A0Q, str, 3), A0Q, false);
            r02.A03(new LVF(this, (C3137Jk8) jty, r314, str, str2));
            lvc = new LVC(r0, (Object) jty, 0);
        } else {
            jty.A02("MSYS");
            C1x9 c1x92 = this.A00;
            r314 = new 1xH();
            if (c1x92.A03.A00()) {
                lightweightQuickPerformanceLogger.markerPoint(1021646192, i, "eb_manager_add_device_begin");
                1xA r04 = c1x92.A04;
                Number number = c96p.type;
                Integer valueOf = Integer.valueOf(i);
                MailboxCallback lxk = new LXK(0, c1x92, (Object) jty, r314);
                1Um AQV = r04.mMailboxApiHandleMetaProvider.AQV(2);
                MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
                mailboxFutureImpl.Cu4(lxk);
                if (!AQV.Cj2(new LXF(r04, mailboxFutureImpl, number, valueOf, str, str2))) {
                    mailboxFutureImpl.cancel(false);
                }
            } else {
                C1x9.A02(r314);
            }
            lvc = new LVC(r0, (Object) jty, 1);
        }
        r314.A03(lvc);
        return r0;
    }

    public final 1xH A0A(String str) {
        1xH r0 = new 1xH();
        JTY jty = new JTY(this.A02, 1021647318, this.A03.getAndIncrement());
        jty.A00();
        C1x9 c1x9 = this.A00;
        1xH r02 = new 1xH();
        if (c1x9.A03.A00()) {
            1xA r03 = c1x9.A04;
            MailboxCallback lxj = new LXJ(c1x9, r02, 0);
            1Um AQV = r03.mMailboxApiHandleMetaProvider.AQV(2);
            MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
            mailboxFutureImpl.Cu4(lxj);
            if (!AQV.Cj2(new LXC(r03, mailboxFutureImpl, str, 1))) {
                mailboxFutureImpl.cancel(false);
            }
        } else {
            C1x9.A02(r02);
        }
        r02.A03(new LVC(r0, jty, 2));
        return r0;
    }

    public final 1xH A0B(String str) {
        C1x9 c1x9 = this.A00;
        1xH r0 = new 1xH();
        if (!c1x9.A03.A00()) {
            C1x9.A02(r0);
            return r0;
        }
        1xA r02 = c1x9.A04;
        C3b7 c3b7 = new C3b7(r0, 6);
        1Um AQV = r02.mMailboxApiHandleMetaProvider.AQV(2);
        MailboxFutureImpl A0Q = 1BK.A0Q(AQV, c3b7);
        1Um.A02(AQV, new LXC(r02, A0Q, str, 2), A0Q, false);
        return r0;
    }

    public final 1xH A0C(String str) {
        1xH r0 = new 1xH();
        C1x9 c1x9 = this.A00;
        1xH r02 = new 1xH();
        1xA r03 = c1x9.A04;
        LXA lxa = new LXA(r02, 1);
        1Um A0R = 1BL.A0R(r03);
        MailboxFutureImpl A0Q = 1BK.A0Q(A0R, lxa);
        1Um.A02(A0R, new LXC(r03, A0Q, str, 0), A0Q, false);
        r02.A03(new LVC(this, r0, 8));
        return r0;
    }

    public final 1xH A0D(String str, boolean z, boolean z2) {
        1xH A03;
        int i;
        1xH r0 = new 1xH();
        boolean z3 = this.A05;
        JTY jty = new JTY(this.A02, 1021652813, z3 ? 0 : this.A03.getAndIncrement());
        jty.A00();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = jty.A02;
        int i2 = jty.A01;
        lightweightQuickPerformanceLogger.markerAnnotate(1021652813, i2, Property.SYMBOL_Z_ORDER_SOURCE, str);
        if (z3) {
            jty.A02("GRAPHQL");
            A03 = 1xB.A01(this.A01, str, z, false, false, false, z2);
            i = 4;
        } else {
            jty.A02("MSYS");
            A03 = this.A00.A03(Integer.valueOf(i2));
            i = 5;
        }
        A03.A03(new LVC(r0, jty, i));
        return r0;
    }

    public final void A0E(Integer num) {
        int i;
        C1x9 c1x9 = this.A00;
        1xH r0 = new 1xH();
        if (!c1x9.A03.A00()) {
            0fH.A0k("EncryptedBackupsManagerApi", "api disabled by GK");
            C1x9.A02(r0);
            return;
        }
        1xA r02 = c1x9.A04;
        switch (num.intValue()) {
            case 3:
                i = 2;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 4;
                break;
            default:
                i = 5;
                break;
        }
        Integer valueOf = Integer.valueOf(i);
        C3b7 c3b7 = new C3b7(r0, 4);
        1Um AQV = r02.mMailboxApiHandleMetaProvider.AQV(2);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        mailboxFutureImpl.Cu4(c3b7);
        if (AQV.Cj2(new LXK(r02, mailboxFutureImpl, valueOf, 6))) {
            return;
        }
        mailboxFutureImpl.cancel(false);
    }
}
