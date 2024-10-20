package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function2;

/* loaded from: JXv.class */
public final class JXv extends View implements ML3 {
    public static Field A0E;
    public static Method A0F;
    public static boolean A0G;
    public static boolean A0H;
    public boolean A00;
    public int A01;
    public long A02;
    public Rect A03;
    public C00m A04;
    public Function2 A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final AndroidComposeView A09;
    public final L4j A0A;
    public final Kdi A0B;
    public final JY0 A0C;
    public final Krx A0D;
    public static final Kmi A0J = new Object();
    public static final Function2 A0K = M7v.A00;
    public static final ViewOutlineProvider A0I = new JYG(1);

    public JXv(AndroidComposeView androidComposeView, JY0 jy0, C00m c00m, Function2 function2) {
        super(androidComposeView.getContext());
        this.A09 = androidComposeView;
        this.A0C = jy0;
        this.A05 = function2;
        this.A04 = c00m;
        this.A0A = new L4j();
        this.A0B = new Kdi();
        this.A0D = new Krx(A0K);
        this.A02 = L3m.A01;
        this.A08 = true;
        setWillNotDraw(false);
        jy0.addView(this);
        View.generateViewId();
    }

    private final void A00() {
        Rect rect;
        if (this.A06) {
            Rect rect2 = this.A03;
            if (rect2 == null) {
                this.A03 = new Rect(0, 0, getWidth(), getHeight());
            } else {
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.A03;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // X.ML3
    public void AOc(MLE mle, GraphicsLayer graphicsLayer) {
        boolean A1P = AnonymousClass001.A1P((getElevation() > 0.0f ? 1 : (getElevation() == 0.0f ? 0 : -1)));
        this.A07 = A1P;
        if (A1P) {
            mle.APb();
        }
        this.A0C.A00(this, mle, getDrawingTime());
        if (this.A07) {
            mle.ANU();
        }
    }

    @Override // X.ML3
    public boolean BTO(long j) {
        KR7 kr7;
        float A00 = DKH.A00(j);
        float A02 = JR1.A02(j);
        if (this.A06) {
            if (0.0f > A00 || A00 >= DKC.A02(this) || 0.0f > A02 || A02 >= DKC.A03(this)) {
                return false;
            }
        } else if (getClipToOutline()) {
            L4j l4j = this.A0A;
            if (l4j.A08 && (kr7 = l4j.A03) != null) {
                return L5g.A01(kr7, A00, A02);
            }
        }
        return true;
    }

    @Override // X.ML3
    public void BcG(KTM ktm, boolean z) {
        float[] A01;
        Krx krx = this.A0D;
        if (z) {
            A01 = krx.A00(this);
            if (A01 == null) {
                ktm.A01 = 0.0f;
                ktm.A03 = 0.0f;
                ktm.A02 = 0.0f;
                ktm.A00 = 0.0f;
                return;
            }
        } else {
            A01 = krx.A01(this);
        }
        LBd.A01(ktm, A01);
    }

    @Override // X.ML3
    public long BcH(long j, boolean z) {
        float[] A01;
        Krx krx = this.A0D;
        if (z) {
            A01 = krx.A00(this);
            if (A01 == null) {
                return 9187343241974906880L;
            }
        } else {
            A01 = krx.A01(this);
        }
        return LBd.A00(A01, j);
    }

    @Override // X.ML3
    public void BeY(long j) {
        int A0C = JQz.A0C(j);
        if (A0C != getLeft()) {
            offsetLeftAndRight(A0C - getLeft());
            Krx krx = this.A0D;
            krx.A00 = true;
            krx.A01 = true;
        }
        int A0I2 = JR0.A0I(j);
        if (A0I2 != getTop()) {
            offsetTopAndBottom(JQx.A0H(this, A0I2));
            Krx krx2 = this.A0D;
            krx2.A00 = true;
            krx2.A01 = true;
        }
    }

    @Override // X.ML3
    public void Chp(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (i == getWidth() && i2 == getHeight()) {
            return;
        }
        long j2 = this.A02;
        long j3 = L3m.A01;
        setPivotX(DKF.A00(j2) * i);
        setPivotY(JQx.A04(this.A02, 4294967295L) * i2);
        setOutlineProvider(this.A0A.A01() != null ? A0I : null);
        layout(getLeft(), getTop(), getLeft() + i, getTop() + i2);
        A00();
        Krx krx = this.A0D;
        krx.A00 = true;
        krx.A01 = true;
    }

    @Override // X.ML3
    public void Cib(C00m c00m, Function2 function2) {
        this.A0C.addView(this);
        this.A06 = false;
        this.A07 = false;
        this.A02 = L3m.A01;
        this.A05 = function2;
        this.A04 = c00m;
    }

    @Override // X.ML3
    public void D6r() {
        if (!this.A00 || A0H) {
            return;
        }
        A0J.A00(this);
        if (false != this.A00) {
            this.A00 = false;
            this.A09.A0M(this, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a3, code lost:
    
        if (r302.A0B == X.KZd.A00) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01cd, code lost:
    
        if (r302.A0B != X.KZd.A00) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0261, code lost:
    
        if (r0.A05 != null) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0341  */
    @Override // X.ML3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void D7A(X.LOO r302) {
        /*
            Method dump skipped, instructions count: 886
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JXv.D7A(X.LOO):void");
    }

    @Override // X.ML3
    public void destroy() {
        if (false != this.A00) {
            this.A00 = false;
            this.A09.A0M(this, false);
        }
        AndroidComposeView androidComposeView = this.A09;
        androidComposeView.A09 = true;
        this.A05 = null;
        this.A04 = null;
        androidComposeView.A0L(this);
        this.A0C.removeViewInLayout(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006d, code lost:
    
        r0.invoke(r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007e, code lost:
    
        if (r308 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0081, code lost:
    
        r0.CiE();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0085, code lost:
    
        ((X.LOM) r0).A00 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0097, code lost:
    
        if (false == r301.A00) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009a, code lost:
    
        r301.A00 = false;
        r301.A09.A0M(r301, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00aa, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r302.isHardwareAccelerated() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0040, code lost:
    
        if (r0.A05 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0051, code lost:
    
        r308 = true;
        r0.CjL();
        r301.A0A.A02(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0062, code lost:
    
        r0 = r301.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006a, code lost:
    
        if (r0 == null) goto L14;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void dispatchDraw(android.graphics.Canvas r302) {
        /*
            r301 = this;
            r0 = r301
            X.Kdi r0 = r0.A0B
            r303 = r0
            r0 = r303
            X.LOM r0 = r0.A00
            r304 = r0
            r0 = r304
            android.graphics.Canvas r0 = r0.A00
            r305 = r0
            r0 = r304
            r1 = r302
            r0.A00 = r1
            r0 = r301
            boolean r0 = r0.getClipToOutline()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L43
            r0 = r301
            X.L4j r0 = r0.A0A
            r307 = r0
            r0 = r307
            boolean r0 = r0.A09
            r1 = 1
            r0 = r0 ^ r1
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L43
            r0 = r307
            X.L4j.A00(r0)
            r0 = r307
            X.MLe r0 = r0.A05
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L51
        L43:
            r0 = r302
            boolean r0 = r0.isHardwareAccelerated()
            r306 = r0
            r0 = 0
            r308 = r0
            r0 = r306
            if (r0 != 0) goto L62
        L51:
            r0 = 1
            r308 = r0
            r0 = r304
            r0.CjL()
            r0 = r301
            X.L4j r0 = r0.A0A
            r303 = r0
            r0 = r303
            r1 = r304
            r0.A02(r1)
        L62:
            r0 = r301
            kotlin.jvm.functions.Function2 r0 = r0.A05
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L7c
            r0 = 0
            r306 = r0
            r0 = 0
            r303 = r0
            r0 = r307
            r1 = r304
            r2 = 0
            java.lang.Object r0 = r0.invoke(r1, r2)
        L7c:
            r0 = r308
            if (r0 == 0) goto L85
            r0 = r304
            r0.CiE()
        L85:
            r0 = r304
            r1 = r305
            r0.A00 = r1
            r0 = 0
            r307 = r0
            r0 = r301
            boolean r0 = r0.A00
            r306 = r0
            r0 = 0
            r1 = r306
            if (r0 == r1) goto Laa
            r0 = r301
            r1 = 0
            r0.A00 = r1
            r0 = r301
            androidx.compose.ui.platform.AndroidComposeView r0 = r0.A09
            r303 = r0
            r0 = r303
            r1 = r301
            r2 = 0
            r0.A0M(r1, r2)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JXv.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.A08;
    }

    @Override // android.view.View, X.ML3
    public void invalidate() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        AndroidComposeView androidComposeView = this.A09;
        androidComposeView.A0M(this, true);
        super.invalidate();
        androidComposeView.invalidate();
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
