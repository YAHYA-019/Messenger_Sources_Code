package androidx.compose.ui.scrollcapture;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.7zM;
import X.AnonymousClass001;
import X.JR1;
import X.KdT;
import X.KdW;
import X.Kpf;
import X.KvH;
import X.L5h;
import X.LBT;
import X.LE0;
import kotlin.jvm.functions.Function2;

/* loaded from: ComposeScrollCaptureCallback$scrollTracker$1.class */
public final class ComposeScrollCaptureCallback$scrollTracker$1 extends 0DO implements Function2 {
    public /* synthetic */ float F$0;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ ComposeScrollCaptureCallback this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$scrollTracker$1(ComposeScrollCaptureCallback composeScrollCaptureCallback, 0DR r303) {
        super(2, r303);
        this.this$0 = composeScrollCaptureCallback;
    }

    public final 0DR create(Object obj, 0DR r303) {
        ComposeScrollCaptureCallback$scrollTracker$1 composeScrollCaptureCallback$scrollTracker$1 = new ComposeScrollCaptureCallback$scrollTracker$1(this.this$0, r303);
        composeScrollCaptureCallback$scrollTracker$1.F$0 = 7zM.A00(obj);
        return composeScrollCaptureCallback$scrollTracker$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create(Float.valueOf(7zM.A00(obj)), (0DR) obj2).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        LBT lbt;
        LBT lbt2;
        boolean z;
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            float f = this.F$0;
            lbt = this.this$0.A01;
            Function2 function2 = (Function2) L5h.A02(lbt.A05, KdT.A0J);
            if (function2 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            lbt2 = this.this$0.A01;
            z = ((Kpf) lbt2.A05.A01(KdW.A0U)).A02;
            if (z) {
                f = -f;
            }
            LE0 le0 = new LE0(KvH.A00(0.0f, f));
            this.Z$0 = z;
            this.label = 1;
            obj = function2.invoke(le0, this);
            if (obj == r0) {
                return r0;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0M();
            }
            z = this.Z$0;
            0Dt.A00(obj);
        }
        float A02 = JR1.A02(((LE0) obj).A00);
        if (z) {
            A02 = -A02;
        }
        return new Float(A02);
    }
}
