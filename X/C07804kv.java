package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.xapp.messaging.threadpre.tltv.logger.ThreadPRETltvLogger;
import kotlin.jvm.functions.Function1;

/* renamed from: X.4kv, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4kv.class */
public final class C07804kv extends ThreadPRETltvLogger {
    public static final C07844l0 A01 = new C07844l0();
    public final Function1 A00;

    public C07804kv(QuickPerformanceLogger quickPerformanceLogger, C6ia c6ia, Function1 function1, int i) {
        super(quickPerformanceLogger, i, c6ia);
        this.A00 = function1;
    }

    @Override // com.facebook.xapp.messaging.threadpre.tltv.logger.ThreadPRETltvLogger
    public boolean getIsMessageListContentFresh() {
        Boolean A00;
        Function1 function1 = this.A00;
        C6ic c6ic = this.threadLoggerType;
        if (function1 != null) {
            A00 = (Boolean) function1.invoke(c6ic);
        } else {
            A00 = C6mn.A00(c6ic);
            if (A00 == null) {
                return true;
            }
        }
        return A00.booleanValue();
    }

    @Override // X.AbstractC07814kx
    public int getQplIdentifier() {
        C6ic c6ic = this.threadLoggerType;
        11T.A0F(c6ic, 0);
        switch (c6ic.ordinal()) {
            case 0:
                return 937177503;
            case 1:
                return 5510864;
            case 2:
                return 231287871;
            case 3:
                return 5510723;
            case 4:
            case 5:
            case 6:
            case 7:
            default:
                return 937177067;
            case 8:
                return 947007092;
            case 9:
                return 937170214;
            case 10:
                return 937167256;
            case 11:
                return 937180488;
        }
    }

    @Override // X.AbstractC07814kx
    public void onAfterLoggingFinished() {
        A01.A00.remove(Integer.valueOf(this.instanceKey));
    }

    @Override // X.AbstractC07814kx
    public void onAfterLoggingStarted(long j) {
        int size = A01.A00.size();
        if (size > 1) {
            addMarkerAnnotate("num_concurrent_instances", Integer.valueOf(size));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v117, types: [X.6ip, X.6ii] */
    /* JADX WARN: Type inference failed for: r0v139, types: [X.6is, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v142, types: [X.6is, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v152, types: [X.6is, java.lang.Object] */
    @Override // X.AbstractC07814kx
    public void onBeforeLoggingStarted() {
        C6ia c6ia = this.preErrorReporter;
        11T.A0F(c6ia, 1);
        C6ih c6ih = new C6ih(this, c6ia);
        attachComponent((C6ik) c6ih.A01.getValue(), false);
        attachComponent((C6ik) c6ih.A00.getValue(), false);
        attachComponent((C6ik) c6ih.A02.getValue(), false);
        this.threadViewLifecycle = c6ih;
        C6ia c6ia2 = this.preErrorReporter;
        11T.A0F(c6ia2, 1);
        C6il c6il = new C6il(this, c6ia2);
        attachComponent((C6ik) c6il.A06.getValue(), false);
        attachComponent((C6ik) c6il.A07.getValue(), true);
        attachComponent((C6ik) c6il.A05.getValue(), false);
        attachComponent((C6ik) c6il.A08.getValue(), false);
        attachComponent((C6ik) c6il.A01.getValue(), false);
        attachComponent((C6ik) c6il.A00.getValue(), false);
        attachComponent((C6ik) c6il.A04.getValue(), false);
        attachComponent((C6ik) c6il.A0D.getValue(), false);
        attachComponent((C6ik) c6il.A0C.getValue(), false);
        attachComponent((C6ik) c6il.A09.getValue(), false);
        attachComponent((C6ik) c6il.A0A.getValue(), false);
        attachComponent((C6ik) c6il.A0B.getValue(), false);
        attachComponent((C6ik) c6il.A0E.getValue(), false);
        attachComponent((C6ik) c6il.A03.getValue(), false);
        attachComponent((C6ik) c6il.A02.getValue(), false);
        this.threadView = c6il;
        C6io c6io = new C6io(this, this.preErrorReporter);
        attachComponent((C6ik) c6io.A00.getValue(), false);
        this.titleBarUI = c6io;
        C6ia c6ia3 = this.preErrorReporter;
        11T.A0F(c6ia3, 2);
        ?? c6ii = new C6ii(this, c6ia3);
        C6ik c6ik = c6ii.A00;
        if (c6ik == null) {
            c6ik = new C6in(c6ii.A00, c6ii.A01, "composer_on_create_layout");
            c6ii.A00 = c6ik;
        }
        attachComponent(c6ik, false);
        this.composer = c6ii;
        C6iq c6iq = new C6iq(this, this.preErrorReporter);
        attachComponent((C6ik) c6iq.A01.getValue(), false);
        attachComponent((C6ik) c6iq.A00.getValue(), false);
        this.threadViewLifecycleListener = c6iq;
        registerListener(new Object());
        registerListener(new Object());
        if (((2yD) 1Bi.A03(16385)).AZk(36318393784414771L)) {
            registerListener(new Object());
        }
    }
}
