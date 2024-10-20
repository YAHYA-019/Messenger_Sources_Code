package X;

import java.io.IOException;

/* loaded from: K5W.class */
public final class K5W extends K5Q {
    public static final K5W zzb;
    public MRP zzd = K5S.A02;

    static {
        K5W k5w = new K5W();
        zzb = k5w;
        ((K5Q) k5w).zzd &= (-1) >>> 1;
        K5Q.zzb.put(K5W.class, k5w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable, X.MCx, X.K5W, java.lang.Object] */
    public static K5W A01(byte[] bArr) {
        IOException e;
        int length = bArr.length;
        L7O l7o = L7O.A01;
        ?? k5w = new K5W();
        try {
            MKi A00 = L23.A02.A00(k5w.getClass());
            A00.DCu(new L0I(l7o), k5w, bArr, 0, length);
            A00.DCg(k5w);
            return k5w;
        } catch (IOException e2) {
            if (e2.getCause() instanceof KLd) {
                throw e2.getCause();
            }
            e = new IOException(e2.getMessage(), e2);
            ((KLd) e).zza = null;
            ((KLd) e).zza = k5w;
            throw e;
        } catch (KLd e3) {
            e = e3;
            ((KLd) e).zza = k5w;
            throw e;
        } catch (Lwt unused) {
            e = new IOException(k5w.getMessage());
            ((KLd) e).zza = null;
            ((KLd) e).zza = k5w;
            throw e;
        } catch (IndexOutOfBoundsException unused2) {
            e = new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            ((KLd) e).zza = null;
            ((KLd) e).zza = k5w;
            throw e;
        }
    }
}
