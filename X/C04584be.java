package X;

import android.util.Pair;
import com.facebook.common.util.TriState;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.4be, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4be.class */
public final class C04584be {
    public float A00;
    public int A01;
    public C04364ar A02;
    public C04634bj A03;
    public Closeable A04;
    public final Object A05;
    public final CopyOnWriteArraySet A06 = new CopyOnWriteArraySet();
    public final /* synthetic */ 4aY A07;

    public C04584be(4aY r302, Object obj) {
        this.A07 = r302;
        this.A05 = obj;
    }

    private 2rC A00() {
        Enum r302;
        synchronized (this) {
            r302 = 2rC.A03;
            Iterator it = this.A06.iterator();
            while (it.hasNext()) {
                Enum B4s = ((InterfaceC04374as) ((Pair) it.next()).second).B4s();
                11T.A0F(B4s, 1);
                if (r302.ordinal() <= B4s.ordinal()) {
                    r302 = B4s;
                }
            }
        }
        return r302;
    }

    public static ArrayList A01(C04584be c04584be) {
        ArrayList arrayList;
        synchronized (c04584be) {
            C04364ar c04364ar = c04584be.A02;
            if (c04364ar == null) {
                arrayList = null;
            } else {
                boolean A06 = c04584be.A06();
                synchronized (c04364ar) {
                    if (A06 == c04364ar.A02) {
                        arrayList = null;
                    } else {
                        c04364ar.A02 = A06;
                        new ArrayList(c04364ar.A0B);
                    }
                }
            }
        }
        return arrayList;
    }

    public static ArrayList A02(C04584be c04584be) {
        ArrayList arrayList;
        synchronized (c04584be) {
            C04364ar c04364ar = c04584be.A02;
            if (c04364ar == null) {
                arrayList = null;
            } else {
                boolean A07 = c04584be.A07();
                synchronized (c04364ar) {
                    if (A07 == c04364ar.A03) {
                        arrayList = null;
                    } else {
                        c04364ar.A03 = A07;
                        new ArrayList(c04364ar.A0B);
                    }
                }
            }
        }
        return arrayList;
    }

    public static ArrayList A03(C04584be c04584be) {
        ArrayList arrayList;
        synchronized (c04584be) {
            C04364ar c04364ar = c04584be.A02;
            if (c04364ar == null) {
                arrayList = null;
            } else {
                2rC A00 = c04584be.A00();
                synchronized (c04364ar) {
                    if (A00 == c04364ar.A00) {
                        arrayList = null;
                    } else {
                        c04364ar.A00 = A00;
                        new ArrayList(c04364ar.A0B);
                    }
                }
            }
        }
        return arrayList;
    }

    public static void A04(TriState triState, C04584be c04584be) {
        synchronized (c04584be) {
            boolean z = true;
            boolean z2 = false;
            if (c04584be.A02 == null) {
                z2 = true;
            }
            C0By.A02(Boolean.valueOf(z2));
            if (c04584be.A03 != null) {
                z = false;
            }
            C0By.A02(Boolean.valueOf(z));
            CopyOnWriteArraySet copyOnWriteArraySet = c04584be.A06;
            if (copyOnWriteArraySet.isEmpty()) {
                c04584be.A07.A00(c04584be, c04584be.A05);
                return;
            }
            InterfaceC04374as interfaceC04374as = (InterfaceC04374as) ((Pair) copyOnWriteArraySet.iterator().next()).second;
            C04364ar c04364ar = (C04364ar) interfaceC04374as;
            2Dp r0 = c04364ar.A07;
            String str = c04364ar.A09;
            C04364ar c04364ar2 = new C04364ar(c04584be.A00(), ((C04364ar) interfaceC04374as).A04, c04364ar.A05, c04364ar.A06, r0, c04364ar.A08, str, null, c04584be.A07(), c04584be.A06());
            c04584be.A02 = c04364ar2;
            c04364ar2.CaA(interfaceC04374as.AlR());
            if (triState.isSet()) {
                c04584be.A02.Ca9("started_as_prefetch", Boolean.valueOf(triState.asBoolean()));
            }
            C04634bj c04634bj = new C04634bj(c04584be);
            c04584be.A03 = c04634bj;
            c04584be.A07.A00.CZW(c04634bj, c04584be.A02);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Closeable] */
    public static void A05(Closeable closeable) {
        ?? r0 = closeable;
        if (r0 != 0) {
            try {
                r0 = closeable;
                r0.close();
            } catch (IOException unused) {
                throw AnonymousClass001.A0U(r0);
            }
        }
    }

    private boolean A06() {
        boolean z;
        synchronized (this) {
            Iterator it = this.A06.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (((InterfaceC04374as) ((Pair) it.next()).second).BTd()) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    private boolean A07() {
        boolean z;
        synchronized (this) {
            Iterator it = this.A06.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                if (!((InterfaceC04374as) ((Pair) it.next()).second).BV1()) {
                    z = false;
                    break;
                }
            }
        }
        return z;
    }
}
