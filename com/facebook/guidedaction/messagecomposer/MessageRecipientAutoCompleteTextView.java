package com.facebook.guidedaction.messagecomposer;

import X.1BY;
import X.1Bn;
import X.C1364Af7;
import X.FWn;
import X.FYO;
import X.QxR;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.resources.ui.FbAutoCompleteTextView;

/* loaded from: MessageRecipientAutoCompleteTextView.class */
public class MessageRecipientAutoCompleteTextView extends FbAutoCompleteTextView {
    public C1364Af7 A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.QxR] */
    public MessageRecipientAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = (C1364Af7) 1Bn.A0E(context, (1BY) null, 84824);
        ?? obj = new Object();
        ((QxR) obj).A00 = this;
        setOnItemClickListener(new FYO((Object) obj, 2));
        FWn.A00(this, (Object) obj, 2);
        setAdapter(this.A00);
    }
}
