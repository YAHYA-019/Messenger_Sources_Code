package com.mapbox.mapboxsdk.maps;

import X.JQx;
import com.mapbox.mapboxsdk.log.Logger;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.NativeMapView;
import java.util.Iterator;
import java.util.List;

/* loaded from: MapChangeReceiver.class */
public class MapChangeReceiver implements NativeMapView.StateCallback {
    public static final String TAG = "Mbgl-MapChangeReceiver";
    public final List onCameraWillChangeListenerList = JQx.A14();
    public final List onCameraIsChangingListenerList = JQx.A14();
    public final List onCameraDidChangeListenerList = JQx.A14();
    public final List onWillStartLoadingMapListenerList = JQx.A14();
    public final List onDidFinishLoadingMapListenerList = JQx.A14();
    public final List onDidFailLoadingMapListenerList = JQx.A14();
    public final List onWillStartRenderingFrameList = JQx.A14();
    public final List onDidFinishRenderingFrameList = JQx.A14();
    public final List onWillStartRenderingMapListenerList = JQx.A14();
    public final List onDidFinishRenderingMapListenerList = JQx.A14();
    public final List onDidBecomeIdleListenerList = JQx.A14();
    public final List onDidFinishLoadingStyleListenerList = JQx.A14();
    public final List onSourceChangedListenerList = JQx.A14();
    public final List onStyleImageMissingListenerList = JQx.A14();
    public final List onCanRemoveUnusedStyleImageListenerList = JQx.A14();

    public void addOnCameraDidChangeListener(MapView.OnCameraDidChangeListener onCameraDidChangeListener) {
        this.onCameraDidChangeListenerList.add(onCameraDidChangeListener);
    }

    public void addOnCameraIsChangingListener(MapView.OnCameraIsChangingListener onCameraIsChangingListener) {
        this.onCameraIsChangingListenerList.add(onCameraIsChangingListener);
    }

    public void addOnCameraWillChangeListener(MapView.OnCameraWillChangeListener onCameraWillChangeListener) {
        this.onCameraWillChangeListenerList.add(onCameraWillChangeListener);
    }

    public void addOnCanRemoveUnusedStyleImageListener(MapView.OnCanRemoveUnusedStyleImageListener onCanRemoveUnusedStyleImageListener) {
        this.onCanRemoveUnusedStyleImageListenerList.add(onCanRemoveUnusedStyleImageListener);
    }

    public void addOnDidBecomeIdleListener(MapView.OnDidBecomeIdleListener onDidBecomeIdleListener) {
        this.onDidBecomeIdleListenerList.add(onDidBecomeIdleListener);
    }

    public void addOnDidFailLoadingMapListener(MapView.OnDidFailLoadingMapListener onDidFailLoadingMapListener) {
        this.onDidFailLoadingMapListenerList.add(onDidFailLoadingMapListener);
    }

    public void addOnDidFinishLoadingMapListener(MapView.OnDidFinishLoadingMapListener onDidFinishLoadingMapListener) {
        this.onDidFinishLoadingMapListenerList.add(onDidFinishLoadingMapListener);
    }

    public void addOnDidFinishLoadingStyleListener(MapView.OnDidFinishLoadingStyleListener onDidFinishLoadingStyleListener) {
        this.onDidFinishLoadingStyleListenerList.add(onDidFinishLoadingStyleListener);
    }

    public void addOnDidFinishRenderingFrameListener(MapView.OnDidFinishRenderingFrameListener onDidFinishRenderingFrameListener) {
        this.onDidFinishRenderingFrameList.add(onDidFinishRenderingFrameListener);
    }

    public void addOnDidFinishRenderingMapListener(MapView.OnDidFinishRenderingMapListener onDidFinishRenderingMapListener) {
        this.onDidFinishRenderingMapListenerList.add(onDidFinishRenderingMapListener);
    }

    public void addOnSourceChangedListener(MapView.OnSourceChangedListener onSourceChangedListener) {
        this.onSourceChangedListenerList.add(onSourceChangedListener);
    }

    public void addOnStyleImageMissingListener(MapView.OnStyleImageMissingListener onStyleImageMissingListener) {
        this.onStyleImageMissingListenerList.add(onStyleImageMissingListener);
    }

    public void addOnWillStartLoadingMapListener(MapView.OnWillStartLoadingMapListener onWillStartLoadingMapListener) {
        this.onWillStartLoadingMapListenerList.add(onWillStartLoadingMapListener);
    }

    public void addOnWillStartRenderingFrameListener(MapView.OnWillStartRenderingFrameListener onWillStartRenderingFrameListener) {
        this.onWillStartRenderingFrameList.add(onWillStartRenderingFrameListener);
    }

    public void addOnWillStartRenderingMapListener(MapView.OnWillStartRenderingMapListener onWillStartRenderingMapListener) {
        this.onWillStartRenderingMapListenerList.add(onWillStartRenderingMapListener);
    }

    public void clear() {
        this.onCameraWillChangeListenerList.clear();
        this.onCameraIsChangingListenerList.clear();
        this.onCameraDidChangeListenerList.clear();
        this.onWillStartLoadingMapListenerList.clear();
        this.onDidFinishLoadingMapListenerList.clear();
        this.onDidFailLoadingMapListenerList.clear();
        this.onWillStartRenderingFrameList.clear();
        this.onDidFinishRenderingFrameList.clear();
        this.onWillStartRenderingMapListenerList.clear();
        this.onDidFinishRenderingMapListenerList.clear();
        this.onDidBecomeIdleListenerList.clear();
        this.onDidFinishLoadingStyleListenerList.clear();
        this.onSourceChangedListenerList.clear();
        this.onStyleImageMissingListenerList.clear();
        this.onCanRemoveUnusedStyleImageListenerList.clear();
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMapView.StateCallback
    public void onCameraDidChange(boolean z) {
        try {
            if (this.onCameraDidChangeListenerList.isEmpty()) {
                return;
            }
            Iterator it = this.onCameraDidChangeListenerList.iterator();
            while (it.hasNext()) {
                ((MapView.OnCameraDidChangeListener) it.next()).onCameraDidChange(z);
            }
        } catch (Throwable th) {
            Logger.e(TAG, "Exception in onCameraDidChange", th);
            throw th;
        }
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMapView.StateCallback
    public void onCameraIsChanging() {
        try {
            if (this.onCameraIsChangingListenerList.isEmpty()) {
                return;
            }
            Iterator it = this.onCameraIsChangingListenerList.iterator();
            while (it.hasNext()) {
                ((MapView.OnCameraIsChangingListener) it.next()).onCameraIsChanging();
            }
        } catch (Throwable th) {
            Logger.e(TAG, "Exception in onCameraIsChanging", th);
            throw th;
        }
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMapView.StateCallback
    public void onCameraWillChange(boolean z) {
        try {
            if (this.onCameraWillChangeListenerList.isEmpty()) {
                return;
            }
            Iterator it = this.onCameraWillChangeListenerList.iterator();
            while (it.hasNext()) {
                ((MapView.OnCameraWillChangeListener) it.next()).onCameraWillChange(z);
            }
        } catch (Throwable th) {
            Logger.e(TAG, "Exception in onCameraWillChange", th);
            throw th;
        }
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMapView.StateCallback
    public boolean onCanRemoveUnusedStyleImage(String str) {
        boolean z = true;
        if (!this.onCanRemoveUnusedStyleImageListenerList.isEmpty()) {
            try {
                if (!this.onCanRemoveUnusedStyleImageListenerList.isEmpty()) {
                    Iterator it = this.onCanRemoveUnusedStyleImageListenerList.iterator();
                    while (it.hasNext()) {
                        z &= ((MapView.OnCanRemoveUnusedStyleImageListener) it.next()).onCanRemoveUnusedStyleImage(str);
                    }
                }
            } catch (Throwable th) {
                Logger.e(TAG, "Exception in onCanRemoveUnusedStyleImage", th);
                throw th;
            }
        }
        return z;
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMapView.StateCallback
    public void onDidBecomeIdle() {
        try {
            if (this.onDidBecomeIdleListenerList.isEmpty()) {
                return;
            }
            Iterator it = this.onDidBecomeIdleListenerList.iterator();
            while (it.hasNext()) {
                ((MapView.OnDidBecomeIdleListener) it.next()).onDidBecomeIdle();
            }
        } catch (Throwable th) {
            Logger.e(TAG, "Exception in onDidBecomeIdle", th);
            throw th;
        }
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMapView.StateCallback
    public void onDidFailLoadingMap(String str) {
        try {
            if (this.onDidFailLoadingMapListenerList.isEmpty()) {
                return;
            }
            Iterator it = this.onDidFailLoadingMapListenerList.iterator();
            while (it.hasNext()) {
                ((MapView.OnDidFailLoadingMapListener) it.next()).onDidFailLoadingMap(str);
            }
        } catch (Throwable th) {
            Logger.e(TAG, "Exception in onDidFailLoadingMap", th);
            throw th;
        }
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMapView.StateCallback
    public void onDidFinishLoadingMap() {
        try {
            if (this.onDidFinishLoadingMapListenerList.isEmpty()) {
                return;
            }
            Iterator it = this.onDidFinishLoadingMapListenerList.iterator();
            while (it.hasNext()) {
                ((MapView.OnDidFinishLoadingMapListener) it.next()).onDidFinishLoadingMap();
            }
        } catch (Throwable th) {
            Logger.e(TAG, "Exception in onDidFinishLoadingMap", th);
            throw th;
        }
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMapView.StyleCallback
    public void onDidFinishLoadingStyle() {
        try {
            if (this.onDidFinishLoadingStyleListenerList.isEmpty()) {
                return;
            }
            Iterator it = this.onDidFinishLoadingStyleListenerList.iterator();
            while (it.hasNext()) {
                ((MapView.OnDidFinishLoadingStyleListener) it.next()).onDidFinishLoadingStyle();
            }
        } catch (Throwable th) {
            Logger.e(TAG, "Exception in onDidFinishLoadingStyle", th);
            throw th;
        }
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMapView.StateCallback
    public void onDidFinishRenderingFrame(boolean z) {
        try {
            if (this.onDidFinishRenderingFrameList.isEmpty()) {
                return;
            }
            Iterator it = this.onDidFinishRenderingFrameList.iterator();
            while (it.hasNext()) {
                ((MapView.OnDidFinishRenderingFrameListener) it.next()).onDidFinishRenderingFrame(z);
            }
        } catch (Throwable th) {
            Logger.e(TAG, "Exception in onDidFinishRenderingFrame", th);
            throw th;
        }
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMapView.StateCallback
    public void onDidFinishRenderingMap(boolean z) {
        try {
            if (this.onDidFinishRenderingMapListenerList.isEmpty()) {
                return;
            }
            Iterator it = this.onDidFinishRenderingMapListenerList.iterator();
            while (it.hasNext()) {
                ((MapView.OnDidFinishRenderingMapListener) it.next()).onDidFinishRenderingMap(z);
            }
        } catch (Throwable th) {
            Logger.e(TAG, "Exception in onDidFinishRenderingMap", th);
            throw th;
        }
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMapView.StateCallback
    public void onSourceChanged(String str) {
        try {
            if (this.onSourceChangedListenerList.isEmpty()) {
                return;
            }
            Iterator it = this.onSourceChangedListenerList.iterator();
            while (it.hasNext()) {
                ((MapView.OnSourceChangedListener) it.next()).onSourceChangedListener(str);
            }
        } catch (Throwable th) {
            Logger.e(TAG, "Exception in onSourceChanged", th);
            throw th;
        }
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMapView.StateCallback
    public void onStyleImageMissing(String str) {
        try {
            if (this.onStyleImageMissingListenerList.isEmpty()) {
                return;
            }
            Iterator it = this.onStyleImageMissingListenerList.iterator();
            while (it.hasNext()) {
                ((MapView.OnStyleImageMissingListener) it.next()).onStyleImageMissing(str);
            }
        } catch (Throwable th) {
            Logger.e(TAG, "Exception in onStyleImageMissing", th);
            throw th;
        }
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMapView.StyleCallback
    public void onWillStartLoadingMap() {
        try {
            if (this.onWillStartLoadingMapListenerList.isEmpty()) {
                return;
            }
            Iterator it = this.onWillStartLoadingMapListenerList.iterator();
            while (it.hasNext()) {
                ((MapView.OnWillStartLoadingMapListener) it.next()).onWillStartLoadingMap();
            }
        } catch (Throwable th) {
            Logger.e(TAG, "Exception in onWillStartLoadingMap", th);
            throw th;
        }
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMapView.StateCallback
    public void onWillStartRenderingFrame() {
        try {
            if (this.onWillStartRenderingFrameList.isEmpty()) {
                return;
            }
            Iterator it = this.onWillStartRenderingFrameList.iterator();
            while (it.hasNext()) {
                ((MapView.OnWillStartRenderingFrameListener) it.next()).onWillStartRenderingFrame();
            }
        } catch (Throwable th) {
            Logger.e(TAG, "Exception in onWillStartRenderingFrame", th);
            throw th;
        }
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMapView.StateCallback
    public void onWillStartRenderingMap() {
        try {
            if (this.onWillStartRenderingMapListenerList.isEmpty()) {
                return;
            }
            Iterator it = this.onWillStartRenderingMapListenerList.iterator();
            while (it.hasNext()) {
                ((MapView.OnWillStartRenderingMapListener) it.next()).onWillStartRenderingMap();
            }
        } catch (Throwable th) {
            Logger.e(TAG, "Exception in onWillStartRenderingMap", th);
            throw th;
        }
    }

    public void removeOnCameraDidChangeListener(MapView.OnCameraDidChangeListener onCameraDidChangeListener) {
        this.onCameraDidChangeListenerList.remove(onCameraDidChangeListener);
    }

    public void removeOnCameraIsChangingListener(MapView.OnCameraIsChangingListener onCameraIsChangingListener) {
        this.onCameraIsChangingListenerList.remove(onCameraIsChangingListener);
    }

    public void removeOnCameraWillChangeListener(MapView.OnCameraWillChangeListener onCameraWillChangeListener) {
        this.onCameraWillChangeListenerList.remove(onCameraWillChangeListener);
    }

    public void removeOnCanRemoveUnusedStyleImageListener(MapView.OnCanRemoveUnusedStyleImageListener onCanRemoveUnusedStyleImageListener) {
        this.onCanRemoveUnusedStyleImageListenerList.remove(onCanRemoveUnusedStyleImageListener);
    }

    public void removeOnDidBecomeIdleListener(MapView.OnDidBecomeIdleListener onDidBecomeIdleListener) {
        this.onDidBecomeIdleListenerList.remove(onDidBecomeIdleListener);
    }

    public void removeOnDidFailLoadingMapListener(MapView.OnDidFailLoadingMapListener onDidFailLoadingMapListener) {
        this.onDidFailLoadingMapListenerList.remove(onDidFailLoadingMapListener);
    }

    public void removeOnDidFinishLoadingMapListener(MapView.OnDidFinishLoadingMapListener onDidFinishLoadingMapListener) {
        this.onDidFinishLoadingMapListenerList.remove(onDidFinishLoadingMapListener);
    }

    public void removeOnDidFinishLoadingStyleListener(MapView.OnDidFinishLoadingStyleListener onDidFinishLoadingStyleListener) {
        this.onDidFinishLoadingStyleListenerList.remove(onDidFinishLoadingStyleListener);
    }

    public void removeOnDidFinishRenderingFrameListener(MapView.OnDidFinishRenderingFrameListener onDidFinishRenderingFrameListener) {
        this.onDidFinishRenderingFrameList.remove(onDidFinishRenderingFrameListener);
    }

    public void removeOnDidFinishRenderingMapListener(MapView.OnDidFinishRenderingMapListener onDidFinishRenderingMapListener) {
        this.onDidFinishRenderingMapListenerList.remove(onDidFinishRenderingMapListener);
    }

    public void removeOnSourceChangedListener(MapView.OnSourceChangedListener onSourceChangedListener) {
        this.onSourceChangedListenerList.remove(onSourceChangedListener);
    }

    public void removeOnStyleImageMissingListener(MapView.OnStyleImageMissingListener onStyleImageMissingListener) {
        this.onStyleImageMissingListenerList.remove(onStyleImageMissingListener);
    }

    public void removeOnWillStartLoadingMapListener(MapView.OnWillStartLoadingMapListener onWillStartLoadingMapListener) {
        this.onWillStartLoadingMapListenerList.remove(onWillStartLoadingMapListener);
    }

    public void removeOnWillStartRenderingFrameListener(MapView.OnWillStartRenderingFrameListener onWillStartRenderingFrameListener) {
        this.onWillStartRenderingFrameList.remove(onWillStartRenderingFrameListener);
    }

    public void removeOnWillStartRenderingMapListener(MapView.OnWillStartRenderingMapListener onWillStartRenderingMapListener) {
        this.onWillStartRenderingMapListenerList.remove(onWillStartRenderingMapListener);
    }
}
