package com.mapbox.mapboxsdk.maps;

import X.AnonymousClass001;
import X.JR2;
import android.graphics.PointF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* loaded from: MapKeyListener.class */
public final class MapKeyListener {
    public TrackballLongPressTimeOut currentTrackballLongPressTimeOut;
    public final MapGestureDetector mapGestureDetector;
    public final Transform transform;
    public final UiSettings uiSettings;

    /* loaded from: MapKeyListener$TrackballLongPressTimeOut.class */
    public class TrackballLongPressTimeOut implements Runnable {
        public boolean cancelled = false;

        public TrackballLongPressTimeOut() {
        }

        public void cancel() {
            this.cancelled = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.cancelled) {
                return;
            }
            MapKeyListener.this.mapGestureDetector.zoomOutAnimated(new PointF(MapKeyListener.this.uiSettings.getWidth() / 2.0f, MapKeyListener.this.uiSettings.getHeight() / 2.0f), true);
            MapKeyListener.this.currentTrackballLongPressTimeOut = null;
        }
    }

    public MapKeyListener(Transform transform, UiSettings uiSettings, MapGestureDetector mapGestureDetector) {
        this.transform = transform;
        this.uiSettings = uiSettings;
        this.mapGestureDetector = mapGestureDetector;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0023. Please report as an issue. */
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Transform transform;
        double d;
        double d2;
        Transform transform2;
        long j;
        double d3;
        double d4 = keyEvent.getRepeatCount() >= 5 ? 50.0d : 10.0d;
        if (i != 66) {
            switch (i) {
                case 19:
                    if (!this.uiSettings.scrollGesturesEnabled) {
                        return false;
                    }
                    this.transform.cancelTransitions();
                    transform2 = this.transform;
                    d3 = 0.0d;
                    j = 0;
                    transform2.moveBy(d3, d4, j);
                    return true;
                case 20:
                    if (!this.uiSettings.scrollGesturesEnabled) {
                        return false;
                    }
                    this.transform.cancelTransitions();
                    transform = this.transform;
                    d = 0.0d;
                    d2 = -d4;
                    transform.moveBy(d, d2, 0L);
                    return true;
                case 21:
                    if (!this.uiSettings.scrollGesturesEnabled) {
                        return false;
                    }
                    this.transform.cancelTransitions();
                    transform2 = this.transform;
                    j = 0;
                    d3 = d4;
                    d4 = 0.0d;
                    transform2.moveBy(d3, d4, j);
                    return true;
                case 22:
                    if (!this.uiSettings.scrollGesturesEnabled) {
                        return false;
                    }
                    this.transform.cancelTransitions();
                    transform = this.transform;
                    d = -d4;
                    d2 = 0.0d;
                    transform.moveBy(d, d2, 0L);
                    return true;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        if (i != 23 && i != 66) {
            return false;
        }
        UiSettings uiSettings = this.uiSettings;
        if (!uiSettings.zoomGesturesEnabled) {
            return false;
        }
        this.mapGestureDetector.zoomOutAnimated(JR2.A0K(this, uiSettings), true);
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (keyEvent.isCanceled()) {
            return false;
        }
        if (i != 23 && i != 66) {
            return false;
        }
        UiSettings uiSettings = this.uiSettings;
        if (!uiSettings.zoomGesturesEnabled) {
            return false;
        }
        this.mapGestureDetector.zoomInAnimated(JR2.A0K(this, uiSettings), true);
        return true;
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            TrackballLongPressTimeOut trackballLongPressTimeOut = this.currentTrackballLongPressTimeOut;
            if (trackballLongPressTimeOut != null) {
                trackballLongPressTimeOut.cancelled = true;
                this.currentTrackballLongPressTimeOut = null;
            }
            this.currentTrackballLongPressTimeOut = new TrackballLongPressTimeOut();
            AnonymousClass001.A07().postDelayed(this.currentTrackballLongPressTimeOut, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (actionMasked == 1) {
            UiSettings uiSettings = this.uiSettings;
            if (!uiSettings.zoomGesturesEnabled) {
                return false;
            }
            if (this.currentTrackballLongPressTimeOut != null) {
                this.mapGestureDetector.zoomInAnimated(JR2.A0K(this, uiSettings), true);
                return true;
            }
        } else {
            if (actionMasked == 2) {
                if (!this.uiSettings.scrollGesturesEnabled) {
                    return false;
                }
                this.transform.cancelTransitions();
                this.transform.moveBy(motionEvent.getX() * (-10.0d), motionEvent.getY() * (-10.0d), 0L);
                return true;
            }
            if (actionMasked != 3) {
                return false;
            }
            TrackballLongPressTimeOut trackballLongPressTimeOut2 = this.currentTrackballLongPressTimeOut;
            if (trackballLongPressTimeOut2 != null) {
                trackballLongPressTimeOut2.cancelled = true;
                this.currentTrackballLongPressTimeOut = null;
            }
        }
        return true;
    }
}
