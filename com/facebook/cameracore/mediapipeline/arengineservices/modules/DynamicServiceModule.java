package com.facebook.cameracore.mediapipeline.arengineservices.modules;

import X.0Pz;
import X.1BK;
import X.2vC;
import X.2vD;
import X.2vI;
import X.2vM;
import X.AnonymousClass001;
import X.C01s;
import X.C2v7;
import X.C3P5;
import X.EZm;
import X.EoZ;
import X.Eso;
import X.F4m;
import X.GJK;
import X.I2f;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;

/* loaded from: DynamicServiceModule.class */
public class DynamicServiceModule extends ServiceModule {
    public ServiceModule mBaseModule;
    public final C01s mErrorReporter;
    public final GJK mModule;
    public final EoZ mModuleLoader;

    public DynamicServiceModule(GJK gjk, EoZ eoZ, C01s c01s) {
        this.mModule = gjk;
        this.mModuleLoader = eoZ;
        this.mErrorReporter = c01s;
        this.mHybridData = initHybrid(gjk.BAC().mCppValue);
    }

    private ServiceModule getBaseInstance() {
        EZm A00;
        RuntimeException A0T;
        ServiceModule serviceModule;
        synchronized (this) {
            if (this.mBaseModule == null) {
                try {
                    EoZ eoZ = this.mModuleLoader;
                    if (eoZ != null && eoZ.A04 == null) {
                        Eso eso = eoZ.A00;
                        String str = eoZ.A02;
                        if (eso.A00(str) == null) {
                            C2v7 c2v7 = eoZ.A01;
                            synchronized (eso) {
                                try {
                                    A00 = eso.A00(str);
                                    if (A00 == null) {
                                        if (eso.A01.containsKey(str)) {
                                            A0T = AnonymousClass001.A0T(0Pz.A0j("Can not load module ", str, ", download still pending."));
                                        } else {
                                            2vD A002 = c2v7.A00(2vC.A04);
                                            A002.A02(str);
                                            2vI A01 = A002.A01();
                                            try {
                                                C3P5.A00(A01);
                                                if (A01.A08() && A01.A04() != null && ((2vM) A01.A04()).A04) {
                                                    A00 = EZm.A00;
                                                    eso.A00.put(str, new F4m(A00));
                                                }
                                            } catch (InterruptedException unused) {
                                            }
                                            F4m f4m = (F4m) eso.A00.get(str);
                                            if (f4m != null) {
                                                Exception exc = f4m.A01;
                                                if (exc != null) {
                                                    A0T = 1BK.A0s(0Pz.A0j("Can not load module ", str, ", download failed before."), exc);
                                                }
                                            }
                                            Exception A03 = A01.A03();
                                            A0T = f4m == null ? 1BK.A0s(0Pz.A0j("Could not load module ", str, ", download was never requested."), A03) : 1BK.A0s(0Pz.A0W("Could not load module ", str), A03);
                                        }
                                        throw A0T;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                }
                            }
                            synchronized (eoZ) {
                                try {
                                    if (eoZ.A04 == null) {
                                        eoZ.A04 = A00;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                        }
                    }
                    this.mBaseModule = (ServiceModule) Class.forName(this.mModule.AyA()).asSubclass(ServiceModule.class).newInstance();
                } catch (Exception e) {
                    C01s c01s = this.mErrorReporter;
                    if (c01s != null) {
                        c01s.softReport("DynamicServiceModule", 0Pz.A0W("ServiceModule instance creation failed for ", this.mModule.AyA()), e);
                    }
                }
            }
            serviceModule = this.mBaseModule;
        }
        return serviceModule;
    }

    private native HybridData initHybrid(int i);

    @Override // com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule
    public ServiceConfiguration createConfiguration(I2f i2f) {
        ServiceModule baseInstance;
        ServiceConfiguration serviceConfiguration = null;
        if (this.mModule.BTI(i2f) && (baseInstance = getBaseInstance()) != null) {
            serviceConfiguration = baseInstance.createConfiguration(i2f);
        }
        return serviceConfiguration;
    }
}
