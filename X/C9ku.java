package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.9ku, reason: invalid class name */
/* loaded from: 9ku.class */
public final class C9ku {
    public static final List A03 = C0s8.A14(C96b.A03, C96b.A05, C96b.A02);
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;

    public C9ku(Context context, FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 2);
        this.A01 = 1Bu.A01(context, 68891);
        this.A02 = 1Lm.A00(context, fbUserSession, 68884);
        this.A00 = 7zM.A0W();
    }

    public static final 99V A00(99W r301) {
        C97j c97j;
        11T.A0F(r301, 0);
        if (r301.equals(C8tS.A00)) {
            c97j = C97j.A0X;
        } else {
            if (r301.equals(8tT.A00)) {
                return new C8tQ(7zM.A0D("https://www.facebook.com/help/messenger-app/431055522328649?ref=learn_more"));
            }
            if (!r301.equals(8tU.A00)) {
                if (!(r301 instanceof C8tR)) {
                    throw 1BK.A1F();
                }
                int ordinal = ((C8tR) r301).A00.ordinal();
                if (ordinal == 0) {
                    c97j = C97j.A0T;
                } else if (ordinal == 1) {
                    c97j = C97j.A0a;
                } else if (ordinal == 2) {
                    c97j = C97j.A0e;
                } else if (ordinal != 3) {
                    throw 1BK.A1F();
                }
            }
            c97j = C97j.A0Y;
        }
        return new C8tP(c97j);
    }

    public final 99W A01(C96b c96b, boolean z) {
        Set set;
        C00i c00i = this.A02.A00;
        2bX r0 = ((C9c4) c00i.get()).A03;
        if (11T.A0O(r0.getValue(), C8sr.A00) || 11T.A0O(r0.getValue(), C8sq.A00)) {
            1Br.A0C(this.A01);
        }
        if (!z) {
            List list = A03;
            ArrayList A0s = AnonymousClass001.A0s();
            for (Object obj : list) {
                C96b c96b2 = (C96b) obj;
                99P r02 = (99P) ((C9c4) c00i.get()).A03.getValue();
                if ((r02 instanceof C8sp) && (set = ((C8sp) r02).A00) != null && 0QD.A0k(set, c96b2.type)) {
                    A0s.add(obj);
                }
            }
            ArrayList A0s2 = AnonymousClass001.A0s();
            for (Object obj2 : A0s) {
                if (obj2 == C96b.A03) {
                    C1ud A0a = 7zP.A0a(this.A00);
                    if (!7zM.A1a(A0a, C1ud.A00(A0a), 36316426691160056L)) {
                    }
                }
                A0s2.add(obj2);
            }
            if (A0s2.indexOf(c96b) == 0) {
                if (1BK.A1X(((C9c4) c00i.get()).A00(), true) && 7zP.A0a(this.A00).A05()) {
                    return 8tU.A00;
                }
                if (A0s2.size() > 1) {
                    return new C8tR((C96b) A0s2.get(1));
                }
            } else if ((c96b == C96b.A04 && A0s2.size() > 1) || (A0s2.indexOf(c96b) == 1 && A0s2.size() > 2)) {
                return C8tS.A00;
            }
        }
        return 8tT.A00;
    }
}
