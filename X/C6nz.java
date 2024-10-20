package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.orca.threadview.events.OnNewLoaderResult;
import com.facebook.xapp.messaging.events.common.threadview.OnThreadOpened;

/* renamed from: X.6nz, reason: invalid class name */
/* loaded from: 6nz.class */
public final class C6nz implements 1Vf {
    public ThreadKey A00;
    public ThreadSummary A01;
    public final 1Br A02;
    public final Context A03;

    public C6nz(Context context) {
        this.A03 = context;
        this.A02 = 1Bu.A01(context, 65937);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void BQC(1Q5 r302, 1Vp r303, String str) {
        ThreadKey threadKey;
        11T.A0F(r302, 0);
        11T.A0F(str, 1);
        switch (str.hashCode()) {
            case -1976370007:
                if (str.equals("com.facebook.orca.threadview.events.OnNewLoaderResult")) {
                    OnNewLoaderResult onNewLoaderResult = (OnNewLoaderResult) r302;
                    11T.A0F(onNewLoaderResult, 0);
                    this.A01 = onNewLoaderResult.A00.A03;
                    return;
                }
                throw 4YV.A0f(str);
            case -1787492718:
                if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadClosed")) {
                    threadKey = null;
                    this.A01 = null;
                    break;
                }
                throw 4YV.A0f(str);
            case -1440551537:
                if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadOpened")) {
                    OnThreadOpened onThreadOpened = (OnThreadOpened) r302;
                    11T.A0F(onThreadOpened, 0);
                    threadKey = onThreadOpened.A00;
                    break;
                }
                throw 4YV.A0f(str);
            case 1941448808:
                if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnMessageListDataRendered")) {
                    ThreadKey threadKey2 = this.A00;
                    if (threadKey2 != null) {
                        ((C6jQ) this.A02.A00.get()).A01(threadKey2, this.A01);
                        return;
                    }
                    return;
                }
                throw 4YV.A0f(str);
            default:
                throw 4YV.A0f(str);
        }
        this.A00 = threadKey;
    }
}
