package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.View;
import com.google.common.base.Throwables;

/* renamed from: X.3jn, reason: invalid class name */
/* loaded from: 3jn.class */
public final class C3jn extends RuntimeException {
    public static String A00(Context context) {
        boolean z = context instanceof ContextWrapper;
        StringBuilder A0k = AnonymousClass001.A0k();
        if (z) {
            A0k.append("ContextWrapper: ");
            A0k.append(context);
            A0k.append(" (resources: ");
            1BK.A1R(A0k, context.getResources());
            A0k.append(", theme: ");
            1BK.A1R(A0k, context.getTheme());
            return 0Pz.A0j(AnonymousClass001.A0d(")", A0k), " with base -> ", A00(((ContextWrapper) context).getBaseContext()));
        }
        A0k.append("Context: ");
        A0k.append(context);
        A0k.append(" (resources: ");
        1BK.A1R(A0k, context.getResources());
        A0k.append(", theme: ");
        1BK.A1R(A0k, context.getTheme());
        return AnonymousClass001.A0d(")", A0k);
    }

    public static void A01(View view, Throwable th, int i) {
        String obj;
        Throwables.throwIfInstanceOf(th, C3jn.class);
        StringBuilder A0k = AnonymousClass001.A0k();
        Resources resources = view.getResources();
        A0k.append("\nView Hierarchy:");
        View view2 = view;
        do {
            3HJ.A00(resources, view2, A0k, i);
            if (!(view2.getParent() instanceof View)) {
                break;
            } else {
                view2 = (View) view2.getParent();
            }
        } while (view2 != null);
        C00s.A00();
        A0k.append("\nContext:\n");
        A0k.append(A00(view.getContext()));
        A0k.append("\nLast logged resource keys:\n");
        long[] jArr = 1NL.A05;
        synchronized (jArr) {
            StringBuilder A0k2 = AnonymousClass001.A0k();
            int i2 = 0;
            while (i2 < 25) {
                AnonymousClass001.A1I(A0k2, Long.toHexString(jArr[i2]));
                i2++;
                if (i2 % 25 == 1NL.A04) {
                    A0k2.append("--- index ---\n");
                }
            }
            obj = A0k2.toString();
        }
        A0k.append(obj);
        String stackTraceString = android.util.Log.getStackTraceString(th);
        if (stackTraceString.contains("Failed to resolve attribute at index")) {
            A0k.append("\n  TESTING NOTE:  If you receive this error in a test, you might not have a theme set on the activity.  This can be set in the testing manifest or by adding a call to setTheme(R.style.your_theme) when creating the activity");
        }
        RuntimeException runtimeException = new RuntimeException(1BL.A0u("\n  Original Throwable: ", stackTraceString, A0k));
        runtimeException.initCause(th);
        throw runtimeException;
    }
}
