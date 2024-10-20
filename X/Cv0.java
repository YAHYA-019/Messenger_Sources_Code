package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import com.facebook.messaging.dialog.MenuDialogItem;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Cv0.class */
public final class Cv0 implements 6Ge {
    public final 6G6 A02;
    public final C00i A01 = 1BQ.A02(32769);
    public final C00i A00 = 1BQ.A02(49420);

    public Cv0(6G6 r302) {
        this.A02 = r302;
    }

    public MenuDialogItem AJY(Context context, Parcelable parcelable, Message message, String str) {
        C9g5 A0c = AbF.A0c();
        A0c.A02 = BNO.A0R.id;
        A0c.A06 = "view_photo";
        A0c.A05 = context.getResources().getQuantityString(2131820644, ((C12114ys) this.A00.get()).A07(message));
        return new MenuDialogItem(A0c);
    }

    public String AaH() {
        return "CLick on Menu Item: Image view fullscreen";
    }

    public boolean C6Z(Context context, View view, 06Z r304, MenuDialogItem menuDialogItem, Message message, ThreadSummary threadSummary, 64W r308, 63D r309, MigColorScheme migColorScheme, boolean z) {
        this.A02.CVq(message);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003e, code lost:
    
        if (((X.C12114ys) r301.A00.get()).A0G(r304) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean Cyd(android.content.Context r302, android.os.Parcelable r303, com.facebook.messaging.model.messages.Message r304, com.facebook.messaging.model.threads.ThreadSummary r305, com.facebook.xapp.messaging.capability.vector.Capabilities r306, boolean r307) {
        /*
            r301 = this;
            r0 = r307
            if (r0 == 0) goto L41
            r0 = r301
            X.00i r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.3oY r0 = (X.C00653oY) r0
            r1 = r304
            X.5ak r0 = X.C00653oY.A00(r0, r1)
            r308 = r0
            X.5ak r0 = X.C5ak.PHOTOS
            r309 = r0
            r0 = r308
            r1 = r309
            if (r0 != r1) goto L41
            r0 = r301
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.4ys r0 = (X.C12114ys) r0
            r309 = r0
            r0 = r309
            r1 = r304
            boolean r0 = r0.A0G(r1)
            r310 = r0
            r0 = 1
            r311 = r0
            r0 = r310
            if (r0 == 0) goto L47
        L41:
            r0 = 0
            r311 = r0
            r0 = 0
            r309 = r0
        L47:
            r0 = r311
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cv0.Cyd(android.content.Context, android.os.Parcelable, com.facebook.messaging.model.messages.Message, com.facebook.messaging.model.threads.ThreadSummary, com.facebook.xapp.messaging.capability.vector.Capabilities, boolean):boolean");
    }
}
