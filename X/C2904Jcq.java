package X;

import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* renamed from: X.Jcq, reason: case insensitive filesystem */
/* loaded from: Jcq.class */
public final class C2904Jcq extends LPR implements MNh, MNb, MNc {
    public Object A02;
    public Function2 A03;
    public KiX A04;
    public C2a2 A05;
    public KiX A01 = KZg.A00;
    public final LtK A06 = LtK.A02(new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine[16]);
    public final LtK A07 = LtK.A02(new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine[16]);
    public long A00 = 0;

    public C2904Jcq(Object obj, Function2 function2) {
        this.A02 = obj;
        this.A03 = function2;
    }

    private final void A00(KiX kiX, KMa kMa) {
        LtK ltK;
        LtK ltK2 = this.A06;
        synchronized (ltK2) {
            ltK = this.A07;
            ltK.A09(ltK2, ltK.A00);
        }
        try {
            int ordinal = kMa.ordinal();
            if (ordinal == 0 || ordinal == 2) {
                int i = ltK.A00;
                if (i > 0) {
                    int i2 = 0;
                    Object[] objArr = ltK.A02;
                    do {
                        SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine = (SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) objArr[i2];
                        if (kMa == suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine.A00) {
                            C2s8 c2s8 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine.A01;
                            if (c2s8 != null) {
                                suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine.A01 = null;
                                c2s8.resumeWith(kiX);
                            }
                        }
                        i2++;
                    } while (i2 < i);
                }
            } else if (ordinal == 1) {
                int i3 = ltK.A00;
                if (i3 > 0) {
                    int i4 = i3 - 1;
                    Object[] objArr2 = ltK.A02;
                    do {
                        SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine2 = (SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) objArr2[i4];
                        if (kMa == suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine2.A00) {
                            C2s8 c2s82 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine2.A01;
                            if (c2s82 != null) {
                                suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine2.A01 = null;
                                c2s82.resumeWith(kiX);
                            }
                        }
                        i4--;
                    } while (i4 >= 0);
                }
            }
        } finally {
            ltK.A06();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.MNh
    public float AhL() {
        return LDX.A02(this).A0C.AhL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.MI2
    public float Amu() {
        return LDX.A02(this).A0C.Amu();
    }

    public /* synthetic */ boolean BPq() {
        return false;
    }

    public void Bmx() {
        KiX kiX = this.A04;
        if (kiX != null) {
            int size = kiX.A02.size();
            for (int i = 0; i < size; i++) {
                if (!(!JQz.A0O(r0, i).A0B)) {
                    List list = kiX.A02;
                    ArrayList A1B = AbJ.A1B(list);
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        Kts A0O = JQz.A0O(list, i2);
                        long j = A0O.A05;
                        long j2 = A0O.A06;
                        long j3 = A0O.A0A;
                        float f = A0O.A03;
                        boolean z = A0O.A0B;
                        A1B.add(new Kts(f, 1, j, j3, j2, j3, j2, 0L, false, z, z));
                    }
                    KiX kiX2 = new KiX((Kp6) null, A1B);
                    this.A01 = kiX2;
                    A00(kiX2, KMa.A02);
                    A00(kiX2, KMa.A03);
                    A00(kiX2, KMa.A01);
                    this.A04 = null;
                    return;
                }
            }
        }
    }

    public void BtB() {
        Chf();
    }

    public void CCi(KiX kiX, KMa kMa, long j) {
        this.A00 = j;
        if (kMa == KMa.A02) {
            this.A01 = kiX;
        }
        if (this.A05 == null) {
            this.A05 = 2aK.A03(0S2.A0N, (0DE) null, new JTs(this, (0DR) null, 21), A08(), 1);
        }
        A00(kiX, kMa);
        List list = kiX.A02;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                kiX = null;
                break;
            }
            Kts A0O = JQz.A0O(list, i);
            if (!A0O.A0C || A0O.A0B) {
                break;
            } else {
                i++;
            }
        }
        this.A04 = kiX;
    }

    public void CUa() {
        Chf();
    }

    @Override // X.MNb
    public void Chf() {
        C2a2 c2a2 = this.A05;
        if (c2a2 != null) {
            c2a2.AE0(new Lyo());
            this.A05 = null;
        }
    }

    @Override // X.MNh
    public /* synthetic */ int Cik(float f) {
        return L5l.A01(this, f);
    }

    public /* synthetic */ boolean Cx3() {
        return false;
    }

    @Override // X.MI2
    public /* synthetic */ float D4L(long j) {
        return KvQ.A00(this, j);
    }

    @Override // X.MNh
    public /* synthetic */ float D4M(float f) {
        return f / AhL();
    }

    @Override // X.MNh
    public /* synthetic */ float D4S(long j) {
        return L5l.A00(this, j);
    }

    @Override // X.MNh
    public /* synthetic */ float D4T(float f) {
        return f * AhL();
    }

    @Override // X.MNh
    public /* synthetic */ long D4W(long j) {
        return L5l.A02(this, j);
    }

    @Override // X.MNh
    public /* synthetic */ long D4X(float f) {
        return KvQ.A01(this, f / AhL());
    }
}
