package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.92k, reason: invalid class name */
/* loaded from: 92k.class */
public final class C92k extends 8C6 {
    public final /* synthetic */ 7rH A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92k(7rH r302, String str) {
        super(str);
        this.A00 = r302;
    }

    public void onClick(View view) {
        11T.A0F(view, 0);
        super.onClick(view);
        Context context = view.getContext();
        C76 A0Z = 7zR.A0Z();
        11T.A0D(context);
        A0Z.A01(context, 7zM.A0D("https://www.facebook.com/help/messenger-app/2751245661706174?ref=learn_more"), C5id.A0D);
    }
}
