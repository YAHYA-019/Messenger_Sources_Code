package com.mapbox.mapboxsdk.maps.renderer.glsurfaceview;

import android.content.Context;
import android.opengl.GLSurfaceView;
import com.mapbox.mapboxsdk.maps.renderer.MapRenderer;
import com.mapbox.mapboxsdk.maps.renderer.egl.EGLConfigChooser;
import com.mapbox.mapboxsdk.maps.renderer.glsurfaceview.MapboxGLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: GLSurfaceViewMapRenderer.class */
public class GLSurfaceViewMapRenderer extends MapRenderer implements GLSurfaceView.Renderer {
    public final MapboxGLSurfaceView glSurfaceView;

    public GLSurfaceViewMapRenderer(Context context, MapboxGLSurfaceView mapboxGLSurfaceView, String str) {
        super(context, str);
        this.glSurfaceView = mapboxGLSurfaceView;
        mapboxGLSurfaceView.setEGLContextClientVersion(2);
        mapboxGLSurfaceView.setEGLConfigChooser(new EGLConfigChooser(false));
        mapboxGLSurfaceView.setRenderer(this);
        mapboxGLSurfaceView.setRenderMode(0);
        mapboxGLSurfaceView.setPreserveEGLContextOnPause(true);
        mapboxGLSurfaceView.setDetachedListener(new MapboxGLSurfaceView.OnGLSurfaceViewDetachedListener() { // from class: com.mapbox.mapboxsdk.maps.renderer.glsurfaceview.GLSurfaceViewMapRenderer.1
            @Override // com.mapbox.mapboxsdk.maps.renderer.glsurfaceview.MapboxGLSurfaceView.OnGLSurfaceViewDetachedListener
            public void onGLSurfaceViewDetached() {
                GLSurfaceViewMapRenderer gLSurfaceViewMapRenderer = GLSurfaceViewMapRenderer.this;
                String str2 = MapRenderer.TAG;
                gLSurfaceViewMapRenderer.nativeReset();
            }
        });
    }

    @Override // com.mapbox.mapboxsdk.maps.renderer.MapRenderer
    public void onDestroy() {
    }

    @Override // com.mapbox.mapboxsdk.maps.renderer.MapRenderer, android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        super.onDrawFrame(gl10);
    }

    @Override // com.mapbox.mapboxsdk.maps.renderer.MapRenderer
    public void onPause() {
    }

    @Override // com.mapbox.mapboxsdk.maps.renderer.MapRenderer
    public void onResume() {
    }

    @Override // com.mapbox.mapboxsdk.maps.renderer.MapRenderer
    public void onStart() {
        this.glSurfaceView.onResume();
    }

    @Override // com.mapbox.mapboxsdk.maps.renderer.MapRenderer
    public void onStop() {
        this.glSurfaceView.onPause();
    }

    @Override // com.mapbox.mapboxsdk.maps.renderer.MapRenderer, android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        super.onSurfaceChanged(gl10, i, i2);
    }

    @Override // com.mapbox.mapboxsdk.maps.renderer.MapRenderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        super.onSurfaceCreated(gl10, eGLConfig);
    }

    @Override // com.mapbox.mapboxsdk.maps.renderer.MapRenderer
    public void onSurfaceDestroyed() {
        super.onSurfaceDestroyed();
    }

    @Override // com.mapbox.mapboxsdk.maps.renderer.MapRendererScheduler
    public void queueEvent(Runnable runnable) {
        this.glSurfaceView.queueEvent(runnable);
    }

    @Override // com.mapbox.mapboxsdk.maps.renderer.MapRendererScheduler
    public void requestRender() {
        this.glSurfaceView.requestRender();
    }
}
