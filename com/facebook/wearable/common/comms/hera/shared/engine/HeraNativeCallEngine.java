package com.facebook.wearable.common.comms.hera.shared.engine;

import X.04S;
import X.0DR;
import X.0Q8;
import X.11T;
import X.2aI;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C0il;
import X.C15t;
import com.facebook.wearable.common.comms.hera.shared.engine.config.HeraCallEngineConfig;
import com.meta.wearable.comms.calling.hera.engine.audio.FeatureAudio;
import com.meta.wearable.comms.calling.hera.engine.base.Any;
import com.meta.wearable.comms.calling.hera.engine.base.Engine;
import com.meta.wearable.comms.calling.hera.engine.base.EngineEnhancerRecorder;
import com.meta.wearable.comms.calling.hera.engine.camera.FeatureCamera;
import com.meta.wearable.comms.calling.hera.engine.core.FeatureCore;
import com.meta.wearable.comms.calling.hera.engine.device.FeatureDevice;
import com.meta.wearable.comms.calling.hera.engine.video.FeatureVideo;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: HeraNativeCallEngine.class */
public class HeraNativeCallEngine implements IHeraCallEngine {
    public static final Companion Companion = new Object();
    public static boolean haveNativeLibrariesLoaded;
    public final HeraCallEngineConfig config;
    public Engine engine;
    public FeatureAudio featureAudio;
    public FeatureCamera featureCamera;
    public FeatureCore featureCore;
    public FeatureDevice featureDevice;
    public FeatureVideo featureVideo;
    public EngineEnhancerRecorder recorder;
    public 2aI scope;
    public final C01i stateFlow$delegate;

    /* loaded from: HeraNativeCallEngine$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public HeraNativeCallEngine(HeraCallEngineConfig heraCallEngineConfig) {
        11T.A0F(heraCallEngineConfig, 1);
        this.config = heraCallEngineConfig;
        this.stateFlow$delegate = C01g.A00(C03i.A02, new HeraNativeCallEngine$stateFlow$2(this));
    }

    public static /* synthetic */ Object constructModules$suspendImpl(HeraNativeCallEngine heraNativeCallEngine, 0DR r302) {
        FeatureCore create = FeatureCore.CppProxy.create(heraNativeCallEngine.getEngine());
        11T.A0A(create);
        heraNativeCallEngine.featureCore = create;
        FeatureAudio create2 = FeatureAudio.CppProxy.create(heraNativeCallEngine.getEngine());
        11T.A0A(create2);
        heraNativeCallEngine.featureAudio = create2;
        FeatureCamera create3 = FeatureCamera.CppProxy.create(heraNativeCallEngine.getEngine());
        11T.A0A(create3);
        heraNativeCallEngine.featureCamera = create3;
        FeatureVideo create4 = FeatureVideo.CppProxy.create(heraNativeCallEngine.getEngine());
        11T.A0A(create4);
        heraNativeCallEngine.featureVideo = create4;
        FeatureDevice create5 = FeatureDevice.CppProxy.create(heraNativeCallEngine.getEngine());
        11T.A0A(create5);
        heraNativeCallEngine.featureDevice = create5;
        return 04S.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object init$suspendImpl(com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeCallEngine r301, X.0DR r302) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeCallEngine.init$suspendImpl(com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeCallEngine, X.0DR):java.lang.Object");
    }

    public static /* synthetic */ Object loadNativeLibraries$suspendImpl(HeraNativeCallEngine heraNativeCallEngine, 0DR r302) {
        if (!haveNativeLibrariesLoaded) {
            C0il.A0B("callenginebase");
            C0il.A0B("callenginecore");
            C0il.A0B("callengineaudio");
            C0il.A0B("callenginecamera");
            C0il.A0B("callenginedevice");
            C0il.A0B("callenginevideo");
            haveNativeLibrariesLoaded = true;
        }
        return 04S.A00;
    }

    public static /* synthetic */ Object registerModules$suspendImpl(HeraNativeCallEngine heraNativeCallEngine, 0DR r302) {
        heraNativeCallEngine.getEngine().registerModule(heraNativeCallEngine.getFeatureCore().getModule());
        heraNativeCallEngine.getEngine().registerModule(heraNativeCallEngine.getFeatureAudio().getModule());
        heraNativeCallEngine.getEngine().registerModule(heraNativeCallEngine.getFeatureCamera().getModule());
        heraNativeCallEngine.getEngine().registerModule(heraNativeCallEngine.getFeatureVideo().getModule());
        heraNativeCallEngine.getEngine().registerModule(heraNativeCallEngine.getFeatureDevice().getModule());
        return 04S.A00;
    }

    public Object constructModules(0DR r302) {
        return constructModules$suspendImpl(this, r302);
    }

    @Override // com.facebook.wearable.common.comms.hera.shared.engine.IHeraCallEngine
    public void dispatchBlocking(Any any) {
        11T.A0F(any, 0);
        synchronized (getEngine()) {
            getEngine().dispatchBlocking(any);
        }
    }

    public final Engine getEngine() {
        Engine engine = this.engine;
        if (engine != null) {
            return engine;
        }
        11T.A0L("engine");
        throw 0Q8.createAndThrow();
    }

    public final FeatureAudio getFeatureAudio() {
        FeatureAudio featureAudio = this.featureAudio;
        if (featureAudio != null) {
            return featureAudio;
        }
        11T.A0L("featureAudio");
        throw 0Q8.createAndThrow();
    }

    public final FeatureCamera getFeatureCamera() {
        FeatureCamera featureCamera = this.featureCamera;
        if (featureCamera != null) {
            return featureCamera;
        }
        11T.A0L("featureCamera");
        throw 0Q8.createAndThrow();
    }

    public final FeatureCore getFeatureCore() {
        FeatureCore featureCore = this.featureCore;
        if (featureCore != null) {
            return featureCore;
        }
        11T.A0L("featureCore");
        throw 0Q8.createAndThrow();
    }

    public final FeatureDevice getFeatureDevice() {
        FeatureDevice featureDevice = this.featureDevice;
        if (featureDevice != null) {
            return featureDevice;
        }
        11T.A0L("featureDevice");
        throw 0Q8.createAndThrow();
    }

    public final FeatureVideo getFeatureVideo() {
        FeatureVideo featureVideo = this.featureVideo;
        if (featureVideo != null) {
            return featureVideo;
        }
        11T.A0L("featureVideo");
        throw 0Q8.createAndThrow();
    }

    @Override // X.JKm
    public C15t getStateFlow() {
        return (C15t) this.stateFlow$delegate.getValue();
    }

    @Override // X.JKm
    public Object init(0DR r302) {
        return init$suspendImpl(this, r302);
    }

    public Object loadNativeLibraries(0DR r302) {
        return loadNativeLibraries$suspendImpl(this, r302);
    }

    public Object registerModules(0DR r302) {
        return registerModules$suspendImpl(this, r302);
    }

    @Override // X.JKm
    public /* synthetic */ Object release(0DR r302) {
        return 04S.A00;
    }

    public final void setEngine(Engine engine) {
        11T.A0F(engine, 0);
        this.engine = engine;
    }

    public final void setFeatureAudio(FeatureAudio featureAudio) {
        11T.A0F(featureAudio, 0);
        this.featureAudio = featureAudio;
    }

    public final void setFeatureCamera(FeatureCamera featureCamera) {
        11T.A0F(featureCamera, 0);
        this.featureCamera = featureCamera;
    }

    public final void setFeatureCore(FeatureCore featureCore) {
        11T.A0F(featureCore, 0);
        this.featureCore = featureCore;
    }

    public final void setFeatureDevice(FeatureDevice featureDevice) {
        11T.A0F(featureDevice, 0);
        this.featureDevice = featureDevice;
    }

    public final void setFeatureVideo(FeatureVideo featureVideo) {
        11T.A0F(featureVideo, 0);
        this.featureVideo = featureVideo;
    }

    public Object setupModules(0DR r302) {
        return 04S.A00;
    }
}
