package com.fasterxml.jackson.databind.ser.std;

import X.0Pz;
import X.28Q;
import X.AnonymousClass001;
import X.C26c;
import X.C42h;
import X.C4Nr;
import X.Kls;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;

/* loaded from: InetSocketAddressSerializer.class */
public class InetSocketAddressSerializer extends StdScalarSerializer {
    public InetSocketAddressSerializer() {
        super(InetSocketAddress.class);
    }

    public static void A03(28Q r301, InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        String hostName = address == null ? inetSocketAddress.getHostName() : address.toString().trim();
        int indexOf = hostName.indexOf(47);
        if (indexOf >= 0) {
            hostName = indexOf == 0 ? address instanceof Inet6Address ? 0Pz.A0j("[", hostName.substring(1), "]") : hostName.substring(1) : AnonymousClass001.A0c(hostName, indexOf);
        }
        r301.A0r(AnonymousClass001.A0e(":", AnonymousClass001.A0n(hostName), inetSocketAddress.getPort()));
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        InetSocketAddress inetSocketAddress = (InetSocketAddress) obj;
        Kls A03 = c4Nr.A03(C42h.A0C, inetSocketAddress);
        A03.A01 = InetSocketAddress.class;
        Kls A01 = c4Nr.A01(r302, A03);
        A03(r302, inetSocketAddress);
        c4Nr.A02(r302, A01);
    }
}
