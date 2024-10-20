package X;

import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.events.common.threadview.OnThreadOpened;
import com.facebook.xapp.messaging.events.common.threadview.OnThreadVisible;
import com.facebook.xapp.messaging.events.common.threadview.OnUnreadMessageDetected;
import java.util.concurrent.TimeUnit;

/* renamed from: X.83s, reason: invalid class name */
/* loaded from: 83s.class */
public final class C83s implements 1Vf {
    public LiveData A00;
    public ThreadSummary A01;
    public Runnable A03;
    public final Context A04;
    public final 1Br A08;
    public volatile boolean A0A;
    public final 1Br A09 = 1Bq.A00(33215);
    public final 1Br A07 = 1BK.A0C();
    public final Observer A06 = new C9qq(this, 78);
    public final Handler A05 = AnonymousClass001.A07();
    public 5SW A02 = 5SW.A1M;

    public C83s(Context context) {
        this.A04 = context;
        this.A08 = 1Bu.A01(context, 17010);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0012. Please report as an issue. */
    public void BQC(1Q5 r302, 1Vp r303, String str) {
        boolean A1X = 1BL.A1X(r302, str);
        switch (str.hashCode()) {
            case -1787492718:
                if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadClosed")) {
                    this.A0A = false;
                    Runnable runnable = this.A03;
                    if (runnable != null) {
                        this.A05.removeCallbacks(runnable);
                    }
                    this.A03 = null;
                    return;
                }
                throw 4YV.A0f(str);
            case -1656437506:
                if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnUnreadMessageDetected")) {
                    OnUnreadMessageDetected onUnreadMessageDetected = (OnUnreadMessageDetected) r302;
                    11T.A0F(onUnreadMessageDetected, 0);
                    ThreadKey threadKey = onUnreadMessageDetected.A00;
                    if ((threadKey.A0z() || threadKey.A1L()) && ((2Ph) 1Br.A0B(this.A08)).A0F(this.A01)) {
                        Context context = this.A04;
                        if (1XU.A00(context) || this.A02 != 5SW.A1u) {
                            return;
                        }
                        ((2ZM) 1Br.A0B(this.A09)).A04(context, "452133094115684");
                        return;
                    }
                    return;
                }
                throw 4YV.A0f(str);
            case -1440551537:
                if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadOpened")) {
                    OnThreadOpened onThreadOpened = (OnThreadOpened) r302;
                    11T.A0F(onThreadOpened, 0);
                    5SW r305 = (5SW) onThreadOpened.A01.A01((String) null, 5SW.class);
                    if (r305 == null) {
                        r305 = 5SW.A1M;
                    }
                    this.A02 = r305;
                    if (r305 == 5SW.A04 || r305 == 5SW.A1u || r305 == 5SW.A1Z || r305 == 5SW.A1G) {
                        this.A0A = A1X;
                        if (this.A03 == null) {
                            Runnable runnable2 = new Runnable() { // from class: X.85g
                                public static final String __redex_internal_original_name = "ReciprocityThreadviewRapidFeedbackSurveyOpenHandler$onThreadOpened$1";

                                @Override // java.lang.Runnable
                                public final void run() {
                                    C83s c83s = C83s.this;
                                    if (c83s.A0A) {
                                        ((2ZM) 1Br.A0B(c83s.A09)).A04(c83s.A04, "1001751448324580");
                                    }
                                }
                            };
                            this.A03 = runnable2;
                            this.A05.postDelayed(runnable2, TimeUnit.SECONDS.toMillis((long) 1Br.A07(this.A07).Ai7(37170592599966456L)));
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw 4YV.A0f(str);
            case -381575838:
                if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadNoLongerVisible")) {
                    LiveData liveData = this.A00;
                    if (liveData != null) {
                        liveData.removeObserver(this.A06);
                    }
                    this.A00 = null;
                    this.A01 = null;
                    return;
                }
                throw 4YV.A0f(str);
            case 22507532:
                if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadVisible")) {
                    OnThreadVisible onThreadVisible = (OnThreadVisible) r302;
                    11T.A0F(onThreadVisible, 0);
                    ThreadKey threadKey2 = onThreadVisible.A00;
                    if (threadKey2.A0z() || threadKey2.A1L()) {
                        LiveData ASY = ((C5xl) 1Bi.A03(67528)).ASY(threadKey2);
                        this.A00 = ASY;
                        if (ASY != null) {
                            ASY.observeForever(this.A06);
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw 4YV.A0f(str);
            default:
                throw 4YV.A0f(str);
        }
    }
}
