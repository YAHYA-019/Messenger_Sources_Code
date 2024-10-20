package X;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;

/* loaded from: Lzb.class */
public final class Lzb extends 0DP {
    public Object L$0;
    public Object L$1;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;

    public Lzb(0DR r302) {
        super(r302);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= (-1) << (-1);
        return TapGestureDetectorKt.A01(null, null, this, false);
    }
}
