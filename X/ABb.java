package X;

import android.graphics.Typeface;
import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.composer.OneLineComposerView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.reactions.MessageReactionsOverlayFragment;
import com.facebook.user.model.User;
import com.google.common.base.Function;

/* loaded from: ABb.class */
public final class ABb implements Function {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ABb(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v56, types: [com.facebook.messaging.reactions.MessageReactionsOverlayFragment, androidx.fragment.app.Fragment] */
    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.A00) {
            case 0:
                OneLineComposerView oneLineComposerView = (OneLineComposerView) this.A01;
                Number number = (Number) this.A02;
                C6g3 c6g3 = (C6g3) obj;
                String str = c6g3.A05;
                return new 9U9(((C1u2) 4YU.A0p(oneLineComposerView.A0L)).A07(c6g3.A01), new A5B(oneLineComposerView, c6g3), str, oneLineComposerView.A00, number.intValue());
            case 1:
                Uri uri = (Uri) obj;
                uri.getClass();
                4tF r0 = (4tF) this.A01;
                Object obj2 = this.A02;
                obj2.getClass();
                uri.getPath().getClass();
                Typeface createFromFile = Typeface.createFromFile(AnonymousClass001.A0E(uri.getPath()));
                r0.A00.put(obj2, createFromFile);
                return createFromFile;
            default:
                ?? r02 = (MessageReactionsOverlayFragment) this.A01;
                CallerContext callerContext = MessageReactionsOverlayFragment.A0g;
                6Qx r03 = (6Qx) r02.A0R.get();
                ThreadKey threadKey = (ThreadKey) this.A02;
                ThreadSummary threadSummary = r02.A07;
                return Boolean.valueOf(r03.A02(r02.getParentFragmentManager(), threadKey, threadSummary, (User) obj));
        }
    }
}
