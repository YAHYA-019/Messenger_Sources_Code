package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;

/* renamed from: X.92j, reason: invalid class name */
/* loaded from: 92j.class */
public final class C92j extends 8C6 {
    public final /* synthetic */ String A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92j(String str) {
        super(str);
        this.A00 = str;
    }

    public void onClick(View view) {
        11T.A0F(view, 0);
        Context A08 = 4YU.A08(view);
        String str = this.A00;
        1BV A00 = 1BV.A00(68729);
        try {
            Uri A03 = C0A2.A03(str);
            if (A03 != null) {
                ((C76) A00.get()).A01(A08, A03, C5id.A0z);
            }
        } catch (SecurityException unused) {
        }
    }
}
