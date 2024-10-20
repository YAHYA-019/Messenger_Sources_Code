package X;

import android.net.Uri;
import com.facebook.wearable.common.comms.hera.shared.snappmanager.SnAppManagerProtos;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: H78.class */
public final class H78 extends 6DJ {
    public int A00;
    public Uri A01;
    public DatagramSocket A02;
    public InetAddress A03;
    public MulticastSocket A04;
    public boolean A05;
    public final DatagramPacket A06;
    public final byte[] A07;

    public H78() {
        super(true);
        byte[] bArr = new byte[2000];
        this.A07 = bArr;
        this.A06 = new DatagramPacket(bArr, 0, 2000);
    }

    public Uri BIM() {
        return this.A01;
    }

    public long CVO(6DQ r302) {
        MulticastSocket multicastSocket;
        Uri uri = r302.A06;
        this.A01 = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.A01.getPort();
        A02();
        try {
            InetAddress byName = InetAddress.getByName(host);
            this.A03 = byName;
            InetSocketAddress inetSocketAddress = new InetSocketAddress(byName, port);
            if (this.A03.isMulticastAddress()) {
                MulticastSocket multicastSocket2 = new MulticastSocket(inetSocketAddress);
                this.A04 = multicastSocket2;
                multicastSocket2.joinGroup(this.A03);
                multicastSocket = this.A04;
            } else {
                new DatagramSocket(inetSocketAddress);
            }
            this.A02 = multicastSocket;
            multicastSocket.setSoTimeout(8000);
            this.A05 = true;
            A04(r302);
            return -1;
        } catch (IOException e) {
            throw new 6Dc(SnAppManagerProtos.SNAPP_START_RESPONSE_MSGTYPE, e);
        } catch (SecurityException e2) {
            throw new 6Dc(2006, e2);
        }
    }

    public void close() {
        this.A01 = null;
        MulticastSocket multicastSocket = this.A04;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.A03;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.A04 = null;
        }
        DatagramSocket datagramSocket = this.A02;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.A02 = null;
        }
        this.A03 = null;
        this.A00 = 0;
        if (this.A05) {
            this.A05 = false;
            A01();
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            try {
                DatagramSocket datagramSocket = this.A02;
                datagramSocket.getClass();
                DatagramPacket datagramPacket = this.A06;
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.A00 = length;
                A03(length);
            } catch (SocketTimeoutException e) {
                throw new 6Dc(2002, e);
            } catch (IOException e2) {
                throw new 6Dc(SnAppManagerProtos.SNAPP_START_RESPONSE_MSGTYPE, e2);
            }
        }
        int length2 = this.A06.getLength();
        int i3 = this.A00;
        int i4 = length2 - i3;
        int min = Math.min(i3, i2);
        System.arraycopy(this.A07, i4, bArr, i, min);
        this.A00 -= min;
        return min;
    }
}
