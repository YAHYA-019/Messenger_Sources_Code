package X;

import androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback;

/* loaded from: Lzg.class */
public final class Lzg extends 0DP {
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ComposeScrollCaptureCallback this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lzg(ComposeScrollCaptureCallback composeScrollCaptureCallback, 0DR r303) {
        super(r303);
        this.this$0 = composeScrollCaptureCallback;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= (-1) << (-1);
        return ComposeScrollCaptureCallback.A03(null, this.this$0, null, this);
    }
}
