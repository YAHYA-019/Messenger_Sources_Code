package com.facebook.spectrum.image;

/* loaded from: EncodedImageFormat.class */
public class EncodedImageFormat extends ImageFormat {
    public static final EncodedImageFormat JPEG = new ImageFormat("jpeg");
    public static final EncodedImageFormat PNG = new ImageFormat("png");
    public static final EncodedImageFormat WEBP = new ImageFormat("webp");
    public static final EncodedImageFormat GIF = new ImageFormat("gif");
    public static final EncodedImageFormat HEIF = new ImageFormat("heif");
    public static final EncodedImageFormat AVIF = new ImageFormat("avif");

    public EncodedImageFormat(String str) {
        super(str);
    }

    @Override // com.facebook.spectrum.image.ImageFormat
    public boolean isEncoded() {
        return true;
    }
}
