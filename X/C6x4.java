package X;

import android.graphics.drawable.Drawable;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6x4, reason: invalid class name */
/* loaded from: 6x4.class */
public final class C6x4 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6x4[] A01;
    public static final C6x4 A02;
    public static final C6x4 A03;
    public static final C6x4 A04;
    public static final C6x4 A05;
    public static final C6x4 A06;
    public static final C6x4 A07;
    public static final C6x4 A08;
    public static final C6x4 A09;
    public static final C6x4 A0A;
    public static final C6x4 A0B;
    public final int displayTextId;
    public Drawable drawable;
    public final int drawableResId;
    public Drawable recordDrawable;
    public final int recordDrawableResId;

    static {
        float f = 0.0f / 0.0f;
        C6x4 c6x4 = new C6x4(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 0, -1, -1, -1);
        A09 = c6x4;
        C6x4 c6x42 = new C6x4("NONE", 1, -1, -1, -1);
        A04 = c6x42;
        C6x4 c6x43 = new C6x4("NORMAL", 2, 2131960455, -1, -1);
        A05 = c6x43;
        C6x4 c6x44 = new C6x4("VIDEO", 3, 2131960453, 2132411157, 2132411156);
        A0A = c6x44;
        C6x4 c6x45 = new C6x4("BOOMERANG", 4, 2131960452, 2132346767, 2132346767);
        A02 = c6x45;
        C6x4 c6x46 = new C6x4("TEXT", 5, 2131960458, -1, -1);
        A08 = c6x46;
        C6x4 c6x47 = new C6x4("GALLERY", 6, 2131960454, -1, -1);
        A03 = c6x47;
        C6x4 c6x48 = new C6x4("SELFIE", 7, 2131960457, 2132346346, 2132346346);
        A07 = c6x48;
        C6x4 c6x49 = new C6x4("VIDEO_CALL", 8, -1, -1, -1);
        A0B = c6x49;
        C6x4 c6x410 = new C6x4("ROLL_CALL", 9, 2131960456, -1, -1);
        A06 = c6x410;
        C6x4[] c6x4Arr = {c6x4, c6x42, c6x43, c6x44, c6x45, c6x46, c6x47, c6x48, c6x49, c6x410};
        A01 = c6x4Arr;
        A00 = C00t.A00(c6x4Arr);
    }

    public C6x4(String str, int i, int i2, int i3, int i4) {
        this.displayTextId = i2;
        this.drawableResId = i3;
        this.recordDrawableResId = i4;
    }

    public static C6x4 valueOf(String str) {
        return (C6x4) Enum.valueOf(C6x4.class, str);
    }

    public static C6x4[] values() {
        return (C6x4[]) A01.clone();
    }
}
