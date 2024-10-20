package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.msys.thread.wellbeing.plugins.warningcard.processor.WarningCardProcessorMetadataFactoryImplementation;

/* renamed from: X.5oB, reason: invalid class name */
/* loaded from: 5oB.class */
public final class C5oB {
    public WarningCardProcessorMetadataFactoryImplementation A00;
    public Object A01;
    public Object A02;
    public final Context A03;
    public final FbUserSession A04;
    public final ThreadKey A05;
    public final 1YC A06 = 1YC.A03;
    public final Context A07;

    public C5oB(Context context, Context context2, FbUserSession fbUserSession, ThreadKey threadKey) {
        this.A07 = context;
        this.A03 = context2;
        this.A04 = fbUserSession;
        this.A05 = threadKey;
    }
}
