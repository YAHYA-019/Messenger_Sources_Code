package androidx.compose.ui.scrollcapture;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.AnonymousClass001;
import X.L4J;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;
import kotlin.jvm.functions.Function2;

/* loaded from: ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1.class */
public final class ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1 extends 0DO implements Function2 {
    public final /* synthetic */ Rect $captureArea;
    public final /* synthetic */ Consumer $onComplete;
    public final /* synthetic */ ScrollCaptureSession $session;
    public int label;
    public final /* synthetic */ ComposeScrollCaptureCallback this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(Rect rect, ScrollCaptureSession scrollCaptureSession, ComposeScrollCaptureCallback composeScrollCaptureCallback, Consumer consumer, 0DR r306) {
        super(2, r306);
        this.this$0 = composeScrollCaptureCallback;
        this.$session = scrollCaptureSession;
        this.$captureArea = rect;
        this.$onComplete = consumer;
    }

    public final 0DR create(Object obj, 0DR r303) {
        ComposeScrollCaptureCallback composeScrollCaptureCallback = this.this$0;
        return new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(this.$captureArea, this.$session, composeScrollCaptureCallback, this.$onComplete, r303);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            ComposeScrollCaptureCallback composeScrollCaptureCallback = this.this$0;
            ScrollCaptureSession scrollCaptureSession = this.$session;
            Rect rect = this.$captureArea;
            L4J l4j = new L4J(rect.left, rect.top, rect.right, rect.bottom);
            this.label = 1;
            obj = ComposeScrollCaptureCallback.A03(scrollCaptureSession, composeScrollCaptureCallback, l4j, this);
            if (obj == r0) {
                return r0;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0M();
            }
            0Dt.A00(obj);
        }
        L4J l4j2 = (L4J) obj;
        this.$onComplete.accept(new Rect(l4j2.A01, l4j2.A03, l4j2.A02, l4j2.A00));
        return 04S.A00;
    }
}
