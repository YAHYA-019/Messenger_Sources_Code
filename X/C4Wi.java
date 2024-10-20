package X;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.Serializable;

/* renamed from: X.4Wi, reason: invalid class name */
/* loaded from: 4Wi.class */
public final class C4Wi implements Externalizable, Serializable {
    public static final long serialVersionUID = 1;
    public byte[] json;

    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        throw r305;
     */
    @Override // java.io.Externalizable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void readExternal(java.io.ObjectInput r302) {
        /*
            r301 = this;
            r0 = r302
            int r0 = r0.readInt()
            r303 = r0
            r0 = 100000(0x186a0, float:1.4013E-40)
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 > r1) goto L25
            r0 = r303
            byte[] r0 = new byte[r0]
            r305 = r0
            r0 = r302
            r1 = r305
            r2 = 0
            r3 = r303
            r0.readFully(r1, r2, r3)
        L1e:
            r0 = r301
            r1 = r305
            r0.json = r1
            return
        L25:
            X.3DX r0 = new X.3DX
            r306 = r0
            r0 = r306
            r1 = r304
            r0.<init>(r1)
            r0 = r306
            r0.A01()     // Catch: java.lang.Throwable -> L91
            r0 = r306
            byte[] r0 = r0.A01     // Catch: java.lang.Throwable -> L91
            r307 = r0
        L3c:
            r0 = 0
            r308 = r0
        L3f:
            r0 = r307
            int r0 = r0.length     // Catch: java.lang.Throwable -> L91
            r1 = r308
            int r0 = r0 - r1
            r304 = r0
            r0 = r304
            r1 = r303
            int r0 = java.lang.Math.min(r0, r1)     // Catch: java.lang.Throwable -> L91
            r304 = r0
            r0 = r302
            r1 = r307
            r2 = 0
            r3 = r304
            r0.readFully(r1, r2, r3)     // Catch: java.lang.Throwable -> L91
            r0 = r303
            r1 = r304
            int r0 = r0 - r1
            r303 = r0
            r0 = r308
            r1 = r304
            int r0 = r0 + r1
            r308 = r0
            r0 = r303
            if (r0 != 0) goto L67
            goto L80
        L67:
            r0 = r307
            int r0 = r0.length     // Catch: java.lang.Throwable -> L91
            r304 = r0
            r0 = r308
            r1 = r304
            if (r0 != r1) goto L3f
            r0 = r306
            X.3DX.A00(r0)     // Catch: java.lang.Throwable -> L91
            r0 = r306
            byte[] r0 = r0.A01     // Catch: java.lang.Throwable -> L91
            r307 = r0
            goto L3c
        L80:
            r0 = r306
            r1 = r308
            r0.A00 = r1     // Catch: java.lang.Throwable -> L91
            r0 = r306
            byte[] r0 = r0.A05()     // Catch: java.lang.Throwable -> L91
            r305 = r0
            goto L1e
        L91:
            r305 = move-exception
            r0 = r305
            throw r0     // Catch: java.lang.Throwable -> L96
        L96:
            throw r0     // Catch: java.lang.Throwable -> L96
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Wi.readExternal(java.io.ObjectInput):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [X.27T, X.27S] */
    public Object readResolve() {
        Object A0q;
        try {
            byte[] bArr = this.json;
            43G r0 = 43A.A00;
            43G.A09("content", bArr);
            C26L c26l = r0._config;
            C42V A04 = r0._parserFactory.A04(bArr);
            int i = c26l._parserFeaturesToChange;
            if (i != 0) {
                A04.A1G(c26l._parserFeatures, i);
            }
            AbstractC01033pi A00 = 43G.A00(A04, r0);
            try {
                ?? c27t = new C27T(A00, r0._config, r0._context);
                C42h A01 = 43G.A01(A00, (C27T) c27t, r0);
                if (A01 == C42h.A09) {
                    A0q = r0._valueToUpdate;
                    if (A0q == null) {
                        A0q = 43G.A03((C27T) c27t, r0).Azd(c27t);
                    }
                } else {
                    A0q = (A01 == C42h.A01 || A01 == C42h.A02) ? r0._valueToUpdate : c27t.A0q(A00, r0._valueType, 43G.A03((C27T) c27t, r0), r0._valueToUpdate);
                }
                if (r0._config.A0F(C26O.A0E)) {
                    43G.A08(A00, r0._valueType, r0);
                }
                A00.close();
                return A0q;
            } finally {
            }
        } catch (IOException e) {
            throw new IllegalArgumentException(0Pz.A0W("Failed to JDK deserialize `JsonNode` value: ", e.getMessage()), e);
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeInt(this.json.length);
        objectOutput.write(this.json);
    }
}
