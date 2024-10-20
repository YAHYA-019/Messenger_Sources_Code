package X;

import com.google.common.base.Charsets;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* renamed from: X.410, reason: invalid class name */
/* loaded from: 410.class */
public final class AnonymousClass410 extends AnonymousClass411 implements C40l, AnonymousClass403 {
    public C5el A00 = null;
    public final ArrayList A01 = new ArrayList();

    public void A02(07S r302) {
        C4C3 c4c6;
        int i = r302.A00;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= i) {
                synchronized (this) {
                    this.A01.add(r302);
                }
                return;
            }
            String A0F = r302.A0F(i3);
            Object A0E = r302.A0E(i3);
            if (A0E == null) {
                throw AnonymousClass001.A0L("null values are not allowed");
            }
            if ((A0E instanceof String) || (A0E instanceof Number) || (A0E instanceof Boolean)) {
                c4c6 = new C4C6(A0E.toString(), Charsets.UTF_8);
            } else {
                if (!(A0E instanceof 07T)) {
                    throw AnonymousClass001.A0L(0Pz.A0v("Unsupported params type ", AnonymousClass001.A0Y(A0E), " at key ", A0F));
                }
                final 07T r0 = (07T) A0E;
                final Charset charset = Charsets.UTF_8;
                c4c6 = new C4C3(r0, charset) { // from class: X.5ok
                    public final 07T A00;
                    public final Charset A01;

                    {
                        super("text/plain");
                        this.A00 = r0;
                        this.A01 = charset;
                    }

                    @Override // X.C4C3
                    public long A00() {
                        return -1;
                    }

                    @Override // X.C4C3
                    public String A01() {
                        return this.A01.name();
                    }

                    @Override // X.C4C3
                    public String A02() {
                        return null;
                    }

                    @Override // X.C4C3
                    public String A03() {
                        return "8bit";
                    }

                    @Override // X.C4C3
                    public void A04(OutputStream outputStream) {
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
                        this.A00.A0B(outputStreamWriter);
                        outputStreamWriter.flush();
                    }
                };
            }
            A00(c4c6, A0F);
            i2 = i3 + 1;
        }
    }

    public void A03(C5el c5el) {
        this.A00 = c5el;
    }

    @Override // X.C40l
    public byte[] ARg() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) getContentLength());
        super.writeTo(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    @Override // X.AnonymousClass403
    public void release() {
        synchronized (this) {
            int i = 0;
            while (true) {
                int i2 = i;
                ArrayList arrayList = this.A01;
                if (i2 < arrayList.size()) {
                    ((07T) arrayList.get(i2)).A02();
                    i = i2 + 1;
                }
            }
        }
    }

    @Override // X.AnonymousClass411, org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) {
        C5el c5el = this.A00;
        if (c5el != null) {
            outputStream = new 4RL(c5el, outputStream);
        }
        super.writeTo(outputStream);
    }
}
