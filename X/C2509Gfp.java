package X;

import android.graphics.drawable.Animatable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import java.lang.ref.SoftReference;

/* renamed from: X.Gfp, reason: case insensitive filesystem */
/* loaded from: Gfp.class */
public final class C2509Gfp extends 4gM {
    public I2C A00;
    public final SoftReference A01;
    public final PlayerOrigin A04;
    public final 1CO A03 = AbJ.A0e();
    public final SoftReference A02 = new SoftReference(null);

    public C2509Gfp(FbDraweeView fbDraweeView, PlayerOrigin playerOrigin, I2C i2c) {
        this.A01 = new SoftReference(fbDraweeView);
        this.A00 = i2c;
        this.A04 = playerOrigin;
    }

    public /* bridge */ /* synthetic */ void Byc(Animatable animatable, Object obj, String str) {
        this.A02.get();
        this.A01.get();
    }
}
