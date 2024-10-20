package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.inject.FbInjector;
import java.util.Comparator;

/* loaded from: F83.class */
public final class F83 {
    public static final Comparator A04 = new G6c(19);
    public final C69s A01 = (C69s) 1Bn.A0A(49976);
    public final C69e A02 = (C69e) 1Bn.A0A(49980);
    public final Context A00 = FbInjector.A00();
    public final 1CO A03 = AbJ.A0e();

    public void A00(Uri uri, CallerContext callerContext, Exv exv, 5SA r305, DNx dNx, int i, int i2, int i3, boolean z) {
        C69t A08;
        C69f A01;
        DOR eCl;
        int i4;
        int i5 = exv.A01;
        if (i5 < 0 || i5 > dNx.length()) {
            return;
        }
        if (this.A03.AZk(36313080909141585L)) {
            C07004ik A00 = C06984ii.A00();
            A00.A00(InterfaceC07034in.A04);
            if (z) {
                dNx.insert(i5, "\u200c ");
            }
            Context context = this.A00;
            5BO A012 = 5Bm.A01(uri, (java.util.Map) null);
            C06974ih c06974ih = new C06974ih(A00);
            int i6 = exv.A00 + i5;
            int i7 = i2;
            if (i != -1) {
                i7 = i;
            }
            boolean A1W = 4YV.A1W(i2, -1);
            if (i6 > dNx.length()) {
                return;
            }
            Drawable drawable = (5C4) 5BS.A01().AJb();
            Drawable drawable2 = drawable;
            if (drawable2.getBounds().isEmpty()) {
                drawable2.setBounds(0, 0, i7, i2);
            }
            eCl = new DOR(context.getResources(), dNx.A02, drawable, new DMC(drawable2, i3));
            dNx.A04.add(eCl);
            AKs aKs = new AKs(1, null, callerContext, new 4gO(new C2108Ddu(dNx, eCl, i2, A1W)), 5BS.A03().A03(eCl.A02, (Rect) null, (ContextChain) null, c06974ih, A012, (Object) null, false, false), eCl);
            eCl.A01 = aKs;
            aKs.invoke();
            i4 = i6 + 1;
        } else {
            C69s c69s = this.A01;
            synchronized (c69s) {
                c69s.A09();
                ((C69o) c69s).A02 = callerContext;
                c69s.A0A(uri);
                A08 = c69s.A08();
            }
            C69e c69e = this.A02;
            synchronized (c69e) {
                c69e.A0E = r305;
                c69e.A02(InterfaceC07034in.A04);
                c69e.A01 = 0;
                A01 = c69e.A01();
            }
            69W r0 = new 69W(A01);
            r0.A06(A08);
            if (z) {
                dNx.insert(i5, "\u200c ");
            }
            int i8 = i5 + exv.A00;
            int i9 = i2;
            if (i != -1) {
                i9 = i;
            }
            boolean A1W2 = 4YV.A1W(i2, -1);
            if (i8 >= dNx.length()) {
                return;
            }
            5CC A02 = r0.A02();
            if (A02 != null) {
                if (A02.getBounds().isEmpty()) {
                    A02.setBounds(0, 0, i9, i2);
                }
                A02.setCallback(dNx.A02);
            }
            eCl = new ECl(r0, i3);
            C69w c69w = r0.A01;
            if (c69w instanceof C69v) {
                ((C69v) c69w).A0E(new C2107Ddt(eCl, dNx, i2, A1W2));
            }
            dNx.A03.add(eCl);
            i4 = i8 + 1;
        }
        dNx.setSpan(eCl, i5, i4, 33);
    }
}
