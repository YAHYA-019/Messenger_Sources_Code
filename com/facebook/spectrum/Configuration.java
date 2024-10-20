package com.facebook.spectrum;

import X.AnonymousClass001;
import com.facebook.spectrum.image.ImageChromaSamplingMode;
import com.facebook.spectrum.image.ImageColor;

/* loaded from: Configuration.class */
public class Configuration {
    public final ImageChromaSamplingMode chromaSamplingModeOverride;
    public final Integer compressionLevel;
    public final ImageColor defaultBackgroundColor;
    public final Boolean interpretMetadata;
    public final Boolean propagateChromaSamplingModeFromSource;
    public final SamplingMethod samplingMethod;
    public final Boolean useCompatibleDcScanOpt;
    public final Boolean useInterlacing;
    public final Boolean useOptimizeScan;
    public final Boolean useProgressive;
    public final Boolean usePsnrQuantTable;
    public final Boolean useTrellis;
    public final ImageHint webpImageHint;
    public final Integer webpMethod;

    /* loaded from: Configuration$ImageHint.class */
    public enum ImageHint {
        DEFAULT(0),
        PICTURE(1),
        PHOTO(2),
        GRAPH(3);

        public final int value;

        ImageHint(int i) {
            this.value = i;
        }

        public static ImageHint from(int i) {
            ImageHint[] values = values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= length) {
                    throw AnonymousClass001.A0L("Unsupported ImageHint");
                }
                ImageHint imageHint = values[i3];
                if (imageHint.value == i) {
                    return imageHint;
                }
                i2 = i3 + 1;
            }
        }
    }

    /* loaded from: Configuration$SamplingMethod.class */
    public enum SamplingMethod {
        Bicubic(1),
        MagicKernel(2);

        public final int value;

        SamplingMethod(int i) {
            this.value = i;
        }

        public static SamplingMethod from(int i) {
            SamplingMethod[] values = values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= length) {
                    throw AnonymousClass001.A0L("Unsupported SamplingMethod");
                }
                SamplingMethod samplingMethod = values[i3];
                if (samplingMethod.value == i) {
                    return samplingMethod;
                }
                i2 = i3 + 1;
            }
        }
    }

    public Configuration(ImageColor imageColor, Boolean bool, SamplingMethod samplingMethod, Boolean bool2, ImageChromaSamplingMode imageChromaSamplingMode, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num, Integer num2, ImageHint imageHint) {
        this.defaultBackgroundColor = imageColor;
        this.interpretMetadata = bool;
        this.propagateChromaSamplingModeFromSource = bool2;
        this.samplingMethod = samplingMethod;
        this.useTrellis = bool3;
        this.useProgressive = bool4;
        this.useOptimizeScan = bool5;
        this.useCompatibleDcScanOpt = bool6;
        this.chromaSamplingModeOverride = imageChromaSamplingMode;
        this.usePsnrQuantTable = bool7;
        this.useInterlacing = bool8;
        this.compressionLevel = num;
        this.webpMethod = num2;
        this.webpImageHint = imageHint;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Configuration configuration = (Configuration) obj;
            Boolean bool = this.interpretMetadata;
            Boolean bool2 = configuration.interpretMetadata;
            if (bool != null) {
                if (!bool.equals(bool2)) {
                    return false;
                }
            } else if (bool2 != null) {
                return false;
            }
            if (this.samplingMethod != configuration.samplingMethod || this.chromaSamplingModeOverride != configuration.chromaSamplingModeOverride) {
                return false;
            }
            Boolean bool3 = this.propagateChromaSamplingModeFromSource;
            Boolean bool4 = configuration.propagateChromaSamplingModeFromSource;
            if (bool3 != null) {
                if (!bool3.equals(bool4)) {
                    return false;
                }
            } else if (bool4 != null) {
                return false;
            }
            Boolean bool5 = this.useTrellis;
            Boolean bool6 = configuration.useTrellis;
            if (bool5 != null) {
                if (!bool5.equals(bool6)) {
                    return false;
                }
            } else if (bool6 != null) {
                return false;
            }
            Boolean bool7 = this.useProgressive;
            Boolean bool8 = configuration.useProgressive;
            if (bool7 != null) {
                if (!bool7.equals(bool8)) {
                    return false;
                }
            } else if (bool8 != null) {
                return false;
            }
            Boolean bool9 = this.useOptimizeScan;
            Boolean bool10 = configuration.useOptimizeScan;
            if (bool9 != null) {
                if (!bool9.equals(bool10)) {
                    return false;
                }
            } else if (bool10 != null) {
                return false;
            }
            Boolean bool11 = this.useCompatibleDcScanOpt;
            Boolean bool12 = configuration.useCompatibleDcScanOpt;
            if (bool11 != null) {
                if (!bool11.equals(bool12)) {
                    return false;
                }
            } else if (bool12 != null) {
                return false;
            }
            Boolean bool13 = this.usePsnrQuantTable;
            Boolean bool14 = configuration.usePsnrQuantTable;
            if (bool13 != null) {
                if (!bool13.equals(bool14)) {
                    return false;
                }
            } else if (bool14 != null) {
                return false;
            }
            Boolean bool15 = this.useInterlacing;
            Boolean bool16 = configuration.useInterlacing;
            if (bool15 != null) {
                if (!bool15.equals(bool16)) {
                    return false;
                }
            } else if (bool16 != null) {
                return false;
            }
            Integer num = this.compressionLevel;
            Integer num2 = configuration.compressionLevel;
            if (num != null) {
                if (!num.equals(num2)) {
                    return false;
                }
            } else if (num2 != null) {
                return false;
            }
            Integer num3 = this.webpMethod;
            Integer num4 = configuration.webpMethod;
            if (num3 != null) {
                if (!num3.equals(num4)) {
                    return false;
                }
            } else if (num4 != null) {
                return false;
            }
            if (this.webpImageHint != configuration.webpImageHint) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Configuration{defaultBackgroundColor=");
        A0k.append((Object) null);
        A0k.append(", interpretMetadata=");
        A0k.append(this.interpretMetadata);
        A0k.append(", samplingMethod=");
        A0k.append(this.samplingMethod);
        A0k.append(", chromaSamplingModeOverride=");
        A0k.append(this.chromaSamplingModeOverride);
        A0k.append(", propagateChromaSamplingModeFromSource=");
        A0k.append(this.propagateChromaSamplingModeFromSource);
        A0k.append(", useTrellis=");
        A0k.append(this.useTrellis);
        A0k.append(", useProgressive=");
        A0k.append(this.useProgressive);
        A0k.append(", useOptimizeScan=");
        A0k.append(this.useOptimizeScan);
        A0k.append(", useCompatibleDcScanOpt=");
        A0k.append(this.useCompatibleDcScanOpt);
        A0k.append(", usePsnrQuantTable=");
        A0k.append(this.usePsnrQuantTable);
        A0k.append(", useInterlacing=");
        A0k.append(this.useInterlacing);
        A0k.append(", compressionLevel=");
        A0k.append(this.compressionLevel);
        A0k.append(", webpMethod=");
        A0k.append(this.webpMethod);
        A0k.append(", webpImageHint=");
        A0k.append(this.webpImageHint);
        return AnonymousClass001.A0f(A0k);
    }
}
