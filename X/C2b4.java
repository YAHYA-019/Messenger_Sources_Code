package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.2b4, reason: invalid class name */
/* loaded from: 2b4.class */
public abstract /* synthetic */ class C2b4 {
    public static final Object A00(C2b0 c2b0, CancellationException cancellationException) {
        if (cancellationException instanceof C2az) {
            C2az c2az = (C2az) cancellationException;
            if (c2az.raise == c2b0) {
                return c2az.raised;
            }
        }
        throw cancellationException;
    }
}
