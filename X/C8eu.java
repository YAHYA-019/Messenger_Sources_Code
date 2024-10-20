package X;

import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.8eu, reason: invalid class name */
/* loaded from: 8eu.class */
public final class C8eu extends 1LH {
    public static final CallerContext A01 = CallerContext.A0B("MemoryViewerTemplatesMessagesBackground");
    public final String A00;

    public C8eu(String str) {
        11T.A0F(str, 1);
        this.A00 = str;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.3xX, java.lang.Object] */
    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        2lO A0S = 7zS.A0S(C82m.A01(null, C82m.A08(0S2.A00, 100.0f, A1W ? 1 : 0), A1W ? 1 : 0), A1W ? 1 : 0);
        C2sn A0L = 7zR.A0L(c2k5);
        InterfaceC07034in interfaceC07034in = InterfaceC07034in.A01;
        C07004ik A00 = C06984ii.A00();
        A00.A00(interfaceC07034in);
        ((C07014il) A00).A09 = new Object();
        5BH A0N = 7zO.A0N(A0L);
        Uri uri = null;
        try {
            uri = C0A2.A03(this.A00);
        } catch (SecurityException unused) {
        }
        A0N.A2X(uri);
        A0N.A10(100.0f);
        A0N.A0m(100.0f);
        C06984ii.A01(A0N, A00);
        A0N.A2b(A01);
        7zU.A1A(A0N, A0L);
        return C2so.A02(A0L, c2k5, A0S);
    }
}
