package X;

import android.graphics.Rect;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* renamed from: X.2mc, reason: invalid class name */
/* loaded from: 2mc.class */
public abstract class C2mc extends 2kG {
    public static final Function1 A01 = C3kq.A00;
    public Function1 A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v98, types: [java.util.AbstractCollection] */
    public final void A05(Rect rect, View view, 2NQ r304, RecyclerView recyclerView) {
        11T.A0F(rect, 0);
        1BL.A1H(view, recyclerView, r304);
        2JB.A02((String) null);
        Function1 function1 = this.A00;
        if (function1 == null) {
            function1 = A01;
            C00m c00m = JSi.A06;
            1Lc r0 = 1Lc.A03;
            long currentTimeMillis = System.currentTimeMillis();
            if (r0.compareTo(1LZ.A00()) >= 0) {
                Set set = 1LZ.A00;
                if (!set.isEmpty()) {
                    List list = null;
                    for (Object obj : set) {
                        String[] strArr = ((1LV) obj).A00;
                        if (02L.A0C("Litho.DebugInfo", strArr) || 02L.A0C("*", strArr)) {
                            if (list == null) {
                                list = AnonymousClass001.A0s();
                            }
                            list.add(obj);
                        }
                    }
                    if (list == null) {
                        list = C0ty.A00;
                    }
                    if (1BK.A1Y(list)) {
                        LinkedHashMap A1C = 1BK.A1C();
                        A1C.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "ItemDecorationWithNullMeasureFunction");
                        Jux jux = new Jux(r0, "Litho.DebugInfo", (String) c00m.invoke(), A1C, currentTimeMillis);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            1LV.A00(jux, it);
                        }
                    }
                }
            }
        }
        11T.A0F(function1, 4);
        int A05 = RecyclerView.A05(view);
        int measuredWidth = recyclerView.getMeasuredWidth();
        if (A05 == 0) {
            function1.invoke(view);
            rect.left = ((measuredWidth - view.getMeasuredWidth()) / 2) - recyclerView.getPaddingLeft();
        } else if (A05 == r304.A00() - 1) {
            function1.invoke(view);
            rect.right = ((measuredWidth - view.getMeasuredWidth()) / 2) - recyclerView.getPaddingRight();
        }
    }
}
