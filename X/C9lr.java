package X;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9lr, reason: invalid class name */
/* loaded from: 9lr.class */
public final class C9lr {
    public 9Zh A00;
    public boolean A01;
    public boolean A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Iw A05;
    public final 7QI A06;
    public final 9Zh A07;
    public final 9Zh A08;
    public final MigColorScheme A09;
    public final Integer A0A;
    public final ConcurrentHashMap A0B;
    public final Function1 A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final AXb A0F;
    public final Function1 A0G;

    public C9lr(1Iw r302, 7QI r303, MigColorScheme migColorScheme, Integer num, Function1 function1, Function1 function12) {
        9tP r312;
        7QI r311;
        boolean z;
        7zT.A1U(migColorScheme, r303, num);
        this.A05 = r302;
        this.A09 = migColorScheme;
        this.A06 = r303;
        this.A0A = num;
        this.A0G = function1;
        this.A0C = function12;
        this.A03 = 1Bu.A00(68204);
        this.A04 = 1Bu.A00(16430);
        Uri uri = r303.A00;
        if (uri != null) {
            r312 = new 9tP(7zQ.A0J(r302), uri);
        } else {
            final int Awo = migColorScheme.Awo();
            r312 = new AXb(Awo) { // from class: X.9tO
                public final int A00;

                {
                    this.A00 = Awo;
                }

                @Override // X.AXb
                public Drawable AJb() {
                    return 7zL.A0D(this.A00);
                }
            };
        }
        AXb aXb = (AXb) r312;
        this.A0F = aXb;
        this.A08 = new 9Zh(r303.A02, aXb, new DCx(this, 30));
        this.A07 = new 9Zh(r303.A01, aXb, SH0.A00);
        int intValue = num.intValue();
        if (intValue == 0) {
            r311 = this.A06;
            z = r311.A04;
        } else {
            if (intValue != 1) {
                throw 1BK.A1F();
            }
            r311 = this.A06;
            z = r311.A05;
        }
        this.A0E = z;
        this.A0D = intValue != 0 ? r311.A03 : true;
        this.A01 = true;
        this.A0B = new ConcurrentHashMap();
    }

    public static final void A00(9Zh r301, C9lr c9lr) {
        ConcurrentHashMap concurrentHashMap = c9lr.A0B;
        Number number = (Number) concurrentHashMap.get(r301);
        if (number == null) {
            number = 4YU.A0k();
        }
        int intValue = number.intValue();
        if (intValue <= 0) {
            concurrentHashMap.remove(r301);
            ((9Wq) 1Br.A0B(c9lr.A03)).A00(7zM.A18(11T.A0O(r301, c9lr.A07) ? 1 : 0), c9lr.A0A, true);
        } else if (r301.A06 != null) {
            concurrentHashMap.remove(r301);
            A01(r301, c9lr, true);
        } else {
            AnonymousClass001.A1A(r301, concurrentHashMap, intValue - 1);
            ((Handler) 1Br.A0B(c9lr.A04)).postDelayed(new SB7(r301, c9lr), 250L);
        }
    }

    public static final void A01(9Zh r301, C9lr c9lr, boolean z) {
        if (r301.A06 == null) {
            ConcurrentHashMap concurrentHashMap = c9lr.A0B;
            if (!z) {
                concurrentHashMap.remove(r301);
                return;
            } else {
                if (concurrentHashMap.containsKey(r301)) {
                    return;
                }
                AnonymousClass001.A1A(r301, concurrentHashMap, 8);
                A00(r301, c9lr);
                return;
            }
        }
        if (!z) {
            c9lr.A0B.remove(r301);
            if (r301.equals(c9lr.A00)) {
                A02(c9lr, false);
                return;
            }
            return;
        }
        if (c9lr.A02 || !c9lr.A01) {
            ((9Wq) 1Br.A0B(c9lr.A03)).A00(7zM.A18(r301.equals(c9lr.A07) ? 1 : 0), c9lr.A0A, true);
            return;
        }
        c9lr.A00 = r301;
        c9lr.A0C.invoke(r301.A00);
        A02(c9lr, true);
        ((9Wq) 1Br.A0B(c9lr.A03)).A00(7zM.A18(r301.equals(c9lr.A07) ? 1 : 0), c9lr.A0A, false);
    }

    public static final void A02(C9lr c9lr, boolean z) {
        JVb jVb;
        MNy mNy;
        if (c9lr.A02 != z) {
            9Zh r0 = c9lr.A00;
            if (!z) {
                if (r0 != null && (jVb = r0.A06) != null) {
                    jVb.stop();
                }
                c9lr.A00 = null;
            } else if (r0 != null) {
                JVb jVb2 = r0.A06;
                if (jVb2 != null && (mNy = jVb2.A02) != null) {
                    mNy.CYW();
                }
                JVb jVb3 = r0.A06;
                if (jVb3 != null) {
                    jVb3.A01();
                }
                JVb jVb4 = r0.A06;
                if (jVb4 != null) {
                    jVb4.start();
                }
            }
            c9lr.A01 = false;
            c9lr.A02 = z;
            7zN.A1a(c9lr.A0G, z);
        }
    }
}
