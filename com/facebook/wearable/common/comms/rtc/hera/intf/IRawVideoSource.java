package com.facebook.wearable.common.comms.rtc.hera.intf;

import X.0DR;
import X.11T;
import X.JDb;
import android.view.Surface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: IRawVideoSource.class */
public interface IRawVideoSource extends JDb {

    /* loaded from: IRawVideoSource$FrameOutput.class */
    public final class FrameOutput extends Output {
        public final Function1 onFrame;

        public FrameOutput(Function1 function1) {
            11T.A0F(function1, 1);
            this.onFrame = function1;
        }

        public final Function1 getOnFrame() {
            return this.onFrame;
        }
    }

    /* loaded from: IRawVideoSource$Output.class */
    public abstract class Output {
        public Function2 onOutputParams;

        public final Function2 getOnOutputParams() {
            return this.onOutputParams;
        }

        public final void setOnOutputParams(Function2 function2) {
            this.onOutputParams = function2;
        }

        public final void setOutputParams(Integer num, IVideoSize iVideoSize) {
            Function2 function2 = this.onOutputParams;
            if (function2 != null) {
                function2.invoke(num, iVideoSize);
            }
        }
    }

    /* loaded from: IRawVideoSource$SurfaceOutput.class */
    public final class SurfaceOutput extends Output {
        public Function2 onBitmapFrameListenerAdded;
        public final Surface surface;

        public SurfaceOutput(Surface surface) {
            11T.A0F(surface, 1);
            this.surface = surface;
        }

        public static /* synthetic */ void addBitmapFrameListener$default(SurfaceOutput surfaceOutput, Function1 function1, float f, int i, Object obj) {
            if ((i & 2) != 0) {
                f = 1.0f;
            }
            surfaceOutput.addBitmapFrameListener(function1, f);
        }

        public final void addBitmapFrameListener(Function1 function1, float f) {
            11T.A0F(function1, 0);
            Function2 function2 = this.onBitmapFrameListenerAdded;
            if (function2 != null) {
                function2.invoke(function1, Float.valueOf(f));
            }
        }

        public final Function2 getOnBitmapFrameListenerAdded() {
            return this.onBitmapFrameListenerAdded;
        }

        public final Surface getSurface() {
            return this.surface;
        }

        public final void setOnBitmapFrameListenerAdded(Function2 function2) {
            this.onBitmapFrameListenerAdded = function2;
        }
    }

    void addOutput(Output output);

    Object release(0DR r1);

    void releaseBlocking();

    void removeOutput(Output output);

    Object start(0DR r1);

    void startBlocking();

    Object stop(0DR r1);

    void stopBlocking();
}
