package com.facebook.spectrum.options;

import X.AnonymousClass001;
import X.Ho0;
import com.facebook.spectrum.Configuration;
import com.facebook.spectrum.image.ImageMetadata;
import com.facebook.spectrum.image.ImagePixelSpecification;
import com.facebook.spectrum.requirements.CropRequirement;
import com.facebook.spectrum.requirements.EncodeRequirement;
import com.facebook.spectrum.requirements.ResizeRequirement;
import com.facebook.spectrum.requirements.RotateRequirement;

/* loaded from: Options.class */
public class Options {
    public final Configuration configuration;
    public final EncodeRequirement encodeRequirement;
    public final ImageMetadata metadata;
    public final ImagePixelSpecification outputPixelSpecification;
    public final Transformations transformations;

    public Options(Ho0 ho0) {
        this.encodeRequirement = null;
        this.transformations = new Transformations(ho0.A01, null, null);
        this.metadata = null;
        this.configuration = null;
        this.outputPixelSpecification = ho0.A00;
    }

    public Options(Configuration configuration, CropRequirement cropRequirement, EncodeRequirement encodeRequirement, ResizeRequirement resizeRequirement, RotateRequirement rotateRequirement) {
        this.encodeRequirement = encodeRequirement;
        this.transformations = new Transformations(resizeRequirement, cropRequirement, rotateRequirement);
        this.metadata = null;
        this.configuration = configuration;
        this.outputPixelSpecification = null;
    }

    public Options(EncodeRequirement encodeRequirement, Transformations transformations, ImageMetadata imageMetadata, Configuration configuration, ImagePixelSpecification imagePixelSpecification) {
        this.encodeRequirement = encodeRequirement;
        this.transformations = transformations;
        this.metadata = imageMetadata;
        this.configuration = configuration;
        this.outputPixelSpecification = imagePixelSpecification;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof Options)) {
                return false;
            }
            Options options = (Options) obj;
            EncodeRequirement encodeRequirement = this.encodeRequirement;
            EncodeRequirement encodeRequirement2 = options.encodeRequirement;
            if (encodeRequirement != null) {
                if (!encodeRequirement.equals(encodeRequirement2)) {
                    return false;
                }
            } else if (encodeRequirement2 != null) {
                return false;
            }
            Transformations transformations = this.transformations;
            Transformations transformations2 = options.transformations;
            if (transformations != null) {
                if (!transformations.equals(transformations2)) {
                    return false;
                }
            } else if (transformations2 != null) {
                return false;
            }
            ImageMetadata imageMetadata = this.metadata;
            ImageMetadata imageMetadata2 = options.metadata;
            if (imageMetadata != null) {
                if (!imageMetadata.equals(imageMetadata2)) {
                    return false;
                }
            } else if (imageMetadata2 != null) {
                return false;
            }
            Configuration configuration = this.configuration;
            Configuration configuration2 = options.configuration;
            if (configuration != null) {
                if (!configuration.equals(configuration2)) {
                    return false;
                }
            } else if (configuration2 != null) {
                return false;
            }
            if (this.outputPixelSpecification != options.outputPixelSpecification) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return toString("Options");
    }

    public String toString(String str) {
        StringBuilder A0n = AnonymousClass001.A0n(str);
        A0n.append("{encodeRequirement=");
        A0n.append(this.encodeRequirement);
        A0n.append(", transformations=");
        A0n.append(this.transformations);
        A0n.append(", metadata=");
        A0n.append(this.metadata);
        A0n.append(", configuration=");
        A0n.append(this.configuration);
        A0n.append(", outputPixelSpecification=");
        A0n.append(this.outputPixelSpecification);
        return AnonymousClass001.A0f(A0n);
    }
}
