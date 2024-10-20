package com.mapbox.mapboxsdk.location;

import X.7zL;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: StaleStateManager.class */
public class StaleStateManager {
    public long delayTime;
    public final OnLocationStaleListener innerOnLocationStaleListeners;
    public boolean isEnabled;
    public boolean isStale = true;
    public final int staleStateMessage = 1;
    public final StaleMessageHandler handler = new StaleMessageHandler(this);

    /* loaded from: StaleStateManager$StaleMessageHandler.class */
    public class StaleMessageHandler extends Handler {
        public final WeakReference managerWeakReference;

        public StaleMessageHandler(StaleStateManager staleStateManager) {
            this.managerWeakReference = 7zL.A14(staleStateManager);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            StaleStateManager staleStateManager = (StaleStateManager) this.managerWeakReference.get();
            if (staleStateManager != null) {
                staleStateManager.setState(true);
            }
        }
    }

    public StaleStateManager(OnLocationStaleListener onLocationStaleListener, LocationComponentOptions locationComponentOptions) {
        this.innerOnLocationStaleListeners = onLocationStaleListener;
        this.isEnabled = locationComponentOptions.enableStaleState;
        this.delayTime = locationComponentOptions.staleStateTimeout;
    }

    private void postTheCallback() {
        this.handler.removeCallbacksAndMessages(null);
        this.handler.sendEmptyMessageDelayed(1, this.delayTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(boolean z) {
        if (z != this.isStale) {
            this.isStale = z;
            if (this.isEnabled) {
                this.innerOnLocationStaleListeners.onStaleStateChange(z);
            }
        }
    }

    public boolean isStale() {
        return this.isStale;
    }

    public void onStart() {
        if (this.isStale) {
            return;
        }
        postTheCallback();
    }

    public void onStop() {
        this.handler.removeCallbacksAndMessages(null);
    }

    public void setDelayTime(long j) {
        this.delayTime = j;
        if (this.handler.hasMessages(1)) {
            postTheCallback();
        }
    }

    public void setEnabled(boolean z) {
        if (z) {
            setState(this.isStale);
        } else if (this.isEnabled) {
            onStop();
            this.innerOnLocationStaleListeners.onStaleStateChange(false);
        }
        this.isEnabled = z;
    }

    public void updateLatestLocationTime() {
        setState(false);
        postTheCallback();
    }
}
