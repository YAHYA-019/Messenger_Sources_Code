package X;

import androidx.lifecycle.Observer;
import com.facebook.messaging.communitymessaging.plugins.memberlistitem.blockedmemberslistitem.BlockedMembersListItemImplementation;

/* loaded from: FZ3.class */
public final class FZ3 implements Observer {
    public final int A00;
    public final Object A01;
    public final String A02;

    public FZ3(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // androidx.lifecycle.Observer
    public /* bridge */ /* synthetic */ void onChanged(Object obj) {
        GF4 gf4;
        Throwable th;
        switch (this.A00) {
            case 0:
                Boolean bool = (Boolean) obj;
                11T.A0D(bool);
                if (!bool.booleanValue() || (gf4 = ((BlockedMembersListItemImplementation) this.A01).A03) == null) {
                    return;
                }
                gf4.CSC(Long.parseLong(this.A02));
                return;
            case 1:
                FJC fjc = (FJC) obj;
                boolean A0C = FJC.A0C(fjc);
                Fv8 fv8 = (Fv8) this.A01;
                if (!A0C) {
                    ((GIy) fv8.A02).CEX(null, null, new Exception("An unknown error was thrown during the authorization process"));
                    return;
                }
                ((GIy) fv8.A02).CEY(this.A02);
                RQU rqu = QxH.A00;
                if (rqu == null) {
                    rqu = new RQU();
                    QxH.A00 = rqu;
                }
                String str = fv8.A05;
                Object obj2 = fjc.A01;
                obj2.getClass();
                rqu.A00((FGo) obj2, str);
                return;
            default:
                FJC fjc2 = (FJC) obj;
                if (!FJC.A0C(fjc2)) {
                    if (FJC.A0A(fjc2) && (th = fjc2.A02) != null) {
                        if (th instanceof G8D) {
                            Throwable th2 = (G8D) th;
                            ((GIy) ((Fv8) this.A01).A02).CEX(Boolean.valueOf(((G8D) th2).mAuthFactorExpired), Integer.valueOf(((G8D) th2).mNumRemainingAttempts), th2);
                            return;
                        }
                        ((GIy) ((Fv8) this.A01).A02).CEX(null, null, th);
                    }
                    ((GIy) ((Fv8) this.A01).A02).CEX(null, null, new Exception("An unknown error was thrown during the authorization process"));
                    return;
                }
                RQU rqu2 = QxH.A00;
                if (rqu2 == null) {
                    rqu2 = new RQU();
                    QxH.A00 = rqu2;
                }
                Fv8 fv82 = (Fv8) this.A01;
                String str2 = fv82.A05;
                Object obj3 = fjc2.A01;
                obj3.getClass();
                rqu2.A00((FGo) obj3, str2);
                ((GIy) fv82.A02).CEY(this.A02);
                return;
        }
    }
}
