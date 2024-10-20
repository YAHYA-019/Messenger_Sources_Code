package X;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import kotlin.jvm.functions.Function1;

/* loaded from: F3k.class */
public abstract class F3k {
    public static final int A01 = Color.argb(230, 255, 255, 255);
    public static final int A00 = Color.argb(128, 27, 27, 27);

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void A00(ComponentActivity componentActivity) {
        GAt gAt = GAt.A00;
        11T.A0F(gAt, 2);
        EkT ekT = new EkT(gAt, 0, 0);
        EkT ekT2 = new EkT(gAt, A01, A00);
        View A0B = DKD.A0B(componentActivity);
        11T.A0A(A0B);
        Function1 function1 = ekT.A02;
        Resources resources = A0B.getResources();
        11T.A0A(resources);
        boolean A1a = 7zR.A1a(resources, function1);
        boolean A1a2 = 7zR.A1a(resources, ekT2.A02);
        int i = Build.VERSION.SDK_INT;
        Object dr0 = i >= 30 ? new DR0() : i >= 29 ? new DR1() : new Object();
        Window window = componentActivity.getWindow();
        11T.A0A(window);
        dr0.Cvt(A0B, window, ekT, ekT2, A1a, A1a2);
        Window window2 = componentActivity.getWindow();
        11T.A0A(window2);
        dr0.A00(window2);
    }
}
