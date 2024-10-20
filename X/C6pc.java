package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.6pc, reason: invalid class name */
/* loaded from: 6pc.class */
public enum C6pc implements C4zn {
    OPEN("open"),
    TINCAN("tincan"),
    ARMADILLO("armadillo");

    public final String loggingName;

    C6pc(String str) {
        this.loggingName = str;
    }

    public static C6pc A00(ThreadKey threadKey) {
        if (threadKey != null) {
            if (threadKey.A0z()) {
                return ARMADILLO;
            }
            if (threadKey.A19()) {
                return TINCAN;
            }
        }
        return OPEN;
    }

    public static C6pc A01(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1586240027) {
                if (hashCode == -873640809 && str.equals("tincan")) {
                    return TINCAN;
                }
            } else if (str.equals("armadillo")) {
                return ARMADILLO;
            }
        }
        return OPEN;
    }

    @Override // X.C4zn
    public String Aus() {
        return this.loggingName;
    }
}
