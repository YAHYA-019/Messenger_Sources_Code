package com.facebook.cameracore.mediapipeline.services.externalvideostreamsdelegate;

import X.AnonymousClass001;
import X.HsT;
import X.I8U;
import com.facebook.jni.HybridData;
import java.util.Iterator;
import java.util.Set;

/* loaded from: ExternalVideoStreamsDelegateManager.class */
public class ExternalVideoStreamsDelegateManager {
    public final Set mDelegates = AnonymousClass001.A0v();
    public HybridData mHybridData;

    private int[] getStreamTextureMetadata(String str) {
        synchronized (this.mDelegates) {
            Iterator it = this.mDelegates.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0Q("getStreamTextureMetadata");
            }
        }
        return null;
    }

    private boolean hasStreamTextureForIdentifier(String str) {
        synchronized (this.mDelegates) {
            Iterator it = this.mDelegates.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0Q("hasStreamTextureForIdentifier");
            }
        }
        return false;
    }

    private boolean hasStreamUpdatedForIdentifier(String str) {
        synchronized (this.mDelegates) {
            Iterator it = this.mDelegates.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0Q("hasStreamUpdatedForIdentifier");
            }
        }
        return false;
    }

    private native HybridData initHybrid();

    private void onStreamTextureMade(String str) {
        synchronized (this.mDelegates) {
            Iterator it = this.mDelegates.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0Q("onStreamTextureMade");
            }
        }
    }

    private void onStreamTexturesUpdateBegin() {
        synchronized (this.mDelegates) {
            Iterator it = this.mDelegates.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0Q("onStreamTexturesUpdateBegin");
            }
        }
    }

    private void onStreamTexturesUpdateEnd() {
        synchronized (this.mDelegates) {
            Iterator it = this.mDelegates.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0Q("onStreamTexturesUpdateEnd");
            }
        }
    }

    private void updateStreamTexture(String str, int i, int i2, int i3, int i4) {
        I8U i8u = new I8U(str);
        i8u.A04 = i;
        i8u.A02 = i2;
        i8u.A00 = i3;
        i8u.A01 = i4;
        i8u.A07 = true;
        HsT hsT = new HsT(i8u);
        synchronized (this.mDelegates) {
            Iterator it = this.mDelegates.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0Q("updateStreamTexture");
            }
        }
        hsT.A01();
    }
}
