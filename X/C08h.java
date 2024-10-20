package X;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.08h, reason: invalid class name */
/* loaded from: 08h.class */
public final class C08h {
    public final ApplicationInfo A00;
    public final PackageInfo A01;
    public final String A02;
    public final String A03;

    public C08h(PackageInfo packageInfo) {
        11T.A0F(packageInfo, 1);
        this.A01 = packageInfo;
        String str = packageInfo.packageName;
        this.A02 = str == null ? "" : str;
        String str2 = packageInfo.versionName;
        this.A03 = str2 == null ? "" : str2;
        this.A00 = packageInfo.applicationInfo;
    }

    public final 09R A00() {
        boolean z = true;
        09R r304 = null;
        PackageInfo packageInfo = this.A01;
        SigningInfo signingInfo = packageInfo.signingInfo;
        if (signingInfo != null) {
            boolean hasMultipleSigners = signingInfo.hasMultipleSigners();
            boolean hasPastSigningCertificates = signingInfo.hasPastSigningCertificates();
            Signature[] apkContentsSigners = hasMultipleSigners ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
            if (apkContentsSigners != null) {
                List asList = Arrays.asList(apkContentsSigners);
                11T.A0A(asList);
                List A0S = 0QD.A0S(asList);
                if (!A0S.isEmpty()) {
                    return new 09R(A0S, hasMultipleSigners, hasPastSigningCertificates);
                }
            }
        } else {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null) {
                List asList2 = Arrays.asList(signatureArr);
                11T.A0A(asList2);
                List A0S2 = 0QD.A0S(asList2);
                if (!A0S2.isEmpty()) {
                    if (A0S2.size() <= 1) {
                        z = false;
                    }
                    r304 = new 09R(A0S2, z, false);
                }
            }
        }
        return r304;
    }
}
