package X;

import com.facebook.wearable.datax.Connection;
import java.nio.ByteBuffer;

/* loaded from: Kop.class */
public final class Kop {
    public final /* synthetic */ Connection A00;

    public Kop(Connection connection) {
        this.A00 = connection;
    }

    public final ByteBuffer A00() {
        int pollReceiveFragmentNative;
        int pollReceiveFragmentNative2;
        int pollReceiveFragmentNative3;
        int pollReceiveFragmentNative4;
        Connection connection = this.A00;
        KXc kXc = Connection.Companion;
        pollReceiveFragmentNative = connection.pollReceiveFragmentNative(connection.f2native.A00(), null, 0);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(pollReceiveFragmentNative);
        11T.A0D(allocateDirect);
        11T.A0F(allocateDirect, 0);
        int remaining = allocateDirect.remaining();
        pollReceiveFragmentNative2 = connection.pollReceiveFragmentNative(connection.f2native.A00(), null, 0);
        if (remaining < pollReceiveFragmentNative2) {
            int remaining2 = allocateDirect.remaining();
            pollReceiveFragmentNative3 = connection.pollReceiveFragmentNative(connection.f2native.A00(), null, 0);
            throw AnonymousClass001.A0N(0Pz.A0C(remaining2, pollReceiveFragmentNative3, "Buffer remaining space is to small ", " < "));
        }
        pollReceiveFragmentNative4 = connection.pollReceiveFragmentNative(connection.f2native.A00(), allocateDirect, allocateDirect.position());
        JQy.A1V(allocateDirect, pollReceiveFragmentNative4);
        allocateDirect.flip();
        return allocateDirect;
    }
}
