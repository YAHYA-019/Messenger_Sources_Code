package com.facebook.ui.browser.clickidconfig;

import X.1BL;
import X.1BQ;
import X.1BV;
import X.5Fo;
import X.5Fp;
import X.C00i;
import X.C3MQ;
import X.KWE;
import com.facebook.browser.lite.util.clickid.ClickIDAppender;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: ClickIDHelper.class */
public final class ClickIDHelper {
    public static final long A05 = TimeUnit.MILLISECONDS.convert(1, TimeUnit.HOURS);
    public final C00i A00 = new 1BV(82297);
    public final C00i A01 = new 1BQ(16385);
    public final 5Fo A03 = new 5Fo(A05);
    public volatile ClickIDAppender A04 = null;
    public final 5Fp A02 = new 5Fp(this);

    public static ClickIDAppender A00(ClickIDHelper clickIDHelper) {
        ClickIDAppender clickIDAppender;
        synchronized (clickIDHelper) {
            if (clickIDHelper.A04 == null) {
                AtomicReference atomicReference = clickIDHelper.A02.A02;
                C3MQ c3mq = (C3MQ) atomicReference.get();
                String[] strArr = c3mq == null ? null : c3mq.A02;
                C3MQ c3mq2 = (C3MQ) atomicReference.get();
                String[] strArr2 = c3mq2 == null ? null : c3mq2.A03;
                if (strArr != null || strArr2 != null) {
                    KWE kwe = ClickIDAppender.Companion;
                    List asList = Arrays.asList(strArr);
                    List asList2 = Arrays.asList(strArr2);
                    1BL.A1F(asList, asList2);
                    clickIDHelper.A04 = new ClickIDAppender(ClickIDAppender.initHybrid0(asList, asList2));
                }
            }
            clickIDAppender = clickIDHelper.A04;
        }
        return clickIDAppender;
    }
}
