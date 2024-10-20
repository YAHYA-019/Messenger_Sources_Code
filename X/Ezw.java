package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import com.facebook.neko.directinstall.installer.DirectInstallDownloadEvent;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.CRC32;
import kotlin.jvm.functions.Function1;

/* loaded from: Ezw.class */
public abstract class Ezw {
    public int A00;
    public final Context A01;
    public final Handler A02 = AnonymousClass001.A07();
    public final GJP A03;
    public final RSG A04;
    public final FHA A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final GFL A0A;
    public final GCt A0B;

    public Ezw(Context context, ROv rOv, String str) {
        this.A01 = context;
        this.A06 = rOv.A05;
        this.A04 = rOv.A02;
        this.A08 = rOv.A07;
        this.A05 = rOv.A04;
        this.A03 = rOv.A00;
        this.A07 = rOv.A06;
        this.A09 = str;
        this.A0A = rOv.A03;
        this.A0B = rOv.A01.BKn();
    }

    public void A02(Qom qom, QpZ qpZ, String str, String str2) {
        if (qom != null) {
            this.A04.A01(new DirectInstallDownloadEvent(qom, qpZ));
        } else {
            this.A04.A00(qpZ);
        }
        A04();
        boolean equals = "SUCCESS_INSTALL".equals(str);
        FHA fha = this.A05;
        if (!equals) {
            fha.A03(str2);
            return;
        }
        FHA.A00((EQg) null, fha, (Long) null, "SUCCESS_INSTALL", (String) null, (java.util.Map) null);
        GJP gjp = this.A03;
        Context context = this.A01;
        String str3 = this.A06;
        gjp.AB6(context, (Intent) null, fha, str3, (String) null, 0);
        gjp.CzW(context, (Intent) null, fha, "Application is now installed", str3);
    }

    public void A03() {
    }

    public void A04() {
        E4i e4i = (E4i) this;
        FHA.A01(((Ezw) e4i).A05, "IPC_SERVICE_UNBIND_REQUESTED");
        GJQ gjq = e4i.A05;
        Context context = ((Ezw) e4i).A01;
        11T.A09(context);
        gjq.D5c(context, e4i.A01);
        e4i.A06.set(null);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Throwable, com.xiaomi.market.IMarketDownloadService] */
    public void A05() {
        if (!(this instanceof E4j)) {
            FHA fha = this.A05;
            FHA.A01(fha, "IPC_SERVICE_INSTALL_REQUESTED");
            FHA.A01(fha, "IPC_SERVICE_INSTALL_REQUEST_SKIPPED");
            return;
        }
        E4j e4j = (E4j) this;
        FHA fha2 = ((Ezw) e4j).A05;
        FHA.A01(fha2, "IPC_SERVICE_INSTALL_REQUESTED");
        ?? r0 = e4j.A03;
        if (r0 == 0) {
            FHA.A01(fha2, "IPC_SERVICE_INSTALL_REQUEST_SKIPPED");
            e4j.A06 = true;
            return;
        }
        try {
            Bundle A05 = 1BK.A05();
            A05.putString("ref", ((Ezw) e4j).A07);
            A05.putString("callerPackage", ((Ezw) e4j).A01.getPackageName());
            A05.putString("packageName", ((Ezw) e4j).A06);
            long nextLong = new SecureRandom().nextLong();
            int currentTimeMillis = (int) (System.currentTimeMillis() / 60000);
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append(nextLong);
            A0k.append(':');
            A0k.append(currentTimeMillis);
            DKD.A1A(A05, A0k, "nonce");
            ArrayList A0O = 0QD.A0O(new C0zv('0', '9'), 0QD.A0M(new C0zv('a', 'z'), new C0zv('A', 'Z')));
            07E r02 = new 07E(1, 10);
            ArrayList A1E = C1A3.A1E(r02);
            07I it = r02.iterator();
            while (it.hasNext()) {
                it.A00();
                C07z c07z = C07y.A00;
                AnonymousClass001.A1J(A1E, C07y.A01.A06(0, A0O.size()));
            }
            ArrayList A1E2 = C1A3.A1E(A1E);
            Iterator it2 = A1E.iterator();
            while (it2.hasNext()) {
                A1E2.add(A0O.get(DKE.A0F(it2)));
            }
            String A0K = 0QD.A0K("", "", "", A1E2, (Function1) null, -1);
            String A0W = 0Pz.A0W(A0K, "mimarket");
            CRC32 crc32 = new CRC32();
            crc32.update(DKC.A1a(A0W, C03r.A05));
            String A0P = 0Pz.A0P(A0K, ':', crc32.getValue());
            e4j.A04 = A0P;
            A05.putString("requestId", A0P);
            A05.putString("referrer", ((Ezw) e4j).A08);
            0fH.A0g(A05.toString(), "DirectInstallAgentManagerXiaomi", "Request %s");
            boolean AOB = e4j.A03.AOB(A05);
            e4j.A05 = AOB;
            0fH.A0g(AOB ? "requested." : "failed to request.", "DirectInstallAgentManagerXiaomi", "Download+Install %s");
            if (e4j.A05) {
                FHA.A01(fha2, "IPC_SERVICE_INSTALL_START");
            } else {
                e4j.A04();
            }
        } catch (RemoteException | SecurityException unused) {
            fha2.A03(r0.getMessage());
        }
    }

    public boolean A06() {
        FHA fha = this.A05;
        FHA.A01(fha, "IPC_SERVICE_CANCEL_REQUESTED");
        FHA.A01(fha, "IPC_SERVICE_CANCEL_REQUEST_SKIPPED");
        return false;
    }

    public abstract boolean A07();
}
