package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.common.callercontext.ContextChain;

/* renamed from: X.1iM, reason: invalid class name */
/* loaded from: 1iM.class */
public abstract class C1iM {
    public static 1iL A00;
    public static 1iL A01;
    public static 1iL A02;
    public static 1iL A03;
    public static final View.OnAttachStateChangeListener A04;

    static {
        1iL r0 = 1iO.A01;
        A03 = r0;
        1iL r02 = 1iO.A00;
        A02 = r02;
        A01 = r0;
        A00 = r02;
        A04 = new 1iP();
    }

    public static final 5C4 A00(View view) {
        Drawable drawable = view instanceof ImageView ? ((ImageView) view).getDrawable() : view.getBackground();
        if (drawable instanceof 5C4) {
            return (5C4) drawable;
        }
        return null;
    }

    public static final void A01(View view, InterfaceC06154g3 interfaceC06154g3, C06974ih c06974ih, 5BO r304, Object obj) {
        5C4 background;
        5C4 AJb;
        Runnable B6V;
        5BY A032 = 5BS.A03();
        Resources resources = view.getResources();
        11T.A0A(resources);
        5BR A033 = A032.A03(resources, new Rect(0, 0, view.getWidth(), view.getHeight()), (ContextChain) null, c06974ih, r304, obj, false, false);
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            background = imageView.getDrawable();
            if (!(background instanceof 5C4)) {
                AJb = 5BS.A01().AJb();
                Object obj2 = A03.get();
                11T.A0A(obj2);
                if (((Boolean) obj2).booleanValue()) {
                    AJb.CwY(new 3XB(AJb));
                }
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                11T.A0I(AJb, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                imageView.setImageDrawable((Drawable) AJb);
            }
            AJb = background;
        } else {
            background = view.getBackground();
            if (!(background instanceof 5C4)) {
                AJb = 5BS.A01().AJb();
                Object obj3 = A03.get();
                11T.A0A(obj3);
                if (AnonymousClass001.A1V(obj3)) {
                    AJb.CwY(new 3XB(AJb));
                }
                11T.A0I(AJb, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                view.setBackground((Drawable) AJb);
            }
            AJb = background;
        }
        5BR Aq8 = AJb.Aq8();
        if (Aq8 != null && !Aq8.equals(A033)) {
            5BS.A01().Ccn(AJb);
        }
        AJb.Ctj(new AGx(view, AJb, A033, interfaceC06154g3, obj));
        Object obj4 = A02.get();
        11T.A0A(obj4);
        if ((((Boolean) obj4).booleanValue() || view.isAttachedToWindow()) && (B6V = AJb.B6V()) != null) {
            B6V.run();
        }
        View.OnAttachStateChangeListener onAttachStateChangeListener = A04;
        view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        view.addOnAttachStateChangeListener(onAttachStateChangeListener);
    }
}
