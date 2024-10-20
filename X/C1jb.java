package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* renamed from: X.1jb, reason: invalid class name */
/* loaded from: 1jb.class */
public final class C1jb implements C1jc {
    public static final C1jb A00 = new Object();
    public static final ArrayList A01 = C0s8.A10(1, 2, 4, 8, 16, 32, 64, 128);

    /* JADX WARN: Removed duplicated region for block: B:83:0x0281  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.graphics.Rect A00(android.app.Activity r302) {
        /*
            Method dump skipped, instructions count: 807
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1jb.A00(android.app.Activity):android.graphics.Rect");
    }

    private final Rect A01(Activity activity) {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            11T.A0I(invoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) invoke);
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
            android.util.Log.w("WindowMetricsCalculatorCompat", e);
            return A00(activity);
        }
    }

    public static final 08D A02(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C1je.A01(context);
        }
        throw new Exception("Incompatible SDK version");
    }

    public C1k1 A03(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C1je.A02(context);
        }
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            if (!(context2 instanceof Activity) && !(context2 instanceof InputMethodService)) {
                ContextWrapper contextWrapper = (ContextWrapper) context2;
                if (contextWrapper.getBaseContext() != null) {
                    context2 = contextWrapper.getBaseContext();
                    11T.A0A(context2);
                }
            }
            if (context2 instanceof Activity) {
                return AH9((Activity) context2);
            }
            if (!(context2 instanceof InputMethodService)) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append(context);
                throw AnonymousClass002.A0D(" is not a UiContext", A0k);
            }
            Object systemService = context.getSystemService("window");
            11T.A0I(systemService, 7zK.A00(1));
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            11T.A0A(defaultDisplay);
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Rect rect = new Rect(0, 0, point.x, point.y);
            08D A002 = new 08K().A00.A00();
            11T.A0A(A002);
            return new C1k1(A002, new C1k0(rect));
        }
        StringBuilder A0k2 = AnonymousClass001.A0k();
        A0k2.append("Context ");
        A0k2.append(context);
        throw AnonymousClass002.A0D(" is not a UiContext", A0k2);
    }

    @Override // X.C1jc
    public C1k1 AH9(Activity activity) {
        Rect A012;
        08D A002;
        11T.A0F(activity, 0);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            A012 = C1je.A00(activity);
            A002 = A02(activity);
        } else {
            A012 = i >= 29 ? A01(activity) : A00(activity);
            A002 = new 08K().A00.A00();
            11T.A0A(A002);
        }
        return new C1k1(A002, new C1k0(A012));
    }
}
