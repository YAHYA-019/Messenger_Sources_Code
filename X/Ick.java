package X;

import android.opengl.GLES20;
import android.os.SystemClock;

/* loaded from: Ick.class */
public final class Ick implements JLE, JKJ, JG0 {
    public int A00;
    public int A01;
    public JMu A02;
    public final Ict A03;
    public final IFJ A04;
    public final boolean A05;
    public volatile JG1 A06;

    public Ick() {
        this(false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.Ict] */
    public Ick(boolean z) {
        this.A03 = new Object();
        this.A04 = new Gu6();
        this.A05 = z;
    }

    public static void A00(Ick ick) {
        Ict ict;
        HsT hsT;
        if (ick.A02 == null || (hsT = (ict = ick.A03).A04) == null) {
            return;
        }
        hsT.A01();
        ict.A04 = null;
    }

    public static void A01(Ick ick) {
        if (ick.A02 != null) {
            Ict ict = ick.A03;
            if (ict.A04 == null) {
                I8U i8u = new I8U("BlankInput");
                i8u.A03 = 3553;
                i8u.A04 = 8;
                i8u.A02 = 8;
                I8U.A01(i8u);
                HsT hsT = new HsT(i8u);
                if (ick.A05) {
                    int i = hsT.A00;
                    int[] iArr = new int[1];
                    GLES20.glGenFramebuffers(1, iArr, 0);
                    GLES20.glBindFramebuffer(36160, iArr[0]);
                    GLES20.glBindTexture(3553, i);
                    GLES20.glTexImage2D(3553, 0, 6408, 8, 8, 0, 6408, 5121, null);
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16640);
                    N34.A02("after clear color", new Object[0]);
                    GLES20.glBindTexture(3553, 0);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glDeleteFramebuffers(1, iArr, 0);
                }
                ict.A04 = hsT;
            }
            JG1 jg1 = ick.A06;
            if (jg1 != null) {
                jg1.onFrameAvailable();
            }
        }
    }

    public Hp4 A02(int i, int i2, int i3) {
        IFJ ifj = this.A04;
        ifj.A09(this.A01, this.A00, i, i2, 0, false, false);
        this.A03.A01 = i3;
        return ifj.A08();
    }

    public void AAv(JMu jMu) {
        this.A02 = jMu;
        A01(this);
    }

    public void AN3() {
        A00(this);
        this.A02 = null;
    }

    @Override // X.JKJ
    public JMv AnT() {
        Ict ict = this.A03;
        ict.A05 = this.A04.A08();
        ict.A03 = SystemClock.elapsedRealtimeNanos();
        return ict;
    }

    @Override // X.JKJ
    public /* synthetic */ int Aqq() {
        return 0;
    }

    public void BOo(I9U i9u) {
    }

    @Override // X.JKJ
    public void Crq(JG1 jg1) {
        this.A06 = jg1;
    }

    @Override // X.JG0
    public Hp4 D76(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        return A02(i, i2, i6);
    }

    public void release() {
    }
}
