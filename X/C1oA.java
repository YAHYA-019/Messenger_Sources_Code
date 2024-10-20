package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.omnistore.Omnistore;
import com.facebook.omnistore.OmnistoreCollections;
import com.facebook.omnistore.OmnistoreMqtt;
import com.facebook.omnistore.module.OmnistoreComponent;
import com.facebook.omnistore.module.OmnistoreStoredProcedureComponent;
import com.facebook.omnistore.util.DeviceIdUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1oA, reason: invalid class name */
/* loaded from: 1oA.class */
public final class C1oA {
    public Omnistore A00;
    public OmnistoreCollections A01;
    public OmnistoreMqtt A02;
    public boolean A03;
    public boolean A04;
    public final C01s A05;
    public final C0qy A06;
    public final C1oN A07;
    public final 1oF A08;
    public final 1oS A09;

    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, com.facebook.omnistore.OmnistoreCustomLogger] */
    public C1oA() {
        C0qy c0qy = (C0qy) 1Bi.A03(83603);
        C1oB c1oB = (C1oB) 1Bi.A03(16807);
        1oF r0 = (1oF) 1Bi.A03(16808);
        C01s c01s = (C01s) 1Bi.A03(16511);
        C1oN c1oN = (C1oN) 1Bn.A0A(16812);
        1oS r02 = (1oS) 1Bi.A03(16813);
        this.A00 = null;
        this.A01 = null;
        this.A03 = false;
        this.A04 = true;
        this.A06 = c0qy;
        OmnistoreMqtt omnistoreMqtt = OmnistoreMqtt.$redex_init_class;
        this.A02 = new OmnistoreMqtt(c1oB, new Object());
        this.A08 = r0;
        this.A05 = c01s;
        this.A07 = c1oN;
        this.A09 = r02;
    }

    public static C01243qf A00(C1oA c1oA) {
        Collection values;
        1oS r0 = c1oA.A09;
        synchronized (r0) {
            Iterator it = r0.A02.iterator();
            while (it.hasNext()) {
                1oS.A00((OmnistoreComponent) it.next(), r0);
            }
            FbUserSession A04 = ((1Fv) 1Bi.A03(66351)).A04();
            Integer num = 1Lo.A05;
            Iterator it2 = 1Lo.A0B(FbInjector.A00(), A04, (1BY) null, 16403).iterator();
            while (it2.hasNext()) {
                1oS.A00((OmnistoreComponent) it2.next(), r0);
            }
            values = r0.A00.values();
        }
        synchronized (r0) {
            Set<OmnistoreStoredProcedureComponent> set = r0.A03;
            for (OmnistoreStoredProcedureComponent omnistoreStoredProcedureComponent : set) {
                synchronized (r0) {
                    if (!set.contains(omnistoreStoredProcedureComponent)) {
                        throw AnonymousClass001.A0T("Tried to init an unregistered stored procedure component");
                    }
                    HashMap hashMap = r0.A01;
                    if (((3qP) hashMap.get(omnistoreStoredProcedureComponent)) == null) {
                        hashMap.put(omnistoreStoredProcedureComponent, new 3qZ(omnistoreStoredProcedureComponent));
                    }
                }
            }
            Iterable[] iterableArr = {values, r0.A01.values()};
            iterableArr.getClass();
            return new C01243qf(iterableArr);
        }
    }

    public static Omnistore A01(C1oA c1oA) {
        Omnistore omnistore;
        Throwable th;
        synchronized (c1oA) {
            omnistore = c1oA.A00;
            if (omnistore == null) {
                if (!DeviceIdUtil.isSupportedApp("256002347743983")) {
                    new RuntimeException(0Pz.A0W("Trying to use omnistore from unexpected app:", "256002347743983"));
                } else if (c1oA.A04) {
                    C1zK A00 = c1oA.A08.A00(c1oA.A02.getProtocolProvider());
                    Omnistore omnistore2 = A00.A00;
                    c1oA.A00 = omnistore2;
                    c1oA.A01 = A00.A01;
                    C1oN c1oN = c1oA.A07;
                    omnistore2.addDeltaReceivedCallback(c1oN);
                    omnistore2.setCollectionIndexerFunction(c1oN);
                    omnistore2.addDeltaClusterCallback(c1oN);
                    omnistore2.addSnapshotStateChangedCallback(c1oN);
                    omnistore = c1oA.A00;
                } else {
                    new RuntimeException("Trying to open omnistore between logout and login");
                }
                throw th;
            }
        }
        return omnistore;
    }
}
