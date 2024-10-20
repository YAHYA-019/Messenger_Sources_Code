package X;

import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.onetrace.OneTraceInfo;
import com.facebook.push.constants.PushProperty;

/* loaded from: DA0.class */
public final class DA0 implements Runnable {
    public static final String __redex_internal_original_name = "CacheServiceHandler$1";
    public final /* synthetic */ B8G A00;
    public final /* synthetic */ Message A01;
    public final /* synthetic */ ThreadSummary A02;
    public final /* synthetic */ OneTraceInfo A03;
    public final /* synthetic */ PushProperty A04;

    public DA0(B8G b8g, Message message, ThreadSummary threadSummary, OneTraceInfo oneTraceInfo, PushProperty pushProperty) {
        this.A00 = b8g;
        this.A02 = threadSummary;
        this.A01 = message;
        this.A04 = pushProperty;
        this.A03 = oneTraceInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        CQF cqf = (CQF) this.A00.A0A.get();
        ThreadSummary threadSummary = this.A02;
        cqf.A06(this.A01, threadSummary, this.A03, this.A04);
    }
}
