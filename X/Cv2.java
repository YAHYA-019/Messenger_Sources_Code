package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import com.facebook.messaging.dialog.MenuDialogItem;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Cv2.class */
public final class Cv2 implements 6Ge {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 6GB A03;

    public Cv2(6GB r302) {
        11T.A0F(r302, 1);
        this.A03 = r302;
        this.A01 = 1Bu.A00(81928);
        this.A00 = 1Bq.A00(49847);
        this.A02 = 7zM.A0U();
    }

    public MenuDialogItem AJY(Context context, Parcelable parcelable, Message message, String str) {
        C9g5 A0c = AbF.A0c();
        A0c.A02 = BNO.A0u.id;
        A0c.A03 = 2131959614;
        AbF.A1O(C1u3.A2h, 7zP.A0S(this.A02), A0c);
        return AbK.A0W(A0c, "view_pack");
    }

    public String AaH() {
        return "CLick on Menu Item: View sticker pack";
    }

    public boolean C6Z(Context context, View view, 06Z r304, MenuDialogItem menuDialogItem, Message message, ThreadSummary threadSummary, 64W r308, 63D r309, MigColorScheme migColorScheme, boolean z) {
        11T.A0F(message, 7);
        ((C3E) 1Br.A0B(this.A01)).A00(BNO.A0u.name());
        this.A03.D92(message.A1m, true);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005f, code lost:
    
        if (X.4YU.A1Y(r306, 3) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean Cyd(android.content.Context r302, android.os.Parcelable r303, com.facebook.messaging.model.messages.Message r304, com.facebook.messaging.model.threads.ThreadSummary r305, com.facebook.xapp.messaging.capability.vector.Capabilities r306, boolean r307) {
        /*
            r301 = this;
            r0 = 1
            r308 = r0
            r0 = r304
            r1 = r308
            r2 = r306
            X.1BK.A1K(r0, r1, r2)
            com.google.common.collect.ImmutableList r0 = X.C1q7.A07
            r309 = r0
            r0 = r304
            java.lang.String r0 = r0.A1m
            r310 = r0
            r0 = r310
            if (r0 == 0) goto L62
            r0 = r304
            boolean r0 = X.C1q7.A0N(r0)
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L62
            r0 = r310
            boolean r0 = X.6Bl.A05(r0)
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L62
            r0 = r301
            X.1Br r0 = r0.A00
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.5qJ r0 = (X.5qJ) r0
            r310 = r0
            r0 = r304
            com.google.common.collect.ImmutableMap r0 = r0.A13
            r309 = r0
            r0 = r310
            r1 = r309
            java.lang.String r0 = X.5qJ.A00(r0, r1)
            r309 = r0
            r0 = r309
            if (r0 != 0) goto L62
            r0 = r306
            r1 = 3
            boolean r0 = X.4YU.A1Y(r0, r1)
            r308 = r0
            r0 = 1
            r311 = r0
            r0 = r308
            if (r0 != 0) goto L68
        L62:
            r0 = 0
            r311 = r0
            r0 = 0
            r310 = r0
        L68:
            r0 = r311
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cv2.Cyd(android.content.Context, android.os.Parcelable, com.facebook.messaging.model.messages.Message, com.facebook.messaging.model.threads.ThreadSummary, com.facebook.xapp.messaging.capability.vector.Capabilities, boolean):boolean");
    }
}
