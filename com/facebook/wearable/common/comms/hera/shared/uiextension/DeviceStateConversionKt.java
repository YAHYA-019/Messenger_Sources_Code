package com.facebook.wearable.common.comms.hera.shared.uiextension;

import X.DKE;
import X.HCp;
import X.HCr;
import X.HCs;
import X.HCt;
import X.T1x;
import X.T20;
import X.T22;
import X.T23;
import X.T2A;
import X.T2E;
import X.T2F;
import X.T2G;
import X.T2I;
import X.T2K;
import X.T5o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: DeviceStateConversionKt.class */
public abstract class DeviceStateConversionKt {

    /* loaded from: DeviceStateConversionKt$WhenMappings.class */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[HCr.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HCt.values().length];
            try {
                iArr2[2] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[3] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[5] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[HCp.values().length];
            try {
                iArr3[2] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[HCs.values().length];
            try {
                iArr4[3] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[4] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static final T5o toStatusIndicatorState(HCp hCp) {
        int A0C = DKE.A0C(hCp);
        return (T5o) (A0C != 2 ? A0C != 1 ? null : T2G.A00 : T20.A00);
    }

    public static final T5o toStatusIndicatorState(HCr hCr) {
        T2K t2k;
        int A0C = DKE.A0C(hCr);
        T2K t2k2 = null;
        if (A0C == 1) {
            t2k = new T2K((DefaultConstructorMarker) null, 1, 0L);
        } else if (A0C == 2) {
            t2k = new T2F(60);
        } else {
            if (A0C != 3) {
                if (A0C == 4) {
                    t2k = T2E.A00;
                }
                return (T5o) t2k2;
            }
            t2k = new T1x(20);
        }
        t2k2 = t2k;
        return (T5o) t2k2;
    }

    public static final T5o toStatusIndicatorState(HCs hCs) {
        int A0C = DKE.A0C(hCs);
        return (A0C == 3 || A0C == 4) ? T2A.A00 : null;
    }

    public static final T5o toStatusIndicatorState(HCt hCt) {
        int A0C = DKE.A0C(hCt);
        return (T5o) ((A0C == 2 || A0C == 1 || A0C == 3) ? T2I.A00 : A0C != 5 ? A0C != 4 ? null : T22.A00 : T23.A00);
    }
}
