package X;

import com.facebook.litho.ComponentTree;
import kotlin.jvm.functions.Function2;

/* loaded from: A2i.class */
public final class A2i implements C2lr {
    public final ComponentTree A00;
    public final Function2 A01;

    public A2i(ComponentTree componentTree, Function2 function2) {
        11T.A0F(function2, 2);
        this.A00 = componentTree;
        this.A01 = function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (X.AnonymousClass001.A1V(r301.A01.invoke(r301, r302)) == false) goto L6;
     */
    @Override // X.C2lr
    /* renamed from: BSE, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BSF(X.C2lr r302) {
        /*
            r301 = this;
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            r1 = r302
            boolean r0 = X.C28q.A03(r0, r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L2a
            r0 = r301
            kotlin.jvm.functions.Function2 r0 = r0.A01
            r1 = r301
            r2 = r302
            java.lang.Object r0 = r0.invoke(r1, r2)
            r303 = r0
            r0 = r303
            boolean r0 = X.AnonymousClass001.A1V(r0)
            r305 = r0
            r0 = 1
            r304 = r0
            r0 = r305
            if (r0 != 0) goto L2e
        L2a:
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
        L2e:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A2i.BSF(X.2lr):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.23P, java.lang.Object] */
    @Override // X.C2lr
    public C2m0 BY9(C2ly c2ly, long j) {
        11T.A0F(c2ly, 0);
        ?? obj = new Object();
        this.A00.A0U(obj, 26N.A01(j), 26N.A00(j));
        return new C2m0(Math.max(C26P.A03(j), obj.A01), Math.max(C26P.A02(j), obj.A00), null);
    }
}
