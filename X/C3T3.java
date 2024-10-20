package X;

import android.content.Context;
import com.facebook.device.DeviceConditionHelper;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;

/* renamed from: X.3T3, reason: invalid class name */
/* loaded from: 3T3.class */
public final class C3T3 {
    public 1BY A00;
    public final Context A02;
    public final 4Yk A07;
    public final FI2 A05 = (FI2) 1Bn.A0B(99119);
    public final 1Ln A03 = (1Ln) 1Bi.A03(66191);
    public final DeviceConditionHelper A04 = (DeviceConditionHelper) 1Bi.A03(17096);
    public final 1Rv A01 = (1Rv) 1Bi.A03(67262);
    public final RGv A06 = new RGv(this);

    public C3T3(1BO r302) {
        this.A00 = new 1BY(r302);
        Context context = (Context) 1Bn.A0B(83719);
        this.A07 = (4Yk) 1Hv.A02(context, 49160);
        this.A02 = context;
    }

    public static ArrayList A00(boolean z) {
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress()) {
                        String hostAddress = nextElement.getHostAddress();
                        if (!(nextElement instanceof Inet6Address) || z) {
                            A0s.add(hostAddress);
                        }
                    }
                }
            }
            return A0s;
        } catch (SocketException unused) {
            return null;
        }
    }

    public static void A01(Object obj, String str, java.util.Map map) {
        if (obj != null) {
            map.put(str, obj);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(57:1|(1:3)(1:207)|4|(2:6|(2:8|(1:10))(4:11|(1:13)|14|(1:16)))|17|(1:19)(1:206)|20|(2:22|(2:24|(1:26))(1:27))|28|(2:34|(1:44))|205|46|(45:52|(2:54|(2:55|(3:57|(3:63|(3:66|(1:68)(1:69)|64)|70)|71)(1:75)))(0)|76|77|(1:79)|203|81|82|83|(7:87|88|89|90|(1:197)(2:98|99)|85|84)|199|200|100|(1:102)(1:195)|103|(1:105)(1:194)|106|(1:108)(1:193)|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|(2:127|(2:129|(1:131)(1:186))(1:187))(1:188)|132|(1:136)|137|(6:181|182|140|(12:142|143|144|145|146|147|148|149|150|151|(7:156|157|158|159|160|161|162)|164)|179|180)|139|140|(0)|179|180)(0)|204|77|(0)|203|81|82|83|(2:85|84)|199|200|100|(0)(0)|103|(0)(0)|106|(0)(0)|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|(0)(0)|132|(2:134|136)|137|(0)|139|140|(0)|179|180|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0810, code lost:
    
        if (r317 == null) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x062a, code lost:
    
        r306 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x05f4, code lost:
    
        r306 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0220, code lost:
    
        if ("google_sdk".equals(android.os.Build.PRODUCT) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x030d, code lost:
    
        if (r0.equals(r317) == false) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0707 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0498 A[Catch: SocketException -> 0x04d2, TRY_ENTER, TRY_LEAVE, TryCatch #6 {SocketException -> 0x04d2, blocks: (B:83:0x0485, B:84:0x048a, B:87:0x0498, B:88:0x04a1, B:89:0x04a8, B:93:0x04b4, B:95:0x04c1), top: B:82:0x0485 }] */
    /* JADX WARN: Type inference failed for: r0v232, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v463, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A02() {
        /*
            Method dump skipped, instructions count: 2097
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3T3.A02():java.lang.String");
    }
}
