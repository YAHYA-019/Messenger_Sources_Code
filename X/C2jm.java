package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.2jm, reason: invalid class name */
/* loaded from: 2jm.class */
public abstract class C2jm {
    public static final C2jo A00;
    public static final C2jo A01;
    public static final C2jo A02;
    public static final C2jo A03;
    public static final C2jo A04;
    public static final C2jo A05;
    public static final C2jo A06;
    public static final C2jo A07;
    public static final C2jo A08;
    public static final C2jo A09;
    public static final C2jo[] A0A;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.2jo] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, X.2jo] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, X.2jo] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, X.2jo] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, X.2jo] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, X.2jo] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, X.2jo] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.2jo] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.2jo] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.2jo] */
    static {
        ?? obj = new Object();
        A08 = obj;
        ?? obj2 = new Object();
        A09 = obj2;
        ?? obj3 = new Object();
        A07 = obj3;
        ?? obj4 = new Object();
        A01 = obj4;
        A00 = new Object();
        A04 = new Object();
        A05 = new Object();
        A06 = new Object();
        A02 = new Object();
        A03 = new Object();
        A0A = new C2jo[]{obj, obj2, obj3, obj4};
    }

    public static final float A00(View view, boolean z) {
        float f = 0.0f;
        while (view != null && (view.getParent() instanceof View) && (!(view instanceof C1qv) || !(view instanceof C1r1))) {
            f += z ? view.getX() : view.getY();
            view = (View) view.getParent();
        }
        return f;
    }

    public static final View A01(Drawable drawable) {
        View view;
        Drawable callback;
        while (true) {
            view = null;
            callback = drawable != null ? drawable.getCallback() : null;
            if (!(callback instanceof Drawable)) {
                break;
            }
            drawable = callback;
        }
        if (callback instanceof View) {
            view = (View) callback;
        }
        return view;
    }

    public static final View A02(C2jo c2jo, Object obj) {
        if (obj instanceof View) {
            return (View) obj;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Animating '");
        A0k.append(c2jo.getName());
        A0k.append("' is only supported on Views (got ");
        throw AnonymousClass001.A0T(AnonymousClass002.A0K(obj, A0k));
    }

    public static final ArrayList A03(C1qv c1qv) {
        int A0Q = c1qv.A0Q();
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A0Q) {
                return arrayList;
            }
            2JG A0R = c1qv.A0R(i2);
            if ((A0R.A04 instanceof Drawable) && (A0R.A01.A06 instanceof 25F)) {
                25F r0 = A0R.A01.A06;
                11T.A0I(r0, "null cannot be cast to non-null type com.facebook.rendercore.transitions.TransitionRenderUnit");
                if ((r0.A00 & 4) != 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    Object obj = A0R.A04;
                    11T.A0I(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                    arrayList.add(obj);
                }
            }
            i = i2 + 1;
        }
    }
}
