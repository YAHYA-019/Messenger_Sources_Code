package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import com.facebook.messaging.dialog.MenuDialogItem;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: Cuy.class */
public final class Cuy implements 6Ge {
    public final int A00;
    public final 7oW A01;

    public Cuy(7oW r302, int i) {
        this.A01 = r302;
        this.A00 = i;
    }

    public MenuDialogItem AJY(Context context, Parcelable parcelable, Message message, String str) {
        7oW r0 = this.A01;
        return r0.A00.A00.AJX(context, parcelable, str, this.A00);
    }

    public String AaH() {
        7oW r0 = this.A01;
        return r0.A00.A00.AaI(this.A00);
    }

    public boolean C6Z(Context context, View view, 06Z r304, MenuDialogItem menuDialogItem, Message message, ThreadSummary threadSummary, 64W r308, 63D r309, MigColorScheme migColorScheme, boolean z) {
        7oW r0 = this.A01;
        return r0.A00.A00.Bod(context, view, r304, menuDialogItem, threadSummary, r308, r309, this.A00);
    }

    public boolean Cyd(Context context, Parcelable parcelable, Message message, ThreadSummary threadSummary, Capabilities capabilities, boolean z) {
        return true;
    }
}
