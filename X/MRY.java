package X;

import java.nio.channels.WritableByteChannel;

/* loaded from: MRY.class */
public interface MRY extends MQy, WritableByteChannel {
    LwX ACc();

    MRY DAr(byte[] bArr);

    MRY DB2(int i);

    MRY DB8(long j);

    MRY DBA(int i);

    MRY DBG(int i);

    MRY DBM(String str);

    @Override // X.MQy, java.io.Flushable
    void flush();
}
