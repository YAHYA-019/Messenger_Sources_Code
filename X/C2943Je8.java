package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.jvm.functions.Function1;

/* renamed from: X.Je8, reason: case insensitive filesystem */
/* loaded from: Je8.class */
public final class C2943Je8 extends AbstractC2938JdR {
    public static final MHx A03;
    public LOr A00;
    public MNY A01;
    public AbstractC2941JdU A02;

    static {
        LOQ loq = new LOQ();
        loq.A01.setColor(L5e.A00(LDp.A02));
        loq.A01.setStrokeWidth(1.0f);
        DKC.A1L(loq.A01);
        A03 = loq;
    }

    public C2943Je8(MNY mny, LPQ lpq) {
        super(lpq);
        this.A01 = mny;
        LOr lOr = null;
        this.A02 = lpq.A08 != null ? new C2940JdT(this) : null;
        this.A00 = (((LPR) mny).A03.A01 & 512) != 0 ? new LOr(this) : lOr;
    }

    private final void A05() {
        if (((AbstractC2927JdF) this).A03) {
            return;
        }
        A0V();
        if (this.A00 != null) {
            11T.A0D(this.A02);
            throw AnonymousClass001.A0Q("isPlacementApproachInProgress");
        }
        A0N().CXR();
        11T.A0D(this.A06);
    }

    @Override // X.AbstractC2938JdR, X.L56
    public void A0J(GraphicsLayer graphicsLayer, float f, long j) {
        super.A0J(graphicsLayer, f, j);
        A05();
    }

    @Override // X.AbstractC2938JdR, X.L56
    public void A0K(Function1 function1, float f, long j) {
        super.A0K(function1, f, j);
        A05();
    }

    public final void A0f(MNY mny) {
        LOr lOr;
        if (!mny.equals(this.A01)) {
            if ((((LPR) mny).A03.A01 & 512) != 0) {
                lOr = this.A00;
                if (lOr == null) {
                    lOr = new LOr(this);
                }
            } else {
                lOr = null;
            }
            this.A00 = lOr;
        }
        this.A01 = mny;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int Bd0(int i) {
        if (this.A00 != null) {
            11T.A0D(this.A06);
            throw AnonymousClass001.A0Q("maxApproachIntrinsicHeight");
        }
        MNY mny = this.A01;
        AbstractC2938JdR abstractC2938JdR = this.A06;
        11T.A0D(abstractC2938JdR);
        return mny.Bd2(abstractC2938JdR, this, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int Bd3(int i) {
        if (this.A00 != null) {
            11T.A0D(this.A06);
            throw AnonymousClass001.A0Q("maxApproachIntrinsicWidth");
        }
        MNY mny = this.A01;
        AbstractC2938JdR abstractC2938JdR = this.A06;
        11T.A0D(abstractC2938JdR);
        return mny.Bd5(abstractC2938JdR, this, i);
    }

    public L56 Bdz(long j) {
        A0I(j);
        LOr lOr = this.A00;
        if (lOr != null) {
            AbstractC2941JdU abstractC2941JdU = lOr.A00.A02;
            11T.A0D(abstractC2941JdU);
            abstractC2941JdU.A0N();
            throw AnonymousClass001.A0Q("isMeasurementApproachInProgress-ozmzZPI");
        }
        MNY mny = this.A01;
        AbstractC2938JdR abstractC2938JdR = this.A06;
        11T.A0D(abstractC2938JdR);
        A0Z(mny.Bdy(abstractC2938JdR, this, j));
        A0U();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int BeI(int i) {
        if (this.A00 != null) {
            11T.A0D(this.A06);
            throw AnonymousClass001.A0Q("minApproachIntrinsicHeight");
        }
        MNY mny = this.A01;
        AbstractC2938JdR abstractC2938JdR = this.A06;
        11T.A0D(abstractC2938JdR);
        return mny.BeK(abstractC2938JdR, this, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int BeL(int i) {
        if (this.A00 != null) {
            11T.A0D(this.A06);
            throw AnonymousClass001.A0Q("minApproachIntrinsicWidth");
        }
        MNY mny = this.A01;
        AbstractC2938JdR abstractC2938JdR = this.A06;
        11T.A0D(abstractC2938JdR);
        return mny.BeN(abstractC2938JdR, this, i);
    }
}
