package X;

import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import java.io.Closeable;

/* renamed from: X.5cl, reason: invalid class name */
/* loaded from: 5cl.class */
public final class C5cl extends 5C0 implements Closeable {
    public Rect A00;
    public 2EU A01;
    public C5bj A02;

    public C5cl() {
        super(new Drawable[4], 1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        2EU.A04(this.A01);
        this.A01 = null;
        int i = 0;
        Object A01 = A01(0);
        if (A01 instanceof Animatable) {
            ((Animatable) A01).stop();
        }
        do {
            A02((Drawable) null, i);
            i++;
        } while (i < 4);
    }
}
