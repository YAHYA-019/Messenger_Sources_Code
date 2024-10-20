package com.facebook.spectrum.image;

import X.3Hr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import android.graphics.Bitmap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'RGB' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: ImagePixelSpecification.class */
public final class ImagePixelSpecification {
    public static final /* synthetic */ ImagePixelSpecification[] $VALUES;
    public static final ImagePixelSpecification ABGR;
    public static final ImagePixelSpecification ARGB;
    public static final ImagePixelSpecification A_GRAY;
    public static final ImagePixelSpecification BGR;
    public static final ImagePixelSpecification BGRA;
    public static final ImagePixelSpecification GRAY;
    public static final ImagePixelSpecification GRAY_A;
    public static final ImagePixelSpecification RGB;
    public static final ImagePixelSpecification RGBA;
    public final AlphaInfo alphaInfo;
    public final int bytesPerPixel;
    public final ColorModel colorModel;
    public final ComponentsOrder componentsOrder;

    /* loaded from: ImagePixelSpecification$AlphaInfo.class */
    public enum AlphaInfo {
        NONE(0),
        FIRST(1),
        LAST(2),
        SKIP_FIRST(3),
        SKIP_LAST(4),
        PREMULTIPLIED_FIRST(5),
        PREMULTIPLIED_LAST(6);

        public final int value;

        AlphaInfo(int i) {
            this.value = i;
        }

        public static AlphaInfo from(int i) {
            AlphaInfo[] values = values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= length) {
                    throw AnonymousClass001.A0L("Unsupported PixelAlphaInfo");
                }
                AlphaInfo alphaInfo = values[i3];
                if (alphaInfo.value == i) {
                    return alphaInfo;
                }
                i2 = i3 + 1;
            }
        }
    }

    /* loaded from: ImagePixelSpecification$ColorModel.class */
    public enum ColorModel {
        RGB("rgb", 3, true),
        GRAY("gray", 1, true),
        CMYK("cmyk", 4, false),
        YCBCR("ycbcr", 3, false),
        YCBCRK("ycbcrk", 4, false);

        public final String identifier;
        public final int numberOfColorComponents;
        public final boolean supportsExtraAlphaChannel;

        ColorModel(String str, int i, boolean z) {
            this.identifier = str;
            this.numberOfColorComponents = i;
            this.supportsExtraAlphaChannel = z;
        }

        public static ColorModel from(String str, int i, boolean z) {
            ColorModel[] values = values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= length) {
                    throw AnonymousClass001.A0L("Unsupported PixelColorModel");
                }
                ColorModel colorModel = values[i3];
                if (colorModel.identifier.equals(str) && colorModel.numberOfColorComponents == i && colorModel.supportsExtraAlphaChannel == z) {
                    return colorModel;
                }
                i2 = i3 + 1;
            }
        }
    }

    /* loaded from: ImagePixelSpecification$ComponentsOrder.class */
    public enum ComponentsOrder {
        NATURAL(0),
        REVERSED(1);

        public final int value;

        ComponentsOrder(int i) {
            this.value = i;
        }

        public static ComponentsOrder from(int i) {
            ComponentsOrder[] values = values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= length) {
                    throw AnonymousClass001.A0L("Unsupported PixelComponentsOrder");
                }
                ComponentsOrder componentsOrder = values[i3];
                if (componentsOrder.value == i) {
                    return componentsOrder;
                }
                i2 = i3 + 1;
            }
        }
    }

    static {
        ColorModel colorModel = ColorModel.RGB;
        AlphaInfo alphaInfo = AlphaInfo.NONE;
        ComponentsOrder componentsOrder = ComponentsOrder.NATURAL;
        ImagePixelSpecification imagePixelSpecification = new ImagePixelSpecification("RGB", 0, colorModel, 3, alphaInfo, componentsOrder);
        RGB = imagePixelSpecification;
        AlphaInfo alphaInfo2 = AlphaInfo.LAST;
        ImagePixelSpecification imagePixelSpecification2 = new ImagePixelSpecification("RGBA", 1, colorModel, 4, alphaInfo2, componentsOrder);
        RGBA = imagePixelSpecification2;
        ColorModel colorModel2 = ColorModel.GRAY;
        ImagePixelSpecification imagePixelSpecification3 = new ImagePixelSpecification("GRAY", 2, colorModel2, 1, alphaInfo, componentsOrder);
        GRAY = imagePixelSpecification3;
        ImagePixelSpecification imagePixelSpecification4 = new ImagePixelSpecification("GRAY_A", 3, colorModel2, 1, alphaInfo2, componentsOrder);
        GRAY_A = imagePixelSpecification4;
        AlphaInfo alphaInfo3 = AlphaInfo.FIRST;
        ImagePixelSpecification imagePixelSpecification5 = new ImagePixelSpecification("A_GRAY", 4, colorModel2, 1, alphaInfo3, componentsOrder);
        A_GRAY = imagePixelSpecification5;
        ImagePixelSpecification imagePixelSpecification6 = new ImagePixelSpecification("ARGB", 5, colorModel, 4, alphaInfo3, componentsOrder);
        ARGB = imagePixelSpecification6;
        ComponentsOrder componentsOrder2 = ComponentsOrder.REVERSED;
        ImagePixelSpecification imagePixelSpecification7 = new ImagePixelSpecification("BGR", 6, colorModel, 3, alphaInfo, componentsOrder2);
        BGR = imagePixelSpecification7;
        ImagePixelSpecification imagePixelSpecification8 = new ImagePixelSpecification("BGRA", 7, colorModel, 4, alphaInfo3, componentsOrder2);
        BGRA = imagePixelSpecification8;
        ImagePixelSpecification imagePixelSpecification9 = new ImagePixelSpecification("ABGR", 8, colorModel, 4, alphaInfo2, componentsOrder2);
        ABGR = imagePixelSpecification9;
        $VALUES = new ImagePixelSpecification[]{imagePixelSpecification, imagePixelSpecification2, imagePixelSpecification3, imagePixelSpecification4, imagePixelSpecification5, imagePixelSpecification6, imagePixelSpecification7, imagePixelSpecification8, imagePixelSpecification9};
    }

    public ImagePixelSpecification(String str, int i, ColorModel colorModel, int i2, AlphaInfo alphaInfo, ComponentsOrder componentsOrder) {
        this.colorModel = colorModel;
        this.bytesPerPixel = i2;
        this.alphaInfo = alphaInfo;
        this.componentsOrder = componentsOrder;
    }

    public static ImagePixelSpecification from(Bitmap.Config config) {
        int i = 3Hr.A00[config.ordinal()];
        if (i == 1) {
            return GRAY;
        }
        if (i == 2) {
            return RGBA;
        }
        throw AnonymousClass002.A0C(config, "Unsupported Bitmap.Config: ", AnonymousClass001.A0k());
    }

    public static ImagePixelSpecification from(ColorModel colorModel, int i, AlphaInfo alphaInfo, ComponentsOrder componentsOrder) {
        ImagePixelSpecification[] values = values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= length) {
                throw AnonymousClass001.A0L("Unsupported ImagePixelSpecification");
            }
            ImagePixelSpecification imagePixelSpecification = values[i3];
            if (imagePixelSpecification.colorModel == colorModel && imagePixelSpecification.bytesPerPixel == i && imagePixelSpecification.alphaInfo == alphaInfo && imagePixelSpecification.componentsOrder == componentsOrder) {
                return imagePixelSpecification;
            }
            i2 = i3 + 1;
        }
    }

    public static ImagePixelSpecification valueOf(String str) {
        return (ImagePixelSpecification) Enum.valueOf(ImagePixelSpecification.class, str);
    }

    public static ImagePixelSpecification[] values() {
        return (ImagePixelSpecification[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ImagePixelSpecification{colorModel=");
        A0k.append(this.colorModel);
        A0k.append(", bytesPerPixel=");
        A0k.append(this.bytesPerPixel);
        A0k.append(", alphaInfo=");
        A0k.append(this.alphaInfo);
        A0k.append(", componentsOrder=");
        A0k.append(this.componentsOrder);
        return AnonymousClass001.A0f(A0k);
    }
}
