package com.facebook.spectrum;

import X.AnonymousClass001;
import com.facebook.spectrum.image.ImageSpecification;

/* loaded from: SpectrumResult.class */
public class SpectrumResult {
    public final ImageSpecification inputImageSpecification;
    public final ImageSpecification outputImageSpecification;
    public final String ruleName;
    public final long totalBytesRead;
    public final long totalBytesWritten;

    public SpectrumResult(String str, ImageSpecification imageSpecification, ImageSpecification imageSpecification2, long j, long j2) {
        this.ruleName = str;
        this.inputImageSpecification = imageSpecification;
        this.outputImageSpecification = imageSpecification2;
        this.totalBytesRead = j;
        this.totalBytesWritten = j2;
    }

    public ImageSpecification getInputImageSpecification() {
        return this.inputImageSpecification;
    }

    public ImageSpecification getOutputImageSpecification() {
        return this.outputImageSpecification;
    }

    public String getRuleName() {
        return this.ruleName;
    }

    public long getTotalBytesRead() {
        return this.totalBytesRead;
    }

    public long getTotalBytesWritten() {
        return this.totalBytesWritten;
    }

    public boolean isSuccessful() {
        return AnonymousClass001.A1T(this.ruleName);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("SpectrumResult{ruleName='");
        A0k.append(this.ruleName);
        A0k.append('\'');
        A0k.append(", inputImageSpecification=");
        A0k.append(this.inputImageSpecification);
        A0k.append(", outputImageSpecification=");
        A0k.append(this.outputImageSpecification);
        A0k.append(", totalBytesRead=");
        A0k.append(this.totalBytesRead);
        A0k.append(", totalBytesWritten=");
        A0k.append(this.totalBytesWritten);
        return AnonymousClass001.A0f(A0k);
    }
}
