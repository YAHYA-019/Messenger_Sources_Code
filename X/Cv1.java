package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.dialog.MenuDialogItem;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Cv1.class */
public final class Cv1 implements 6Ge {
    public 1BY A00;
    public final C00i A01 = 7zN.A0D(67783);
    public final C00i A03 = 1BQ.A02(85048);
    public final C00i A02 = AbH.A0Y();

    public Cv1(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public MenuDialogItem AJY(Context context, Parcelable parcelable, Message message, String str) {
        C9g5 A0c = AbF.A0c();
        A0c.A02 = BNO.A0c.id;
        A0c.A03 = 2131959794;
        return AbG.A0i(A0c, "retry");
    }

    public String AaH() {
        return "CLick on Menu Item: Retry";
    }

    public boolean C6Z(Context context, View view, 06Z r304, MenuDialogItem menuDialogItem, Message message, ThreadSummary threadSummary, 64W r308, 63D r309, MigColorScheme migColorScheme, boolean z) {
        FbUserSession A0F = 1BL.A0F();
        String str = message.A1g;
        if (str == null) {
            if (view == null) {
                return true;
            }
            KXg.A00(view, 4YU.A0t(view.getResources(), 2131967253), -1).A02();
            return true;
        }
        4YU.A0Q(this.A03).A0g(str);
        ((C6fm) this.A01.get()).A00(message.A0V).AQd(message);
        ((C5Pr) 1Lo.A04((Context) null, A0F, this.A00, 49712)).A0K(message, 7lX.A00(threadSummary));
        ((C45d) this.A02.get()).A0G(message);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r304.A08().A02.shouldNotBeRetried != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean Cyd(android.content.Context r302, android.os.Parcelable r303, com.facebook.messaging.model.messages.Message r304, com.facebook.messaging.model.threads.ThreadSummary r305, com.facebook.xapp.messaging.capability.vector.Capabilities r306, boolean r307) {
        /*
            r301 = this;
            r0 = r307
            if (r0 == 0) goto L1d
            r0 = r304
            com.facebook.messaging.model.send.SendError r0 = r0.A08()
            X.5PN r0 = r0.A02
            r308 = r0
            r0 = r308
            boolean r0 = r0.shouldNotBeRetried
            r309 = r0
            r0 = 1
            r310 = r0
            r0 = r309
            if (r0 == 0) goto L23
        L1d:
            r0 = 0
            r310 = r0
            r0 = 0
            r308 = r0
        L23:
            r0 = r310
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cv1.Cyd(android.content.Context, android.os.Parcelable, com.facebook.messaging.model.messages.Message, com.facebook.messaging.model.threads.ThreadSummary, com.facebook.xapp.messaging.capability.vector.Capabilities, boolean):boolean");
    }
}
