package com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common;

import X.HC1;
import X.HOH;
import X.HpG;
import com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig;
import com.facebook.jni.HybridData;

/* loaded from: ARExperimentConfigImpl.class */
public final class ARExperimentConfigImpl extends ARExperimentConfig {
    public final HpG arExperimentUtil;

    public ARExperimentConfigImpl() {
        this(null);
    }

    public ARExperimentConfigImpl(HpG hpG) {
        this.mHybridData = initHybrid();
        this.arExperimentUtil = hpG;
    }

    private final native HybridData initHybrid();

    @Override // com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig
    public boolean getBool(int i, boolean z) {
        HC1 hc1;
        HpG hpG = this.arExperimentUtil;
        if (hpG != null) {
            if (i >= 0) {
                HC1[] hc1Arr = HOH.A00;
                if (i < hc1Arr.length) {
                    hc1 = hc1Arr[i];
                    z = hpG.A00(hc1, z);
                }
            }
            hc1 = HC1.A02;
            z = hpG.A00(hc1, z);
        }
        return z;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig
    public boolean getBoolWithoutLogging(int i, boolean z) {
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    @Override // com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public double getDouble(int r302, double r303) {
        /*
            r301 = this;
            r0 = r301
            X.HpG r0 = r0.arExperimentUtil
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L58
            r0 = r302
            if (r0 < 0) goto L5a
            java.lang.Integer[] r0 = X.HOH.A01
            r306 = r0
            r0 = r306
            int r0 = r0.length
            r307 = r0
            r0 = r302
            r1 = r307
            if (r0 >= r1) goto L5a
            r0 = r306
            r1 = r302
            r0 = r0[r1]
            r306 = r0
        L25:
            r0 = 0
            r307 = r0
            r0 = r306
            r1 = 0
            X.11T.A0F(r0, r1)
            java.lang.Integer r0 = X.0S2.A0C
            r308 = r0
            r0 = r306
            r1 = r308
            if (r0 != r1) goto L58
            r0 = r305
            X.1Br r0 = r0.A02
            r308 = r0
            r0 = r308
            X.1CO r0 = X.1Br.A06(r0)
            r305 = r0
            r0 = 37165314085945938(0x8409a8000f0252, double:3.566832508435517E-306)
            r309 = r0
            r0 = r305
            r1 = r309
            r2 = r303
            double r0 = r0.Ai8(r1, r2)
            r303 = r0
        L58:
            r0 = r303
            return r0
        L5a:
            java.lang.Integer r0 = X.0S2.A00
            r306 = r0
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common.ARExperimentConfigImpl.getDouble(int, double):double");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    @Override // com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long getLong(int r302, long r303) {
        /*
            r301 = this;
            r0 = r301
            X.HpG r0 = r0.arExperimentUtil
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L84
            r0 = r302
            if (r0 < 0) goto L86
            java.lang.Integer[] r0 = X.HOH.A02
            r306 = r0
            r0 = r306
            int r0 = r0.length
            r307 = r0
            r0 = r302
            r1 = r307
            if (r0 >= r1) goto L86
            r0 = r306
            r1 = r302
            r0 = r0[r1]
            r306 = r0
        L25:
            r0 = 0
            r307 = r0
            r0 = r306
            r1 = 0
            X.11T.A0F(r0, r1)
            java.lang.Integer r0 = X.0S2.A00
            r308 = r0
            r0 = r306
            r1 = r308
            if (r0 == r1) goto L84
            r0 = r306
            int r0 = r0.intValue()
            r307 = r0
            r0 = r307
            switch(r0) {
                case 1: goto L8e;
                case 2: goto L95;
                case 3: goto L91;
                case 16: goto Lc1;
                case 17: goto Ld7;
                case 18: goto Lab;
                case 29: goto Led;
                default: goto L84;
            }
        L84:
            r0 = r303
            return r0
        L86:
            java.lang.Integer r0 = X.0S2.A00
            r306 = r0
            goto L25
        L8e:
            r0 = 2
            long r0 = (long) r0
            return r0
        L91:
            r0 = 32768(0x8000, double:1.61895E-319)
            return r0
        L95:
            r0 = r305
            X.1Br r0 = r0.A02
            r308 = r0
            r0 = r308
            X.1CO r0 = X.1Br.A06(r0)
            r305 = r0
            r0 = 36596827918699724(0x82049f00000ccc, double:3.207319567158953E-306)
            r309 = r0
            goto L100
        Lab:
            r0 = r305
            X.1Br r0 = r0.A02
            r308 = r0
            r0 = r308
            X.1CO r0 = X.1Br.A06(r0)
            r305 = r0
            r0 = 36599164380975615(0x8206bf000111ff, double:3.208797155310405E-306)
            r309 = r0
            goto L100
        Lc1:
            r0 = r305
            X.1Br r0 = r0.A02
            r308 = r0
            r0 = r308
            X.1CO r0 = X.1Br.A06(r0)
            r305 = r0
            r0 = 36602102138541769(0x82096b000016c9, double:3.210655005024641E-306)
            r309 = r0
            goto L100
        Ld7:
            r0 = r305
            X.1Br r0 = r0.A02
            r308 = r0
            r0 = r308
            X.1CO r0 = X.1Br.A06(r0)
            r305 = r0
            r0 = 36603747111016791(0x820aea00001957, double:3.2116952922416173E-306)
            r309 = r0
            goto L100
        Led:
            r0 = r305
            X.1Br r0 = r0.A02
            r308 = r0
            r0 = r308
            X.1CO r0 = X.1Br.A06(r0)
            r305 = r0
            r0 = 36602364133119798(0x8209a800181736, double:3.210820691450754E-306)
            r309 = r0
        L100:
            r0 = r305
            r1 = r309
            r2 = r303
            long r0 = r0.Auz(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common.ARExperimentConfigImpl.getLong(int, long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    @Override // com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getString(int r302, java.lang.String r303) {
        /*
            r301 = this;
            r0 = 1
            r304 = r0
            r0 = r303
            r1 = r304
            X.11T.A0F(r0, r1)
            r0 = r301
            X.HpG r0 = r0.arExperimentUtil
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L79
            r0 = r302
            if (r0 < 0) goto L9b
            java.lang.Integer[] r0 = X.HOH.A03
            r306 = r0
            r0 = r306
            int r0 = r0.length
            r304 = r0
            r0 = r302
            r1 = r304
            if (r0 >= r1) goto L9b
            r0 = r306
            r1 = r302
            r0 = r0[r1]
            r306 = r0
        L2a:
            r0 = 0
            r304 = r0
            r0 = r306
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = 2
            r307 = r0
            java.lang.Integer r0 = X.0S2.A00
            r308 = r0
            r0 = r306
            r1 = r308
            if (r0 == r1) goto L79
            r0 = r306
            int r0 = r0.intValue()
            r309 = r0
            r0 = r309
            r1 = r307
            if (r0 == r1) goto L7b
            r0 = 4
            r304 = r0
            r0 = r309
            r1 = r304
            if (r0 != r1) goto L79
            r0 = r305
            X.1Br r0 = r0.A02
            r308 = r0
            r0 = r308
            X.1CO r0 = X.1Br.A06(r0)
            r310 = r0
            r0 = 36883839108646319(0x8309a8000605af, double:3.388826599382478E-306)
            r311 = r0
            r0 = r310
            r1 = r311
            r2 = r303
            java.lang.String r0 = r0.BCz(r1, r2)
            r303 = r0
        L75:
            r0 = r303
            X.11T.A0A(r0)
        L79:
            r0 = r303
            return r0
        L7b:
            r0 = r305
            X.1Br r0 = r0.A02
            r308 = r0
            r0 = r308
            X.1CO r0 = X.1Br.A06(r0)
            r310 = r0
            r0 = 36878410269655894(0x8304b800010356, double:3.3853933797447535E-306)
            r311 = r0
            r0 = r310
            r1 = r311
            java.lang.String r0 = r0.BCy(r1)
            r303 = r0
            goto L75
        L9b:
            java.lang.Integer r0 = X.0S2.A00
            r306 = r0
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common.ARExperimentConfigImpl.getString(int, java.lang.String):java.lang.String");
    }
}
