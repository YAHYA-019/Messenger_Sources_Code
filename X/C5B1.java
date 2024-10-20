package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.5B1, reason: invalid class name */
/* loaded from: 5B1.class */
public abstract class C5B1 {
    public static ViewOutlineProvider A00() {
        return ViewOutlineProvider.BOUNDS;
    }

    public static 5B2 A01(int i) {
        return new 5B2(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.7as] */
    public static C7as A02() {
        return new ViewOutlineProvider() { // from class: X.7as
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), view.getWidth() / 2);
            }
        };
    }
}
