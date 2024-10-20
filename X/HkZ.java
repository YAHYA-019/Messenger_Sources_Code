package X;

import android.graphics.RectF;
import com.facebook.inspiration.imagetovideo.model.VideoConversionConfiguration;
import com.facebook.videocodec.policy.VideoTranscodeProfileLevelParams;
import com.google.common.collect.ImmutableList;
import java.io.File;
import java.util.List;

/* loaded from: HkZ.class */
public final class HkZ {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final RectF A04;
    public final VideoConversionConfiguration A05;
    public final How A06;
    public final C4yx A07;
    public final 7Xn A08;
    public final VideoTranscodeProfileLevelParams A09;
    public final File A0A;
    public final File A0B;
    public final String A0C;
    public final List A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public HkZ(RectF rectF, VideoConversionConfiguration videoConversionConfiguration, How how, C4yx c4yx, 7Xn r306, VideoTranscodeProfileLevelParams videoTranscodeProfileLevelParams, ImmutableList immutableList, File file, File file2, String str, float f, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A0A = file;
        this.A0B = file2;
        c4yx.getClass();
        this.A07 = c4yx;
        this.A04 = rectF;
        this.A08 = r306;
        this.A03 = i3;
        this.A01 = i;
        this.A06 = how;
        this.A0E = z3;
        this.A0F = z4;
        this.A0I = z6;
        this.A0J = z7;
        this.A0K = z2;
        this.A09 = videoTranscodeProfileLevelParams;
        this.A02 = i2;
        this.A0D = immutableList;
        this.A0G = z5;
        this.A0H = z;
        this.A0C = str;
        this.A00 = f;
        this.A05 = videoConversionConfiguration;
    }
}
