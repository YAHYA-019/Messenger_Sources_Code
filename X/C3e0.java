package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.zero.common.ZeroToken;
import java.util.List;

/* renamed from: X.3e0, reason: invalid class name */
/* loaded from: 3e0.class */
public final class C3e0 implements 1K9 {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ 1QE A01;
    public final /* synthetic */ 2BV A02;
    public final /* synthetic */ 45G A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public C3e0(FbUserSession fbUserSession, 1QE r303, 2BV r304, 45G r305, String str, boolean z) {
        this.A02 = r304;
        this.A00 = fbUserSession;
        this.A01 = r303;
        this.A04 = str;
        this.A05 = z;
        this.A03 = r305;
    }

    public void onFailure(Throwable th) {
        0fH.A0p("TAG", "Token or API fetch failed with exception %s", th);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        for (Object obj2 : (List) obj) {
            if (obj2 != null) {
                if (obj2 instanceof ZeroToken) {
                    this.A02.A04(this.A00, (ZeroToken) obj2, this.A01, this.A03, this.A04, this.A05);
                } else if (2JX.A0A(1941756801, obj2)) {
                    2BV.A00((2JX) obj2, this.A01, this.A02);
                } else if (2JX.A0A(2070086565, obj2)) {
                    2BV.A01((2JX) obj2, this.A02);
                }
            }
        }
    }
}
