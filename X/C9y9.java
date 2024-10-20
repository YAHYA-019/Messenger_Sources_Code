package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import com.facebook.messaging.attachments.ImageAttachmentData;
import com.facebook.messaging.dialog.MenuDialogItem;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.9y9, reason: invalid class name */
/* loaded from: 9y9.class */
public final class C9y9 implements 6Ge {
    public 1BY A00;
    public final C00i A03 = 1BV.A01((1BY) null, 68706);
    public final C00i A05 = 1BV.A01((1BY) null, 81928);
    public final C00i A02 = 1BQ.A02(50098);
    public final C00i A06 = 1BQ.A02(16839);
    public final C00i A07 = 1BQ.A02(147790);
    public final C00i A04 = 1BQ.A02(16456);
    public final C00i A01 = 1BV.A01((1BY) null, 68079);
    public final C00i A08 = new 1HH((Context) 1Bn.A0E((Context) null, (1BY) null, 83719), 99435);

    public C9y9(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.9g5] */
    public MenuDialogItem AJY(Context context, Parcelable parcelable, Message message, String str) {
        ?? obj = new Object();
        obj.A02 = BNO.A0f.id;
        obj.A03 = 2131959600;
        obj.A01 = ((C1u2) this.A06.get()).A03(C1u3.A2S);
        obj.A04 = parcelable;
        obj.A06 = "save_image";
        obj.A00 = 2132214429;
        return new MenuDialogItem((C9g5) obj);
    }

    public String AaH() {
        return "CLick on Menu Item: Save image";
    }

    public boolean C6Z(Context context, View view, 06Z r304, MenuDialogItem menuDialogItem, Message message, ThreadSummary threadSummary, 64W r308, 63D r309, MigColorScheme migColorScheme, boolean z) {
        this.A07.get();
        C00i c00i = this.A03;
        if (!((CNP) c00i.get()).A03()) {
            F8q.A00(new FEd(2131962122), (F8q) this.A08.get(), true);
            return true;
        }
        7zU.A1Q((C3E) this.A05.get(), BNO.A0f);
        ImageAttachmentData imageAttachmentData = (ImageAttachmentData) menuDialogItem.A03;
        53U B8W = r309.B8W();
        B8W.AHQ(((CNP) c00i.get()).A02(context), new 91K(context, imageAttachmentData, message, this, B8W), 48U.A00);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002d, code lost:
    
        if (X.CNP.A01(r303, r304) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean Cyd(android.content.Context r302, android.os.Parcelable r303, com.facebook.messaging.model.messages.Message r304, com.facebook.messaging.model.threads.ThreadSummary r305, com.facebook.xapp.messaging.capability.vector.Capabilities r306, boolean r307) {
        /*
            r301 = this;
            r0 = r307
            if (r0 != 0) goto L30
            r0 = r303
            boolean r0 = r0 instanceof com.facebook.messaging.attachments.ImageAttachmentData
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L30
            r0 = r301
            X.00i r0 = r0.A03
            r309 = r0
            r0 = r309
            java.lang.Object r0 = r0.get()
            r0 = r303
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r1 = r304
            boolean r0 = X.CNP.A01(r0, r1)
            r310 = r0
            r0 = 1
            r308 = r0
            r0 = r310
            if (r0 != 0) goto L36
        L30:
            r0 = 0
            r308 = r0
            r0 = 0
            r309 = r0
        L36:
            r0 = r308
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9y9.Cyd(android.content.Context, android.os.Parcelable, com.facebook.messaging.model.messages.Message, com.facebook.messaging.model.threads.ThreadSummary, com.facebook.xapp.messaging.capability.vector.Capabilities, boolean):boolean");
    }
}
