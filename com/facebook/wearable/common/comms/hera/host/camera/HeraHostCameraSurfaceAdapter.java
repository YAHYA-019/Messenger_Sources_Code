package com.facebook.wearable.common.comms.hera.host.camera;

import X.0Q8;
import X.11T;
import X.Gu6;
import X.Icj;
import X.Ics;
import X.JG1;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.facebook.wearable.common.comms.hera.host.intf.IHeraHost;

/* loaded from: HeraHostCameraSurfaceAdapter.class */
public final class HeraHostCameraSurfaceAdapter {
    public Icj glInput;
    public final int height;
    public final IHeraHost heraHost;
    public final int width;

    public HeraHostCameraSurfaceAdapter(IHeraHost iHeraHost) {
        11T.A0F(iHeraHost, 1);
        this.heraHost = iHeraHost;
        this.width = 720;
        this.height = 1280;
        initNewSurface();
    }

    public final Icj getGlInput() {
        Icj icj = this.glInput;
        if (icj != null) {
            return icj;
        }
        11T.A0L("glInput");
        throw 0Q8.createAndThrow();
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void initNewSurface() {
        Ics ics = new Ics();
        int i = this.width;
        int i2 = this.height;
        SurfaceTexture surfaceTexture = ics.A03;
        if (surfaceTexture == null) {
            surfaceTexture = Ics.A00(ics);
        }
        surfaceTexture.setDefaultBufferSize(i, i2);
        this.glInput = new Icj(ics, new Gu6());
        IHeraHost iHeraHost = this.heraHost;
        SurfaceTexture surfaceTexture2 = ics.A03;
        if (surfaceTexture2 == null) {
            surfaceTexture2 = Ics.A00(ics);
        }
        iHeraHost.setCameraOutputSurface(new Surface(surfaceTexture2), this.width, this.height);
    }

    public final void release() {
        this.heraHost.setCameraOutputSurface(null, 0, 0);
        getGlInput().Crq(new JG1() { // from class: com.facebook.wearable.common.comms.hera.host.camera.HeraHostCameraSurfaceAdapter$release$1
            @Override // X.JG1
            public final void onFrameAvailable() {
            }
        });
        getGlInput().AN3();
    }
}
