package X;

import android.graphics.Color;
import java.util.ArrayList;

/* renamed from: X.886, reason: invalid class name */
/* loaded from: 886.class */
public final class AnonymousClass886 extends C00q implements C00m {
    public static final AnonymousClass886 A00 = new AnonymousClass886();

    public AnonymousClass886() {
        super(0);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        int[] iArr = AnonymousClass885.A0G;
        ArrayList A0t = AnonymousClass001.A0t(4);
        int i = 0;
        do {
            A0t.add(C0s8.A14(Integer.valueOf(Color.argb(iArr[i], 0, 0, 0)), Integer.valueOf(Color.argb(0, 0, 0, 0))));
            i++;
        } while (i < 4);
        return A0t;
    }
}
