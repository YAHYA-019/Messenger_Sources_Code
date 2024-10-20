package X;

import android.content.Context;

/* renamed from: X.DeY, reason: case insensitive filesystem */
/* loaded from: DeY.class */
public final class C2119DeY extends C2120DeZ {
    public final /* synthetic */ FXo A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2119DeY(Context context, FXo fXo) {
        super(context);
        this.A00 = fXo;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.6U5] */
    public void onDetachedFromWindow() {
        super/*X.DMQ*/.onDetachedFromWindow();
        6U2 r0 = this.A00.A04.A07;
        if (r0 != null) {
            r0.A06((6U5) new Object());
        }
    }
}
