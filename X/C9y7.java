package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import com.facebook.messaging.dialog.MenuDialogItem;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.sharedalbum.model.SharedAlbumArgs;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.List;

/* renamed from: X.9y7, reason: invalid class name */
/* loaded from: 9y7.class */
public final class C9y7 implements 6Ge {
    public final 1Br A00;
    public final 1Br A01 = 7zM.A0U();
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1De A05;

    public C9y7(1De r302) {
        this.A05 = r302;
        1BY r0 = r302.A00;
        this.A00 = 1Bu.A03(r0, 81928);
        this.A04 = 1Bu.A03(r0, 68431);
        this.A03 = 1Bu.A03(r0, 68433);
        this.A02 = 1Bu.A03(r0, 67786);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.9g5] */
    public MenuDialogItem AJY(Context context, Parcelable parcelable, Message message, String str) {
        ?? obj = new Object();
        obj.A02 = BNO.A0I.id;
        obj.A04 = parcelable;
        obj.A03 = 2131955642;
        C9g5.A00(C1u3.A6a, 7zP.A0S(this.A01), obj);
        obj.A06 = "delete_album";
        return new MenuDialogItem((C9g5) obj);
    }

    public String AaH() {
        return "CLick on Menu Item: Delete album";
    }

    public boolean C6Z(Context context, View view, 06Z r304, MenuDialogItem menuDialogItem, Message message, ThreadSummary threadSummary, 64W r308, 63D r309, MigColorScheme migColorScheme, boolean z) {
        6Ay BCm;
        7ZM A0w;
        6BJ A0z;
        boolean z2 = false;
        4YV.A1M(context, 0, message);
        7zU.A1Q((C3E) 1Br.A0B(this.A00), BNO.A0I);
        ThreadKey threadKey = message.A0V;
        if (threadKey != null) {
            5Pm r0 = message.A08;
            if (r0 != null && (BCm = r0.BCm()) != null && (A0w = BCm.A0w()) != null && (A0z = A0w.A0z()) != null) {
                String A0o = A0z.A0o();
                String BEQ = A0z.BEQ();
                if (BEQ != null && A0o != null && view != null) {
                    SharedAlbumArgs sharedAlbumArgs = new SharedAlbumArgs(threadKey, 0S2.A01, A0o, Long.parseLong(BEQ));
                    C9c5 c9c5 = new C9c5(view, sharedAlbumArgs);
                    9nJ.A05(C98N.ALBUM_VIEWER_GRID, threadKey, 7zQ.A0j(this.A03), "menu_option_delete", "click", (List) null, sharedAlbumArgs.A00);
                    c9c5.A01(4YU.A08(view), 4YV.A0E(context), new AKW(view, this, 34));
                }
            }
            z2 = true;
        }
        return z2;
    }

    public boolean Cyd(Context context, Parcelable parcelable, Message message, ThreadSummary threadSummary, Capabilities capabilities, boolean z) {
        C1q8 A04;
        11T.A0F(message, 1);
        boolean z2 = false;
        if (!z && (A04 = message.A04()) != C1q8.A0M && A04 != C1q8.A0A && C1q7.A0o(message)) {
            9RP r0 = (9RP) 1Br.A0B(this.A04);
            ThreadKey threadKey = message.A0V;
            if (threadKey != null && ((C6jQ) 1Br.A0B(r0.A01)).A01(threadKey, threadSummary)) {
                z2 = true;
            }
        }
        return z2;
    }
}
