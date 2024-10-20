package X;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: LdL.class */
public final class LdL implements MD0, Serializable {
    public final MessageDigest zza;
    public final int zzb;
    public final boolean zzc;
    public final String zzd;

    public LdL() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.security.MessageDigest, java.security.MessageDigestSpi] */
    public LdL(String str, String str2) {
        boolean z;
        Object obj = new Object();
        try {
            obj = MessageDigest.getInstance("SHA-256");
            this.zza = obj;
            this.zzb = obj.getDigestLength();
            this.zzd = "Hashing.sha256()";
            try {
                obj.clone();
                z = true;
            } catch (CloneNotSupportedException unused) {
                z = false;
            }
            this.zzc = z;
        } catch (NoSuchAlgorithmException unused2) {
            throw AnonymousClass001.A0J(obj);
        }
    }

    public final String toString() {
        return this.zzd;
    }
}
