package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import com.facebook.messaging.dialog.MenuDialogItem;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;

/* loaded from: Cv4.class */
public final class Cv4 implements 6Ge {
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1De A05;
    public final 1Br A00 = 1Bq.A00(49847);
    public final 1Br A04 = 7zM.A0U();

    public Cv4(1De r302) {
        this.A05 = r302;
        1BY r0 = r302.A00;
        this.A01 = 1Bu.A03(r0, 67800);
        this.A03 = 1Bu.A03(r0, 82019);
        this.A02 = 1Bu.A03(r0, 82654);
    }

    public MenuDialogItem AJY(Context context, Parcelable parcelable, Message message, String str) {
        C9g5 A0c = AbF.A0c();
        A0c.A02 = BNO.A0Y.id;
        A0c.A03 = 2131959595;
        AbF.A1O(C1u3.A0v, 7zP.A0S(this.A04), A0c);
        return AbK.A0W(A0c, 4YT.A00(1419));
    }

    public String AaH() {
        return "CLick on Menu Item: Remove Favorite sticker";
    }

    public boolean C6Z(Context context, View view, 06Z r304, MenuDialogItem menuDialogItem, Message message, ThreadSummary threadSummary, 64W r308, 63D r309, MigColorScheme migColorScheme, boolean z) {
        11T.A0G(context, 0, r304);
        7zT.A11(3, r309, r308, menuDialogItem, threadSummary);
        7zP.A1M(message, 7, migColorScheme);
        1Br A01 = 1Bu.A01(context, 67784);
        String str = message.A1m;
        if (str == null || view == null) {
            return true;
        }
        ((Hs7) 1Br.A0B(this.A03)).A01(new D2G(1, context, view, A01, this, migColorScheme), str, false);
        return true;
    }

    public boolean Cyd(Context context, Parcelable parcelable, Message message, ThreadSummary threadSummary, Capabilities capabilities, boolean z) {
        1BK.A1K(message, 1, capabilities);
        ImmutableList immutableList = C1q7.A07;
        String str = message.A1m;
        boolean z2 = false;
        if (AnonymousClass001.A1T(str) && C1q7.A08(message)) {
            ImmutableList immutableList2 = message.A0r;
            if (4YU.A0T(immutableList2, 0).A04 == 48P.A0B && !6Bl.A05(str) && 5qJ.A00((5qJ) 1Br.A0B(this.A00), message.A13) == null && 4YU.A1Y(capabilities, 3)) {
                1Br.A0C(this.A01);
                11T.A0F(String.valueOf(4YU.A0T(immutableList2, 0).A03), 0);
                if (!r0.equals(4YT.A00(46))) {
                    z2 = true;
                }
            }
        }
        return z2;
    }
}
