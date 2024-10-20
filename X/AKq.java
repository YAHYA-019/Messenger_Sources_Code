package X;

import com.facebook.wearable.airshield.security.InitializationVector;
import com.facebook.wearable.airshield.security.PublicKey;
import com.facebook.wearable.airshield.stream.CipherBuilder;
import com.facebook.wearable.datax.RemoteChannel;
import com.oculus.atc.EnableEncryption;

/* loaded from: AKq.class */
public final class AKq extends C00q implements C00m {
    public final /* synthetic */ int $base;
    public final /* synthetic */ RemoteChannel $channel;
    public final /* synthetic */ boolean $hkdf;
    public final /* synthetic */ CipherBuilder $txCipher;
    public final /* synthetic */ LZ7 $txTransformer;
    public final /* synthetic */ IE6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKq(CipherBuilder cipherBuilder, LZ7 lz7, IE6 ie6, RemoteChannel remoteChannel, int i, boolean z) {
        super(0);
        this.$channel = remoteChannel;
        this.$txCipher = cipherBuilder;
        this.$base = i;
        this.$hkdf = z;
        this.this$0 = ie6;
        this.$txTransformer = lz7;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        int i = this.$base;
        CipherBuilder cipherBuilder = this.$txCipher;
        boolean z = this.$hkdf;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("----------------------------------------------");
        A0k.append('\n');
        A0k.append("Enable encryption:");
        A0k.append('\n');
        StringBuilder A0k2 = AnonymousClass001.A0k();
        A0k2.append("base: ");
        A0k.append(AnonymousClass001.A0a(String.valueOf(i & 4294967295L), A0k2));
        A0k.append('\n');
        7zV.A18("seed: ", A0k, cipherBuilder.seed);
        7zV.A18("initialization vector: ", A0k, cipherBuilder.initializationVector.toByteArray());
        7zV.A18("challenge: ", A0k, cipherBuilder.challenge);
        A0k.append(0Pz.A1C("hkdf: ", z));
        A0k.append('\n');
        PublicKey publicKey = cipherBuilder.remotePublicKey;
        if (publicKey == null) {
            throw 1BK.A0h();
        }
        7zV.A18("public key: ", A0k, publicKey.serialize());
        7zV.A18("TX generated challenge: ", A0k, cipherBuilder.buildTxChallenge().toByteArray());
        0fH.A0l("LinkSetup", 11T.A02(A0k));
        RemoteChannel remoteChannel = this.$channel;
        byte[] serialize = this.$txCipher.privateKey.recoverPublicKey().serialize();
        CipherBuilder cipherBuilder2 = this.$txCipher;
        byte[] bArr = cipherBuilder2.seed;
        InitializationVector initializationVector = cipherBuilder2.initializationVector;
        int i2 = this.$base;
        boolean z2 = this.$hkdf;
        11T.A0H(serialize, bArr);
        11T.A0F(initializationVector, 2);
        KGT newBuilder = EnableEncryption.newBuilder();
        KEB A01 = Lj5.A01(serialize, 0, serialize.length);
        newBuilder.A06();
        ((EnableEncryption) ((KGw) newBuilder).A00).publicKey_ = A01;
        KEB A012 = Lj5.A01(bArr, 0, bArr.length);
        newBuilder.A06();
        ((EnableEncryption) ((KGw) newBuilder).A00).seed_ = A012;
        byte[] byteArray = initializationVector.toByteArray();
        KEB A013 = Lj5.A01(byteArray, 0, byteArray.length);
        newBuilder.A06();
        ((EnableEncryption) ((KGw) newBuilder).A00).iv_ = A013;
        newBuilder.A06();
        ((EnableEncryption) ((KGw) newBuilder).A00).base_ = i2;
        newBuilder.A06();
        ((EnableEncryption) ((KGw) newBuilder).A00).parameters_ = z2 ? 1 : 0;
        remoteChannel.send(KXf.A00(newBuilder.A05(), 2));
        LBM lbm = this.this$0.A05;
        LZ7 lz7 = this.$txTransformer;
        synchronized (lbm.A09) {
            KjE kjE = lbm.A01;
            if (kjE != null) {
                kjE.A00 = lz7;
            }
        }
        IE6.A04(this.this$0, new JBV(this.$txTransformer, 46));
        IE6.A03(this.this$0, new JBV(this.$txCipher, 47));
        return 04S.A00;
    }
}
