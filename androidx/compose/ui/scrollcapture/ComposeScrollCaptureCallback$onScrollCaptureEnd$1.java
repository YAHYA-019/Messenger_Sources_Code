package androidx.compose.ui.scrollcapture;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.AnonymousClass001;
import X.MEU;
import kotlin.jvm.functions.Function2;

/* loaded from: ComposeScrollCaptureCallback$onScrollCaptureEnd$1.class */
public final class ComposeScrollCaptureCallback$onScrollCaptureEnd$1 extends 0DO implements Function2 {
    public final /* synthetic */ Runnable $onReady;
    public int label;
    public final /* synthetic */ ComposeScrollCaptureCallback this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$onScrollCaptureEnd$1(ComposeScrollCaptureCallback composeScrollCaptureCallback, Runnable runnable, 0DR r304) {
        super(2, r304);
        this.this$0 = composeScrollCaptureCallback;
        this.$onReady = runnable;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new ComposeScrollCaptureCallback$onScrollCaptureEnd$1(this.this$0, this.$onReady, r303);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        RelativeScroller relativeScroller;
        MEU meu;
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            relativeScroller = this.this$0.A00;
            this.label = 1;
            if (RelativeScroller.A00(relativeScroller, this, 0.0f - relativeScroller.A00) == r0) {
                return r0;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0M();
            }
            0Dt.A00(obj);
        }
        meu = this.this$0.A02;
        meu.CKj();
        this.$onReady.run();
        return 04S.A00;
    }
}
