package X;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.facebook.wearable.common.comms.rtc.hera.intf.ISurfaceVideoSink;
import com.facebook.wearable.common.comms.rtc.hera.intf.IVideoSize;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: Il0.class */
public final class Il0 implements ISurfaceVideoSink {
    public Surface A00;
    public SurfaceView A01;
    public IVideoSize A02;
    public Function2 A03;
    public final IJE A04;
    public final Set A05;
    public final Function1 A06;

    public Il0() {
        this(null);
    }

    public Il0(Function1 function1) {
        this.A06 = function1;
        this.A04 = new IJE(this, 3);
        this.A05 = 7zL.A15();
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.ISurfaceVideoSink
    public void addSurfaceListener(Function1 function1) {
        11T.A0F(function1, 0);
        this.A05.add(function1);
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSink
    public Function2 getOnSinkParamsChanged() {
        return this.A03;
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSink
    public IVideoSize getSinkSize() {
        return this.A02;
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.ISurfaceVideoSink
    public Surface getSurface() {
        return this.A00;
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSink
    public void notifySourceSizeChanged(int i, int i2) {
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSink
    public void release() {
        SurfaceHolder holder;
        SurfaceView surfaceView = this.A01;
        if (surfaceView != null && (holder = surfaceView.getHolder()) != null) {
            IJE ije = this.A04;
            holder.removeCallback(ije);
            ije.surfaceDestroyed(holder);
        }
        this.A01 = null;
        this.A02 = null;
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.ISurfaceVideoSink
    public void removeSurfaceListener(Function1 function1) {
        11T.A0F(function1, 0);
        this.A05.remove(function1);
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSink
    public void setOnSinkParamsChanged(Function2 function2) {
        this.A03 = function2;
        if (function2 != null) {
            function2.invoke(null, this.A02);
        }
    }
}
