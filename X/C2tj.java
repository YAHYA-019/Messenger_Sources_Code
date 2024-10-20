package X;

import android.content.pm.PackageManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2tj, reason: invalid class name */
/* loaded from: 2tj.class */
public final class C2tj {
    public final PackageManager A00;
    public final C2tk A01 = new Object();

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.2tk] */
    public C2tj(PackageManager packageManager) {
        this.A00 = packageManager;
    }

    public static HashSet A00(C2ts c2ts) {
        C2tr c2tr;
        HashSet hashSet = new HashSet();
        if (!c2ts.A05) {
            hashSet.add(C4FI.INSTALLER_DISABLED);
        }
        Set set = c2ts.A04;
        if (set.isEmpty()) {
            hashSet.add(C4FI.INSTALLER_NO_PRIVILEGES);
        }
        HashSet hashSet2 = new HashSet();
        int ordinal = c2ts.A02.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            hashSet2.addAll(!set.contains(C2tr.INSTALL) ? Collections.singleton(C4FI.INSTALLER_MISSING_PRIVILEGE) : Collections.emptySet());
            c2tr = C2tr.INSTALL_PACKAGE_UPDATES;
        } else {
            if (ordinal != 2) {
                if (ordinal == 4) {
                    hashSet2.add(C4FI.INSTALLER_BAD_SIGNATURE);
                }
                hashSet.addAll(hashSet2);
                return hashSet;
            }
            hashSet2.addAll(!set.contains(C2tr.INSTALL_PACKAGE_UPDATES) ? Collections.singleton(C4FI.INSTALLER_MISSING_PRIVILEGE) : Collections.emptySet());
            c2tr = C2tr.INSTALL;
        }
        hashSet2.addAll(set.contains(c2tr) ? Collections.singleton(C4FI.INSTALLER_INVALID_PRIVILEGE) : Collections.emptySet());
        hashSet.addAll(hashSet2);
        return hashSet;
    }
}
