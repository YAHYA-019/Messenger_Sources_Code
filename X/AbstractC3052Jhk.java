package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.listcell.ListCell;
import java.util.List;

/* renamed from: X.Jhk, reason: case insensitive filesystem */
/* loaded from: Jhk.class */
public abstract class AbstractC3052Jhk extends HFn {
    public View.OnClickListener A00 = Rjt.A00;
    public boolean A01;
    public final KP0 A02;
    public final LoggingContext A03;

    public AbstractC3052Jhk(KP0 kp0, LoggingContext loggingContext, boolean z) {
        this.A02 = kp0;
        this.A03 = loggingContext;
        this.A01 = z;
    }

    public static View A00(Context context, ViewGroup viewGroup) {
        View A00 = C06014fk.A0A().A00(context, viewGroup, KP0.A0J);
        11T.A0I(A00, "null cannot be cast to non-null type com.facebookpay.widget.actionmenu.InlineActionMenu");
        return A00;
    }

    public static View A01(ViewGroup viewGroup, AbstractC3052Jhk abstractC3052Jhk) {
        11T.A0F(viewGroup, 0);
        List list = C2lb.A0J;
        Ks7 A0A = C06014fk.A0A();
        Context context = viewGroup.getContext();
        11T.A0A(context);
        return A0A.A00(context, viewGroup, abstractC3052Jhk.A02);
    }

    public static ListCell A02(Context context, ViewGroup viewGroup, KP0 kp0, Ks7 ks7) {
        View A00 = ks7.A00(context, viewGroup, kp0);
        11T.A0I(A00, "null cannot be cast to non-null type com.facebookpay.widget.listcell.ListCell");
        return (ListCell) A00;
    }

    public /* bridge */ /* synthetic */ boolean A05(Object obj, Object obj2) {
        Object obj3;
        FJC fjc = (FJC) obj;
        FJC fjc2 = (FJC) obj2;
        11T.A0H(fjc, fjc2);
        boolean z = false;
        if (fjc.A00 == fjc2.A00 && (obj3 = fjc.A01) != null) {
            z = JQy.A1Z(obj3, fjc2.A01);
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0038, code lost:
    
        if (X.11T.A0O(r0.A01, r0.A01) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ boolean A06(java.lang.Object r302, java.lang.Object r303) {
        /*
            r301 = this;
            r0 = r302
            X.FJC r0 = (X.FJC) r0
            r302 = r0
            r0 = r303
            X.FJC r0 = (X.FJC) r0
            r303 = r0
            r0 = r302
            r1 = r303
            X.11T.A0H(r0, r1)
            r0 = r302
            X.EL6 r0 = r0.A00
            r304 = r0
            r0 = r303
            X.EL6 r0 = r0.A00
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 != r1) goto L3b
            r0 = r302
            java.lang.Object r0 = r0.A01
            r304 = r0
            r0 = r303
            java.lang.Object r0 = r0.A01
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = X.11T.A0O(r0, r1)
            r306 = r0
            r0 = 1
            r307 = r0
            r0 = r306
            if (r0 != 0) goto L41
        L3b:
            r0 = 0
            r307 = r0
            r0 = 0
            r305 = r0
        L41:
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC3052Jhk.A06(java.lang.Object, java.lang.Object):boolean");
    }

    public abstract C2lb A07(ViewGroup viewGroup);

    public void A08(C2lb c2lb, FJC fjc) {
        if (this instanceof Jwo) {
            11T.A0H(fjc, (Object) null);
            throw AnonymousClass001.A0Q("listCell");
        }
        if (this instanceof Jwn) {
            11T.A0H(fjc, (Object) null);
            throw AnonymousClass001.A0Q("cell");
        }
    }
}
