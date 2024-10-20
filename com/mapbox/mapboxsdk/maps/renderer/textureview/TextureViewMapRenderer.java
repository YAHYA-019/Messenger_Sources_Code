package com.mapbox.mapboxsdk.maps.renderer.textureview;

import android.content.Context;
import android.view.TextureView;
import com.mapbox.mapboxsdk.maps.renderer.MapRenderer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: TextureViewMapRenderer.class */
public class TextureViewMapRenderer extends MapRenderer {
    public TextureViewRenderThread renderThread;
    public boolean translucentSurface;

    public TextureViewMapRenderer(Context context, TextureView textureView, String str, boolean z) {
        super(context, str);
        this.translucentSurface = z;
        TextureViewRenderThread textureViewRenderThread = new TextureViewRenderThread(textureView, this);
        this.renderThread = textureViewRenderThread;
        textureViewRenderThread.start();
    }

    public boolean isTranslucentSurface() {
        return this.translucentSurface;
    }

    @Override // com.mapbox.mapboxsdk.maps.renderer.MapRenderer
    public void onDestroy() {
        this.renderThread.onDestroy();
    }

    @Override // com.mapbox.mapboxsdk.maps.renderer.MapRenderer, android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        super.onDrawFrame(gl10);
    }

    @Override // com.mapbox.mapboxsdk.maps.renderer.MapRenderer
    public void onStart() {
        this.renderThread.onResume();
    }

    @Override // com.mapbox.mapboxsdk.maps.renderer.MapRenderer
    public void onStop() {
        this.renderThread.onPause();
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
        this.renderThread.queueEvent(runnable);
    }

    @Override // com.mapbox.mapboxsdk.maps.renderer.MapRendererScheduler
    public void requestRender() {
        this.renderThread.requestRender();
    }
}
