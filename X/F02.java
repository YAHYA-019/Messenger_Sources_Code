package X;

import android.graphics.Paint;
import android.text.Layout;

/* loaded from: F02.class */
public abstract class F02 {
    public static final float A00(Paint paint, Layout layout, int i) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        JVA jva = KyA.A01;
        if (!AnonymousClass001.A1P(layout.getEllipsisCount(i)) || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i)) - lineLeft) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment == null || EZN.A00[paragraphAlignment.ordinal()] != 1) {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - primaryHorizontal;
        } else {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - primaryHorizontal) / 2.0f;
        }
        return abs + width;
    }

    public static final float A01(Paint paint, Layout layout, int i) {
        float width;
        float width2;
        JVA jva = KyA.A01;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        float f = 0.0f / 0.0f;
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float lineRight = (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i))) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment == null || EZN.A00[paragraphAlignment.ordinal()] != 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - lineRight;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - lineRight) / 2.0f;
        }
        return width - width2;
    }
}
