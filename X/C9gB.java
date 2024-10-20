package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.9gB, reason: invalid class name */
/* loaded from: 9gB.class */
public final class C9gB {
    public FbUserSession A00;
    public 9Hw A01;
    public String A02;
    public 9I3 A03;
    public final C9kj A04;
    public final Context A05;
    public final C2xg A06;
    public final 9Wz A07;

    public C9gB(Context context, C2xg c2xg) {
        11T.A0F(c2xg, 2);
        this.A05 = context;
        this.A06 = c2xg;
        this.A07 = new 9Wz(this);
        this.A04 = new C9kj();
    }

    public static final 9I3 A00(C9gB c9gB) {
        String str;
        9I3 r302 = c9gB.A03;
        if (r302 == null) {
            String str2 = c9gB.A02;
            if (str2 == null) {
                str = "registry";
            } else {
                String str3 = str2.equals(1BJ.A00(446)) ? "Highlights" : "SeeAll";
                Context context = c9gB.A05;
                9Wz r0 = c9gB.A07;
                C2xg c2xg = c9gB.A06;
                FbUserSession fbUserSession = c9gB.A00;
                if (fbUserSession == null) {
                    str = "fbUserSession";
                } else {
                    r302 = new 9I3((9Gg) C1Y6.A00(context, "com_facebook_messaging_contactstab_plugins_interfaces_loader_ContactsTabLoaderInterfaceSpec", str3, new Object[]{r0, c2xg, fbUserSession}));
                    c9gB.A03 = r302;
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
        return r302;
    }
}
