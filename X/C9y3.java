package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import com.facebook.messaging.dialog.MenuDialogItem;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.9y3, reason: invalid class name */
/* loaded from: 9y3.class */
public final class C9y3 implements 6Ge {
    public final C00i A01 = 1BV.A00(81928);
    public final C00i A03 = 1BQ.A02(32769);
    public final C00i A00 = 1BQ.A02(49420);
    public final C00i A02 = 1BQ.A02(67074);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.9g5] */
    public MenuDialogItem AJY(Context context, Parcelable parcelable, Message message, String str) {
        ?? obj = new Object();
        obj.A02 = BNO.A0t.id;
        obj.A03 = 2131959613;
        obj.A04 = ((C12114ys) this.A00.get()).A0B(message);
        obj.A06 = "view_video";
        return new MenuDialogItem((C9g5) obj);
    }

    public String AaH() {
        return "CLick on Menu Item: Video view fullscreen";
    }

    public boolean C6Z(Context context, View view, 06Z r304, MenuDialogItem menuDialogItem, Message message, ThreadSummary threadSummary, 64W r308, 63D r309, MigColorScheme migColorScheme, boolean z) {
        7zU.A1Q((C3E) this.A01.get(), BNO.A0t);
        6cL BKT = r309.BKT(message);
        ((6Sp) 1Lo.A06(1BL.A0F(), 50103)).A02(r304, new 9sW(this), message.A0V, BKT, 1BJ.A00(52));
        return true;
    }

    public boolean Cyd(Context context, Parcelable parcelable, Message message, ThreadSummary threadSummary, Capabilities capabilities, boolean z) {
        if (!z || C00653oY.A00((C00653oY) this.A03.get(), message) != C5ak.VIDEO_CLIP) {
            return false;
        }
        this.A02.get();
        return true;
    }
}
