package com.facebook.spectrum.image;

import X.1BL;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.DKB;

/* loaded from: ImageSpecification.class */
public class ImageSpecification {
    public final ImageChromaSamplingMode chromaSamplingMode;
    public final ImageFormat format;
    public final ImageMetadata metadata;
    public final ImageOrientation orientation;
    public final ImagePixelSpecification pixelSpecification;
    public final ImageSize size;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.spectrum.image.ImageMetadata, java.lang.Object] */
    public ImageSpecification(ImageSize imageSize, ImageFormat imageFormat, ImagePixelSpecification imagePixelSpecification) {
        this(imageSize, imageFormat, imagePixelSpecification, ImageOrientation.UP, null, new Object());
    }

    public ImageSpecification(ImageSize imageSize, ImageFormat imageFormat, ImagePixelSpecification imagePixelSpecification, ImageOrientation imageOrientation, ImageChromaSamplingMode imageChromaSamplingMode, ImageMetadata imageMetadata) {
        imageSize.getClass();
        this.size = imageSize;
        imageFormat.getClass();
        this.format = imageFormat;
        imagePixelSpecification.getClass();
        this.pixelSpecification = imagePixelSpecification;
        imageOrientation.getClass();
        this.orientation = imageOrientation;
        this.chromaSamplingMode = imageChromaSamplingMode;
        this.metadata = imageMetadata;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ImageSpecification imageSpecification = (ImageSpecification) obj;
            if (!this.size.equals(imageSpecification.size) || !this.format.equals(imageSpecification.format) || this.pixelSpecification != imageSpecification.pixelSpecification || this.orientation != imageSpecification.orientation || this.chromaSamplingMode != imageSpecification.chromaSamplingMode) {
                return false;
            }
            ImageMetadata imageMetadata = this.metadata;
            ImageMetadata imageMetadata2 = imageSpecification.metadata;
            if (imageMetadata != null) {
                z = imageMetadata.equals(imageMetadata2);
            } else if (imageMetadata2 != null) {
                return false;
            }
        }
        return z;
    }

    public int hashCode() {
        return (AnonymousClass002.A05(this.orientation, AnonymousClass002.A05(this.pixelSpecification, AnonymousClass002.A05(this.format, 1BL.A03(this.size)))) + AnonymousClass002.A04(this.chromaSamplingMode)) * 31;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ImageSpecification{size=");
        A0k.append(this.size);
        A0k.append(", format=");
        A0k.append(this.format);
        A0k.append(", pixelSpecification=");
        A0k.append(this.pixelSpecification);
        A0k.append(DKB.A00(35));
        A0k.append(this.orientation);
        A0k.append(", chromaSamplingMode=");
        A0k.append(this.chromaSamplingMode);
        A0k.append(", metadata=");
        A0k.append(this.metadata);
        return AnonymousClass001.A0f(A0k);
    }
}
