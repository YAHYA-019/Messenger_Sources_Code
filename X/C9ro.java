package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.9ro, reason: invalid class name */
/* loaded from: 9ro.class */
public final class C9ro implements 2M3 {
    public final int A00;
    public final Object A01;

    public C9ro(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public final View AUH() {
        View A0F;
        switch (this.A00) {
            case 0:
                A0F = 7zM.A0F((Activity) this.A01);
                if (A0F == null) {
                    throw 1BK.A0e();
                }
                return A0F;
            case 1:
                A0F = 7zM.A0F((Activity) this.A01);
                if (A0F == null) {
                    throw 1BK.A0e();
                }
                return A0F;
            default:
                A0F = ((View) this.A01).requireViewById(2131363337);
                11T.A0A(A0F);
                return A0F;
        }
    }
}
