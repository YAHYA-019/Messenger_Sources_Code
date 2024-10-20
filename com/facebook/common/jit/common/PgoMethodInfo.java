package com.facebook.common.jit.common;

import X.AnonymousClass001;

/* loaded from: PgoMethodInfo.class */
public class PgoMethodInfo {
    public final double A00;
    public final double A01;
    public final int A02;
    public final int A03;
    public final MethodInfo A04;
    public final boolean A05;

    public PgoMethodInfo(MethodInfo methodInfo) {
        this.A04 = methodInfo;
        this.A05 = false;
        this.A02 = 0;
        this.A03 = 0;
        this.A01 = 0.0d;
        this.A00 = 0.0d;
    }

    public PgoMethodInfo(MethodInfo methodInfo, int i, int i2, double d, double d2) {
        this.A04 = methodInfo;
        this.A05 = true;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = d;
        this.A00 = d2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o("[ PgoMethodInfo ");
        A0o.append("methodInfo: ");
        A0o.append(this.A04);
        A0o.append(", ");
        A0o.append("hasExtraInfo: ");
        boolean z = this.A05;
        A0o.append(z);
        A0o.append(" ");
        if (z) {
            A0o.append("[ ");
            A0o.append("count: ");
            A0o.append(this.A02);
            A0o.append(", ");
            A0o.append("methodSize: ");
            A0o.append(this.A03);
            A0o.append(", ");
            A0o.append("usedPercent: ");
            A0o.append(this.A01);
            A0o.append(", ");
            A0o.append("topKUsedPercentage: ");
            A0o.append(this.A00);
            A0o.append(" ]");
        }
        return AnonymousClass001.A0g(A0o, ']');
    }
}
