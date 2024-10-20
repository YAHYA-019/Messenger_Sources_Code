package X;

import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.hyperthrift.HyperThriftBase;
import com.facebook.logginginfra.falco.Identity;

/* renamed from: X.1hF, reason: invalid class name */
/* loaded from: 1hF.class */
public final class C1hF {
    public final /* synthetic */ C00i A00;

    public C1hF(C00i c00i) {
        this.A00 = c00i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r305v4, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    public Identity A00() {
        1Ex r0 = (1Ex) this.A00.get();
        Identity identity = null;
        Identity identity2 = identity;
        if (r0 != null) {
            ViewerContext BHu = r0.BHu();
            identity2 = identity;
            if (BHu != null) {
                String str = BHu.mUserId;
                String str2 = r0.Aue().mUserId;
                Object[] objArr = new Object[4];
                if (str != null) {
                    Object A0n = 1BK.A0n(str);
                    if (A0n == null) {
                        A0n = HyperThriftBase.A02;
                    }
                    objArr[0] = A0n;
                }
                if (str2 != null) {
                    Object A0n2 = 1BK.A0n(str2);
                    if (A0n2 == null) {
                        A0n2 = HyperThriftBase.A02;
                    }
                    objArr[1] = A0n2;
                }
                Object[] objArr2 = new Object[2];
                Object[] A00 = HyperThriftBase.Builder.A00(objArr);
                A00[2] = Qzt.A00(A00[2]);
                ?? obj = new Object();
                obj.A02("com.facebook.logginginfra.falco.FacebookIdentity", A00);
                objArr2[0] = obj;
                Object[] A002 = HyperThriftBase.Builder.A00(objArr2);
                ?? obj2 = new Object();
                obj2.A02("com.facebook.logginginfra.falco.Identity", A002);
                obj2.A01();
                identity2 = obj2;
            }
        }
        return identity2;
    }
}
