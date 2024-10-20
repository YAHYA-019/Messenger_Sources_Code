package com.mapbox.mapboxsdk.maps;

import X.7zL;
import X.JQx;
import android.os.Handler;
import android.os.Message;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: CameraChangeDispatcher.class */
public class CameraChangeDispatcher implements MapboxMap.OnCameraMoveListener, MapboxMap.OnCameraIdleListener, MapboxMap.OnCameraMoveCanceledListener, MapboxMap.OnCameraMoveStartedListener {
    public static final int IDLE = 3;
    public static final int MOVE = 1;
    public static final int MOVE_CANCELED = 2;
    public static final int MOVE_STARTED = 0;
    public int moveStartedReason;
    public final CameraChangeHandler handler = new CameraChangeHandler(this);
    public boolean idle = true;
    public final CopyOnWriteArrayList onCameraMoveStarted = JQx.A14();
    public final CopyOnWriteArrayList onCameraMoveCanceled = JQx.A14();
    public final CopyOnWriteArrayList onCameraMove = JQx.A14();
    public final CopyOnWriteArrayList onCameraIdle = JQx.A14();

    /* loaded from: CameraChangeDispatcher$CameraChangeHandler.class */
    public class CameraChangeHandler extends Handler {
        public WeakReference dispatcherWeakReference;

        public CameraChangeHandler(CameraChangeDispatcher cameraChangeDispatcher) {
            this.dispatcherWeakReference = 7zL.A14(cameraChangeDispatcher);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            CameraChangeDispatcher cameraChangeDispatcher = (CameraChangeDispatcher) this.dispatcherWeakReference.get();
            if (cameraChangeDispatcher != null) {
                int i = message.what;
                if (i == 0) {
                    cameraChangeDispatcher.executeOnCameraMoveStarted();
                    return;
                }
                if (i == 1) {
                    cameraChangeDispatcher.executeOnCameraMove();
                } else if (i == 2) {
                    cameraChangeDispatcher.executeOnCameraMoveCancelled();
                } else if (i == 3) {
                    cameraChangeDispatcher.executeOnCameraIdle();
                }
            }
        }

        public void scheduleMessage(int i) {
            CameraChangeDispatcher cameraChangeDispatcher = (CameraChangeDispatcher) this.dispatcherWeakReference.get();
            if (cameraChangeDispatcher != null) {
                if (i == 0) {
                    boolean z = !cameraChangeDispatcher.idle && (hasMessages(3) || hasMessages(2));
                    removeMessages(3);
                    removeMessages(2);
                    if (z) {
                        return;
                    }
                }
                Message message = new Message();
                message.what = i;
                sendMessage(message);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeOnCameraIdle() {
        if (this.idle) {
            return;
        }
        this.idle = true;
        if (this.onCameraIdle.isEmpty()) {
            return;
        }
        Iterator it = this.onCameraIdle.iterator();
        while (it.hasNext()) {
            ((MapboxMap.OnCameraIdleListener) it.next()).onCameraIdle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeOnCameraMove() {
        if (this.onCameraMove.isEmpty() || this.idle) {
            return;
        }
        Iterator it = this.onCameraMove.iterator();
        while (it.hasNext()) {
            ((MapboxMap.OnCameraMoveListener) it.next()).onCameraMove();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeOnCameraMoveCancelled() {
        if (this.onCameraMoveCanceled.isEmpty() || this.idle) {
            return;
        }
        Iterator it = this.onCameraMoveCanceled.iterator();
        while (it.hasNext()) {
            ((MapboxMap.OnCameraMoveCanceledListener) it.next()).onCameraMoveCanceled();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeOnCameraMoveStarted() {
        if (this.idle) {
            this.idle = false;
            if (this.onCameraMoveStarted.isEmpty()) {
                return;
            }
            Iterator it = this.onCameraMoveStarted.iterator();
            while (it.hasNext()) {
                ((MapboxMap.OnCameraMoveStartedListener) it.next()).onCameraMoveStarted(this.moveStartedReason);
            }
        }
    }

    public void addOnCameraIdleListener(MapboxMap.OnCameraIdleListener onCameraIdleListener) {
        this.onCameraIdle.add(onCameraIdleListener);
    }

    public void addOnCameraMoveCancelListener(MapboxMap.OnCameraMoveCanceledListener onCameraMoveCanceledListener) {
        this.onCameraMoveCanceled.add(onCameraMoveCanceledListener);
    }

    public void addOnCameraMoveListener(MapboxMap.OnCameraMoveListener onCameraMoveListener) {
        this.onCameraMove.add(onCameraMoveListener);
    }

    public void addOnCameraMoveStartedListener(MapboxMap.OnCameraMoveStartedListener onCameraMoveStartedListener) {
        this.onCameraMoveStarted.add(onCameraMoveStartedListener);
    }

    @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnCameraIdleListener
    public void onCameraIdle() {
        this.handler.scheduleMessage(3);
    }

    @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnCameraMoveListener
    public void onCameraMove() {
        this.handler.scheduleMessage(1);
    }

    @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnCameraMoveCanceledListener
    public void onCameraMoveCanceled() {
        this.handler.scheduleMessage(2);
    }

    @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnCameraMoveStartedListener
    public void onCameraMoveStarted(int i) {
        this.moveStartedReason = i;
        this.handler.scheduleMessage(0);
    }

    public void onDestroy() {
        this.handler.removeCallbacksAndMessages(null);
        this.onCameraMoveStarted.clear();
        this.onCameraMoveCanceled.clear();
        this.onCameraMove.clear();
        this.onCameraIdle.clear();
    }

    public void removeOnCameraIdleListener(MapboxMap.OnCameraIdleListener onCameraIdleListener) {
        if (this.onCameraIdle.contains(onCameraIdleListener)) {
            this.onCameraIdle.remove(onCameraIdleListener);
        }
    }

    public void removeOnCameraMoveCancelListener(MapboxMap.OnCameraMoveCanceledListener onCameraMoveCanceledListener) {
        if (this.onCameraMoveCanceled.contains(onCameraMoveCanceledListener)) {
            this.onCameraMoveCanceled.remove(onCameraMoveCanceledListener);
        }
    }

    public void removeOnCameraMoveListener(MapboxMap.OnCameraMoveListener onCameraMoveListener) {
        if (this.onCameraMove.contains(onCameraMoveListener)) {
            this.onCameraMove.remove(onCameraMoveListener);
        }
    }

    public void removeOnCameraMoveStartedListener(MapboxMap.OnCameraMoveStartedListener onCameraMoveStartedListener) {
        if (this.onCameraMoveStarted.contains(onCameraMoveStartedListener)) {
            this.onCameraMoveStarted.remove(onCameraMoveStartedListener);
        }
    }
}
