package X;

/* renamed from: X.1A8, reason: invalid class name */
/* loaded from: 1A8.class */
public enum C1A8 {
    RSA_PKCS_1_5("RSA", new String[]{"SHA-256"}, 0),
    RSA("RSA", new String[]{"SHA-256"}, 1),
    EC("EC", new String[]{"SHA-256"}, 2);

    public final String mJCASignatureName;
    public final String mKeyPairGeneratorAlgorithmName;
    public final String[] mSupportedDigestAlgorithmNames;

    C1A8(String str, String[] strArr, int i) {
        this.mJCASignatureName = r303;
        this.mKeyPairGeneratorAlgorithmName = str;
        this.mSupportedDigestAlgorithmNames = strArr;
    }
}
