package X;

import android.content.Context;
import kotlin.jvm.functions.Function2;

/* renamed from: X.Je9, reason: case insensitive filesystem */
/* loaded from: Je9.class */
public final class C2944Je9 extends JY7 {
    public boolean A00;
    public final MN4 A01;

    public C2944Je9(Context context) {
        super(context);
        this.A01 = KvA.A01((Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A07(Function2 function2) {
        this.A00 = true;
        this.A01.Cvx(function2);
        if (isAttachedToWindow()) {
            if (((JY7) this).A02 == null && !isAttachedToWindow()) {
                throw AnonymousClass001.A0N("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
            JY7.A01(this);
        }
    }

    public CharSequence getAccessibilityClassName() {
        return AnonymousClass001.A0Y(this);
    }
}
