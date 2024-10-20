package X;

import android.content.Context;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.threadview.environment.contextmenu.menuitem.forward.ForwardMenuItemExtraData;

/* renamed from: X.9yv, reason: invalid class name */
/* loaded from: 9yv.class */
public final class C9yv implements AYN {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Message A01;
    public final /* synthetic */ 9yC A02;
    public final /* synthetic */ ForwardMenuItemExtraData A03;

    public C9yv(Context context, Message message, 9yC r304, ForwardMenuItemExtraData forwardMenuItemExtraData) {
        this.A02 = r304;
        this.A00 = context;
        this.A03 = forwardMenuItemExtraData;
        this.A01 = message;
    }

    public void CLA() {
        9yC r0 = this.A02;
        9yC.A00(this.A00, this.A01, r0, this.A03);
    }
}
