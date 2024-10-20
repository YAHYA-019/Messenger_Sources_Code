package X;

import com.google.common.collect.ImmutableList;
import java.io.IOException;

/* renamed from: X.3RJ, reason: invalid class name */
/* loaded from: 3RJ.class */
public final class C3RJ {
    public final AnonymousClass243 A00 = (AnonymousClass243) 1Bn.A0A(68334);
    public final C00i A01 = 1BQ.A01();

    public static final C3RJ A00() {
        return new C3RJ();
    }

    public ImmutableList A01(String str) {
        ImmutableList immutableList;
        if (1JF.A0B(str)) {
            immutableList = ImmutableList.of();
        } else {
            try {
                immutableList = (ImmutableList) this.A00.A0V(str, ImmutableList.class);
                if (immutableList == null) {
                    return ImmutableList.of();
                }
            } catch (IOException e) {
                1BK.A09(this.A01).softReport("DbThreadThemeSerialization", 0Pz.A0W("Failed to deserialize theme gradient colors: ", str), e);
                return ImmutableList.of();
            }
        }
        return immutableList;
    }

    public ImmutableList A02(String str) {
        ImmutableList immutableList;
        if (1JF.A0B(str)) {
            immutableList = ImmutableList.of();
        } else {
            try {
                immutableList = (ImmutableList) this.A00.A0Q(new BJZ(this), str);
                if (immutableList == null) {
                    return ImmutableList.of();
                }
            } catch (IOException e) {
                1BK.A09(this.A01).softReport("DbThreadThemeSerialization", 0Pz.A0W("Failed to deserialize theme strings list: ", str), e);
                return ImmutableList.of();
            }
        }
        return immutableList;
    }

    public String A03(ImmutableList immutableList) {
        if (09K.A01(immutableList)) {
            return null;
        }
        try {
            return this.A00.A0W(immutableList);
        } catch (2LD e) {
            1BK.A09(this.A01).softReport("DbThreadThemeSerialization", "Failed to serialize theme gradient colors.", e);
            return null;
        }
    }

    public String A04(ImmutableList immutableList) {
        if (09K.A01(immutableList)) {
            return null;
        }
        try {
            return this.A00.A0W(immutableList);
        } catch (2LD e) {
            1BK.A09(this.A01).softReport("DbThreadThemeSerialization", "Failed to serialize theme strings list.", e);
            return null;
        }
    }
}
