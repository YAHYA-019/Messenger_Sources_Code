package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.jvm.functions.Function1;

/* renamed from: X.Je7, reason: case insensitive filesystem */
/* loaded from: Je7.class */
public final class C2942Je7 extends AbstractC2938JdR {
    public static final MHx A02;
    public AbstractC2941JdU A00;
    public final C2886Jc7 A01;

    static {
        LOQ loq = new LOQ();
        loq.A01.setColor(L5e.A00(LDp.A03));
        loq.A01.setStrokeWidth(1.0f);
        DKC.A1L(loq.A01);
        A02 = loq;
    }

    public C2942Je7(LPQ lpq) {
        super(lpq);
        C2886Jc7 c2886Jc7 = new C2886Jc7();
        this.A01 = c2886Jc7;
        c2886Jc7.A0G(this);
        this.A00 = lpq.A08 != null ? new C2939JdS(this) : null;
    }

    @Override // X.AbstractC2938JdR, X.L56
    public void A0J(GraphicsLayer graphicsLayer, float f, long j) {
        super.A0J(graphicsLayer, f, j);
        if (((AbstractC2927JdF) this).A03) {
            return;
        }
        A0V();
        this.A0H.A0R.A0J.A0N();
    }

    @Override // X.AbstractC2938JdR, X.L56
    public void A0K(Function1 function1, float f, long j) {
        super.A0K(function1, f, j);
        if (((AbstractC2927JdF) this).A03) {
            return;
        }
        A0V();
        this.A0H.A0R.A0J.A0N();
    }

    public int Bd0(int i) {
        KgP A00 = LPQ.A00(this.A0H);
        MKQ mkq = (MKQ) A00.A00.getValue();
        LPQ lpq = A00.A01;
        return mkq.Bd1(lpq.A0T.A04, lpq.A0R.A0J.A0L(), i);
    }

    public int Bd3(int i) {
        KgP A00 = LPQ.A00(this.A0H);
        MKQ mkq = (MKQ) A00.A00.getValue();
        LPQ lpq = A00.A01;
        return mkq.Bd4(lpq.A0T.A04, lpq.A0R.A0J.A0L(), i);
    }

    public L56 Bdz(long j) {
        A0I(j);
        LPQ lpq = this.A0H;
        LtK A0D = lpq.A0D();
        int i = A0D.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0D.A02;
            do {
                ((LPQ) objArr[i2]).A0R.A0J.A09 = 0S2.A0C;
                i2++;
            } while (i2 < i);
        }
        A0Z(lpq.A07.Bdx(this, lpq.A0R.A0J.A0L(), j));
        A0U();
        return this;
    }

    public int BeI(int i) {
        KgP A00 = LPQ.A00(this.A0H);
        MKQ mkq = (MKQ) A00.A00.getValue();
        LPQ lpq = A00.A01;
        return mkq.BeJ(lpq.A0T.A04, lpq.A0R.A0J.A0L(), i);
    }

    public int BeL(int i) {
        KgP A00 = LPQ.A00(this.A0H);
        MKQ mkq = (MKQ) A00.A00.getValue();
        LPQ lpq = A00.A01;
        return mkq.BeM(lpq.A0T.A04, lpq.A0R.A0J.A0L(), i);
    }
}
