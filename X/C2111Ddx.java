package X;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* renamed from: X.Ddx, reason: case insensitive filesystem */
/* loaded from: Ddx.class */
public final class C2111Ddx extends 5CC implements Animatable {
    public boolean A00;
    public final 5Gk A01;

    public C2111Ddx(5Gk r302) {
        super((Drawable) r302);
        this.A01 = r302;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.A01.CXT();
        this.A00 = true;
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.A01.pause();
        this.A00 = false;
    }
}
