package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.smartcapture.logging.SCEventNames;
import java.lang.reflect.Field;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: Kqw.class */
public final class Kqw {
    public int A00;
    public Choreographer A01;
    public GestureDetector A02;
    public Kkb A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final int A07;
    public final Context A08;
    public final Handler A09;
    public final 3zY A0A;
    public final QuickPerformanceLogger A0B;
    public final InterfaceC03913za A0C;
    public final Set A0D;
    public final boolean A0E;

    /* JADX WARN: Type inference failed for: r0v26, types: [X.Kkb, java.lang.Object] */
    public Kqw(Context context, Handler handler, 3zY r304, QuickPerformanceLogger quickPerformanceLogger, InterfaceC03913za interfaceC03913za, int i, boolean z, boolean z2) {
        Throwable th;
        7zR.A1O(handler, quickPerformanceLogger);
        this.A08 = context;
        this.A09 = handler;
        this.A0B = quickPerformanceLogger;
        this.A07 = i;
        this.A04 = z;
        this.A0E = z2;
        this.A0A = r304;
        this.A0C = interfaceC03913za;
        Choreographer choreographer = Choreographer.getInstance();
        11T.A0A(choreographer);
        this.A01 = choreographer;
        this.A0D = AnonymousClass001.A0v();
        if (this.A04) {
            this.A02 = new GestureDetector(this.A08, (GestureDetector.OnGestureListener) new GTm(this, 14));
            ?? obj = new Object();
            this.A03 = obj;
            try {
                try {
                    Field declaredField = Looper.class.getDeclaredField("mQueue");
                    declaredField.setAccessible(true);
                    Field declaredField2 = MessageQueue.class.getDeclaredField("mMessages");
                    obj.A01 = declaredField2;
                    if (declaredField2 != null) {
                        declaredField2.setAccessible(true);
                    }
                    Field declaredField3 = Message.class.getDeclaredField(SCEventNames.Params.STEP_CHANGE_NEXT);
                    obj.A02 = declaredField3;
                    if (declaredField3 != null) {
                        declaredField3.setAccessible(true);
                    }
                    Object obj2 = declaredField.get(Looper.getMainLooper());
                    11T.A0I(obj2, "null cannot be cast to non-null type android.os.MessageQueue");
                    MessageQueue messageQueue = (MessageQueue) obj2;
                    obj.A00 = messageQueue;
                    if (messageQueue == null) {
                        throw new Exception("Could not obtain main message queue");
                    }
                    obj.A03 = true;
                } catch (IllegalAccessException e) {
                    new Exception("Cannot initialize MainLooperSpy", e);
                    throw th;
                } catch (NoSuchFieldException e2) {
                    new Exception("Cannot initialize MainLooperSpy", e2);
                    throw th;
                }
            } catch (KQK unused) {
                this.A04 = false;
            }
        }
    }

    public void A00(MotionEvent motionEvent) {
        int i;
        String str;
        if (this.A05) {
            if (this.A04) {
                this.A06 = false;
                GestureDetector gestureDetector = this.A02;
                if (gestureDetector != null) {
                    gestureDetector.onTouchEvent(motionEvent);
                }
            }
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                int i2 = this.A00;
                this.A00 = i2 + 1;
                QuickPerformanceLogger quickPerformanceLogger = this.A0B;
                long currentMonotonicTimestamp = quickPerformanceLogger.currentMonotonicTimestamp();
                long uptimeMillis = SystemClock.uptimeMillis() - motionEvent.getEventTime();
                boolean z = this.A06;
                int i3 = this.A07;
                quickPerformanceLogger.markerStart(i3, i2, currentMonotonicTimestamp - uptimeMillis, TimeUnit.MILLISECONDS);
                if (!this.A0E || quickPerformanceLogger.isMarkerOn(i3, i2)) {
                    3zY r0 = this.A0A;
                    if (r0 != null) {
                        3zX r02 = r0.A00;
                        C00i c00i = r02.A04.A00;
                        1BK.A0V(c00i).markerAnnotate(i3, i2, AnonymousClass000.A00(34), 3zX.A00(r02).A02());
                        1BK.A0V(c00i).markerAnnotate(i3, i2, "surface", 3zX.A00(r02).A02());
                        str = "unknown";
                        1BK.A0V(c00i).markerAnnotate(i3, i2, 1BJ.A00(49), 3zX.A00(r02).A00().isPresent() ? 3zX.A00(r02).A00().get().toString() : str);
                        1BK.A0V(c00i).markerAnnotate(i3, i2, ErrorReportingConstants.ENDPOINT, 3zX.A00(r02).A00().isPresent() ? 3zX.A00(r02).A00().get().toString() : "unknown");
                    }
                    quickPerformanceLogger.markerPoint(i3, i2, "touch_delivered");
                    quickPerformanceLogger.markerAnnotate(i3, i2, "ontouch_delay", uptimeMillis);
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action == 1) {
                            i = 315;
                        }
                        this.A01.postFrameCallback(new LJv(this, new Lp0(this, i2), i2, z));
                    }
                    i = 314;
                    quickPerformanceLogger.markerAnnotate(i3, i2, "touch_phase", AbstractC00603o4.A00(i));
                    this.A01.postFrameCallback(new LJv(this, new Lp0(this, i2), i2, z));
                }
            }
        }
    }
}
