package androidx.compose.foundation.gestures;

import X.0DE;
import X.0DR;
import X.2aI;
import X.2aK;
import X.AJV;
import X.AbstractC2887Jc8;
import X.AnonymousClass001;
import X.C2831Jan;
import X.C2904Jcq;
import X.C4G7;
import X.JQx;
import X.KMT;
import X.KMa;
import X.KZg;
import X.KiX;
import X.LMr;
import X.LMu;
import X.LPR;
import X.M0J;
import X.M6n;
import X.MMs;
import X.MNN;
import X.MNZ;
import X.MNb;
import kotlin.jvm.functions.Function1;

/* loaded from: DragGestureNode.class */
public abstract class DragGestureNode extends AbstractC2887Jc8 implements MNZ, MNN {
    public KMT A00;
    public MMs A01;
    public MNb A02;
    public Function1 A03;
    public C4G7 A04;
    public boolean A05;
    public boolean A06;
    public LMr A07;
    public final Function1 A08 = M6n.A00(this, 12);

    public DragGestureNode(KMT kmt, MMs mMs, Function1 function1, boolean z) {
        this.A00 = kmt;
        this.A03 = function1;
        this.A05 = z;
        this.A01 = mMs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0058  */
    /* JADX WARN: Type inference failed for: r312v1, types: [X.MBE, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A00(X.8Cb r301, androidx.compose.foundation.gestures.DragGestureNode r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.A00(X.8Cb, androidx.compose.foundation.gestures.DragGestureNode, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A01(X.C2829Jal r301, androidx.compose.foundation.gestures.DragGestureNode r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.A01(X.Jal, androidx.compose.foundation.gestures.DragGestureNode, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A02(androidx.compose.foundation.gestures.DragGestureNode r301, X.0DR r302) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.A02(androidx.compose.foundation.gestures.DragGestureNode, X.0DR):java.lang.Object");
    }

    public static final void A03(DragGestureNode dragGestureNode) {
        LMr lMr = dragGestureNode.A07;
        if (lMr != null) {
            MMs mMs = dragGestureNode.A01;
            if (mMs != null) {
                JQx.A1M(mMs, new LMu(lMr));
            }
            dragGestureNode.A07 = null;
        }
    }

    private void A0J(long j) {
        C2831Jan c2831Jan = (C2831Jan) this;
        2aI r0 = (2aI) c2831Jan.A0A.A01.invoke();
        if (r0 == null) {
            throw AnonymousClass001.A0N("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        2aK.A03((Integer) null, (0DE) null, new M0J(c2831Jan, (0DR) null, 0, j), r0, 3);
    }

    public /* synthetic */ boolean BPq() {
        return false;
    }

    /* renamed from: Bmx, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void CUa() {
        MNb mNb = this.A02;
        if (mNb != null) {
            mNb.Bmx();
        }
    }

    public void CCi(KiX kiX, KMa kMa, long j) {
        if (this.A05 && this.A02 == null) {
            AJV ajv = new AJV(this, null, 6);
            KiX kiX2 = KZg.A00;
            LPR c2904Jcq = new C2904Jcq(null, ajv);
            A0H(c2904Jcq);
            this.A02 = c2904Jcq;
        }
        MNb mNb = this.A02;
        if (mNb != null) {
            mNb.CCi(kiX, kMa, j);
        }
    }

    public /* synthetic */ boolean Cx3() {
        return false;
    }
}
