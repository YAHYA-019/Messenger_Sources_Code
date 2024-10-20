package com.facebook.flexiblesampling;

import X.02W;
import X.0Pz;
import X.AnonymousClass001;
import java.util.Random;

/* loaded from: SamplingResult.class */
public final class SamplingResult {
    public static SamplingResult A06;
    public static final Random A07 = new Random();
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final long A04;
    public final boolean A05;

    public SamplingResult(int i, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = i;
        this.A01 = z;
        this.A03 = z3;
        this.A02 = z2;
        this.A04 = j;
        this.A05 = z4;
    }

    public static SamplingResult A00() {
        SamplingResult samplingResult = A06;
        if (samplingResult == null) {
            samplingResult = new SamplingResult(1, 0L, true, false, false, false);
            A06 = samplingResult;
        }
        return samplingResult;
    }

    public boolean A01() {
        int i = this.A00;
        boolean z = true;
        boolean z2 = false;
        if (i >= 0) {
            z2 = true;
        }
        02W.A06(z2, 0Pz.A0T("Not sure how to proceed with negative sampling rate ", i));
        if (i == 0) {
            return false;
        }
        if (A07.nextInt(i) != 0) {
            z = false;
        }
        return z;
    }

    public String toString() {
        return 0Pz.A12("com.facebook.flexiblesampling.SamplingResult", 0Pz.A0T("\nSamplingRate: ", this.A00), 0Pz.A1C("\nHasUserConfig: ", this.A01), 0Pz.A1C("\nInUserConfig: ", this.A03), 0Pz.A1C("\nInSessionlessConfig: ", this.A02), AnonymousClass001.A0h(AnonymousClass001.A0n("\nCollectionControlChecksum: "), this.A04), 0Pz.A1C("\nRequiresCollectionControlCheck: ", this.A05));
    }
}
