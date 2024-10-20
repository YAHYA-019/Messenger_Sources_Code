package X;

import android.net.Uri;
import com.facebook.messaging.attachments.AudioAttachmentData;
import com.facebook.messaging.model.messages.Message;
import java.io.File;

/* renamed from: X.6H8, reason: invalid class name */
/* loaded from: 6H8.class */
public final class C6H8 extends 4tJ {
    public final C00i A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.4tK, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C6H8() {
        /*
            r301 = this;
            r0 = 99390(0x1843e, float:1.39275E-40)
            java.lang.Object r0 = X.1Bi.A03(r0)
            X.0dp r0 = (X.C0dp) r0
            r302 = r0
            r0 = 16950(0x4236, float:2.3752E-41)
            java.lang.Object r0 = X.1Bi.A03(r0)
            X.2HZ r0 = (X.2HZ) r0
            r303 = r0
            r0 = 17132(0x42ec, float:2.4007E-41)
            java.lang.Object r0 = X.1Bi.A03(r0)
            X.2ty r0 = (X.C2ty) r0
            r304 = r0
            r0 = 16511(0x407f, float:2.3137E-41)
            java.lang.Object r0 = X.1Bi.A03(r0)
            X.01s r0 = (X.C01s) r0
            r305 = r0
            java.lang.String r0 = "audio"
            r306 = r0
            X.4tK r0 = new X.4tK
            r307 = r0
            r0 = r307
            r0.<init>()
            r0 = r307
            r1 = r306
            r0.A01 = r1
            r0 = r307
            r1 = r306
            r0.A00 = r1
            r0 = 66187(0x1028b, float:9.2748E-41)
            java.lang.Object r0 = X.1Bi.A03(r0)
            X.2Cy r0 = (X.2Cy) r0
            r308 = r0
            r0 = 49593(0xc1b9, float:6.9495E-41)
            java.lang.Object r0 = X.1Bi.A03(r0)
            X.4cG r0 = (X.4cG) r0
            r309 = r0
            X.6H9 r0 = new X.6H9
            r310 = r0
            r0 = r310
            r0.<init>()
            r0 = 33110(0x8156, float:4.6397E-41)
            java.lang.Object r0 = X.1Bi.A03(r0)
            X.2HP r0 = (X.2HP) r0
            r311 = r0
            r0 = r301
            r1 = r303
            r2 = r304
            r3 = r311
            r4 = r309
            r5 = r305
            r6 = r308
            r7 = r302
            r8 = r307
            r9 = r310
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            X.1BV r0 = new X.1BV
            r306 = r0
            r0 = r306
            r1 = 131123(0x20033, float:1.83742E-40)
            r0.<init>(r1)
            r0 = r301
            r1 = r306
            r0.A03 = r1
            X.1BQ r0 = new X.1BQ
            r306 = r0
            r0 = r306
            r1 = 49420(0xc10c, float:6.9252E-41)
            r0.<init>(r1)
            r0 = r301
            r1 = r306
            r0.A01 = r1
            X.1BQ r0 = new X.1BQ
            r306 = r0
            r0 = r306
            r1 = 49777(0xc271, float:6.9752E-41)
            r0.<init>(r1)
            r0 = r301
            r1 = r306
            r0.A00 = r1
            X.1BV r0 = new X.1BV
            r306 = r0
            r0 = r306
            r1 = 16430(0x402e, float:2.3023E-41)
            r0.<init>(r1)
            r0 = r301
            r1 = r306
            r0.A02 = r1
            r0 = 66348(0x1032c, float:9.2973E-41)
            java.lang.Object r0 = X.1Bi.A03(r0)
            X.1UP r0 = (X.1UP) r0
            r1 = r301
            r0.A00(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6H8.<init>():void");
    }

    public void A02(Uri uri) {
        4cU B7g = ((4tJ) this).A01.B7g(((JTg) this.A03.get()).A00(uri).A00());
        if (B7g instanceof 4cU) {
            File file = B7g.A00;
            Uri fromFile = Uri.fromFile(file);
            try {
                if (!file.delete()) {
                    0fH.A0o("AudioCache", "Audio file was not successfully deleted.");
                }
            } catch (SecurityException e) {
                0fH.A0w("AudioCache", "Audio file was not successfully deleted.", e);
            }
            4YU.A0G(this.A02).post(new Iw2(fromFile, this));
        }
    }

    public void A03(Message message) {
        AudioAttachmentData A09 = ((C12114ys) this.A01.get()).A09(message, null);
        if (A09 != null) {
            A02(A09.A01);
        }
    }
}
