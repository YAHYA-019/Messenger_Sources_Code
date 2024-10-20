package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.graphservice.fb.GraphQLConsistencyJNI;
import com.facebook.graphservice.fb.GraphQLServiceJNI;

/* renamed from: X.3tL, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3tL.class */
public final class C01933tL {
    public final 1YG A00;
    public final 1De A01;

    public C01933tL(1De r302) {
        this.A01 = r302;
        this.A00 = (1YG) 1Bn.A0G(r302.A00, 16706);
    }

    public final GraphQLConsistencyJNI A00(InterfaceC01633sc interfaceC01633sc, String str) {
        1YK A00 = this.A00.A00(interfaceC01633sc);
        11T.A0A(A00);
        try {
            1BY r0 = this.A01.A00;
            GraphQLConsistencyJNI A02 = ((C01603rp) 1Lm.A07(1Fw.A06(1Bn.A0G(r0, 16428)), r0, 67426)).A02(str);
            11T.A0D(A02);
            return A02;
        } finally {
            A00.AFC();
        }
    }

    public final GraphQLServiceJNI A01(InterfaceC01633sc interfaceC01633sc, String str) {
        11T.A0F(str, 1);
        1YK A00 = this.A00.A00(interfaceC01633sc);
        11T.A0A(A00);
        try {
            1BY r0 = this.A01.A00;
            1EZ r02 = (1EZ) 1Bn.A0G(r0, 16428);
            ThreadLocal threadLocal = ViewerContext.A02;
            Boolean bool = (Boolean) threadLocal.get();
            threadLocal.set(false);
            FbUserSession A04 = 1Fw.A04(r02);
            threadLocal.set(bool);
            GraphQLServiceJNI A03 = ((C01603rp) 1Lm.A07(A04, r0, 67426)).A03(str);
            11T.A0D(A03);
            return A03;
        } finally {
            A00.AFC();
        }
    }
}
