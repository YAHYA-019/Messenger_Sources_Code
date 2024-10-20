package com.facebook.falco.sampling;

import X.0QE;
import X.0fH;
import X.1BJ;
import X.1Sm;
import X.29S;
import X.29T;
import X.29W;
import X.2An;
import X.3cZ;
import X.4VG;
import X.4VS;
import X.BXt;
import X.C01s;
import X.C0il;
import X.C15h;
import X.C3ly;
import X.C4Sk;
import X.HnI;
import X.Juw;
import X.N0p;
import X.N0q;
import X.RgO;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.hyperthrift.HyperThriftBase;
import com.facebook.logginginfra.falco.Checksum;
import com.facebook.logginginfra.falco.Identity;
import com.facebook.logginginfra.falco.SetQPLConfigDirective;
import com.facebook.systrace.SystraceMessage;
import com.facebook.tigon.iface.TigonServiceHolder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: FFSamplingBridgeJava.class */
public class FFSamplingBridgeJava {
    public static HnI sHyperThrift;
    public static boolean sIsInitialized;
    public static C15h sQPLConfigHandlerProvider;
    public static C15h sTigonServiceHolderProvider;

    static {
        C0il.A0B("ffqplbridge");
    }

    public static 2An A00(29T r301, ByteBuffer byteBuffer) {
        byte[] bArr;
        ByteBuffer byteBuffer2 = C4Sk.A00;
        if (byteBuffer == null) {
            bArr = C4Sk.A01;
        } else if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0 && byteBuffer.position() == 0 && byteBuffer.limit() == byteBuffer.capacity()) {
            bArr = byteBuffer.array();
        } else {
            ByteBuffer duplicate = byteBuffer.duplicate();
            bArr = new byte[duplicate.remaining()];
            duplicate.get(bArr);
        }
        return BXt.A00(r301, bArr);
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [X.29W, java.lang.Object] */
    public static byte[] getQPLConfigDirectives(ByteBuffer byteBuffer) {
        Checksum checksum;
        2An A00 = A00(new 29S(), byteBuffer);
        4VS r0 = (4VS) sQPLConfigHandlerProvider.get();
        HyperThriftBase A002 = sHyperThrift.A00(A00, "com.facebook.logginginfra.falco.PrincipalSubject");
        Object[] objArr = new Object[3];
        objArr[0] = A002;
        objArr[1] = "v1";
        Identity identity = (Identity) A002.A00(3);
        Juw juw = (Juw) r0.A01.get();
        if (identity != null && juw != null) {
            AtomicReference atomicReference = juw.A05;
            4VG r02 = (4VG) atomicReference.get();
            if (r02 == null || !Juw.A00(identity, r02.A01)) {
                try {
                    try {
                        4VG A003 = 4VG.A00(juw.A01, identity, (1Sm) juw.A06.get(), juw.A04, atomicReference);
                        if (A003 != null) {
                            checksum = A003.A00;
                        }
                    } catch (IOException e) {
                        0fH.A0u("QPLConfig", 1BJ.A00(407), e);
                    }
                } catch (Exception e2) {
                    C01s c01s = (C01s) juw.A07.get();
                    if (c01s != null) {
                        c01s.softReport("QPLConfig", "Failed to load config", e2);
                    }
                }
            } else {
                checksum = r02.A00;
            }
            objArr[2] = checksum;
        }
        Object[] A004 = HyperThriftBase.Builder.A00(objArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        29S r03 = new 29S();
        ?? obj = new Object();
        ((29W) obj).A00 = null;
        ((29W) obj).A01 = byteArrayOutputStream;
        RgO rgO = new RgO(sHyperThrift.A00, r03.B5O((29W) obj));
        long j = 4;
        SystraceMessage.A00(SystraceMessage.A00, "HyperThriftWriter.write", j).A00("com.facebook.logginginfra.falco.GetQPLConfigDirective", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        try {
            N0q A005 = rgO.A00.A00("com.facebook.logginginfra.falco.GetQPLConfigDirective");
            2An r04 = rgO.A01;
            new Object();
            r04.A0O();
            N0p[] n0pArr = A005.A02;
            int length = n0pArr.length;
            for (int i = 0; i < length; i++) {
                N0p n0p = n0pArr[i];
                Object obj2 = A004[i];
                if (obj2 != null && obj2 != HyperThriftBase.A02) {
                    RgO.A01(rgO, n0p, obj2);
                }
            }
            r04.A0N();
            r04.A0P();
            0QE.A00(j, 228955420);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            0QE.A00(j, -133026028);
            throw th;
        }
    }

    public static void init(HnI hnI, C15h c15h, C15h c15h2) {
        synchronized (FFSamplingBridgeJava.class) {
            if (!sIsInitialized) {
                sHyperThrift = hnI;
                sQPLConfigHandlerProvider = c15h;
                sTigonServiceHolderProvider = c15h2;
                initNative();
                sIsInitialized = true;
            }
        }
    }

    public static native void initNative();

    public static TigonServiceHolder initializeTigonServiceForOneFabric() {
        return (TigonServiceHolder) sTigonServiceHolderProvider.get();
    }

    /* JADX WARN: Type inference failed for: r0v83, types: [X.29W, java.lang.Object] */
    public static void setQPLConfigDirectives(ByteBuffer byteBuffer) {
        4VG A02;
        boolean z;
        2An A00 = A00(new 29S(), byteBuffer);
        4VS r0 = (4VS) sQPLConfigHandlerProvider.get();
        SetQPLConfigDirective setQPLConfigDirective = (SetQPLConfigDirective) sHyperThrift.A00(A00, "com.facebook.logginginfra.falco.SetQPLConfigDirective");
        Object A002 = setQPLConfigDirective.A00(3);
        if (A002 != null) {
            C15h c15h = r0.A01;
            4VG r02 = (4VG) ((Juw) c15h.get()).A05.get();
            Checksum checksum = r02 == null ? null : r02.A00;
            if ((checksum == null || !checksum.equals(A002)) && (A02 = r0.A00.A02(setQPLConfigDirective)) != null) {
                Juw juw = (Juw) c15h.get();
                Identity A003 = juw.A03.A00();
                Identity identity = A02.A01;
                if (Juw.A00(A003, identity)) {
                    juw.A05.set(A02);
                }
                AwakeTimeSinceBootClock awakeTimeSinceBootClock = juw.A00;
                long nowNanos = awakeTimeSinceBootClock.nowNanos();
                1Sm r03 = (1Sm) juw.A06.get();
                HnI hnI = juw.A01;
                try {
                    ObjectOutputStream A01 = r03.A01(4VG.A01(identity));
                    try {
                        A01.writeInt(1);
                        3cZ r04 = new 3cZ();
                        ?? obj = new Object();
                        ((29W) obj).A00 = null;
                        ((29W) obj).A01 = A01;
                        RgO.A00(setQPLConfigDirective, new RgO(hnI.A00, r04.B5O((29W) obj)), "com.facebook.logginginfra.falco.SetQPLConfigDirective");
                        A01.close();
                        z = true;
                    } finally {
                    }
                } catch (IOException e) {
                    0fH.A0u("QPLConfig", 1BJ.A00(1276), e);
                    z = false;
                }
                long nowNanos2 = awakeTimeSinceBootClock.nowNanos() - nowNanos;
                C3ly c3ly = juw.A0G;
                if (c3ly != null) {
                    c3ly.AHG(nowNanos2, z);
                }
                if (!z) {
                    nowNanos2 = -nowNanos2;
                }
                juw.A0F = nowNanos2;
            }
        }
    }
}
