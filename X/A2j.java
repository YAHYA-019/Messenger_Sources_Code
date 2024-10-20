package X;

import android.view.View;
import com.facebook.litho.ComponentTree;

/* loaded from: A2j.class */
public final class A2j implements C2lr {
    public final 1LI A00;
    public final 1Iw A01;
    public final ComponentTree A02;
    public final /* synthetic */ C8ip A03;

    public A2j(1LI r302, 1Iw r303, ComponentTree componentTree, C8ip c8ip) {
        1BK.A1K(r302, 3, componentTree);
        this.A03 = c8ip;
        this.A01 = r303;
        this.A00 = r302;
        this.A02 = componentTree;
    }

    @Override // X.C2lr
    /* renamed from: BSE */
    public boolean BSF(C2lr c2lr) {
        return 7zR.A1Z(c2lr, this);
    }

    public /* bridge */ /* synthetic */ boolean BSF(Object obj) {
        return 7zR.A1Z(obj, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.23P, java.lang.Object] */
    @Override // X.C2lr
    public C2m0 BY9(C2ly c2ly, long j) {
        int max;
        ComponentTree componentTree = this.A02;
        if (componentTree.BVK()) {
            return new C2m0(0, 0, new 9Q5(0, 0));
        }
        ?? obj = new Object();
        2cM A00 = 2cK.A00(this.A01);
        A00.A0S();
        A00.A0C(View.MeasureSpec.getSize(26N.A01(j)));
        componentTree.A0Q(7zL.A0V(A00, this.A00), obj, 26N.A01(j), C1tN.A00);
        if (!C26P.A07(j)) {
            if (C26P.A05(j)) {
                max = Math.max(0, Math.min(C26P.A00(j), obj.A00));
            }
            int max2 = Math.max(0, obj.A01);
            obj.A01 = max2;
            int i = obj.A00;
            return new C2m0(max2, i, new 9Q5(max2, i));
        }
        max = C26P.A00(j);
        obj.A00 = max;
        int max22 = Math.max(0, obj.A01);
        obj.A01 = max22;
        int i2 = obj.A00;
        return new C2m0(max22, i2, new 9Q5(max22, i2));
    }
}
