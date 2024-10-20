package X;

import android.content.Context;
import android.view.View;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.messaging.model.messages.MessageDraft;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.service.model.MarkThreadsParams;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.35f, reason: invalid class name */
/* loaded from: 35f.class */
public final class C35f extends 4rX {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C35f(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        if (this.A00 != 0) {
            2gZ r0 = (2gZ) 1Br.A0B(((2gY) this.A03).A01);
            ThreadKey threadKey = (ThreadKey) this.A02;
            MessageDraft messageDraft = (MessageDraft) this.A01;
            if (messageDraft == null) {
                messageDraft = 2gZ.A02;
            }
            r0.A01.schedule(new C3k7(r0, messageDraft, threadKey), 5000L);
            return;
        }
        3M6 r02 = (3M6) this.A01;
        if (r02 == null || !r02.A03) {
            return;
        }
        3M7 r03 = r02.A02;
        6LF r04 = (6LF) 1Br.A0B(r03.A03);
        View view = r02.A01;
        MigColorScheme migColorScheme = (MigColorScheme) 1Br.A0B(r03.A02);
        Context context = r03.A00;
        r04.A01(r02.A00, view, migColorScheme, (KT3) null, 1BK.A0u(context, 2131966901), context.getString(2131966902), -1);
    }

    public void A05(ServiceException serviceException) {
        if (this.A00 == 0) {
            2hE r0 = (2hE) this.A03;
            ((1Uv) 1Br.A0B(r0.A03)).A0B(r0.A00, ((MarkThreadsParams) this.A02).A01, "ArchiveThreadManager");
        } else {
            2gZ r02 = (2gZ) 1Br.A0B(((2gY) this.A03).A01);
            ThreadKey threadKey = (ThreadKey) this.A02;
            MessageDraft messageDraft = (MessageDraft) this.A01;
            if (messageDraft == null) {
                messageDraft = 2gZ.A02;
            }
            r02.A01.schedule(new C3k7(r02, messageDraft, threadKey), 5000L);
        }
    }

    public void A06(Throwable th) {
        if (this.A00 != 0) {
            super/*X.4rY*/.A06(th);
            throw null;
        }
        2hE r0 = (2hE) this.A03;
        ((1Uv) 1Br.A0B(r0.A03)).A0B(r0.A00, ((MarkThreadsParams) this.A02).A01, "ArchiveThreadManager");
    }
}
