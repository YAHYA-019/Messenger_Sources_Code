package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;

/* renamed from: X.3Qo, reason: invalid class name */
/* loaded from: 3Qo.class */
public final class C3Qo {
    public 3Jp A00;
    public final C00i A01;

    public C3Qo(FbUserSession fbUserSession) {
        Integer num = 1Lo.A05;
        this.A01 = new 1MV(fbUserSession, (1BY) null, 84501);
    }

    public static final C3Qo A00(Object obj) {
        return new C3Qo((FbUserSession) obj);
    }

    public 3Jp A01() {
        3Jp r302 = this.A00;
        if (r302 == null) {
            r302 = new 3Jp((3Iv) C1Y6.A00(FbInjector.A00(), "com_facebook_messaging_virtualfolders_plugins_interfaces_webservicehandler_VirtualFolderWebServiceHandlerSpec", "All", new Object[]{this.A01.get()}));
            this.A00 = r302;
        }
        return r302;
    }
}
