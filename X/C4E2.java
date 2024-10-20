package X;

import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.user.model.User;
import com.google.common.base.Objects;

/* renamed from: X.4E2, reason: invalid class name */
/* loaded from: 4E2.class */
public final class C4E2 implements 1Ey, 23H {
    public User A00;
    public ViewerContext A01;
    public final 1Br A02 = 1Bu.A00(67474);
    public final 1Br A03 = 1Bu.A00(67475);

    public final User A00() {
        String string;
        User user = this.A00;
        if (user == null) {
            ViewerContext Aue = Aue();
            if (11T.A0O(Aue, ViewerContext.A01)) {
                return null;
            }
            C9f1 c9f1 = (C9f1) 1Br.A0B(this.A03);
            String str = Aue.mUserId;
            11T.A0A(str);
            1Fi A00 = C9f1.A00(c9f1, str);
            if (A00 == null || (string = A00.getString(ErrorReportingConstants.USER_ID_KEY, (String) null)) == null || string.length() == 0) {
                return null;
            }
            1Kh r0 = new 1Kh();
            r0.A02(1Js.A07, string);
            user = new User(r0);
            this.A00 = user;
        }
        return user;
    }

    public ViewerContext Aue() {
        ViewerContext viewerContext = this.A01;
        if (viewerContext == null) {
            String string = ((1Fi) ((C4E3) this.A02.A00.get()).A01.getValue()).getString("rcs_id", (String) null);
            if (string == null || string.length() == 0) {
                viewerContext = ViewerContext.A01;
                11T.A0B(viewerContext);
            } else {
                viewerContext = new ViewerContext(null, "", null, null, null, string, null, false, false, false, false, false, false);
            }
            this.A01 = viewerContext;
        }
        return viewerContext;
    }

    public void CTS(User user) {
        String str;
        1Fi A00;
        User A002 = A00();
        if (A002 == null || !Objects.equal(A002.A0k, user.A0k)) {
            return;
        }
        C9f1 c9f1 = (C9f1) 1Br.A0B(this.A03);
        if (user.A0e == 1Js.A07 && (A00 = C9f1.A00(c9f1, (str = user.A13))) != null) {
            InterfaceC00051a0 AP5 = A00.AP5();
            AP5.AFD();
            AP5.CaK(ErrorReportingConstants.USER_ID_KEY, str);
            AP5.apply();
        }
        this.A00 = user;
    }
}
