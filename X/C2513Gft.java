package X;

import android.graphics.drawable.Animatable;

/* renamed from: X.Gft, reason: case insensitive filesystem */
/* loaded from: Gft.class */
public final class C2513Gft extends 4gL {
    public final int A00;

    public C2513Gft(int i) {
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ void Byc(Animatable animatable, Object obj, String str) {
        switch (this.A00) {
            case 0:
                if (obj == null) {
                    return;
                }
                break;
            case 1:
            case 2:
                break;
            default:
                super/*X.4gM*/.Byc(animatable, obj, str);
                return;
        }
        if (animatable != null) {
            animatable.start();
        }
    }
}
