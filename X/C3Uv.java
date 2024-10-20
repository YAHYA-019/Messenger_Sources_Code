package X;

import android.content.Context;
import android.os.Looper;
import com.facebook.falco.fabric.FFSingletonJNILogger;
import com.facebook.falco.sampling.FFSamplingBridgeJava;
import com.facebook.flexiblesampling.SamplingResult;
import java.io.IOException;

/* renamed from: X.3Uv, reason: invalid class name */
/* loaded from: 3Uv.class */
public final class C3Uv implements C3mL {
    public long A00;
    public C32t A01;
    public 1kY A02;
    public final Context A03;
    public final C3N5 A04;
    public final 3LZ A05;
    public final 3J0 A06;
    public final HnI A07;
    public final C15h A08;

    public C3Uv(Context context, Looper looper, 3IX r304, 3G3 r305, C3N5 c3n5, 3LZ r307, 3J0 r308, HnI hnI, C15h c15h) {
        this.A04 = c3n5;
        this.A03 = context;
        this.A07 = hnI;
        this.A08 = c15h;
        this.A05 = r307;
        this.A06 = r308;
        this.A01 = new C32t(looper, r304, r305);
        try {
            C0il.A05(context, 0);
            FFSingletonJNILogger.setAppId("256002347743983");
            FFSingletonJNILogger.setClientToken("62f8ce9f74b12f84c123cc23437a4a32");
            FFSingletonJNILogger.setUserAgent(r307.A01);
            FFSingletonJNILogger.setSamplingEnabled(true);
            FFSingletonJNILogger.setCCEnabled(false);
            FFSingletonJNILogger.setFailOpenSampling(true);
            FFSingletonJNILogger.setBaseFilePath(r308.A00);
            FFSingletonJNILogger.setOneFabricHCEnabled(true);
            FFSingletonJNILogger.setMaxPayloadSize(204800);
            FFSingletonJNILogger.setMaxNumberOfEvents(50);
            FFSingletonJNILogger.setStaggerUploadDelay(-1);
            FFSamplingBridgeJava.init(hnI, c15h, r307.A02);
        } catch (IOException unused) {
            throw AnonymousClass001.A0T("SoLoader.init() failed");
        }
    }

    public void Bgk(1Sv r302) {
    }

    public void CZE(C1ke c1ke) {
        11T.A0F(c1ke, 0);
        C32t c32t = this.A01;
        1BK.A1I(c32t, c1ke, c32t.A01);
    }

    public void CZF(C1ke c1ke) {
        11T.A0F(c1ke, 0);
        C32t c32t = this.A01;
        1BK.A1I(c32t, c1ke, c32t.A01);
    }

    @Override // X.C3mL
    public boolean Cke(int i) {
        FFSingletonJNILogger.triggerUploadNowForInternalUse();
        return true;
    }

    @Override // X.C3mL
    public SamplingResult Cxx(String str) {
        int i;
        11T.A0F(str, 0);
        boolean z = false;
        FFSingletonJNILogger.CollectionControlDecision collectionControlCheck = FFSingletonJNILogger.collectionControlCheck(this.A00, str, 1L, System.currentTimeMillis(), false, false, "", "");
        boolean z2 = false;
        FFSingletonJNILogger.CollectionControlDecisionStatus collectionControlDecisionStatus = collectionControlCheck.status;
        FFSingletonJNILogger.CollectionControlDecisionStatus collectionControlDecisionStatus2 = FFSingletonJNILogger.CollectionControlDecisionStatus.SUCCESS;
        boolean z3 = true;
        if (collectionControlDecisionStatus == collectionControlDecisionStatus2) {
            i = (int) collectionControlCheck.sampleRate;
            1kY r0 = this.A02;
            if (r0 == null) {
                11T.A0L("batchSession");
                throw 0Q8.createAndThrow();
            }
            if (r0.A01 != null) {
                z2 = true;
                z = true;
            }
        } else {
            if (collectionControlDecisionStatus == FFSingletonJNILogger.CollectionControlDecisionStatus.EVENT_CONFIG_NOT_SET) {
                z2 = true;
            }
            i = 1;
        }
        long j = collectionControlCheck.collectionControlChecksum;
        if (collectionControlDecisionStatus == collectionControlDecisionStatus2) {
            z3 = false;
        }
        return new SamplingResult(i, j, z2, false, z, z3);
    }

    public void D1y(1kY r302) {
        11T.A0F(r302, 0);
        this.A02 = r302;
        1Sv r0 = r302.A01;
        if (r0 != null) {
            C3N5 c3n5 = this.A04;
            String str = r0.A02;
            Long l = null;
            c3n5.A01 = str != null ? 0CW.A0e(str) : null;
            c3n5.A00 = str != null ? 0CW.A0e(str) : null;
            String str2 = r0.A00;
            if (!11T.A0O(str, str2)) {
                if (str2 != null) {
                    l = 0CW.A0e(str2);
                }
                c3n5.A00 = l;
            }
            String str3 = r0.A01;
            if (str3 != null) {
                c3n5.A02.add(str3);
            }
        }
        C3N5 c3n52 = this.A04;
        long j = 0;
        String str4 = c3n52.A06;
        String str5 = c3n52.A07;
        long j2 = c3n52.A03;
        String str6 = c3n52.A05;
        1kY r02 = this.A02;
        if (r02 == null) {
            11T.A0L("batchSession");
            throw 0Q8.createAndThrow();
        }
        String str7 = r02.A02;
        long j3 = c3n52.A04.BIX().A00;
        String[] strArr = (String[]) c3n52.A02.toArray(new String[0]);
        Long l2 = c3n52.A00;
        long longValue = l2 != null ? l2.longValue() : 0L;
        Long l3 = c3n52.A01;
        if (l3 != null) {
            j = l3.longValue();
        }
        this.A00 = FFSingletonJNILogger.createIdentitiesWithFacebookUser(str4, str5, "", j2, str6, "", str7, 0, j3, strArr, longValue, j);
        FFSingletonJNILogger.setShouldRequestDebugConfig(true);
        C32t c32t = this.A01;
        1BK.A1I(c32t, Long.valueOf(this.A00), c32t.A02);
    }

    public void D5D() {
    }
}
